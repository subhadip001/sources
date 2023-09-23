package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import f.a.b.a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgjx extends zzgiq implements RandomAccess, zzgkx, zzgmf {
    private static final zzgjx zza;
    private double[] zzb;
    private int zzc;

    static {
        zzgjx zzgjxVar = new zzgjx(new double[0], 0);
        zza = zzgjxVar;
        zzgjxVar.zzb();
    }

    public zzgjx() {
        this(new double[10], 0);
    }

    private final String zzf(int i2) {
        return a.k("Index:", i2, ", Size:", this.zzc);
    }

    private final void zzg(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double doubleValue = ((Double) obj).doubleValue();
        zzbM();
        if (i2 >= 0 && i2 <= (i3 = this.zzc)) {
            double[] dArr = this.zzb;
            if (i3 < dArr.length) {
                System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
            } else {
                double[] dArr2 = new double[a.m(i3, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i2);
                System.arraycopy(this.zzb, i2, dArr2, i2 + 1, this.zzc - i2);
                this.zzb = dArr2;
            }
            this.zzb[i2] = doubleValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbM();
        zzgky.zze(collection);
        if (!(collection instanceof zzgjx)) {
            return super.addAll(collection);
        }
        zzgjx zzgjxVar = (zzgjx) collection;
        int i2 = zzgjxVar.zzc;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.zzb;
            if (i4 > dArr.length) {
                this.zzb = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(zzgjxVar.zzb, 0, this.zzb, this.zzc, zzgjxVar.zzc);
            this.zzc = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgjx)) {
            return super.equals(obj);
        }
        zzgjx zzgjxVar = (zzgjx) obj;
        if (this.zzc != zzgjxVar.zzc) {
            return false;
        }
        double[] dArr = zzgjxVar.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (Double.doubleToLongBits(this.zzb[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzg(i2);
        return Double.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            i2 = (i2 * 31) + zzgky.zzc(Double.doubleToLongBits(this.zzb[i3]));
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i2 = this.zzc;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.zzb[i3] == doubleValue) {
                    return i3;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        int i3;
        zzbM();
        zzg(i2);
        double[] dArr = this.zzb;
        double d2 = dArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzbM();
        if (i3 >= i2) {
            double[] dArr = this.zzb;
            System.arraycopy(dArr, i3, dArr, i2, this.zzc - i3);
            this.zzc -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zzbM();
        zzg(i2);
        double[] dArr = this.zzb;
        double d2 = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final /* bridge */ /* synthetic */ zzgkx zzd(int i2) {
        if (i2 >= this.zzc) {
            return new zzgjx(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d2) {
        zzbM();
        int i2 = this.zzc;
        double[] dArr = this.zzb;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[a.m(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        dArr3[i3] = d2;
    }

    private zzgjx(double[] dArr, int i2) {
        this.zzb = dArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Double) obj).doubleValue());
        return true;
    }
}
