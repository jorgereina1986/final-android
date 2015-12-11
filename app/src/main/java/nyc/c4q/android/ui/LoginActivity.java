package nyc.c4q.android.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import nyc.c4q.android.R;

public class LoginActivity extends Activity {

    private EditText emailField;
    private EditText passwordField;
    private Button loginButton;
    private final AuthenticationManager manager;
    private String email = emailField.getText().toString();
    private String password = passwordField.getText().toString();


    public LoginActivity() {
        // TODO - fix this

        manager = null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO - load view hierarchy in R.layout.activity_login
        setContentView(R.layout.activity_login);

        // TODO - get references to views, and other setup
        emailField = (EditText) findViewById(R.id.email);
        passwordField = (EditText) findViewById(R.id.password);
        loginButton = (Button) findViewById(R.id.login);

        // TODO - call checkCredentials via OnClickListener
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkCredentials(email, password);
            }
        });
    }

    private void checkCredentials(String email, String password) {
        if (manager.validateLogin(email, password)) {
            // TODO - go to EmailListActivity
            Intent emailIntent = new Intent(this, EmailListActivity.class);
        } else {
            // TODO launch alert dialog on failed login
            // check strings.xml for dialog
            new AlertDialog.Builder(this).setMessage("Wrong Username/Password");

        }
    }
}
