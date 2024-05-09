package sp.application.one.broadcasts;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;

import sp.application.one.MainActivity;

public class ReceiverSender {
    private final Context context;


    private void logMessage(String msg){
        Log.wtf("SENDER", msg);
    }

    public ReceiverSender(Context context){
        this.context = context;
    }

    public boolean sendStart(){
        boolean res = false;
        if(this.context == null) {
            logMessage("NULL 1");
            return res;
        }


//        try{
////            final Intent intent = new Intent();
////            intent.setAction(Data.ACTION);
////           // intent.setPackage("com.cisco.anyconnect.vpn.android.avf");
////            intent.addFlags(Intent.FLAG_FROM_BACKGROUND);
////            intent.putExtra(Data.EXTRA_MESSAGE_TYPE, Data.MESSAGE_START);
////
////            intent.setComponent(
////                    new ComponentName("com.cisco.anyconnect.vpn.android.avf",
////                            "com.cisco.anyconnect.broadcasts.ReceiverGetter"));
////            context.sendBroadcast(intent, "sp.cisco.permission.GETTER_INTENT");
//
////            context.sendBroadcast(new Intent(Data.ACTION).setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES | Intent.FLAG_FROM_BACKGROUND), "sp.cisco.permission.GETTER_INTENT");
//            Toast.makeText(context, "SENDED!", Toast.LENGTH_SHORT).show();
//
//        }catch (Exception e){
//            Log.d("EEE", e.toString());
//        }
        return res;
    }
}
