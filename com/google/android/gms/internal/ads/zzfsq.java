package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfsq extends zzfrh {
    public static final zzfrh zza = new zzfsq(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    public zzfsq(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzfos.zza(i2, this.zzc, "index");
        Object obj = this.zzb[i2];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrh, com.google.android.gms.internal.ads.zzfrc
    public final int zza(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, i2, this.zzc);
        return i2 + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final Object[] zzg() {
        return this.zzb;
    }
}
