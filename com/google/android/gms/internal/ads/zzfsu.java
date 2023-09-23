package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfsu extends zzfrh {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzfsu(Object[] objArr, int i2, int i3) {
        this.zza = objArr;
        this.zzb = i2;
        this.zzc = i3;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzfos.zza(i2, this.zzc, "index");
        Object obj = this.zza[i2 + i2 + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final boolean zzf() {
        return true;
    }
}
