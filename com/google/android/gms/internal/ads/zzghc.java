package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzghc implements zzfwd {
    private final zzfys zza;

    public zzghc(byte[] bArr) {
        if (zzfzc.zza(2)) {
            this.zza = new zzfys(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        return this.zza.zza(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        return this.zza.zzb(zzgii.zza(12), bArr, bArr2);
    }
}
