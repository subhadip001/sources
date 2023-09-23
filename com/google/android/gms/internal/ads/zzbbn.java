package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbbn {
    private static MessageDigest zzb;
    public final Object zza = new Object();

    public final MessageDigest zza() {
        synchronized (this.zza) {
            MessageDigest messageDigest = zzb;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    zzb = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return zzb;
        }
    }

    public abstract byte[] zzb(String str);
}
