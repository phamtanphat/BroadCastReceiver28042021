package com.example.broadcastreceiver28042021;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.widget.Toast;

public class MyBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager.getActiveNetwork() != null){
            if(connectivityManager.getActiveNetworkInfo().getState() == NetworkInfo.State.CONNECTED){
                //we are connected to a network
                Toast.makeText(context, "Có internet", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(context, "Mất internet", Toast.LENGTH_SHORT).show();
        }

    }
}
