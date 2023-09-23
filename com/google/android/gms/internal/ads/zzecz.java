package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzecz implements zzdil {
    private final String zzc;
    private final zzfgo zzd;
    private boolean zza = false;
    private boolean zzb = false;
    private final com.google.android.gms.ads.internal.util.zzg zze = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzecz(String str, zzfgo zzfgoVar) {
        this.zzc = str;
        this.zzd = zzfgoVar;
    }

    private final zzfgn zzg(String str) {
        String str2 = this.zze.zzP() ? "" : this.zzc;
        zzfgn zzb = zzfgn.zzb(str);
        zzb.zza("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime(), 10));
        zzb.zza("tid", str2);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdil
    public final void zza(String str) {
        zzfgo zzfgoVar = this.zzd;
        zzfgn zzg = zzg("aaia");
        zzg.zza("aair", "MalformedJson");
        zzfgoVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdil
    public final void zzb(String str, String str2) {
        zzfgo zzfgoVar = this.zzd;
        zzfgn zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzg.zza("rqe", str2);
        zzfgoVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdil
    public final void zzc(String str) {
        zzfgo zzfgoVar = this.zzd;
        zzfgn zzg = zzg("adapter_init_started");
        zzg.zza("ancn", str);
        zzfgoVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdil
    public final void zzd(String str) {
        zzfgo zzfgoVar = this.zzd;
        zzfgn zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzfgoVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdil
    public final synchronized void zze() {
        if (this.zzb) {
            return;
        }
        this.zzd.zzb(zzg("init_finished"));
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdil
    public final synchronized void zzf() {
        if (this.zza) {
            return;
        }
        this.zzd.zzb(zzg("init_started"));
        this.zza = true;
    }
}
