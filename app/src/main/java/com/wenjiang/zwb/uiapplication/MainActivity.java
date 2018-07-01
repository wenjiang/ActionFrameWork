package com.wenjiang.zwb.uiapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout llContainer = findViewById(R.id.fl_container);
        RootView rootView = new RootView(this);
        rootView.execute(new IAction<LinearLayout>() {
            @Override
            public void onAction(LinearLayout view) {
                view.setOrientation(LinearLayout.VERTICAL);
            }
        }, rootView.getView());
        llContainer.addView(rootView.getView());
    }
}
