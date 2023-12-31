package com.google.android.gms.internal.measurement;

import f.a.b.a.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class zzad implements Iterator {
    public final /* synthetic */ zzae zza;
    private int zzb = 0;

    public zzad(zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzc();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.zzb < this.zza.zzc()) {
            zzae zzaeVar = this.zza;
            int i2 = this.zzb;
            this.zzb = i2 + 1;
            return zzaeVar.zze(i2);
        }
        throw new NoSuchElementException(a.i("Out of bounds index: ", this.zzb));
    }
}
