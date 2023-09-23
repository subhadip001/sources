package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcjy extends zzcju {
    public zzcjy(zzchr zzchrVar) {
        super(zzchrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final boolean zzq(String str) {
        String zze = zzcfb.zze(str);
        zzchr zzchrVar = (zzchr) this.zzc.get();
        if (zzchrVar != null && zze != null) {
            zzchrVar.zzv(zze, this);
        }
        zzcfi.zzj("VideoStreamNoopCache is doing nothing.");
        zzc(str, zze, "noop", "Noop cache is a noop.");
        return false;
    }
}
