package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfsw extends zzfrm {
    public static final zzfsw zza;
    private static final Object[] zzd;
    public final transient Object[] zzb;
    public final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzfsw(objArr, 0, objArr, 0, 0);
    }

    public zzfsw(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.zzb = objArr;
        this.zze = i2;
        this.zzc = objArr2;
        this.zzf = i3;
        this.zzg = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int zzb = zzfqz.zzb(obj);
        while (true) {
            int i2 = zzb & this.zzf;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzb = i2 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, com.google.android.gms.internal.ads.zzfrc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final int zza(Object[] objArr, int i2) {
        System.arraycopy(this.zzb, 0, objArr, i2, this.zzg);
        return i2 + this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm, com.google.android.gms.internal.ads.zzfrc
    public final zzftg zze() {
        return zzd().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final Object[] zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final zzfrh zzi() {
        return zzfrh.zzk(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfrm
    public final boolean zzo() {
        return true;
    }
}
