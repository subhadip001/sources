package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzehu implements zzefg {
    private final Context zza;
    private final zzdlt zzb;
    private final Executor zzc;

    public zzehu(Context context, zzdlt zzdltVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdltVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfbs zzfbsVar, int i2) {
        return zzfbsVar.zza.zza.zzg.contains(Integer.toString(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) {
        zzdng zzac;
        zzbuk zzB = ((zzfct) zzefbVar.zzb).zzB();
        zzbul zzC = ((zzfct) zzefbVar.zzb).zzC();
        zzbuo zzd = ((zzfct) zzefbVar.zzb).zzd();
        if (zzd != null && zzc(zzfbsVar, 6)) {
            zzac = zzdng.zzs(zzd);
        } else if (zzB != null && zzc(zzfbsVar, 6)) {
            zzac = zzdng.zzad(zzB);
        } else if (zzB != null && zzc(zzfbsVar, 2)) {
            zzac = zzdng.zzab(zzB);
        } else if (zzC != null && zzc(zzfbsVar, 6)) {
            zzac = zzdng.zzae(zzC);
        } else if (zzC != null && zzc(zzfbsVar, 1)) {
            zzac = zzdng.zzac(zzC);
        } else {
            throw new zzeio(1, "No native ad mappers");
        }
        if (zzfbsVar.zza.zza.zzg.contains(Integer.toString(zzac.zzc()))) {
            zzdni zze = this.zzb.zze(new zzcyl(zzfbsVar, zzfbgVar, zzefbVar.zza), new zzdns(zzac), new zzdpg(zzC, zzB, zzd, null));
            ((zzegu) zzefbVar.zzc).zzc(zze.zzi());
            zze.zzd().zzj(new zzcti((zzfct) zzefbVar.zzb), this.zzc);
            return zze.zza();
        }
        throw new zzeio(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final void zzb(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) {
        zzfby zzfbyVar = zzfbsVar.zza.zza;
        ((zzfct) zzefbVar.zzb).zzo(this.zza, zzfbsVar.zza.zza.zzd, zzfbgVar.zzw.toString(), com.google.android.gms.ads.internal.util.zzbu.zzl(zzfbgVar.zzt), (zzbuf) zzefbVar.zzc, zzfbyVar.zzi, zzfbyVar.zzg);
    }
}
