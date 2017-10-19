package com.ire.huthunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {
    private EditText mUsernameET, mPasswordET;
    private TextView mForgotPasswordTV, mSignUpTV;
    private Button mSignInButton;
    String userName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        mUsernameET = findViewById(R.id.username_et);
        mPasswordET = findViewById(R.id.password_et);
        mForgotPasswordTV = findViewById(R.id.forgot_password_tv);
        mSignUpTV = findViewById(R.id.sign_up_tv);
        mSignInButton = findViewById(R.id.sign_in_button);


        userName = mUsernameET.getText().toString();
        password = mPasswordET.getText().toString();

        mForgotPasswordTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forgotPasswordIntent = new Intent(getApplicationContext(), ForgotPasswordActivity.class);
                startActivity(forgotPasswordIntent);
            }
        });


        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signInIntent = new Intent(getApplicationContext(), MainerActivity.class);
                startActivity(signInIntent);
            }
        });

        mSignUpTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signUpIntent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(signUpIntent);
            }
        });
    }

}
