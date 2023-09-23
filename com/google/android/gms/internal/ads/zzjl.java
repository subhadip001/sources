package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzjl implements zzjh {
    public final zzrw zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzjl(zzsd zzsdVar, boolean z) {
        this.zza = new zzrw(zzsdVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final zzci zza() {
        return this.zza.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i2) {
        this.zzd = i2;
        this.zze = false;
        this.zzc.clear();
    }
}
