package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcro extends com.google.android.gms.ads.internal.client.zzcl {
    private final Context zza;
    private final zzcfo zzb;
    private final zzdub zzc;
    private final zzefa zzd;
    private final zzekz zze;
    private final zzdyi zzf;
    private final zzcdn zzg;
    private final zzdug zzh;
    private final zzdza zzi;
    private final zzbkh zzj;
    private final zzfhs zzk;
    private final zzfcr zzl;
    private boolean zzm = false;

    public zzcro(Context context, zzcfo zzcfoVar, zzdub zzdubVar, zzefa zzefaVar, zzekz zzekzVar, zzdyi zzdyiVar, zzcdn zzcdnVar, zzdug zzdugVar, zzdza zzdzaVar, zzbkh zzbkhVar, zzfhs zzfhsVar, zzfcr zzfcrVar) {
        this.zza = context;
        this.zzb = zzcfoVar;
        this.zzc = zzdubVar;
        this.zzd = zzefaVar;
        this.zze = zzekzVar;
        this.zzf = zzdyiVar;
        this.zzg = zzcdnVar;
        this.zzh = zzdugVar;
        this.zzi = zzdzaVar;
        this.zzj = zzbkhVar;
        this.zzk = zzfhsVar;
        this.zzl = zzfcrVar;
    }

    @VisibleForTesting
    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO()) {
            if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.zza, com.google.android.gms.ads.internal.zzt.zzo().zzh().zzl(), this.zzb.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzB(false);
            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzA("");
        }
    }

    @VisibleForTesting
    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zze();
        if (zze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzcfi.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap hashMap = new HashMap();
            for (zzbtu zzbtuVar : zze.values()) {
                for (zzbtt zzbttVar : zzbtuVar.zza) {
                    String str = zzbttVar.zzk;
                    for (String str2 : zzbttVar.zzc) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzefb zza = this.zzd.zza(str3, jSONObject);
                    if (zza != null) {
                        zzfct zzfctVar = (zzfct) zza.zzb;
                        if (!zzfctVar.zzA() && zzfctVar.zzz()) {
                            zzfctVar.zzj(this.zza, (zzegv) zza.zzc, (List) entry.getValue());
                            zzcfi.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfcd e2) {
                    zzcfi.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e2);
                }
            }
        }
    }

    public final /* synthetic */ void zzd() {
        zzfda.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzt.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() {
        return this.zzb.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String str) {
        this.zze.zzf(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzj() {
        if (this.zzm) {
            zzcfi.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbhy.zzc(this.zza);
        com.google.android.gms.ads.internal.zzt.zzo().zzr(this.zza, this.zzb);
        com.google.android.gms.ads.internal.zzt.zzc().zzi(this.zza);
        this.zzm = true;
        this.zzf.zzr();
        this.zze.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzda)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzf();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhG)).booleanValue()) {
            zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrk
                @Override // java.lang.Runnable
                public final void run() {
                    zzcro.this.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzik)).booleanValue()) {
            zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrj
                @Override // java.lang.Runnable
                public final void run() {
                    zzcro.this.zzu();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcn)).booleanValue()) {
            zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrl
                @Override // java.lang.Runnable
                public final void run() {
                    zzcro.this.zzd();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String str, IObjectWrapper iObjectWrapper) {
        String str2;
        Runnable runnable;
        zzbhy.zzc(this.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdc)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            str2 = com.google.android.gms.ads.internal.util.zzs.zzo(this.zza);
        } else {
            str2 = "";
        }
        boolean z = true;
        String str3 = true != TextUtils.isEmpty(str2) ? str2 : str;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcZ)).booleanValue();
        zzbhq zzbhqVar = zzbhy.zzaK;
        boolean booleanValue2 = booleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrm
                @Override // java.lang.Runnable
                public final void run() {
                    final zzcro zzcroVar = zzcro.this;
                    final Runnable runnable3 = runnable2;
                    zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrn
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcro.this.zzc(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = booleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z) {
            com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str3, runnable3, this.zzk);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(com.google.android.gms.ads.internal.client.zzcy zzcyVar) {
        this.zzi.zzg(zzcyVar, zzdyz.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzcfi.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzcfi.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context);
        zzasVar.zzn(str);
        zzasVar.zzo(this.zzb.zza);
        zzasVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(zzbtz zzbtzVar) {
        this.zzl.zze(zzbtzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzo(boolean z) {
        com.google.android.gms.ads.internal.zzt.zzr().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzp(float f2) {
        com.google.android.gms.ads.internal.zzt.zzr().zzd(f2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzq(String str) {
        zzbhy.zzc(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcZ)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str, null, this.zzk);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(zzbqm zzbqmVar) {
        this.zzf.zzs(zzbqmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(com.google.android.gms.ads.internal.client.zzfa zzfaVar) {
        this.zzg.zzq(this.zza, zzfaVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized boolean zzt() {
        return com.google.android.gms.ads.internal.zzt.zzr().zze();
    }

    public final /* synthetic */ void zzu() {
        this.zzj.zza(new zzbzc());
    }
}
