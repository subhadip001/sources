package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcnf;
import com.google.android.gms.internal.ads.zzdoa;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdxo;
import com.google.android.gms.internal.ads.zzelg;
import com.google.android.gms.internal.ads.zzewe;
import com.google.android.gms.internal.ads.zzewf;
import com.google.android.gms.internal.ads.zzexs;
import com.google.android.gms.internal.ads.zzezl;
import com.google.android.gms.internal.ads.zzfaz;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class ClientApi extends zzcb {
    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbo zzb(IObjectWrapper iObjectWrapper, String str, zzbtz zzbtzVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzelg(zzcnf.zza(context, zzbtzVar, i2), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbtz zzbtzVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzewe zzr = zzcnf.zza(context, zzbtzVar, i2).zzr();
        zzr.zza(str);
        zzr.zzb(context);
        zzewf zzc = zzr.zzc();
        if (i2 >= ((Integer) zzay.zzc().zzb(zzbhy.zzej)).intValue()) {
            return zzc.zzb();
        }
        return zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbtz zzbtzVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzexs zzs = zzcnf.zza(context, zzbtzVar, i2).zzs();
        zzs.zzc(context);
        zzs.zza(zzqVar);
        zzs.zzb(str);
        return zzs.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbtz zzbtzVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezl zzt = zzcnf.zza(context, zzbtzVar, i2).zzt();
        zzt.zzc(context);
        zzt.zza(zzqVar);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i2) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzqVar, str, new zzcfo(221310000, i2, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcm zzg(IObjectWrapper iObjectWrapper, int i2) {
        return zzcnf.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i2).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzble zzh(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdoc((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 221310000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzblk zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdoa((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbpj zzj(IObjectWrapper iObjectWrapper, zzbtz zzbtzVar, int i2, zzbpg zzbpgVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdxo zzj = zzcnf.zza(context, zzbtzVar, i2).zzj();
        zzj.zzb(context);
        zzj.zza(zzbpgVar);
        return zzj.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbxk zzk(IObjectWrapper iObjectWrapper, zzbtz zzbtzVar, int i2) {
        return zzcnf.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbtzVar, i2).zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbxu zzl(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
        }
        int i2 = zza.zzk;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
                        }
                        return new zzz(activity);
                    }
                    return new zzv(activity, zza);
                }
                return new zzac(activity);
            }
            return new zzab(activity);
        }
        return new com.google.android.gms.ads.internal.overlay.zzs(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcan zzm(IObjectWrapper iObjectWrapper, zzbtz zzbtzVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfaz zzu = zzcnf.zza(context, zzbtzVar, i2).zzu();
        zzu.zzb(context);
        return zzu.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcbd zzn(IObjectWrapper iObjectWrapper, String str, zzbtz zzbtzVar, int i2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfaz zzu = zzcnf.zza(context, zzbtzVar, i2).zzu();
        zzu.zzb(context);
        zzu.zza(str);
        return zzu.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcdz zzo(IObjectWrapper iObjectWrapper, zzbtz zzbtzVar, int i2) {
        return zzcnf.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbtzVar, i2).zzo();
    }
}
