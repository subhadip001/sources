package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaj extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzau zzd;

    public zzaj(zzau zzauVar, Context context, zzq zzqVar, String str) {
        this.zzd = zzauVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, FirebaseAnalytics.Event.SEARCH);
        return new zzer();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) {
        return zzccVar.zzf(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221310000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() {
        zzk zzkVar;
        zzkVar = this.zzd.zza;
        return zzkVar.zza(this.zza, this.zzb, this.zzc, null, 3);
    }
}
