package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftr;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfuf extends zzftr.zzi {
    private static final zzfuc zzaV;
    private static final Logger zzaW = Logger.getLogger(zzfuf.class.getName());
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        zzfuc zzfueVar;
        try {
            zzfueVar = new zzfud(AtomicReferenceFieldUpdater.newUpdater(zzfuf.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfuf.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzfueVar = new zzfue(null);
        }
        zzaV = zzfueVar;
        if (th != null) {
            zzaW.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzfuf(int i2) {
        this.remaining = i2;
    }

    public static /* synthetic */ int zzA(zzfuf zzfufVar) {
        int i2 = zzfufVar.remaining - 1;
        zzfufVar.remaining = i2;
        return i2;
    }

    public final int zzB() {
        return zzaV.zza(this);
    }

    public final Set zzE() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zzf(newSetFromMap);
            zzaV.zzb(this, null, newSetFromMap);
            Set<Throwable> set2 = this.seenExceptions;
            set2.getClass();
            return set2;
        }
        return set;
    }

    public final void zzF() {
        this.seenExceptions = null;
    }

    public abstract void zzf(Set set);
}
