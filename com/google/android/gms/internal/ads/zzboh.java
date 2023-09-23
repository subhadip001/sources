package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzboh implements zzbol {
    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcliVar = (zzcli) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcliVar.zzbn();
        } else if ("resume".equals(str)) {
            zzcliVar.zzbo();
        }
    }
}
