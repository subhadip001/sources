package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzyr implements zzzz {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzzz
    public final /* synthetic */ int zze(zzp zzpVar, int i2, boolean z) {
        return zzzx.zza(this, zzpVar, i2, true);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final int zzf(zzp zzpVar, int i2, boolean z, int i3) {
        int zza = zzpVar.zza(this.zza, 0, Math.min(4096, i2));
        if (zza == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzk(zzad zzadVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final /* synthetic */ void zzq(zzdy zzdyVar, int i2) {
        zzzx.zzb(this, zzdyVar, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzr(zzdy zzdyVar, int i2, int i3) {
        zzdyVar.zzG(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzzz
    public final void zzs(long j2, int i2, int i3, int i4, zzzy zzzyVar) {
    }
}
