package com.example.assessmentsck;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard); // show main homepage status and layout

        ImageButton button = (ImageButton) findViewById(R.id.alarmBtn); // get the  image button
        button.setOnClickListener(new View.OnClickListener() { //set Button press, listening incident
            public void onClick(View view) {
                NotifyUtility.sendNotify(
                        dashboard.this,
                        "Company App",
                        "Assistance (David Chan) has submitted the leave application to you ( 8days, Tue, 10 Jan to Tue, 17 Jan).");

                // call class NotifyUility and method sendnotify in dashboard interface
            }
        });
    }
}
