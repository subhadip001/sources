package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcbp {
    public static final zzcbd zza(Context context, String str, zzbtz zzbtzVar) {
        try {
            IBinder zze = ((zzcbh) zzcfm.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzcfk() { // from class: com.google.android.gms.internal.ads.zzcbo
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcfk
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return queryLocalInterface instanceof zzcbh ? (zzcbh) queryLocalInterface : new zzcbh(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbtzVar, 221310000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzcbd ? (zzcbd) queryLocalInterface : new zzcbb(zze);
        } catch (RemoteException | zzcfl e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
