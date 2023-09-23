package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzapm extends zzaqm {
    private final Activity zzi;
    private final View zzj;

    public zzapm(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3, View view, Activity activity) {
        super(zzapcVar, "+4GeHOPzkR+I2/hOw/K2mE4w3ob8GTou4qE5+XMzOXppahaUdBQvKDeCKnoz5xO+", "KV7CkapOc398LrUMWLxbtIox9+Yv3R2fIy2uxXRJMPI=", zzaliVar, i2, 62);
        this.zzj = view;
        this.zzi = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        if (this.zzj == null) {
            return;
        }
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzce)).booleanValue();
        Object[] objArr = (Object[]) this.zzf.invoke(null, this.zzj, this.zzi, Boolean.valueOf(booleanValue));
        synchronized (this.zze) {
            this.zze.zzc(((Long) objArr[0]).longValue());
            this.zze.zze(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.zze.zzd((String) objArr[2]);
            }
        }
    }
}
