package com.ytl.perfdog.bean;

public class AppInfoBean {
    public String appName;
    public String appIcon;
    public String appPkg;
    public String appVersion;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(String appIcon) {
        this.appIcon = appIcon;
    }

    public String getAppPkg() {
        return appPkg;
    }

    public void setAppPkg(String appPkg) {
        this.appPkg = appPkg;
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
                ", appIcon='" + appIcon + '\'' +
                ", appPkg='" + appPkg + '\'' +
                ", appVersion='" + appVersion + '\'' +
                '}';
    }
}
