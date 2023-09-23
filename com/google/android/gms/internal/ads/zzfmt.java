package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfmt {
    public final /* synthetic */ zzfmu zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfmt(zzfmu zzfmuVar, byte[] bArr, zzfms zzfmsVar) {
        this.zza = zzfmuVar;
        this.zzb = bArr;
    }

    public final zzfmt zza(int i2) {
        this.zzd = i2;
        return this;
    }

    public final zzfmt zzb(int i2) {
        this.zzc = i2;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfmu zzfmuVar = this.zza;
            if (zzfmuVar.zzb) {
                zzfmuVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e2) {
            Log.d("GASS", "Clearcut log failed", e2);
        }
    }
}
