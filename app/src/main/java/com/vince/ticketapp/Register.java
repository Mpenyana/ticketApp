package com.vince.ticketapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Register extends AppCompatActivity {

    ImageView back_button;
    Button signupButton;
    private EditText usernameField;
    private EditText emailField;
    private EditText passField;
    private EditText confirmPassField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        usernameField = findViewById(R.id.username_field);
        passField = findViewById(R.id.password_field);
        emailField = findViewById(R.id.email_field);
        confirmPassField = findViewById(R.id.confirm_pass_field);


        back_button = findViewById(R.id.back_button);
        signupButton = findViewById(R.id.sign_up_button);

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = usernameField.getText().toString();
                String email = emailField.getText().toString();
                String pass = passField.getText().toString();
                String confPass = confirmPassField.getText().toString();
                if((name.length()>0) && email.contains("@") && pass.length()> 3 && (confPass.equals(pass))){
                    Intent intent = new Intent(Register.this, BrowseTickets.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
