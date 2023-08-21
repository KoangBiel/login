package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText user=findViewById(R.id.editTextNumberPassword);
        EditText pass=findViewById(R.id.editTextTextPassword);
        Button   btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                     if(user.getText().toString().trim().equals("7205") && pass.getText().toString().trim().equals("King")){
                         String UserName=user.getText().toString();
                         String Password=pass.getText().toString();
                         Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG).show();
                         Intent intent=new Intent(getApplicationContext(), MainPage.class);
                         intent.putExtra("UserName",UserName);
                         intent.putExtra("Password",Password);
                         startActivity(intent);
                     }
                     else{
                         Toast.makeText(getApplicationContext(),"Invalid Username or Password",Toast.LENGTH_LONG).show();
                     }
            }
        });









    }
}