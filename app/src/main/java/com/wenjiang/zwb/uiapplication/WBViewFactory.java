package com.wenjiang.zwb.uiapplication;

import android.content.Context;

/**
 * Created by Administrator on 2018/7/1.
 */

public class WBViewFactory {

    public static WBViewFactory newInstance() {
        return new WBViewFactory();
    }

    public IView create(Context context, int viewType) {
        if (viewType == ViewCreator.ViewType.TEXT_VIEW) {
            return new WBTextView(context);
        } else if(viewType == ViewCreator.ViewType.BUTTON_VIEW){
            return new WBButton(context);
        } else if(viewType == ViewCreator.ViewType.LINEAR_LAYOUT){
            return new WBLinearLayout(context);
        }else{
            return null;
        }
    }
}
