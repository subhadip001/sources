package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzjf implements Runnable {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzq zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzjm zzf;

    public zzjf(zzjm zzjmVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar, boolean z) {
        this.zzf = zzjmVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzqVar;
        this.zze = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjm zzjmVar;
        zzdx zzdxVar;
        synchronized (this.zza) {
            try {
                zzjmVar = this.zzf;
                zzdxVar = zzjmVar.zzb;
            } catch (RemoteException e2) {
                this.zzf.zzt.zzay().zzd().zzd("(legacy) Failed to get user properties; remote exception", null, this.zzb, e2);
                this.zza.set(Collections.emptyList());
                atomicReference = this.zza;
            }
            if (zzdxVar == null) {
                zzjmVar.zzt.zzay().zzd().zzd("(legacy) Failed to get user properties; not connected to service", null, this.zzb, this.zzc);
                this.zza.set(Collections.emptyList());
                this.zza.notify();
                return;
            }
            if (TextUtils.isEmpty(null)) {
                Preconditions.checkNotNull(this.zzd);
                this.zza.set(zzdxVar.zzh(this.zzb, this.zzc, this.zze, this.zzd));
            } else {
                this.zza.set(zzdxVar.zzi(null, this.zzb, this.zzc, this.zze));
            }
            this.zzf.zzQ();
            atomicReference = this.zza;
            atomicReference.notify();
        }
    }
}
