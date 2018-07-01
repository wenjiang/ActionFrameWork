package com.wenjiang.zwb.uiapplication;

import android.view.View;

/**
 * Created by Administrator on 2018/7/1.
 */

public interface IAction<T extends View> {
    void onAction(T view);
}
