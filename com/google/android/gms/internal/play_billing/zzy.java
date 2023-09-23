package com.google.android.gms.internal.play_billing;

import java.util.Set;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public abstract class zzy extends zzr implements Set {
    private transient zzu zza;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzag.zza(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: zzd */
    public abstract zzah iterator();

    public final zzu zzf() {
        zzu zzuVar = this.zza;
        if (zzuVar == null) {
            zzu zzg = zzg();
            this.zza = zzg;
            return zzg;
        }
        return zzuVar;
    }

    public zzu zzg() {
        return zzu.zzg(toArray());
    }
}
