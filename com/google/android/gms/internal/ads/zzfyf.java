package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfyf extends zzgar {
    public zzfyf() {
        super(zzgdg.class, new zzfyd(zzfwd.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final zzgap zza() {
        return new zzfye(this, zzgdj.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgdg.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzgdg zzgdgVar = (zzgdg) zzglyVar;
        zzgik.zzb(zzgdgVar.zza(), 0);
        if (zzgdgVar.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 3;
    }
}
