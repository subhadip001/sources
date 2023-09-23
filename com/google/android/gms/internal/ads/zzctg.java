package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzctg implements zzcso {
    private final zzdza zza;

    public zzctg(zzdza zzdzaVar) {
        this.zza = zzdzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcso
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzl(str.equals("true"));
    }
}
