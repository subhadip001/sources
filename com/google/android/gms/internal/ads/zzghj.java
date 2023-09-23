package com.google.android.gms.internal.ads;

import java.security.interfaces.ECPrivateKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzghj implements zzfwk {
    private final ECPrivateKey zza;
    private final zzghl zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzghi zze;

    public zzghj(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i2, zzghi zzghiVar) {
        this.zza = eCPrivateKey;
        this.zzb = new zzghl(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzghiVar;
    }
}
