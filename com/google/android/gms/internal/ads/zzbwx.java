package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbwx implements NativeCustomFormatAd.DisplayOpenMeasurement {
    private final zzblu zza;

    public zzbwx(zzblu zzbluVar) {
        this.zza = zzbluVar;
        try {
            zzbluVar.zzl();
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zza.zzo(ObjectWrapper.wrap(view));
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzr();
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
            return false;
        }
    }
}
