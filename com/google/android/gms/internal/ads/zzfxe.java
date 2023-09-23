package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfxe implements zzfxh {
    public final /* synthetic */ zzgar zza;

    public zzfxe(zzgar zzgarVar) {
        this.zza = zzgarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final zzfwm zza(Class cls) {
        try {
            return new zzfwo(this.zza, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final zzfwm zzb() {
        zzgar zzgarVar = this.zza;
        return new zzfwo(zzgarVar, zzgarVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final Class zzc() {
        return this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final Class zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final Set zze() {
        return this.zza.zzl();
    }
}
