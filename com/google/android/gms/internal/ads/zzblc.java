package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzblc extends zzaqv implements zzble {
    public zzblc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzble
    public final IObjectWrapper zzb(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        return a.V(zzbk(2, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzble
    public final void zzbA(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzble
    public final void zzbw(String str, IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zza.writeString(str);
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzble
    public final void zzbx(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzble
    public final void zzby(zzbkx zzbkxVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbkxVar);
        zzbl(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzble
    public final void zzbz(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzble
    public final void zzc() {
        zzbl(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzble
    public final void zzd(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzble
    public final void zze(IObjectWrapper iObjectWrapper, int i2) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zza.writeInt(i2);
        zzbl(5, zza);
    }
}
