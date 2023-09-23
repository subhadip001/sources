package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzip implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ zzjm zzd;

    public zzip(zzjm zzjmVar, AtomicReference atomicReference, zzq zzqVar, boolean z) {
        this.zzd = zzjmVar;
        this.zza = atomicReference;
        this.zzb = zzqVar;
        this.zzc = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjm zzjmVar;
        zzdx zzdxVar;
        synchronized (this.zza) {
            try {
                zzjmVar = this.zzd;
                zzdxVar = zzjmVar.zzb;
            } catch (RemoteException e2) {
                this.zzd.zzt.zzay().zzd().zzb("Failed to get all user properties; remote exception", e2);
                atomicReference = this.zza;
            }
            if (zzdxVar == null) {
                zzjmVar.zzt.zzay().zzd().zza("Failed to get all user properties; not connected to service");
                this.zza.notify();
                return;
            }
            Preconditions.checkNotNull(this.zzb);
            this.zza.set(zzdxVar.zze(this.zzb, this.zzc));
            this.zzd.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
