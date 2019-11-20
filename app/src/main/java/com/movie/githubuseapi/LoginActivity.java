package com.movie.githubuseapi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private Button logIn;
    private EditText inputUserName;

    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logIn = (Button) findViewById(R.id.btn_login);
        inputUserName = (EditText) findViewById(R.id.input_username);

    }

    public void getUser(View view){

        i = new Intent(LoginActivity.this, UserActivity.class);
        i.putExtra("STRING_I_NEED", inputUserName.getText().toString());
        startActivity(i);
    }


}
