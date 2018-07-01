package com.wenjiang.zwb.uiapplication;

import android.content.Context;
import android.widget.Button;

/**
 * Created by Administrator on 2018/7/1.
 */

public class WBButton extends WBTextView {
    private Button mButton;

    public WBButton(Context context) {
        super(context);
        mButton = new Button(context);
    }

    @Override
    public Button getView() {
        return mButton;
    }
}
