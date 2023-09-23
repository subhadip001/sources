package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzbld;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzblj;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzbpg;
import com.google.android.gms.internal.ads.zzbpi;
import com.google.android.gms.internal.ads.zzbpj;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbxj;
import com.google.android.gms.internal.ads.zzbxk;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzcbd;
import com.google.android.gms.internal.ads.zzcdy;
import com.google.android.gms.internal.ads.zzcdz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzca extends zzaqv implements zzcc {
    public zzca(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbo zzb(IObjectWrapper iObjectWrapper, String str, zzbtz zzbtzVar, int i2) {
        zzbo zzbmVar;
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzaqx.zzg(zza, zzbtzVar);
        zza.writeInt(221310000);
        Parcel zzbk = zzbk(3, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbmVar = queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(readStrongBinder);
        }
        zzbk.recycle();
        return zzbmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbtz zzbtzVar, int i2) {
        zzbs zzbqVar;
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzqVar);
        zza.writeString(str);
        zzaqx.zzg(zza, zzbtzVar);
        zza.writeInt(221310000);
        Parcel zzbk = zzbk(13, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(readStrongBinder);
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbtz zzbtzVar, int i2) {
        zzbs zzbqVar;
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzqVar);
        zza.writeString(str);
        zzaqx.zzg(zza, zzbtzVar);
        zza.writeInt(221310000);
        Parcel zzbk = zzbk(1, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(readStrongBinder);
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbtz zzbtzVar, int i2) {
        zzbs zzbqVar;
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzqVar);
        zza.writeString(str);
        zzaqx.zzg(zza, zzbtzVar);
        zza.writeInt(221310000);
        Parcel zzbk = zzbk(2, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(readStrongBinder);
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbs zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i2) {
        zzbs zzbqVar;
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zze(zza, zzqVar);
        zza.writeString(str);
        zza.writeInt(221310000);
        Parcel zzbk = zzbk(10, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbqVar = queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(readStrongBinder);
        }
        zzbk.recycle();
        return zzbqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcm zzg(IObjectWrapper iObjectWrapper, int i2) {
        zzcm zzckVar;
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zza.writeInt(221310000);
        Parcel zzbk = zzbk(9, zza);
        IBinder readStrongBinder = zzbk.readStrongBinder();
        if (readStrongBinder == null) {
            zzckVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzckVar = queryLocalInterface instanceof zzcm ? (zzcm) queryLocalInterface : new zzck(readStrongBinder);
        }
        zzbk.recycle();
        return zzckVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzble zzh(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, iObjectWrapper2);
        Parcel zzbk = zzbk(5, zza);
        zzble zzbB = zzbld.zzbB(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzbB;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzblk zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, iObjectWrapper2);
        zzaqx.zzg(zza, iObjectWrapper3);
        Parcel zzbk = zzbk(11, zza);
        zzblk zze = zzblj.zze(zzbk.readStrongBinder());
        zzbk.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbpj zzj(IObjectWrapper iObjectWrapper, zzbtz zzbtzVar, int i2, zzbpg zzbpgVar) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbtzVar);
        zza.writeInt(221310000);
        zzaqx.zzg(zza, zzbpgVar);
        Parcel zzbk = zzbk(16, zza);
        zzbpj zzb = zzbpi.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbxk zzk(IObjectWrapper iObjectWrapper, zzbtz zzbtzVar, int i2) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbtzVar);
        zza.writeInt(221310000);
        Parcel zzbk = zzbk(15, zza);
        zzbxk zzb = zzbxj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzbxu zzl(IObjectWrapper iObjectWrapper) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        Parcel zzbk = zzbk(8, zza);
        zzbxu zzF = zzbxt.zzF(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcan zzm(IObjectWrapper iObjectWrapper, zzbtz zzbtzVar, int i2) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcbd zzn(IObjectWrapper iObjectWrapper, String str, zzbtz zzbtzVar, int i2) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzaqx.zzg(zza, zzbtzVar);
        zza.writeInt(221310000);
        Parcel zzbk = zzbk(12, zza);
        zzcbd zzq = zzcbc.zzq(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcc
    public final zzcdz zzo(IObjectWrapper iObjectWrapper, zzbtz zzbtzVar, int i2) {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzaqx.zzg(zza, zzbtzVar);
        zza.writeInt(221310000);
        Parcel zzbk = zzbk(14, zza);
        zzcdz zzb = zzcdy.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }
}
