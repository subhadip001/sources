package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaud {
    public final int zza = 1;
    public final byte[] zzb;

    public zzaud(int i2, byte[] bArr) {
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzaud.class == obj.getClass() && Arrays.equals(this.zzb, ((zzaud) obj).zzb);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzb) + 31;
    }
}
