package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbbl;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzfvj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzj implements zzg {
    private boolean zzb;
    private zzfvj zzd;
    private SharedPreferences zzf;
    private SharedPreferences.Editor zzg;
    private String zzi;
    private String zzj;
    private final Object zza = new Object();
    private final List zzc = new ArrayList();
    private zzbbl zze = null;
    private boolean zzh = true;
    private boolean zzk = true;
    private String zzl = "-1";
    private String zzm = "-1";
    private String zzn = "-1";
    private int zzo = -1;
    private zzcel zzp = new zzcel("", 0);
    private long zzq = 0;
    private long zzr = 0;
    private int zzs = -1;
    private int zzt = 0;
    private Set zzu = Collections.emptySet();
    private JSONObject zzv = new JSONObject();
    private boolean zzw = true;
    private boolean zzx = true;
    private String zzy = null;
    private String zzz = "";
    private boolean zzA = false;
    private String zzB = "";
    private int zzC = -1;
    private int zzD = -1;
    private long zzE = 0;

    private final void zzR() {
        zzfvj zzfvjVar = this.zzd;
        if (zzfvjVar == null || zzfvjVar.isDone()) {
            return;
        }
        try {
            this.zzd.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            zzcfi.zzk("Interrupted while waiting for preferences loaded.", e2);
        } catch (CancellationException e3) {
            e = e3;
            zzcfi.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e4) {
            e = e4;
            zzcfi.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e5) {
            e = e5;
            zzcfi.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void zzS() {
        zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzj.this.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhG)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzB.equals(str)) {
                    return;
                }
                this.zzB = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhG)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzA == z) {
                    return;
                }
                this.zzA = z;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("linked_device", z);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String str) {
        zzR();
        synchronized (this.zza) {
            if (TextUtils.equals(this.zzy, str)) {
                return;
            }
            this.zzy = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(long j2) {
        zzR();
        synchronized (this.zza) {
            if (this.zzr == j2) {
                return;
            }
            this.zzr = j2;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j2);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int i2) {
        zzR();
        synchronized (this.zza) {
            this.zzo = i2;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                if (i2 == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i2);
                }
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzF(String str, String str2) {
        char c;
        zzR();
        synchronized (this.zza) {
            int hashCode = str.hashCode();
            if (hashCode == -2004976699) {
                if (str.equals("IABTCF_PurposeConsents")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 83641339) {
                if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("IABTCF_gdprApplies")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                this.zzl = str2;
            } else if (c == 1) {
                this.zzm = str2;
            } else if (c != 2) {
                return;
            } else {
                this.zzn = str2;
            }
            if (this.zzg != null) {
                if (str2.equals("-1")) {
                    this.zzg.remove(str);
                } else {
                    this.zzg.putString(str, str2);
                }
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhr)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzz.equals(str)) {
                    return;
                }
                this.zzz = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("inspector_info", str);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(boolean z) {
        zzR();
        synchronized (this.zza) {
            if (z == this.zzk) {
                return;
            }
            this.zzk = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("gad_idless", z);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(String str, String str2, boolean z) {
        zzR();
        synchronized (this.zza) {
            JSONArray optJSONArray = this.zzv.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    length = i2;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzv.put(str, optJSONArray);
            } catch (JSONException e2) {
                zzcfi.zzk("Could not update native advanced settings", e2);
            }
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.zzv.toString());
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzJ(int i2) {
        zzR();
        synchronized (this.zza) {
            if (this.zzs == i2) {
                return;
            }
            this.zzs = i2;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("request_in_session_count", i2);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(int i2) {
        zzR();
        synchronized (this.zza) {
            if (this.zzD == i2) {
                return;
            }
            this.zzD = i2;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i2);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(long j2) {
        zzR();
        synchronized (this.zza) {
            if (this.zzE == j2) {
                return;
            }
            this.zzE = j2;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j2);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzM() {
        boolean z;
        zzR();
        synchronized (this.zza) {
            z = this.zzw;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        boolean z;
        zzR();
        synchronized (this.zza) {
            z = this.zzx;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        boolean z;
        zzR();
        synchronized (this.zza) {
            z = this.zzA;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzar)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                z = this.zzk;
            }
            return z;
        }
        return false;
    }

    public final /* synthetic */ void zzQ(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.zza) {
            this.zzf = sharedPreferences;
            this.zzg = edit;
            if (PlatformVersion.isAtLeastM()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.zzh = this.zzf.getBoolean("use_https", this.zzh);
            this.zzw = this.zzf.getBoolean("content_url_opted_out", this.zzw);
            this.zzi = this.zzf.getString("content_url_hashes", this.zzi);
            this.zzk = this.zzf.getBoolean("gad_idless", this.zzk);
            this.zzx = this.zzf.getBoolean("content_vertical_opted_out", this.zzx);
            this.zzj = this.zzf.getString("content_vertical_hashes", this.zzj);
            this.zzt = this.zzf.getInt("version_code", this.zzt);
            this.zzp = new zzcel(this.zzf.getString("app_settings_json", this.zzp.zzc()), this.zzf.getLong("app_settings_last_update_ms", this.zzp.zza()));
            this.zzq = this.zzf.getLong("app_last_background_time_ms", this.zzq);
            this.zzs = this.zzf.getInt("request_in_session_count", this.zzs);
            this.zzr = this.zzf.getLong("first_ad_req_time_ms", this.zzr);
            this.zzu = this.zzf.getStringSet("never_pool_slots", this.zzu);
            this.zzy = this.zzf.getString("display_cutout", this.zzy);
            this.zzC = this.zzf.getInt("app_measurement_npa", this.zzC);
            this.zzD = this.zzf.getInt("sd_app_measure_npa", this.zzD);
            this.zzE = this.zzf.getLong("sd_app_measure_npa_ts", this.zzE);
            this.zzz = this.zzf.getString("inspector_info", this.zzz);
            this.zzA = this.zzf.getBoolean("linked_device", this.zzA);
            this.zzB = this.zzf.getString("linked_ad_unit", this.zzB);
            this.zzl = this.zzf.getString("IABTCF_gdprApplies", this.zzl);
            this.zzn = this.zzf.getString("IABTCF_PurposeConsents", this.zzn);
            this.zzm = this.zzf.getString("IABTCF_TCString", this.zzm);
            this.zzo = this.zzf.getInt("gad_has_consent_for_cookies", this.zzo);
            try {
                this.zzv = new JSONObject(this.zzf.getString("native_advanced_settings", "{}"));
            } catch (JSONException e2) {
                zzcfi.zzk("Could not convert native advanced settings to json object", e2);
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i2;
        zzR();
        synchronized (this.zza) {
            i2 = this.zzt;
        }
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        int i2;
        zzR();
        synchronized (this.zza) {
            i2 = this.zzo;
        }
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i2;
        zzR();
        synchronized (this.zza) {
            i2 = this.zzs;
        }
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j2;
        zzR();
        synchronized (this.zza) {
            j2 = this.zzq;
        }
        return j2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j2;
        zzR();
        synchronized (this.zza) {
            j2 = this.zzr;
        }
        return j2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j2;
        zzR();
        synchronized (this.zza) {
            j2 = this.zzE;
        }
        return j2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzbbl zzg() {
        if (this.zzb) {
            if (!(zzM() && zzN()) && ((Boolean) zzbjg.zzb.zze()).booleanValue()) {
                synchronized (this.zza) {
                    if (Looper.getMainLooper() == null) {
                        return null;
                    }
                    if (this.zze == null) {
                        this.zze = new zzbbl();
                    }
                    this.zze.zze();
                    zzcfi.zzi("start fetching content...");
                    return this.zze;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcel zzh() {
        zzcel zzcelVar;
        zzR();
        synchronized (this.zza) {
            zzcelVar = this.zzp;
        }
        return zzcelVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final zzcel zzi() {
        zzcel zzcelVar;
        synchronized (this.zza) {
            zzcelVar = this.zzp;
        }
        return zzcelVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzi;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzj;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzB;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzy;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzn(String str) {
        char c;
        zzR();
        synchronized (this.zza) {
            int hashCode = str.hashCode();
            if (hashCode == -2004976699) {
                if (str.equals("IABTCF_PurposeConsents")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 83641339) {
                if (hashCode == 1218895378 && str.equals("IABTCF_TCString")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("IABTCF_gdprApplies")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                return this.zzl;
            } else if (c == 1) {
                return this.zzm;
            } else if (c != 2) {
                return null;
            } else {
                return this.zzn;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzp() {
        JSONObject jSONObject;
        zzR();
        synchronized (this.zza) {
            jSONObject = this.zzv;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq(Runnable runnable) {
        this.zzc.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(Context context) {
        synchronized (this.zza) {
            if (this.zzf != null) {
                return;
            }
            this.zzd = zzcfv.zza.zza(new Runnable(context, "admob") { // from class: com.google.android.gms.ads.internal.util.zzh
                public final /* synthetic */ Context zzb;
                public final /* synthetic */ String zzc = "admob";

                @Override // java.lang.Runnable
                public final void run() {
                    zzj.this.zzQ(this.zzb, this.zzc);
                }
            });
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs() {
        zzR();
        synchronized (this.zza) {
            this.zzv = new JSONObject();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(long j2) {
        zzR();
        synchronized (this.zza) {
            if (this.zzq == j2) {
                return;
            }
            this.zzq = j2;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j2);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(String str) {
        zzR();
        synchronized (this.zza) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            if (str != null && !str.equals(this.zzp.zzc())) {
                this.zzp = new zzcel(str, currentTimeMillis);
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("app_settings_json", str);
                    this.zzg.putLong("app_settings_last_update_ms", currentTimeMillis);
                    this.zzg.apply();
                }
                zzS();
                for (Runnable runnable : this.zzc) {
                    runnable.run();
                }
                return;
            }
            this.zzp.zzg(currentTimeMillis);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(int i2) {
        zzR();
        synchronized (this.zza) {
            if (this.zzt == i2) {
                return;
            }
            this.zzt = i2;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putInt("version_code", i2);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String str) {
        zzR();
        synchronized (this.zza) {
            if (str.equals(this.zzi)) {
                return;
            }
            this.zzi = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z) {
        zzR();
        synchronized (this.zza) {
            if (this.zzw == z) {
                return;
            }
            this.zzw = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String str) {
        zzR();
        synchronized (this.zza) {
            if (str.equals(this.zzj)) {
                return;
            }
            this.zzj = str;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.zzg.apply();
            }
            zzS();
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(boolean z) {
        zzR();
        synchronized (this.zza) {
            if (this.zzx == z) {
                return;
            }
            this.zzx = z;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.zzg.apply();
            }
            zzS();
        }
    }
}
