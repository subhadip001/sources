package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdl extends zzaqv implements zzdn {
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzf(boolean z) {
        Parcel zza = zza();
        zzaqx.zzd(zza, z);
        zzbl(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzg() {
        zzbl(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzh() {
        zzbl(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zzi() {
        zzbl(1, zza());
    }
}
