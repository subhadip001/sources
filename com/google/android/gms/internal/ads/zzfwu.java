package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfwu {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzfwt zza(String str) {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzfwt zzfwtVar = (zzfwt) it.next();
            if (zzfwtVar.zza()) {
                return zzfwtVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
