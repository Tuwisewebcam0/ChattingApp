package com.example.soulmatedatingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.chattingapp.R;
import com.example.chattingapp.databinding.ActivitySignUpBinding;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().hide();
        auth = FirebaseAuth.getInstance();


    }
}