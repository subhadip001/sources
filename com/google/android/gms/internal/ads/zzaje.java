package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaje {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzail zze;
    private final zzaiu zzf;
    private final zzaiv[] zzg;
    private zzain zzh;
    private final List zzi;
    private final List zzj;
    private final zzais zzk;

    public zzaje(zzail zzailVar, zzaiu zzaiuVar, int i2) {
        zzais zzaisVar = new zzais(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzailVar;
        this.zzf = zzaiuVar;
        this.zzg = new zzaiv[4];
        this.zzk = zzaisVar;
    }

    public final zzajb zza(zzajb zzajbVar) {
        zzajbVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzajbVar);
        }
        zzajbVar.zzg(this.zza.incrementAndGet());
        zzajbVar.zzm("add-to-queue");
        zzc(zzajbVar, 0);
        this.zzc.add(zzajbVar);
        return zzajbVar;
    }

    public final void zzb(zzajb zzajbVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzajbVar);
        }
        synchronized (this.zzi) {
            for (zzajd zzajdVar : this.zzi) {
                zzajdVar.zza();
            }
        }
        zzc(zzajbVar, 5);
    }

    public final void zzc(zzajb zzajbVar, int i2) {
        synchronized (this.zzj) {
            for (zzajc zzajcVar : this.zzj) {
                zzajcVar.zza();
            }
        }
    }

    public final void zzd() {
        zzain zzainVar = this.zzh;
        if (zzainVar != null) {
            zzainVar.zzb();
        }
        zzaiv[] zzaivVarArr = this.zzg;
        for (int i2 = 0; i2 < 4; i2++) {
            zzaiv zzaivVar = zzaivVarArr[i2];
            if (zzaivVar != null) {
                zzaivVar.zza();
            }
        }
        zzain zzainVar2 = new zzain(this.zzc, this.zzd, this.zze, this.zzk, null);
        this.zzh = zzainVar2;
        zzainVar2.start();
        for (int i3 = 0; i3 < 4; i3++) {
            zzaiv zzaivVar2 = new zzaiv(this.zzd, this.zzf, this.zze, this.zzk, null);
            this.zzg[i3] = zzaivVar2;
            zzaivVar2.start();
        }
    }
}
