package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcum implements zzbam {
    private zzcli zza;
    private final Executor zzb;
    private final zzcty zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcub zzg = new zzcub();

    public zzcum(Executor executor, zzcty zzctyVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzctyVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcul
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcum.this.zzd(zzb);
                    }
                });
            }
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e2);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final void zzc(zzbal zzbalVar) {
        zzcub zzcubVar = this.zzg;
        zzcubVar.zza = this.zzf ? false : zzbalVar.zzj;
        zzcubVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzbalVar;
        if (this.zze) {
            zzg();
        }
    }

    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcli zzcliVar) {
        this.zza = zzcliVar;
    }
}
