package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes.dex */
public final class zzam {
    private final Application zza;
    private final SharedPreferences zzb;
    private final Set<String> zzc;

    public zzam(Application application) {
        this.zza = application;
        SharedPreferences sharedPreferences = application.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.zzb = sharedPreferences;
        this.zzc = new HashSet(sharedPreferences.getStringSet("written_values", Collections.emptySet()));
    }

    public final int zza() {
        return this.zzb.getInt("consent_status", 0);
    }

    public final Map<String, String> zzb() {
        String str;
        Application application = this.zza;
        Set<String> stringSet = this.zzb.getStringSet("stored_info", Collections.emptySet());
        HashMap hashMap = new HashMap();
        for (String str2 : stringSet) {
            zzby zza = zzca.zza(application, str2);
            if (zza == null) {
                String valueOf = String.valueOf(str2);
                Log.d("UserMessagingPlatform", valueOf.length() != 0 ? "Fetching request info: failed for key: ".concat(valueOf) : new String("Fetching request info: failed for key: "));
            } else {
                Object obj = application.getSharedPreferences(zza.zza, 0).getAll().get(zza.zzb);
                if (obj == null) {
                    String valueOf2 = String.valueOf(str2);
                    Log.d("UserMessagingPlatform", valueOf2.length() != 0 ? "Stored info not exists: ".concat(valueOf2) : new String("Stored info not exists: "));
                } else {
                    if (obj instanceof Boolean) {
                        str = true != ((Boolean) obj).booleanValue() ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1";
                    } else if (obj instanceof Number) {
                        str = obj.toString();
                    } else if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        String valueOf3 = String.valueOf(str2);
                        Log.d("UserMessagingPlatform", valueOf3.length() != 0 ? "Failed to fetch stored info: ".concat(valueOf3) : new String("Failed to fetch stored info: "));
                    }
                    hashMap.put(str2, str);
                }
            }
        }
        return hashMap;
    }

    public final Set<String> zzc() {
        return this.zzc;
    }

    public final void zzd() {
        zzca.zzb(this.zza, this.zzc);
        this.zzc.clear();
        this.zzb.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }

    public final void zze() {
        this.zzb.edit().putStringSet("written_values", this.zzc).apply();
    }

    public final void zzf(int i2) {
        this.zzb.edit().putInt("consent_status", i2).apply();
    }

    public final void zzg(Set<String> set) {
        this.zzb.edit().putStringSet("stored_info", set).apply();
    }
}
