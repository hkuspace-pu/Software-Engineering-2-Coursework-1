package com.example.assessmentsck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // show main homepage status and layout

        EditText emailAddr = (EditText)findViewById(R.id.emailAddrTxt); // get EditTextID
        EditText pw = (EditText)findViewById(R.id.pwTxt); // get EditTextPW

        Button button = (Button) findViewById(R.id.loginBtn); // get Button
        button.setOnClickListener(new View.OnClickListener() { //set Button press, listening incident
            public void onClick(View view) {
                String getLoginAddr = emailAddr.getText().toString(); // get LoginAddress to string
                String getLoginPw = pw.getText().toString(); // get LoginPW to string

                String getLoginAddr1 = emailAddr.getText().toString(); // get LoginAddress to string
                String getLoginPw1 = pw.getText().toString(); // get LoginPW to string

                String loginAddr = "AnnaTsui@gmail.com"; // define the designated LoginAddress
                String loginPw = "123456"; // define the designated LoginPW

                String loginAddr1 = "Davidchan@gmail.com"; // define the designated LoginAddress
                String loginPw1 = "123456"; // define the designated LoginPW

                if(getLoginAddr.equals(loginAddr)
                && getLoginPw.equals(loginPw))
                    openDashboard(); // if LoginAddress & PW match the setting, then open to Dashboard(Admin homepage) (call the openDashboard method)
                else if (getLoginAddr1.equals(loginAddr1)
                        && getLoginPw1.equals(loginPw1))
                    openEmployee();


                else
                    Toast.makeText(MainActivity.this,"Validation error !",Toast.LENGTH_SHORT).show();
                    //Otherwise, show the validation error by creating text bar(Toast)
            }
        });

    }

    public void openDashboard()
    {
        Intent intent = new Intent(this, dashboard.class); // define new Intent, set current page to designated page
        startActivity(intent); // run new intent
    }

    public void openEmployee()
    {
        Intent intent = new Intent(this, employee.class); // define new Intent, set current page to designated page
        startActivity(intent); // run new intent
    }
}