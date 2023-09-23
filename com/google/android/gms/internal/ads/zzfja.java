package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfja {
    private static final zzfja zza = new zzfja();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfja() {
    }

    public static zzfja zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzfip zzfipVar) {
        this.zzb.add(zzfipVar);
    }

    public final void zze(zzfip zzfipVar) {
        boolean zzg = zzg();
        this.zzb.remove(zzfipVar);
        this.zzc.remove(zzfipVar);
        if (!zzg || zzg()) {
            return;
        }
        zzfjh.zzb().zzf();
    }

    public final void zzf(zzfip zzfipVar) {
        boolean zzg = zzg();
        this.zzc.add(zzfipVar);
        if (zzg) {
            return;
        }
        zzfjh.zzb().zze();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
