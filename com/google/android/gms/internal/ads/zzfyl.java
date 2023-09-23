package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfyl extends zzgap {
    public final /* synthetic */ zzfym zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfyl(zzfym zzfymVar, Class cls) {
        super(cls);
        this.zza = zzfymVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzglyVar) {
        zzggh zzc = zzggi.zzc();
        zzc.zza((zzggl) zzglyVar);
        zzc.zzb(0);
        return (zzggi) zzc.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) {
        return zzggl.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) {
        zzggl zzgglVar = (zzggl) zzglyVar;
        if (zzgglVar.zzf().isEmpty() || !zzgglVar.zzg()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
