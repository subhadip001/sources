package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzcbp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzat extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbtz zzc;
    public final /* synthetic */ zzau zzd;

    public zzat(zzau zzauVar, Context context, String str, zzbtz zzbtzVar) {
        this.zzd = zzauVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbtzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "rewarded");
        return new zzex();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) {
        return zzccVar.zzn(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221310000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() {
        return zzcbp.zza(this.zza, this.zzb, this.zzc);
    }
}
