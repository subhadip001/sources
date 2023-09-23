package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfrm extends zzfrc implements Set {
    private transient zzfrh zza;

    public static int zzh(int i2) {
        int max = Math.max(i2, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        zzfos.zzf(max < 1073741824, "collection too large");
        return CommonUtils.BYTES_IN_A_GIGABYTE;
    }

    public static zzfrl zzj(int i2) {
        return new zzfrl(i2);
    }

    public static zzfrm zzl(Collection collection) {
        Object[] array = collection.toArray();
        return zzp(array.length, array);
    }

    @SafeVarargs
    public static zzfrm zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzp(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfrm zzp(int i2, Object... objArr) {
        if (i2 != 0) {
            if (i2 != 1) {
                int zzh = zzh(i2);
                Object[] objArr2 = new Object[zzh];
                int i3 = zzh - 1;
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < i2; i6++) {
                    Object obj = objArr[i6];
                    zzfso.zza(obj, i6);
                    int hashCode = obj.hashCode();
                    int zza = zzfqz.zza(hashCode);
                    while (true) {
                        int i7 = zza & i3;
                        Object obj2 = objArr2[i7];
                        if (obj2 == null) {
                            objArr[i5] = obj;
                            objArr2[i7] = obj;
                            i4 += hashCode;
                            i5++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            zza++;
                        }
                    }
                }
                Arrays.fill(objArr, i5, i2, (Object) null);
                if (i5 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new zzftd(obj3);
                } else if (zzh(i5) < zzh / 2) {
                    return zzp(i5, objArr);
                } else {
                    if (zzq(i5, objArr.length)) {
                        objArr = Arrays.copyOf(objArr, i5);
                    }
                    return new zzfsw(objArr, i4, objArr2, i3, i5);
                }
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzftd(obj4);
        }
        return zzfsw.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzq(int i2, int i3) {
        return i2 < (i3 >> 1) + (i3 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfrm) && zzo() && ((zzfrm) obj).zzo() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzftc.zzc(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzftc.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public zzfrh zzd() {
        zzfrh zzfrhVar = this.zza;
        if (zzfrhVar == null) {
            zzfrh zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return zzfrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzftg iterator();

    public zzfrh zzi() {
        return zzfrh.zzj(toArray());
    }

    public boolean zzo() {
        return false;
    }
}
