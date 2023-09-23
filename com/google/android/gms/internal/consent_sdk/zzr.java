package com.google.android.gms.internal.consent_sdk;

import f.h.b.e.d;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzr implements Runnable {
    public final /* synthetic */ zzv zza;
    public final /* synthetic */ d zzb;

    public /* synthetic */ zzr(zzv zzvVar, d dVar) {
        this.zza = zzvVar;
        this.zzb = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zzb);
    }
}
