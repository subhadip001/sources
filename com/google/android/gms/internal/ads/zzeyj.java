package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeyj {
    public static void zza(AtomicReference atomicReference, zzeyi zzeyiVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzeyiVar.zza(obj);
        } catch (RemoteException e2) {
            zzcfi.zzl("#007 Could not call remote method.", e2);
        } catch (NullPointerException e3) {
            zzcfi.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e3);
        }
    }
}
