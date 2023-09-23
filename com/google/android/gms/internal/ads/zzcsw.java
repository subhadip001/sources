package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcsw implements zzcso {
    private final zzdza zza;

    public zzcsw(zzdza zzdzaVar) {
        this.zza = zzdzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcso
    public final void zza(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhH)).booleanValue()) {
            String str = (String) map.get("policy_violations");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.zzk(str);
        }
    }
}
