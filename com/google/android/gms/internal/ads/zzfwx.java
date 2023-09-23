package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfwx {
    private final Object zza;
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    public zzfwx(Object obj, byte[] bArr, int i2, int i3, int i4) {
        this.zza = obj;
        this.zzb = Arrays.copyOf(bArr, bArr.length);
        this.zzc = i2;
        this.zzd = i3;
    }

    public final Object zza() {
        return this.zza;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zzb;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd() {
        return this.zzd;
    }
}
