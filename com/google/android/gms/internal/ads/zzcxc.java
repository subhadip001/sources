package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcxc extends zzcvu {
    private final zzbmr zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcxc(zzcxv zzcxvVar, zzbmr zzbmrVar, Runnable runnable, Executor executor) {
        super(zzcxvVar);
        this.zzc = zzbmrVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    public static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzW() {
        final zzcxa zzcxaVar = new zzcxa(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcxb
            @Override // java.lang.Runnable
            public final void run() {
                zzcxc.this.zzk(zzcxaVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final View zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final com.google.android.gms.ads.internal.client.zzdk zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final zzfbh zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final zzfbh zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvu
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    public final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (this.zzc.zzb(ObjectWrapper.wrap(runnable))) {
                return;
            }
            zzi(((zzcxa) runnable).zza);
        } catch (RemoteException unused) {
            zzi(((zzcxa) runnable).zza);
        }
    }
}
