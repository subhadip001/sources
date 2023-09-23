package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzajf;
import com.google.android.gms.internal.ads.zzajk;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbh implements zzajf {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzbl zzb;

    public zzbh(zzbo zzboVar, String str, zzbl zzblVar) {
        this.zza = str;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajf
    public final void zza(zzajk zzajkVar) {
        String str = this.zza;
        String exc = zzajkVar.toString();
        zzcfi.zzj("Failed to load URL: " + str + "\n" + exc);
        this.zzb.zza((Object) null);
    }
}
