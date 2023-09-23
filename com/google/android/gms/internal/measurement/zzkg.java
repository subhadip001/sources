package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import f.a.b.a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzkg extends zzip implements RandomAccess, zzkk, zzlt {
    private static final zzkg zza;
    private int[] zzb;
    private int zzc;

    static {
        zzkg zzkgVar = new zzkg(new int[0], 0);
        zza = zzkgVar;
        zzkgVar.zzb();
    }

    public zzkg() {
        this(new int[10], 0);
    }

    public static zzkg zzf() {
        return zza;
    }

    private final String zzi(int i2) {
        return a.k("Index:", i2, ", Size:", this.zzc);
    }

    private final void zzj(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i2));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzip, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int intValue = ((Integer) obj).intValue();
        zzbT();
        if (i2 >= 0 && i2 <= (i3 = this.zzc)) {
            int[] iArr = this.zzb;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
            } else {
                int[] iArr2 = new int[a.m(i3, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                System.arraycopy(this.zzb, i2, iArr2, i2 + 1, this.zzc - i2);
                this.zzb = iArr2;
            }
            this.zzb[i2] = intValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzi(i2));
    }

    @Override // com.google.android.gms.internal.measurement.zzip, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbT();
        zzkn.zze(collection);
        if (!(collection instanceof zzkg)) {
            return super.addAll(collection);
        }
        zzkg zzkgVar = (zzkg) collection;
        int i2 = zzkgVar.zzc;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.zzb;
            if (i4 > iArr.length) {
                this.zzb = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(zzkgVar.zzb, 0, this.zzb, this.zzc, zzkgVar.zzc);
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

    @Override // com.google.android.gms.internal.measurement.zzip, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkg)) {
            return super.equals(obj);
        }
        zzkg zzkgVar = (zzkg) obj;
        if (this.zzc != zzkgVar.zzc) {
            return false;
        }
        int[] iArr = zzkgVar.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (this.zzb[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzj(i2);
        return Integer.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.zzip, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            i2 = (i2 * 31) + this.zzb[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i2 = this.zzc;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.zzb[i3] == intValue) {
                    return i3;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzip, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        int i3;
        zzbT();
        zzj(i2);
        int[] iArr = this.zzb;
        int i4 = iArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (i3 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzbT();
        if (i3 >= i2) {
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i3, iArr, i2, this.zzc - i3);
            this.zzc -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzip, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzbT();
        zzj(i2);
        int[] iArr = this.zzb;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final int zze(int i2) {
        zzj(i2);
        return this.zzb[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    /* renamed from: zzg */
    public final zzkk zzd(int i2) {
        if (i2 >= this.zzc) {
            return new zzkg(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(int i2) {
        zzbT();
        int i3 = this.zzc;
        int[] iArr = this.zzb;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[a.m(i3, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i4 = this.zzc;
        this.zzc = i4 + 1;
        iArr3[i4] = i2;
    }

    private zzkg(int[] iArr, int i2) {
        this.zzb = iArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzip, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
