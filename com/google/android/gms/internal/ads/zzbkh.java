package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbkh {
    private final Context zza;

    public zzbkh(Context context) {
        this.zza = context;
    }

    public final void zza(zzbze zzbzeVar) {
        try {
            ((zzbki) zzcfm.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new zzcfk() { // from class: com.google.android.gms.internal.ads.zzbkg
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcfk
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return queryLocalInterface instanceof zzbki ? (zzbki) queryLocalInterface : new zzbki(obj);
                }
            })).zze(zzbzeVar);
        } catch (RemoteException e2) {
            zzcfi.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
        } catch (zzcfl e3) {
            zzcfi.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e3.getMessage())));
        }
    }
}
