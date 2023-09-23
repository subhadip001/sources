package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbou implements com.google.android.gms.ads.internal.overlay.zzu {
    public boolean zza = false;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzc;
    public final /* synthetic */ Map zzd;
    public final /* synthetic */ Map zze;

    public zzbou(zzbow zzbowVar, boolean z, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, Map map2) {
        this.zzb = z;
        this.zzc = zzaVar;
        this.zzd = map;
        this.zze = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzu
    public final void zza(boolean z) {
        if (this.zza) {
            return;
        }
        if (z && this.zzb) {
            ((zzdjf) this.zzc).zzq();
        }
        this.zza = true;
        this.zzd.put((String) this.zze.get("event_id"), Boolean.valueOf(z));
        ((zzbrc) this.zzc).zzd("openIntentAsync", this.zzd);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzu
    public final void zzb(int i2) {
    }
}
