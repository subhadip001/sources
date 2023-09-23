package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzevc implements zzetb {
    public final ScheduledExecutorService zza;
    public final Context zzb;
    public final zzbxy zzc;

    public zzevc(zzbxy zzbxyVar, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.zzc = zzbxyVar;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return zzfva.zzm(zzfva.zzo(zzfva.zzi(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzde)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzevb
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                return new zzevd((Bundle) obj);
            }
        }, zzcfv.zza);
    }
}
