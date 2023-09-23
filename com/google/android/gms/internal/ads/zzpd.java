package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzpd {
    public final int zza;
    public final zzsb zzb;
    private final CopyOnWriteArrayList zzc;

    public zzpd() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzpd(CopyOnWriteArrayList copyOnWriteArrayList, int i2, zzsb zzsbVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i2;
        this.zzb = zzsbVar;
    }

    public final zzpd zza(int i2, zzsb zzsbVar) {
        return new zzpd(this.zzc, i2, zzsbVar);
    }

    public final void zzb(Handler handler, zzpe zzpeVar) {
        Objects.requireNonNull(zzpeVar);
        this.zzc.add(new zzpc(handler, zzpeVar));
    }

    public final void zzc(zzpe zzpeVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzpc zzpcVar = (zzpc) it.next();
            if (zzpcVar.zzb == zzpeVar) {
                this.zzc.remove(zzpcVar);
            }
        }
    }
}
