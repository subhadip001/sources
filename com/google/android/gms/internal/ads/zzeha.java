package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeha implements zzdlf {
    private final Context zza;
    private final zzcfo zzb;
    private final zzfvj zzc;
    private final zzfbg zzd;
    private final zzcli zze;
    private final zzfby zzf;
    private final zzboo zzg;
    private final boolean zzh;

    public zzeha(Context context, zzcfo zzcfoVar, zzfvj zzfvjVar, zzfbg zzfbgVar, zzcli zzcliVar, zzfby zzfbyVar, boolean z, zzboo zzbooVar) {
        this.zza = context;
        this.zzb = zzcfoVar;
        this.zzc = zzfvjVar;
        this.zzd = zzfbgVar;
        this.zze = zzcliVar;
        this.zzf = zzfbyVar;
        this.zzg = zzbooVar;
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final void zza(boolean z, Context context, zzdcf zzdcfVar) {
        zzdjz zzdjzVar = (zzdjz) zzfva.zzq(this.zzc);
        this.zze.zzap(true);
        boolean zze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzE = com.google.android.gms.ads.internal.util.zzs.zzE(this.zza);
        boolean z2 = this.zzh;
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zze, zzE, z2 ? this.zzg.zzd() : false, z2 ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzP, false);
        if (zzdcfVar != null) {
            zzdcfVar.zzf();
        }
        com.google.android.gms.ads.internal.zzt.zzj();
        zzdku zzj = zzdjzVar.zzj();
        zzcli zzcliVar = this.zze;
        zzfbg zzfbgVar = this.zzd;
        int i2 = zzfbgVar.zzR;
        zzcfo zzcfoVar = this.zzb;
        String str = zzfbgVar.zzC;
        zzfbl zzfblVar = zzfbgVar.zzt;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((com.google.android.gms.ads.internal.client.zza) null, zzj, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcliVar, i2, zzcfoVar, str, zzjVar, zzfblVar.zzb, zzfblVar.zza, this.zzf.zzf, zzdcfVar), true);
    }
}
