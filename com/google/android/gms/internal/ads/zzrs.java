package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzrs {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzew zza;
    public final Uri zzb;
    public final Map zzc;

    public zzrs(long j2, zzew zzewVar, Uri uri, Map map, long j3, long j4, long j5) {
        this.zza = zzewVar;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}
