package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdqy {
    private final zzfby zza;
    private final Executor zzb;
    private final zzdto zzc;
    private final zzdsj zzd;
    private final Context zze;
    private final zzdwg zzf;
    private final zzfgo zzg;
    private final zzfig zzh;
    private final zzeen zzi;

    public zzdqy(zzfby zzfbyVar, Executor executor, zzdto zzdtoVar, Context context, zzdwg zzdwgVar, zzfgo zzfgoVar, zzfig zzfigVar, zzeen zzeenVar, zzdsj zzdsjVar) {
        this.zza = zzfbyVar;
        this.zzb = executor;
        this.zzc = zzdtoVar;
        this.zze = context;
        this.zzf = zzdwgVar;
        this.zzg = zzfgoVar;
        this.zzh = zzfigVar;
        this.zzi = zzeenVar;
        this.zzd = zzdsjVar;
    }

    private final void zzh(zzcli zzcliVar) {
        zzi(zzcliVar);
        zzcliVar.zzaf("/video", zzbok.zzl);
        zzcliVar.zzaf("/videoMeta", zzbok.zzm);
        zzcliVar.zzaf("/precache", new zzcjv());
        zzcliVar.zzaf("/delayPageLoaded", zzbok.zzp);
        zzcliVar.zzaf("/instrument", zzbok.zzn);
        zzcliVar.zzaf("/log", zzbok.zzg);
        zzcliVar.zzaf("/click", zzbok.zza(null));
        if (this.zza.zzb != null) {
            zzcliVar.zzP().zzC(true);
            zzcliVar.zzaf("/open", new zzbow(null, null, null, null, null));
        } else {
            zzcliVar.zzP().zzC(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(zzcliVar.getContext())) {
            zzcliVar.zzaf("/logScionEvent", new zzbor(zzcliVar.getContext()));
        }
    }

    private static final void zzi(zzcli zzcliVar) {
        zzcliVar.zzaf("/videoClicked", zzbok.zzh);
        zzcliVar.zzP().zzE(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcO)).booleanValue()) {
            zzcliVar.zzaf("/getNativeAdViewSignals", zzbok.zzs);
        }
        zzcliVar.zzaf("/getNativeClickMeta", zzbok.zzt);
    }

    public final zzfvj zza(final JSONObject jSONObject) {
        return zzfva.zzn(zzfva.zzn(zzfva.zzi(null), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzdqo
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzdqy.this.zze(obj);
            }
        }, this.zzb), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzdqp
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzdqy.this.zzc(jSONObject, (zzcli) obj);
            }
        }, this.zzb);
    }

    public final zzfvj zzb(final String str, final String str2, final zzfbg zzfbgVar, final zzfbj zzfbjVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzfva.zzn(zzfva.zzi(null), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzdqr
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzdqy.this.zzd(zzqVar, zzfbgVar, zzfbjVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzfvj zzc(JSONObject jSONObject, final zzcli zzcliVar) {
        final zzcfz zza = zzcfz.zza(zzcliVar);
        if (this.zza.zzb != null) {
            zzcliVar.zzai(zzcmx.zzd());
        } else {
            zzcliVar.zzai(zzcmx.zze());
        }
        zzcliVar.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzdqn
            @Override // com.google.android.gms.internal.ads.zzcmt
            public final void zza(boolean z) {
                zzdqy.this.zzf(zzcliVar, zza, z);
            }
        });
        zzcliVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    public final /* synthetic */ zzfvj zzd(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfbg zzfbgVar, zzfbj zzfbjVar, String str, String str2, Object obj) {
        final zzcli zza = this.zzc.zza(zzqVar, zzfbgVar, zzfbjVar);
        final zzcfz zza2 = zzcfz.zza(zza);
        if (this.zza.zzb != null) {
            zzh(zza);
            zza.zzai(zzcmx.zzd());
        } else {
            zzdsg zzb = this.zzd.zzb();
            zza.zzP().zzL(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzi, this.zzh, this.zzf, this.zzg, null, zzb);
            zzi(zza);
        }
        zza.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzdqs
            @Override // com.google.android.gms.internal.ads.zzcmt
            public final void zza(boolean z) {
                zzdqy.this.zzg(zza, zza2, z);
            }
        });
        zza.zzad(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ zzfvj zze(Object obj) {
        zzcli zza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        final zzcfz zza2 = zzcfz.zza(zza);
        zzh(zza);
        zza.zzP().zzF(new zzcmu() { // from class: com.google.android.gms.internal.ads.zzdqq
            @Override // com.google.android.gms.internal.ads.zzcmu
            public final void zza() {
                zzcfz.this.zzb();
            }
        });
        zza.loadUrl((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcN));
        return zza2;
    }

    public final /* synthetic */ void zzf(zzcli zzcliVar, zzcfz zzcfzVar, boolean z) {
        if (this.zza.zza != null && zzcliVar.zzs() != null) {
            zzcliVar.zzs().zzs(this.zza.zza);
        }
        zzcfzVar.zzb();
    }

    public final /* synthetic */ void zzg(zzcli zzcliVar, zzcfz zzcfzVar, boolean z) {
        if (z) {
            if (this.zza.zza != null && zzcliVar.zzs() != null) {
                zzcliVar.zzs().zzs(this.zza.zza);
            }
            zzcfzVar.zzb();
            return;
        }
        zzcfzVar.zze(new zzeio(1, "Html video Web View failed to load."));
    }
}
