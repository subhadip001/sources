package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzk extends RemoteCreator {
    private zzbyz zza;

    @VisibleForTesting
    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzbt ? (zzbt) queryLocalInterface : new zzbt(iBinder);
    }

    public final zzbs zza(Context context, zzq zzqVar, String str, zzbtz zzbtzVar, int i2) {
        zzbhy.zzc(context);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzib)).booleanValue()) {
            try {
                IBinder zze = ((zzbt) zzcfm.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new zzcfk() { // from class: com.google.android.gms.ads.internal.client.zzj
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcfk
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        return queryLocalInterface instanceof zzbt ? (zzbt) queryLocalInterface : new zzbt(obj);
                    }
                })).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbtzVar, 221310000, i2);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzbs ? (zzbs) queryLocalInterface : new zzbq(zze);
            } catch (RemoteException | zzcfl | NullPointerException e2) {
                zzbyz zza = zzbyx.zza(context);
                this.zza = zza;
                zza.zzd(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzcfi.zzl("#007 Could not call remote method.", e2);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbt) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbtzVar, 221310000, i2);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof zzbs ? (zzbs) queryLocalInterface2 : new zzbq(zze2);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e3) {
            zzcfi.zzf("Could not create remote AdManager.", e3);
            return null;
        }
    }
}
