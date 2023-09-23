package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbtc implements zzboy {
    public final /* synthetic */ zzbtd zza;
    private final zzbsf zzb;
    private final zzcga zzc;

    public zzbtc(zzbtd zzbtdVar, zzbsf zzbsfVar, zzcga zzcgaVar) {
        this.zza = zzbtdVar;
        this.zzb = zzbsfVar;
        this.zzc = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboy
    public final void zza(String str) {
        zzbsf zzbsfVar;
        try {
            if (str == null) {
                this.zzc.zze(new zzbso());
            } else {
                this.zzc.zze(new zzbso(str));
            }
            zzbsfVar = this.zzb;
        } catch (IllegalStateException unused) {
            zzbsfVar = this.zzb;
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        zzbsfVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzboy
    public final void zzb(JSONObject jSONObject) {
        zzbsf zzbsfVar;
        zzbsr zzbsrVar;
        try {
            try {
                zzcga zzcgaVar = this.zzc;
                zzbsrVar = this.zza.zza;
                zzcgaVar.zzd(zzbsrVar.zza(jSONObject));
                zzbsfVar = this.zzb;
            } catch (IllegalStateException unused) {
                zzbsfVar = this.zzb;
            } catch (JSONException e2) {
                this.zzc.zze(e2);
                zzbsfVar = this.zzb;
            }
            zzbsfVar.zzb();
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
    }
}
