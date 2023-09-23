package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbhm extends zzbhq {
    public zzbhm(int i2, String str, Long l2) {
        super(1, str, l2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(zzn(), ((Long) zzm()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(zzn())));
        }
        return (Long) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(zzn(), ((Long) zzm()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(zzn(), ((Long) obj).longValue());
    }
}
