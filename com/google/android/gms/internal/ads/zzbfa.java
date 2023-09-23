package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbfa extends zzgkk implements zzglz {
    private zzbfa() {
        super(zzbfb.zze());
    }

    public final zzbdx zza() {
        return ((zzbfb) this.zza).zza();
    }

    public final zzbet zzb() {
        return ((zzbfb) this.zza).zzc();
    }

    public final zzbfa zzc(Iterable iterable) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzh((zzbfb) this.zza, iterable);
        return this;
    }

    public final zzbfa zzd() {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzi((zzbfb) this.zza);
        return this;
    }

    public final zzbfa zze(zzbdw zzbdwVar) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzk((zzbfb) this.zza, (zzbdx) zzbdwVar.zzaj());
        return this;
    }

    public final zzbfa zzf(zzbeg zzbegVar) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzn((zzbfb) this.zza, zzbegVar);
        return this;
    }

    public final zzbfa zzg(zzbes zzbesVar) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzj((zzbfb) this.zza, (zzbet) zzbesVar.zzaj());
        return this;
    }

    public final zzbfa zzh(String str) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzg((zzbfb) this.zza, str);
        return this;
    }

    public final zzbfa zzi(zzbfz zzbfzVar) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzl((zzbfb) this.zza, zzbfzVar);
        return this;
    }

    public final zzbfa zzj(zzbhg zzbhgVar) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbfb.zzm((zzbfb) this.zza, zzbhgVar);
        return this;
    }

    public final String zzk() {
        return ((zzbfb) this.zza).zzf();
    }

    public /* synthetic */ zzbfa(zzbds zzbdsVar) {
        super(zzbfb.zze());
    }
}
