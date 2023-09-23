package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzgjc extends zzgjb {
    public final byte[] zza;

    public zzgjc(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgjg) && zzd() == ((zzgjg) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzgjc) {
                zzgjc zzgjcVar = (zzgjc) obj;
                int zzr = zzr();
                int zzr2 = zzgjcVar.zzr();
                if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
                    return zzg(zzgjcVar, 0, zzd());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public byte zza(int i2) {
        return this.zza[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public byte zzb(int i2) {
        return this.zza[i2];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public void zze(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.zza, i2, bArr, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzgjb
    public final boolean zzg(zzgjg zzgjgVar, int i2, int i3) {
        if (i3 <= zzgjgVar.zzd()) {
            int i4 = i2 + i3;
            if (i4 <= zzgjgVar.zzd()) {
                if (zzgjgVar instanceof zzgjc) {
                    zzgjc zzgjcVar = (zzgjc) zzgjgVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgjcVar.zza;
                    int zzc = zzc() + i3;
                    int zzc2 = zzc();
                    int zzc3 = zzgjcVar.zzc() + i2;
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzgjgVar.zzk(i2, i4).equals(zzk(0, i3));
            }
            int zzd = zzgjgVar.zzd();
            StringBuilder C = a.C("Ran off end of other: ", i2, ", ", i3, ", ");
            C.append(zzd);
            throw new IllegalArgumentException(C.toString());
        }
        int zzd2 = zzd();
        throw new IllegalArgumentException("Length too large: " + i3 + zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final int zzi(int i2, int i3, int i4) {
        return zzgky.zzd(i2, this.zza, zzc() + i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final int zzj(int i2, int i3, int i4) {
        int zzc = zzc() + i3;
        return zzgnx.zzf(i2, this.zza, zzc, i4 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final zzgjg zzk(int i2, int i3) {
        int zzq = zzgjg.zzq(i2, i3, zzd());
        return zzq == 0 ? zzgjg.zzb : new zzgiz(this.zza, zzc() + i2, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final zzgjo zzl() {
        return zzgjo.zzI(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final void zzo(zzgiv zzgivVar) {
        zzgivVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final boolean zzp() {
        int zzc = zzc();
        return zzgnx.zzj(this.zza, zzc, zzd() + zzc);
    }
}
