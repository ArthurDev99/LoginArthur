package com.arthur.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void generarMensaje(String mensaje){
        Toast.makeText(this, "Pressed: " + mensaje, Toast.LENGTH_SHORT).show();
    }

    public void imgButton(View v){
        generarMensaje("Icon User");
    }
    public void btnGoogle(View view){
        generarMensaje("Continue With Google");
        Intent goContent= new Intent(this, Contenido.class);
        startActivity(goContent);
    }
    public void btnSignUp(View view){
        generarMensaje("Sign Up");
    }


}
