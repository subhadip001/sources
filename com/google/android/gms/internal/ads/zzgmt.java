package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgmt {
    private static final Class zza;
    private static final zzgni zzb;
    private static final zzgni zzc;
    private static final zzgni zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzgnk();
    }

    public static zzgni zzA() {
        return zzc;
    }

    public static zzgni zzB() {
        return zzd;
    }

    public static Object zzC(int i2, List list, zzgks zzgksVar, Object obj, zzgni zzgniVar) {
        if (zzgksVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                if (zzgksVar.zza(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    obj = zzD(i2, intValue, obj, zzgniVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgksVar.zza(intValue2)) {
                    obj = zzD(i2, intValue2, obj, zzgniVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object zzD(int i2, int i3, Object obj, zzgni zzgniVar) {
        if (obj == null) {
            obj = zzgniVar.zzf();
        }
        zzgniVar.zzl(obj, i2, i3);
        return obj;
    }

    public static void zzE(zzgkb zzgkbVar, Object obj, Object obj2) {
        zzgkbVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzgni zzgniVar, Object obj, Object obj2) {
        zzgniVar.zzo(obj, zzgniVar.zze(zzgniVar.zzd(obj), zzgniVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzgko.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void zzI(zzglt zzgltVar, Object obj, Object obj2, long j2) {
        zzgns.zzv(obj, j2, zzglt.zzc(zzgns.zzh(obj, j2), zzgns.zzh(obj2, j2)));
    }

    public static void zzJ(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzc(i2, list, z);
    }

    public static void zzK(int i2, List list, zzgjw zzgjwVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zze(i2, list);
    }

    public static void zzL(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzg(i2, list, z);
    }

    public static void zzM(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzj(i2, list, z);
    }

    public static void zzN(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzl(i2, list, z);
    }

    public static void zzO(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzn(i2, list, z);
    }

    public static void zzP(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzp(i2, list, z);
    }

    public static void zzQ(int i2, List list, zzgjw zzgjwVar, zzgmr zzgmrVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzgjwVar.zzq(i2, list.get(i3), zzgmrVar);
        }
    }

    public static void zzR(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzs(i2, list, z);
    }

    public static void zzS(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzu(i2, list, z);
    }

    public static void zzT(int i2, List list, zzgjw zzgjwVar, zzgmr zzgmrVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzgjwVar.zzv(i2, list.get(i3), zzgmrVar);
        }
    }

    public static void zzU(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzx(i2, list, z);
    }

    public static void zzV(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzz(i2, list, z);
    }

    public static void zzW(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzB(i2, list, z);
    }

    public static void zzX(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzD(i2, list, z);
    }

    public static void zzY(int i2, List list, zzgjw zzgjwVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzG(i2, list);
    }

    public static void zzZ(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzI(i2, list, z);
    }

    public static int zza(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzE(i2 << 3) + 1) * size;
    }

    public static void zzaa(int i2, List list, zzgjw zzgjwVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjwVar.zzK(i2, list, z);
    }

    private static zzgni zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgni) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjv.zzD(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzD += zzgjv.zzw((zzgjg) list.get(i3));
        }
        return zzD;
    }

    public static int zzd(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzD(i2) * size) + zze(list);
    }

    public static int zze(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkpVar = (zzgkp) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzgjv.zzy(zzgkpVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzgjv.zzy(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzf(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzE(i2 << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzE(i2 << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i2, List list, zzgmr zzgmrVar) {
        int size = list.size();
        if (size != 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i3 += zzgjv.zzx(i2, (zzgly) list.get(i4), zzgmrVar);
            }
            return i3;
        }
        return 0;
    }

    public static int zzk(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzD(i2) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkpVar = (zzgkp) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzgjv.zzy(zzgkpVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzgjv.zzy(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzm(int i2, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzgjv.zzD(i2) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgln) {
            zzgln zzglnVar = (zzgln) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzgjv.zzF(zzglnVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzgjv.zzF(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzo(int i2, Object obj, zzgmr zzgmrVar) {
        if (obj instanceof zzgle) {
            int zzE = zzgjv.zzE(i2 << 3);
            int zza2 = ((zzgle) obj).zza();
            return zzgjv.zzE(zza2) + zza2 + zzE;
        }
        return zzgjv.zzA((zzgly) obj, zzgmrVar) + zzgjv.zzE(i2 << 3);
    }

    public static int zzp(int i2, List list, zzgmr zzgmrVar) {
        int zzA;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjv.zzD(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzgle) {
                zzA = zzgjv.zzz((zzgle) obj);
            } else {
                zzA = zzgjv.zzA((zzgly) obj, zzgmrVar);
            }
            zzD = zzA + zzD;
        }
        return zzD;
    }

    public static int zzq(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzD(i2) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkpVar = (zzgkp) list;
            i2 = 0;
            while (i3 < size) {
                int zze = zzgkpVar.zze(i3);
                i2 += zzgjv.zzE((zze >> 31) ^ (zze + zze));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i2 += zzgjv.zzE((intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
        }
        return i2;
    }

    public static int zzs(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzD(i2) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgln) {
            zzgln zzglnVar = (zzgln) list;
            i2 = 0;
            while (i3 < size) {
                long zze = zzglnVar.zze(i3);
                i2 += zzgjv.zzF((zze >> 63) ^ (zze + zze));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                long longValue = ((Long) list.get(i3)).longValue();
                i2 += zzgjv.zzF((longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
        }
        return i2;
    }

    public static int zzu(int i2, List list) {
        int zzC;
        int zzC2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjv.zzD(i2) * size;
        if (list instanceof zzglg) {
            zzglg zzglgVar = (zzglg) list;
            while (i3 < size) {
                Object zzf = zzglgVar.zzf(i3);
                if (zzf instanceof zzgjg) {
                    zzC2 = zzgjv.zzw((zzgjg) zzf);
                } else {
                    zzC2 = zzgjv.zzC((String) zzf);
                }
                zzD = zzC2 + zzD;
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof zzgjg) {
                    zzC = zzgjv.zzw((zzgjg) obj);
                } else {
                    zzC = zzgjv.zzC((String) obj);
                }
                zzD = zzC + zzD;
                i3++;
            }
        }
        return zzD;
    }

    public static int zzv(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzD(i2) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkp) {
            zzgkp zzgkpVar = (zzgkp) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzgjv.zzE(zzgkpVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzgjv.zzE(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzx(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjv.zzD(i2) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgln) {
            zzgln zzglnVar = (zzgln) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzgjv.zzF(zzglnVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzgjv.zzF(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static zzgni zzz() {
        return zzb;
    }
}
