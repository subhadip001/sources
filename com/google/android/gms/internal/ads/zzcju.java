package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzcju implements Releasable {
    public final Context zza;
    public final String zzb;
    public final WeakReference zzc;

    public zzcju(zzchr zzchrVar) {
        Context context = zzchrVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzchrVar.zzp().zza);
        this.zzc = new WeakReference(zzchrVar);
    }

    public static /* bridge */ /* synthetic */ void zza(zzcju zzcjuVar, String str, Map map) {
        zzchr zzchrVar = (zzchr) zzcjuVar.zzc.get();
        if (zzchrVar != null) {
            zzchrVar.zzd("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract void zzb();

    @VisibleForTesting
    public final void zzc(String str, String str2, String str3, String str4) {
        zzcfb.zza.post(new zzcjt(this, str, str2, str3, str4));
    }

    public final void zzd(String str, String str2, int i2) {
        zzcfb.zza.post(new zzcjr(this, str, str2, i2));
    }

    @VisibleForTesting
    public final void zze(String str, String str2, long j2) {
        zzcfb.zza.post(new zzcjs(this, str, str2, j2));
    }

    @VisibleForTesting
    public final void zzf(String str, String str2, int i2, int i3, long j2, long j3, boolean z, int i4, int i5) {
        zzcfb.zza.post(new zzcjq(this, str, str2, i2, i3, j2, j3, z, i4, i5));
    }

    @VisibleForTesting
    public final void zzg(String str, String str2, long j2, long j3, boolean z, long j4, long j5, long j6, int i2, int i3) {
        zzcfb.zza.post(new zzcjp(this, str, str2, j2, j3, j4, j5, j6, z, i2, i3));
    }

    public void zzh(int i2) {
    }

    public void zzn(int i2) {
    }

    public void zzo(int i2) {
    }

    public void zzp(int i2) {
    }

    public abstract boolean zzq(String str);

    public boolean zzr(String str, String[] strArr) {
        return zzq(str);
    }

    public boolean zzs(String str, String[] strArr, zzcjm zzcjmVar) {
        return zzq(str);
    }
}
