package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzce extends zzaqv implements zzcg {
    public zzce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzb() {
        zzbl(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzc() {
        zzbl(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzd(zze zzeVar) {
        Parcel zza = zza();
        zzaqx.zze(zza, zzeVar);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zze() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcg
    public final void zzf() {
        zzbl(2, zza());
    }
}
