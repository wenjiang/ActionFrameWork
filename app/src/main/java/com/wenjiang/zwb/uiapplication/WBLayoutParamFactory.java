package com.wenjiang.zwb.uiapplication;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2018/7/1.
 */

public class WBLayoutParamFactory {
    public static WBLayoutParamFactory newInstance(){
        return new WBLayoutParamFactory();
    }

    public ViewGroup.LayoutParams create(int type, int width, int height, int weight){
        if(type == ViewCreator.ParamType.LINEAR){
            return new LinearLayout.LayoutParams(width, height, weight);
        }else{
            return null;
        }
    }
}
