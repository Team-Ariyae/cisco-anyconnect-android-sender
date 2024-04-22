package sp.application.one;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import sp.application.one.broadcasts.ReceiverSender;

public class MainActivity extends AppCompatActivity {
    Context mainActivity;

    @Override
    protected void onResume() {
        super.onResume();
        mainActivity = this.getApplicationContext();

//        new Thread(){
//            @Override
//            public void run() {
//                super.run();

                try {
//                    SystemClock.sleep(5000);
                    ReceiverSender receiverSender = new ReceiverSender(mainActivity);
                    boolean res = receiverSender.sendStart();

                    Log.d("RES:::", String.valueOf(res));
//                    SystemClock.sleep(2000);
//                    res = receiverSender.sendStop();

//                    Log.d("RES:2::", String.valueOf(res));

                } catch (Exception e) {
                    Log.d("EE", "EE");
                }
//            }
//        }.start();
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
    }
}