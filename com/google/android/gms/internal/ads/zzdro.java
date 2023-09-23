package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdro implements zzbol {
    private final zzbme zza;
    private final zzdsd zzb;
    private final zzgpo zzc;

    public zzdro(zzdnr zzdnrVar, zzdng zzdngVar, zzdsd zzdsdVar, zzgpo zzgpoVar) {
        this.zza = zzdnrVar.zzc(zzdngVar.zzy());
        this.zzb = zzdsdVar;
        this.zzc = zzgpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzblu) this.zzc.zzb(), str);
        } catch (RemoteException e2) {
            zzcfi.zzk("Failed to call onCustomClick for asset " + str + ".", e2);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzi("/nativeAdCustomClick", this);
    }
}
