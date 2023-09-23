package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfwq {
    public static zzfwp zza(String str) {
        if (zzfxi.zzj().containsKey(str)) {
            return (zzfwp) zzfxi.zzj().get(str);
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
