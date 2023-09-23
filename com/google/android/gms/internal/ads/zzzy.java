package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzzy {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzzy(int i2, byte[] bArr, int i3, int i4) {
        this.zza = i2;
        this.zzb = bArr;
        this.zzc = i3;
        this.zzd = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzy.class == obj.getClass()) {
            zzzy zzzyVar = (zzzy) obj;
            if (this.zza == zzzyVar.zza && this.zzc == zzzyVar.zzc && this.zzd == zzzyVar.zzd && Arrays.equals(this.zzb, zzzyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zzb) + (this.zza * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
