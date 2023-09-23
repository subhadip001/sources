package com.google.android.gms.internal.ads;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfso {
    public static Object zza(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(a.d(20, "at index ", i2));
    }

    public static Object[] zzb(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            zza(objArr[i3], i3);
        }
        return objArr;
    }
}
