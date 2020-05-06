package com.example.labsheet5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText UserName;
    private EditText Password;
    private Button SelectAll;
    private Button Add;
    private Button SignIn;
    private Button Delete;
    private Button Update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserName = (EditText) findViewById(R.id.name);
        Password = (EditText) findViewById(R.id.password);
        SelectAll = (Button) findViewById(R.id.select);
        Add =(Button) findViewById(R.id.add);
        SignIn =(Button) findViewById(R.id.signin);
        Delete = (Button) findViewById(R.id.delete);
        Update =(Button) findViewById(R.id.update);

        Add.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "User Added ",
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        } );



        SelectAll.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        } );


        SignIn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        } );


        Delete.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "User Deleted ",
                        Toast.LENGTH_SHORT);

                toast.show();

            }
        } );


        Update.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "User Updated ",
                        Toast.LENGTH_SHORT);

                toast.show();

            }
        } );

    }
}
