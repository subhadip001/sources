package com.google.android.gms.measurement.internal;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zziy extends zzap {
    public final /* synthetic */ zzjm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziy(zzjm zzjmVar, zzgm zzgmVar) {
        super(zzgmVar);
        this.zza = zzjmVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        a.L(this.zza.zzt, "Tasks have been queued for a long time");
    }
}
