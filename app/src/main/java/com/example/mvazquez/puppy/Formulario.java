package com.example.mvazquez.puppy;

import android.os.AsyncTask;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import javax.mail.AuthenticationFailedException;
import javax.mail.MessagingException;

public class Formulario extends AppCompatActivity {

    TextInputEditText tietNombre;
    TextInputEditText tietEmail;
    TextInputEditText tietMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBarFormulario);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btnEnvia = (Button) findViewById(R.id.btnEnvia);
        tietNombre = (TextInputEditText) findViewById(R.id.tietNombre);
        tietEmail = (TextInputEditText) findViewById(R.id.tietEmail);
        tietMensaje = (TextInputEditText) findViewById(R.id.tietMensaje);
        btnEnvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*sendMessage();*/
                sendEmail();
                tietNombre.setText("");
                tietEmail.setText("");
                tietMensaje.setText("");
            }
        });
    }
    private void sendEmail() {
        //Getting content for email
        String email = tietEmail.getText().toString().trim();
        String subject = tietNombre.getText().toString().trim();
        String message = tietMensaje.getText().toString().trim();

        //Creating SendMail object
        SendMail sm = new SendMail(this, email, subject, message);

        //Executing sendmail to send email
        sm.execute();
    }

}
