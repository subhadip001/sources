package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdwf {
    public final /* synthetic */ zzdwg zza;
    private final Map zzb = new ConcurrentHashMap();

    @VisibleForTesting
    public zzdwf(zzdwg zzdwgVar) {
        this.zza = zzdwgVar;
    }

    public static /* bridge */ /* synthetic */ zzdwf zza(zzdwf zzdwfVar) {
        Map map;
        Map map2 = zzdwfVar.zzb;
        map = zzdwfVar.zza.zzc;
        map2.putAll(map);
        return zzdwfVar;
    }

    public final zzdwf zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdwf zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdwf zzd(zzfbg zzfbgVar) {
        this.zzb.put("aai", zzfbgVar.zzx);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfW)).booleanValue()) {
            zzc("rid", zzfbgVar.zzap);
        }
        return this;
    }

    public final zzdwf zze(zzfbj zzfbjVar) {
        this.zzb.put("gqi", zzfbjVar.zzb);
        return this;
    }

    public final String zzf() {
        zzdwl zzdwlVar;
        zzdwlVar = this.zza.zza;
        return zzdwlVar.zzb(this.zzb);
    }

    public final void zzg() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwe
            @Override // java.lang.Runnable
            public final void run() {
                zzdwf.this.zzi();
            }
        });
    }

    public final void zzh() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwd
            @Override // java.lang.Runnable
            public final void run() {
                zzdwf.this.zzj();
            }
        });
    }

    public final /* synthetic */ void zzi() {
        zzdwl zzdwlVar;
        zzdwlVar = this.zza.zza;
        zzdwlVar.zze(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        zzdwl zzdwlVar;
        zzdwlVar = this.zza.zza;
        zzdwlVar.zzd(this.zzb);
    }
}
