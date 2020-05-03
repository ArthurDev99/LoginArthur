package com.arthur.login;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Contenido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id){
            case R.id.action_listening:
                generarMensaje("Listening");
                return true;
            case R.id.action_settings:
                generarMensaje("Settings");
                return true;
            case R.id.action_upload:
                generarMensaje("Upload");
                return true;
            case R.id.action_marcador:
                generarMensaje("Read");
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void generarMensaje(String mensaje){
        Toast.makeText(this, "Pressed:  " + mensaje, Toast.LENGTH_SHORT).show();
    }


    public void onClickShowAlert(View view) {

        //Create the Alert
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(Contenido.this);


        // Set the dialog title and message.
        myAlertBuilder.setTitle("Mark as read");
        myAlertBuilder.setMessage("Do you want to mark this article as read?");

        // Add the dialog buttons.
        myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                // User clicked OK button.
                Toast.makeText(getApplicationContext(), "Pressed OK",
                        Toast.LENGTH_SHORT).show();
            }
        });

        myAlertBuilder.setNegativeButton("Cancel", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User cancelled the dialog.
                        Toast.makeText(getApplicationContext(), "Pressed Cancel",
                                Toast.LENGTH_SHORT).show();
                    }});

        // Create and show the AlertDialog.
        myAlertBuilder.show();


    }


}
