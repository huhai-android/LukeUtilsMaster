package com.livestar.lukeutilslibary;

        /*
         *  @项目名：  TestGithub
         *  @包名：    com.livestar.huhaiutils
         *  @文件名:   ToastUtil
         *  @创建者:   Administrator
         *  @创建时间:  2018/3/28 11:18
         *  @描述：
         */

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;

public class ToastUtil {

    public static void showToast(Context context, String msg) {
        showToast(context, msg, Toast.LENGTH_SHORT);
    }

    public static void showToast(final Context context, String msg, int during) {
        try {
            if (isRunning(context)) {
                Toast toast = Toast.makeText(context, msg, during);
                toast.show();
            }
        }catch (Exception e) {

        }
    }

    public static void show(Context context, int id) {
        showToast(context, context.getString(id));
    }

    private static boolean isRunning(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                return !activity.isFinishing() && !activity.isDestroyed();
            }
        }
        return true;
    }

}
