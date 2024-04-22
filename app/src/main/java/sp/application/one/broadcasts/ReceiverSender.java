package sp.application.one.broadcasts;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

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

        try{
            final Intent intent = new Intent();
            intent.setAction(Data.ACTION);
            intent.setPackage("sp.application.two");
            intent.addFlags(Intent.FLAG_EXCLUDE_STOPPED_PACKAGES);
            Toast.makeText(context, "SENDED!", Toast.LENGTH_SHORT).show();

            intent.setComponent(
                    new ComponentName("sp.application.two",
                            "sp.application.two.broadcasts.ReceiverGetter"));
            context.sendBroadcast(intent, "sp.cisco.permission.GETTER_INTENT");

        }catch (Exception e){
            Log.d("EEE", e.toString());
        }
        return res;
    }
}
