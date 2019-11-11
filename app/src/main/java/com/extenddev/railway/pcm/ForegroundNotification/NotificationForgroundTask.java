package com.extenddev.railway.pcm.ForegroundNotification;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class NotificationForgroundTask extends Application {
    public static  final String  notificationId  ="Downloading Data";

    @Override
    public void onCreate() {
        super.onCreate();

        CreateNotification();

    }
    private void CreateNotification(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notification = new NotificationChannel(
                    notificationId ,"Data is loading" , NotificationManager.IMPORTANCE_HIGH
            );
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(notification);


        }
    }


}
