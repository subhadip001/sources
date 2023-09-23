package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzet extends zzcl {
    private zzbqm zza;

    public final /* synthetic */ void zzb() {
        zzbqm zzbqmVar = this.zza;
        if (zzbqmVar != null) {
            try {
                zzbqmVar.zzb(Collections.emptyList());
            } catch (RemoteException e2) {
                zzcfi.zzk("Could not notify onComplete event.", e2);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final float zze() {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzj() {
        zzcfi.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        zzcfb.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzes
            @Override // java.lang.Runnable
            public final void run() {
                zzet.this.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String str, IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(zzcy zzcyVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(IObjectWrapper iObjectWrapper, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(zzbtz zzbtzVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzo(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzp(float f2) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzq(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(zzbqm zzbqmVar) {
        this.zza = zzbqmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(zzfa zzfaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final boolean zzt() {
        return false;
    }
}
