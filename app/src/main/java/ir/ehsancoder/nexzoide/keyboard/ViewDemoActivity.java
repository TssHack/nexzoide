package ir.ehsancoder.nexzoide.keyboard;

import ir.ehsancoder.nexzoide.R;
import android.app.Activity;
import android.os.Bundle;

public class ViewDemoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_demo);

        ColorPickerView picker = (ColorPickerView) findViewById(R.id.colorPicker);
        picker.setColor(0xffff0000);
    }
}
