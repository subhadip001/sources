package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzesn implements zzeta {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzesn(String str, String str2, String str3, String str4, Long l2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l2;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfcj.zzc(bundle, "gmp_app_id", this.zza);
        zzfcj.zzc(bundle, "fbs_aiid", this.zzb);
        zzfcj.zzc(bundle, "fbs_aeid", this.zzc);
        zzfcj.zzc(bundle, "apm_id_origin", this.zzd);
        Long l2 = this.zze;
        if (l2 != null) {
            bundle.putLong("sai_timeout", l2.longValue());
        }
    }
}
