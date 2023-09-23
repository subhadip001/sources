package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfrj {
    public Object[] zza;
    public int zzb;
    public zzfri zzc;

    public zzfrj() {
        this(4);
    }

    private final void zzd(int i2) {
        int i3 = i2 + i2;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i3 > length) {
            this.zza = Arrays.copyOf(objArr, zzfrb.zzd(length, i3));
        }
    }

    public final zzfrj zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfqg.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i2 = this.zzb;
        int i3 = i2 + i2;
        objArr[i3] = obj;
        objArr[i3 + 1] = obj2;
        this.zzb = i2 + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzfrj zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(iterable.size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfrk zzc() {
        zzfri zzfriVar = this.zzc;
        if (zzfriVar == null) {
            zzfsv zzh = zzfsv.zzh(this.zzb, this.zza, this);
            zzfri zzfriVar2 = this.zzc;
            if (zzfriVar2 == null) {
                return zzh;
            }
            throw zzfriVar2.zza();
        }
        throw zzfriVar.zza();
    }

    public zzfrj(int i2) {
        this.zza = new Object[i2 + i2];
        this.zzb = 0;
    }
}
