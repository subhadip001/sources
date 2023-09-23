package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgmb<T> implements zzgmr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgns.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgly zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzglm zzn;
    private final zzgni zzo;
    private final zzgkb zzp;
    private final zzgmd zzq;
    private final zzglt zzr;

    private zzgmb(int[] iArr, Object[] objArr, int i2, int i3, zzgly zzglyVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, zzgmd zzgmdVar, zzglm zzglmVar, zzgni zzgniVar, zzgkb zzgkbVar, zzglt zzgltVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzi = zzglyVar instanceof zzgko;
        this.zzj = z;
        boolean z3 = false;
        if (zzgkbVar != null && zzgkbVar.zzh(zzglyVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i4;
        this.zzm = i5;
        this.zzq = zzgmdVar;
        this.zzn = zzglmVar;
        this.zzo = zzgniVar;
        this.zzp = zzgkbVar;
        this.zzg = zzglyVar;
        this.zzr = zzgltVar;
    }

    private final int zzA(int i2, int i3) {
        int length = (this.zzc.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.zzc[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private static int zzB(int i2) {
        return (i2 >>> 20) & 255;
    }

    private final int zzC(int i2) {
        return this.zzc[i2 + 1];
    }

    private static long zzD(Object obj, long j2) {
        return ((Long) zzgns.zzh(obj, j2)).longValue();
    }

    private final zzgks zzE(int i2) {
        int i3 = i2 / 3;
        return (zzgks) this.zzd[i3 + i3 + 1];
    }

    private final zzgmr zzF(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzgmr zzgmrVar = (zzgmr) this.zzd[i4];
        if (zzgmrVar != null) {
            return zzgmrVar;
        }
        zzgmr zzb2 = zzgmg.zza().zzb((Class) this.zzd[i4 + 1]);
        this.zzd[i4] = zzb2;
        return zzb2;
    }

    private final Object zzG(Object obj, int i2, Object obj2, zzgni zzgniVar) {
        int i3 = this.zzc[i2];
        Object zzh = zzgns.zzh(obj, zzC(i2) & 1048575);
        if (zzh == null || zzE(i2) == null) {
            return obj2;
        }
        zzgls zzglsVar = (zzgls) zzh;
        zzglr zzglrVar = (zzglr) zzH(i2);
        throw null;
    }

    private final Object zzH(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    private static Field zzI(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder F = a.F("Field ", str, " for ", name, " not found. Known fields are ");
            F.append(arrays);
            throw new RuntimeException(F.toString());
        }
    }

    private final void zzJ(Object obj, Object obj2, int i2) {
        long zzC = zzC(i2) & 1048575;
        if (zzQ(obj2, i2)) {
            Object zzh = zzgns.zzh(obj, zzC);
            Object zzh2 = zzgns.zzh(obj2, zzC);
            if (zzh != null && zzh2 != null) {
                zzgns.zzv(obj, zzC, zzgky.zzg(zzh, zzh2));
                zzM(obj, i2);
            } else if (zzh2 != null) {
                zzgns.zzv(obj, zzC, zzh2);
                zzM(obj, i2);
            }
        }
    }

    private final void zzK(Object obj, Object obj2, int i2) {
        int zzC = zzC(i2);
        int i3 = this.zzc[i2];
        long j2 = zzC & 1048575;
        if (zzT(obj2, i3, i2)) {
            Object zzh = zzT(obj, i3, i2) ? zzgns.zzh(obj, j2) : null;
            Object zzh2 = zzgns.zzh(obj2, j2);
            if (zzh != null && zzh2 != null) {
                zzgns.zzv(obj, j2, zzgky.zzg(zzh, zzh2));
                zzN(obj, i3, i2);
            } else if (zzh2 != null) {
                zzgns.zzv(obj, j2, zzh2);
                zzN(obj, i3, i2);
            }
        }
    }

    private final void zzL(Object obj, int i2, zzgmj zzgmjVar) {
        if (zzP(i2)) {
            zzgns.zzv(obj, i2 & 1048575, zzgmjVar.zzu());
        } else if (this.zzi) {
            zzgns.zzv(obj, i2 & 1048575, zzgmjVar.zzt());
        } else {
            zzgns.zzv(obj, i2 & 1048575, zzgmjVar.zzp());
        }
    }

    private final void zzM(Object obj, int i2) {
        int zzz = zzz(i2);
        long j2 = 1048575 & zzz;
        if (j2 == 1048575) {
            return;
        }
        zzgns.zzt(obj, j2, (1 << (zzz >>> 20)) | zzgns.zzd(obj, j2));
    }

    private final void zzN(Object obj, int i2, int i3) {
        zzgns.zzt(obj, zzz(i3) & 1048575, i2);
    }

    private final boolean zzO(Object obj, Object obj2, int i2) {
        return zzQ(obj, i2) == zzQ(obj2, i2);
    }

    private static boolean zzP(int i2) {
        return (i2 & 536870912) != 0;
    }

    private final boolean zzQ(Object obj, int i2) {
        int zzz = zzz(i2);
        long j2 = zzz & 1048575;
        if (j2 != 1048575) {
            return (zzgns.zzd(obj, j2) & (1 << (zzz >>> 20))) != 0;
        }
        int zzC = zzC(i2);
        long j3 = zzC & 1048575;
        switch (zzB(zzC)) {
            case 0:
                return Double.doubleToRawLongBits(zzgns.zzb(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgns.zzc(obj, j3)) != 0;
            case 2:
                return zzgns.zzf(obj, j3) != 0;
            case 3:
                return zzgns.zzf(obj, j3) != 0;
            case 4:
                return zzgns.zzd(obj, j3) != 0;
            case 5:
                return zzgns.zzf(obj, j3) != 0;
            case 6:
                return zzgns.zzd(obj, j3) != 0;
            case 7:
                return zzgns.zzz(obj, j3);
            case 8:
                Object zzh = zzgns.zzh(obj, j3);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                } else if (zzh instanceof zzgjg) {
                    return !zzgjg.zzb.equals(zzh);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzgns.zzh(obj, j3) != null;
            case 10:
                return !zzgjg.zzb.equals(zzgns.zzh(obj, j3));
            case 11:
                return zzgns.zzd(obj, j3) != 0;
            case 12:
                return zzgns.zzd(obj, j3) != 0;
            case 13:
                return zzgns.zzd(obj, j3) != 0;
            case 14:
                return zzgns.zzf(obj, j3) != 0;
            case 15:
                return zzgns.zzd(obj, j3) != 0;
            case 16:
                return zzgns.zzf(obj, j3) != 0;
            case 17:
                return zzgns.zzh(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzR(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return zzQ(obj, i2);
        }
        return (i4 & i5) != 0;
    }

    private static boolean zzS(Object obj, int i2, zzgmr zzgmrVar) {
        return zzgmrVar.zzk(zzgns.zzh(obj, i2 & 1048575));
    }

    private final boolean zzT(Object obj, int i2, int i3) {
        return zzgns.zzd(obj, (long) (zzz(i3) & 1048575)) == i2;
    }

    private static boolean zzU(Object obj, long j2) {
        return ((Boolean) zzgns.zzh(obj, j2)).booleanValue();
    }

    private final void zzV(Object obj, zzgjw zzgjwVar) {
        int i2;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i3 = 1048575;
            int i4 = 0;
            int i5 = 0;
            int i6 = 1048575;
            while (i4 < length) {
                int zzC = zzC(i4);
                int[] iArr = this.zzc;
                int i7 = iArr[i4];
                int zzB = zzB(zzC);
                if (zzB <= 17) {
                    int i8 = iArr[i4 + 2];
                    int i9 = i8 & i3;
                    if (i9 != i6) {
                        i5 = unsafe.getInt(obj, i9);
                        i6 = i9;
                    }
                    i2 = 1 << (i8 >>> 20);
                } else {
                    i2 = 0;
                }
                long j2 = zzC & i3;
                switch (zzB) {
                    case 0:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzf(i7, zzgns.zzb(obj, j2));
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 1:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzo(i7, zzgns.zzc(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 2:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzt(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 3:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzJ(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 4:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzr(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 5:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzm(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 6:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzk(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 7:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzb(i7, zzgns.zzz(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 8:
                        if ((i5 & i2) != 0) {
                            zzX(i7, unsafe.getObject(obj, j2), zzgjwVar);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 9:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzv(i7, unsafe.getObject(obj, j2), zzF(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 10:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzd(i7, (zzgjg) unsafe.getObject(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 11:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzH(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 12:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzi(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 13:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzw(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 14:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzy(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 15:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzA(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 16:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzC(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 17:
                        if ((i5 & i2) != 0) {
                            zzgjwVar.zzq(i7, unsafe.getObject(obj, j2), zzF(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 18:
                        zzgmt.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 19:
                        zzgmt.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 20:
                        zzgmt.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 21:
                        zzgmt.zzaa(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 22:
                        zzgmt.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 23:
                        zzgmt.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 24:
                        zzgmt.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 25:
                        zzgmt.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 26:
                        zzgmt.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar);
                        break;
                    case 27:
                        zzgmt.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, zzF(i4));
                        break;
                    case 28:
                        zzgmt.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar);
                        break;
                    case 29:
                        zzgmt.zzZ(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        break;
                    case 30:
                        zzgmt.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        break;
                    case 31:
                        zzgmt.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        break;
                    case 32:
                        zzgmt.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        break;
                    case 33:
                        zzgmt.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        break;
                    case 34:
                        zzgmt.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, false);
                        break;
                    case 35:
                        zzgmt.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 36:
                        zzgmt.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 37:
                        zzgmt.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 38:
                        zzgmt.zzaa(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 39:
                        zzgmt.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 40:
                        zzgmt.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 41:
                        zzgmt.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 42:
                        zzgmt.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 43:
                        zzgmt.zzZ(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 44:
                        zzgmt.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 45:
                        zzgmt.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 46:
                        zzgmt.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 47:
                        zzgmt.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 48:
                        zzgmt.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, true);
                        break;
                    case 49:
                        zzgmt.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzgjwVar, zzF(i4));
                        break;
                    case 50:
                        zzW(zzgjwVar, i7, unsafe.getObject(obj, j2), i4);
                        break;
                    case 51:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzf(i7, zzo(obj, j2));
                            break;
                        }
                        break;
                    case 52:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzo(i7, zzp(obj, j2));
                            break;
                        }
                        break;
                    case 53:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzt(i7, zzD(obj, j2));
                            break;
                        }
                        break;
                    case 54:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzJ(i7, zzD(obj, j2));
                            break;
                        }
                        break;
                    case 55:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzr(i7, zzs(obj, j2));
                            break;
                        }
                        break;
                    case 56:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzm(i7, zzD(obj, j2));
                            break;
                        }
                        break;
                    case 57:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzk(i7, zzs(obj, j2));
                            break;
                        }
                        break;
                    case 58:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzb(i7, zzU(obj, j2));
                            break;
                        }
                        break;
                    case 59:
                        if (zzT(obj, i7, i4)) {
                            zzX(i7, unsafe.getObject(obj, j2), zzgjwVar);
                            break;
                        }
                        break;
                    case 60:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzv(i7, unsafe.getObject(obj, j2), zzF(i4));
                            break;
                        }
                        break;
                    case 61:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzd(i7, (zzgjg) unsafe.getObject(obj, j2));
                            break;
                        }
                        break;
                    case 62:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzH(i7, zzs(obj, j2));
                            break;
                        }
                        break;
                    case 63:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzi(i7, zzs(obj, j2));
                            break;
                        }
                        break;
                    case 64:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzw(i7, zzs(obj, j2));
                            break;
                        }
                        break;
                    case 65:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzy(i7, zzD(obj, j2));
                            break;
                        }
                        break;
                    case 66:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzA(i7, zzs(obj, j2));
                            break;
                        }
                        break;
                    case 67:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzC(i7, zzD(obj, j2));
                            break;
                        }
                        break;
                    case 68:
                        if (zzT(obj, i7, i4)) {
                            zzgjwVar.zzq(i7, unsafe.getObject(obj, j2), zzF(i4));
                            break;
                        }
                        break;
                }
                i4 += 3;
                i3 = 1048575;
            }
            zzgni zzgniVar = this.zzo;
            zzgniVar.zzr(zzgniVar.zzd(obj), zzgjwVar);
            return;
        }
        this.zzp.zza(obj);
        throw null;
    }

    private final void zzW(zzgjw zzgjwVar, int i2, Object obj, int i3) {
        if (obj == null) {
            return;
        }
        zzglr zzglrVar = (zzglr) zzH(i3);
        throw null;
    }

    private static final void zzX(int i2, Object obj, zzgjw zzgjwVar) {
        if (obj instanceof String) {
            zzgjwVar.zzF(i2, (String) obj);
        } else {
            zzgjwVar.zzd(i2, (zzgjg) obj);
        }
    }

    public static zzgnj zzd(Object obj) {
        zzgko zzgkoVar = (zzgko) obj;
        zzgnj zzgnjVar = zzgkoVar.zzc;
        if (zzgnjVar == zzgnj.zzc()) {
            zzgnj zze = zzgnj.zze();
            zzgkoVar.zzc = zze;
            return zze;
        }
        return zzgnjVar;
    }

    public static zzgmb zzl(Class cls, zzglv zzglvVar, zzgmd zzgmdVar, zzglm zzglmVar, zzgni zzgniVar, zzgkb zzgkbVar, zzglt zzgltVar) {
        if (zzglvVar instanceof zzgmi) {
            return zzm((zzgmi) zzglvVar, zzgmdVar, zzglmVar, zzgniVar, zzgkbVar, zzgltVar);
        }
        zzgnf zzgnfVar = (zzgnf) zzglvVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzgmb zzm(com.google.android.gms.internal.ads.zzgmi r33, com.google.android.gms.internal.ads.zzgmd r34, com.google.android.gms.internal.ads.zzglm r35, com.google.android.gms.internal.ads.zzgni r36, com.google.android.gms.internal.ads.zzgkb r37, com.google.android.gms.internal.ads.zzglt r38) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmb.zzm(com.google.android.gms.internal.ads.zzgmi, com.google.android.gms.internal.ads.zzgmd, com.google.android.gms.internal.ads.zzglm, com.google.android.gms.internal.ads.zzgni, com.google.android.gms.internal.ads.zzgkb, com.google.android.gms.internal.ads.zzglt):com.google.android.gms.internal.ads.zzgmb");
    }

    private static double zzo(Object obj, long j2) {
        return ((Double) zzgns.zzh(obj, j2)).doubleValue();
    }

    private static float zzp(Object obj, long j2) {
        return ((Float) zzgns.zzh(obj, j2)).floatValue();
    }

    private final int zzq(Object obj) {
        int i2;
        int zzE;
        int zzE2;
        int zzE3;
        int zzF;
        int zzE4;
        int zzy;
        int zzE5;
        int zzE6;
        int zzd;
        int zzE7;
        int zzo;
        int zzE8;
        int zzF2;
        int zzi;
        int zzD;
        int zzE9;
        int i3;
        int zzE10;
        int zzd2;
        int zzE11;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i5 < this.zzc.length) {
            int zzC = zzC(i5);
            int[] iArr = this.zzc;
            int i9 = iArr[i5];
            int zzB = zzB(zzC);
            if (zzB <= 17) {
                int i10 = iArr[i5 + 2];
                int i11 = i10 & i4;
                i2 = 1 << (i10 >>> 20);
                if (i11 != i8) {
                    i7 = unsafe.getInt(obj, i11);
                    i8 = i11;
                }
            } else {
                i2 = 0;
            }
            long j2 = i4 & zzC;
            switch (zzB) {
                case 0:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzE = zzgjv.zzE(i9 << 3);
                        zzo = zzE + 8;
                        i6 += zzo;
                        break;
                    }
                case 1:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzE2 = zzgjv.zzE(i9 << 3);
                        zzo = zzE2 + 4;
                        i6 += zzo;
                        break;
                    }
                case 2:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j2);
                        zzE3 = zzgjv.zzE(i9 << 3);
                        zzF = zzgjv.zzF(j3);
                        zzo = zzE3 + zzF;
                        i6 += zzo;
                        break;
                    }
                case 3:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j2);
                        zzE3 = zzgjv.zzE(i9 << 3);
                        zzF = zzgjv.zzF(j4);
                        zzo = zzE3 + zzF;
                        i6 += zzo;
                        break;
                    }
                case 4:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        int i12 = unsafe.getInt(obj, j2);
                        zzE4 = zzgjv.zzE(i9 << 3);
                        zzy = zzgjv.zzy(i12);
                        zzo = zzy + zzE4;
                        i6 += zzo;
                        break;
                    }
                case 5:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzE = zzgjv.zzE(i9 << 3);
                        zzo = zzE + 8;
                        i6 += zzo;
                        break;
                    }
                case 6:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzE2 = zzgjv.zzE(i9 << 3);
                        zzo = zzE2 + 4;
                        i6 += zzo;
                        break;
                    }
                case 7:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzE5 = zzgjv.zzE(i9 << 3);
                        zzo = zzE5 + 1;
                        i6 += zzo;
                        break;
                    }
                case 8:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof zzgjg) {
                            zzE6 = zzgjv.zzE(i9 << 3);
                            zzd = ((zzgjg) object).zzd();
                            zzE7 = zzgjv.zzE(zzd);
                            i6 = zzE7 + zzd + zzE6 + i6;
                            break;
                        } else {
                            zzE4 = zzgjv.zzE(i9 << 3);
                            zzy = zzgjv.zzC((String) object);
                            zzo = zzy + zzE4;
                            i6 += zzo;
                            break;
                        }
                    }
                case 9:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzo = zzgmt.zzo(i9, unsafe.getObject(obj, j2), zzF(i5));
                        i6 += zzo;
                        break;
                    }
                case 10:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzE6 = zzgjv.zzE(i9 << 3);
                        zzd = ((zzgjg) unsafe.getObject(obj, j2)).zzd();
                        zzE7 = zzgjv.zzE(zzd);
                        i6 = zzE7 + zzd + zzE6 + i6;
                        break;
                    }
                case 11:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j2);
                        zzE4 = zzgjv.zzE(i9 << 3);
                        zzy = zzgjv.zzE(i13);
                        zzo = zzy + zzE4;
                        i6 += zzo;
                        break;
                    }
                case 12:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j2);
                        zzE4 = zzgjv.zzE(i9 << 3);
                        zzy = zzgjv.zzy(i14);
                        zzo = zzy + zzE4;
                        i6 += zzo;
                        break;
                    }
                case 13:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzE2 = zzgjv.zzE(i9 << 3);
                        zzo = zzE2 + 4;
                        i6 += zzo;
                        break;
                    }
                case 14:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzE = zzgjv.zzE(i9 << 3);
                        zzo = zzE + 8;
                        i6 += zzo;
                        break;
                    }
                case 15:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j2);
                        zzE4 = zzgjv.zzE(i9 << 3);
                        zzy = zzgjv.zzE((i15 >> 31) ^ (i15 + i15));
                        zzo = zzy + zzE4;
                        i6 += zzo;
                        break;
                    }
                case 16:
                    if ((i2 & i7) == 0) {
                        break;
                    } else {
                        long j5 = unsafe.getLong(obj, j2);
                        zzE8 = zzgjv.zzE(i9 << 3);
                        zzF2 = zzgjv.zzF((j5 >> 63) ^ (j5 + j5));
                        zzo = zzF2 + zzE8;
                        i6 += zzo;
                        break;
                    }
                case 17:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzo = zzgjv.zzx(i9, (zzgly) unsafe.getObject(obj, j2), zzF(i5));
                        i6 += zzo;
                        break;
                    }
                case 18:
                    zzo = zzgmt.zzh(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 19:
                    zzo = zzgmt.zzf(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 20:
                    zzo = zzgmt.zzm(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 21:
                    zzo = zzgmt.zzx(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 22:
                    zzo = zzgmt.zzk(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 23:
                    zzo = zzgmt.zzh(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 24:
                    zzo = zzgmt.zzf(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 25:
                    zzo = zzgmt.zza(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 26:
                    zzo = zzgmt.zzu(i9, (List) unsafe.getObject(obj, j2));
                    i6 += zzo;
                    break;
                case 27:
                    zzo = zzgmt.zzp(i9, (List) unsafe.getObject(obj, j2), zzF(i5));
                    i6 += zzo;
                    break;
                case 28:
                    zzo = zzgmt.zzc(i9, (List) unsafe.getObject(obj, j2));
                    i6 += zzo;
                    break;
                case 29:
                    zzo = zzgmt.zzv(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 30:
                    zzo = zzgmt.zzd(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 31:
                    zzo = zzgmt.zzf(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 32:
                    zzo = zzgmt.zzh(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 33:
                    zzo = zzgmt.zzq(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 34:
                    zzo = zzgmt.zzs(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 35:
                    zzi = zzgmt.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 36:
                    zzi = zzgmt.zzg((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 37:
                    zzi = zzgmt.zzn((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 38:
                    zzi = zzgmt.zzy((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 39:
                    zzi = zzgmt.zzl((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 40:
                    zzi = zzgmt.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 41:
                    zzi = zzgmt.zzg((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 42:
                    zzi = zzgmt.zzb((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 43:
                    zzi = zzgmt.zzw((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 44:
                    zzi = zzgmt.zze((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 45:
                    zzi = zzgmt.zzg((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 46:
                    zzi = zzgmt.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 47:
                    zzi = zzgmt.zzr((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 48:
                    zzi = zzgmt.zzt((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjv.zzD(i9);
                        zzE9 = zzgjv.zzE(zzi);
                        i3 = zzE9 + zzD + zzi;
                        i6 += i3;
                        break;
                    }
                case 49:
                    zzo = zzgmt.zzj(i9, (List) unsafe.getObject(obj, j2), zzF(i5));
                    i6 += zzo;
                    break;
                case 50:
                    zzglt.zza(i9, unsafe.getObject(obj, j2), zzH(i5));
                    break;
                case 51:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        zzE = zzgjv.zzE(i9 << 3);
                        zzo = zzE + 8;
                        i6 += zzo;
                        break;
                    }
                case 52:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        zzE2 = zzgjv.zzE(i9 << 3);
                        zzo = zzE2 + 4;
                        i6 += zzo;
                        break;
                    }
                case 53:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        long zzD2 = zzD(obj, j2);
                        zzE3 = zzgjv.zzE(i9 << 3);
                        zzF = zzgjv.zzF(zzD2);
                        zzo = zzE3 + zzF;
                        i6 += zzo;
                        break;
                    }
                case 54:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        long zzD3 = zzD(obj, j2);
                        zzE3 = zzgjv.zzE(i9 << 3);
                        zzF = zzgjv.zzF(zzD3);
                        zzo = zzE3 + zzF;
                        i6 += zzo;
                        break;
                    }
                case 55:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        int zzs = zzs(obj, j2);
                        zzE4 = zzgjv.zzE(i9 << 3);
                        zzy = zzgjv.zzy(zzs);
                        zzo = zzy + zzE4;
                        i6 += zzo;
                        break;
                    }
                case 56:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        zzE = zzgjv.zzE(i9 << 3);
                        zzo = zzE + 8;
                        i6 += zzo;
                        break;
                    }
                case 57:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        zzE2 = zzgjv.zzE(i9 << 3);
                        zzo = zzE2 + 4;
                        i6 += zzo;
                        break;
                    }
                case 58:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        zzE5 = zzgjv.zzE(i9 << 3);
                        zzo = zzE5 + 1;
                        i6 += zzo;
                        break;
                    }
                case 59:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j2);
                        if (object2 instanceof zzgjg) {
                            zzE10 = zzgjv.zzE(i9 << 3);
                            zzd2 = ((zzgjg) object2).zzd();
                            zzE11 = zzgjv.zzE(zzd2);
                            i3 = zzE11 + zzd2 + zzE10;
                            i6 += i3;
                            break;
                        } else {
                            zzE4 = zzgjv.zzE(i9 << 3);
                            zzy = zzgjv.zzC((String) object2);
                            zzo = zzy + zzE4;
                            i6 += zzo;
                            break;
                        }
                    }
                case 60:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        zzo = zzgmt.zzo(i9, unsafe.getObject(obj, j2), zzF(i5));
                        i6 += zzo;
                        break;
                    }
                case 61:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        zzE10 = zzgjv.zzE(i9 << 3);
                        zzd2 = ((zzgjg) unsafe.getObject(obj, j2)).zzd();
                        zzE11 = zzgjv.zzE(zzd2);
                        i3 = zzE11 + zzd2 + zzE10;
                        i6 += i3;
                        break;
                    }
                case 62:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        int zzs2 = zzs(obj, j2);
                        zzE4 = zzgjv.zzE(i9 << 3);
                        zzy = zzgjv.zzE(zzs2);
                        zzo = zzy + zzE4;
                        i6 += zzo;
                        break;
                    }
                case 63:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        int zzs3 = zzs(obj, j2);
                        zzE4 = zzgjv.zzE(i9 << 3);
                        zzy = zzgjv.zzy(zzs3);
                        zzo = zzy + zzE4;
                        i6 += zzo;
                        break;
                    }
                case 64:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        zzE2 = zzgjv.zzE(i9 << 3);
                        zzo = zzE2 + 4;
                        i6 += zzo;
                        break;
                    }
                case 65:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        zzE = zzgjv.zzE(i9 << 3);
                        zzo = zzE + 8;
                        i6 += zzo;
                        break;
                    }
                case 66:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        int zzs4 = zzs(obj, j2);
                        zzE4 = zzgjv.zzE(i9 << 3);
                        zzy = zzgjv.zzE((zzs4 >> 31) ^ (zzs4 + zzs4));
                        zzo = zzy + zzE4;
                        i6 += zzo;
                        break;
                    }
                case 67:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        long zzD4 = zzD(obj, j2);
                        zzE8 = zzgjv.zzE(i9 << 3);
                        zzF2 = zzgjv.zzF((zzD4 >> 63) ^ (zzD4 + zzD4));
                        zzo = zzF2 + zzE8;
                        i6 += zzo;
                        break;
                    }
                case 68:
                    if (!zzT(obj, i9, i5)) {
                        break;
                    } else {
                        zzo = zzgjv.zzx(i9, (zzgly) unsafe.getObject(obj, j2), zzF(i5));
                        i6 += zzo;
                        break;
                    }
            }
            i5 += 3;
            i4 = 1048575;
        }
        zzgni zzgniVar = this.zzo;
        int zza2 = zzgniVar.zza(zzgniVar.zzd(obj)) + i6;
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return zza2;
    }

    private final int zzr(Object obj) {
        int zzE;
        int zzE2;
        int zzE3;
        int zzF;
        int zzE4;
        int zzy;
        int zzE5;
        int zzE6;
        int zzd;
        int zzE7;
        int zzo;
        int zzi;
        int zzD;
        int zzE8;
        int i2;
        Unsafe unsafe = zzb;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzC = zzC(i4);
            int zzB = zzB(zzC);
            int i5 = this.zzc[i4];
            long j2 = zzC & 1048575;
            if (zzB >= zzgkg.zzJ.zza() && zzB <= zzgkg.zzW.zza()) {
                int i6 = this.zzc[i4 + 2];
            }
            switch (zzB) {
                case 0:
                    if (zzQ(obj, i4)) {
                        zzE = zzgjv.zzE(i5 << 3);
                        zzo = zzE + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (zzQ(obj, i4)) {
                        zzE2 = zzgjv.zzE(i5 << 3);
                        zzo = zzE2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (zzQ(obj, i4)) {
                        long zzf = zzgns.zzf(obj, j2);
                        zzE3 = zzgjv.zzE(i5 << 3);
                        zzF = zzgjv.zzF(zzf);
                        zzo = zzF + zzE3;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (zzQ(obj, i4)) {
                        long zzf2 = zzgns.zzf(obj, j2);
                        zzE3 = zzgjv.zzE(i5 << 3);
                        zzF = zzgjv.zzF(zzf2);
                        zzo = zzF + zzE3;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (zzQ(obj, i4)) {
                        int zzd2 = zzgns.zzd(obj, j2);
                        zzE4 = zzgjv.zzE(i5 << 3);
                        zzy = zzgjv.zzy(zzd2);
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (zzQ(obj, i4)) {
                        zzE = zzgjv.zzE(i5 << 3);
                        zzo = zzE + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (zzQ(obj, i4)) {
                        zzE2 = zzgjv.zzE(i5 << 3);
                        zzo = zzE2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (zzQ(obj, i4)) {
                        zzE5 = zzgjv.zzE(i5 << 3);
                        zzo = zzE5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (zzQ(obj, i4)) {
                        Object zzh = zzgns.zzh(obj, j2);
                        if (zzh instanceof zzgjg) {
                            zzE6 = zzgjv.zzE(i5 << 3);
                            zzd = ((zzgjg) zzh).zzd();
                            zzE7 = zzgjv.zzE(zzd);
                            i2 = zzE7 + zzd + zzE6;
                            i3 += i2;
                        } else {
                            zzE4 = zzgjv.zzE(i5 << 3);
                            zzy = zzgjv.zzC((String) zzh);
                            zzo = zzy + zzE4;
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (zzQ(obj, i4)) {
                        zzo = zzgmt.zzo(i5, zzgns.zzh(obj, j2), zzF(i4));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (zzQ(obj, i4)) {
                        zzE6 = zzgjv.zzE(i5 << 3);
                        zzd = ((zzgjg) zzgns.zzh(obj, j2)).zzd();
                        zzE7 = zzgjv.zzE(zzd);
                        i2 = zzE7 + zzd + zzE6;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 11:
                    if (zzQ(obj, i4)) {
                        int zzd3 = zzgns.zzd(obj, j2);
                        zzE4 = zzgjv.zzE(i5 << 3);
                        zzy = zzgjv.zzE(zzd3);
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (zzQ(obj, i4)) {
                        int zzd4 = zzgns.zzd(obj, j2);
                        zzE4 = zzgjv.zzE(i5 << 3);
                        zzy = zzgjv.zzy(zzd4);
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (zzQ(obj, i4)) {
                        zzE2 = zzgjv.zzE(i5 << 3);
                        zzo = zzE2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (zzQ(obj, i4)) {
                        zzE = zzgjv.zzE(i5 << 3);
                        zzo = zzE + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (zzQ(obj, i4)) {
                        int zzd5 = zzgns.zzd(obj, j2);
                        zzE4 = zzgjv.zzE(i5 << 3);
                        zzy = zzgjv.zzE((zzd5 >> 31) ^ (zzd5 + zzd5));
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (zzQ(obj, i4)) {
                        long zzf3 = zzgns.zzf(obj, j2);
                        zzE4 = zzgjv.zzE(i5 << 3);
                        zzy = zzgjv.zzF((zzf3 >> 63) ^ (zzf3 + zzf3));
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (zzQ(obj, i4)) {
                        zzo = zzgjv.zzx(i5, (zzgly) zzgns.zzh(obj, j2), zzF(i4));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    zzo = zzgmt.zzh(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 19:
                    zzo = zzgmt.zzf(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 20:
                    zzo = zzgmt.zzm(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 21:
                    zzo = zzgmt.zzx(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 22:
                    zzo = zzgmt.zzk(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 23:
                    zzo = zzgmt.zzh(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 24:
                    zzo = zzgmt.zzf(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 25:
                    zzo = zzgmt.zza(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 26:
                    zzo = zzgmt.zzu(i5, (List) zzgns.zzh(obj, j2));
                    break;
                case 27:
                    zzo = zzgmt.zzp(i5, (List) zzgns.zzh(obj, j2), zzF(i4));
                    break;
                case 28:
                    zzo = zzgmt.zzc(i5, (List) zzgns.zzh(obj, j2));
                    break;
                case 29:
                    zzo = zzgmt.zzv(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 30:
                    zzo = zzgmt.zzd(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 31:
                    zzo = zzgmt.zzf(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 32:
                    zzo = zzgmt.zzh(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 33:
                    zzo = zzgmt.zzq(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 34:
                    zzo = zzgmt.zzs(i5, (List) zzgns.zzh(obj, j2), false);
                    break;
                case 35:
                    zzi = zzgmt.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 36:
                    zzi = zzgmt.zzg((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 37:
                    zzi = zzgmt.zzn((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 38:
                    zzi = zzgmt.zzy((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 39:
                    zzi = zzgmt.zzl((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 40:
                    zzi = zzgmt.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 41:
                    zzi = zzgmt.zzg((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 42:
                    zzi = zzgmt.zzb((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 43:
                    zzi = zzgmt.zzw((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 44:
                    zzi = zzgmt.zze((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 45:
                    zzi = zzgmt.zzg((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 46:
                    zzi = zzgmt.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 47:
                    zzi = zzgmt.zzr((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 48:
                    zzi = zzgmt.zzt((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzD = zzgjv.zzD(i5);
                        zzE8 = zzgjv.zzE(zzi);
                        i2 = zzE8 + zzD + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 49:
                    zzo = zzgmt.zzj(i5, (List) zzgns.zzh(obj, j2), zzF(i4));
                    break;
                case 50:
                    zzglt.zza(i5, zzgns.zzh(obj, j2), zzH(i4));
                    continue;
                case 51:
                    if (zzT(obj, i5, i4)) {
                        zzE = zzgjv.zzE(i5 << 3);
                        zzo = zzE + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zzT(obj, i5, i4)) {
                        zzE2 = zzgjv.zzE(i5 << 3);
                        zzo = zzE2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zzT(obj, i5, i4)) {
                        long zzD2 = zzD(obj, j2);
                        zzE3 = zzgjv.zzE(i5 << 3);
                        zzF = zzgjv.zzF(zzD2);
                        zzo = zzF + zzE3;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zzT(obj, i5, i4)) {
                        long zzD3 = zzD(obj, j2);
                        zzE3 = zzgjv.zzE(i5 << 3);
                        zzF = zzgjv.zzF(zzD3);
                        zzo = zzF + zzE3;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (zzT(obj, i5, i4)) {
                        int zzs = zzs(obj, j2);
                        zzE4 = zzgjv.zzE(i5 << 3);
                        zzy = zzgjv.zzy(zzs);
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (zzT(obj, i5, i4)) {
                        zzE = zzgjv.zzE(i5 << 3);
                        zzo = zzE + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zzT(obj, i5, i4)) {
                        zzE2 = zzgjv.zzE(i5 << 3);
                        zzo = zzE2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zzT(obj, i5, i4)) {
                        zzE5 = zzgjv.zzE(i5 << 3);
                        zzo = zzE5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zzT(obj, i5, i4)) {
                        Object zzh2 = zzgns.zzh(obj, j2);
                        if (zzh2 instanceof zzgjg) {
                            zzE6 = zzgjv.zzE(i5 << 3);
                            zzd = ((zzgjg) zzh2).zzd();
                            zzE7 = zzgjv.zzE(zzd);
                            i2 = zzE7 + zzd + zzE6;
                            i3 += i2;
                        } else {
                            zzE4 = zzgjv.zzE(i5 << 3);
                            zzy = zzgjv.zzC((String) zzh2);
                            zzo = zzy + zzE4;
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (zzT(obj, i5, i4)) {
                        zzo = zzgmt.zzo(i5, zzgns.zzh(obj, j2), zzF(i4));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zzT(obj, i5, i4)) {
                        zzE6 = zzgjv.zzE(i5 << 3);
                        zzd = ((zzgjg) zzgns.zzh(obj, j2)).zzd();
                        zzE7 = zzgjv.zzE(zzd);
                        i2 = zzE7 + zzd + zzE6;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 62:
                    if (zzT(obj, i5, i4)) {
                        int zzs2 = zzs(obj, j2);
                        zzE4 = zzgjv.zzE(i5 << 3);
                        zzy = zzgjv.zzE(zzs2);
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (zzT(obj, i5, i4)) {
                        int zzs3 = zzs(obj, j2);
                        zzE4 = zzgjv.zzE(i5 << 3);
                        zzy = zzgjv.zzy(zzs3);
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (zzT(obj, i5, i4)) {
                        zzE2 = zzgjv.zzE(i5 << 3);
                        zzo = zzE2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zzT(obj, i5, i4)) {
                        zzE = zzgjv.zzE(i5 << 3);
                        zzo = zzE + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zzT(obj, i5, i4)) {
                        int zzs4 = zzs(obj, j2);
                        zzE4 = zzgjv.zzE(i5 << 3);
                        zzy = zzgjv.zzE((zzs4 >> 31) ^ (zzs4 + zzs4));
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (zzT(obj, i5, i4)) {
                        long zzD4 = zzD(obj, j2);
                        zzE4 = zzgjv.zzE(i5 << 3);
                        zzy = zzgjv.zzF((zzD4 >> 63) ^ (zzD4 + zzD4));
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (zzT(obj, i5, i4)) {
                        zzo = zzgjv.zzx(i5, (zzgly) zzgns.zzh(obj, j2), zzF(i4));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i3 += zzo;
        }
        zzgni zzgniVar = this.zzo;
        return zzgniVar.zza(zzgniVar.zzd(obj)) + i3;
    }

    private static int zzs(Object obj, long j2) {
        return ((Integer) zzgns.zzh(obj, j2)).intValue();
    }

    private final int zzt(Object obj, byte[] bArr, int i2, int i3, int i4, long j2, zzgis zzgisVar) {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i4);
        Object object = unsafe.getObject(obj, j2);
        if (zzglt.zzb(object)) {
            zzgls zzb2 = zzgls.zza().zzb();
            zzglt.zzc(zzb2, object);
            unsafe.putObject(obj, j2, zzb2);
        }
        zzglr zzglrVar = (zzglr) zzH;
        throw null;
    }

    private final int zzu(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, zzgis zzgisVar) {
        Unsafe unsafe = zzb;
        long j3 = this.zzc[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(obj, j2, Double.valueOf(Double.longBitsToDouble(zzgit.zzn(bArr, i2))));
                    unsafe.putInt(obj, j3, i5);
                    return i2 + 8;
                }
                break;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(obj, j2, Float.valueOf(Float.intBitsToFloat(zzgit.zzb(bArr, i2))));
                    unsafe.putInt(obj, j3, i5);
                    return i2 + 4;
                }
                break;
            case 53:
            case 54:
                if (i6 == 0) {
                    int zzm = zzgit.zzm(bArr, i2, zzgisVar);
                    unsafe.putObject(obj, j2, Long.valueOf(zzgisVar.zzb));
                    unsafe.putInt(obj, j3, i5);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i6 == 0) {
                    int zzj = zzgit.zzj(bArr, i2, zzgisVar);
                    unsafe.putObject(obj, j2, Integer.valueOf(zzgisVar.zza));
                    unsafe.putInt(obj, j3, i5);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(obj, j2, Long.valueOf(zzgit.zzn(bArr, i2)));
                    unsafe.putInt(obj, j3, i5);
                    return i2 + 8;
                }
                break;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(obj, j2, Integer.valueOf(zzgit.zzb(bArr, i2)));
                    unsafe.putInt(obj, j3, i5);
                    return i2 + 4;
                }
                break;
            case 58:
                if (i6 == 0) {
                    int zzm2 = zzgit.zzm(bArr, i2, zzgisVar);
                    unsafe.putObject(obj, j2, Boolean.valueOf(zzgisVar.zzb != 0));
                    unsafe.putInt(obj, j3, i5);
                    return zzm2;
                }
                break;
            case 59:
                if (i6 == 2) {
                    int zzj2 = zzgit.zzj(bArr, i2, zzgisVar);
                    int i10 = zzgisVar.zza;
                    if (i10 == 0) {
                        unsafe.putObject(obj, j2, "");
                    } else if ((i7 & 536870912) != 0 && !zzgnx.zzj(bArr, zzj2, zzj2 + i10)) {
                        throw zzgla.zzd();
                    } else {
                        unsafe.putObject(obj, j2, new String(bArr, zzj2, i10, zzgky.zzb));
                        zzj2 += i10;
                    }
                    unsafe.putInt(obj, j3, i5);
                    return zzj2;
                }
                break;
            case 60:
                if (i6 == 2) {
                    int zzd = zzgit.zzd(zzF(i9), bArr, i2, i3, zzgisVar);
                    Object object = unsafe.getInt(obj, j3) == i5 ? unsafe.getObject(obj, j2) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j2, zzgisVar.zzc);
                    } else {
                        unsafe.putObject(obj, j2, zzgky.zzg(object, zzgisVar.zzc));
                    }
                    unsafe.putInt(obj, j3, i5);
                    return zzd;
                }
                break;
            case 61:
                if (i6 == 2) {
                    int zza2 = zzgit.zza(bArr, i2, zzgisVar);
                    unsafe.putObject(obj, j2, zzgisVar.zzc);
                    unsafe.putInt(obj, j3, i5);
                    return zza2;
                }
                break;
            case 63:
                if (i6 == 0) {
                    int zzj3 = zzgit.zzj(bArr, i2, zzgisVar);
                    int i11 = zzgisVar.zza;
                    zzgks zzE = zzE(i9);
                    if (zzE != null && !zzE.zza(i11)) {
                        zzd(obj).zzh(i4, Long.valueOf(i11));
                    } else {
                        unsafe.putObject(obj, j2, Integer.valueOf(i11));
                        unsafe.putInt(obj, j3, i5);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i6 == 0) {
                    int zzj4 = zzgit.zzj(bArr, i2, zzgisVar);
                    unsafe.putObject(obj, j2, Integer.valueOf(zzgjo.zzF(zzgisVar.zza)));
                    unsafe.putInt(obj, j3, i5);
                    return zzj4;
                }
                break;
            case 67:
                if (i6 == 0) {
                    int zzm3 = zzgit.zzm(bArr, i2, zzgisVar);
                    unsafe.putObject(obj, j2, Long.valueOf(zzgjo.zzG(zzgisVar.zzb)));
                    unsafe.putInt(obj, j3, i5);
                    return zzm3;
                }
                break;
            case 68:
                if (i6 == 3) {
                    int zzc = zzgit.zzc(zzF(i9), bArr, i2, i3, (i4 & (-8)) | 4, zzgisVar);
                    Object object2 = unsafe.getInt(obj, j3) == i5 ? unsafe.getObject(obj, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j2, zzgisVar.zzc);
                    } else {
                        unsafe.putObject(obj, j2, zzgky.zzg(object2, zzgisVar.zzc));
                    }
                    unsafe.putInt(obj, j3, i5);
                    return zzc;
                }
                break;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02e7, code lost:
        if (r0 != r5) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e9, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r1 = r20;
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x032e, code lost:
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0351, code lost:
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzv(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.zzgis r35) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmb.zzv(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzgis):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzw(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.zzgis r29) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmb.zzw(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzgis):int");
    }

    private final int zzx(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzA(i2, 0);
    }

    private final int zzy(int i2, int i3) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzA(i2, i3);
    }

    private final int zzz(int i2) {
        return this.zzc[i2 + 2];
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final int zza(Object obj) {
        return this.zzj ? zzr(obj) : zzq(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final int zzb(Object obj) {
        int i2;
        int zzc;
        int i3;
        int zzs;
        int length = this.zzc.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int zzC = zzC(i5);
            int i6 = this.zzc[i5];
            long j2 = 1048575 & zzC;
            int i7 = 37;
            switch (zzB(zzC)) {
                case 0:
                    i2 = i4 * 53;
                    zzc = zzgky.zzc(Double.doubleToLongBits(zzgns.zzb(obj, j2)));
                    i4 = zzc + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    zzc = Float.floatToIntBits(zzgns.zzc(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    zzc = zzgky.zzc(zzgns.zzf(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    zzc = zzgky.zzc(zzgns.zzf(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 4:
                    i2 = i4 * 53;
                    zzc = zzgns.zzd(obj, j2);
                    i4 = zzc + i2;
                    break;
                case 5:
                    i2 = i4 * 53;
                    zzc = zzgky.zzc(zzgns.zzf(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 6:
                    i2 = i4 * 53;
                    zzc = zzgns.zzd(obj, j2);
                    i4 = zzc + i2;
                    break;
                case 7:
                    i2 = i4 * 53;
                    zzc = zzgky.zza(zzgns.zzz(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    zzc = ((String) zzgns.zzh(obj, j2)).hashCode();
                    i4 = zzc + i2;
                    break;
                case 9:
                    Object zzh = zzgns.zzh(obj, j2);
                    if (zzh != null) {
                        i7 = zzh.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 10:
                    i2 = i4 * 53;
                    zzc = zzgns.zzh(obj, j2).hashCode();
                    i4 = zzc + i2;
                    break;
                case 11:
                    i2 = i4 * 53;
                    zzc = zzgns.zzd(obj, j2);
                    i4 = zzc + i2;
                    break;
                case 12:
                    i2 = i4 * 53;
                    zzc = zzgns.zzd(obj, j2);
                    i4 = zzc + i2;
                    break;
                case 13:
                    i2 = i4 * 53;
                    zzc = zzgns.zzd(obj, j2);
                    i4 = zzc + i2;
                    break;
                case 14:
                    i2 = i4 * 53;
                    zzc = zzgky.zzc(zzgns.zzf(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 15:
                    i2 = i4 * 53;
                    zzc = zzgns.zzd(obj, j2);
                    i4 = zzc + i2;
                    break;
                case 16:
                    i2 = i4 * 53;
                    zzc = zzgky.zzc(zzgns.zzf(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 17:
                    Object zzh2 = zzgns.zzh(obj, j2);
                    if (zzh2 != null) {
                        i7 = zzh2.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i4 * 53;
                    zzc = zzgns.zzh(obj, j2).hashCode();
                    i4 = zzc + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    zzc = zzgns.zzh(obj, j2).hashCode();
                    i4 = zzc + i2;
                    break;
                case 51:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzgky.zzc(Double.doubleToLongBits(zzo(obj, j2)));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = Float.floatToIntBits(zzp(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzgky.zzc(zzD(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzgky.zzc(zzD(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzs = zzs(obj, j2);
                        i4 = i3 + zzs;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzgky.zzc(zzD(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzs = zzs(obj, j2);
                        i4 = i3 + zzs;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzgky.zza(zzU(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = ((String) zzgns.zzh(obj, j2)).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzgns.zzh(obj, j2).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzgns.zzh(obj, j2).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzs = zzs(obj, j2);
                        i4 = i3 + zzs;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzs = zzs(obj, j2);
                        i4 = i3 + zzs;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzs = zzs(obj, j2);
                        i4 = i3 + zzs;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzgky.zzc(zzD(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzs = zzs(obj, j2);
                        i4 = i3 + zzs;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzgky.zzc(zzD(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzgns.zzh(obj, j2).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzo.zzd(obj).hashCode() + (i4 * 53);
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return hashCode;
    }

    public final int zzc(Object obj, byte[] bArr, int i2, int i3, int i4, zzgis zzgisVar) {
        Unsafe unsafe;
        int i5;
        Object obj2;
        zzgmb<T> zzgmbVar;
        Object obj3;
        int i6;
        int i7;
        int i8;
        int zzx;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Object obj4;
        zzgis zzgisVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int zzm;
        int i21;
        int i22;
        int i23;
        int i24;
        zzgmb<T> zzgmbVar2 = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i25 = i3;
        int i26 = i4;
        zzgis zzgisVar3 = zzgisVar;
        Unsafe unsafe2 = zzb;
        int i27 = i2;
        int i28 = 0;
        int i29 = -1;
        int i30 = 0;
        int i31 = 0;
        int i32 = 1048575;
        while (true) {
            if (i27 < i25) {
                int i33 = i27 + 1;
                byte b = bArr2[i27];
                if (b < 0) {
                    i8 = zzgit.zzk(b, bArr2, i33, zzgisVar3);
                    i7 = zzgisVar3.zza;
                } else {
                    i7 = b;
                    i8 = i33;
                }
                int i34 = i7 >>> 3;
                int i35 = i7 & 7;
                if (i34 > i29) {
                    zzx = zzgmbVar2.zzy(i34, i30 / 3);
                } else {
                    zzx = zzgmbVar2.zzx(i34);
                }
                if (zzx == -1) {
                    i9 = i8;
                    i10 = i7;
                    i11 = i31;
                    i12 = i34;
                    unsafe = unsafe2;
                    i5 = i26;
                    i13 = 0;
                } else {
                    int[] iArr = zzgmbVar2.zzc;
                    int i36 = iArr[zzx + 1];
                    int zzB = zzB(i36);
                    int i37 = i7;
                    int i38 = i8;
                    long j2 = i36 & 1048575;
                    if (zzB <= 17) {
                        int i39 = iArr[zzx + 2];
                        int i40 = 1 << (i39 >>> 20);
                        int i41 = i39 & 1048575;
                        if (i41 != i32) {
                            i15 = zzx;
                            if (i32 != 1048575) {
                                unsafe2.putInt(obj5, i32, i31);
                            }
                            i31 = unsafe2.getInt(obj5, i41);
                            i16 = i41;
                        } else {
                            i15 = zzx;
                            i16 = i32;
                        }
                        int i42 = i31;
                        switch (zzB) {
                            case 0:
                                i17 = i37;
                                i18 = i38;
                                i19 = i34;
                                i20 = i15;
                                if (i35 != 1) {
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    zzgns.zzr(obj5, j2, Double.longBitsToDouble(zzgit.zzn(bArr2, i18)));
                                    i27 = i18 + 8;
                                    i31 = i42 | i40;
                                    i30 = i20;
                                    i28 = i17;
                                    i29 = i19;
                                    i32 = i16;
                                    i26 = i4;
                                }
                            case 1:
                                i17 = i37;
                                i18 = i38;
                                i19 = i34;
                                i20 = i15;
                                if (i35 != 5) {
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    zzgns.zzs(obj5, j2, Float.intBitsToFloat(zzgit.zzb(bArr2, i18)));
                                    i27 = i18 + 4;
                                    i31 = i42 | i40;
                                    i30 = i20;
                                    i28 = i17;
                                    i29 = i19;
                                    i32 = i16;
                                    i26 = i4;
                                }
                            case 2:
                            case 3:
                                i17 = i37;
                                i18 = i38;
                                i19 = i34;
                                i20 = i15;
                                if (i35 != 0) {
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    zzm = zzgit.zzm(bArr2, i18, zzgisVar3);
                                    unsafe2.putLong(obj, j2, zzgisVar3.zzb);
                                    i31 = i42 | i40;
                                    i30 = i20;
                                    i27 = zzm;
                                    i28 = i17;
                                    i29 = i19;
                                    i32 = i16;
                                    i26 = i4;
                                }
                            case 4:
                            case 11:
                                i17 = i37;
                                i18 = i38;
                                i19 = i34;
                                i20 = i15;
                                if (i35 != 0) {
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    i27 = zzgit.zzj(bArr2, i18, zzgisVar3);
                                    unsafe2.putInt(obj5, j2, zzgisVar3.zza);
                                    i31 = i42 | i40;
                                    i30 = i20;
                                    i28 = i17;
                                    i29 = i19;
                                    i32 = i16;
                                    i26 = i4;
                                }
                            case 5:
                            case 14:
                                i17 = i37;
                                i21 = i38;
                                i19 = i34;
                                i20 = i15;
                                if (i35 != 1) {
                                    i18 = i21;
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, j2, zzgit.zzn(bArr2, i21));
                                    i27 = i21 + 8;
                                    i31 = i42 | i40;
                                    i30 = i20;
                                    i28 = i17;
                                    i29 = i19;
                                    i32 = i16;
                                    i26 = i4;
                                }
                            case 6:
                            case 13:
                                i17 = i37;
                                i21 = i38;
                                i19 = i34;
                                i20 = i15;
                                if (i35 != 5) {
                                    i18 = i21;
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    unsafe2.putInt(obj5, j2, zzgit.zzb(bArr2, i21));
                                    i27 = i21 + 4;
                                    i31 = i42 | i40;
                                    i30 = i20;
                                    i28 = i17;
                                    i29 = i19;
                                    i32 = i16;
                                    i26 = i4;
                                }
                            case 7:
                                i17 = i37;
                                i21 = i38;
                                i19 = i34;
                                i20 = i15;
                                if (i35 != 0) {
                                    i18 = i21;
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    i27 = zzgit.zzm(bArr2, i21, zzgisVar3);
                                    zzgns.zzp(obj5, j2, zzgisVar3.zzb != 0);
                                    i31 = i42 | i40;
                                    i30 = i20;
                                    i28 = i17;
                                    i29 = i19;
                                    i32 = i16;
                                    i26 = i4;
                                }
                            case 8:
                                i17 = i37;
                                i21 = i38;
                                i19 = i34;
                                i20 = i15;
                                if (i35 != 2) {
                                    i18 = i21;
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    if ((536870912 & i36) == 0) {
                                        i27 = zzgit.zzg(bArr2, i21, zzgisVar3);
                                    } else {
                                        i27 = zzgit.zzh(bArr2, i21, zzgisVar3);
                                    }
                                    unsafe2.putObject(obj5, j2, zzgisVar3.zzc);
                                    i31 = i42 | i40;
                                    i30 = i20;
                                    i28 = i17;
                                    i29 = i19;
                                    i32 = i16;
                                    i26 = i4;
                                }
                            case 9:
                                i17 = i37;
                                i21 = i38;
                                i19 = i34;
                                i20 = i15;
                                if (i35 != 2) {
                                    i18 = i21;
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    i27 = zzgit.zzd(zzgmbVar2.zzF(i20), bArr2, i21, i25, zzgisVar3);
                                    if ((i42 & i40) == 0) {
                                        unsafe2.putObject(obj5, j2, zzgisVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j2, zzgky.zzg(unsafe2.getObject(obj5, j2), zzgisVar3.zzc));
                                    }
                                    i31 = i42 | i40;
                                    i30 = i20;
                                    i28 = i17;
                                    i29 = i19;
                                    i32 = i16;
                                    i26 = i4;
                                }
                            case 10:
                                i17 = i37;
                                i21 = i38;
                                i19 = i34;
                                i20 = i15;
                                if (i35 != 2) {
                                    i18 = i21;
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    i27 = zzgit.zza(bArr2, i21, zzgisVar3);
                                    unsafe2.putObject(obj5, j2, zzgisVar3.zzc);
                                    i31 = i42 | i40;
                                    i30 = i20;
                                    i28 = i17;
                                    i29 = i19;
                                    i32 = i16;
                                    i26 = i4;
                                }
                            case 12:
                                i17 = i37;
                                i21 = i38;
                                i19 = i34;
                                i20 = i15;
                                if (i35 != 0) {
                                    i18 = i21;
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    i27 = zzgit.zzj(bArr2, i21, zzgisVar3);
                                    int i43 = zzgisVar3.zza;
                                    zzgks zzE = zzgmbVar2.zzE(i20);
                                    if (zzE != null && !zzE.zza(i43)) {
                                        zzd(obj).zzh(i17, Long.valueOf(i43));
                                        i31 = i42;
                                        i30 = i20;
                                        i28 = i17;
                                        i29 = i19;
                                        i32 = i16;
                                        i26 = i4;
                                    } else {
                                        unsafe2.putInt(obj5, j2, i43);
                                        i31 = i42 | i40;
                                        i30 = i20;
                                        i28 = i17;
                                        i29 = i19;
                                        i32 = i16;
                                        i26 = i4;
                                    }
                                }
                                break;
                            case 15:
                                i17 = i37;
                                i21 = i38;
                                i19 = i34;
                                i20 = i15;
                                if (i35 != 0) {
                                    i18 = i21;
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    i27 = zzgit.zzj(bArr2, i21, zzgisVar3);
                                    unsafe2.putInt(obj5, j2, zzgjo.zzF(zzgisVar3.zza));
                                    i31 = i42 | i40;
                                    i30 = i20;
                                    i28 = i17;
                                    i29 = i19;
                                    i32 = i16;
                                    i26 = i4;
                                }
                            case 16:
                                if (i35 != 0) {
                                    i17 = i37;
                                    i19 = i34;
                                    i20 = i15;
                                    i18 = i38;
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    zzm = zzgit.zzm(bArr2, i38, zzgisVar3);
                                    i17 = i37;
                                    i19 = i34;
                                    i20 = i15;
                                    unsafe2.putLong(obj, j2, zzgjo.zzG(zzgisVar3.zzb));
                                    i31 = i42 | i40;
                                    i30 = i20;
                                    i27 = zzm;
                                    i28 = i17;
                                    i29 = i19;
                                    i32 = i16;
                                    i26 = i4;
                                }
                            default:
                                i17 = i37;
                                i18 = i38;
                                i19 = i34;
                                i20 = i15;
                                if (i35 != 3) {
                                    i9 = i18;
                                    i11 = i42;
                                    i13 = i20;
                                    unsafe = unsafe2;
                                    i10 = i17;
                                    i12 = i19;
                                    i32 = i16;
                                    i5 = i4;
                                    break;
                                } else {
                                    i27 = zzgit.zzc(zzgmbVar2.zzF(i20), bArr, i18, i3, (i19 << 3) | 4, zzgisVar);
                                    if ((i42 & i40) == 0) {
                                        unsafe2.putObject(obj5, j2, zzgisVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j2, zzgky.zzg(unsafe2.getObject(obj5, j2), zzgisVar3.zzc));
                                    }
                                    i31 = i42 | i40;
                                    bArr2 = bArr;
                                    i25 = i3;
                                    i30 = i20;
                                    i28 = i17;
                                    i29 = i19;
                                    i32 = i16;
                                    i26 = i4;
                                }
                        }
                    } else {
                        int i44 = zzx;
                        if (zzB != 27) {
                            i11 = i31;
                            i22 = i32;
                            if (zzB <= 49) {
                                i24 = i37;
                                i13 = i44;
                                i12 = i34;
                                unsafe = unsafe2;
                                i27 = zzw(obj, bArr, i38, i3, i37, i34, i35, i13, i36, zzB, j2, zzgisVar);
                                if (i27 != i38) {
                                    zzgmbVar2 = this;
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    i28 = i24;
                                    i25 = i3;
                                    i26 = i4;
                                    zzgisVar3 = zzgisVar;
                                    i30 = i13;
                                    i31 = i11;
                                    i29 = i12;
                                    i32 = i22;
                                    unsafe2 = unsafe;
                                } else {
                                    i10 = i24;
                                    i5 = i4;
                                    i9 = i27;
                                    i32 = i22;
                                }
                            } else {
                                i23 = i38;
                                i24 = i37;
                                i13 = i44;
                                unsafe = unsafe2;
                                i12 = i34;
                                if (zzB != 50) {
                                    i27 = zzu(obj, bArr, i23, i3, i24, i12, i35, i36, zzB, j2, i13, zzgisVar);
                                    if (i27 != i23) {
                                        zzgmbVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i28 = i24;
                                        i25 = i3;
                                        i26 = i4;
                                        zzgisVar3 = zzgisVar;
                                        i30 = i13;
                                        i31 = i11;
                                        i29 = i12;
                                        i32 = i22;
                                        unsafe2 = unsafe;
                                    } else {
                                        i10 = i24;
                                        i5 = i4;
                                        i9 = i27;
                                        i32 = i22;
                                    }
                                } else if (i35 == 2) {
                                    i27 = zzt(obj, bArr, i23, i3, i13, j2, zzgisVar);
                                    if (i27 != i23) {
                                        zzgmbVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i28 = i24;
                                        i25 = i3;
                                        i26 = i4;
                                        zzgisVar3 = zzgisVar;
                                        i30 = i13;
                                        i31 = i11;
                                        i29 = i12;
                                        i32 = i22;
                                        unsafe2 = unsafe;
                                    } else {
                                        i10 = i24;
                                        i5 = i4;
                                        i9 = i27;
                                        i32 = i22;
                                    }
                                }
                            }
                        } else if (i35 == 2) {
                            zzgkx zzgkxVar = (zzgkx) unsafe2.getObject(obj5, j2);
                            if (!zzgkxVar.zzc()) {
                                int size = zzgkxVar.size();
                                zzgkxVar = zzgkxVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj5, j2, zzgkxVar);
                            }
                            i16 = i32;
                            i27 = zzgit.zze(zzgmbVar2.zzF(i44), i37, bArr, i38, i3, zzgkxVar, zzgisVar);
                            bArr2 = bArr;
                            i25 = i3;
                            i30 = i44;
                            i28 = i37;
                            i29 = i34;
                            i31 = i31;
                            i32 = i16;
                            i26 = i4;
                        } else {
                            i11 = i31;
                            i22 = i32;
                            i23 = i38;
                            i24 = i37;
                            i13 = i44;
                            unsafe = unsafe2;
                            i12 = i34;
                        }
                        i10 = i24;
                        i5 = i4;
                        i9 = i23;
                        i32 = i22;
                    }
                }
                if (i10 != i5 || i5 == 0) {
                    if (this.zzh) {
                        zzgisVar2 = zzgisVar;
                        if (zzgisVar2.zzd != zzgka.zza()) {
                            i14 = i12;
                            if (zzgisVar2.zzd.zzc(this.zzg, i14) == null) {
                                i27 = zzgit.zzi(i10, bArr, i9, i3, zzd(obj), zzgisVar);
                                obj4 = obj;
                                i25 = i3;
                                i28 = i10;
                                zzgmbVar2 = this;
                                zzgisVar3 = zzgisVar2;
                                i29 = i14;
                                obj5 = obj4;
                                i30 = i13;
                                i31 = i11;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i26 = i5;
                            } else {
                                zzgkl zzgklVar = (zzgkl) obj;
                                throw null;
                            }
                        } else {
                            obj4 = obj;
                        }
                    } else {
                        obj4 = obj;
                        zzgisVar2 = zzgisVar;
                    }
                    i14 = i12;
                    i27 = zzgit.zzi(i10, bArr, i9, i3, zzd(obj), zzgisVar);
                    i25 = i3;
                    i28 = i10;
                    zzgmbVar2 = this;
                    zzgisVar3 = zzgisVar2;
                    i29 = i14;
                    obj5 = obj4;
                    i30 = i13;
                    i31 = i11;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i26 = i5;
                } else {
                    i6 = 1048575;
                    zzgmbVar = this;
                    obj2 = obj;
                    i27 = i9;
                    i28 = i10;
                    i31 = i11;
                    obj3 = null;
                }
            } else {
                unsafe = unsafe2;
                i5 = i26;
                obj2 = obj5;
                zzgmbVar = zzgmbVar2;
                obj3 = null;
                i6 = 1048575;
            }
        }
        if (i32 != i6) {
            unsafe.putInt(obj2, i32, i31);
        }
        for (int i45 = zzgmbVar.zzl; i45 < zzgmbVar.zzm; i45++) {
            zzgmbVar.zzG(obj2, zzgmbVar.zzk[i45], obj3, zzgmbVar.zzo);
        }
        if (i5 == 0) {
            if (i27 != i3) {
                throw zzgla.zzg();
            }
        } else if (i27 > i3 || i28 != i5) {
            throw zzgla.zzg();
        }
        return i27;
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final Object zze() {
        return ((zzgko) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzf(Object obj) {
        int i2;
        int i3 = this.zzl;
        while (true) {
            i2 = this.zzm;
            if (i3 >= i2) {
                break;
            }
            long zzC = zzC(this.zzk[i3]) & 1048575;
            Object zzh = zzgns.zzh(obj, zzC);
            if (zzh != null) {
                ((zzgls) zzh).zzc();
                zzgns.zzv(obj, zzC, zzh);
            }
            i3++;
        }
        int length = this.zzk.length;
        while (i2 < length) {
            this.zzn.zzb(obj, this.zzk[i2]);
            i2++;
        }
        this.zzo.zzm(obj);
        if (this.zzh) {
            this.zzp.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzg(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzC = zzC(i2);
            long j2 = 1048575 & zzC;
            int i3 = this.zzc[i2];
            switch (zzB(zzC)) {
                case 0:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzr(obj, j2, zzgns.zzb(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzs(obj, j2, zzgns.zzc(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzu(obj, j2, zzgns.zzf(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzu(obj, j2, zzgns.zzf(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzt(obj, j2, zzgns.zzd(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzu(obj, j2, zzgns.zzf(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzt(obj, j2, zzgns.zzd(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzp(obj, j2, zzgns.zzz(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzv(obj, j2, zzgns.zzh(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i2);
                    break;
                case 10:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzv(obj, j2, zzgns.zzh(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzt(obj, j2, zzgns.zzd(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzt(obj, j2, zzgns.zzd(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzt(obj, j2, zzgns.zzd(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzu(obj, j2, zzgns.zzf(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzt(obj, j2, zzgns.zzd(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj2, i2)) {
                        zzgns.zzu(obj, j2, zzgns.zzf(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzJ(obj, obj2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzn.zzc(obj, obj2, j2);
                    break;
                case 50:
                    zzgmt.zzI(this.zzr, obj, obj2, j2);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzT(obj2, i3, i2)) {
                        zzgns.zzv(obj, j2, zzgns.zzh(obj2, j2));
                        zzN(obj, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzK(obj, obj2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i3, i2)) {
                        zzgns.zzv(obj, j2, zzgns.zzh(obj2, j2));
                        zzN(obj, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzK(obj, obj2, i2);
                    break;
            }
        }
        zzgmt.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzgmt.zzE(this.zzp, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzh(Object obj, zzgmj zzgmjVar, zzgka zzgkaVar) {
        Objects.requireNonNull(zzgkaVar);
        zzgni zzgniVar = this.zzo;
        zzgkb zzgkbVar = this.zzp;
        zzgkf zzgkfVar = null;
        Object obj2 = null;
        while (true) {
            try {
                int zzc = zzgmjVar.zzc();
                int zzx = zzx(zzc);
                if (zzx >= 0) {
                    int zzC = zzC(zzx);
                    try {
                        switch (zzB(zzC)) {
                            case 0:
                                zzgns.zzr(obj, zzC & 1048575, zzgmjVar.zza());
                                zzM(obj, zzx);
                                break;
                            case 1:
                                zzgns.zzs(obj, zzC & 1048575, zzgmjVar.zzb());
                                zzM(obj, zzx);
                                break;
                            case 2:
                                zzgns.zzu(obj, zzC & 1048575, zzgmjVar.zzl());
                                zzM(obj, zzx);
                                break;
                            case 3:
                                zzgns.zzu(obj, zzC & 1048575, zzgmjVar.zzo());
                                zzM(obj, zzx);
                                break;
                            case 4:
                                zzgns.zzt(obj, zzC & 1048575, zzgmjVar.zzg());
                                zzM(obj, zzx);
                                break;
                            case 5:
                                zzgns.zzu(obj, zzC & 1048575, zzgmjVar.zzk());
                                zzM(obj, zzx);
                                break;
                            case 6:
                                zzgns.zzt(obj, zzC & 1048575, zzgmjVar.zzf());
                                zzM(obj, zzx);
                                break;
                            case 7:
                                zzgns.zzp(obj, zzC & 1048575, zzgmjVar.zzN());
                                zzM(obj, zzx);
                                break;
                            case 8:
                                zzL(obj, zzC, zzgmjVar);
                                zzM(obj, zzx);
                                break;
                            case 9:
                                if (zzQ(obj, zzx)) {
                                    long j2 = zzC & 1048575;
                                    zzgns.zzv(obj, j2, zzgky.zzg(zzgns.zzh(obj, j2), zzgmjVar.zzs(zzF(zzx), zzgkaVar)));
                                    break;
                                } else {
                                    zzgns.zzv(obj, zzC & 1048575, zzgmjVar.zzs(zzF(zzx), zzgkaVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 10:
                                zzgns.zzv(obj, zzC & 1048575, zzgmjVar.zzp());
                                zzM(obj, zzx);
                                break;
                            case 11:
                                zzgns.zzt(obj, zzC & 1048575, zzgmjVar.zzj());
                                zzM(obj, zzx);
                                break;
                            case 12:
                                int zze = zzgmjVar.zze();
                                zzgks zzE = zzE(zzx);
                                if (zzE != null && !zzE.zza(zze)) {
                                    obj2 = zzgmt.zzD(zzc, zze, obj2, zzgniVar);
                                    break;
                                }
                                zzgns.zzt(obj, zzC & 1048575, zze);
                                zzM(obj, zzx);
                                break;
                            case 13:
                                zzgns.zzt(obj, zzC & 1048575, zzgmjVar.zzh());
                                zzM(obj, zzx);
                                break;
                            case 14:
                                zzgns.zzu(obj, zzC & 1048575, zzgmjVar.zzm());
                                zzM(obj, zzx);
                                break;
                            case 15:
                                zzgns.zzt(obj, zzC & 1048575, zzgmjVar.zzi());
                                zzM(obj, zzx);
                                break;
                            case 16:
                                zzgns.zzu(obj, zzC & 1048575, zzgmjVar.zzn());
                                zzM(obj, zzx);
                                break;
                            case 17:
                                if (zzQ(obj, zzx)) {
                                    long j3 = zzC & 1048575;
                                    zzgns.zzv(obj, j3, zzgky.zzg(zzgns.zzh(obj, j3), zzgmjVar.zzr(zzF(zzx), zzgkaVar)));
                                    break;
                                } else {
                                    zzgns.zzv(obj, zzC & 1048575, zzgmjVar.zzr(zzF(zzx), zzgkaVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 18:
                                zzgmjVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 19:
                                zzgmjVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 20:
                                zzgmjVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 21:
                                zzgmjVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 22:
                                zzgmjVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 23:
                                zzgmjVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 24:
                                zzgmjVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 25:
                                zzgmjVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 26:
                                if (zzP(zzC)) {
                                    ((zzgjp) zzgmjVar).zzK(this.zzn.zza(obj, zzC & 1048575), true);
                                    break;
                                } else {
                                    ((zzgjp) zzgmjVar).zzK(this.zzn.zza(obj, zzC & 1048575), false);
                                    break;
                                }
                            case 27:
                                zzgmjVar.zzF(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzgkaVar);
                                break;
                            case 28:
                                zzgmjVar.zzw(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 29:
                                zzgmjVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 30:
                                List zza2 = this.zzn.zza(obj, zzC & 1048575);
                                zzgmjVar.zzy(zza2);
                                obj2 = zzgmt.zzC(zzc, zza2, zzE(zzx), obj2, zzgniVar);
                                break;
                            case 31:
                                zzgmjVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 32:
                                zzgmjVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 33:
                                zzgmjVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 34:
                                zzgmjVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 35:
                                zzgmjVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 36:
                                zzgmjVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 37:
                                zzgmjVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 38:
                                zzgmjVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 39:
                                zzgmjVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 40:
                                zzgmjVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 41:
                                zzgmjVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 42:
                                zzgmjVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 43:
                                zzgmjVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 44:
                                List zza3 = this.zzn.zza(obj, zzC & 1048575);
                                zzgmjVar.zzy(zza3);
                                obj2 = zzgmt.zzC(zzc, zza3, zzE(zzx), obj2, zzgniVar);
                                break;
                            case 45:
                                zzgmjVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 46:
                                zzgmjVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 47:
                                zzgmjVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 48:
                                zzgmjVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 49:
                                zzgmjVar.zzC(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzgkaVar);
                                break;
                            case 50:
                                Object zzH = zzH(zzx);
                                long zzC2 = zzC(zzx) & 1048575;
                                Object zzh = zzgns.zzh(obj, zzC2);
                                if (zzh != null) {
                                    if (zzglt.zzb(zzh)) {
                                        Object zzb2 = zzgls.zza().zzb();
                                        zzglt.zzc(zzb2, zzh);
                                        zzgns.zzv(obj, zzC2, zzb2);
                                        zzh = zzb2;
                                    }
                                } else {
                                    zzh = zzgls.zza().zzb();
                                    zzgns.zzv(obj, zzC2, zzh);
                                }
                                zzgls zzglsVar = (zzgls) zzh;
                                zzglr zzglrVar = (zzglr) zzH;
                                throw null;
                                break;
                            case 51:
                                zzgns.zzv(obj, zzC & 1048575, Double.valueOf(zzgmjVar.zza()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 52:
                                zzgns.zzv(obj, zzC & 1048575, Float.valueOf(zzgmjVar.zzb()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 53:
                                zzgns.zzv(obj, zzC & 1048575, Long.valueOf(zzgmjVar.zzl()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 54:
                                zzgns.zzv(obj, zzC & 1048575, Long.valueOf(zzgmjVar.zzo()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 55:
                                zzgns.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmjVar.zzg()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 56:
                                zzgns.zzv(obj, zzC & 1048575, Long.valueOf(zzgmjVar.zzk()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 57:
                                zzgns.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmjVar.zzf()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 58:
                                zzgns.zzv(obj, zzC & 1048575, Boolean.valueOf(zzgmjVar.zzN()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 59:
                                zzL(obj, zzC, zzgmjVar);
                                zzN(obj, zzc, zzx);
                                break;
                            case 60:
                                if (zzT(obj, zzc, zzx)) {
                                    long j4 = zzC & 1048575;
                                    zzgns.zzv(obj, j4, zzgky.zzg(zzgns.zzh(obj, j4), zzgmjVar.zzs(zzF(zzx), zzgkaVar)));
                                } else {
                                    zzgns.zzv(obj, zzC & 1048575, zzgmjVar.zzs(zzF(zzx), zzgkaVar));
                                    zzM(obj, zzx);
                                }
                                zzN(obj, zzc, zzx);
                                break;
                            case 61:
                                zzgns.zzv(obj, zzC & 1048575, zzgmjVar.zzp());
                                zzN(obj, zzc, zzx);
                                break;
                            case 62:
                                zzgns.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmjVar.zzj()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 63:
                                int zze2 = zzgmjVar.zze();
                                zzgks zzE2 = zzE(zzx);
                                if (zzE2 != null && !zzE2.zza(zze2)) {
                                    obj2 = zzgmt.zzD(zzc, zze2, obj2, zzgniVar);
                                    break;
                                }
                                zzgns.zzv(obj, zzC & 1048575, Integer.valueOf(zze2));
                                zzN(obj, zzc, zzx);
                                break;
                            case 64:
                                zzgns.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmjVar.zzh()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 65:
                                zzgns.zzv(obj, zzC & 1048575, Long.valueOf(zzgmjVar.zzm()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 66:
                                zzgns.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmjVar.zzi()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 67:
                                zzgns.zzv(obj, zzC & 1048575, Long.valueOf(zzgmjVar.zzn()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 68:
                                zzgns.zzv(obj, zzC & 1048575, zzgmjVar.zzr(zzF(zzx), zzgkaVar));
                                zzN(obj, zzc, zzx);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = zzgniVar.zzf();
                                }
                                if (!zzgniVar.zzp(obj2, zzgmjVar)) {
                                    for (int i2 = this.zzl; i2 < this.zzm; i2++) {
                                        obj2 = zzG(obj, this.zzk[i2], obj2, zzgniVar);
                                    }
                                    if (obj2 != null) {
                                        zzgniVar.zzn(obj, obj2);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzgkz unused) {
                        zzgniVar.zzq(zzgmjVar);
                        if (obj2 == null) {
                            obj2 = zzgniVar.zzc(obj);
                        }
                        if (!zzgniVar.zzp(obj2, zzgmjVar)) {
                            for (int i3 = this.zzl; i3 < this.zzm; i3++) {
                                obj2 = zzG(obj, this.zzk[i3], obj2, zzgniVar);
                            }
                            if (obj2 != null) {
                                zzgniVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                        obj2 = zzG(obj, this.zzk[i4], obj2, zzgniVar);
                    }
                    if (obj2 != null) {
                        zzgniVar.zzn(obj, obj2);
                        return;
                    }
                    return;
                } else {
                    Object zzc2 = !this.zzh ? null : zzgkbVar.zzc(zzgkaVar, this.zzg, zzc);
                    if (zzc2 != null) {
                        if (zzgkfVar == null) {
                            zzgkfVar = zzgkbVar.zzb(obj);
                        }
                        zzgkf zzgkfVar2 = zzgkfVar;
                        obj2 = zzgkbVar.zzd(zzgmjVar, zzc2, zzgkaVar, zzgkfVar2, obj2, zzgniVar);
                        zzgkfVar = zzgkfVar2;
                    } else {
                        zzgniVar.zzq(zzgmjVar);
                        if (obj2 == null) {
                            obj2 = zzgniVar.zzc(obj);
                        }
                        if (!zzgniVar.zzp(obj2, zzgmjVar)) {
                            for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                                obj2 = zzG(obj, this.zzk[i5], obj2, zzgniVar);
                            }
                            if (obj2 != null) {
                                zzgniVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i6 = this.zzl; i6 < this.zzm; i6++) {
                    obj2 = zzG(obj, this.zzk[i6], obj2, zzgniVar);
                }
                if (obj2 != null) {
                    zzgniVar.zzn(obj, obj2);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzi(Object obj, byte[] bArr, int i2, int i3, zzgis zzgisVar) {
        if (this.zzj) {
            zzv(obj, bArr, i2, i3, zzgisVar);
        } else {
            zzc(obj, bArr, i2, i3, 0, zzgisVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzH;
        int length = this.zzc.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int zzC = zzC(i2);
            long j2 = zzC & 1048575;
            switch (zzB(zzC)) {
                case 0:
                    if (zzO(obj, obj2, i2) && Double.doubleToLongBits(zzgns.zzb(obj, j2)) == Double.doubleToLongBits(zzgns.zzb(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i2) && Float.floatToIntBits(zzgns.zzc(obj, j2)) == Float.floatToIntBits(zzgns.zzc(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i2) && zzgns.zzf(obj, j2) == zzgns.zzf(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i2) && zzgns.zzf(obj, j2) == zzgns.zzf(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i2) && zzgns.zzd(obj, j2) == zzgns.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i2) && zzgns.zzf(obj, j2) == zzgns.zzf(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i2) && zzgns.zzd(obj, j2) == zzgns.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i2) && zzgns.zzz(obj, j2) == zzgns.zzz(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i2) && zzgmt.zzH(zzgns.zzh(obj, j2), zzgns.zzh(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i2) && zzgmt.zzH(zzgns.zzh(obj, j2), zzgns.zzh(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i2) && zzgmt.zzH(zzgns.zzh(obj, j2), zzgns.zzh(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i2) && zzgns.zzd(obj, j2) == zzgns.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i2) && zzgns.zzd(obj, j2) == zzgns.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i2) && zzgns.zzd(obj, j2) == zzgns.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i2) && zzgns.zzf(obj, j2) == zzgns.zzf(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i2) && zzgns.zzd(obj, j2) == zzgns.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i2) && zzgns.zzf(obj, j2) == zzgns.zzf(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i2) && zzgmt.zzH(zzgns.zzh(obj, j2), zzgns.zzh(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzH = zzgmt.zzH(zzgns.zzh(obj, j2), zzgns.zzh(obj2, j2));
                    break;
                case 50:
                    zzH = zzgmt.zzH(zzgns.zzh(obj, j2), zzgns.zzh(obj2, j2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzz = zzz(i2) & 1048575;
                    if (zzgns.zzd(obj, zzz) == zzgns.zzd(obj2, zzz) && zzgmt.zzH(zzgns.zzh(obj, j2), zzgns.zzh(obj2, j2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
                return false;
            }
        }
        if (this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            if (this.zzh) {
                this.zzp.zza(obj);
                this.zzp.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final boolean zzk(Object obj) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzl) {
            int i7 = this.zzk[i6];
            int i8 = this.zzc[i7];
            int zzC = zzC(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                i2 = i4;
                i3 = i5;
            }
            if ((268435456 & zzC) != 0 && !zzR(obj, i7, i2, i3, i11)) {
                return false;
            }
            int zzB = zzB(zzC);
            if (zzB != 9 && zzB != 17) {
                if (zzB != 27) {
                    if (zzB == 60 || zzB == 68) {
                        if (zzT(obj, i8, i7) && !zzS(obj, zzC, zzF(i7))) {
                            return false;
                        }
                    } else if (zzB != 49) {
                        if (zzB == 50 && !((zzgls) zzgns.zzh(obj, zzC & 1048575)).isEmpty()) {
                            zzglr zzglrVar = (zzglr) zzH(i7);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgns.zzh(obj, zzC & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgmr zzF = zzF(i7);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzF.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzR(obj, i7, i2, i3, i11) && !zzS(obj, zzC, zzF(i7))) {
                return false;
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgmr
    public final void zzn(Object obj, zzgjw zzgjwVar) {
        if (!this.zzj) {
            zzV(obj, zzgjwVar);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int zzC = zzC(i2);
                int i3 = this.zzc[i2];
                switch (zzB(zzC)) {
                    case 0:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzf(i3, zzgns.zzb(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzo(i3, zzgns.zzc(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzt(i3, zzgns.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzJ(i3, zzgns.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzr(i3, zzgns.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzm(i3, zzgns.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzk(i3, zzgns.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzb(i3, zzgns.zzz(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzQ(obj, i2)) {
                            zzX(i3, zzgns.zzh(obj, zzC & 1048575), zzgjwVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzv(i3, zzgns.zzh(obj, zzC & 1048575), zzF(i2));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzd(i3, (zzgjg) zzgns.zzh(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzH(i3, zzgns.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzi(i3, zzgns.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzw(i3, zzgns.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzy(i3, zzgns.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzA(i3, zzgns.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzC(i3, zzgns.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzQ(obj, i2)) {
                            zzgjwVar.zzq(i3, zzgns.zzh(obj, zzC & 1048575), zzF(i2));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzgmt.zzL(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 19:
                        zzgmt.zzP(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 20:
                        zzgmt.zzS(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 21:
                        zzgmt.zzaa(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 22:
                        zzgmt.zzR(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 23:
                        zzgmt.zzO(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 24:
                        zzgmt.zzN(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 25:
                        zzgmt.zzJ(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 26:
                        zzgmt.zzY(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar);
                        break;
                    case 27:
                        zzgmt.zzT(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, zzF(i2));
                        break;
                    case 28:
                        zzgmt.zzK(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar);
                        break;
                    case 29:
                        zzgmt.zzZ(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 30:
                        zzgmt.zzM(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 31:
                        zzgmt.zzU(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 32:
                        zzgmt.zzV(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 33:
                        zzgmt.zzW(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 34:
                        zzgmt.zzX(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, false);
                        break;
                    case 35:
                        zzgmt.zzL(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 36:
                        zzgmt.zzP(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 37:
                        zzgmt.zzS(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 38:
                        zzgmt.zzaa(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 39:
                        zzgmt.zzR(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 40:
                        zzgmt.zzO(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 41:
                        zzgmt.zzN(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 42:
                        zzgmt.zzJ(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 43:
                        zzgmt.zzZ(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 44:
                        zzgmt.zzM(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 45:
                        zzgmt.zzU(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 46:
                        zzgmt.zzV(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 47:
                        zzgmt.zzW(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 48:
                        zzgmt.zzX(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, true);
                        break;
                    case 49:
                        zzgmt.zzQ(i3, (List) zzgns.zzh(obj, zzC & 1048575), zzgjwVar, zzF(i2));
                        break;
                    case 50:
                        zzW(zzgjwVar, i3, zzgns.zzh(obj, zzC & 1048575), i2);
                        break;
                    case 51:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzf(i3, zzo(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzo(i3, zzp(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzt(i3, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzJ(i3, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzr(i3, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzm(i3, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzk(i3, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzb(i3, zzU(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i3, i2)) {
                            zzX(i3, zzgns.zzh(obj, zzC & 1048575), zzgjwVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzv(i3, zzgns.zzh(obj, zzC & 1048575), zzF(i2));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzd(i3, (zzgjg) zzgns.zzh(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzH(i3, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzi(i3, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzw(i3, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzy(i3, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzA(i3, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzC(i3, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i3, i2)) {
                            zzgjwVar.zzq(i3, zzgns.zzh(obj, zzC & 1048575), zzF(i2));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzgni zzgniVar = this.zzo;
            zzgniVar.zzr(zzgniVar.zzd(obj), zzgjwVar);
        } else {
            this.zzp.zza(obj);
            throw null;
        }
    }
}
