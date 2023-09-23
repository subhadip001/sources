package com.google.android.gms.internal.consent_sdk;

import f.h.b.e.b;
import f.h.b.e.f;
import f.h.b.e.g;
import f.h.b.e.h;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes.dex */
public final class zzax implements h, g {
    private final h zza;
    private final g zzb;

    public /* synthetic */ zzax(h hVar, g gVar, zzav zzavVar) {
        this.zza = hVar;
        this.zzb = gVar;
    }

    @Override // f.h.b.e.g
    public final void onConsentFormLoadFailure(f fVar) {
        this.zzb.onConsentFormLoadFailure(fVar);
    }

    @Override // f.h.b.e.h
    public final void onConsentFormLoadSuccess(b bVar) {
        this.zza.onConsentFormLoadSuccess(bVar);
    }
}
