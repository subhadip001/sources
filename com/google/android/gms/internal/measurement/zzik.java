package com.google.android.gms.internal.measurement;

import f.a.b.a.a;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzik implements zzii {
    public volatile zzii zza;
    public volatile boolean zzb;
    public Object zzc;

    public zzik(zzii zziiVar) {
        Objects.requireNonNull(zziiVar);
        this.zza = zziiVar;
    }

    public final String toString() {
        Object obj = this.zza;
        StringBuilder A = a.A("Suppliers.memoize(");
        if (obj == null) {
            StringBuilder A2 = a.A("<supplier that returned ");
            A2.append(this.zzc);
            A2.append(">");
            obj = A2.toString();
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
                    zzii zziiVar = this.zza;
                    zziiVar.getClass();
                    Object zza = zziiVar.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    this.zza = null;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
