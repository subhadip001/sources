package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import f.a.b.a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgln extends zzgiq implements RandomAccess, zzgkw, zzgmf {
    private static final zzgln zza;
    private long[] zzb;
    private int zzc;

    static {
        zzgln zzglnVar = new zzgln(new long[0], 0);
        zza = zzglnVar;
        zzglnVar.zzb();
    }

    public zzgln() {
        this(new long[10], 0);
    }

    public static zzgln zzf() {
        return zza;
    }

    private final String zzh(int i2) {
        return a.k("Index:", i2, ", Size:", this.zzc);
    }

    private final void zzi(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzh(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long longValue = ((Long) obj).longValue();
        zzbM();
        if (i2 >= 0 && i2 <= (i3 = this.zzc)) {
            long[] jArr = this.zzb;
            if (i3 < jArr.length) {
                System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
            } else {
                long[] jArr2 = new long[a.m(i3, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i2);
                System.arraycopy(this.zzb, i2, jArr2, i2 + 1, this.zzc - i2);
                this.zzb = jArr2;
            }
            this.zzb[i2] = longValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzh(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbM();
        zzgky.zze(collection);
        if (!(collection instanceof zzgln)) {
            return super.addAll(collection);
        }
        zzgln zzglnVar = (zzgln) collection;
        int i2 = zzglnVar.zzc;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.zzb;
            if (i4 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(zzglnVar.zzb, 0, this.zzb, this.zzc, zzglnVar.zzc);
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
        if (!(obj instanceof zzgln)) {
            return super.equals(obj);
        }
        zzgln zzglnVar = (zzgln) obj;
        if (this.zzc != zzglnVar.zzc) {
            return false;
        }
        long[] jArr = zzglnVar.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (this.zzb[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzi(i2);
        return Long.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            i2 = (i2 * 31) + zzgky.zzc(this.zzb[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i2 = this.zzc;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.zzb[i3] == longValue) {
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
        zzi(i2);
        long[] jArr = this.zzb;
        long j2 = jArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzbM();
        if (i3 >= i2) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i3, jArr, i2, this.zzc - i3);
            this.zzc -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbM();
        zzi(i2);
        long[] jArr = this.zzb;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    /* renamed from: zza */
    public final zzgkw zzd(int i2) {
        if (i2 >= this.zzc) {
            return new zzgln(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i2) {
        zzi(i2);
        return this.zzb[i2];
    }

    public final void zzg(long j2) {
        zzbM();
        int i2 = this.zzc;
        long[] jArr = this.zzb;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[a.m(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        jArr3[i3] = j2;
    }

    private zzgln(long[] jArr, int i2) {
        this.zzb = jArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Long) obj).longValue());
        return true;
    }
}
