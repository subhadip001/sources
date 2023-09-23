package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdvp implements zzdgj, com.google.android.gms.ads.internal.client.zza, zzdcm, zzdbw {
    private final Context zza;
    private final zzfcn zzb;
    private final zzdwg zzc;
    private final zzfbs zzd;
    private final zzfbg zze;
    private final zzeen zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfN)).booleanValue();

    public zzdvp(Context context, zzfcn zzfcnVar, zzdwg zzdwgVar, zzfbs zzfbsVar, zzfbg zzfbgVar, zzeen zzeenVar) {
        this.zza = context;
        this.zzb = zzfcnVar;
        this.zzc = zzdwgVar;
        this.zzd = zzfbsVar;
        this.zze = zzfbgVar;
        this.zzf = zzeenVar;
    }

    private final zzdwf zzf(String str) {
        zzdwf zza = this.zzc.zza();
        zza.zze(this.zzd.zzb.zzb);
        zza.zzd(this.zze);
        zza.zzb("action", str);
        if (!this.zze.zzu.isEmpty()) {
            zza.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzak) {
            zza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza) ? "offline" : "online");
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
            zza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfW)).booleanValue()) {
            boolean z = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzd(this.zzd.zza.zza) != 1;
            zza.zzb("scar", String.valueOf(z));
            if (z) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzd.zza.zza.zzd;
                zza.zzc("ragent", zzlVar.zzp);
                zza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzlVar)));
            }
        }
        return zza;
    }

    private final void zzg(zzdwf zzdwfVar) {
        if (this.zze.zzak) {
            this.zzf.zzd(new zzeep(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdwfVar.zzf(), 2));
            return;
        }
        zzdwfVar.zzg();
    }

    private final boolean zzh() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbm);
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String zzo = com.google.android.gms.ads.internal.util.zzs.zzo(this.zza);
                    boolean z = false;
                    if (str != null && zzo != null) {
                        try {
                            z = Pattern.matches(str, zzo);
                        } catch (RuntimeException e2) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzt(e2, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzg = Boolean.valueOf(z);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzak) {
            zzg(zzf("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzh) {
            zzdwf zzf = zzf("ifts");
            zzf.zzb("reason", "adapter");
            int i2 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i2 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i2 >= 0) {
                zzf.zzb("arec", String.valueOf(i2));
            }
            String zza = this.zzb.zza(str);
            if (zza != null) {
                zzf.zzb("areec", zza);
            }
            zzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzb() {
        if (this.zzh) {
            zzdwf zzf = zzf("ifts");
            zzf.zzb("reason", "blocked");
            zzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzc() {
        if (zzh()) {
            zzf("adapter_shown").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzd() {
        if (zzh()) {
            zzf("adapter_impression").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zze(zzdle zzdleVar) {
        if (this.zzh) {
            zzdwf zzf = zzf("ifts");
            zzf.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdleVar.getMessage())) {
                zzf.zzb(NotificationCompat.CATEGORY_MESSAGE, zzdleVar.getMessage());
            }
            zzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final void zzl() {
        if (zzh() || this.zze.zzak) {
            zzg(zzf("impression"));
        }
    }
}
