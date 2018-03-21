package com.example.administrator.drawview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /*  LinearLayout root = (LinearLayout) findViewById(R.id.root);
        final MyView draw = new MyView(this);
        draw.setMinimumWidth(300);
        draw.setMinimumHeight(500);
        root.addView(draw);
*/
    }
}
