package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfks;
import com.google.android.gms.internal.ads.zzflv;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzh implements zzflv {
    public final /* synthetic */ zzi zza;

    public zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflv
    public final void zza(int i2, long j2) {
        zzfks zzfksVar;
        zzfksVar = this.zza.zzi;
        zzfksVar.zzd(i2, System.currentTimeMillis() - j2);
    }

    @Override // com.google.android.gms.internal.ads.zzflv
    public final void zzb(int i2, long j2, String str) {
        zzfks zzfksVar;
        zzfksVar = this.zza.zzi;
        zzfksVar.zze(i2, System.currentTimeMillis() - j2, str);
    }
}
