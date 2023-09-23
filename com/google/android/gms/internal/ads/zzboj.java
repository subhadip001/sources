package com.google.android.gms.internal.ads;

import com.arthenica.ffmpegkit.Chapter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzboj implements zzbol {
    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcliVar = (zzcli) obj;
        if (map.keySet().contains(Chapter.KEY_START)) {
            zzcliVar.zzau(true);
        }
        if (map.keySet().contains("stop")) {
            zzcliVar.zzau(false);
        }
    }
}
