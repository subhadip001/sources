package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzclx extends FrameLayout implements zzcli {
    private final zzcli zza;
    private final zzchg zzb;
    private final AtomicBoolean zzc;

    public zzclx(zzcli zzcliVar) {
        super(zzcliVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcliVar;
        this.zzb = new zzchg(zzcliVar.zzG(), this, this);
        addView((View) zzcliVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void destroy() {
        final IObjectWrapper zzS = zzS();
        if (zzS != null) {
            zzfnu zzfnuVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzfnuVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclv
                @Override // java.lang.Runnable
                public final void run() {
                    IObjectWrapper iObjectWrapper = IObjectWrapper.this;
                    com.google.android.gms.ads.internal.zzt.zzh();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzea)).booleanValue() && zzfij.zzb()) {
                        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                        if (unwrap instanceof zzfil) {
                            ((zzfil) unwrap).zzc();
                        }
                    }
                }
            });
            final zzcli zzcliVar = this.zza;
            zzcliVar.getClass();
            zzfnuVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclw
                @Override // java.lang.Runnable
                public final void run() {
                    zzcli.this.destroy();
                }
            }, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeb)).intValue());
            return;
        }
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcli zzcliVar = this.zza;
        if (zzcliVar != null) {
            zzcliVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void onPause() {
        this.zzb.zze();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcli
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcli
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzA(int i2) {
        this.zza.zzA(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzB(boolean z) {
        this.zza.zzB(false);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzC(int i2) {
        this.zza.zzC(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzD(int i2) {
        this.zzb.zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final void zzE(zzcme zzcmeVar) {
        this.zza.zzE(zzcmeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzckz
    public final zzfbg zzF() {
        return this.zza.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final Context zzG() {
        return this.zza.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcms
    public final View zzH() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final WebView zzI() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final WebViewClient zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmq
    public final zzaoc zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final zzbbz zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final zzbkn zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final com.google.android.gms.ads.internal.overlay.zzl zzN() {
        return this.zza.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final com.google.android.gms.ads.internal.overlay.zzl zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final zzcmv zzP() {
        return ((zzcmb) this.zza).zzaL();
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmp
    public final zzcmx zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmf
    public final zzfbj zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final IObjectWrapper zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final zzfvj zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final String zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzV(zzfbg zzfbgVar, zzfbj zzfbjVar) {
        this.zza.zzV(zzfbgVar, zzfbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzW() {
        this.zzb.zzd();
        this.zza.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzX() {
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzY(int i2) {
        this.zza.zzY(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzZ() {
        this.zza.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zza(String str) {
        ((zzcmb) this.zza).zzaQ(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaA(boolean z, int i2) {
        if (this.zzc.compareAndSet(false, true)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaF)).booleanValue()) {
                return false;
            }
            if (this.zza.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
            }
            this.zza.zzaA(z, i2);
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaB() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaD() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaE() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaF(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        this.zza.zzaF(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaG(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzeen zzeenVar, zzdwg zzdwgVar, zzfgo zzfgoVar, String str, String str2, int i2) {
        this.zza.zzaG(zzbrVar, zzeenVar, zzdwgVar, zzfgoVar, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaH(boolean z, int i2, boolean z2) {
        this.zza.zzaH(z, i2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaI(boolean z, int i2, String str, boolean z2) {
        this.zza.zzaI(z, i2, str, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcmn
    public final void zzaJ(boolean z, int i2, String str, String str2, boolean z2) {
        this.zza.zzaJ(z, i2, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzaa() {
        zzcli zzcliVar = this.zza;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zze()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zza()));
        zzcmb zzcmbVar = (zzcmb) zzcliVar;
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzab.zzb(zzcmbVar.getContext())));
        zzcmbVar.zzd("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzab(boolean z) {
        this.zza.zzab(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzac() {
        this.zza.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzad(String str, String str2, String str3) {
        this.zza.zzad(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzae() {
        this.zza.zzae();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzaf(String str, zzbol zzbolVar) {
        this.zza.zzaf(str, zzbolVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzag() {
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzp();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzv());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzah(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzah(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzai(zzcmx zzcmxVar) {
        this.zza.zzai(zzcmxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzaj(zzbbz zzbbzVar) {
        this.zza.zzaj(zzbbzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzak(boolean z) {
        this.zza.zzak(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzal() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzam(Context context) {
        this.zza.zzam(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzan(boolean z) {
        this.zza.zzan(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzao(zzbkl zzbklVar) {
        this.zza.zzao(zzbklVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzap(boolean z) {
        this.zza.zzap(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzaq(zzbkn zzbknVar) {
        this.zza.zzaq(zzbknVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzar(IObjectWrapper iObjectWrapper) {
        this.zza.zzar(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzas(int i2) {
        this.zza.zzas(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzat(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzat(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzau(boolean z) {
        this.zza.zzau(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzav(boolean z) {
        this.zza.zzav(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzaw(String str, zzbol zzbolVar) {
        this.zza.zzaw(str, zzbolVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final void zzax(String str, Predicate predicate) {
        this.zza.zzax(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final boolean zzay() {
        return this.zza.zzay();
    }

    @Override // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbn() {
        this.zza.zzbn();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbo() {
        this.zza.zzbo();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final zzchg zzbp() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzc(zzbal zzbalVar) {
        this.zza.zzc(zzbalVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final int zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final int zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final int zzi() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcT)).booleanValue()) {
            return this.zza.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final int zzj() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcT)).booleanValue()) {
            return this.zza.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmj, com.google.android.gms.internal.ads.zzchr
    public final Activity zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcmb) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final com.google.android.gms.ads.internal.zza zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final zzbik zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final zzbil zzo() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzcmr, com.google.android.gms.internal.ads.zzchr
    public final zzcfo zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzdjf
    public final void zzq() {
        zzcli zzcliVar = this.zza;
        if (zzcliVar != null) {
            zzcliVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final zzcju zzr(String str) {
        return this.zza.zzr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final zzcme zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final String zzt() {
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final String zzu() {
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcli, com.google.android.gms.internal.ads.zzchr
    public final void zzv(String str, zzcju zzcjuVar) {
        this.zza.zzv(str, zzcjuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzx(boolean z, long j2) {
        this.zza.zzx(z, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzy() {
        this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzchr
    public final void zzz(int i2) {
        this.zza.zzz(i2);
    }
}
