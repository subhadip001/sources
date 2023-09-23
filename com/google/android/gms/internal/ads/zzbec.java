package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbec extends zzgkk implements zzglz {
    private zzbec() {
        super(zzbed.zzc());
    }

    public final zzbec zza(boolean z) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbed.zze((zzbed) this.zza, z);
        return this;
    }

    public final zzbec zzb(int i2) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbed.zzf((zzbed) this.zza, i2);
        return this;
    }

    public /* synthetic */ zzbec(zzbds zzbdsVar) {
        super(zzbed.zzc());
    }
}
