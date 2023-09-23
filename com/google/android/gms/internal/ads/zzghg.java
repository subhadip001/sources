package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzghg implements zzfwd {
    private final zzfyv zza;

    public zzghg(byte[] bArr) {
        this.zza = new zzfyv(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.zza.zzc(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] zza = zzgii.zza(12);
        allocate.put(zza);
        this.zza.zzb(allocate, zza, bArr, bArr2);
        return allocate.array();
    }
}
