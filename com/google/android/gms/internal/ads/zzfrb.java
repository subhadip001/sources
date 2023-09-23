package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfrb {
    public static int zzd(int i2, int i3) {
        int i4 = i2 + (i2 >> 1) + 1;
        if (i4 < i3) {
            int highestOneBit = Integer.highestOneBit(i3 - 1);
            i4 = highestOneBit + highestOneBit;
        }
        return i4 < 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i4;
    }

    public abstract zzfrb zzb(Object obj);
}
