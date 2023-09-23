package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzvb {
    public final int zza;
    public final zzck zzb;
    public final int zzc;
    public final zzad zzd;

    public zzvb(int i2, zzck zzckVar, int i3) {
        this.zza = i2;
        this.zzb = zzckVar;
        this.zzc = i3;
        this.zzd = zzckVar.zzb(i3);
    }

    public abstract int zzb();

    public abstract boolean zzc(zzvb zzvbVar);
}
