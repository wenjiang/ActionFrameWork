package com.wenjiang.zwb.uiapplication;

import android.content.Context;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/7/1.
 */

public class WBTextView implements ITextView<TextView> {
    private TextView mTextView;

    public WBTextView(Context context) {
        mTextView = new TextView(context);
    }

    @Override
    public TextView getView() {
        return mTextView;
    }

    @Override
    public ViewCreator execute(IAction action, TextView view) {
         return null;
    }
}
