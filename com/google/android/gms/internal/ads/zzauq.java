package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzauq extends zzaus {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzauq(int i2, long j2) {
        super(i2);
        this.zza = j2;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzaus
    public final String toString() {
        return a.s(zzaus.zzg(this.zzaR), " leaves: ", Arrays.toString(this.zzb.toArray()), " containers: ", Arrays.toString(this.zzc.toArray()));
    }

    public final zzauq zza(int i2) {
        int size = this.zzc.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzauq zzauqVar = (zzauq) this.zzc.get(i3);
            if (zzauqVar.zzaR == i2) {
                return zzauqVar;
            }
        }
        return null;
    }

    public final zzaur zzb(int i2) {
        int size = this.zzb.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzaur zzaurVar = (zzaur) this.zzb.get(i3);
            if (zzaurVar.zzaR == i2) {
                return zzaurVar;
            }
        }
        return null;
    }

    public final void zzc(zzauq zzauqVar) {
        this.zzc.add(zzauqVar);
    }

    public final void zzd(zzaur zzaurVar) {
        this.zzb.add(zzaurVar);
    }
}
