package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzak extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzbtz zzd;
    public final /* synthetic */ zzau zze;

    public zzak(zzau zzauVar, Context context, zzq zzqVar, String str, zzbtz zzbtzVar) {
        this.zze = zzauVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        this.zzd = zzbtzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "interstitial");
        return new zzer();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) {
        return zzccVar.zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 221310000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() {
        zzk zzkVar;
        zzkVar = this.zze.zza;
        return zzkVar.zza(this.zza, this.zzb, this.zzc, this.zzd, 2);
    }
}
