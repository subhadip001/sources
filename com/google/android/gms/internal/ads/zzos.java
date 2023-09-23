package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzos implements zzno {
    public final /* synthetic */ zzot zza;

    public /* synthetic */ zzos(zzot zzotVar, zzor zzorVar) {
        this.zza = zzotVar;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zza(Exception exc) {
        zzdn.zza("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzot.zzU(this.zza).zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void zzb() {
        zzot zzotVar = this.zza;
        if (zzot.zzT(zzotVar) != null) {
            zzot.zzT(zzotVar).zzb();
        }
    }
}
