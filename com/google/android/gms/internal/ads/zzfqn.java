package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfqn implements Iterator {
    public int zzb;
    public int zzc;
    public int zzd;
    public final /* synthetic */ zzfqr zze;

    public /* synthetic */ zzfqn(zzfqr zzfqrVar, zzfqj zzfqjVar) {
        int i2;
        this.zze = zzfqrVar;
        i2 = zzfqrVar.zzf;
        this.zzb = i2;
        this.zzc = zzfqrVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i2;
        i2 = this.zze.zzf;
        if (i2 != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i2 = this.zzc;
            this.zzd = i2;
            Object zza = zza(i2);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfos.zzi(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzfqr zzfqrVar = this.zze;
        zzfqrVar.remove(zzfqr.zzg(zzfqrVar, this.zzd));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i2);
}
