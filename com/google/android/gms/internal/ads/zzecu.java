package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzecu implements zzffh {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfhg zzc;
    private final zzfhq zzd;

    public zzecu(String str, zzfhq zzfhqVar, zzfhg zzfhgVar) {
        this.zzb = str;
        this.zzd = zzfhqVar;
        this.zzc = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffh
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject;
        zzbzx zzbzxVar;
        zzbzx zzbzxVar2;
        zzbzx zzbzxVar3;
        zzbzx zzbzxVar4;
        zzbzx zzbzxVar5;
        zzbzx zzbzxVar6;
        zzbzx zzbzxVar7;
        JSONObject jSONObject2;
        String str;
        zzect zzectVar = (zzect) obj;
        jSONObject = zzectVar.zza;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbzxVar = zzectVar.zzb;
        if (zzbzxVar.zza() == -2) {
            HashMap hashMap = new HashMap();
            zzbzxVar2 = zzectVar.zzb;
            String str2 = "";
            if (zzbzxVar2.zzh() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaI)).booleanValue()) {
                    String str3 = this.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        str = "";
                    } else {
                        Matcher matcher = zza.matcher(str3);
                        str = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("; ");
                                    }
                                    str = str.concat(group);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("Cookie", str);
                    }
                } else {
                    hashMap.put("Cookie", this.zzb);
                }
            }
            zzbzxVar3 = zzectVar.zzb;
            if (zzbzxVar3.zzi()) {
                jSONObject2 = zzectVar.zza;
                JSONObject optJSONObject = jSONObject2.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                    }
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
                }
            }
            zzbzxVar4 = zzectVar.zzb;
            if (zzbzxVar4 != null) {
                zzbzxVar6 = zzectVar.zzb;
                if (!TextUtils.isEmpty(zzbzxVar6.zzd())) {
                    zzbzxVar7 = zzectVar.zzb;
                    str2 = zzbzxVar7.zzd();
                }
            }
            zzfhq zzfhqVar = this.zzd;
            zzfhg zzfhgVar = this.zzc;
            zzfhgVar.zze(true);
            zzfhqVar.zza(zzfhgVar);
            zzbzxVar5 = zzectVar.zzb;
            return new zzecp(zzbzxVar5.zze(), optInt, hashMap, str2.getBytes(zzfog.zzc), "");
        }
        zzfhq zzfhqVar2 = this.zzd;
        zzfhg zzfhgVar2 = this.zzc;
        zzfhgVar2.zze(false);
        zzfhqVar2.zza(zzfhgVar2);
        if (zzbzxVar.zza() == 1) {
            if (zzbzxVar.zzf() != null) {
                zzcfi.zzg(TextUtils.join(", ", zzbzxVar.zzf()));
            }
            throw new zzdzk(2, "Error building request URL.");
        }
        throw new zzdzk(1);
    }
}
