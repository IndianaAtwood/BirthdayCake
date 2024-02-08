package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView myView = findViewById(R.id.cakeview);
        CakeController myController = new CakeController(myView);

        Button blowOut = findViewById(R.id.blowButton);
        blowOut.setOnClickListener(myController);

        Switch candlesSwitch = findViewById(R.id.candlesSwitch);
        candlesSwitch.setOnCheckedChangeListener(myController);
    }

    public void goodbye(View button) {
        System.out.println("Goodbye");
    }
}
