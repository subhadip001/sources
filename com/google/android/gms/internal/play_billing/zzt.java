package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class zzt extends zzu {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzu zzc;

    public zzt(zzu zzuVar, int i2, int i3) {
        this.zzc = zzuVar;
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzm.zza(i2, this.zzb, "index");
        return this.zzc.get(i2 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.play_billing.zzu, java.util.List
    /* renamed from: zzf */
    public final zzu subList(int i2, int i3) {
        zzm.zzc(i2, i3, this.zzb);
        zzu zzuVar = this.zzc;
        int i4 = this.zza;
        return zzuVar.subList(i2 + i4, i3 + i4);
    }
}
