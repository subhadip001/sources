package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbdg implements BaseGmsClient.BaseOnConnectionFailedListener {
    public final /* synthetic */ zzcga zza;
    public final /* synthetic */ zzbdh zzb;

    public zzbdg(zzbdh zzbdhVar, zzcga zzcgaVar) {
        this.zzb = zzbdhVar;
        this.zza = zzcgaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzb.zzd;
        synchronized (obj) {
            this.zza.zze(new RuntimeException("Connection failed."));
        }
    }
}
