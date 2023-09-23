package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzewc extends com.google.android.gms.ads.internal.client.zzbr implements com.google.android.gms.ads.internal.overlay.zzaa, zzbbz, zzddr {
    public zzcvd zza;
    private final zzcnf zzb;
    private final Context zzc;
    private final ViewGroup zzd;
    private final String zzf;
    private final zzevw zzg;
    private final zzexc zzh;
    private final zzcfo zzi;
    private zzcuo zzk;
    private AtomicBoolean zze = new AtomicBoolean();
    private long zzj = -1;

    public zzewc(zzcnf zzcnfVar, Context context, String str, zzevw zzevwVar, zzexc zzexcVar, zzcfo zzcfoVar) {
        this.zzd = new FrameLayout(context);
        this.zzb = zzcnfVar;
        this.zzc = context;
        this.zzf = str;
        this.zzg = zzevwVar;
        this.zzh = zzexcVar;
        zzexcVar.zzn(this);
        this.zzi = zzcfoVar;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.overlay.zzr zze(zzewc zzewcVar, zzcvd zzcvdVar) {
        boolean zzh = zzcvdVar.zzh();
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdT)).intValue();
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = new com.google.android.gms.ads.internal.overlay.zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != zzh ? 0 : intValue;
        zzqVar.zzb = true != zzh ? intValue : 0;
        zzqVar.zzc = intValue;
        return new com.google.android.gms.ads.internal.overlay.zzr(zzewcVar.zzc, zzqVar, zzewcVar);
    }

    private final synchronized void zzq(int i2) {
        if (this.zze.compareAndSet(false, true)) {
            zzcvd zzcvdVar = this.zza;
            if (zzcvdVar != null && zzcvdVar.zzj() != null) {
                this.zzh.zzt(zzcvdVar.zzj());
            }
            this.zzh.zzj();
            this.zzd.removeAllViews();
            zzcuo zzcuoVar = this.zzk;
            if (zzcuoVar != null) {
                com.google.android.gms.ads.internal.zzt.zzb().zze(zzcuoVar);
            }
            if (this.zza != null) {
                long j2 = -1;
                if (this.zzj != -1) {
                    j2 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzj;
                }
                this.zza.zzi(j2, i2);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbci zzbciVar) {
        this.zzh.zzr(zzbciVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzg.zzl(zzwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbyd zzbydVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzO(zzbit zzbitVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbyg zzbygVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcaq zzcaqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzfg zzfgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.zzg.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbz
    public final void zza() {
        zzq(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:9:0x0025, B:13:0x0042, B:15:0x004d, B:18:0x0052, B:21:0x0064, B:25:0x006c, B:12:0x003d), top: B:31:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbja r0 = com.google.android.gms.internal.ads.zzbjm.zzd     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L87
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zziq     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r2.zzb(r0)     // Catch: java.lang.Throwable -> L87
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            com.google.android.gms.internal.ads.zzcfo r2 = r5.zzi     // Catch: java.lang.Throwable -> L87
            int r2 = r2.zzc     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzbhq r3 = com.google.android.gms.internal.ads.zzbhy.zzir     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzbhw r4 = com.google.android.gms.ads.internal.client.zzay.zzc()     // Catch: java.lang.Throwable -> L87
            java.lang.Object r3 = r4.zzb(r3)     // Catch: java.lang.Throwable -> L87
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L87
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L87
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L87
        L42:
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Throwable -> L87
            android.content.Context r0 = r5.zzc     // Catch: java.lang.Throwable -> L87
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzD(r0)     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L64
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L52
            goto L64
        L52:
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzcfi.zzg(r6)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzexc r6 = r5.zzh     // Catch: java.lang.Throwable -> L87
            r0 = 4
            r2 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfcx.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L87
            r6.zza(r0)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            return r1
        L64:
            boolean r0 = r5.zzY()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L6c
            monitor-exit(r5)
            return r1
        L6c:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L87
            r0.<init>()     // Catch: java.lang.Throwable -> L87
            r5.zze = r0     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzewa r0 = new com.google.android.gms.internal.ads.zzewa     // Catch: java.lang.Throwable -> L87
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzevw r1 = r5.zzg     // Catch: java.lang.Throwable -> L87
            java.lang.String r2 = r5.zzf     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzewb r3 = new com.google.android.gms.internal.ads.zzewb     // Catch: java.lang.Throwable -> L87
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L87
            boolean r6 = r1.zzb(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            return r6
        L87:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewc.zzaa(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzbJ() {
        zzq(4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcvd zzcvdVar = this.zza;
        if (zzcvdVar != null) {
            return zzfcc.zza(this.zzc, Collections.singletonList(zzcvdVar.zzc()));
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzddr
    public final void zzh() {
        if (this.zza == null) {
            return;
        }
        this.zzj = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        int zza = this.zza.zza();
        if (zza <= 0) {
            return;
        }
        zzcuo zzcuoVar = new zzcuo(this.zzb.zzB(), com.google.android.gms.ads.internal.zzt.zzA());
        this.zzk = zzcuoVar;
        zzcuoVar.zzd(zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzevz
            @Override // java.lang.Runnable
            public final void run() {
                zzewc.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbf zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbz zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzd);
    }

    public final /* synthetic */ void zzo() {
        zzq(5);
    }

    @VisibleForTesting
    public final void zzp() {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        if (zzcfb.zzs()) {
            zzq(5);
        } else {
            this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzevy
                @Override // java.lang.Runnable
                public final void run() {
                    zzewc.this.zzo();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcvd zzcvdVar = this.zza;
        if (zzcvdVar != null) {
            zzcvdVar.zzV();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}
