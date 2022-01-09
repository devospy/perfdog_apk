package com.ytl.perfdog.bean;

import android.graphics.drawable.Drawable;

public class AppInfoBean {
    public String appPkgName;
    public String appName;
    public Drawable appIcon;
    public String appVersion;
    public boolean isSystemApp;

    public AppInfoBean(String appPkgName, String appName, Drawable appIcon, String appVersion, boolean isSystemApp) {
        this.appPkgName = appPkgName;
        this.appName = appName;
        this.appIcon = appIcon;
        this.appVersion = appVersion;
        this.isSystemApp = isSystemApp;
    }

    public void setAppIcon(Drawable appIcon) {
        this.appIcon = appIcon;
    }

    public Drawable getAppIcon() {
        return appIcon;
    }

    public boolean getIsSystemApp() {
        return isSystemApp;
    }

    public void setIsSystemApp(boolean isSystemApp) {
        this.isSystemApp = isSystemApp;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppPkgName() {
        return appPkgName;
    }

    public void setAppPkgName(String appPkgName) {
        this.appPkgName = appPkgName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Override
    public String toString() {
        return "AppInfoBean{" +
                "appName='" + appName + '\'' +
                ", appIcon=" + appIcon +
                ", appPkgName='" + appPkgName + '\'' +
                ", appVersion='" + appVersion + '\'' +
                ", isSystemApp=" + isSystemApp +
                '}';
    }
}
