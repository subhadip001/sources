package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgns {
    public static final long zza;
    public static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzgnr zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0138  */
    static {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgns.<clinit>():void");
    }

    private zzgns() {
    }

    public static boolean zzA() {
        return zzh;
    }

    public static boolean zzB() {
        return zzg;
    }

    private static int zzC(Class cls) {
        if (zzh) {
            return zzf.zzj(cls);
        }
        return -1;
    }

    private static int zzD(Class cls) {
        if (zzh) {
            return zzf.zzk(cls);
        }
        return -1;
    }

    private static Field zzE() {
        int i2 = zzgir.zza;
        Field zzF = zzF(Buffer.class, "effectiveDirectAddress");
        if (zzF == null) {
            Field zzF2 = zzF(Buffer.class, "address");
            if (zzF2 == null || zzF2.getType() != Long.TYPE) {
                return null;
            }
            return zzF2;
        }
        return zzF;
    }

    private static Field zzF(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzG(Object obj, long j2, byte b) {
        long j3 = (-4) & j2;
        zzgnr zzgnrVar = zzf;
        int zzl = zzgnrVar.zzl(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        zzgnrVar.zzp(obj, j3, ((255 & b) << i2) | (zzl & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzH(Object obj, long j2, byte b) {
        long j3 = (-4) & j2;
        zzgnr zzgnrVar = zzf;
        int i2 = (((int) j2) & 3) << 3;
        zzgnrVar.zzp(obj, j3, ((255 & b) << i2) | (zzgnrVar.zzl(obj, j3) & (~(255 << i2))));
    }

    public static byte zza(long j2) {
        return zzf.zza(j2);
    }

    public static double zzb(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    public static float zzc(Object obj, long j2) {
        return zzf.zzc(obj, j2);
    }

    public static int zzd(Object obj, long j2) {
        return zzf.zzl(obj, j2);
    }

    public static long zze(ByteBuffer byteBuffer) {
        return zzf.zzm(byteBuffer, zzi);
    }

    public static long zzf(Object obj, long j2) {
        return zzf.zzm(obj, j2);
    }

    public static Object zzg(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object zzh(Object obj, long j2) {
        return zzf.zzo(obj, j2);
    }

    public static Unsafe zzi() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgno());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzj(Throwable th) {
        Logger.getLogger(zzgns.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzo(long j2, byte[] bArr, long j3, long j4) {
        zzf.zzd(j2, bArr, j3, j4);
    }

    public static void zzp(Object obj, long j2, boolean z) {
        zzf.zze(obj, j2, z);
    }

    public static void zzq(byte[] bArr, long j2, byte b) {
        zzf.zzf(bArr, zza + j2, b);
    }

    public static void zzr(Object obj, long j2, double d2) {
        zzf.zzg(obj, j2, d2);
    }

    public static void zzs(Object obj, long j2, float f2) {
        zzf.zzh(obj, j2, f2);
    }

    public static void zzt(Object obj, long j2, int i2) {
        zzf.zzp(obj, j2, i2);
    }

    public static void zzu(Object obj, long j2, long j3) {
        zzf.zzq(obj, j2, j3);
    }

    public static void zzv(Object obj, long j2, Object obj2) {
        zzf.zzr(obj, j2, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzw(Object obj, long j2) {
        return ((byte) ((zzf.zzl(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzx(Object obj, long j2) {
        return ((byte) ((zzf.zzl(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzy(Class cls) {
        int i2 = zzgir.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzz(Object obj, long j2) {
        return zzf.zzi(obj, j2);
    }
}
