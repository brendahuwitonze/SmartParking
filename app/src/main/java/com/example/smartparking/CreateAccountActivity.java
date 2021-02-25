package com.example.smartparking;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
=======
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
>>>>>>> ac5cc33b7f1f99dfb77ebc06c8bed026c86905e0
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

<<<<<<< HEAD
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener{

=======
import butterknife.BindView;
import butterknife.ButterKnife;


public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener {
>>>>>>> ac5cc33b7f1f99dfb77ebc06c8bed026c86905e0
    @BindView(R.id.createUserButton)
    Button mCreateUserButton;
    @BindView(R.id.nameEditText)
    EditText mNameEditText;
    @BindView(R.id.emailEditText)
    EditText mEmailEditText;
    @BindView(R.id.passwordEditText)
    EditText mPasswordEditText;
<<<<<<< HEAD
    @BindView(R.id.editTextPhone) EditText mPhoneEditText;
    @BindView(R.id.loginTextView)
    TextView mLoginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        ButterKnife.bind(this);

=======
    @BindView(R.id.confirmPasswordEditText)
    EditText mConfirmPasswordEditText;
    @BindView(R.id.loginTextView)
    TextView mLoginTextView;
    public static final String TAG = CreateAccountActivity.class.getSimpleName();
    private ProgressDialog mAuthProgressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        ButterKnife.bind(this);
//        createAuthProgressDialog();
>>>>>>> ac5cc33b7f1f99dfb77ebc06c8bed026c86905e0
        mLoginTextView.setOnClickListener(this);
        mCreateUserButton.setOnClickListener(this);
    }

<<<<<<< HEAD
    @Override
    public void onClick(View view) {
        if (view == mLoginTextView) {
            Intent intent = new Intent(CreateAccountActivity.this, LoginActivity.class);
            intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK | intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        }
        if (view == mCreateUserButton) {
            createNewUser();
        }
    }
=======
//    private void createAuthProgressDialog() {
//        mAuthProgressDialog = new ProgressDialog(this);
//        mAuthProgressDialog.setTitle("Loading...");
//        mAuthProgressDialog.setMessage("Authenticating with Firebase...");
//        mAuthProgressDialog.setCancelable(false);
//    }
>>>>>>> ac5cc33b7f1f99dfb77ebc06c8bed026c86905e0

    private void createNewUser() {
        final String name = mNameEditText.getText().toString().trim();
        final String email = mEmailEditText.getText().toString().trim();
<<<<<<< HEAD
        final String password = mPasswordEditText.getText().toString().trim();
        final String phoneNumber = mPhoneEditText.getText().toString().trim();

        boolean validEmail = isValidEmail(email);
        boolean validPhoneNumber = isValidPhoneNumber(phoneNumber);
        boolean validName = isValidName(name);
        boolean validPassword = isValidPassword(password);

        if (!validEmail || !validName || !validPassword || !validPhoneNumber) return;

    }

    private boolean isValidPassword(String password) {
        if (password.length() < 6) {
            mPasswordEditText.setError("Please create a password containing at least 6 characters");
            return false;
        }
        return true;
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        if(phoneNumber.isEmpty() || phoneNumber.length() < 10){
            mPhoneEditText.setError("Enter a valid mobile");
            mPhoneEditText.requestFocus();
            return false;
        }
        return true;
=======
        String password = mPasswordEditText.getText().toString().trim();
        String confirmPassword = mConfirmPasswordEditText.getText().toString().trim();
        boolean validEmail = isValidEmail(email);
        boolean validName = isValidName(name);
        boolean validPassword = isValidPassword(password, confirmPassword);
        if (!validEmail || !validName || !validPassword) return;


    }

    @Override
    public void onClick(View view) {

        if (view == mCreateUserButton) {
            createNewUser();
        }

    }

    private boolean isValidEmail(String email) {
        boolean isGoodEmail =
                (email != null && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches());
        if (!isGoodEmail) {
            mEmailEditText.setError("Please enter a valid email address");
            return false;
        }
        return isGoodEmail;
>>>>>>> ac5cc33b7f1f99dfb77ebc06c8bed026c86905e0
    }

    private boolean isValidName(String name) {
        if (name.equals("")) {
            mNameEditText.setError("Please enter your name");
            return false;
        }
        return true;
    }

<<<<<<< HEAD
    private boolean isValidEmail(String email) {
        boolean isGoodEmail = (email != null && Patterns.EMAIL_ADDRESS.matcher(email).matches());
        if (!isGoodEmail) {
            mEmailEditText.setError("Please enter a valid email address");
            return false;
        }
        return isGoodEmail;
=======
    private boolean isValidPassword(String password, String confirmPassword) {
        if (password.length() < 6) {
            mPasswordEditText.setError("Please create a password containing at least 6 characters");
            return false;
        } else if (!password.equals(confirmPassword)) {
            mPasswordEditText.setError("Passwords do not match");
            return false;
        }
        return true;
>>>>>>> ac5cc33b7f1f99dfb77ebc06c8bed026c86905e0
    }
}