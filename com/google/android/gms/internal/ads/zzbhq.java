package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzbhq {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    public /* synthetic */ zzbhq(int i2, String str, Object obj, zzbhp zzbhpVar) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = obj;
        com.google.android.gms.ads.internal.client.zzay.zza().zzd(this);
    }

    public static zzbhq zzf(int i2, String str, float f2) {
        return new zzbhn(1, str, Float.valueOf(f2));
    }

    public static zzbhq zzg(int i2, String str, int i3) {
        return new zzbhl(1, str, Integer.valueOf(i3));
    }

    public static zzbhq zzh(int i2, String str, long j2) {
        return new zzbhm(1, str, Long.valueOf(j2));
    }

    public static zzbhq zzi(int i2, String str, Boolean bool) {
        return new zzbhk(i2, str, bool);
    }

    public static zzbhq zzj(int i2, String str, String str2) {
        return new zzbho(1, str, str2);
    }

    public static zzbhq zzk(int i2, String str) {
        zzbhq zzj = zzj(1, "gads:sdk_core_constants:experiment_id", null);
        com.google.android.gms.ads.internal.client.zzay.zza().zzc(zzj);
        return zzj;
    }

    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzl() {
        return com.google.android.gms.ads.internal.client.zzay.zzc().zzb(this);
    }

    public final Object zzm() {
        return this.zzc;
    }

    public final String zzn() {
        return this.zzb;
    }
}
