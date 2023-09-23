package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfby {
    public final com.google.android.gms.ads.internal.client.zzfg zza;
    public final zzbqr zzb;
    public final zzemc zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbko zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzbz zzn;
    public final zzfbo zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final com.google.android.gms.ads.internal.client.zzcd zzr;

    public /* synthetic */ zzfby(zzfbw zzfbwVar, zzfbx zzfbxVar) {
        com.google.android.gms.ads.internal.client.zzfg zzfgVar;
        zzbko zzbkoVar;
        this.zze = zzfbw.zzf(zzfbwVar);
        this.zzf = zzfbw.zzH(zzfbwVar);
        this.zzr = zzfbw.zzP(zzfbwVar);
        int i2 = zzfbw.zzd(zzfbwVar).zza;
        long j2 = zzfbw.zzd(zzfbwVar).zzb;
        Bundle bundle = zzfbw.zzd(zzfbwVar).zzc;
        int i3 = zzfbw.zzd(zzfbwVar).zzd;
        List list = zzfbw.zzd(zzfbwVar).zze;
        boolean z = zzfbw.zzd(zzfbwVar).zzf;
        int i4 = zzfbw.zzd(zzfbwVar).zzg;
        boolean z2 = true;
        if (!zzfbw.zzd(zzfbwVar).zzh && !zzfbw.zzN(zzfbwVar)) {
            z2 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i2, j2, bundle, i3, list, z, i4, z2, zzfbw.zzd(zzfbwVar).zzi, zzfbw.zzd(zzfbwVar).zzj, zzfbw.zzd(zzfbwVar).zzk, zzfbw.zzd(zzfbwVar).zzl, zzfbw.zzd(zzfbwVar).zzm, zzfbw.zzd(zzfbwVar).zzn, zzfbw.zzd(zzfbwVar).zzo, zzfbw.zzd(zzfbwVar).zzp, zzfbw.zzd(zzfbwVar).zzq, zzfbw.zzd(zzfbwVar).zzr, zzfbw.zzd(zzfbwVar).zzs, zzfbw.zzd(zzfbwVar).zzt, zzfbw.zzd(zzfbwVar).zzu, zzfbw.zzd(zzfbwVar).zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfbw.zzd(zzfbwVar).zzw), zzfbw.zzd(zzfbwVar).zzx);
        if (zzfbw.zzj(zzfbwVar) != null) {
            zzfgVar = zzfbw.zzj(zzfbwVar);
        } else {
            zzfgVar = zzfbw.zzk(zzfbwVar) != null ? zzfbw.zzk(zzfbwVar).zzf : null;
        }
        this.zza = zzfgVar;
        this.zzg = zzfbw.zzJ(zzfbwVar);
        this.zzh = zzfbw.zzK(zzfbwVar);
        if (zzfbw.zzJ(zzfbwVar) == null) {
            zzbkoVar = null;
        } else {
            zzbkoVar = zzfbw.zzk(zzfbwVar) == null ? new zzbko(new NativeAdOptions.Builder().build()) : zzfbw.zzk(zzfbwVar);
        }
        this.zzi = zzbkoVar;
        this.zzj = zzfbw.zzh(zzfbwVar);
        this.zzk = zzfbw.zza(zzfbwVar);
        this.zzl = zzfbw.zzb(zzfbwVar);
        this.zzm = zzfbw.zzc(zzfbwVar);
        this.zzn = zzfbw.zzi(zzfbwVar);
        this.zzb = zzfbw.zzl(zzfbwVar);
        this.zzo = new zzfbo(zzfbw.zzn(zzfbwVar), null);
        this.zzp = zzfbw.zzL(zzfbwVar);
        this.zzc = zzfbw.zzm(zzfbwVar);
        this.zzq = zzfbw.zzM(zzfbwVar);
    }

    public final zzbmr zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }
}
