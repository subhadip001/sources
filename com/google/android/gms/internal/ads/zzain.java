package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzain extends Thread {
    private static final boolean zza = zzajn.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzail zzd;
    private volatile boolean zze = false;
    private final zzajo zzf;
    private final zzais zzg;

    public zzain(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzail zzailVar, zzais zzaisVar, byte[] bArr) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzailVar;
        this.zzg = zzaisVar;
        this.zzf = new zzajo(this, blockingQueue2, zzaisVar, null);
    }

    private void zzc() {
        zzajb zzajbVar = (zzajb) this.zzb.take();
        zzajbVar.zzm("cache-queue-take");
        zzajbVar.zzt(1);
        try {
            zzajbVar.zzw();
            zzaik zza2 = this.zzd.zza(zzajbVar.zzj());
            if (zza2 == null) {
                zzajbVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzajbVar)) {
                    this.zzc.put(zzajbVar);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza2.zza(currentTimeMillis)) {
                zzajbVar.zzm("cache-hit-expired");
                zzajbVar.zze(zza2);
                if (!this.zzf.zzc(zzajbVar)) {
                    this.zzc.put(zzajbVar);
                }
                return;
            }
            zzajbVar.zzm("cache-hit");
            zzajh zzh = zzajbVar.zzh(new zzaix(zza2.zza, zza2.zzg));
            zzajbVar.zzm("cache-hit-parsed");
            if (!zzh.zzc()) {
                zzajbVar.zzm("cache-parsing-failed");
                this.zzd.zzc(zzajbVar.zzj(), true);
                zzajbVar.zze(null);
                if (!this.zzf.zzc(zzajbVar)) {
                    this.zzc.put(zzajbVar);
                }
                return;
            }
            if (zza2.zzf < currentTimeMillis) {
                zzajbVar.zzm("cache-hit-refresh-needed");
                zzajbVar.zze(zza2);
                zzh.zzd = true;
                if (!this.zzf.zzc(zzajbVar)) {
                    this.zzg.zzb(zzajbVar, zzh, new zzaim(this, zzajbVar));
                } else {
                    this.zzg.zzb(zzajbVar, zzh, null);
                }
            } else {
                this.zzg.zzb(zzajbVar, zzh, null);
            }
        } finally {
            zzajbVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzajn.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzajn.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
