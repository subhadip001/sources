package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdbl extends com.google.android.gms.ads.internal.client.zzdg {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final List zzd;
    private final long zze;
    private final String zzf;
    private final zzefd zzg;
    private final Bundle zzh;

    public zzdbl(zzfbg zzfbgVar, String str, zzefd zzefdVar, zzfbj zzfbjVar) {
        String str2 = null;
        this.zzb = zzfbgVar == null ? null : zzfbgVar.zzac;
        this.zzc = zzfbjVar == null ? null : zzfbjVar.zzb;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str2 = zzfbgVar.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str2 != null ? str2 : str;
        this.zzd = zzefdVar.zzc();
        this.zzg = zzefdVar;
        this.zze = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() / 1000;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfM)).booleanValue() || zzfbjVar == null) {
            this.zzh = new Bundle();
        } else {
            this.zzh = zzfbjVar.zzj;
        }
        this.zzf = (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhI)).booleanValue() || zzfbjVar == null || TextUtils.isEmpty(zzfbjVar.zzh)) ? "" : zzfbjVar.zzh;
    }

    public final long zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final Bundle zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final com.google.android.gms.ads.internal.client.zzu zzf() {
        zzefd zzefdVar = this.zzg;
        if (zzefdVar != null) {
            return zzefdVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final String zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdh
    public final List zzi() {
        return this.zzd;
    }

    public final String zzj() {
        return this.zzc;
    }
}
