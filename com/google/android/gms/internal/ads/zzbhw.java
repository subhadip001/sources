package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbhw implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    @VisibleForTesting
    public volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();

    private final void zzf() {
        if (this.zze == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbia.zza(new zzfph() { // from class: com.google.android.gms.internal.ads.zzbhu
                @Override // com.google.android.gms.internal.ads.zzfph
                public final Object zza() {
                    return zzbhw.this.zzd();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final Object zzb(final zzbhq zzbhqVar) {
        if (!this.zzc.block(FirebaseInAppMessagingDisplay.IMPRESSION_THRESHOLD_MILLIS)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zzbhqVar.zzm();
            }
        }
        if (zzbhqVar.zze() == 2) {
            Bundle bundle = this.zzf;
            return bundle == null ? zzbhqVar.zzm() : zzbhqVar.zzb(bundle);
        } else if (zzbhqVar.zze() == 1 && this.zzh.has(zzbhqVar.zzn())) {
            return zzbhqVar.zza(this.zzh);
        } else {
            return zzbia.zza(new zzfph() { // from class: com.google.android.gms.internal.ads.zzbht
                @Override // com.google.android.gms.internal.ads.zzfph
                public final Object zza() {
                    return zzbhw.this.zzc(zzbhqVar);
                }
            });
        }
    }

    public final /* synthetic */ Object zzc(zzbhq zzbhqVar) {
        return zzbhqVar.zzc(this.zze);
    }

    public final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", "{}");
    }

    public final void zze(Context context) {
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.zzg = applicationContext;
            try {
                this.zzf = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null || (remoteContext = context.getApplicationContext()) != null) {
                context = remoteContext;
            }
            if (context == null) {
                this.zza = false;
                this.zzc.open();
                return;
            }
            com.google.android.gms.ads.internal.client.zzay.zzb();
            SharedPreferences zza = zzbhs.zza(context);
            this.zze = zza;
            if (zza != null) {
                zza.registerOnSharedPreferenceChangeListener(this);
            }
            zzbkf.zzc(new zzbhv(this));
            zzf();
            this.zzd = true;
            this.zza = false;
            this.zzc.open();
        }
    }
}
