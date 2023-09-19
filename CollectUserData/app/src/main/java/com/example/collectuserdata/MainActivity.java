package com.example.collectuserdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = (EditText) findViewById(R.id.fname);
        EditText surname = (EditText) findViewById(R.id.lname);
        EditText email = (EditText) findViewById(R.id.email);

        MaterialButton add = (MaterialButton) findViewById(R.id.createBtn);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstName = name.getText().toString();
                String lastName = surname.getText().toString();
                String Email = email.getText().toString();

                Toast.makeText(MainActivity.this, "Name: " + firstName + " Surname: " + lastName + " Email: " + Email, Toast.LENGTH_SHORT).show();
            }
        });

    }
}