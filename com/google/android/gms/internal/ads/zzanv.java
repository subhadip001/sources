package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.arthenica.ffmpegkit.AbstractSession;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzanv implements zzany {
    private static zzanv zzb;
    private final Context zzc;
    private final zzfmh zzd;
    private final zzfmo zze;
    private final zzfmq zzf;
    private final zzaow zzg;
    private final zzfks zzh;
    private final Executor zzi;
    private final zzfmn zzj;
    private final zzapl zzl;
    private volatile boolean zzn;
    private final int zzp;
    public volatile long zza = 0;
    private final Object zzm = new Object();
    private volatile boolean zzo = false;
    private final CountDownLatch zzk = new CountDownLatch(1);

    public zzanv(Context context, zzfks zzfksVar, zzfmh zzfmhVar, zzfmo zzfmoVar, zzfmq zzfmqVar, zzaow zzaowVar, Executor executor, zzfkn zzfknVar, int i2, zzapl zzaplVar) {
        this.zzc = context;
        this.zzh = zzfksVar;
        this.zzd = zzfmhVar;
        this.zze = zzfmoVar;
        this.zzf = zzfmqVar;
        this.zzg = zzaowVar;
        this.zzi = executor;
        this.zzp = i2;
        this.zzl = zzaplVar;
        this.zzj = new zzant(this, zzfknVar);
    }

    public static synchronized zzanv zza(String str, Context context, boolean z, boolean z2) {
        zzanv zzb2;
        synchronized (zzanv.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzanv zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        zzanv zzanvVar;
        synchronized (zzanv.class) {
            if (zzb == null) {
                zzfkt zza = zzfku.zza();
                zza.zza(str);
                zza.zzc(z);
                zzfku zzd = zza.zzd();
                zzfks zza2 = zzfks.zza(context, executor, z2);
                zzaog zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcy)).booleanValue() ? zzaog.zzc(context) : null;
                zzapl zzd2 = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcz)).booleanValue() ? zzapl.zzd(context, executor) : null;
                zzfll zze = zzfll.zze(context, executor, zza2, zzd);
                zzaov zzaovVar = new zzaov(context);
                zzaow zzaowVar = new zzaow(zzd, zze, new zzapj(context, zzaovVar), zzaovVar, zzc, zzd2);
                int zzb2 = zzflu.zzb(context, zza2);
                zzfkn zzfknVar = new zzfkn();
                zzanv zzanvVar2 = new zzanv(context, zza2, new zzfmh(context, zzb2), new zzfmo(context, zzb2, new zzans(zza2), ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbQ)).booleanValue()), new zzfmq(context, zzaowVar, zza2, zzfknVar), zzaowVar, executor, zzfknVar, zzb2, zzd2);
                zzb = zzanvVar2;
                zzanvVar2.zzm();
                zzb.zzo();
            }
            zzanvVar = zzb;
        }
        return zzanvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.zzd().zzj().equals(r5.zzj()) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzanv r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanv.zzj(com.google.android.gms.internal.ads.zzanv):void");
    }

    private final void zzr() {
        zzapl zzaplVar = this.zzl;
        if (zzaplVar != null) {
            zzaplVar.zzh();
        }
    }

    private final zzfmg zzs(int i2) {
        if (zzflu.zza(this.zzp)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbO)).booleanValue()) {
                return this.zze.zzc(1);
            }
            return this.zzd.zzd(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzr();
        zzo();
        zzfkv zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza2 = zza.zza(context, null, str, view, activity);
            this.zzh.zzf(AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT, System.currentTimeMillis() - currentTimeMillis, zza2, null);
            return zza2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzg(Context context) {
        zzr();
        zzo();
        zzfkv zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zza.zzc(context, null);
            this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzh(Context context, View view, Activity activity) {
        zzr();
        zzo();
        zzfkv zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb2 = zza.zzb(context, null, view, activity);
            this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
            return zzb2;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzk(MotionEvent motionEvent) {
        zzfkv zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzfmp e2) {
                this.zzh.zzc(e2.zza(), -1L, e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzl(int i2, int i3, int i4) {
    }

    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfmg zzs = zzs(1);
        if (zzs != null) {
            if (this.zzf.zzc(zzs)) {
                this.zzo = true;
                this.zzk.countDown();
                return;
            }
            return;
        }
        this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzn(View view) {
        this.zzg.zzd(view);
    }

    public final void zzo() {
        if (this.zzn) {
            return;
        }
        synchronized (this.zzm) {
            if (!this.zzn) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfmg zzb2 = this.zzf.zzb();
                if ((zzb2 == null || zzb2.zzd(3600L)) && zzflu.zza(this.zzp)) {
                    this.zzi.execute(new zzanu(this));
                }
            }
        }
    }

    public final synchronized boolean zzq() {
        return this.zzo;
    }
}
