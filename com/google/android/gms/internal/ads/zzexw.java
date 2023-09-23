package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzexw implements zzeyv {
    private zzdbb zza;
    private final Executor zzb = zzfvq.zzb();

    public final zzdbb zza() {
        return this.zza;
    }

    public final zzfvj zzb(zzeyw zzeywVar, zzeyu zzeyuVar, zzdbb zzdbbVar) {
        zzdba zza = zzeyuVar.zza(zzeywVar.zzb);
        zza.zzb(new zzezb(true));
        zzdbb zzdbbVar2 = (zzdbb) zza.zzh();
        this.zza = zzdbbVar2;
        final zzcyz zzb = zzdbbVar2.zzb();
        final zzfdw zzfdwVar = new zzfdw();
        return zzfva.zzm(zzfva.zzn(zzfur.zzv(zzb.zzi()), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzexu
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                zzfdw zzfdwVar2 = zzfdwVar;
                zzcyz zzcyzVar = zzb;
                zzfbs zzfbsVar = (zzfbs) obj;
                zzfdwVar2.zzb = zzfbsVar;
                Iterator it = zzfbsVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : ((zzfbg) it.next()).zza) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zzcyzVar.zzh(zzfva.zzi(zzfbsVar));
                    }
                }
                return zzfva.zzi(null);
            }
        }, this.zzb), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzexv
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                zzfdw zzfdwVar2 = zzfdw.this;
                zzfdwVar2.zzc = (zzcxw) obj;
                return zzfdwVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ zzfvj zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzb(zzeywVar, zzeyuVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
