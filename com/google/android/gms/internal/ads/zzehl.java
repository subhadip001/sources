package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzehl implements zzefa {
    private final zzdub zza;

    public zzehl(zzdub zzdubVar) {
        this.zza = zzdubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final zzefb zza(String str, JSONObject jSONObject) {
        return new zzefb(this.zza.zzc(str, jSONObject), new zzegu(), str);
    }
}
