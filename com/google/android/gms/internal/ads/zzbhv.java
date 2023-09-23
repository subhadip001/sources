package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbhv implements zzbkd {
    public final /* synthetic */ zzbhw zza;

    public zzbhv(zzbhw zzbhwVar) {
        this.zza = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final Boolean zza(String str, boolean z) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza.zze;
            return Boolean.valueOf(sharedPreferences2.getBoolean(str, z));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zza.zze;
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final Double zzb(String str, double d2) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza.zze;
            return Double.valueOf(sharedPreferences2.getFloat(str, (float) d2));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zza.zze;
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(d2)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final Long zzc(String str, long j2) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza.zze;
            return Long.valueOf(sharedPreferences2.getLong(str, j2));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zza.zze;
            return Long.valueOf(sharedPreferences.getInt(str, (int) j2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final String zzd(String str, String str2) {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zza.zze;
        return sharedPreferences.getString(str, str2);
    }
}
