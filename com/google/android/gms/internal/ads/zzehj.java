package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzehj implements zzefg {
    private final Context zza;
    private final zzdkx zzb;

    public zzehj(Context context, zzdkx zzdkxVar) {
        this.zza = context;
        this.zzb = zzdkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final /* bridge */ /* synthetic */ Object zza(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) {
        zzehd zzehdVar = new zzehd(zzfbgVar, (zzbvs) zzefbVar.zzb, false);
        zzdjz zze = this.zzb.zze(new zzcyl(zzfbsVar, zzfbgVar, zzefbVar.zza), new zzdkc(zzehdVar, null));
        zzehdVar.zzb(zze.zzc());
        ((zzegu) zzefbVar.zzc).zzc(zze.zzh());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzefg
    public final void zzb(zzfbs zzfbsVar, zzfbg zzfbgVar, zzefb zzefbVar) {
        try {
            ((zzbvs) zzefbVar.zzb).zzp(zzfbgVar.zzaa);
            ((zzbvs) zzefbVar.zzb).zzk(zzfbgVar.zzV, zzfbgVar.zzw.toString(), zzfbsVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehi(this, zzefbVar, null), (zzbuf) zzefbVar.zzc);
        } catch (RemoteException e2) {
            throw new zzfcd(e2);
        }
    }
}
