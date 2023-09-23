package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcta implements zzcso {
    private final zzfbf zza;

    public zzcta(zzfbf zzfbfVar) {
        this.zza = zzfbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcso
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zzb(Boolean.parseBoolean(str));
        } catch (Exception unused) {
            throw new IllegalStateException("Invalid render_in_browser state");
        }
    }
}
