package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class zzaa extends zzu {
    public static final zzu zza = new zzaa(new Object[0], 0);
    public final transient Object[] zzb;
    private final transient int zzc;

    public zzaa(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzm.zza(i2, this.zzc, "index");
        Object obj = this.zzb[i2];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzu, com.google.android.gms.internal.play_billing.zzr
    public final int zza(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public final Object[] zze() {
        return this.zzb;
    }
}
