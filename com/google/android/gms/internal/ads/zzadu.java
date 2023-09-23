package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzadu extends zzadw {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzadu(int i2, long j2) {
        super(i2);
        this.zza = j2;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzadw
    public final String toString() {
        return a.s(zzadw.zzf(this.zzd), " leaves: ", Arrays.toString(this.zzb.toArray()), " containers: ", Arrays.toString(this.zzc.toArray()));
    }

    public final zzadu zza(int i2) {
        int size = this.zzc.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzadu zzaduVar = (zzadu) this.zzc.get(i3);
            if (zzaduVar.zzd == i2) {
                return zzaduVar;
            }
        }
        return null;
    }

    public final zzadv zzb(int i2) {
        int size = this.zzb.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzadv zzadvVar = (zzadv) this.zzb.get(i3);
            if (zzadvVar.zzd == i2) {
                return zzadvVar;
            }
        }
        return null;
    }

    public final void zzc(zzadu zzaduVar) {
        this.zzc.add(zzaduVar);
    }

    public final void zzd(zzadv zzadvVar) {
        this.zzb.add(zzadvVar);
    }
}
