package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzfvk;
import com.google.android.gms.internal.ads.zzgpu;
import com.google.android.gms.internal.ads.zzgqc;
import com.google.android.gms.internal.ads.zzgqh;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzak implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzak(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza */
    public final zzaj zzb() {
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        return new zzaj(zzfvkVar, ((zzeaj) this.zzb).zzb());
    }
}
