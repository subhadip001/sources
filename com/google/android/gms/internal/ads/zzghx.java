package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzghx implements zzghy {
    @Override // com.google.android.gms.internal.ads.zzghy
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
