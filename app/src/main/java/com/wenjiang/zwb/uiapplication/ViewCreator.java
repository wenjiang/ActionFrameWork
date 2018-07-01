package com.wenjiang.zwb.uiapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/7/1.
 */

public class ViewCreator {
    private IView mView;

    public static ViewCreator newInstance() {
        return new ViewCreator();
    }

    public ViewCreator init(Context context, int viewType) {
        mView = WBViewFactory.newInstance().create(context, viewType);
        return this;
    }

    public ViewCreator layoutParam(int paramType, int width, int height, int weight) {
        ViewGroup.LayoutParams layoutParams = WBLayoutParamFactory.newInstance().create(paramType, width, height, weight);
        mView.getView().setLayoutParams(layoutParams);
        return this;
    }

    public ViewCreator layoutParam(int paramType, int width, int height) {
        return layoutParam(paramType, width, height, 0);
    }

    public ViewCreator text(String text) {
        if (mView instanceof WBTextView) {
            TextView textView = ((WBTextView) mView).getView();
            textView.setText(text);
        }
        return this;
    }

    public IView create() {
        return mView;
    }

    public ViewCreator clickAction(final IAction action, final IView iView) {
        mView.getView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                action.onAction(iView.getView());
            }
        });
        return this;
    }

    public void execute(IAction action, View view) {
        action.onAction(view);
    }

    public static class ViewType {
        public static final int TEXT_VIEW = 0;
        public static final int BUTTON_VIEW = 1;
        public static final int LINEAR_LAYOUT = 2;
    }

    public static class ParamType {
        public static final int LINEAR = 0;
    }
}
