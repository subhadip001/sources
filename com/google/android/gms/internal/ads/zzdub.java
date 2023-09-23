package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdub {
    private final zzfcr zza;
    private final zzdty zzb;

    public zzdub(zzfcr zzfcrVar, zzdty zzdtyVar) {
        this.zza = zzfcrVar;
        this.zzb = zzdtyVar;
    }

    public final zzbtz zza() {
        zzbtz zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        zzcfi.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbvs zzb(String str) {
        zzbvs zzc = zza().zzc(str);
        this.zzb.zze(str, zzc);
        return zzc;
    }

    public final zzfct zzc(String str, JSONObject jSONObject) {
        zzbuc zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbuy(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbuy(new zzbwj());
            } else {
                zzbtz zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zza.zze(string)) {
                            zzb = zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (zza.zzd(string)) {
                            zzb = zza.zzb(string);
                        } else {
                            zzb = zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e2) {
                        zzcfi.zzh("Invalid custom event.", e2);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfct zzfctVar = new zzfct(zzb);
            this.zzb.zzd(str, zzfctVar);
            return zzfctVar;
        } catch (Throwable th) {
            throw new zzfcd(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
