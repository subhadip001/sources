package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeyr {
    private final zzfdn zza;
    private final zzdbb zzb;
    private final Executor zzc;
    private zzeyq zzd;

    public zzeyr(zzfdn zzfdnVar, zzdbb zzdbbVar, Executor executor) {
        this.zza = zzfdnVar;
        this.zzb = zzdbbVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfdx zze() {
        zzfby zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final zzfvj zzc() {
        zzfvj zzf;
        zzeyq zzeyqVar = this.zzd;
        if (zzeyqVar == null) {
            if (!((Boolean) zzbju.zza.zze()).booleanValue()) {
                zzeyq zzeyqVar2 = new zzeyq(null, zze(), null);
                this.zzd = zzeyqVar2;
                zzf = zzfva.zzi(zzeyqVar2);
            } else {
                zzf = zzfva.zzf(zzfva.zzm(zzfur.zzv(this.zzb.zzb().zze(this.zza.zza())), new zzeyo(this), this.zzc), zzebm.class, new zzeyn(this), this.zzc);
            }
            return zzfva.zzm(zzf, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzeym
                @Override // com.google.android.gms.internal.ads.zzfoi
                public final Object apply(Object obj) {
                    return (zzeyq) obj;
                }
            }, this.zzc);
        }
        return zzfva.zzi(zzeyqVar);
    }
}
