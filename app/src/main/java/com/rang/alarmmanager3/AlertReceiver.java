package com.rang.alarmmanager3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

public class AlertReceiver extends BroadcastReceiver {

//    public void onReceive(Context context, Intent intent) {
//        Toast.makeText(context, "Time Up... Now Vibrating !!!",
//                Toast.LENGTH_LONG).show();
//        Vibrator vibrator = (Vibrator) context
//                .getSystemService(Context.VIBRATOR_SERVICE);
//        vibrator.vibrate(2000);
//    }
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationHelper notificationHelper = new NotificationHelper(context);
        NotificationCompat.Builder nb = notificationHelper.getChannelNotification();
        notificationHelper.getManager().notify(1, nb.build());
    }
}
