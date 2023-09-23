package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzccv implements zzbam {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzccv(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final String zza() {
        return this.zzc;
    }

    public final void zzb(boolean z) {
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zza)) {
            synchronized (this.zzb) {
                if (this.zzd == z) {
                    return;
                }
                this.zzd = z;
                if (TextUtils.isEmpty(this.zzc)) {
                    return;
                }
                if (this.zzd) {
                    com.google.android.gms.ads.internal.zzt.zzn().zzh(this.zza, this.zzc);
                } else {
                    com.google.android.gms.ads.internal.zzt.zzn().zzi(this.zza, this.zzc);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzc(zzbal zzbalVar) {
        zzb(zzbalVar.zzj);
    }
}
