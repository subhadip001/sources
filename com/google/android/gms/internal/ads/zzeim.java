package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeim {
    private final zzfcn zza;
    private final zzdty zzb;
    private final zzdwg zzc;
    private final zzfgo zzd;

    public zzeim(zzfcn zzfcnVar, zzdty zzdtyVar, zzdwg zzdwgVar, zzfgo zzfgoVar) {
        this.zza = zzfcnVar;
        this.zzb = zzdtyVar;
        this.zzc = zzdwgVar;
        this.zzd = zzfgoVar;
    }

    public final void zza(zzfbj zzfbjVar, zzfbg zzfbgVar, int i2, zzefc zzefcVar, long j2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhf)).booleanValue()) {
            zzfgn zzb = zzfgn.zzb("adapter_status");
            zzb.zzg(zzfbjVar);
            zzb.zzf(zzfbgVar);
            zzb.zza("adapter_l", String.valueOf(j2));
            zzb.zza("sc", Integer.toString(i2));
            if (zzefcVar != null) {
                zzb.zza("arec", Integer.toString(zzefcVar.zzb().zza));
                String zza = this.zza.zza(zzefcVar.getMessage());
                if (zza != null) {
                    zzb.zza("areec", zza);
                }
            }
            zzdtx zzb2 = this.zzb.zzb(zzfbgVar.zzu);
            if (zzb2 != null) {
                zzb.zza("ancn", zzb2.zza);
                zzbwf zzbwfVar = zzb2.zzb;
                if (zzbwfVar != null) {
                    zzb.zza("adapter_v", zzbwfVar.toString());
                }
                zzbwf zzbwfVar2 = zzb2.zzc;
                if (zzbwfVar2 != null) {
                    zzb.zza("adapter_sv", zzbwfVar2.toString());
                }
            }
            this.zzd.zzb(zzb);
            return;
        }
        zzdwf zza2 = this.zzc.zza();
        zza2.zze(zzfbjVar);
        zza2.zzd(zzfbgVar);
        zza2.zzb("action", "adapter_status");
        zza2.zzb("adapter_l", String.valueOf(j2));
        zza2.zzb("sc", Integer.toString(i2));
        if (zzefcVar != null) {
            zza2.zzb("arec", Integer.toString(zzefcVar.zzb().zza));
            String zza3 = this.zza.zza(zzefcVar.getMessage());
            if (zza3 != null) {
                zza2.zzb("areec", zza3);
            }
        }
        zzdtx zzb3 = this.zzb.zzb(zzfbgVar.zzu);
        if (zzb3 != null) {
            zza2.zzb("ancn", zzb3.zza);
            zzbwf zzbwfVar3 = zzb3.zzb;
            if (zzbwfVar3 != null) {
                zza2.zzb("adapter_v", zzbwfVar3.toString());
            }
            zzbwf zzbwfVar4 = zzb3.zzc;
            if (zzbwfVar4 != null) {
                zza2.zzb("adapter_sv", zzbwfVar4.toString());
            }
        }
        zza2.zzg();
    }
}
