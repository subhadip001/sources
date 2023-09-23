package com.google.android.gms.internal.measurement;

import f.a.b.a.a;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzij implements Serializable, zzii {
    public final zzii zza;
    public volatile transient boolean zzb;
    public transient Object zzc;

    public zzij(zzii zziiVar) {
        Objects.requireNonNull(zziiVar);
        this.zza = zziiVar;
    }

    public final String toString() {
        Object obj;
        StringBuilder A = a.A("Suppliers.memoize(");
        if (this.zzb) {
            StringBuilder A2 = a.A("<supplier that returned ");
            A2.append(this.zzc);
            A2.append(">");
            obj = A2.toString();
        } else {
            obj = this.zza;
        }
        A.append(obj);
        A.append(")");
        return A.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
