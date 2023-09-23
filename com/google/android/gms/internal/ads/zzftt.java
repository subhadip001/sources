package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzftt {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j2, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j2, obj2, obj3)) {
            if (unsafe.getObject(obj, j2) != obj2) {
                return false;
            }
        }
        return true;
    }
}
