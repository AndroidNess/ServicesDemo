package tomerbu.itworks.edu.servicesdemo;

import android.app.IntentService;
import android.app.Notification;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;


public class MyDemoIntentService extends IntentService {


    private static final int HELLO_NOTIFICATION = 1;

    public MyDemoIntentService() {
        super("MyDemoIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);

        builder.setContentTitle("Hello, From Service")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentText("This is the content");

        Notification notification = builder.build();


        NotificationManagerCompat.from(this).notify(HELLO_NOTIFICATION, notification);
    }
}
