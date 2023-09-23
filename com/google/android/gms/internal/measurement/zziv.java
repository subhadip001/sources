package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zziv extends zzix {
    public final /* synthetic */ zzje zza;
    private int zzb = 0;
    private final int zzc;

    public zziv(zzje zzjeVar) {
        this.zza = zzjeVar;
        this.zzc = zzjeVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zziz
    public final byte zza() {
        int i2 = this.zzb;
        if (i2 < this.zzc) {
            this.zzb = i2 + 1;
            return this.zza.zzb(i2);
        }
        throw new NoSuchElementException();
    }
}
