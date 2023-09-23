package com.google.android.gms.internal.ads;

import android.content.Context;
import f.a.b.a.a;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdxd implements zzden, com.google.android.gms.ads.internal.client.zza, zzdbs, zzdcm, zzdcn, zzddg, zzdbv, zzarb, zzfgf {
    private final List zza;
    private final zzdwr zzb;
    private long zzc;

    public zzdxd(zzdwr zzdwrVar, zzcnf zzcnfVar) {
        this.zzb = zzdwrVar;
        this.zza = Collections.singletonList(zzcnfVar);
    }

    private final void zze(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zze(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zze(zzdbv.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzb(zzfbs zzfbsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzbE(zzbzu zzbzuVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        zze(zzden.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbF(zzffy zzffyVar, String str) {
        zze(zzffx.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffyVar, String str, Throwable th) {
        zze(zzffx.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzbq(Context context) {
        zze(zzdcn.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzbs(Context context) {
        zze(zzdcn.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzbt(Context context) {
        zze(zzdcn.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzarb
    public final void zzbu(String str, String str2) {
        zze(zzarb.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbv() {
        zze(zzdbs.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzc(zzffy zzffyVar, String str) {
        zze(zzffx.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffyVar, String str) {
        zze(zzffx.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzj() {
        zze(zzdbs.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final void zzl() {
        zze(zzdcm.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzm() {
        zze(zzdbs.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final void zzn() {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        long j2 = this.zzc;
        StringBuilder A = a.A("Ad Request Latency : ");
        A.append(elapsedRealtime - j2);
        com.google.android.gms.ads.internal.util.zze.zza(A.toString());
        zze(zzddg.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzo() {
        zze(zzdbs.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzp(zzcak zzcakVar, String str, String str2) {
        zze(zzdbs.class, "onRewarded", zzcakVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzr() {
        zze(zzdbs.class, "onRewardedVideoStarted", new Object[0]);
    }
}
