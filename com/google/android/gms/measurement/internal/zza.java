package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zza implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzd zzc;

    public zza(zzd zzdVar, String str, long j2) {
        this.zzc = zzdVar;
        this.zza = str;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.zza(this.zzc, this.zza, this.zzb);
    }
}
