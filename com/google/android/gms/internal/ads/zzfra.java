package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzfra extends zzfrb {
    public Object[] zza;
    public int zzb = 0;
    public boolean zzc;

    public zzfra(int i2) {
        this.zza = new Object[i2];
    }

    private final void zze(int i2) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i2) {
            this.zza = Arrays.copyOf(objArr, zzfrb.zzd(length, i2));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public final zzfra zza(Object obj) {
        Objects.requireNonNull(obj);
        zze(this.zzb + 1);
        Object[] objArr = this.zza;
        int i2 = this.zzb;
        this.zzb = i2 + 1;
        objArr[i2] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrb
    public /* bridge */ /* synthetic */ zzfrb zzb(Object obj) {
        throw null;
    }

    public final zzfrb zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zze(collection.size() + this.zzb);
            if (collection instanceof zzfrc) {
                this.zzb = ((zzfrc) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        for (Object obj : iterable) {
            zzb(obj);
        }
        return this;
    }
}
