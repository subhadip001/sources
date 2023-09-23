package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzelh extends com.google.android.gms.ads.internal.client.zzbk {
    private final zzemn zza;

    public zzelh(Context context, zzcnf zzcnfVar, zzfbw zzfbwVar, zzdnr zzdnrVar, com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        zzemp zzempVar = new zzemp(zzdnrVar, zzcnfVar.zzx());
        zzempVar.zze(zzbfVar);
        this.zza = new zzemn(new zzemz(zzcnfVar, context, zzempVar, zzfbwVar), zzfbwVar.zzI());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza.zzd(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, int i2) {
        this.zza.zzd(zzlVar, i2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final synchronized boolean zzi() {
        return this.zza.zze();
    }
}
