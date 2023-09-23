package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfim {
    private final zzfit zza;
    private final zzfit zzb;
    private final zzfiq zzc;
    private final zzfis zzd;

    private zzfim(zzfiq zzfiqVar, zzfis zzfisVar, zzfit zzfitVar, zzfit zzfitVar2, boolean z) {
        this.zzc = zzfiqVar;
        this.zzd = zzfisVar;
        this.zza = zzfitVar;
        if (zzfitVar2 == null) {
            this.zzb = zzfit.NONE;
        } else {
            this.zzb = zzfitVar2;
        }
    }

    public static zzfim zza(zzfiq zzfiqVar, zzfis zzfisVar, zzfit zzfitVar, zzfit zzfitVar2, boolean z) {
        zzfjt.zzb(zzfisVar, "ImpressionType is null");
        zzfjt.zzb(zzfitVar, "Impression owner is null");
        if (zzfitVar != zzfit.NONE) {
            if (zzfiqVar == zzfiq.DEFINED_BY_JAVASCRIPT && zzfitVar == zzfit.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (zzfisVar == zzfis.DEFINED_BY_JAVASCRIPT && zzfitVar == zzfit.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new zzfim(zzfiqVar, zzfisVar, zzfitVar, zzfitVar2, true);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfjr.zzg(jSONObject, "impressionOwner", this.zza);
        if (this.zzd != null) {
            zzfjr.zzg(jSONObject, "mediaEventsOwner", this.zzb);
            zzfjr.zzg(jSONObject, "creativeType", this.zzc);
            zzfjr.zzg(jSONObject, "impressionType", this.zzd);
        } else {
            zzfjr.zzg(jSONObject, "videoEventsOwner", this.zzb);
        }
        zzfjr.zzg(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
