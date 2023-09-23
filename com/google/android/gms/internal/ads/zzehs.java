package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzehs implements zzehm {
    private final zzdlt zza;
    private final zzfvk zzb;
    private final zzdpt zzc;
    private final zzfcu zzd;
    private final zzdsj zze;

    public zzehs(zzdlt zzdltVar, zzfvk zzfvkVar, zzdpt zzdptVar, zzfcu zzfcuVar, zzdsj zzdsjVar) {
        this.zza = zzdltVar;
        this.zzb = zzfvkVar;
        this.zzc = zzdptVar;
        this.zzd = zzfcuVar;
        this.zze = zzdsjVar;
    }

    private final zzfvj zzg(final zzfbs zzfbsVar, final zzfbg zzfbgVar, final JSONObject jSONObject) {
        final zzfvj zza = this.zzd.zza();
        final zzfvj zza2 = this.zzc.zza(zzfbsVar, zzfbgVar, jSONObject);
        return zzfva.zzd(zza, zza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzehn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzehs.this.zzc(zza2, zza, zzfbsVar, zzfbgVar, jSONObject);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final zzfvj zza(final zzfbs zzfbsVar, final zzfbg zzfbgVar) {
        return zzfva.zzn(zzfva.zzn(this.zzd.zza(), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzehp
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzehs.this.zze(zzfbgVar, (zzdsd) obj);
            }
        }, this.zzb), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzehq
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzehs.this.zzf(zzfbsVar, zzfbgVar, (JSONArray) obj);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeey
    public final boolean zzb(zzfbs zzfbsVar, zzfbg zzfbgVar) {
        zzfbl zzfblVar = zzfbgVar.zzt;
        return (zzfblVar == null || zzfblVar.zzc == null) ? false : true;
    }

    public final /* synthetic */ zzdnb zzc(zzfvj zzfvjVar, zzfvj zzfvjVar2, zzfbs zzfbsVar, zzfbg zzfbgVar, JSONObject jSONObject) {
        zzdng zzdngVar = (zzdng) zzfvjVar.get();
        zzdsd zzdsdVar = (zzdsd) zzfvjVar2.get();
        zzdnh zzd = this.zza.zzd(new zzcyl(zzfbsVar, zzfbgVar, null), new zzdns(zzdngVar), new zzdmi(jSONObject, zzdsdVar));
        zzd.zzj().zzb();
        zzd.zzk().zza(zzdsdVar);
        zzd.zzg().zza(zzdngVar.zzr());
        zzd.zzl().zza(this.zze);
        return zzd.zza();
    }

    public final /* synthetic */ zzfvj zzd(zzdsd zzdsdVar, JSONObject jSONObject) {
        this.zzd.zzb(zzfva.zzi(zzdsdVar));
        if (jSONObject.optBoolean(FirebaseAnalytics.Param.SUCCESS)) {
            return zzfva.zzi(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbso("process json failed");
    }

    public final /* synthetic */ zzfvj zze(zzfbg zzfbgVar, final zzdsd zzdsdVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhc)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfbgVar.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfva.zzn(zzdsdVar.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzeho
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzehs.this.zzd(zzdsdVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzfvj zzf(zzfbs zzfbsVar, zzfbg zzfbgVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzfva.zzh(new zzdzk(3));
        }
        if (zzfbsVar.zza.zza.zzk > 1) {
            int length = jSONArray.length();
            this.zzd.zzc(Math.min(length, zzfbsVar.zza.zza.zzk));
            ArrayList arrayList = new ArrayList(zzfbsVar.zza.zza.zzk);
            for (int i2 = 0; i2 < zzfbsVar.zza.zza.zzk; i2++) {
                if (i2 < length) {
                    arrayList.add(zzg(zzfbsVar, zzfbgVar, jSONArray.getJSONObject(i2)));
                } else {
                    arrayList.add(zzfva.zzh(new zzdzk(3)));
                }
            }
            return zzfva.zzi(arrayList);
        }
        return zzfva.zzm(zzg(zzfbsVar, zzfbgVar, jSONArray.getJSONObject(0)), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzehr
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                return Collections.singletonList(zzfva.zzi((zzdnb) obj));
            }
        }, this.zzb);
    }
}
