package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView myView;
    private CakeModel myModel;

    public CakeController(CakeView initCakeView) {
        myView = initCakeView;
        myModel = initCakeView.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.d("cake", "click!");
        myModel.isLit = false;
        myView.invalidate();
    }

    @Override
    public void onCheckedChanged (CompoundButton buttonView,
                                  boolean isChecked) {
        myModel.hasCandles = isChecked;
        myView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        myModel.numOfCandles = progress;
        myView.invalidate();
    }

    // MADE A DELIBERATE CHOICE TO LEAVE onStartTrackingTouch() and
    //      onStopTrackingTouch() empty from interface
    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {}

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {}

}
