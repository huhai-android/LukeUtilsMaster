package com.livestar.lukeutilslibary;

        /*
         *  @项目名：  LukeUtilsMaster
         *  @包名：    com.livestar.lukeutilslibary
         *  @文件名:   PackageUtils
         *  @创建者:   Administrator
         *  @创建时间:  2018/3/28 17:08
         *  @描述：    获取版本号及获取版本名称
         */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PackageUtils {

    private static String versionName;
    private static int versionCode;

    public  static  String getAppVersonName(Context context)
            throws PackageManager.NameNotFoundException
    {
        PackageManager pm = context.getPackageManager();
        PackageInfo    packageInfo = null;
        try {
            packageInfo = pm.getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {


        }

        versionName = packageInfo.versionName;

        return  versionName;
    }


    public  static  int getAppVersonCode(Context context){
        PackageManager pm          = context.getPackageManager();
        PackageInfo    packageInfo = null;
        try {
            packageInfo = pm.getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {


        }

        versionCode = packageInfo.versionCode;


        return versionCode;

    }


    /**
     * 获取包名
     * @param context
     * @return
     */
    public static String getPackageName(Context context){
        return context.getPackageName();
    }


    /**
     * 获取所有安装的应用程序,不包含系统应用
     * @param context
     * @return
     */
    public static List<PackageInfo> getInstalledPackages(Context context){
        PackageManager packageManager = context.getPackageManager();
        List<PackageInfo> packageInfos = packageManager.getInstalledPackages(0);
        List<PackageInfo> packageInfoList  = new ArrayList<PackageInfo>();
        for(int i=0; i < packageInfos.size();i++){
            if ((packageInfos.get(i).applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
                packageInfoList.add(packageInfos.get(i));
            }
        }
        return packageInfoList;
    }

    /**
     * 获取应用程序的icon图标
     * @param context
     * @return
     * 当包名错误时，返回null
     */
    public static Drawable getApplicationIcon(Context context){
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(getPackageName(context), 0);
            return packageInfo.applicationInfo.loadIcon(packageManager);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 启动安装应用程序
     * @param activity
     * @param path  应用程序路径
     */
    public static void installApk(Activity activity, String path){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.fromFile(new File(path)),
                              "application/vnd.android.package-archive");
        activity.startActivity(intent);
    }
}
