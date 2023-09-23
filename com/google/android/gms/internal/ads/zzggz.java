package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzggz extends ThreadLocal {
    public static final Cipher zza() {
        try {
            return (Cipher) zzghq.zza.zza("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
