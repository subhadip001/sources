package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfzw implements zzghi {
    private final String zza;
    private final int zzb;
    private zzgco zzc;
    private zzgbq zzd;
    private int zze;
    private zzgda zzf;

    public zzfzw(zzgfm zzgfmVar) {
        String zzf = zzgfmVar.zzf();
        this.zza = zzf;
        if (zzf.equals(zzfxk.zzb)) {
            try {
                zzgcr zze = zzgcr.zze(zzgfmVar.zze(), zzgka.zza());
                this.zzc = (zzgco) zzfxi.zzd(zzgfmVar);
                this.zzb = zze.zza();
            } catch (zzgla e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else if (zzf.equals(zzfxk.zza)) {
            try {
                zzgbt zzd = zzgbt.zzd(zzgfmVar.zze(), zzgka.zza());
                this.zzd = (zzgbq) zzfxi.zzd(zzgfmVar);
                this.zze = zzd.zze().zza();
                this.zzb = this.zze + zzd.zzf().zza();
            } catch (zzgla e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else if (zzf.equals(zzfzh.zza)) {
            try {
                zzgdd zze2 = zzgdd.zze(zzgfmVar.zze(), zzgka.zza());
                this.zzf = (zzgda) zzfxi.zzd(zzgfmVar);
                this.zzb = zze2.zza();
            } catch (zzgla e4) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e4);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(zzf)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzghi
    public final zzgan zzb(byte[] bArr) {
        if (bArr.length == this.zzb) {
            if (this.zza.equals(zzfxk.zzb)) {
                zzgcn zzc = zzgco.zzc();
                zzc.zzah(this.zzc);
                zzc.zza(zzgjg.zzw(bArr, 0, this.zzb));
                return new zzgan((zzfwd) zzfxi.zzg(this.zza, (zzgco) zzc.zzaj(), zzfwd.class));
            } else if (this.zza.equals(zzfxk.zza)) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
                zzgbv zzc2 = zzgbw.zzc();
                zzc2.zzah(this.zzd.zzf());
                zzc2.zza(zzgjg.zzv(copyOfRange));
                zzgej zzc3 = zzgek.zzc();
                zzc3.zzah(this.zzd.zzg());
                zzc3.zza(zzgjg.zzv(copyOfRange2));
                zzgbp zzc4 = zzgbq.zzc();
                zzc4.zzc(this.zzd.zza());
                zzc4.zza((zzgbw) zzc2.zzaj());
                zzc4.zzb((zzgek) zzc3.zzaj());
                return new zzgan((zzfwd) zzfxi.zzg(this.zza, (zzgbq) zzc4.zzaj(), zzfwd.class));
            } else if (this.zza.equals(zzfzh.zza)) {
                zzgcz zzc5 = zzgda.zzc();
                zzc5.zzah(this.zzf);
                zzc5.zza(zzgjg.zzw(bArr, 0, this.zzb));
                return new zzgan((zzfwj) zzfxi.zzg(this.zza, (zzgda) zzc5.zzaj(), zzfwj.class));
            } else {
                throw new GeneralSecurityException("unknown DEM key type");
            }
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
