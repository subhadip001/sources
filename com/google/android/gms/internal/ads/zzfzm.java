package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfzm extends zzgas {
    private static final byte[] zza = new byte[0];

    public zzfzm() {
        super(zzgdx.class, zzgea.class, new zzfzk(zzfwk.class));
    }

    public static /* bridge */ /* synthetic */ zzgao zzh(int i2, int i3, int i4, zzfwp zzfwpVar, byte[] bArr, int i5) {
        zzgdq zza2 = zzgdr.zza();
        zzgec zza3 = zzged.zza();
        int i6 = 4;
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzgjg.zzv(bArr));
        zzged zzgedVar = (zzged) zza3.zzaj();
        zzgfl zza4 = zzgfm.zza();
        zza4.zza(zzfwpVar.zzb());
        zza4.zzb(zzgjg.zzv(zzfwpVar.zzc()));
        int zzd = zzfwpVar.zzd() - 1;
        if (zzd == 0) {
            i6 = 3;
        } else if (zzd != 1) {
            i6 = zzd != 2 ? 6 : 5;
        }
        zza4.zzc(i6);
        zzgdn zza5 = zzgdo.zza();
        zza5.zza((zzgfm) zza4.zzaj());
        zzgdt zzc = zzgdu.zzc();
        zzc.zzb(zzgedVar);
        zzc.zza((zzgdo) zza5.zzaj());
        zzc.zzc(i4);
        zza2.zza((zzgdu) zzc.zzaj());
        return new zzgao((zzgdr) zza2.zzaj(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzfzl(this, zzgdr.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgdx.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzgdx zzgdxVar = (zzgdx) zzglyVar;
        if (!zzgdxVar.zzg().zzD()) {
            zzgik.zzb(zzgdxVar.zza(), 0);
            zzfzv.zza(zzgdxVar.zzf().zzc());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 4;
    }
}
