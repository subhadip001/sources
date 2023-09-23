package com.google.android.gms.internal.measurement;

import f.a.b.a.a;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public class zzjb extends zzja {
    public final byte[] zza;

    public zzjb(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzje) && zzd() == ((zzje) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzjb) {
                zzjb zzjbVar = (zzjb) obj;
                int zzk = zzk();
                int zzk2 = zzjbVar.zzk();
                if (zzk == 0 || zzk2 == 0 || zzk == zzk2) {
                    int zzd = zzd();
                    if (zzd <= zzjbVar.zzd()) {
                        if (zzd <= zzjbVar.zzd()) {
                            byte[] bArr = this.zza;
                            byte[] bArr2 = zzjbVar.zza;
                            zzjbVar.zzc();
                            int i2 = 0;
                            int i3 = 0;
                            while (i2 < zzd) {
                                if (bArr[i2] != bArr2[i3]) {
                                    return false;
                                }
                                i2++;
                                i3++;
                            }
                            return true;
                        }
                        throw new IllegalArgumentException(a.k("Ran off end of other: 0, ", zzd, ", ", zzjbVar.zzd()));
                    }
                    int zzd2 = zzd();
                    throw new IllegalArgumentException("Length too large: " + zzd + zzd2);
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public byte zzb(int i2) {
        return this.zza[i2];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final int zze(int i2, int i3, int i4) {
        return zzkn.zzd(i2, this.zza, 0, i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final zzje zzf(int i2, int i3) {
        int zzj = zzje.zzj(0, i3, zzd());
        return zzj == 0 ? zzje.zzb : new zziy(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final void zzh(zziu zziuVar) {
        ((zzjj) zziuVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.measurement.zzje
    public final boolean zzi() {
        return zznd.zzf(this.zza, 0, zzd());
    }
}
