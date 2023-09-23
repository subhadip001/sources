package com.video_converter.video_compressor.screens.homeScreen.dynamicPromoApps;

import f.h.f.y.b;

/* loaded from: classes2.dex */
public class DynamicPromoAppsModel {
    @b("icon")
    public String iconUrl;
    @b("package_name")
    public String packageName;
    @b("priority")
    public int priority;
    @b("title")
    public String title;

    public DynamicPromoAppsModel() {
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getTitle() {
        return this.title;
    }

    public void setPriority(int i2) {
        this.priority = i2;
    }

    public DynamicPromoAppsModel(String str, String str2, String str3, int i2) {
        this.title = str;
        this.packageName = str2;
        this.iconUrl = str3;
        this.priority = i2;
    }
}
