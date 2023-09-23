package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbqc implements BaseGmsClient.BaseConnectionCallbacks {
    public final /* synthetic */ zzcga zza;
    public final /* synthetic */ zzbqe zzb;

    public zzbqc(zzbqe zzbqeVar, zzcga zzcgaVar) {
        this.zzb = zzbqeVar;
        this.zza = zzcgaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbpr zzbprVar;
        try {
            zzcga zzcgaVar = this.zza;
            zzbprVar = this.zzb.zza;
            zzcgaVar.zzd(zzbprVar.zzp());
        } catch (DeadObjectException e2) {
            this.zza.zze(e2);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i2) {
        this.zza.zze(new RuntimeException(a.i("onConnectionSuspended: ", i2)));
    }
}
