package io.realm.mvc.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import io.realm.mvc.example.model.User;
import io.realm.mvc.example.view.UserInfoTextView;


public class MainActivity extends AppCompatActivity {

    User user;
    UserInfoTextView userInfoTextView;
    EditText fullName;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInfoTextView = (UserInfoTextView) findViewById(R.id.userInfo);
        fullName = (EditText) findViewById(R.id.fullName);
        email = (EditText) findViewById(R.id.email);

        user  = new User();
        user.addObserver(userInfoTextView);

        fullName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                user.setFullName(String.valueOf(fullName.getText()));
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                user.setEmail(String.valueOf(email.getText()));

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}
