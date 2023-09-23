package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbtk implements zzboy {
    public final /* synthetic */ zzbtl zza;
    private final zzcga zzb;

    public zzbtk(zzbtl zzbtlVar, zzcga zzcgaVar) {
        this.zza = zzbtlVar;
        this.zzb = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboy
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzb.zze(new zzbso());
            } else {
                this.zzb.zze(new zzbso(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboy
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e2) {
            this.zzb.zze(e2);
        }
    }
}
