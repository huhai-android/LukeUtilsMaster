package com.livestar.lukeutilslibary;

        /*
         *  @项目名：  LukeUtilsMaster
         *  @包名：    com.livestar.lukeutilslibary
         *  @文件名:   WindowUtils
         *  @创建者:   Administrator
         *  @创建时间:  2018/3/28 17:06
         *  @描述：
         */

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

public class WindowUtils {

    public static int screenWidth(Context context) {

        WindowManager manager = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        Display       display = manager.getDefaultDisplay();
        int           width   =display.getWidth();
        int           height  =display.getHeight();
        return width;
    }

    public static int screenHeight(Context context) {

        WindowManager manager = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);
        Display       display = manager.getDefaultDisplay();
        int           width   =display.getWidth();
        int           height  =display.getHeight();
        return height;
    }

}
