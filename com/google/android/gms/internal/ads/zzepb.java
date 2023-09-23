package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzepb implements zzeta {
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final float zzg;
    public final boolean zzh;

    public zzepb(int i2, boolean z, boolean z2, int i3, int i4, int i5, float f2, boolean z3) {
        this.zza = i2;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = f2;
        this.zzh = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.zza);
        bundle.putBoolean("ma", this.zzb);
        bundle.putBoolean("sp", this.zzc);
        bundle.putInt("muv", this.zzd);
        bundle.putInt("rm", this.zze);
        bundle.putInt("riv", this.zzf);
        bundle.putFloat("android_app_volume", this.zzg);
        bundle.putBoolean("android_app_muted", this.zzh);
    }
}
