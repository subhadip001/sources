package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzcba;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzcbk;
import com.google.android.gms.internal.ads.zzcbl;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzex extends zzcbc {
    private static void zzr(final zzcbk zzcbkVar) {
        zzcfi.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzcfb.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzew
            @Override // java.lang.Runnable
            public final void run() {
                zzcbk zzcbkVar2 = zzcbk.this;
                if (zzcbkVar2 != null) {
                    try {
                        zzcbkVar2.zze(1);
                    } catch (RemoteException e2) {
                        zzcfi.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final Bundle zzb() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final zzdh zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final zzcba zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final String zze() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzf(zzl zzlVar, zzcbk zzcbkVar) {
        zzr(zzcbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzg(zzl zzlVar, zzcbk zzcbkVar) {
        zzr(zzcbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzi(zzdb zzdbVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzj(zzde zzdeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzk(zzcbg zzcbgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzl(zzcbr zzcbrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzm(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final boolean zzo() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final void zzp(zzcbl zzcblVar) {
    }
}
