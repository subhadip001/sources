package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public abstract class zza extends zzc {
    public final int zza;
    public final Bundle zzb;
    public final /* synthetic */ BaseGmsClient zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(BaseGmsClient baseGmsClient, int i2, Bundle bundle) {
        super(baseGmsClient, Boolean.TRUE);
        this.zzc = baseGmsClient;
        this.zza = i2;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.common.internal.zzc
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        if (this.zza != 0) {
            this.zzc.zzp(1, null);
            Bundle bundle = this.zzb;
            zzb(new ConnectionResult(this.zza, bundle != null ? (PendingIntent) bundle.getParcelable(BaseGmsClient.KEY_PENDING_INTENT) : null));
        } else if (zzd()) {
        } else {
            this.zzc.zzp(1, null);
            zzb(new ConnectionResult(8, null));
        }
    }

    public abstract void zzb(ConnectionResult connectionResult);

    @Override // com.google.android.gms.common.internal.zzc
    public final void zzc() {
    }

    public abstract boolean zzd();
}
