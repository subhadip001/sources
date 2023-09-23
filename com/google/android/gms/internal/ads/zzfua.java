package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfua extends zzfuf {
    private static final Logger zza = Logger.getLogger(zzfua.class.getName());
    private zzfrc zzb;
    private final boolean zzc;
    private final boolean zze;

    public zzfua(zzfrc zzfrcVar, boolean z, boolean z2) {
        super(zzfrcVar.size());
        this.zzb = zzfrcVar;
        this.zzc = z;
        this.zze = z2;
    }

    private final void zzG(int i2, Future future) {
        try {
            zzg(i2, zzfva.zzp(future));
        } catch (ExecutionException e2) {
            zzI(e2.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH */
    public final void zzy(zzfrc zzfrcVar) {
        int zzB = zzB();
        int i2 = 0;
        zzfos.zzi(zzB >= 0, "Less than 0 remaining futures");
        if (zzB == 0) {
            if (zzfrcVar != null) {
                zzftg it = zzfrcVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i2, future);
                    }
                    i2++;
                }
            }
            zzF();
            zzv();
            zzz(2);
        }
    }

    private final void zzI(Throwable th) {
        Objects.requireNonNull(th);
        if (this.zzc && !zze(th) && zzK(zzE(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final String zza() {
        zzfrc zzfrcVar = this.zzb;
        return zzfrcVar != null ? "futures=".concat(zzfrcVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final void zzb() {
        zzfrc zzfrcVar = this.zzb;
        zzz(1);
        if ((zzfrcVar != null) && isCancelled()) {
            boolean zzu = zzu();
            zzftg it = zzfrcVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzu);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzf(Set set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable zzp = zzp();
        zzp.getClass();
        zzK(set, zzp);
    }

    public abstract void zzg(int i2, Object obj);

    public abstract void zzv();

    public final void zzw() {
        zzfrc zzfrcVar = this.zzb;
        zzfrcVar.getClass();
        if (zzfrcVar.isEmpty()) {
            zzv();
        } else if (this.zzc) {
            zzftg it = this.zzb.iterator();
            final int i2 = 0;
            while (it.hasNext()) {
                final zzfvj zzfvjVar = (zzfvj) it.next();
                zzfvjVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfty
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfua.this.zzx(zzfvjVar, i2);
                    }
                }, zzfuo.INSTANCE);
                i2++;
            }
        } else {
            final zzfrc zzfrcVar2 = this.zze ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzftz
                @Override // java.lang.Runnable
                public final void run() {
                    zzfua.this.zzy(zzfrcVar2);
                }
            };
            zzftg it2 = this.zzb.iterator();
            while (it2.hasNext()) {
                ((zzfvj) it2.next()).zzc(runnable, zzfuo.INSTANCE);
            }
        }
    }

    public final /* synthetic */ void zzx(zzfvj zzfvjVar, int i2) {
        try {
            if (zzfvjVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i2, zzfvjVar);
            }
        } finally {
            zzy(null);
        }
    }

    public void zzz(int i2) {
        this.zzb = null;
    }
}
