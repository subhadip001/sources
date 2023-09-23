package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbwt extends zzbwu implements zzbol {
    public DisplayMetrics zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    private final zzcli zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbhi zzk;
    private float zzl;
    private int zzm;

    public zzbwt(zzcli zzcliVar, Context context, zzbhi zzbhiVar) {
        super(zzcliVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcliVar;
        this.zzi = context;
        this.zzk = zzbhiVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject;
        zzcli zzcliVar = (zzcli) obj;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzcfb.zzt(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzcfb.zzt(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzk = this.zzh.zzk();
        if (zzk != null && zzk.getWindow() != null) {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] zzM = com.google.android.gms.ads.internal.util.zzs.zzM(zzk);
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            this.zzd = zzcfb.zzt(this.zza, zzM[0]);
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            this.zze = zzcfb.zzt(this.zza, zzM[1]);
        } else {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        }
        if (this.zzh.zzQ().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbws zzbwsVar = new zzbws();
        zzbhi zzbhiVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbwsVar.zze(zzbhiVar.zza(intent));
        zzbhi zzbhiVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbwsVar.zzc(zzbhiVar2.zza(intent2));
        zzbwsVar.zza(this.zzk.zzb());
        zzbwsVar.zzd(this.zzk.zzc());
        zzbwsVar.zzb(true);
        z = zzbwsVar.zza;
        z2 = zzbwsVar.zzb;
        z3 = zzbwsVar.zzc;
        z4 = zzbwsVar.zzd;
        z5 = zzbwsVar.zze;
        zzcli zzcliVar2 = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e2) {
            zzcfi.zzh("Error occurred while obtaining the MRAID capabilities.", e2);
            jSONObject = null;
        }
        zzcliVar2.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, iArr[1]));
        if (zzcfi.zzm(2)) {
            zzcfi.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzp().zza);
    }

    public final void zzb(int i2, int i3) {
        int i4;
        int i5 = 0;
        if (this.zzi instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzp();
            i4 = com.google.android.gms.ads.internal.util.zzs.zzN((Activity) this.zzi)[0];
        } else {
            i4 = 0;
        }
        if (this.zzh.zzQ() == null || !this.zzh.zzQ().zzi()) {
            int width = this.zzh.getWidth();
            int height = this.zzh.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzP)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzQ() != null ? this.zzh.zzQ().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzQ() != null) {
                        i5 = this.zzh.zzQ().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, i5);
                }
            }
            i5 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, i5);
        }
        zzf(i2, i3 - i4, this.zzf, this.zzg);
        this.zzh.zzP().zzA(i2, i3);
    }
}
