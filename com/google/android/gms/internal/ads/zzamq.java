package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzamq implements Runnable {
    private zzamq() {
    }

    public /* synthetic */ zzamq(zzamp zzampVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzamr.zzc(MessageDigest.getInstance("MD5"));
            countDownLatch = zzamr.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzamr.zzb;
        } catch (Throwable th) {
            zzamr.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
