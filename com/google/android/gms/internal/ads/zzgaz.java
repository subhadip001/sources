package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgaz extends zzgar {
    public zzgaz() {
        super(zzgek.class, new zzgax(zzfwv.class));
    }

    public static final void zzh(zzgek zzgekVar) {
        zzgik.zzb(zzgekVar.zza(), 0);
        if (zzgekVar.zzh().zzd() >= 16) {
            zzn(zzgekVar.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public static /* bridge */ /* synthetic */ zzgao zzm(int i2, int i3, int i4, int i5) {
        zzgem zzc = zzgen.zzc();
        zzgep zzc2 = zzgeq.zzc();
        zzc2.zzb(i4);
        zzc2.zza(i3);
        zzc.zzb((zzgeq) zzc2.zzaj());
        zzc.zza(i2);
        return new zzgao((zzgen) zzc.zzaj(), i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzgeq zzgeqVar) {
        if (zzgeqVar.zza() >= 10) {
            int zzg = zzgeqVar.zzg() - 2;
            if (zzg == 1) {
                if (zzgeqVar.zza() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (zzg == 2) {
                if (zzgeqVar.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (zzg == 3) {
                if (zzgeqVar.zza() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (zzg == 4) {
                if (zzgeqVar.zza() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else if (zzg == 5) {
                if (zzgeqVar.zza() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            } else {
                throw new GeneralSecurityException("unknown hash type");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzgay(this, zzgen.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgek.zzf(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzh((zzgek) zzglyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zze() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 3;
    }
}
