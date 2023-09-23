package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzajm {
    public static final boolean zza = zzajn.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzajn.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j2) {
        if (!this.zzc) {
            this.zzb.add(new zzajl(str, j2, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    public final synchronized void zzb(String str) {
        List list;
        long j2;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j2 = 0;
        } else {
            j2 = ((zzajl) this.zzb.get(list.size() - 1)).zzc - ((zzajl) this.zzb.get(0)).zzc;
        }
        if (j2 <= 0) {
            return;
        }
        long j3 = ((zzajl) this.zzb.get(0)).zzc;
        zzajn.zza("(%-4d ms) %s", Long.valueOf(j2), str);
        for (zzajl zzajlVar : this.zzb) {
            long j4 = zzajlVar.zzc;
            zzajn.zza("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(zzajlVar.zzb), zzajlVar.zza);
            j3 = j4;
        }
    }
}
