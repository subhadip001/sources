package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzamr {
    public static boolean zza = false;
    private static MessageDigest zzc;
    private static final Object zzd = new Object();
    private static final Object zze = new Object();
    public static final CountDownLatch zzb = new CountDownLatch(1);

    public static String zza(zzaly zzalyVar, String str) {
        byte[] zzg;
        byte[] zzau = zzalyVar.zzau();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzct)).booleanValue()) {
            Vector zzb2 = zzb(zzau, 255);
            if (zzb2 != null && zzb2.size() != 0) {
                zzamk zza2 = zzaml.zza();
                int size = zzb2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    zza2.zza(zzgjg.zzv(zzg((byte[]) zzb2.get(i2), str, false)));
                }
                zza2.zzb(zzgjg.zzv(zze(zzau)));
                zzg = ((zzaml) zza2.zzaj()).zzau();
            } else {
                zzg = zzg(zzf(4096).zzau(), str, true);
            }
        } else if (zzapd.zza != null) {
            byte[] zza3 = zzapd.zza.zza(zzau, str != null ? str.getBytes() : new byte[0]);
            zzamk zza4 = zzaml.zza();
            zza4.zza(zzgjg.zzv(zza3));
            zza4.zzc(3);
            zzg = ((zzaml) zza4.zzaj()).zzau();
        } else {
            throw new GeneralSecurityException();
        }
        return zzamn.zza(zzg, true);
    }

    public static Vector zzb(byte[] bArr, int i2) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i3 = (length + 254) / 255;
        Vector vector = new Vector();
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i5 > 255) {
                    length2 = i5 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i5, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zzd() {
        synchronized (zze) {
            if (!zza) {
                zza = true;
                new Thread(new zzamq(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x001e, code lost:
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzamr.zzc.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] zze(byte[] r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzamr.zzd
            monitor-enter(r0)
            zzd()     // Catch: java.lang.Throwable -> L34
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzamr.zzb     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            r3 = 2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            boolean r2 = r2.await(r3, r5)     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            if (r2 != 0) goto L14
            goto L1c
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzamr.zzc     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L19
            goto L1c
        L19:
            r1 = r2
            goto L1c
        L1b:
        L1c:
            if (r1 == 0) goto L2c
            r1.reset()     // Catch: java.lang.Throwable -> L34
            r1.update(r6)     // Catch: java.lang.Throwable -> L34
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzamr.zzc     // Catch: java.lang.Throwable -> L34
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r6
        L2c:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L34
            throw r6     // Catch: java.lang.Throwable -> L34
        L34:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamr.zze(byte[]):byte[]");
    }

    public static zzaly zzf(int i2) {
        zzali zza2 = zzaly.zza();
        zza2.zzA(4096L);
        return (zzaly) zza2.zzaj();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z) {
        byte[] array;
        int i2 = true != z ? 255 : 239;
        if (bArr.length > i2) {
            bArr = zzf(4096).zzau();
        }
        int length = bArr.length;
        if (length < i2) {
            byte[] bArr2 = new byte[i2 - length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i2 + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i2 + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            array = ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzams[] zzamsVarArr = new zzanr().zzcG;
        int length2 = zzamsVarArr.length;
        for (int i3 = 0; i3 < 12; i3++) {
            zzamsVarArr[i3].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzgin(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
