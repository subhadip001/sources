package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdsd {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzclu zzc;
    private final Context zzd;
    private final zzdwg zze;
    private final zzfgo zzf;
    private final Executor zzg;
    private final zzaoc zzh;
    private final zzcfo zzi;
    private final zzeen zzk;
    private final zzfig zzl;
    private zzfvj zzm;
    private final zzdrx zza = new zzdrx(null);
    private final zzboz zzj = new zzboz();

    public zzdsd(zzdsa zzdsaVar) {
        this.zzd = zzdsa.zza(zzdsaVar);
        this.zzg = zzdsa.zzj(zzdsaVar);
        this.zzh = zzdsa.zzb(zzdsaVar);
        this.zzi = zzdsa.zzd(zzdsaVar);
        this.zzb = zzdsa.zzc(zzdsaVar);
        this.zzc = zzdsa.zze(zzdsaVar);
        this.zzk = zzdsa.zzg(zzdsaVar);
        this.zzl = zzdsa.zzi(zzdsaVar);
        this.zze = zzdsa.zzf(zzdsaVar);
        this.zzf = zzdsa.zzh(zzdsaVar);
    }

    public final /* synthetic */ zzcli zza(zzcli zzcliVar) {
        zzcliVar.zzaf("/result", this.zzj);
        zzcmv zzP = zzcliVar.zzP();
        zzdrx zzdrxVar = this.zza;
        zzP.zzL(null, zzdrxVar, zzdrxVar, zzdrxVar, zzdrxVar, false, null, new com.google.android.gms.ads.internal.zzb(this.zzd, null, null), null, null, this.zzk, this.zzl, this.zze, this.zzf, null, null);
        return zzcliVar;
    }

    public final /* synthetic */ zzfvj zzc(String str, JSONObject jSONObject, zzcli zzcliVar) {
        return this.zzj.zzb(zzcliVar, str, jSONObject);
    }

    public final synchronized zzfvj zzd(final String str, final JSONObject jSONObject) {
        zzfvj zzfvjVar = this.zzm;
        if (zzfvjVar == null) {
            return zzfva.zzi(null);
        }
        return zzfva.zzn(zzfvjVar, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzdrp
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzdsd.this.zzc(str, jSONObject, (zzcli) obj);
            }
        }, this.zzg);
    }

    public final synchronized void zze(zzfbg zzfbgVar, zzfbj zzfbjVar) {
        zzfvj zzfvjVar = this.zzm;
        if (zzfvjVar == null) {
            return;
        }
        zzfva.zzr(zzfvjVar, new zzdrv(this, zzfbgVar, zzfbjVar), this.zzg);
    }

    public final synchronized void zzf() {
        zzfvj zzfvjVar = this.zzm;
        if (zzfvjVar == null) {
            return;
        }
        zzfva.zzr(zzfvjVar, new zzdrr(this), this.zzg);
        this.zzm = null;
    }

    public final synchronized void zzg(String str, Map map) {
        zzfvj zzfvjVar = this.zzm;
        if (zzfvjVar == null) {
            return;
        }
        zzfva.zzr(zzfvjVar, new zzdru(this, "sendMessageToNativeJs", map), this.zzg);
    }

    public final synchronized void zzh() {
        final Context context = this.zzd;
        final zzcfo zzcfoVar = this.zzi;
        final String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcM);
        final zzaoc zzaocVar = this.zzh;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        zzfvj zzm = zzfva.zzm(zzfva.zzl(new zzfug() { // from class: com.google.android.gms.internal.ads.zzclr
            @Override // com.google.android.gms.internal.ads.zzfug
            public final zzfvj zza() {
                Context context2 = context;
                zzaoc zzaocVar2 = zzaocVar;
                zzcfo zzcfoVar2 = zzcfoVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                String str2 = str;
                com.google.android.gms.ads.internal.zzt.zzz();
                zzcli zza = zzclu.zza(context2, zzcmx.zza(), "", false, false, zzaocVar2, null, zzcfoVar2, null, null, zzaVar2, zzbdl.zza(), null, null);
                final zzcfz zza2 = zzcfz.zza(zza);
                zza.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzcls
                    @Override // com.google.android.gms.internal.ads.zzcmt
                    public final void zza(boolean z) {
                        zzcfz.this.zzb();
                    }
                });
                zza.loadUrl(str2);
                return zza2;
            }
        }, zzcfv.zze), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzdrq
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                zzcli zzcliVar = (zzcli) obj;
                zzdsd.this.zza(zzcliVar);
                return zzcliVar;
            }
        }, this.zzg);
        this.zzm = zzm;
        zzcfy.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbol zzbolVar) {
        zzfvj zzfvjVar = this.zzm;
        if (zzfvjVar == null) {
            return;
        }
        zzfva.zzr(zzfvjVar, new zzdrs(this, str, zzbolVar), this.zzg);
    }

    public final void zzj(WeakReference weakReference, String str, zzbol zzbolVar) {
        zzi(str, new zzdsc(this, weakReference, str, zzbolVar, null));
    }

    public final synchronized void zzk(String str, zzbol zzbolVar) {
        zzfvj zzfvjVar = this.zzm;
        if (zzfvjVar == null) {
            return;
        }
        zzfva.zzr(zzfvjVar, new zzdrt(this, str, zzbolVar), this.zzg);
    }
}
