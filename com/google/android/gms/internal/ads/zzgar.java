package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgar {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    public zzgar(Class cls, zzgaq... zzgaqVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 <= 0; i2++) {
            zzgaq zzgaqVar = zzgaqVarArr[i2];
            if (!hashMap.containsKey(zzgaqVar.zzb())) {
                hashMap.put(zzgaqVar.zzb(), zzgaqVar);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgaqVar.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzgaqVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzgap zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzgly zzb(zzgjg zzgjgVar);

    public abstract String zzc();

    public abstract void zzd(zzgly zzglyVar);

    public int zze() {
        return 1;
    }

    public abstract int zzf();

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgly zzglyVar, Class cls) {
        zzgaq zzgaqVar = (zzgaq) this.zzb.get(cls);
        if (zzgaqVar != null) {
            return zzgaqVar.zza(zzglyVar);
        }
        throw new IllegalArgumentException(a.q("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
