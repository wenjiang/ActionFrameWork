package com.wenjiang.zwb.uiapplication;

import android.view.View;

/**
 * Created by Administrator on 2018/7/1.
 */

public interface IView<T extends View> {
    T getView();

    ViewCreator execute(IAction action, T view);
}
