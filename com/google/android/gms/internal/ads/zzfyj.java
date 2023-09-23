package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfyj implements zzfwd {
    private static final byte[] zza = new byte[0];
    private final zzgfm zzb;
    private final zzfwd zzc;

    public zzfyj(zzgfm zzgfmVar, zzfwd zzfwdVar) {
        this.zzb = zzgfmVar;
        this.zzc = zzfwdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i2 = wrap.getInt();
            if (i2 > 0 && i2 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i2];
                wrap.get(bArr3, 0, i2);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                return ((zzfwd) zzfxi.zzh(this.zzb.zzf(), this.zzc.zza(bArr3, zza), zzfwd.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e2) {
            throw new GeneralSecurityException("invalid ciphertext", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] zzau = zzfxi.zzd(this.zzb).zzau();
        byte[] zzb = this.zzc.zzb(zzau, zza);
        byte[] zzb2 = ((zzfwd) zzfxi.zzh(this.zzb.zzf(), zzau, zzfwd.class)).zzb(bArr, bArr2);
        int length = zzb.length;
        return ByteBuffer.allocate(length + 4 + zzb2.length).putInt(length).put(zzb).put(zzb2).array();
    }
}
