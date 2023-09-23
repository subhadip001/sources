package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import f.a.b.a.a;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdp {
    public static void zza(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static void zzb(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(a.i("csd-", i2), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }
}
