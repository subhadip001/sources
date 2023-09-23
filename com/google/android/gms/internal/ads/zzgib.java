package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgib {
    private final byte[] zza;

    private zzgib(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i3);
    }

    public static zzgib zza(byte[] bArr, int i2, int i3) {
        return new zzgib(bArr, 0, i3);
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
