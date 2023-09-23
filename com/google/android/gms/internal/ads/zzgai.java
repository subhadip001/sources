package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgai extends zzgas {
    public zzgai() {
        super(zzgfb.class, zzgfe.class, new zzgag(zzfwk.class));
    }

    public static /* bridge */ /* synthetic */ zzgao zzg(int i2, int i3, int i4, int i5) {
        zzgex zza = zzgey.zza();
        zza.zzc(3);
        zza.zzb(3);
        zza.zza(i4);
        zzgeu zza2 = zzgev.zza();
        zza2.zza((zzgey) zza.zzaj());
        return new zzgao((zzgev) zza2.zzaj(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzgah(this, zzgev.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgfb.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzgfb zzgfbVar = (zzgfb) zzglyVar;
        if (!zzgfbVar.zzg().zzD()) {
            if (zzgfbVar.zzk()) {
                zzgik.zzb(zzgfbVar.zza(), 0);
                zzgal.zza(zzgfbVar.zzf().zzc());
                return;
            }
            throw new GeneralSecurityException("Missing public key.");
        }
        throw new GeneralSecurityException("Private key is empty.");
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 4;
    }
}
