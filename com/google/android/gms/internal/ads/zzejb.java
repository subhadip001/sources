package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzejb implements zzefa {
    private final Map zza = new HashMap();
    private final zzdub zzb;

    public zzejb(zzdub zzdubVar) {
        this.zzb = zzdubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final zzefb zza(String str, JSONObject jSONObject) {
        zzefb zzefbVar;
        synchronized (this) {
            zzefbVar = (zzefb) this.zza.get(str);
            if (zzefbVar == null) {
                zzefbVar = new zzefb(this.zzb.zzc(str, jSONObject), new zzegv(), str);
                this.zza.put(str, zzefbVar);
            }
        }
        return zzefbVar;
    }
}
