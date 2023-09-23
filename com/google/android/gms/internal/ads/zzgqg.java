package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgqg implements zzgqh {
    private static final Object zza = new Object();
    private volatile zzgqh zzb;
    private volatile Object zzc = zza;

    private zzgqg(zzgqh zzgqhVar) {
        this.zzb = zzgqhVar;
    }

    public static zzgqh zza(zzgqh zzgqhVar) {
        if ((zzgqhVar instanceof zzgqg) || (zzgqhVar instanceof zzgpt)) {
            return zzgqhVar;
        }
        Objects.requireNonNull(zzgqhVar);
        return new zzgqg(zzgqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            zzgqh zzgqhVar = this.zzb;
            if (zzgqhVar == null) {
                return this.zzc;
            }
            Object zzb = zzgqhVar.zzb();
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return obj;
    }
}
