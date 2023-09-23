package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeyb implements zzeyv {
    private final zzeyv zza;
    private final zzeyv zzb;
    private final zzfej zzc;
    private final String zzd;
    private zzdbb zze;
    private final Executor zzf;

    public zzeyb(zzeyv zzeyvVar, zzeyv zzeyvVar2, zzfej zzfejVar, String str, Executor executor) {
        this.zza = zzeyvVar;
        this.zzb = zzeyvVar2;
        this.zzc = zzfejVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final zzfvj zzg(zzfdw zzfdwVar, zzeyw zzeywVar) {
        zzdbb zzdbbVar = zzfdwVar.zza;
        this.zze = zzdbbVar;
        if (zzfdwVar.zzc != null) {
            if (zzdbbVar.zzf() != null) {
                zzfdwVar.zzc.zzo().zzbL(zzfdwVar.zza.zzf());
            }
            return zzfva.zzi(zzfdwVar.zzc);
        }
        zzdbbVar.zzb().zzk(zzfdwVar.zzb);
        return ((zzeyl) this.zza).zzb(zzeywVar, null, zzfdwVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    /* renamed from: zza */
    public final synchronized zzdbb zzd() {
        return this.zze;
    }

    public final /* synthetic */ zzfvj zzb(zzeyw zzeywVar, zzeya zzeyaVar, zzeyu zzeyuVar, zzdbb zzdbbVar, zzeyg zzeygVar) {
        if (zzeygVar != null) {
            zzeya zzeyaVar2 = new zzeya(zzeyaVar.zza, zzeyaVar.zzb, zzeyaVar.zzc, zzeyaVar.zzd, zzeyaVar.zze, zzeyaVar.zzf, zzeygVar.zza);
            if (zzeygVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzeyaVar2);
                return zzg(zzeygVar.zzc, zzeywVar);
            }
            zzfvj zza = this.zzc.zza(zzeyaVar2);
            if (zza != null) {
                this.zze = null;
                return zzfva.zzn(zza, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzexx
                    @Override // com.google.android.gms.internal.ads.zzfuh
                    public final zzfvj zza(Object obj) {
                        return zzeyb.this.zze((zzfeg) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzeyaVar2);
            zzeywVar = new zzeyw(zzeywVar.zzb, zzeygVar.zzb);
        }
        zzfvj zzb = ((zzeyl) this.zza).zzb(zzeywVar, zzeyuVar, zzdbbVar);
        this.zze = zzdbbVar;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeyv
    public final /* bridge */ /* synthetic */ zzfvj zzc(zzeyw zzeywVar, zzeyu zzeyuVar, Object obj) {
        return zzf(zzeywVar, zzeyuVar, null);
    }

    public final /* synthetic */ zzfvj zze(zzfeg zzfegVar) {
        zzfei zzfeiVar;
        if (zzfegVar != null && zzfegVar.zza != null && (zzfeiVar = zzfegVar.zzb) != null) {
            zzbea zza = zzbeg.zza();
            zzbdy zza2 = zzbdz.zza();
            zza2.zzd(2);
            zza2.zzb(zzbed.zzd());
            zza.zza(zza2);
            zzfegVar.zza.zza.zzb().zzc().zzi((zzbeg) zza.zzaj());
            return zzg(zzfegVar.zza, ((zzeya) zzfeiVar).zzb);
        }
        throw new zzdzk(1, "Empty prefetch");
    }

    public final synchronized zzfvj zzf(final zzeyw zzeywVar, final zzeyu zzeyuVar, zzdbb zzdbbVar) {
        zzdba zza = zzeyuVar.zza(zzeywVar.zzb);
        zza.zza(new zzeyc(this.zzd));
        final zzdbb zzdbbVar2 = (zzdbb) zza.zzh();
        zzdbbVar2.zzg();
        zzdbbVar2.zzg();
        com.google.android.gms.ads.internal.client.zzl zzlVar = zzdbbVar2.zzg().zzd;
        if (zzlVar.zzs == null && zzlVar.zzx == null) {
            zzfby zzg = zzdbbVar2.zzg();
            final zzeya zzeyaVar = new zzeya(zzeyuVar, zzeywVar, zzg.zzd, zzg.zzf, this.zzf, zzg.zzj, null);
            return zzfva.zzn(zzfur.zzv(((zzeyh) this.zzb).zzb(zzeywVar, zzeyuVar, zzdbbVar2)), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzexy
                @Override // com.google.android.gms.internal.ads.zzfuh
                public final zzfvj zza(Object obj) {
                    return zzeyb.this.zzb(zzeywVar, zzeyaVar, zzeyuVar, zzdbbVar2, (zzeyg) obj);
                }
            }, this.zzf);
        }
        this.zze = zzdbbVar2;
        return ((zzeyl) this.zza).zzb(zzeywVar, zzeyuVar, zzdbbVar2);
    }
}
