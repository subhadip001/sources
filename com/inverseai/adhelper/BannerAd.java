package com.inverseai.adhelper;

import android.content.Context;
import android.view.ViewGroup;
import f.j.a.m.a;

/* compiled from: BannerAd.kt */
/* loaded from: classes2.dex */
public interface BannerAd {

    /* compiled from: BannerAd.kt */
    /* loaded from: classes2.dex */
    public enum AdSize {
        SMART,
        LARGE,
        MEDIUM,
        ADAPTIVE
    }

    void b(a aVar);

    void c(Context context, ViewGroup viewGroup, String str);

    int d(Context context);

    void onDestroy();

    void onPause();

    void onResume();
}
