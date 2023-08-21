package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        TextView txtName=findViewById(R.id.textView4);
        TextView txtPass=findViewById(R.id.textView5);
        Intent intent= getIntent();
        String userName=intent.getStringExtra("UserName");
        String password=intent.getStringExtra("Password");

        txtName.setText("Hello User Koang:"+" "+userName);
        txtPass.setText("Password:"+" "+password);

    }

    public void onClick(View view){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Log Out");
        alert.setMessage("Are you sure of logging out?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               Toast.makeText(getApplicationContext(),"Logging out successfully",Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(getApplicationContext(), MainActivity.class);
               startActivity(intent);
            }
        });

        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),"Cancelled Logging out",Toast.LENGTH_SHORT).show();
            }
        });

        alert.create().show();

    }
}