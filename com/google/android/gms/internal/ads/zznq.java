package com.google.android.gms.internal.ads;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zznq extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzad zzc;

    public zznq(int i2, zzad zzadVar, boolean z) {
        super(a.i("AudioTrack write failed: ", i2));
        this.zzb = z;
        this.zza = i2;
        this.zzc = zzadVar;
    }
}
