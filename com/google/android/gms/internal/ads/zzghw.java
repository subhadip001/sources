package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzghw implements zzghy {
    @Override // com.google.android.gms.internal.ads.zzghy
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }
}
