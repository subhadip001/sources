package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbho extends zzbhq {
    public zzbho(int i2, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return jSONObject.optString(zzn(), (String) zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn()))) {
            return bundle.getString("com.google.android.gms.ads.flag.".concat(zzn()));
        }
        return (String) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zzn(), (String) zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putString(zzn(), (String) obj);
    }
}
