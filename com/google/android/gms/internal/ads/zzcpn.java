package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcpn {
    private zzcni zza;
    private zzcrd zzb;
    private zzfgi zzc;
    private zzcrq zzd;
    private zzfcy zze;

    private zzcpn() {
    }

    public /* synthetic */ zzcpn(zzcpm zzcpmVar) {
    }

    public final zzcnf zza() {
        zzgqc.zzc(this.zza, zzcni.class);
        zzgqc.zzc(this.zzb, zzcrd.class);
        if (this.zzc == null) {
            this.zzc = new zzfgi();
        }
        if (this.zzd == null) {
            this.zzd = new zzcrq();
        }
        if (this.zze == null) {
            this.zze = new zzfcy();
        }
        return new zzcrb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzcpn zzb(zzcni zzcniVar) {
        this.zza = zzcniVar;
        return this;
    }

    public final zzcpn zzc(zzcrd zzcrdVar) {
        this.zzb = zzcrdVar;
        return this;
    }
}
