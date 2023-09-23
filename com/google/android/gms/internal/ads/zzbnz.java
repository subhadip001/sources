package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbnz implements zzbol {
    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcli zzcliVar = (zzcli) obj;
        zzbkn zzM = zzcliVar.zzM();
        if (zzM != null && (zza = zzM.zza()) != null) {
            zzcliVar.zze("nativeAdViewSignalsReady", zza);
        } else {
            zzcliVar.zze("nativeAdViewSignalsReady", new JSONObject());
        }
    }
}
