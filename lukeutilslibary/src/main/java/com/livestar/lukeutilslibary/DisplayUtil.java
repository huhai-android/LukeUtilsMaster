package com.livestar.lukeutilslibary;

        /*
         *  @项目名：  LukeUtilsMaster
         *  @包名：    com.livestar.lukeutilslibary
         *  @文件名:   DisplayUtil
         *  @创建者:   Administrator
         *  @创建时间:  2018/3/28 17:11
         *  @描述：    android单位换算
         */

import android.content.Context;

public class DisplayUtil {

    public static float px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
    public static float dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }
    public static float px2sp(Context context, float pxValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }
    public static float sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

}
