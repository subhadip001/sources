package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzanv;
import com.google.android.gms.internal.ads.zzany;
import com.google.android.gms.internal.ads.zzaob;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzfks;
import com.google.android.gms.internal.ads.zzflu;
import com.google.android.gms.internal.ads.zzfmo;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzi implements Runnable, zzany {
    @VisibleForTesting
    public boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfks zzi;
    private Context zzj;
    private final Context zzk;
    private zzcfo zzl;
    private final zzcfo zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    public final CountDownLatch zzb = new CountDownLatch(1);

    public zzi(Context context, zzcfo zzcfoVar) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = zzcfoVar;
        this.zzm = zzcfoVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzay.zzc().zzb(zzbhy.zzbT)).booleanValue();
        this.zzn = booleanValue;
        this.zzi = zzfks.zza(context, newCachedThreadPool, booleanValue);
        this.zzf = ((Boolean) zzay.zzc().zzb(zzbhy.zzbP)).booleanValue();
        this.zzg = ((Boolean) zzay.zzc().zzb(zzbhy.zzbU)).booleanValue();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbS)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzcB)).booleanValue()) {
            this.zza = zzc();
        }
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzcv)).booleanValue()) {
            zzcfv.zza.execute(this);
            return;
        }
        zzaw.zzb();
        if (zzcfb.zzs()) {
            zzcfv.zza.execute(this);
        } else {
            run();
        }
    }

    private final zzany zzj() {
        return zzi() == 2 ? (zzany) this.zze.get() : (zzany) this.zzd.get();
    }

    private final void zzm() {
        zzany zzj = zzj();
        if (this.zzc.isEmpty() || zzj == null) {
            return;
        }
        for (Object[] objArr : this.zzc) {
            int length = objArr.length;
            if (length == 1) {
                zzj.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzj.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzc.clear();
    }

    private final void zzo(boolean z) {
        this.zzd.set(zzaob.zzt(this.zzl.zza, zzp(this.zzj), z, this.zzo));
    }

    private static final Context zzp(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, com.google.android.gms.internal.ads.zzcfo] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzcB)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z = this.zzl.zzd;
            final boolean z2 = false;
            if (!((Boolean) zzay.zzc().zzb(zzbhy.zzaQ)).booleanValue() && z) {
                z2 = true;
            }
            if (zzi() == 1) {
                zzo(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzi.this.zzb(z2);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzanv zza = zzanv.zza(this.zzl.zza, zzp(this.zzj), z2, this.zzn);
                    this.zze.set(zza);
                    if (this.zzg && !zza.zzq()) {
                        this.zzo = 1;
                        zzo(z2);
                    }
                } catch (NullPointerException e2) {
                    this.zzo = 1;
                    zzo(z2);
                    this.zzi.zzc(2031, System.currentTimeMillis() - currentTimeMillis, e2);
                }
            }
        } finally {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    public final /* synthetic */ void zzb(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzanv.zza(this.zzm.zza, zzp(this.zzk), z, this.zzn).zzo();
        } catch (NullPointerException e2) {
            this.zzi.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e2);
        }
    }

    public final boolean zzc() {
        Context context = this.zzj;
        zzfks zzfksVar = this.zzi;
        zzh zzhVar = new zzh(this);
        return new zzfmo(this.zzj, zzflu.zzb(context, zzfksVar), zzhVar, ((Boolean) zzay.zzc().zzb(zzbhy.zzbQ)).booleanValue()).zzd(1);
    }

    public final boolean zzd() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e2) {
            zzcfi.zzk("Interrupted during GADSignals creation.", e2);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (zzd()) {
            zzany zzj = zzj();
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzia)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 4, null);
            }
            if (zzj != null) {
                zzm();
                return zzj.zzf(zzp(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzg(Context context) {
        zzany zzj;
        if (!zzd() || (zzj = zzj()) == null) {
            return "";
        }
        zzm();
        return zzj.zzg(zzp(context));
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final String zzh(Context context, View view, Activity activity) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhZ)).booleanValue()) {
            if (zzd()) {
                zzany zzj = zzj();
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzia)).booleanValue()) {
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
                }
                return zzj != null ? zzj.zzh(context, view, activity) : "";
            }
            return "";
        }
        zzany zzj2 = zzj();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzia)).booleanValue()) {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
        }
        return zzj2 != null ? zzj2.zzh(context, view, activity) : "";
    }

    public final int zzi() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzk(MotionEvent motionEvent) {
        zzany zzj = zzj();
        if (zzj != null) {
            zzm();
            zzj.zzk(motionEvent);
            return;
        }
        this.zzc.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzl(int i2, int i3, int i4) {
        zzany zzj = zzj();
        if (zzj == null) {
            this.zzc.add(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            return;
        }
        zzm();
        zzj.zzl(i2, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzn(View view) {
        zzany zzj = zzj();
        if (zzj != null) {
            zzj.zzn(view);
        }
    }
}
