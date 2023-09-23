package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfjx {
    private JSONObject zza;
    private final zzfkg zzb;

    public zzfjx(zzfkg zzfkgVar) {
        this.zzb = zzfkgVar;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfkh(this, null));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j2) {
        this.zzb.zzb(new zzfki(this, hashSet, jSONObject, j2, null));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j2) {
        this.zzb.zzb(new zzfkj(this, hashSet, jSONObject, j2, null));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
