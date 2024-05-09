package sp.application.one;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import sp.application.one.broadcasts.BaseActivityResult;
import sp.application.one.broadcasts.ReceiverSender;

public class MainActivity extends AppCompatActivity {
    Context mainActivity;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mainActivity = this.getApplicationContext();

        try {
//                    SystemClock.sleep(5000);
//            Toast.makeText(this, "salam", Toast.LENGTH_SHORT).show();
//            ReceiverSender receiverSender = new ReceiverSender(mainActivity);
//            boolean res = receiverSender.sendStart();
//
//            Log.d("RES:::", String.valueOf(res));
//                    SystemClock.sleep(2000);
//                    res = receiverSender.sendStop();

//                    Log.d("RES:2::", String.valueOf(res));

            try {
                Intent intent = new Intent();
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setClassName("com.cisco.anyconnect.vpn.android.avf", "com.cisco.anyconnect.ui.Launcher");

                Bundle bundle = new Bundle();

                bundle.putBoolean("isStart", true);
                bundle.putBoolean("isActionSwitch", true);

                intent.putExtras(bundle);

                startActivity(intent);

//                activityLauncher.launch(intent);
                Toast.makeText(this, "Opened", Toast.LENGTH_SHORT).show();
            }catch (Exception e){
                Log.d("E", e.toString());
            }

        } catch (Exception e) {
            Log.d("EE", "EE");
        }
    }

}