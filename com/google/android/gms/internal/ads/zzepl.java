package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzepl implements zzetb {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzetb zzc;
    private final long zzd;

    public zzepl(zzetb zzetbVar, long j2, Clock clock) {
        this.zzb = clock;
        this.zzc = zzetbVar;
        this.zzd = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        zzepk zzepkVar = (zzepk) this.zza.get();
        if (zzepkVar == null || zzepkVar.zza()) {
            zzepkVar = new zzepk(this.zzc.zzb(), this.zzd, this.zzb);
            this.zza.set(zzepkVar);
        }
        return zzepkVar.zza;
    }
}
