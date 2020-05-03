package com.arthur.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText user;
    private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.et_Email);
        pass=findViewById(R.id.et_Password);
    }

    public void goToSignUp(View view){
        Intent signup = new Intent(this, SignUp.class);
        startActivity(signup);
    }

    public void generarMensaje(String mensaje){
        Toast.makeText(this, "Pressed: " + mensaje, Toast.LENGTH_SHORT).show();
    }

    public void btnGoogle(View view){
        generarMensaje("Continue With Google");
        Intent goContent = new Intent(this,Contenido.class);
        startActivity(goContent);
    }
    public void btnFirefox(View view){
        generarMensaje("Continue With Firefox");
    }
    public void forgotPassword(View view){
        generarMensaje("Forgot Password");
    }
    public void login(View view){

        if(user.getText().toString().isEmpty()|| pass.getText().toString().isEmpty()){
            Toast.makeText(this,"Hay campos icompletos.",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Iniciaste como " + user.getText(),Toast.LENGTH_SHORT).show();
            Intent login = new Intent(this, Contenido.class);
            startActivity(login);
        }

    }

}
