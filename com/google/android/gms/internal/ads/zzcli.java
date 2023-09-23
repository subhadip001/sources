package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public interface zzcli extends com.google.android.gms.ads.internal.client.zza, zzdjf, zzckz, zzbrc, zzcmf, zzcmj, zzbrp, zzbam, zzcmn, com.google.android.gms.ads.internal.zzl, zzcmq, zzcmr, zzchr, zzcms {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcmj, com.google.android.gms.internal.ads.zzchr
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i2, int i3);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzchr
    void setBackgroundColor(int i2);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzchr
    void zzE(zzcme zzcmeVar);

    @Override // com.google.android.gms.internal.ads.zzckz
    zzfbg zzF();

    Context zzG();

    @Override // com.google.android.gms.internal.ads.zzcms
    View zzH();

    WebView zzI();

    WebViewClient zzJ();

    @Override // com.google.android.gms.internal.ads.zzcmq
    zzaoc zzK();

    zzbbz zzL();

    zzbkn zzM();

    com.google.android.gms.ads.internal.overlay.zzl zzN();

    com.google.android.gms.ads.internal.overlay.zzl zzO();

    zzcmv zzP();

    @Override // com.google.android.gms.internal.ads.zzcmp
    zzcmx zzQ();

    @Override // com.google.android.gms.internal.ads.zzcmf
    zzfbj zzR();

    IObjectWrapper zzS();

    zzfvj zzT();

    String zzU();

    void zzV(zzfbg zzfbgVar, zzfbj zzfbjVar);

    void zzW();

    void zzX();

    void zzY(int i2);

    void zzZ();

    boolean zzaA(boolean z, int i2);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD();

    boolean zzaE();

    void zzaa();

    void zzab(boolean z);

    void zzac();

    void zzad(String str, String str2, String str3);

    void zzae();

    void zzaf(String str, zzbol zzbolVar);

    void zzag();

    void zzah(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzai(zzcmx zzcmxVar);

    void zzaj(zzbbz zzbbzVar);

    void zzak(boolean z);

    void zzal();

    void zzam(Context context);

    void zzan(boolean z);

    void zzao(zzbkl zzbklVar);

    void zzap(boolean z);

    void zzaq(zzbkn zzbknVar);

    void zzar(IObjectWrapper iObjectWrapper);

    void zzas(int i2);

    void zzat(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzau(boolean z);

    void zzav(boolean z);

    void zzaw(String str, zzbol zzbolVar);

    void zzax(String str, Predicate predicate);

    boolean zzay();

    boolean zzaz();

    @Override // com.google.android.gms.internal.ads.zzcmj, com.google.android.gms.internal.ads.zzchr
    Activity zzk();

    @Override // com.google.android.gms.internal.ads.zzchr
    com.google.android.gms.ads.internal.zza zzm();

    @Override // com.google.android.gms.internal.ads.zzchr
    zzbil zzo();

    @Override // com.google.android.gms.internal.ads.zzcmr, com.google.android.gms.internal.ads.zzchr
    zzcfo zzp();

    @Override // com.google.android.gms.internal.ads.zzchr
    zzcme zzs();

    @Override // com.google.android.gms.internal.ads.zzchr
    void zzv(String str, zzcju zzcjuVar);
}
