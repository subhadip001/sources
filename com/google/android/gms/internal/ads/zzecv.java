package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzecv implements zzdgj, com.google.android.gms.ads.internal.client.zza, zzdcm, zzdbw {
    private final Context zza;
    private final zzfcn zzb;
    private final zzfbs zzc;
    private final zzfbg zzd;
    private final zzeen zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfN)).booleanValue();
    private final zzfgo zzh;
    private final String zzi;

    public zzecv(Context context, zzfcn zzfcnVar, zzfbs zzfbsVar, zzfbg zzfbgVar, zzeen zzeenVar, zzfgo zzfgoVar, String str) {
        this.zza = context;
        this.zzb = zzfcnVar;
        this.zzc = zzfbsVar;
        this.zzd = zzfbgVar;
        this.zze = zzeenVar;
        this.zzh = zzfgoVar;
        this.zzi = str;
    }

    private final zzfgn zzf(String str) {
        zzfgn zzb = zzfgn.zzb(str);
        zzb.zzh(this.zzc, null);
        zzb.zzf(this.zzd);
        zzb.zza("request_id", this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzb.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzak) {
            zzb.zza("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza) ? "offline" : "online");
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
            zzb.zza("offline_ad", "1");
        }
        return zzb;
    }

    private final void zzg(zzfgn zzfgnVar) {
        if (this.zzd.zzak) {
            this.zze.zzd(new zzeep(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfgnVar), 2));
            return;
        }
        this.zzh.zzb(zzfgnVar);
    }

    private final boolean zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
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
                    this.zzf = Boolean.valueOf(z);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzd.zzak) {
            zzg(zzf("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzg) {
            int i2 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i2 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String zza = this.zzb.zza(str);
            zzfgn zzf = zzf("ifts");
            zzf.zza("reason", "adapter");
            if (i2 >= 0) {
                zzf.zza("arec", String.valueOf(i2));
            }
            if (zza != null) {
                zzf.zza("areec", zza);
            }
            this.zzh.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzb() {
        if (this.zzg) {
            zzfgo zzfgoVar = this.zzh;
            zzfgn zzf = zzf("ifts");
            zzf.zza("reason", "blocked");
            zzfgoVar.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzc() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzd() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zze(zzdle zzdleVar) {
        if (this.zzg) {
            zzfgn zzf = zzf("ifts");
            zzf.zza("reason", "exception");
            if (!TextUtils.isEmpty(zzdleVar.getMessage())) {
                zzf.zza(NotificationCompat.CATEGORY_MESSAGE, zzdleVar.getMessage());
            }
            this.zzh.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcm
    public final void zzl() {
        if (zzh() || this.zzd.zzak) {
            zzg(zzf("impression"));
        }
    }
}
