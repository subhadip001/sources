package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfvi extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzfvh(null);
    private static final Runnable zzb = new zzfvh(null);

    private final void zzc(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzfvg zzfvgVar = null;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (!(runnable instanceof zzfvg)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzfvgVar = (zzfvg) runnable;
            }
            i2++;
            if (i2 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzfvgVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !zzg();
            if (z) {
                try {
                    obj = zza();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, zza)) {
                        zzc(currentThread);
                    }
                    zzd(th);
                    return;
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzc(currentThread);
            }
            if (z) {
                zze(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzfvg) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = a.v(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String zzb2 = zzb();
        return a.v(new StringBuilder(str.length() + 2 + String.valueOf(zzb2).length()), str, ", ", zzb2);
    }

    public abstract Object zza();

    public abstract String zzb();

    public abstract void zzd(Throwable th);

    public abstract void zze(Object obj);

    public abstract boolean zzg();

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzfvg zzfvgVar = new zzfvg(this, null);
            zzfvgVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzfvgVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
