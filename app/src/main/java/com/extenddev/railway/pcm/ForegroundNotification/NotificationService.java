package com.extenddev.railway.pcm.ForegroundNotification;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import com.extenddev.railway.pcm.R;
import com.extenddev.railway.pcm.UI.SyncActivity;

public class NotificationService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Intent  notificationIntent = new Intent(this, SyncActivity.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(this ,0
                ,notificationIntent,0);
        final int progressMax = 100;

       final NotificationCompat.Builder notification = new NotificationCompat.Builder(this,"channelId")
                .setSmallIcon(R.drawable.ic_vibration_black_24dp)
                .setContentTitle("Sync Data")
                .setContentText("Sync Data in progress")
                .setPriority(NotificationCompat.PRIORITY_LOW)
                .setOngoing(true)
                .setOnlyAlertOnce(true)
                .setContentIntent(pendingIntent)
                //.setProgress(progressMax , 0, false)
                .setProgress(progressMax, 0, true);
        startForeground(1, notification.build());
        //do heavy work on the background thread
        stopSelf();
        return START_NOT_STICKY ;
        //        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                SystemClock.sleep(2000);
//                for (int progress = 0; progress <= progressMax; progress += 20) {
//                    /*notification.setProgress(progressMax, progress, false);
//                    notificationManager.notify(2, notification.build());*/
//                    SystemClock.sleep(1000);
//                }
//                notification.setContentText("Download finished")
//                        .setProgress(0, 0, false)
//                        .setOngoing(false);
//                notificationManager.notify(2, notification.build());
//            }
//        }).start();
        //  }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
