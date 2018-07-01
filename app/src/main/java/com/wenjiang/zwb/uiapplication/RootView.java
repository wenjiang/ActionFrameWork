package com.wenjiang.zwb.uiapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/7/1.
 */

public class RootView implements IView<ViewGroup> {
    private IView<LinearLayout> mRoot;
    private ViewCreator mViewCreator;

    public RootView(Context context) {
        mViewCreator = ViewCreator.newInstance();
        mRoot = mViewCreator.init(context, ViewCreator.ViewType.LINEAR_LAYOUT)
                .layoutParam(ViewCreator.ParamType.LINEAR, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                .create();
        IView<TextView> textView = mViewCreator.init(context, ViewCreator.ViewType.TEXT_VIEW)
                .layoutParam(ViewCreator.ParamType.LINEAR, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, 1)
                .text("Hello, World").create();
        IView<Button> button = mViewCreator.init(context, ViewCreator.ViewType.BUTTON_VIEW)
                .layoutParam(ViewCreator.ParamType.LINEAR, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, 1)
                .text("点击").clickAction(mChangeTxtAction, textView).create();
        mRoot.getView().addView(textView.getView());
        mRoot.getView().addView(button.getView());
    }

    @Override
    public ViewGroup getView() {
        return mRoot.getView();
    }

    @Override
    public ViewCreator execute(IAction action, ViewGroup view) {
        mViewCreator.execute(action, view);
        return mViewCreator;
    }

    IAction mChangeTxtAction = new IAction() {
        @Override
        public void onAction(View view) {
            if (view instanceof TextView) {
                ((TextView) view).setText("Hello");
            }
        }
    };
}
