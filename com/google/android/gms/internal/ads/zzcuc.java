package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcuc implements zzbam, zzdcn, com.google.android.gms.ads.internal.overlay.zzo, zzdcm {
    private final zzctx zza;
    private final zzcty zzb;
    private final zzbtl zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcub zzh = new zzcub();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcuc(zzbti zzbtiVar, zzcty zzctyVar, Executor executor, zzctx zzctxVar, Clock clock) {
        this.zza = zzctxVar;
        zzbst zzbstVar = zzbsw.zza;
        this.zzd = zzbtiVar.zza("google.afma.activeView.handleUpdate", zzbstVar, zzbstVar);
        this.zzb = zzctyVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        for (zzcli zzcliVar : this.zzc) {
            this.zza.zzf(zzcliVar);
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbK() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final synchronized void zzbq(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbr() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final synchronized void zzbs(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final synchronized void zzbt(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final synchronized void zzc(zzbal zzbalVar) {
        zzcub zzcubVar = this.zzh;
        zzcubVar.zza = zzbalVar.zzj;
        zzcubVar.zzf = zzbalVar;
        zzg();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i2) {
    }

    public final synchronized void zzg() {
        if (this.zzj.get() != null) {
            if (this.zzi || !this.zzg.get()) {
                return;
            }
            try {
                this.zzh.zzd = this.zzf.elapsedRealtime();
                final JSONObject zzb = this.zzb.zzb(this.zzh);
                for (final zzcli zzcliVar : this.zzc) {
                    this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcua
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcli.this.zzl("AFMA_updateActiveView", zzb);
                        }
                    });
                }
                zzcfy.zzb(this.zzd.zzb(zzb), "ActiveViewListener.callActiveViewJs");
                return;
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e2);
                return;
            }
        }
        zzj();
    }

    public final synchronized void zzh(zzcli zzcliVar) {
        this.zzc.add(zzcliVar);
        this.zza.zzd(zzcliVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final synchronized void zzl() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
