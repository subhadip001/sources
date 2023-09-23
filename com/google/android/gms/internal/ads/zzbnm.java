package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbnm implements zzbol {
    private final zzbnn zza;

    public zzbnm(zzbnn zzbnnVar) {
        this.zza = zzbnnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            zzcfi.zzj("App event with no name parameter.");
        } else {
            this.zza.zzbD(str, (String) map.get("info"));
        }
    }
}
