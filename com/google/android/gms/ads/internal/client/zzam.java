package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzam extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbtz zzc;
    public final /* synthetic */ zzau zzd;

    public zzam(zzau zzauVar, Context context, String str, zzbtz zzbtzVar) {
        this.zzd = zzauVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbtzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "native_ad");
        return new zzep();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) {
        return zzccVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221310000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzc() {
        zzbyz zzbyzVar;
        zzi zziVar;
        zzbhy.zzc(this.zza);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzib)).booleanValue()) {
            try {
                IBinder zze = ((zzbp) zzcfm.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzal
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcfk
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                        return queryLocalInterface instanceof zzbp ? (zzbp) queryLocalInterface : new zzbp(obj);
                    }
                })).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221310000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(zze);
            } catch (RemoteException | zzcfl | NullPointerException e2) {
                this.zzd.zzh = zzbyx.zza(this.zza);
                zzbyzVar = this.zzd.zzh;
                zzbyzVar.zzd(e2, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        zziVar = this.zzd.zzb;
        return zziVar.zza(this.zza, this.zzb, this.zzc);
    }
}
