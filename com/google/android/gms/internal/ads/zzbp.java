package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzbp extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzbp(String str, Throwable th, boolean z, int i2) {
        super(str, th);
        this.zza = z;
        this.zzb = i2;
    }

    public static zzbp zza(String str, Throwable th) {
        return new zzbp(str, th, true, 1);
    }

    public static zzbp zzb(String str, Throwable th) {
        return new zzbp(str, th, true, 0);
    }

    public static zzbp zzc(String str) {
        return new zzbp(str, null, false, 1);
    }
}
