package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeix implements zzefg {
    private final Context zza;
    private final zzdsx zzb;

    public zzeix(Context context, zzdsx zzdsxVar) {
        this.zza = context;
        this.zzb = zzdsxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) {
        zzehd zzehdVar = new zzehd(zzfbgVar, (zzbvs) zzefbVar.zzb, true);
        zzdst zze = this.zzb.zze(new zzcyl(zzfbsVar, zzfbgVar, zzefbVar.zza), new zzdsu(zzehdVar));
        zzehdVar.zzb(zze.zzc());
        ((zzegu) zzefbVar.zzc).zzc(zze.zzn());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final void zzb(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) {
        try {
            ((zzbvs) zzefbVar.zzb).zzp(zzfbgVar.zzaa);
            if (zzfbsVar.zza.zza.zzo.zza == 3) {
                ((zzbvs) zzefbVar.zzb).zzn(zzfbgVar.zzV, zzfbgVar.zzw.toString(), zzfbsVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeiw(this, zzefbVar, null), (zzbuf) zzefbVar.zzc);
            } else {
                ((zzbvs) zzefbVar.zzb).zzo(zzfbgVar.zzV, zzfbgVar.zzw.toString(), zzfbsVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeiw(this, zzefbVar, null), (zzbuf) zzefbVar.zzc);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e2);
        }
    }
}
