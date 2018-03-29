package com.livestar.lukeutilsmaster;

        /*
         *  @项目名：  LukeUtilsMaster
         *  @包名：    com.livestar.lukeutilsmaster
         *  @文件名:   CircleImageView
         *  @创建者:   Administrator
         *  @创建时间:  2018/3/29 14:08
         *  @描述：    TODO
         */

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;


public class CircleImageView extends android.support.v7.widget.AppCompatImageView {
    private static final String TAG = "CircleImageView";

    public CircleImageView(Context context) {
        super(context);
    }

    public CircleImageView(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);

        TypedArray typedArray =context.obtainStyledAttributes(attrs, R.styleable.CircleImageView);
        Log.d(TAG,typedArray.getColor(R.styleable.CircleImageView_roundColor,-1)+"");
        Log.d(TAG,typedArray.getDimension(R.styleable.CircleImageView_roundWidth,-1)+"");
        Log.d(TAG,typedArray.getString(R.styleable.CircleImageView_type)+"");

        for (int i = 0; i < attrs.getAttributeCount(); i++) {
            String attrName = attrs.getAttributeName(i);
            String attrVal = attrs.getAttributeValue(i);
            Log.e(TAG, "attrName = " + attrName + " , attrVal = " + attrVal);
        }

    }

}
