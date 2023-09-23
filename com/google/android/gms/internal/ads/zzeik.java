package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeik implements zzfuw {
    public final /* synthetic */ long zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzfbg zzc;
    public final /* synthetic */ zzfbj zzd;
    public final /* synthetic */ zzfic zze;
    public final /* synthetic */ zzfbs zzf;
    public final /* synthetic */ zzeil zzg;

    public zzeik(zzeil zzeilVar, long j2, String str, zzfbg zzfbgVar, zzfbj zzfbjVar, zzfic zzficVar, zzfbs zzfbsVar) {
        this.zzg = zzeilVar;
        this.zza = j2;
        this.zzb = str;
        this.zzc = zzfbgVar;
        this.zzd = zzfbjVar;
        this.zze = zzficVar;
        this.zzf = zzfbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        Clock clock;
        int i2;
        boolean z;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzefd zzefdVar;
        zzfig zzfigVar;
        zzeim zzeimVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i2 = 2;
        } else if (th instanceof zzeia) {
            i2 = 3;
        } else if (th instanceof CancellationException) {
            i2 = 4;
        } else if (th instanceof zzfcd) {
            i2 = 5;
        } else {
            i2 = ((th instanceof zzdzk) && zzfcx.zza(th).zza == 3) ? 1 : 6;
        }
        zzeil.zzg(this.zzg, this.zzb, i2, elapsedRealtime, this.zzc.zzah);
        zzeil zzeilVar = this.zzg;
        z = zzeilVar.zze;
        if (z) {
            zzeimVar = zzeilVar.zzb;
            zzeimVar.zza(this.zzd, this.zzc, i2, th instanceof zzefc ? (zzefc) th : null, elapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgV)).booleanValue()) {
            zzfigVar = this.zzg.zzc;
            zzfic zzficVar = this.zze;
            zzfbs zzfbsVar = this.zzf;
            zzfbg zzfbgVar = this.zzc;
            zzfigVar.zzd(zzficVar.zza(zzfbsVar, zzfbgVar, zzfbgVar.zzo));
        }
        com.google.android.gms.ads.internal.client.zze zza = zzfcx.zza(th);
        int i3 = zza.zza;
        if ((i3 == 3 || i3 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza = zzfcx.zza(new zzefc(13, zza.zzd));
        }
        zzefdVar = this.zzg.zzf;
        zzefdVar.zze(this.zzc, elapsedRealtime, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        zzefd zzefdVar;
        zzeim zzeimVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        zzeil.zzg(this.zzg, this.zzb, 0, elapsedRealtime, this.zzc.zzah);
        zzeil zzeilVar = this.zzg;
        z = zzeilVar.zze;
        if (z) {
            zzeimVar = zzeilVar.zzb;
            zzeimVar.zza(this.zzd, this.zzc, 0, null, elapsedRealtime);
        }
        zzefdVar = this.zzg.zzf;
        zzefdVar.zzf(this.zzc, elapsedRealtime, null);
    }
}
