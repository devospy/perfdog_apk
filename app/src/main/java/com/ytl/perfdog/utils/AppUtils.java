package com.ytl.perfdog.utils;

import android.graphics.drawable.Drawable;
import com.ytl.perfdog.bean.AppInfoBean;

import android.content.Context;
import android.content.Intent;
import android.content.pm.*;

import java.util.ArrayList;
import java.util.List;

public class AppUtils {
    public Context mContext;

    public AppUtils(Context context){
        this.mContext =  context;
    }

    /*
     * 获取系统所有安装的包名
     */
    public List<String> getAllInstalledAppInfo(){
        List<String> appPackageName = new ArrayList<>();
        Intent intent = new Intent(Intent.ACTION_MAIN, null);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);

        List<ResolveInfo> resolveInfoList = mContext.getPackageManager().queryIntentActivities(intent, 0);
        for (ResolveInfo resolveInfo: resolveInfoList){
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            AppInfoBean appInfoBean = new AppInfoBean();

        }
        return appPackageName;
    }

    public boolean isSystemPackage(ResolveInfo resolveInfo){
        return ((resolveInfo.activityInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) != 0);
    }

    public Drawable getAppIconByPkgName(String appPkgName){
        Drawable drawable = null;
        try{
            drawable = mContext.getPackageManager().getApplicationIcon(appPkgName);
        }catch (PackageManager.NameNotFoundException e){
            e.printStackTrace();
        }
        return drawable;
    }

    public String getAppName(String appPkgName){
        String appName = "";
        ApplicationInfo applicationInfo;
        PackageManager packageManager = mContext.getPackageManager();
        try{
            applicationInfo = packageManager.getApplicationInfo(appPkgName, 0);
            if (applicationInfo != null){
                appName = (String)packageManager.getApplicationLabel(applicationInfo);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return appName;
    }

    public String getAppVersionName(String appPkgName){
        String versionName = "";
        try{
            versionName = mContext.getPackageManager().getPackageInfo(appPkgName, 0).versionName;
        }catch (PackageManager.NameNotFoundException e){
            e.printStackTrace();
        }
        return versionName;
    }
}
