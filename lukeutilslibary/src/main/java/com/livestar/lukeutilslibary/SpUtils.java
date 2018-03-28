package com.livestar.lukeutilslibary;

/*
 *  @项目名：  flowchat 
 *  @包名：    com.livestar.flowchat.util
 *  @文件名:   SpUtils
 *  @创建者:   huhai
 *  @创建时间:  2018/3/8 14:18
 *  @描述：
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SpUtils {
    private static SharedPreferences mPreferences;

    public static SharedPreferences getPreferences(Context context) {
        if (mPreferences == null) {
            // 获取sp
            mPreferences = context.getSharedPreferences("config",
                                                        Context.MODE_PRIVATE);
        }

        return mPreferences;
    }

    /**
     * 保存boolean值到sp中
     *
     * @param context
     * @param key
     * @param value
     */
    public static void putBoolean(Context context, String key, boolean value) {
        // 获取sp
        // SharedPreferences sp = context.getSharedPreferences("config",
        // Context.MODE_PRIVATE);
        SharedPreferences sp = getPreferences(context);
        // 获取编辑器
        Editor edit = sp.edit();
        edit.putBoolean(key, value);
        // 提交
        edit.commit();
    }

    /**
     * 获取sp里面的boolean值
     *
     * @param context
     * @param key
     * @param defValue
     * @return
     */
    public static boolean getBoolean(Context context, String key,
                                     boolean defValue) {

        // 获取sp
        // SharedPreferences sp = context.getSharedPreferences("config",
        // Context.MODE_PRIVATE);

        SharedPreferences sp = getPreferences(context);
        return sp.getBoolean(key, defValue);

    }


    /**
     * 保存String值到sp中
     *
     * @param context
     * @param key
     * @param value
     */
    public static void putString(Context context, String key, String value) {
        // 获取sp
        // SharedPreferences sp = context.getSharedPreferences("config",
        // Context.MODE_PRIVATE);
        SharedPreferences sp = getPreferences(context);
        // 获取编辑器
        Editor edit = sp.edit();
        edit.putString(key, value);
        // 提交
        edit.commit();
    }

    /**
     * 获取sp里面的String值
     *
     * @param context
     * @param key
     * @param defValue
     * @return
     */
    public static String getString(Context context, String key,
                                   String defValue) {

        // 获取sp
        // SharedPreferences sp = context.getSharedPreferences("config",
        // Context.MODE_PRIVATE);

        SharedPreferences sp = getPreferences(context);
        return sp.getString(key, defValue);

    }


    /**
     * 保存int值到sp中
     *
     * @param context
     * @param key
     * @param value
     */
    public static void putInt(Context context, String key, int value) {
        // 获取sp
        // SharedPreferences sp = context.getSharedPreferences("config",
        // Context.MODE_PRIVATE);
        SharedPreferences sp = getPreferences(context);
        // 获取编辑器
        Editor edit = sp.edit();
        edit.putInt(key, value);
        // 提交
        edit.commit();
    }

    /**
     * 获取sp里面的int值
     *
     * @param context
     * @param key
     * @param defValue
     * @return
     */
    public static int getInt(Context context, String key,
                             int defValue) {
        // 获取sp
        // SharedPreferences sp = context.getSharedPreferences("config",
        // Context.MODE_PRIVATE);

        SharedPreferences sp = getPreferences(context);
        return sp.getInt(key, defValue);

    }


    //测试SVN
    public void testSVN(){


        //
    }



}


