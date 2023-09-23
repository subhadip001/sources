package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfkd implements zzfji {
    private static final zzfkd zza = new zzfkd();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfjz();
    private static final Runnable zze = new zzfka();
    private int zzg;
    private long zzk;
    private final List zzf = new ArrayList();
    private final zzfjw zzi = new zzfjw();
    private final zzfjk zzh = new zzfjk();
    private final zzfjx zzj = new zzfjx(new zzfkg());

    public static zzfkd zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfkd zzfkdVar) {
        zzfkdVar.zzg = 0;
        zzfkdVar.zzk = System.nanoTime();
        zzfkdVar.zzi.zzi();
        long nanoTime = System.nanoTime();
        zzfjj zza2 = zzfkdVar.zzh.zza();
        if (zzfkdVar.zzi.zze().size() > 0) {
            Iterator it = zzfkdVar.zzi.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zzfjr.zza(0, 0, 0, 0);
                View zza4 = zzfkdVar.zzi.zza(str);
                zzfjj zzb2 = zzfkdVar.zzh.zzb();
                String zzc2 = zzfkdVar.zzi.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfjr.zzb(zza5, str);
                    zzfjr.zze(zza5, zzc2);
                    zzfjr.zzc(zza3, zza5);
                }
                zzfjr.zzh(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfkdVar.zzj.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfkdVar.zzi.zzf().size() > 0) {
            JSONObject zza6 = zzfjr.zza(0, 0, 0, 0);
            zzfkdVar.zzk(null, zza2, zza6, 1);
            zzfjr.zzh(zza6);
            zzfkdVar.zzj.zzd(zza6, zzfkdVar.zzi.zzf(), nanoTime);
        } else {
            zzfkdVar.zzj.zzb();
        }
        zzfkdVar.zzi.zzg();
        long nanoTime2 = System.nanoTime() - zzfkdVar.zzk;
        if (zzfkdVar.zzf.size() > 0) {
            for (zzfkc zzfkcVar : zzfkdVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfkcVar.zzb();
                if (zzfkcVar instanceof zzfkb) {
                    ((zzfkb) zzfkcVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfjj zzfjjVar, JSONObject jSONObject, int i2) {
        zzfjjVar.zzb(view, jSONObject, this, i2 == 1);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfji
    public final void zza(View view, zzfjj zzfjjVar, JSONObject jSONObject) {
        int zzj;
        if (zzfju.zzb(view) != null || (zzj = this.zzi.zzj(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfjjVar.zza(view);
        zzfjr.zzc(jSONObject, zza2);
        String zzd2 = this.zzi.zzd(view);
        if (zzd2 != null) {
            zzfjr.zzb(zza2, zzd2);
            this.zzi.zzh();
        } else {
            zzfjv zzb2 = this.zzi.zzb(view);
            if (zzb2 != null) {
                zzfjr.zzd(zza2, zzb2);
            }
            zzk(view, zzfjjVar, zza2, zzj);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfjy(this));
    }
}
