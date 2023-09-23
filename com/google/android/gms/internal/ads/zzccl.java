package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzccl implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzcdn zzd;
    private String zze = "-1";
    private int zzf = -1;

    public zzccl(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcdn zzcdnVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
        this.zzd = zzcdnVar;
    }

    private final void zzb(String str, int i2) {
        Context context;
        boolean z = false;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzat)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i2 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzar)).booleanValue()) {
            this.zzc.zzH(z);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzff)).booleanValue() && z && (context = this.zza) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzam)).booleanValue()) {
            this.zzd.zzt();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzav)).booleanValue()) {
            if (zzcck.zza(str, "gad_has_consent_for_cookies")) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzat)).booleanValue()) {
                    int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i2 != this.zzc.zzb()) {
                        this.zzc.zzH(true);
                    }
                    this.zzc.zzE(i2);
                    return;
                }
                return;
            } else if (zzcck.zza(str, "IABTCF_gdprApplies") || zzcck.zza(str, "IABTCF_TCString") || zzcck.zza(str, "IABTCF_PurposeConsents")) {
                String string = sharedPreferences.getString(str, "-1");
                if (string != null && !string.equals(this.zzc.zzn(str))) {
                    this.zzc.zzH(true);
                }
                this.zzc.zzF(str, string);
                return;
            } else {
                return;
            }
        }
        String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
        int i3 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String valueOf = String.valueOf(str);
        int hashCode = valueOf.hashCode();
        if (hashCode != -2004976699) {
            if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (valueOf.equals("IABTCF_PurposeConsents")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            if (string2.equals("-1") || this.zze.equals(string2)) {
                return;
            }
            this.zze = string2;
            zzb(string2, i3);
        } else if (c != 1) {
        } else {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzat)).booleanValue() || i3 == -1 || this.zzf == i3) {
                return;
            }
            this.zzf = i3;
            zzb(string2, i3);
        }
    }

    public final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzav)).booleanValue()) {
            onSharedPreferenceChanged(this.zzb, "IABTCF_gdprApplies");
            onSharedPreferenceChanged(this.zzb, "IABTCF_TCString");
            return;
        }
        onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
    }
}
