package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzvn {
    private zzvm zza;
    private zzvv zzb;

    public boolean zzh() {
        throw null;
    }

    public abstract zzvo zzj(zzjv[] zzjvVarArr, zztz zztzVar, zzsb zzsbVar, zzci zzciVar);

    public abstract void zzk(Object obj);

    public final zzvv zzl() {
        zzvv zzvvVar = this.zzb;
        Objects.requireNonNull(zzvvVar);
        return zzvvVar;
    }

    public final void zzm(zzvm zzvmVar, zzvv zzvvVar) {
        this.zza = zzvmVar;
        this.zzb = zzvvVar;
    }

    public final void zzn() {
        zzvm zzvmVar = this.zza;
        if (zzvmVar != null) {
            zzvmVar.zzj();
        }
    }
}
