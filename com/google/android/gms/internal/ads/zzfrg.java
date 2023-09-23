package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfrg extends zzfrh {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzfrh zzc;

    public zzfrg(zzfrh zzfrhVar, int i2, int i3) {
        this.zzc = zzfrhVar;
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzfos.zza(i2, this.zzb, "index");
        return this.zzc.get(i2 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, java.util.List
    /* renamed from: zzh */
    public final zzfrh subList(int i2, int i3) {
        zzfos.zzg(i2, i3, this.zzb);
        zzfrh zzfrhVar = this.zzc;
        int i4 = this.zza;
        return zzfrhVar.subList(i2 + i4, i3 + i4);
    }
}
