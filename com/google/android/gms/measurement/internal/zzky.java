package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzky {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final long zzd;
    public final Object zze;

    public zzky(String str, String str2, String str3, long j2, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(obj);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j2;
        this.zze = obj;
    }
}
