package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzhe implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzhx zzb;

    public zzhe(zzhx zzhxVar, long j2) {
        this.zzb = zzhxVar;
        this.zza = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzL(this.zza, true);
        this.zzb.zzt.zzt().zzu(new AtomicReference());
    }
}
