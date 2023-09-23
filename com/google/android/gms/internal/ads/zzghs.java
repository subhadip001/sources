package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzghs implements zzghy {
    @Override // com.google.android.gms.internal.ads.zzghy
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
