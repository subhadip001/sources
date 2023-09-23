package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzday {
    private final zzfge zza;
    private final zzcfo zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzgpo zzg;
    private final String zzh;
    private final zzete zzi;

    public zzday(zzfge zzfgeVar, zzcfo zzcfoVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzgpo zzgpoVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzete zzeteVar) {
        this.zza = zzfgeVar;
        this.zzb = zzcfoVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzgpoVar;
        this.zzh = str2;
        this.zzi = zzeteVar;
    }

    public final /* synthetic */ zzbzu zza(zzfvj zzfvjVar) {
        return new zzbzu((Bundle) zzfvjVar.get(), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (String) ((zzfvj) this.zzg.zzb()).get(), this.zzh, null, null);
    }

    public final zzfvj zzb() {
        zzfge zzfgeVar = this.zza;
        return zzffo.zzc(this.zzi.zza(new Bundle()), zzffy.SIGNALS, zzfgeVar).zza();
    }

    public final zzfvj zzc() {
        final zzfvj zzb = zzb();
        return this.zza.zza(zzffy.REQUEST_PARCEL, zzb, (zzfvj) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdax
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzday.this.zza(zzb);
            }
        }).zza();
    }
}
