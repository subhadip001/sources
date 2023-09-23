package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcah extends zzcaj {
    private final String zza;
    private final int zzb;

    public zzcah(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcah)) {
            zzcah zzcahVar = (zzcah) obj;
            if (Objects.equal(this.zza, zzcahVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzcahVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcak
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcak
    public final String zzc() {
        return this.zza;
    }
}
