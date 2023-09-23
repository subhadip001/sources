package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfxt extends zzgar {
    public zzfxt() {
        super(zzgbw.class, new zzfxr(zzgic.class));
    }

    public static final void zzh(zzgbw zzgbwVar) {
        zzgik.zzb(zzgbwVar.zza(), 0);
        zzgik.zza(zzgbwVar.zzh().zzd());
        zzm(zzgbwVar.zzg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzm(zzgcc zzgccVar) {
        if (zzgccVar.zza() < 12 || zzgccVar.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzfxs(this, zzgbz.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgbw.zzf(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzh((zzgbw) zzglyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 3;
    }
}
