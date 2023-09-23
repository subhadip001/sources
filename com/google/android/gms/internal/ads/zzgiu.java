package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import f.a.b.a.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgiu extends zzgiq implements RandomAccess, zzgkx, zzgmf {
    private static final zzgiu zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzgiu zzgiuVar = new zzgiu(new boolean[0], 0);
        zza = zzgiuVar;
        zzgiuVar.zzb();
    }

    public zzgiu() {
        this(new boolean[10], 0);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbM();
        if (i2 >= 0 && i2 <= (i3 = this.zzc)) {
            boolean[] zArr = this.zzb;
            if (i3 < zArr.length) {
                System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
            } else {
                boolean[] zArr2 = new boolean[a.m(i3, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i2);
                System.arraycopy(this.zzb, i2, zArr2, i2 + 1, this.zzc - i2);
                this.zzb = zArr2;
            }
            this.zzb[i2] = booleanValue;
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
        if (!(collection instanceof zzgiu)) {
            return super.addAll(collection);
        }
        zzgiu zzgiuVar = (zzgiu) collection;
        int i2 = zzgiuVar.zzc;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.zzb;
            if (i4 > zArr.length) {
                this.zzb = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(zzgiuVar.zzb, 0, this.zzb, this.zzc, zzgiuVar.zzc);
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
        if (!(obj instanceof zzgiu)) {
            return super.equals(obj);
        }
        zzgiu zzgiuVar = (zzgiu) obj;
        if (this.zzc != zzgiuVar.zzc) {
            return false;
        }
        boolean[] zArr = zzgiuVar.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (this.zzb[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzg(i2);
        return Boolean.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            i2 = (i2 * 31) + zzgky.zza(this.zzb[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i2 = this.zzc;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.zzb[i3] == booleanValue) {
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
        boolean[] zArr = this.zzb;
        boolean z = zArr[i2];
        if (i2 < this.zzc - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzbM();
        if (i3 >= i2) {
            boolean[] zArr = this.zzb;
            System.arraycopy(zArr, i3, zArr, i2, this.zzc - i3);
            this.zzc -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbM();
        zzg(i2);
        boolean[] zArr = this.zzb;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final /* bridge */ /* synthetic */ zzgkx zzd(int i2) {
        if (i2 >= this.zzc) {
            return new zzgiu(Arrays.copyOf(this.zzb, i2), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z) {
        zzbM();
        int i2 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[a.m(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        zArr3[i3] = z;
    }

    private zzgiu(boolean[] zArr, int i2) {
        this.zzb = zArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
