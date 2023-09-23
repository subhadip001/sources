package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcss implements zzcso {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    public zzcss(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcso
    public final void zza(Map map) {
        this.zza.zzz(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
