package com.google.android.gms.internal.measurement;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zziy extends zzjb {
    private final int zzc;

    public zziy(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzje.zzj(0, i3, bArr.length);
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zzje
    public final byte zza(int i2) {
        int i3 = this.zzc;
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(a.i("Index < 0: ", i2));
            }
            throw new ArrayIndexOutOfBoundsException(a.k("Index > length: ", i2, ", ", i3));
        }
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zzje
    public final byte zzb(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzjb
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzjb, com.google.android.gms.internal.measurement.zzje
    public final int zzd() {
        return this.zzc;
    }
}
