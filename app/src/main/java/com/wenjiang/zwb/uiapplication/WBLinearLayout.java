package com.wenjiang.zwb.uiapplication;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2018/7/1.
 */

public class WBLinearLayout implements IView<LinearLayout> {
    private LinearLayout mRoot;

    public WBLinearLayout(Context context) {
        mRoot = new LinearLayout(context);
    }

    @Override
    public LinearLayout getView() {
        return mRoot;
    }

    @Override
    public ViewCreator execute(IAction action, LinearLayout view) {
        return null;
    }
}
