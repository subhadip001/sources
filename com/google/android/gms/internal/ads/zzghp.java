package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzghp implements zzfwd {
    private final zzgic zza;
    private final zzfwv zzb;
    private final int zzc;

    public zzghp(zzgic zzgicVar, zzfwv zzfwvVar, int i2) {
        this.zza = zzgicVar;
        this.zzb = zzfwvVar;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i2 = this.zzc;
        if (length >= i2) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i2);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, length - this.zzc, length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.zzb.zza(copyOfRange2, zzghf.zzc(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] zzb = this.zza.zzb(bArr);
        return zzghf.zzc(zzb, this.zzb.zzb(zzghf.zzc(bArr2, zzb, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
