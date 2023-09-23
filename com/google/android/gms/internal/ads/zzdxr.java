package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdxr implements zzdxf {
    private final long zza;
    private final zzemk zzb;

    public zzdxr(long j2, Context context, zzdxk zzdxkVar, zzcnf zzcnfVar, String str) {
        this.zza = j2;
        zzezl zzt = zzcnfVar.zzt();
        zzt.zzc(context);
        zzt.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzt.zzb(str);
        zzemk zza = zzt.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdxq(this, zzdxkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdxf
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdxf
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdxf
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
