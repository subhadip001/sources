package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzans implements zzflv {
    public final /* synthetic */ zzfks zza;

    public zzans(zzfks zzfksVar) {
        this.zza = zzfksVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflv
    public final void zza(int i2, long j2) {
        this.zza.zzd(i2, System.currentTimeMillis() - j2);
    }

    @Override // com.google.android.gms.internal.ads.zzflv
    public final void zzb(int i2, long j2, String str) {
        this.zza.zze(i2, System.currentTimeMillis() - j2, str);
    }
}
