package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import f.a.b.a.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzlp<T> implements zzlx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmy.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzla zzm;
    private final zzmo zzn;
    private final zzjs zzo;
    private final zzlr zzp;
    private final zzlh zzq;

    private zzlp(int[] iArr, Object[] objArr, int i2, int i3, zzlm zzlmVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzi = z;
        boolean z3 = false;
        if (zzjsVar != null && zzjsVar.zzc(zzlmVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzp = zzlrVar;
        this.zzm = zzlaVar;
        this.zzn = zzmoVar;
        this.zzo = zzjsVar;
        this.zzg = zzlmVar;
        this.zzq = zzlhVar;
    }

    private static int zzA(int i2) {
        return (i2 >>> 20) & 255;
    }

    private final int zzB(int i2) {
        return this.zzc[i2 + 1];
    }

    private static long zzC(Object obj, long j2) {
        return ((Long) zzmy.zzf(obj, j2)).longValue();
    }

    private final zzkj zzD(int i2) {
        int i3 = i2 / 3;
        return (zzkj) this.zzd[i3 + i3 + 1];
    }

    private final zzlx zzE(int i2) {
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzlx zzlxVar = (zzlx) this.zzd[i4];
        if (zzlxVar != null) {
            return zzlxVar;
        }
        zzlx zzb2 = zzlu.zza().zzb((Class) this.zzd[i4 + 1]);
        this.zzd[i4] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    private final Object zzG(Object obj, int i2) {
        zzlx zzE = zzE(i2);
        long zzB = zzB(i2) & 1048575;
        if (!zzT(obj, i2)) {
            return zzE.zze();
        }
        Object object = zzb.getObject(obj, zzB);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzE.zze();
        if (object != null) {
            zzE.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzH(Object obj, int i2, int i3) {
        zzlx zzE = zzE(i3);
        if (!zzX(obj, i2, i3)) {
            return zzE.zze();
        }
        Object object = zzb.getObject(obj, zzB(i3) & 1048575);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzE.zze();
        if (object != null) {
            zzE.zzg(zze, object);
        }
        return zze;
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

    private static void zzJ(Object obj) {
        if (!zzW(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzK(Object obj, Object obj2, int i2) {
        if (zzT(obj2, i2)) {
            long zzB = zzB(i2) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, zzB);
            if (object != null) {
                zzlx zzE = zzE(i2);
                if (!zzT(obj, i2)) {
                    if (!zzW(object)) {
                        unsafe.putObject(obj, zzB, object);
                    } else {
                        Object zze = zzE.zze();
                        zzE.zzg(zze, object);
                        unsafe.putObject(obj, zzB, zze);
                    }
                    zzM(obj, i2);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzB);
                if (!zzW(object2)) {
                    Object zze2 = zzE.zze();
                    zzE.zzg(zze2, object2);
                    unsafe.putObject(obj, zzB, zze2);
                    object2 = zze2;
                }
                zzE.zzg(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
        }
    }

    private final void zzL(Object obj, Object obj2, int i2) {
        int i3 = this.zzc[i2];
        if (zzX(obj2, i3, i2)) {
            long zzB = zzB(i2) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, zzB);
            if (object != null) {
                zzlx zzE = zzE(i2);
                if (!zzX(obj, i3, i2)) {
                    if (!zzW(object)) {
                        unsafe.putObject(obj, zzB, object);
                    } else {
                        Object zze = zzE.zze();
                        zzE.zzg(zze, object);
                        unsafe.putObject(obj, zzB, zze);
                    }
                    zzN(obj, i3, i2);
                    return;
                }
                Object object2 = unsafe.getObject(obj, zzB);
                if (!zzW(object2)) {
                    Object zze2 = zzE.zze();
                    zzE.zzg(zze2, object2);
                    unsafe.putObject(obj, zzB, zze2);
                    object2 = zze2;
                }
                zzE.zzg(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
        }
    }

    private final void zzM(Object obj, int i2) {
        int zzy = zzy(i2);
        long j2 = 1048575 & zzy;
        if (j2 == 1048575) {
            return;
        }
        zzmy.zzq(obj, j2, (1 << (zzy >>> 20)) | zzmy.zzc(obj, j2));
    }

    private final void zzN(Object obj, int i2, int i3) {
        zzmy.zzq(obj, zzy(i3) & 1048575, i2);
    }

    private final void zzO(Object obj, int i2, Object obj2) {
        zzb.putObject(obj, zzB(i2) & 1048575, obj2);
        zzM(obj, i2);
    }

    private final void zzP(Object obj, int i2, int i3, Object obj2) {
        zzb.putObject(obj, zzB(i3) & 1048575, obj2);
        zzN(obj, i2, i3);
    }

    private final void zzQ(Object obj, zzng zzngVar) {
        int i2;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i3 = 1048575;
            int i4 = 0;
            int i5 = 0;
            int i6 = 1048575;
            while (i4 < length) {
                int zzB = zzB(i4);
                int[] iArr = this.zzc;
                int i7 = iArr[i4];
                int zzA = zzA(zzB);
                if (zzA <= 17) {
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
                long j2 = zzB & i3;
                switch (zzA) {
                    case 0:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzf(i7, zzmy.zza(obj, j2));
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 1:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzo(i7, zzmy.zzb(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 2:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzt(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 3:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzJ(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 4:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzr(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 5:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzm(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 6:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzk(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 7:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzb(i7, zzmy.zzw(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 8:
                        if ((i5 & i2) != 0) {
                            zzZ(i7, unsafe.getObject(obj, j2), zzngVar);
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 9:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzv(i7, unsafe.getObject(obj, j2), zzE(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 10:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzd(i7, (zzje) unsafe.getObject(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 11:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzH(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 12:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzi(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 13:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzw(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 14:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzy(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 15:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzA(i7, unsafe.getInt(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 16:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzC(i7, unsafe.getLong(obj, j2));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 17:
                        if ((i5 & i2) != 0) {
                            zzngVar.zzq(i7, unsafe.getObject(obj, j2), zzE(i4));
                        } else {
                            continue;
                        }
                        i4 += 3;
                        i3 = 1048575;
                    case 18:
                        zzlz.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 19:
                        zzlz.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 20:
                        zzlz.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 21:
                        zzlz.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 22:
                        zzlz.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 23:
                        zzlz.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 24:
                        zzlz.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 25:
                        zzlz.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        continue;
                        i4 += 3;
                        i3 = 1048575;
                    case 26:
                        zzlz.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar);
                        break;
                    case 27:
                        zzlz.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, zzE(i4));
                        break;
                    case 28:
                        zzlz.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar);
                        break;
                    case 29:
                        zzlz.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        break;
                    case 30:
                        zzlz.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        break;
                    case 31:
                        zzlz.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        break;
                    case 32:
                        zzlz.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        break;
                    case 33:
                        zzlz.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        break;
                    case 34:
                        zzlz.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, false);
                        break;
                    case 35:
                        zzlz.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 36:
                        zzlz.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 37:
                        zzlz.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 38:
                        zzlz.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 39:
                        zzlz.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 40:
                        zzlz.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 41:
                        zzlz.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 42:
                        zzlz.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 43:
                        zzlz.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 44:
                        zzlz.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 45:
                        zzlz.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 46:
                        zzlz.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 47:
                        zzlz.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 48:
                        zzlz.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, true);
                        break;
                    case 49:
                        zzlz.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j2), zzngVar, zzE(i4));
                        break;
                    case 50:
                        zzR(zzngVar, i7, unsafe.getObject(obj, j2), i4);
                        break;
                    case 51:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzf(i7, zzn(obj, j2));
                            break;
                        }
                        break;
                    case 52:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzo(i7, zzo(obj, j2));
                            break;
                        }
                        break;
                    case 53:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzt(i7, zzC(obj, j2));
                            break;
                        }
                        break;
                    case 54:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzJ(i7, zzC(obj, j2));
                            break;
                        }
                        break;
                    case 55:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzr(i7, zzr(obj, j2));
                            break;
                        }
                        break;
                    case 56:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzm(i7, zzC(obj, j2));
                            break;
                        }
                        break;
                    case 57:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzk(i7, zzr(obj, j2));
                            break;
                        }
                        break;
                    case 58:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzb(i7, zzY(obj, j2));
                            break;
                        }
                        break;
                    case 59:
                        if (zzX(obj, i7, i4)) {
                            zzZ(i7, unsafe.getObject(obj, j2), zzngVar);
                            break;
                        }
                        break;
                    case 60:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzv(i7, unsafe.getObject(obj, j2), zzE(i4));
                            break;
                        }
                        break;
                    case 61:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzd(i7, (zzje) unsafe.getObject(obj, j2));
                            break;
                        }
                        break;
                    case 62:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzH(i7, zzr(obj, j2));
                            break;
                        }
                        break;
                    case 63:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzi(i7, zzr(obj, j2));
                            break;
                        }
                        break;
                    case 64:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzw(i7, zzr(obj, j2));
                            break;
                        }
                        break;
                    case 65:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzy(i7, zzC(obj, j2));
                            break;
                        }
                        break;
                    case 66:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzA(i7, zzr(obj, j2));
                            break;
                        }
                        break;
                    case 67:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzC(i7, zzC(obj, j2));
                            break;
                        }
                        break;
                    case 68:
                        if (zzX(obj, i7, i4)) {
                            zzngVar.zzq(i7, unsafe.getObject(obj, j2), zzE(i4));
                            break;
                        }
                        break;
                }
                i4 += 3;
                i3 = 1048575;
            }
            zzmo zzmoVar = this.zzn;
            zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
            return;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final void zzR(zzng zzngVar, int i2, Object obj, int i3) {
        if (obj == null) {
            return;
        }
        zzlf zzlfVar = (zzlf) zzF(i3);
        throw null;
    }

    private final boolean zzS(Object obj, Object obj2, int i2) {
        return zzT(obj, i2) == zzT(obj2, i2);
    }

    private final boolean zzT(Object obj, int i2) {
        int zzy = zzy(i2);
        long j2 = zzy & 1048575;
        if (j2 != 1048575) {
            return (zzmy.zzc(obj, j2) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i2);
        long j3 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmy.zza(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmy.zzb(obj, j3)) != 0;
            case 2:
                return zzmy.zzd(obj, j3) != 0;
            case 3:
                return zzmy.zzd(obj, j3) != 0;
            case 4:
                return zzmy.zzc(obj, j3) != 0;
            case 5:
                return zzmy.zzd(obj, j3) != 0;
            case 6:
                return zzmy.zzc(obj, j3) != 0;
            case 7:
                return zzmy.zzw(obj, j3);
            case 8:
                Object zzf = zzmy.zzf(obj, j3);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzje) {
                    return !zzje.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzmy.zzf(obj, j3) != null;
            case 10:
                return !zzje.zzb.equals(zzmy.zzf(obj, j3));
            case 11:
                return zzmy.zzc(obj, j3) != 0;
            case 12:
                return zzmy.zzc(obj, j3) != 0;
            case 13:
                return zzmy.zzc(obj, j3) != 0;
            case 14:
                return zzmy.zzd(obj, j3) != 0;
            case 15:
                return zzmy.zzc(obj, j3) != 0;
            case 16:
                return zzmy.zzd(obj, j3) != 0;
            case 17:
                return zzmy.zzf(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzU(Object obj, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return zzT(obj, i2);
        }
        return (i4 & i5) != 0;
    }

    private static boolean zzV(Object obj, int i2, zzlx zzlxVar) {
        return zzlxVar.zzk(zzmy.zzf(obj, i2 & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzkf) {
            return ((zzkf) obj).zzbO();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i2, int i3) {
        return zzmy.zzc(obj, (long) (zzy(i3) & 1048575)) == i2;
    }

    private static boolean zzY(Object obj, long j2) {
        return ((Boolean) zzmy.zzf(obj, j2)).booleanValue();
    }

    private static final void zzZ(int i2, Object obj, zzng zzngVar) {
        if (obj instanceof String) {
            zzngVar.zzF(i2, (String) obj);
        } else {
            zzngVar.zzd(i2, (zzje) obj);
        }
    }

    public static zzmp zzd(Object obj) {
        zzkf zzkfVar = (zzkf) obj;
        zzmp zzmpVar = zzkfVar.zzc;
        if (zzmpVar == zzmp.zzc()) {
            zzmp zzf = zzmp.zzf();
            zzkfVar.zzc = zzf;
            return zzf;
        }
        return zzmpVar;
    }

    public static zzlp zzl(Class cls, zzlj zzljVar, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar) {
        if (zzljVar instanceof zzlw) {
            return zzm((zzlw) zzljVar, zzlrVar, zzlaVar, zzmoVar, zzjsVar, zzlhVar);
        }
        zzml zzmlVar = (zzml) zzljVar;
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
    public static com.google.android.gms.internal.measurement.zzlp zzm(com.google.android.gms.internal.measurement.zzlw r33, com.google.android.gms.internal.measurement.zzlr r34, com.google.android.gms.internal.measurement.zzla r35, com.google.android.gms.internal.measurement.zzmo r36, com.google.android.gms.internal.measurement.zzjs r37, com.google.android.gms.internal.measurement.zzlh r38) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlp.zzm(com.google.android.gms.internal.measurement.zzlw, com.google.android.gms.internal.measurement.zzlr, com.google.android.gms.internal.measurement.zzla, com.google.android.gms.internal.measurement.zzmo, com.google.android.gms.internal.measurement.zzjs, com.google.android.gms.internal.measurement.zzlh):com.google.android.gms.internal.measurement.zzlp");
    }

    private static double zzn(Object obj, long j2) {
        return ((Double) zzmy.zzf(obj, j2)).doubleValue();
    }

    private static float zzo(Object obj, long j2) {
        return ((Float) zzmy.zzf(obj, j2)).floatValue();
    }

    private final int zzp(Object obj) {
        int i2;
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int zzo;
        int zzA8;
        int zzB2;
        int zzi;
        int zzz;
        int zzA9;
        int i3;
        int zzA10;
        int zzd2;
        int zzA11;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (i5 < this.zzc.length) {
            int zzB3 = zzB(i5);
            int[] iArr = this.zzc;
            int i9 = iArr[i5];
            int zzA12 = zzA(zzB3);
            if (zzA12 <= 17) {
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
            long j2 = i4 & zzB3;
            switch (zzA12) {
                case 0:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzA = zzjm.zzA(i9 << 3);
                        zzo = zzA + 8;
                        i6 += zzo;
                        break;
                    }
                case 1:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzA2 = zzjm.zzA(i9 << 3);
                        zzo = zzA2 + 4;
                        i6 += zzo;
                        break;
                    }
                case 2:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j2);
                        zzA3 = zzjm.zzA(i9 << 3);
                        zzB = zzjm.zzB(j3);
                        zzo = zzA3 + zzB;
                        i6 += zzo;
                        break;
                    }
                case 3:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j2);
                        zzA3 = zzjm.zzA(i9 << 3);
                        zzB = zzjm.zzB(j4);
                        zzo = zzA3 + zzB;
                        i6 += zzo;
                        break;
                    }
                case 4:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        int i12 = unsafe.getInt(obj, j2);
                        zzA4 = zzjm.zzA(i9 << 3);
                        zzv = zzjm.zzv(i12);
                        zzo = zzv + zzA4;
                        i6 += zzo;
                        break;
                    }
                case 5:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzA = zzjm.zzA(i9 << 3);
                        zzo = zzA + 8;
                        i6 += zzo;
                        break;
                    }
                case 6:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzA2 = zzjm.zzA(i9 << 3);
                        zzo = zzA2 + 4;
                        i6 += zzo;
                        break;
                    }
                case 7:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzA5 = zzjm.zzA(i9 << 3);
                        zzo = zzA5 + 1;
                        i6 += zzo;
                        break;
                    }
                case 8:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof zzje) {
                            zzA6 = zzjm.zzA(i9 << 3);
                            zzd = ((zzje) object).zzd();
                            zzA7 = zzjm.zzA(zzd);
                            i6 = zzA7 + zzd + zzA6 + i6;
                            break;
                        } else {
                            zzA4 = zzjm.zzA(i9 << 3);
                            zzv = zzjm.zzy((String) object);
                            zzo = zzv + zzA4;
                            i6 += zzo;
                            break;
                        }
                    }
                case 9:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzo = zzlz.zzo(i9, unsafe.getObject(obj, j2), zzE(i5));
                        i6 += zzo;
                        break;
                    }
                case 10:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzA6 = zzjm.zzA(i9 << 3);
                        zzd = ((zzje) unsafe.getObject(obj, j2)).zzd();
                        zzA7 = zzjm.zzA(zzd);
                        i6 = zzA7 + zzd + zzA6 + i6;
                        break;
                    }
                case 11:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j2);
                        zzA4 = zzjm.zzA(i9 << 3);
                        zzv = zzjm.zzA(i13);
                        zzo = zzv + zzA4;
                        i6 += zzo;
                        break;
                    }
                case 12:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j2);
                        zzA4 = zzjm.zzA(i9 << 3);
                        zzv = zzjm.zzv(i14);
                        zzo = zzv + zzA4;
                        i6 += zzo;
                        break;
                    }
                case 13:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzA2 = zzjm.zzA(i9 << 3);
                        zzo = zzA2 + 4;
                        i6 += zzo;
                        break;
                    }
                case 14:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzA = zzjm.zzA(i9 << 3);
                        zzo = zzA + 8;
                        i6 += zzo;
                        break;
                    }
                case 15:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j2);
                        zzA4 = zzjm.zzA(i9 << 3);
                        zzv = zzjm.zzA((i15 >> 31) ^ (i15 + i15));
                        zzo = zzv + zzA4;
                        i6 += zzo;
                        break;
                    }
                case 16:
                    if ((i2 & i7) == 0) {
                        break;
                    } else {
                        long j5 = unsafe.getLong(obj, j2);
                        zzA8 = zzjm.zzA(i9 << 3);
                        zzB2 = zzjm.zzB((j5 >> 63) ^ (j5 + j5));
                        zzo = zzB2 + zzA8;
                        i6 += zzo;
                        break;
                    }
                case 17:
                    if ((i7 & i2) == 0) {
                        break;
                    } else {
                        zzo = zzjm.zzu(i9, (zzlm) unsafe.getObject(obj, j2), zzE(i5));
                        i6 += zzo;
                        break;
                    }
                case 18:
                    zzo = zzlz.zzh(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 19:
                    zzo = zzlz.zzf(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 20:
                    zzo = zzlz.zzm(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 21:
                    zzo = zzlz.zzx(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 22:
                    zzo = zzlz.zzk(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 23:
                    zzo = zzlz.zzh(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 24:
                    zzo = zzlz.zzf(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 25:
                    zzo = zzlz.zza(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 26:
                    zzo = zzlz.zzu(i9, (List) unsafe.getObject(obj, j2));
                    i6 += zzo;
                    break;
                case 27:
                    zzo = zzlz.zzp(i9, (List) unsafe.getObject(obj, j2), zzE(i5));
                    i6 += zzo;
                    break;
                case 28:
                    zzo = zzlz.zzc(i9, (List) unsafe.getObject(obj, j2));
                    i6 += zzo;
                    break;
                case 29:
                    zzo = zzlz.zzv(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 30:
                    zzo = zzlz.zzd(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 31:
                    zzo = zzlz.zzf(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 32:
                    zzo = zzlz.zzh(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 33:
                    zzo = zzlz.zzq(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 34:
                    zzo = zzlz.zzs(i9, (List) unsafe.getObject(obj, j2), false);
                    i6 += zzo;
                    break;
                case 35:
                    zzi = zzlz.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 36:
                    zzi = zzlz.zzg((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 37:
                    zzi = zzlz.zzn((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 38:
                    zzi = zzlz.zzy((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 39:
                    zzi = zzlz.zzl((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 40:
                    zzi = zzlz.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 41:
                    zzi = zzlz.zzg((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 42:
                    zzi = zzlz.zzb((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 43:
                    zzi = zzlz.zzw((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 44:
                    zzi = zzlz.zze((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 45:
                    zzi = zzlz.zzg((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 46:
                    zzi = zzlz.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 47:
                    zzi = zzlz.zzr((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 48:
                    zzi = zzlz.zzt((List) unsafe.getObject(obj, j2));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjm.zzz(i9);
                        zzA9 = zzjm.zzA(zzi);
                        i3 = zzA9 + zzz + zzi;
                        i6 += i3;
                        break;
                    }
                case 49:
                    zzo = zzlz.zzj(i9, (List) unsafe.getObject(obj, j2), zzE(i5));
                    i6 += zzo;
                    break;
                case 50:
                    zzlh.zza(i9, unsafe.getObject(obj, j2), zzF(i5));
                    break;
                case 51:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        zzA = zzjm.zzA(i9 << 3);
                        zzo = zzA + 8;
                        i6 += zzo;
                        break;
                    }
                case 52:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        zzA2 = zzjm.zzA(i9 << 3);
                        zzo = zzA2 + 4;
                        i6 += zzo;
                        break;
                    }
                case 53:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        long zzC = zzC(obj, j2);
                        zzA3 = zzjm.zzA(i9 << 3);
                        zzB = zzjm.zzB(zzC);
                        zzo = zzA3 + zzB;
                        i6 += zzo;
                        break;
                    }
                case 54:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        long zzC2 = zzC(obj, j2);
                        zzA3 = zzjm.zzA(i9 << 3);
                        zzB = zzjm.zzB(zzC2);
                        zzo = zzA3 + zzB;
                        i6 += zzo;
                        break;
                    }
                case 55:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        int zzr = zzr(obj, j2);
                        zzA4 = zzjm.zzA(i9 << 3);
                        zzv = zzjm.zzv(zzr);
                        zzo = zzv + zzA4;
                        i6 += zzo;
                        break;
                    }
                case 56:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        zzA = zzjm.zzA(i9 << 3);
                        zzo = zzA + 8;
                        i6 += zzo;
                        break;
                    }
                case 57:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        zzA2 = zzjm.zzA(i9 << 3);
                        zzo = zzA2 + 4;
                        i6 += zzo;
                        break;
                    }
                case 58:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        zzA5 = zzjm.zzA(i9 << 3);
                        zzo = zzA5 + 1;
                        i6 += zzo;
                        break;
                    }
                case 59:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j2);
                        if (object2 instanceof zzje) {
                            zzA10 = zzjm.zzA(i9 << 3);
                            zzd2 = ((zzje) object2).zzd();
                            zzA11 = zzjm.zzA(zzd2);
                            i3 = zzA11 + zzd2 + zzA10;
                            i6 += i3;
                            break;
                        } else {
                            zzA4 = zzjm.zzA(i9 << 3);
                            zzv = zzjm.zzy((String) object2);
                            zzo = zzv + zzA4;
                            i6 += zzo;
                            break;
                        }
                    }
                case 60:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        zzo = zzlz.zzo(i9, unsafe.getObject(obj, j2), zzE(i5));
                        i6 += zzo;
                        break;
                    }
                case 61:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        zzA10 = zzjm.zzA(i9 << 3);
                        zzd2 = ((zzje) unsafe.getObject(obj, j2)).zzd();
                        zzA11 = zzjm.zzA(zzd2);
                        i3 = zzA11 + zzd2 + zzA10;
                        i6 += i3;
                        break;
                    }
                case 62:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        int zzr2 = zzr(obj, j2);
                        zzA4 = zzjm.zzA(i9 << 3);
                        zzv = zzjm.zzA(zzr2);
                        zzo = zzv + zzA4;
                        i6 += zzo;
                        break;
                    }
                case 63:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        int zzr3 = zzr(obj, j2);
                        zzA4 = zzjm.zzA(i9 << 3);
                        zzv = zzjm.zzv(zzr3);
                        zzo = zzv + zzA4;
                        i6 += zzo;
                        break;
                    }
                case 64:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        zzA2 = zzjm.zzA(i9 << 3);
                        zzo = zzA2 + 4;
                        i6 += zzo;
                        break;
                    }
                case 65:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        zzA = zzjm.zzA(i9 << 3);
                        zzo = zzA + 8;
                        i6 += zzo;
                        break;
                    }
                case 66:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        int zzr4 = zzr(obj, j2);
                        zzA4 = zzjm.zzA(i9 << 3);
                        zzv = zzjm.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        zzo = zzv + zzA4;
                        i6 += zzo;
                        break;
                    }
                case 67:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        long zzC3 = zzC(obj, j2);
                        zzA8 = zzjm.zzA(i9 << 3);
                        zzB2 = zzjm.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        zzo = zzB2 + zzA8;
                        i6 += zzo;
                        break;
                    }
                case 68:
                    if (!zzX(obj, i9, i5)) {
                        break;
                    } else {
                        zzo = zzjm.zzu(i9, (zzlm) unsafe.getObject(obj, j2), zzE(i5));
                        i6 += zzo;
                        break;
                    }
            }
            i5 += 3;
            i4 = 1048575;
        }
        zzmo zzmoVar = this.zzn;
        int zza2 = zzmoVar.zza(zzmoVar.zzd(obj)) + i6;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return zza2;
    }

    private final int zzq(Object obj) {
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int zzo;
        int zzi;
        int zzz;
        int zzA8;
        int i2;
        Unsafe unsafe = zzb;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzc.length; i4 += 3) {
            int zzB2 = zzB(i4);
            int zzA9 = zzA(zzB2);
            int i5 = this.zzc[i4];
            long j2 = zzB2 & 1048575;
            if (zzA9 >= zzjx.zzJ.zza() && zzA9 <= zzjx.zzW.zza()) {
                int i6 = this.zzc[i4 + 2];
            }
            switch (zzA9) {
                case 0:
                    if (zzT(obj, i4)) {
                        zzA = zzjm.zzA(i5 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (zzT(obj, i4)) {
                        zzA2 = zzjm.zzA(i5 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (zzT(obj, i4)) {
                        long zzd2 = zzmy.zzd(obj, j2);
                        zzA3 = zzjm.zzA(i5 << 3);
                        zzB = zzjm.zzB(zzd2);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (zzT(obj, i4)) {
                        long zzd3 = zzmy.zzd(obj, j2);
                        zzA3 = zzjm.zzA(i5 << 3);
                        zzB = zzjm.zzB(zzd3);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (zzT(obj, i4)) {
                        int zzc = zzmy.zzc(obj, j2);
                        zzA4 = zzjm.zzA(i5 << 3);
                        zzv = zzjm.zzv(zzc);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (zzT(obj, i4)) {
                        zzA = zzjm.zzA(i5 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (zzT(obj, i4)) {
                        zzA2 = zzjm.zzA(i5 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (zzT(obj, i4)) {
                        zzA5 = zzjm.zzA(i5 << 3);
                        zzo = zzA5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (zzT(obj, i4)) {
                        Object zzf = zzmy.zzf(obj, j2);
                        if (zzf instanceof zzje) {
                            zzA6 = zzjm.zzA(i5 << 3);
                            zzd = ((zzje) zzf).zzd();
                            zzA7 = zzjm.zzA(zzd);
                            i2 = zzA7 + zzd + zzA6;
                            i3 += i2;
                        } else {
                            zzA4 = zzjm.zzA(i5 << 3);
                            zzv = zzjm.zzy((String) zzf);
                            zzo = zzv + zzA4;
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (zzT(obj, i4)) {
                        zzo = zzlz.zzo(i5, zzmy.zzf(obj, j2), zzE(i4));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (zzT(obj, i4)) {
                        zzA6 = zzjm.zzA(i5 << 3);
                        zzd = ((zzje) zzmy.zzf(obj, j2)).zzd();
                        zzA7 = zzjm.zzA(zzd);
                        i2 = zzA7 + zzd + zzA6;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 11:
                    if (zzT(obj, i4)) {
                        int zzc2 = zzmy.zzc(obj, j2);
                        zzA4 = zzjm.zzA(i5 << 3);
                        zzv = zzjm.zzA(zzc2);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (zzT(obj, i4)) {
                        int zzc3 = zzmy.zzc(obj, j2);
                        zzA4 = zzjm.zzA(i5 << 3);
                        zzv = zzjm.zzv(zzc3);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (zzT(obj, i4)) {
                        zzA2 = zzjm.zzA(i5 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (zzT(obj, i4)) {
                        zzA = zzjm.zzA(i5 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (zzT(obj, i4)) {
                        int zzc4 = zzmy.zzc(obj, j2);
                        zzA4 = zzjm.zzA(i5 << 3);
                        zzv = zzjm.zzA((zzc4 >> 31) ^ (zzc4 + zzc4));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (zzT(obj, i4)) {
                        long zzd4 = zzmy.zzd(obj, j2);
                        zzA4 = zzjm.zzA(i5 << 3);
                        zzv = zzjm.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (zzT(obj, i4)) {
                        zzo = zzjm.zzu(i5, (zzlm) zzmy.zzf(obj, j2), zzE(i4));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    zzo = zzlz.zzh(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 19:
                    zzo = zzlz.zzf(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 20:
                    zzo = zzlz.zzm(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 21:
                    zzo = zzlz.zzx(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 22:
                    zzo = zzlz.zzk(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 23:
                    zzo = zzlz.zzh(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 24:
                    zzo = zzlz.zzf(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 25:
                    zzo = zzlz.zza(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 26:
                    zzo = zzlz.zzu(i5, (List) zzmy.zzf(obj, j2));
                    break;
                case 27:
                    zzo = zzlz.zzp(i5, (List) zzmy.zzf(obj, j2), zzE(i4));
                    break;
                case 28:
                    zzo = zzlz.zzc(i5, (List) zzmy.zzf(obj, j2));
                    break;
                case 29:
                    zzo = zzlz.zzv(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 30:
                    zzo = zzlz.zzd(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 31:
                    zzo = zzlz.zzf(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 32:
                    zzo = zzlz.zzh(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 33:
                    zzo = zzlz.zzq(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 34:
                    zzo = zzlz.zzs(i5, (List) zzmy.zzf(obj, j2), false);
                    break;
                case 35:
                    zzi = zzlz.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 36:
                    zzi = zzlz.zzg((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 37:
                    zzi = zzlz.zzn((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 38:
                    zzi = zzlz.zzy((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 39:
                    zzi = zzlz.zzl((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 40:
                    zzi = zzlz.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 41:
                    zzi = zzlz.zzg((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 42:
                    zzi = zzlz.zzb((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 43:
                    zzi = zzlz.zzw((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 44:
                    zzi = zzlz.zze((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 45:
                    zzi = zzlz.zzg((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 46:
                    zzi = zzlz.zzi((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 47:
                    zzi = zzlz.zzr((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 48:
                    zzi = zzlz.zzt((List) unsafe.getObject(obj, j2));
                    if (zzi > 0) {
                        zzz = zzjm.zzz(i5);
                        zzA8 = zzjm.zzA(zzi);
                        i2 = zzA8 + zzz + zzi;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 49:
                    zzo = zzlz.zzj(i5, (List) zzmy.zzf(obj, j2), zzE(i4));
                    break;
                case 50:
                    zzlh.zza(i5, zzmy.zzf(obj, j2), zzF(i4));
                    continue;
                case 51:
                    if (zzX(obj, i5, i4)) {
                        zzA = zzjm.zzA(i5 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zzX(obj, i5, i4)) {
                        zzA2 = zzjm.zzA(i5 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zzX(obj, i5, i4)) {
                        long zzC = zzC(obj, j2);
                        zzA3 = zzjm.zzA(i5 << 3);
                        zzB = zzjm.zzB(zzC);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zzX(obj, i5, i4)) {
                        long zzC2 = zzC(obj, j2);
                        zzA3 = zzjm.zzA(i5 << 3);
                        zzB = zzjm.zzB(zzC2);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (zzX(obj, i5, i4)) {
                        int zzr = zzr(obj, j2);
                        zzA4 = zzjm.zzA(i5 << 3);
                        zzv = zzjm.zzv(zzr);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (zzX(obj, i5, i4)) {
                        zzA = zzjm.zzA(i5 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zzX(obj, i5, i4)) {
                        zzA2 = zzjm.zzA(i5 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zzX(obj, i5, i4)) {
                        zzA5 = zzjm.zzA(i5 << 3);
                        zzo = zzA5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zzX(obj, i5, i4)) {
                        Object zzf2 = zzmy.zzf(obj, j2);
                        if (zzf2 instanceof zzje) {
                            zzA6 = zzjm.zzA(i5 << 3);
                            zzd = ((zzje) zzf2).zzd();
                            zzA7 = zzjm.zzA(zzd);
                            i2 = zzA7 + zzd + zzA6;
                            i3 += i2;
                        } else {
                            zzA4 = zzjm.zzA(i5 << 3);
                            zzv = zzjm.zzy((String) zzf2);
                            zzo = zzv + zzA4;
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (zzX(obj, i5, i4)) {
                        zzo = zzlz.zzo(i5, zzmy.zzf(obj, j2), zzE(i4));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zzX(obj, i5, i4)) {
                        zzA6 = zzjm.zzA(i5 << 3);
                        zzd = ((zzje) zzmy.zzf(obj, j2)).zzd();
                        zzA7 = zzjm.zzA(zzd);
                        i2 = zzA7 + zzd + zzA6;
                        i3 += i2;
                    } else {
                        continue;
                    }
                case 62:
                    if (zzX(obj, i5, i4)) {
                        int zzr2 = zzr(obj, j2);
                        zzA4 = zzjm.zzA(i5 << 3);
                        zzv = zzjm.zzA(zzr2);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (zzX(obj, i5, i4)) {
                        int zzr3 = zzr(obj, j2);
                        zzA4 = zzjm.zzA(i5 << 3);
                        zzv = zzjm.zzv(zzr3);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (zzX(obj, i5, i4)) {
                        zzA2 = zzjm.zzA(i5 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zzX(obj, i5, i4)) {
                        zzA = zzjm.zzA(i5 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zzX(obj, i5, i4)) {
                        int zzr4 = zzr(obj, j2);
                        zzA4 = zzjm.zzA(i5 << 3);
                        zzv = zzjm.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (zzX(obj, i5, i4)) {
                        long zzC3 = zzC(obj, j2);
                        zzA4 = zzjm.zzA(i5 << 3);
                        zzv = zzjm.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (zzX(obj, i5, i4)) {
                        zzo = zzjm.zzu(i5, (zzlm) zzmy.zzf(obj, j2), zzE(i4));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i3 += zzo;
        }
        zzmo zzmoVar = this.zzn;
        return zzmoVar.zza(zzmoVar.zzd(obj)) + i3;
    }

    private static int zzr(Object obj, long j2) {
        return ((Integer) zzmy.zzf(obj, j2)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i2, int i3, int i4, long j2, zzir zzirVar) {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i4);
        Object object = unsafe.getObject(obj, j2);
        if (!((zzlg) object).zze()) {
            zzlg zzb2 = zzlg.zza().zzb();
            zzlh.zzb(zzb2, object);
            unsafe.putObject(obj, j2, zzb2);
        }
        zzlf zzlfVar = (zzlf) zzF;
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, zzir zzirVar) {
        Unsafe unsafe = zzb;
        long j3 = this.zzc[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    unsafe.putObject(obj, j2, Double.valueOf(Double.longBitsToDouble(zzis.zzp(bArr, i2))));
                    unsafe.putInt(obj, j3, i5);
                    return i2 + 8;
                }
                break;
            case 52:
                if (i6 == 5) {
                    unsafe.putObject(obj, j2, Float.valueOf(Float.intBitsToFloat(zzis.zzb(bArr, i2))));
                    unsafe.putInt(obj, j3, i5);
                    return i2 + 4;
                }
                break;
            case 53:
            case 54:
                if (i6 == 0) {
                    int zzm = zzis.zzm(bArr, i2, zzirVar);
                    unsafe.putObject(obj, j2, Long.valueOf(zzirVar.zzb));
                    unsafe.putInt(obj, j3, i5);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i6 == 0) {
                    int zzj = zzis.zzj(bArr, i2, zzirVar);
                    unsafe.putObject(obj, j2, Integer.valueOf(zzirVar.zza));
                    unsafe.putInt(obj, j3, i5);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i6 == 1) {
                    unsafe.putObject(obj, j2, Long.valueOf(zzis.zzp(bArr, i2)));
                    unsafe.putInt(obj, j3, i5);
                    return i2 + 8;
                }
                break;
            case 57:
            case 64:
                if (i6 == 5) {
                    unsafe.putObject(obj, j2, Integer.valueOf(zzis.zzb(bArr, i2)));
                    unsafe.putInt(obj, j3, i5);
                    return i2 + 4;
                }
                break;
            case 58:
                if (i6 == 0) {
                    int zzm2 = zzis.zzm(bArr, i2, zzirVar);
                    unsafe.putObject(obj, j2, Boolean.valueOf(zzirVar.zzb != 0));
                    unsafe.putInt(obj, j3, i5);
                    return zzm2;
                }
                break;
            case 59:
                if (i6 == 2) {
                    int zzj2 = zzis.zzj(bArr, i2, zzirVar);
                    int i10 = zzirVar.zza;
                    if (i10 == 0) {
                        unsafe.putObject(obj, j2, "");
                    } else if ((i7 & 536870912) != 0 && !zznd.zzf(bArr, zzj2, zzj2 + i10)) {
                        throw zzkp.zzc();
                    } else {
                        unsafe.putObject(obj, j2, new String(bArr, zzj2, i10, zzkn.zzb));
                        zzj2 += i10;
                    }
                    unsafe.putInt(obj, j3, i5);
                    return zzj2;
                }
                break;
            case 60:
                if (i6 == 2) {
                    Object zzH = zzH(obj, i5, i9);
                    int zzo = zzis.zzo(zzH, zzE(i9), bArr, i2, i3, zzirVar);
                    zzP(obj, i5, i9, zzH);
                    return zzo;
                }
                break;
            case 61:
                if (i6 == 2) {
                    int zza2 = zzis.zza(bArr, i2, zzirVar);
                    unsafe.putObject(obj, j2, zzirVar.zzc);
                    unsafe.putInt(obj, j3, i5);
                    return zza2;
                }
                break;
            case 63:
                if (i6 == 0) {
                    int zzj3 = zzis.zzj(bArr, i2, zzirVar);
                    int i11 = zzirVar.zza;
                    zzkj zzD = zzD(i9);
                    if (zzD != null && !zzD.zza(i11)) {
                        zzd(obj).zzj(i4, Long.valueOf(i11));
                    } else {
                        unsafe.putObject(obj, j2, Integer.valueOf(i11));
                        unsafe.putInt(obj, j3, i5);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i6 == 0) {
                    int zzj4 = zzis.zzj(bArr, i2, zzirVar);
                    unsafe.putObject(obj, j2, Integer.valueOf(zzji.zzb(zzirVar.zza)));
                    unsafe.putInt(obj, j3, i5);
                    return zzj4;
                }
                break;
            case 67:
                if (i6 == 0) {
                    int zzm3 = zzis.zzm(bArr, i2, zzirVar);
                    unsafe.putObject(obj, j2, Long.valueOf(zzji.zzc(zzirVar.zzb)));
                    unsafe.putInt(obj, j3, i5);
                    return zzm3;
                }
                break;
            case 68:
                if (i6 == 3) {
                    Object zzH2 = zzH(obj, i5, i9);
                    int zzn = zzis.zzn(zzH2, zzE(i9), bArr, i2, i3, (i4 & (-8)) | 4, zzirVar);
                    zzP(obj, i5, i9, zzH2);
                    return zzn;
                }
                break;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02ec, code lost:
        if (r0 != r24) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ee, code lost:
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r15;
        r1 = r23;
        r6 = r25;
        r7 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ff, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x032b, code lost:
        if (r0 != r14) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x034e, code lost:
        if (r0 != r14) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzu(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zzir r35) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlp.zzu(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzir):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x0213 -> B:114:0x0214). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0148 -> B:61:0x0149). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01c5 -> B:94:0x01c6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzv(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zzir r29) {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlp.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzir):int");
    }

    private final int zzw(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzz(i2, 0);
    }

    private final int zzx(int i2, int i3) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzz(i2, i3);
    }

    private final int zzy(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzz(int i2, int i3) {
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

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final int zzb(Object obj) {
        int i2;
        int zzc;
        int i3;
        int zzr;
        int length = this.zzc.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int zzB = zzB(i5);
            int i6 = this.zzc[i5];
            long j2 = 1048575 & zzB;
            int i7 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i2 = i4 * 53;
                    zzc = zzkn.zzc(Double.doubleToLongBits(zzmy.zza(obj, j2)));
                    i4 = zzc + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    zzc = Float.floatToIntBits(zzmy.zzb(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 4:
                    i2 = i4 * 53;
                    zzc = zzmy.zzc(obj, j2);
                    i4 = zzc + i2;
                    break;
                case 5:
                    i2 = i4 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 6:
                    i2 = i4 * 53;
                    zzc = zzmy.zzc(obj, j2);
                    i4 = zzc + i2;
                    break;
                case 7:
                    i2 = i4 * 53;
                    zzc = zzkn.zza(zzmy.zzw(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    zzc = ((String) zzmy.zzf(obj, j2)).hashCode();
                    i4 = zzc + i2;
                    break;
                case 9:
                    Object zzf = zzmy.zzf(obj, j2);
                    if (zzf != null) {
                        i7 = zzf.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 10:
                    i2 = i4 * 53;
                    zzc = zzmy.zzf(obj, j2).hashCode();
                    i4 = zzc + i2;
                    break;
                case 11:
                    i2 = i4 * 53;
                    zzc = zzmy.zzc(obj, j2);
                    i4 = zzc + i2;
                    break;
                case 12:
                    i2 = i4 * 53;
                    zzc = zzmy.zzc(obj, j2);
                    i4 = zzc + i2;
                    break;
                case 13:
                    i2 = i4 * 53;
                    zzc = zzmy.zzc(obj, j2);
                    i4 = zzc + i2;
                    break;
                case 14:
                    i2 = i4 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 15:
                    i2 = i4 * 53;
                    zzc = zzmy.zzc(obj, j2);
                    i4 = zzc + i2;
                    break;
                case 16:
                    i2 = i4 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j2));
                    i4 = zzc + i2;
                    break;
                case 17:
                    Object zzf2 = zzmy.zzf(obj, j2);
                    if (zzf2 != null) {
                        i7 = zzf2.hashCode();
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
                    zzc = zzmy.zzf(obj, j2).hashCode();
                    i4 = zzc + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    zzc = zzmy.zzf(obj, j2).hashCode();
                    i4 = zzc + i2;
                    break;
                case 51:
                    if (zzX(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkn.zzc(Double.doubleToLongBits(zzn(obj, j2)));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = Float.floatToIntBits(zzo(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkn.zzc(zzC(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkn.zzc(zzC(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzr = zzr(obj, j2);
                        i4 = i3 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkn.zzc(zzC(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzr = zzr(obj, j2);
                        i4 = i3 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkn.zza(zzY(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzX(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = ((String) zzmy.zzf(obj, j2)).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzX(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzmy.zzf(obj, j2).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzmy.zzf(obj, j2).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzr = zzr(obj, j2);
                        i4 = i3 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzr = zzr(obj, j2);
                        i4 = i3 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzr = zzr(obj, j2);
                        i4 = i3 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkn.zzc(zzC(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzX(obj, i6, i5)) {
                        i3 = i4 * 53;
                        zzr = zzr(obj, j2);
                        i4 = i3 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzX(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzkn.zzc(zzC(obj, j2));
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzX(obj, i6, i5)) {
                        i2 = i4 * 53;
                        zzc = zzmy.zzf(obj, j2).hashCode();
                        i4 = zzc + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzd(obj).hashCode() + (i4 * 53);
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x041c, code lost:
        if (r6 == 1048575) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x041e, code lost:
        r28.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0424, code lost:
        r3 = r9.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0428, code lost:
        if (r3 >= r9.zzl) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x042a, code lost:
        r4 = r9.zzj[r3];
        r5 = r9.zzc[r4];
        r5 = com.google.android.gms.internal.measurement.zzmy.zzf(r12, r9.zzB(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x043c, code lost:
        if (r5 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0443, code lost:
        if (r9.zzD(r4) != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0445, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0448, code lost:
        r5 = (com.google.android.gms.internal.measurement.zzlg) r5;
        r0 = (com.google.android.gms.internal.measurement.zzlf) r9.zzF(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0450, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0451, code lost:
        if (r7 != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0455, code lost:
        if (r0 != r33) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x045c, code lost:
        throw com.google.android.gms.internal.measurement.zzkp.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x045f, code lost:
        if (r0 > r33) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0461, code lost:
        if (r1 != r7) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0463, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0468, code lost:
        throw com.google.android.gms.internal.measurement.zzkp.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.measurement.zzir r35) {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlp.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzir):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final Object zze() {
        return ((zzkf) this.zzg).zzbA();
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzf(Object obj) {
        if (zzW(obj)) {
            if (obj instanceof zzkf) {
                zzkf zzkfVar = (zzkf) obj;
                zzkfVar.zzbM(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                zzkfVar.zzb = 0;
                zzkfVar.zzbK();
            }
            int length = this.zzc.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int zzB = zzB(i2);
                long j2 = 1048575 & zzB;
                int zzA = zzA(zzB);
                if (zzA != 9) {
                    switch (zzA) {
                        case 17:
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
                            this.zzm.zza(obj, j2);
                            continue;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j2);
                            if (object != null) {
                                ((zzlg) object).zzc();
                                unsafe.putObject(obj, j2, object);
                            } else {
                                continue;
                            }
                        default:
                    }
                }
                if (zzT(obj, i2)) {
                    zzE(i2).zzf(zzb.getObject(obj, j2));
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzg(Object obj, Object obj2) {
        zzJ(obj);
        Objects.requireNonNull(obj2);
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzB = zzB(i2);
            long j2 = 1048575 & zzB;
            int i3 = this.zzc[i2];
            switch (zzA(zzB)) {
                case 0:
                    if (zzT(obj2, i2)) {
                        zzmy.zzo(obj, j2, zzmy.zza(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj2, i2)) {
                        zzmy.zzp(obj, j2, zzmy.zzb(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj2, i2)) {
                        zzmy.zzr(obj, j2, zzmy.zzd(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj2, i2)) {
                        zzmy.zzr(obj, j2, zzmy.zzd(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj2, i2)) {
                        zzmy.zzq(obj, j2, zzmy.zzc(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj2, i2)) {
                        zzmy.zzr(obj, j2, zzmy.zzd(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj2, i2)) {
                        zzmy.zzq(obj, j2, zzmy.zzc(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj2, i2)) {
                        zzmy.zzm(obj, j2, zzmy.zzw(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzT(obj2, i2)) {
                        zzmy.zzs(obj, j2, zzmy.zzf(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzK(obj, obj2, i2);
                    break;
                case 10:
                    if (zzT(obj2, i2)) {
                        zzmy.zzs(obj, j2, zzmy.zzf(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj2, i2)) {
                        zzmy.zzq(obj, j2, zzmy.zzc(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj2, i2)) {
                        zzmy.zzq(obj, j2, zzmy.zzc(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj2, i2)) {
                        zzmy.zzq(obj, j2, zzmy.zzc(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj2, i2)) {
                        zzmy.zzr(obj, j2, zzmy.zzd(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj2, i2)) {
                        zzmy.zzq(obj, j2, zzmy.zzc(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj2, i2)) {
                        zzmy.zzr(obj, j2, zzmy.zzd(obj2, j2));
                        zzM(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzK(obj, obj2, i2);
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
                    this.zzm.zzb(obj, obj2, j2);
                    break;
                case 50:
                    zzlz.zzaa(this.zzq, obj, obj2, j2);
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
                    if (zzX(obj2, i3, i2)) {
                        zzmy.zzs(obj, j2, zzmy.zzf(obj2, j2));
                        zzN(obj, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzL(obj, obj2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzX(obj2, i3, i2)) {
                        zzmy.zzs(obj, j2, zzmy.zzf(obj2, j2));
                        zzN(obj, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzL(obj, obj2, i2);
                    break;
            }
        }
        zzlz.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlz.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzh(Object obj, byte[] bArr, int i2, int i3, zzir zzirVar) {
        if (this.zzi) {
            zzu(obj, bArr, i2, i3, zzirVar);
        } else {
            zzc(obj, bArr, i2, i3, 0, zzirVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzi(Object obj, zzng zzngVar) {
        if (!this.zzi) {
            zzQ(obj, zzngVar);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int zzB = zzB(i2);
                int i3 = this.zzc[i2];
                switch (zzA(zzB)) {
                    case 0:
                        if (zzT(obj, i2)) {
                            zzngVar.zzf(i3, zzmy.zza(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzT(obj, i2)) {
                            zzngVar.zzo(i3, zzmy.zzb(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzT(obj, i2)) {
                            zzngVar.zzt(i3, zzmy.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzT(obj, i2)) {
                            zzngVar.zzJ(i3, zzmy.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzT(obj, i2)) {
                            zzngVar.zzr(i3, zzmy.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzT(obj, i2)) {
                            zzngVar.zzm(i3, zzmy.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzT(obj, i2)) {
                            zzngVar.zzk(i3, zzmy.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzT(obj, i2)) {
                            zzngVar.zzb(i3, zzmy.zzw(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzT(obj, i2)) {
                            zzZ(i3, zzmy.zzf(obj, zzB & 1048575), zzngVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzT(obj, i2)) {
                            zzngVar.zzv(i3, zzmy.zzf(obj, zzB & 1048575), zzE(i2));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzT(obj, i2)) {
                            zzngVar.zzd(i3, (zzje) zzmy.zzf(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzT(obj, i2)) {
                            zzngVar.zzH(i3, zzmy.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzT(obj, i2)) {
                            zzngVar.zzi(i3, zzmy.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzT(obj, i2)) {
                            zzngVar.zzw(i3, zzmy.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzT(obj, i2)) {
                            zzngVar.zzy(i3, zzmy.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzT(obj, i2)) {
                            zzngVar.zzA(i3, zzmy.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzT(obj, i2)) {
                            zzngVar.zzC(i3, zzmy.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzT(obj, i2)) {
                            zzngVar.zzq(i3, zzmy.zzf(obj, zzB & 1048575), zzE(i2));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzlz.zzJ(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 19:
                        zzlz.zzN(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 20:
                        zzlz.zzQ(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 21:
                        zzlz.zzY(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 22:
                        zzlz.zzP(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 23:
                        zzlz.zzM(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 24:
                        zzlz.zzL(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 25:
                        zzlz.zzH(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 26:
                        zzlz.zzW(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar);
                        break;
                    case 27:
                        zzlz.zzR(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, zzE(i2));
                        break;
                    case 28:
                        zzlz.zzI(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar);
                        break;
                    case 29:
                        zzlz.zzX(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 30:
                        zzlz.zzK(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 31:
                        zzlz.zzS(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 32:
                        zzlz.zzT(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 33:
                        zzlz.zzU(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 34:
                        zzlz.zzV(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                        break;
                    case 35:
                        zzlz.zzJ(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 36:
                        zzlz.zzN(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 37:
                        zzlz.zzQ(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 38:
                        zzlz.zzY(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 39:
                        zzlz.zzP(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 40:
                        zzlz.zzM(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 41:
                        zzlz.zzL(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 42:
                        zzlz.zzH(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 43:
                        zzlz.zzX(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 44:
                        zzlz.zzK(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 45:
                        zzlz.zzS(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 46:
                        zzlz.zzT(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 47:
                        zzlz.zzU(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 48:
                        zzlz.zzV(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                        break;
                    case 49:
                        zzlz.zzO(i3, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, zzE(i2));
                        break;
                    case 50:
                        zzR(zzngVar, i3, zzmy.zzf(obj, zzB & 1048575), i2);
                        break;
                    case 51:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzf(i3, zzn(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzo(i3, zzo(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzt(i3, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzJ(i3, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzr(i3, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzm(i3, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzk(i3, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzb(i3, zzY(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzX(obj, i3, i2)) {
                            zzZ(i3, zzmy.zzf(obj, zzB & 1048575), zzngVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzv(i3, zzmy.zzf(obj, zzB & 1048575), zzE(i2));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzd(i3, (zzje) zzmy.zzf(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzH(i3, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzi(i3, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzw(i3, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzy(i3, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzA(i3, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzC(i3, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzX(obj, i3, i2)) {
                            zzngVar.zzq(i3, zzmy.zzf(obj, zzB & 1048575), zzE(i2));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzmo zzmoVar = this.zzn;
            zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
        } else {
            this.zzo.zza(obj);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzZ;
        int length = this.zzc.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int zzB = zzB(i2);
            long j2 = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzS(obj, obj2, i2) && Double.doubleToLongBits(zzmy.zza(obj, j2)) == Double.doubleToLongBits(zzmy.zza(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzS(obj, obj2, i2) && Float.floatToIntBits(zzmy.zzb(obj, j2)) == Float.floatToIntBits(zzmy.zzb(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzS(obj, obj2, i2) && zzmy.zzd(obj, j2) == zzmy.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzS(obj, obj2, i2) && zzmy.zzd(obj, j2) == zzmy.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzS(obj, obj2, i2) && zzmy.zzc(obj, j2) == zzmy.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzS(obj, obj2, i2) && zzmy.zzd(obj, j2) == zzmy.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzS(obj, obj2, i2) && zzmy.zzc(obj, j2) == zzmy.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzS(obj, obj2, i2) && zzmy.zzw(obj, j2) == zzmy.zzw(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzS(obj, obj2, i2) && zzlz.zzZ(zzmy.zzf(obj, j2), zzmy.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzS(obj, obj2, i2) && zzlz.zzZ(zzmy.zzf(obj, j2), zzmy.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzS(obj, obj2, i2) && zzlz.zzZ(zzmy.zzf(obj, j2), zzmy.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzS(obj, obj2, i2) && zzmy.zzc(obj, j2) == zzmy.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzS(obj, obj2, i2) && zzmy.zzc(obj, j2) == zzmy.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzS(obj, obj2, i2) && zzmy.zzc(obj, j2) == zzmy.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzS(obj, obj2, i2) && zzmy.zzd(obj, j2) == zzmy.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzS(obj, obj2, i2) && zzmy.zzc(obj, j2) == zzmy.zzc(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzS(obj, obj2, i2) && zzmy.zzd(obj, j2) == zzmy.zzd(obj2, j2)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzS(obj, obj2, i2) && zzlz.zzZ(zzmy.zzf(obj, j2), zzmy.zzf(obj2, j2))) {
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
                    zzZ = zzlz.zzZ(zzmy.zzf(obj, j2), zzmy.zzf(obj2, j2));
                    break;
                case 50:
                    zzZ = zzlz.zzZ(zzmy.zzf(obj, j2), zzmy.zzf(obj2, j2));
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
                    long zzy = zzy(i2) & 1048575;
                    if (zzmy.zzc(obj, zzy) == zzmy.zzc(obj2, zzy) && zzlz.zzZ(zzmy.zzf(obj, j2), zzmy.zzf(obj2, j2))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzZ) {
                return false;
            }
        }
        if (this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            if (this.zzh) {
                this.zzo.zza(obj);
                this.zzo.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzk(Object obj) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int i7 = this.zzj[i6];
            int i8 = this.zzc[i7];
            int zzB = zzB(i7);
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
            if ((268435456 & zzB) != 0 && !zzU(obj, i7, i2, i3, i11)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzX(obj, i8, i7) && !zzV(obj, zzB, zzE(i7))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzlg) zzmy.zzf(obj, zzB & 1048575)).isEmpty()) {
                            zzlf zzlfVar = (zzlf) zzF(i7);
                            throw null;
                        }
                    }
                }
                List list = (List) zzmy.zzf(obj, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlx zzE = zzE(i7);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzE.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzU(obj, i7, i2, i3, i11) && !zzV(obj, zzB, zzE(i7))) {
                return false;
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return true;
    }
}
