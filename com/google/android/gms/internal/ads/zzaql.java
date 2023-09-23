package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaql {
    public static final String zza = "zzaql";
    private final zzapc zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzaql(zzapc zzapcVar, String str, String str2, Class... clsArr) {
        this.zzb = zzapcVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzapcVar.zzk().submit(new zzaqk(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzaql zzaqlVar) {
        CountDownLatch countDownLatch;
        Class loadClass;
        try {
            zzapc zzapcVar = zzaqlVar.zzb;
            loadClass = zzapcVar.zzi().loadClass(zzaqlVar.zzc(zzapcVar.zzu(), zzaqlVar.zzc));
        } catch (zzaoh | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = zzaqlVar.zzg;
        } catch (Throwable th) {
            zzaqlVar.zzg.countDown();
            throw th;
        }
        if (loadClass == null) {
            countDownLatch = zzaqlVar.zzg;
        } else {
            zzaqlVar.zze = loadClass.getMethod(zzaqlVar.zzc(zzaqlVar.zzb.zzu(), zzaqlVar.zzd), zzaqlVar.zzf);
            if (zzaqlVar.zze == null) {
                countDownLatch = zzaqlVar.zzg;
            }
            countDownLatch = zzaqlVar.zzg;
        }
        countDownLatch.countDown();
    }

    private final String zzc(byte[] bArr, String str) {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
