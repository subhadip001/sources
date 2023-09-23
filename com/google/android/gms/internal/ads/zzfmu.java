package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfmu {
    @VisibleForTesting
    public final zzfmx zza;
    @VisibleForTesting
    public final boolean zzb;

    private zzfmu(zzfmx zzfmxVar) {
        this.zza = zzfmxVar;
        this.zzb = zzfmxVar != null;
    }

    public static zzfmu zzb(Context context, String str, String str2) {
        zzfmx zzfmvVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfmvVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfmvVar = queryLocalInterface instanceof zzfmx ? (zzfmx) queryLocalInterface : new zzfmv(instantiate);
                    }
                    zzfmvVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfmu(zzfmvVar);
                } catch (Exception e2) {
                    throw new zzflw(e2);
                }
            } catch (Exception e3) {
                throw new zzflw(e3);
            }
        } catch (RemoteException | zzflw | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfmu(new zzfmy());
        }
    }

    public static zzfmu zzc() {
        zzfmy zzfmyVar = new zzfmy();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfmu(zzfmyVar);
    }

    public final zzfmt zza(byte[] bArr) {
        return new zzfmt(this, bArr, null);
    }
}
