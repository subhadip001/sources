package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzek implements zzer {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzew zzd;

    public zzek(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzer, com.google.android.gms.internal.ads.zzfo
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzf(zzft zzftVar) {
        Objects.requireNonNull(zzftVar);
        if (this.zzb.contains(zzftVar)) {
            return;
        }
        this.zzb.add(zzftVar);
        this.zzc++;
    }

    public final void zzg(int i2) {
        zzew zzewVar = this.zzd;
        int i3 = zzeg.zza;
        for (int i4 = 0; i4 < this.zzc; i4++) {
            ((zzft) this.zzb.get(i4)).zza(this, zzewVar, this.zza, i2);
        }
    }

    public final void zzh() {
        zzew zzewVar = this.zzd;
        int i2 = zzeg.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzft) this.zzb.get(i3)).zzb(this, zzewVar, this.zza);
        }
        this.zzd = null;
    }

    public final void zzi(zzew zzewVar) {
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzft) this.zzb.get(i2)).zzc(this, zzewVar, this.zza);
        }
    }

    public final void zzj(zzew zzewVar) {
        this.zzd = zzewVar;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzft) this.zzb.get(i2)).zzd(this, zzewVar, this.zza);
        }
    }
}
