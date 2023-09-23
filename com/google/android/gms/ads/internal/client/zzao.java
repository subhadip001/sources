package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzao extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzau zzb;

    public zzao(zzau zzauVar, Context context) {
        this.zzb = zzauVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "mobile_ads_settings");
        return new zzet();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) {
        return zzccVar.zzg(ObjectWrapper.wrap(this.zza), 221310000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() {
        zzbyz zzbyzVar;
        zzel zzelVar;
        zzbhy.zzc(this.zza);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzib)).booleanValue()) {
            try {
                IBinder zze = ((zzcn) zzcfm.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzan
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcfk
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                        return queryLocalInterface instanceof zzcn ? (zzcn) queryLocalInterface : new zzcn(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), 221310000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface instanceof zzcm ? (zzcm) queryLocalInterface : new zzck(zze);
            } catch (RemoteException | zzcfl | NullPointerException e2) {
                this.zzb.zzh = zzbyx.zza(this.zza);
                zzbyzVar = this.zzb.zzh;
                zzbyzVar.zzd(e2, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        }
        zzelVar = this.zzb.zzc;
        return zzelVar.zza(this.zza);
    }
}
