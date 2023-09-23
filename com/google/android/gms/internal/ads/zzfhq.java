package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfhq implements Runnable {
    private final zzfhs zzb;
    private String zzc;
    private String zzd;
    private zzfbr zze;
    private com.google.android.gms.ads.internal.client.zze zzf;
    private Future zzg;
    private final List zza = new ArrayList();
    private int zzh = 2;

    public zzfhq(zzfhs zzfhsVar) {
        this.zzb = zzfhsVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfhq zza(zzfhg zzfhgVar) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfhgVar.zzg();
            list.add(zzfhgVar);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzcfv.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhm)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfhq zzb(String str) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue() && zzfhp.zzd(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfhq zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            this.zzf = zzeVar;
        }
        return this;
    }

    public final synchronized zzfhq zzd(ArrayList arrayList) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            if (arrayList.contains("banner")) {
                this.zzh = 3;
            } else if (arrayList.contains("interstitial")) {
                this.zzh = 4;
            } else if (arrayList.contains("native")) {
                this.zzh = 8;
            } else if (arrayList.contains("rewarded")) {
                this.zzh = 5;
            } else if (arrayList.contains("app_open_ad")) {
                this.zzh = 7;
            } else if (arrayList.contains("rewarded_interstitial")) {
                this.zzh = 6;
            }
        }
        return this;
    }

    public final synchronized zzfhq zze(String str) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfhq zzf(zzfbr zzfbrVar) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            this.zze = zzfbrVar;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfhg zzfhgVar : this.zza) {
                int i2 = this.zzh;
                if (i2 != 2) {
                    zzfhgVar.zzk(i2);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfhgVar.zzd(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd) && !zzfhgVar.zzi()) {
                    zzfhgVar.zzc(this.zzd);
                }
                zzfbr zzfbrVar = this.zze;
                if (zzfbrVar != null) {
                    zzfhgVar.zzb(zzfbrVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzf;
                    if (zzeVar != null) {
                        zzfhgVar.zza(zzeVar);
                    }
                }
                this.zzb.zzb(zzfhgVar.zzj());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzfhq zzh(int i2) {
        if (((Boolean) zzbjh.zzc.zze()).booleanValue()) {
            this.zzh = i2;
        }
        return this;
    }
}
