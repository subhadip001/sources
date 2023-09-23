package com.google.android.gms.internal.consent_sdk;

import f.h.b.e.g;
import f.h.b.e.h;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes.dex */
public final class zzba {
    private final zzcl<zzas> zza;
    private final AtomicReference<zzbc> zzb = new AtomicReference<>();

    public zzba(zzcl<zzas> zzclVar) {
        this.zza = zzclVar;
    }

    public final void zza(h hVar, g gVar) {
        zzcd.zza();
        zzbc zzbcVar = this.zzb.get();
        if (zzbcVar == null) {
            gVar.onConsentFormLoadFailure(new zzj(3, "No available form can be built.").zza());
            return;
        }
        zzas zzb = this.zza.zzb();
        zzb.zza(zzbcVar);
        zzb.zzb().zza().zzb(hVar, gVar);
    }

    public final void zzb(zzbc zzbcVar) {
        this.zzb.set(zzbcVar);
    }

    public final boolean zzc() {
        return this.zzb.get() != null;
    }
}
