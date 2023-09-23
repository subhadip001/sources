package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbxb extends zzbmd {
    public final /* synthetic */ zzbxe zza;

    public /* synthetic */ zzbxb(zzbxe zzbxeVar, zzbxa zzbxaVar) {
        this.zza = zzbxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zze(zzblu zzbluVar, String str) {
        zzbxe zzbxeVar = this.zza;
        if (zzbxe.zzc(zzbxeVar) == null) {
            return;
        }
        zzbxe.zzc(zzbxeVar).onCustomClick(zzbxe.zze(zzbxeVar, zzbluVar), str);
    }
}
