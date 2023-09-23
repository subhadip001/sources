package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgpt implements zzgqh, zzgpo {
    private static final Object zza = new Object();
    private volatile zzgqh zzb;
    private volatile Object zzc = zza;

    private zzgpt(zzgqh zzgqhVar) {
        this.zzb = zzgqhVar;
    }

    public static zzgpo zza(zzgqh zzgqhVar) {
        if (zzgqhVar instanceof zzgpo) {
            return (zzgpo) zzgqhVar;
        }
        Objects.requireNonNull(zzgqhVar);
        return new zzgpt(zzgqhVar);
    }

    public static zzgqh zzc(zzgqh zzgqhVar) {
        Objects.requireNonNull(zzgqhVar);
        return zzgqhVar instanceof zzgpt ? zzgqhVar : new zzgpt(zzgqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zzb();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2 && obj3 != obj) {
                        String valueOf = String.valueOf(obj3);
                        String valueOf2 = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
