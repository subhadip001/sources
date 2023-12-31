package com.google.android.gms.internal.measurement;

import f.a.b.a.a;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzil implements Serializable, zzii {
    public final Object zza;

    public zzil(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzil) {
            Object obj2 = this.zza;
            Object obj3 = ((zzil) obj).zza;
            return obj2 == obj3 || obj2.equals(obj3);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        StringBuilder A = a.A("Suppliers.ofInstance(");
        A.append(this.zza);
        A.append(")");
        return A.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        return this.zza;
    }
}
