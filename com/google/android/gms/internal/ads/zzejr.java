package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzejr implements zzefa {
    private final zzekv zza;

    public zzejr(zzekv zzekvVar) {
        this.zza = zzekvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final zzefb zza(String str, JSONObject jSONObject) {
        zzbvs zza = this.zza.zza(str);
        if (zza == null) {
            return null;
        }
        return new zzefb(zza, new zzegu(), str);
    }
}
