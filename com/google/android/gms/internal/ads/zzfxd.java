package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfxd implements zzfxh {
    public final /* synthetic */ zzfwm zza;

    public zzfxd(zzfwm zzfwmVar) {
        this.zza = zzfwmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final zzfwm zza(Class cls) {
        if (this.zza.zzc().equals(cls)) {
            return this.zza;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    public final zzfwm zzb() {
        return this.zza;
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
        return Collections.singleton(this.zza.zzc());
    }
}
