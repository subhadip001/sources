package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgii {
    private static final ThreadLocal zza = new zzgih();

    public static byte[] zza(int i2) {
        byte[] bArr = new byte[i2];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }
}
