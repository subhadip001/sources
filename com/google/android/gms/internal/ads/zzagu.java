package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagu extends zzyi {
    public zzagu(zzee zzeeVar, long j2, long j3) {
        super(new zzyd(), new zzagt(zzeeVar, null), j2, 0L, j2 + 1, 0L, j3, 188L, 1000);
    }

    public static /* bridge */ /* synthetic */ int zzh(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }
}
