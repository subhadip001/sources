package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfxf implements zzfxh {
    public final /* synthetic */ zzgas zza;
    public final /* synthetic */ zzgar zzb;

    public zzfxf(zzgas zzgasVar, zzgar zzgarVar) {
        this.zza = zzgasVar;
        this.zzb = zzgarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final zzfwm zza(Class cls) {
        try {
            return new zzfxc(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final zzfwm zzb() {
        zzgas zzgasVar = this.zza;
        return new zzfxc(zzgasVar, this.zzb, zzgasVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final Class zzd() {
        return this.zzb.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final Set zze() {
        return this.zza.zzl();
    }
}
