package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzlz {
    private static final Class zza;
    private static final zzmo zzb;
    private static final zzmo zzc;
    private static final zzmo zzd;

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
        zzd = new zzmq();
    }

    public static zzmo zzA() {
        return zzc;
    }

    public static zzmo zzB() {
        return zzd;
    }

    public static Object zzC(Object obj, int i2, List list, zzkj zzkjVar, Object obj2, zzmo zzmoVar) {
        Object obj3 = null;
        if (zzkjVar == null) {
            return null;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                if (zzkjVar.zza(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    obj3 = zzD(obj, i2, intValue, obj3, zzmoVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
                return obj3;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzkjVar.zza(intValue2)) {
                    obj3 = zzD(obj, i2, intValue2, obj3, zzmoVar);
                    it.remove();
                }
            }
        }
        return obj3;
    }

    public static Object zzD(Object obj, int i2, int i3, Object obj2, zzmo zzmoVar) {
        if (obj2 == null) {
            obj2 = zzmoVar.zzc(obj);
        }
        zzmoVar.zzf(obj2, i2, i3);
        return obj2;
    }

    public static void zzE(zzjs zzjsVar, Object obj, Object obj2) {
        zzjsVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzmo zzmoVar, Object obj, Object obj2) {
        zzmoVar.zzh(obj, zzmoVar.zze(zzmoVar.zzd(obj), zzmoVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzkf.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzH(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzc(i2, list, z);
    }

    public static void zzI(int i2, List list, zzng zzngVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zze(i2, list);
    }

    public static void zzJ(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzg(i2, list, z);
    }

    public static void zzK(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzj(i2, list, z);
    }

    public static void zzL(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzl(i2, list, z);
    }

    public static void zzM(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzn(i2, list, z);
    }

    public static void zzN(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzp(i2, list, z);
    }

    public static void zzO(int i2, List list, zzng zzngVar, zzlx zzlxVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((zzjn) zzngVar).zzq(i2, list.get(i3), zzlxVar);
        }
    }

    public static void zzP(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzs(i2, list, z);
    }

    public static void zzQ(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzu(i2, list, z);
    }

    public static void zzR(int i2, List list, zzng zzngVar, zzlx zzlxVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((zzjn) zzngVar).zzv(i2, list.get(i3), zzlxVar);
        }
    }

    public static void zzS(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzx(i2, list, z);
    }

    public static void zzT(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzz(i2, list, z);
    }

    public static void zzU(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzB(i2, list, z);
    }

    public static void zzV(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzD(i2, list, z);
    }

    public static void zzW(int i2, List list, zzng zzngVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzG(i2, list);
    }

    public static void zzX(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzI(i2, list, z);
    }

    public static void zzY(int i2, List list, zzng zzngVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzngVar.zzK(i2, list, z);
    }

    public static boolean zzZ(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int zza(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzA(i2 << 3) + 1) * size;
    }

    public static void zzaa(zzlh zzlhVar, Object obj, Object obj2, long j2) {
        zzmy.zzs(obj, j2, zzlh.zzb(zzmy.zzf(obj, j2), zzmy.zzf(obj2, j2)));
    }

    private static zzmo zzab(boolean z) {
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
            return (zzmo) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
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
        int zzz = zzjm.zzz(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzz += zzjm.zzt((zzje) list.get(i3));
        }
        return zzz;
    }

    public static int zzd(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i2) * size) + zze(list);
    }

    public static int zze(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkgVar = (zzkg) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzjm.zzv(zzkgVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzjm.zzv(((Integer) list.get(i3)).intValue());
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
        return (zzjm.zzA(i2 << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzA(i2 << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i2, List list, zzlx zzlxVar) {
        int size = list.size();
        if (size != 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                i3 += zzjm.zzu(i2, (zzlm) list.get(i4), zzlxVar);
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
        return (zzjm.zzz(i2) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkgVar = (zzkg) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzjm.zzv(zzkgVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzjm.zzv(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzm(int i2, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjm.zzz(i2) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlb) {
            zzlb zzlbVar = (zzlb) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzjm.zzB(zzlbVar.zza(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzjm.zzB(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzo(int i2, Object obj, zzlx zzlxVar) {
        if (obj instanceof zzks) {
            int zzA = zzjm.zzA(i2 << 3);
            int zza2 = ((zzks) obj).zza();
            return zzjm.zzA(zza2) + zza2 + zzA;
        }
        return zzjm.zzx((zzlm) obj, zzlxVar) + zzjm.zzA(i2 << 3);
    }

    public static int zzp(int i2, List list, zzlx zzlxVar) {
        int zzx;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjm.zzz(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzks) {
                zzx = zzjm.zzw((zzks) obj);
            } else {
                zzx = zzjm.zzx((zzlm) obj, zzlxVar);
            }
            zzz = zzx + zzz;
        }
        return zzz;
    }

    public static int zzq(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i2) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkgVar = (zzkg) list;
            i2 = 0;
            while (i3 < size) {
                int zze = zzkgVar.zze(i3);
                i2 += zzjm.zzA((zze >> 31) ^ (zze + zze));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i2 += zzjm.zzA((intValue >> 31) ^ (intValue + intValue));
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
        return (zzjm.zzz(i2) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlb) {
            zzlb zzlbVar = (zzlb) list;
            i2 = 0;
            while (i3 < size) {
                long zza2 = zzlbVar.zza(i3);
                i2 += zzjm.zzB((zza2 >> 63) ^ (zza2 + zza2));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                long longValue = ((Long) list.get(i3)).longValue();
                i2 += zzjm.zzB((longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
        }
        return i2;
    }

    public static int zzu(int i2, List list) {
        int zzy;
        int zzy2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzjm.zzz(i2) * size;
        if (list instanceof zzku) {
            zzku zzkuVar = (zzku) list;
            while (i3 < size) {
                Object zzf = zzkuVar.zzf(i3);
                if (zzf instanceof zzje) {
                    zzy2 = zzjm.zzt((zzje) zzf);
                } else {
                    zzy2 = zzjm.zzy((String) zzf);
                }
                zzz = zzy2 + zzz;
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof zzje) {
                    zzy = zzjm.zzt((zzje) obj);
                } else {
                    zzy = zzjm.zzy((String) obj);
                }
                zzz = zzy + zzz;
                i3++;
            }
        }
        return zzz;
    }

    public static int zzv(int i2, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjm.zzz(i2) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkg) {
            zzkg zzkgVar = (zzkg) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzjm.zzA(zzkgVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzjm.zzA(((Integer) list.get(i3)).intValue());
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
        return (zzjm.zzz(i2) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlb) {
            zzlb zzlbVar = (zzlb) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzjm.zzB(zzlbVar.zza(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzjm.zzB(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static zzmo zzz() {
        return zzb;
    }
}
