package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaqi extends zzaqm {
    public zzaqi(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3) {
        super(zzapcVar, "vIuyJgkXAuHDOYyZs/XS63TUqVD1sO0CQ+HhaScCOnqgG3I71zSq+SxqNmjD4E1e", "PYnCLpLLKhA0q7i2li/Zt4bu8StAsClZCXaLnFnfz+0=", zzaliVar, i2, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        this.zze.zzac(3);
        boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
        synchronized (this.zze) {
            if (booleanValue) {
                this.zze.zzac(2);
            } else {
                this.zze.zzac(1);
            }
        }
    }
}
