package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgak extends zzgar {
    public zzgak() {
        super(zzgfe.class, new zzgaj(zzfwl.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzgfe.zzg(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzgfe zzgfeVar = (zzgfe) zzglyVar;
        zzgik.zzb(zzgfeVar.zza(), 0);
        if (zzgfeVar.zzl()) {
            zzgal.zza(zzgfeVar.zzc());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }

    @Override // com.google.android.gms.internal.ads.zzgar
    public final int zzf() {
        return 5;
    }
}
