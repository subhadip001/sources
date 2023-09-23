package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgaw extends zzgar {
    public zzgaw() {
        super(zzgbh.class, new zzgau(zzfwv.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzm(zzgbn zzgbnVar) {
        if (zzgbnVar.zza() >= 10) {
            if (zzgbnVar.zza() > 16) {
                throw new GeneralSecurityException("tag size too long");
            }
            return;
        }
        throw new GeneralSecurityException("tag size too short");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(int i2) {
        if (i2 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzgav(this, zzgbk.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgbh.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzgbh zzgbhVar = (zzgbh) zzglyVar;
        zzgik.zzb(zzgbhVar.zza(), 0);
        zzn(zzgbhVar.zzg().zzd());
        zzm(zzgbhVar.zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 3;
    }
}
