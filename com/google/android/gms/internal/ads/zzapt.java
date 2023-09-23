package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzapt extends zzaqm {
    public zzapt(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3) {
        super(zzapcVar, "VeJfgnCA/5BvvOmVt9atrbDalkWzqI/LGMmei/mF9oFQqpiCZjfjoCRjnQb+fFAv", "T73PopQD1DEGYFr8uKZxHThHCY1arOonGG0ho3b7ul0=", zzaliVar, i2, 24);
    }

    private final void zzc() {
        AdvertisingIdClient zzh = this.zzb.zzh();
        if (zzh == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = zzh.getInfo();
            String zzd = zzapf.zzd(info.getId());
            if (zzd != null) {
                synchronized (this.zze) {
                    this.zze.zzr(zzd);
                    this.zze.zzq(info.isLimitAdTrackingEnabled());
                    this.zze.zzY(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqm, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzk();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        if (!this.zzb.zzq()) {
            synchronized (this.zze) {
                this.zze.zzr((String) this.zzf.invoke(null, this.zzb.zzb()));
            }
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final Void zzk() {
        if (this.zzb.zzr()) {
            super.zzk();
            return null;
        }
        if (this.zzb.zzq()) {
            zzc();
        }
        return null;
    }
}
