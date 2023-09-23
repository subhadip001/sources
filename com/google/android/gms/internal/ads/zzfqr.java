package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfqr extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    public transient int[] zza;
    public transient Object[] zzb;
    public transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzfqr() {
        zzo(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzA() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    public static /* synthetic */ int zzb(zzfqr zzfqrVar) {
        int i2 = zzfqrVar.zzg;
        zzfqrVar.zzg = i2 - 1;
        return i2;
    }

    public static /* synthetic */ Object zzg(zzfqr zzfqrVar, int i2) {
        return zzfqrVar.zzA()[i2];
    }

    public static /* synthetic */ Object zzj(zzfqr zzfqrVar, int i2) {
        return zzfqrVar.zzB()[i2];
    }

    public static /* synthetic */ Object zzk(zzfqr zzfqrVar) {
        Object obj = zzfqrVar.zze;
        obj.getClass();
        return obj;
    }

    public static /* synthetic */ void zzm(zzfqr zzfqrVar, int i2, Object obj) {
        zzfqrVar.zzB()[i2] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzu() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv(Object obj) {
        if (zzq()) {
            return -1;
        }
        int zzb = zzfqz.zzb(obj);
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzc = zzfqs.zzc(obj2, zzb & zzu);
        if (zzc != 0) {
            int i2 = ~zzu;
            int i3 = zzb & i2;
            do {
                int i4 = zzc - 1;
                int i5 = zzz()[i4];
                if ((i5 & i2) == i3 && zzfoo.zza(obj, zzA()[i4])) {
                    return i4;
                }
                zzc = i5 & zzu;
            } while (zzc != 0);
            return -1;
        }
        return -1;
    }

    private final int zzw(int i2, int i3, int i4, int i5) {
        Object zzd2 = zzfqs.zzd(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            zzfqs.zze(zzd2, i4 & i6, i5 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        for (int i7 = 0; i7 <= i2; i7++) {
            int zzc = zzfqs.zzc(obj, i7);
            while (zzc != 0) {
                int i8 = zzc - 1;
                int i9 = zzz[i8];
                int i10 = ((~i2) & i9) | i7;
                int i11 = i10 & i6;
                int zzc2 = zzfqs.zzc(zzd2, i11);
                zzfqs.zze(zzd2, i11, zzc);
                zzz[i8] = ((~i6) & i10) | (zzc2 & i6);
                zzc = i9 & i2;
            }
        }
        this.zze = zzd2;
        zzy(i6);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzx(Object obj) {
        if (zzq()) {
            return zzd;
        }
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzb = zzfqs.zzb(obj, null, zzu, obj2, zzz(), zzA(), null);
        if (zzb == -1) {
            return zzd;
        }
        Object obj3 = zzB()[zzb];
        zzp(zzb, zzu);
        this.zzg--;
        zzn();
        return obj3;
    }

    private final void zzy(int i2) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i2)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzz() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzq()) {
            return;
        }
        zzn();
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzftm.zzb(size(), 3, 1073741823);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzA(), 0, this.zzg, (Object) null);
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzz(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsKey(obj);
        }
        return zzv(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl == null) {
            for (int i2 = 0; i2 < this.zzg; i2++) {
                if (zzfoo.zza(obj, zzB()[i2])) {
                    return true;
                }
            }
            return false;
        }
        return zzl.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set == null) {
            zzfqm zzfqmVar = new zzfqm(this);
            this.zzi = zzfqmVar;
            return zzfqmVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzv = zzv(obj);
        if (zzv == -1) {
            return null;
        }
        return zzB()[zzv];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set == null) {
            zzfqo zzfqoVar = new zzfqo(this);
            this.zzh = zzfqoVar;
            return zzfqoVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzq()) {
            zzfos.zzi(zzq(), "Arrays already allocated");
            int i2 = this.zzf;
            int max = Math.max(i2 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = CommonUtils.BYTES_IN_A_GIGABYTE;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzfqs.zzd(max2);
            zzy(max2 - 1);
            this.zza = new int[i2];
            this.zzb = new Object[i2];
            this.zzc = new Object[i2];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int i3 = this.zzg;
        int i4 = i3 + 1;
        int zzb = zzfqz.zzb(obj);
        int zzu = zzu();
        int i5 = zzb & zzu;
        Object obj3 = this.zze;
        obj3.getClass();
        int zzc = zzfqs.zzc(obj3, i5);
        if (zzc != 0) {
            int i6 = ~zzu;
            int i7 = zzb & i6;
            int i8 = 0;
            while (true) {
                int i9 = zzc - 1;
                int i10 = zzz[i9];
                int i11 = i10 & i6;
                if (i11 == i7 && zzfoo.zza(obj, zzA[i9])) {
                    Object obj4 = zzB[i9];
                    zzB[i9] = obj2;
                    return obj4;
                }
                int i12 = i10 & zzu;
                i8++;
                if (i12 != 0) {
                    zzc = i12;
                } else if (i8 >= 9) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                    int zze = zze();
                    while (zze >= 0) {
                        linkedHashMap.put(zzA()[zze], zzB()[zze]);
                        zze = zzf(zze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzn();
                    return linkedHashMap.put(obj, obj2);
                } else if (i4 > zzu) {
                    zzu = zzw(zzu, zzfqs.zza(zzu), zzb, i3);
                } else {
                    zzz[i9] = (i4 & zzu) | i11;
                }
            }
        } else if (i4 > zzu) {
            zzu = zzw(zzu, zzfqs.zza(zzu), zzb, i3);
        } else {
            Object obj5 = this.zze;
            obj5.getClass();
            zzfqs.zze(obj5, i5, i4);
        }
        int length = zzz().length;
        if (i4 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzz(), min);
            this.zzb = Arrays.copyOf(zzA(), min);
            this.zzc = Arrays.copyOf(zzB(), min);
        }
        zzz()[i3] = (~zzu) & zzb;
        zzA()[i3] = obj;
        zzB()[i3] = obj2;
        this.zzg = i4;
        zzn();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzx = zzx(obj);
        if (zzx == zzd) {
            return null;
        }
        return zzx;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        return zzl != null ? zzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection == null) {
            zzfqq zzfqqVar = new zzfqq(this);
            this.zzj = zzfqqVar;
            return zzfqqVar;
        }
        return collection;
    }

    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzf(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.zzg) {
            return i3;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzn() {
        this.zzf += 32;
    }

    public final void zzo(int i2) {
        this.zzf = zzftm.zzb(8, 1, 1073741823);
    }

    public final void zzp(int i2, int i3) {
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int size = size() - 1;
        if (i2 < size) {
            Object obj2 = zzA[size];
            zzA[i2] = obj2;
            zzB[i2] = zzB[size];
            zzA[size] = null;
            zzB[size] = null;
            zzz[i2] = zzz[size];
            zzz[size] = 0;
            int zzb = zzfqz.zzb(obj2) & i3;
            int zzc = zzfqs.zzc(obj, zzb);
            int i4 = size + 1;
            if (zzc == i4) {
                zzfqs.zze(obj, zzb, i2 + 1);
                return;
            }
            while (true) {
                int i5 = zzc - 1;
                int i6 = zzz[i5];
                int i7 = i6 & i3;
                if (i7 == i4) {
                    zzz[i5] = ((i2 + 1) & i3) | (i6 & (~i3));
                    return;
                }
                zzc = i7;
            }
        } else {
            zzA[i2] = null;
            zzB[i2] = null;
            zzz[i2] = 0;
        }
    }

    public final boolean zzq() {
        return this.zze == null;
    }

    public zzfqr(int i2) {
        zzo(8);
    }
}
