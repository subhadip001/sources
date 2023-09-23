package com.google.android.gms.internal.consent_sdk;

import f.h.b.e.c;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzs implements Runnable {
    public final /* synthetic */ c zza;
    public final /* synthetic */ zzj zzb;

    public /* synthetic */ zzs(c cVar, zzj zzjVar) {
        this.zza = cVar;
        this.zzb = zzjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.a(this.zzb.zza());
    }
}
