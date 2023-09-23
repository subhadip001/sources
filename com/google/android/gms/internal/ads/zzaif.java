package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaif extends zzaig {
    private final byte[] zza;

    public zzaif(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaig, java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.zza;
    }
}
