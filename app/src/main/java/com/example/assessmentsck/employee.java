package com.example.assessmentsck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class employee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee); // show main homepage status and layout

        ImageButton button = (ImageButton) findViewById(R.id.alarmBtn2); // get the  image button
        button.setOnClickListener(new View.OnClickListener() { //set Button press, listening incident
            public void onClick(View view) {
                NotifyUtility.sendNotify(
                        employee.this,
                        "Company App",
                        "You have submitted the leave application ( 8days, Tue, 10 Jan to Tue, 17 Jan).");

                // call class NotifyUility and method sendnotify in dashboard interface
            }
        });
    }
}