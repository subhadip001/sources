package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzctr implements zzdbs, zzddg, zzdcm, com.google.android.gms.ads.internal.client.zza, zzdci {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfbs zze;
    private final zzfbg zzf;
    private final zzfic zzg;
    private final zzfch zzh;
    private final zzaoc zzi;
    private final zzbix zzj;
    private final zzfhq zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();
    private final zzbiz zzp;

    public zzctr(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfbs zzfbsVar, zzfbg zzfbgVar, zzfic zzficVar, zzfch zzfchVar, View view, zzcli zzcliVar, zzaoc zzaocVar, zzbix zzbixVar, zzbiz zzbizVar, zzfhq zzfhqVar, byte[] bArr) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfbsVar;
        this.zzf = zzfbgVar;
        this.zzg = zzficVar;
        this.zzh = zzfchVar;
        this.zzi = zzaocVar;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzcliVar);
        this.zzj = zzbixVar;
        this.zzp = zzbizVar;
        this.zzk = zzfhqVar;
    }

    public static /* synthetic */ void zzf(zzctr zzctrVar) {
        zzctrVar.zzs();
    }

    public final void zzs() {
        int i2;
        String zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcE)).booleanValue() ? this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), null) : null;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzal)).booleanValue() && this.zze.zzb.zzb.zzg) || !((Boolean) zzbjn.zzh.zze()).booleanValue()) {
            zzfch zzfchVar = this.zzh;
            zzfic zzficVar = this.zzg;
            zzfbs zzfbsVar = this.zze;
            zzfbg zzfbgVar = this.zzf;
            zzfchVar.zza(zzficVar.zzb(zzfbsVar, zzfbgVar, false, zzh, null, zzfbgVar.zzd));
            return;
        }
        if (((Boolean) zzbjn.zzg.zze()).booleanValue() && ((i2 = this.zzf.zzb) == 1 || i2 == 2 || i2 == 5)) {
            zzcli zzcliVar = (zzcli) this.zzm.get();
        }
        zzfva.zzr((zzfur) zzfva.zzo(zzfur.zzv(zzfva.zzi(null)), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzctq(this, zzh), this.zzb);
    }

    private final void zzt(final int i2, final int i3) {
        View view;
        if (i2 > 0 && ((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctk
                @Override // java.lang.Runnable
                public final void run() {
                    zzctr.this.zzi(i2, i3);
                }
            }, i3, TimeUnit.MILLISECONDS);
        } else {
            zzs();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzal)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbjn.zzd.zze()).booleanValue()) {
            zzfva.zzr(zzfva.zzf(zzfur.zzv(this.zzj.zza()), Throwable.class, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzctl
                @Override // com.google.android.gms.internal.ads.zzfoi
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    return "failure_click_attok";
                }
            }, zzcfv.zzf), new zzctp(this), this.zzb);
            return;
        }
        zzfch zzfchVar = this.zzh;
        zzfic zzficVar = this.zzg;
        zzfbs zzfbsVar = this.zze;
        zzfbg zzfbgVar = this.zzf;
        zzfchVar.zzc(zzficVar.zza(zzfbsVar, zzfbgVar, zzfbgVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzbv() {
        zzfch zzfchVar = this.zzh;
        zzfic zzficVar = this.zzg;
        zzfbs zzfbsVar = this.zze;
        zzfbg zzfbgVar = this.zzf;
        zzfchVar.zza(zzficVar.zza(zzfbsVar, zzfbgVar, zzfbgVar.zzj));
    }

    public final /* synthetic */ void zzg() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcto
            @Override // java.lang.Runnable
            public final void run() {
                zzctr.zzf(zzctr.this);
            }
        });
    }

    public final /* synthetic */ void zzh(int i2, int i3) {
        zzt(i2 - 1, i3);
    }

    public final /* synthetic */ void zzi(final int i2, final int i3) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctm
            @Override // java.lang.Runnable
            public final void run() {
                zzctr.this.zzh(i2, i3);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdci
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbo)).booleanValue()) {
            this.zzh.zza(this.zzg.zza(this.zze, this.zzf, zzfic.zzd(2, zzeVar.zza, this.zzf.zzp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final void zzl() {
        if (this.zzo.compareAndSet(false, true)) {
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcH)).intValue();
            if (intValue > 0) {
                zzt(intValue, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcI)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcG)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzctr.this.zzg();
                    }
                });
            } else {
                zzs();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzddg
    public final synchronized void zzn() {
        if (this.zzn) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzg);
            this.zzh.zza(this.zzg.zzb(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            zzfch zzfchVar = this.zzh;
            zzfic zzficVar = this.zzg;
            zzfbs zzfbsVar = this.zze;
            zzfbg zzfbgVar = this.zzf;
            zzfchVar.zza(zzficVar.zza(zzfbsVar, zzfbgVar, zzfbgVar.zzn));
            zzfch zzfchVar2 = this.zzh;
            zzfic zzficVar2 = this.zzg;
            zzfbs zzfbsVar2 = this.zze;
            zzfbg zzfbgVar2 = this.zzf;
            zzfchVar2.zza(zzficVar2.zza(zzfbsVar2, zzfbgVar2, zzfbgVar2.zzg));
        }
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzp(zzcak zzcakVar, String str, String str2) {
        zzfch zzfchVar = this.zzh;
        zzfic zzficVar = this.zzg;
        zzfbg zzfbgVar = this.zzf;
        zzfchVar.zza(zzficVar.zzc(zzfbgVar, zzfbgVar.zzi, zzcakVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdbs
    public final void zzr() {
        zzfch zzfchVar = this.zzh;
        zzfic zzficVar = this.zzg;
        zzfbs zzfbsVar = this.zze;
        zzfbg zzfbgVar = this.zzf;
        zzfchVar.zza(zzficVar.zza(zzfbsVar, zzfbgVar, zzfbgVar.zzh));
    }
}
