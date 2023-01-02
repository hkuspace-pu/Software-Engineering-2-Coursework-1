package com.example.assessmentsck;

import android.app.NotificationManager;
import android.content.Context;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class NotifyUtility {
    private static final String CHANNEL_ID = "ass_sck"; // define the channelID
    private static final String CHANNEL_NAME ="ass_sck_notify"; // define the channelName
    private static final int CHANNEL_IMPORTANCE = NotificationManager.IMPORTANCE_HIGH; // define the channel ranking

    public static  void sendNotify(Context ctx, String title, String msg) // create a method for sending notification
    {
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(ctx,CHANNEL_ID); // create a builder object

        builder.setContentTitle(title); // set notification tittle
        builder.setStyle(new NotificationCompat.BigTextStyle().bigText(msg)); //set new notification style to storage more msg
        builder.setSmallIcon(R.drawable.loco_alarm); // set notification icon
        builder.setAutoCancel(true);
        // Setting this flag will make it so the notification is automatically canceled when the user clicks it in the panel.

        NotificationManagerCompat notificationManagerCompat =
                NotificationManagerCompat.from(ctx);
        // define a local notification compat manager from dashboard

        notificationManagerCompat.notify(0,builder.build());
        // build a msg from builder to notify
    }
}
