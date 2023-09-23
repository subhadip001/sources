package com.google.android.gms.internal.ads;

import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzmx {
    public static final zzmx zza = new zzmx(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzmx(int i2, int i3, int i4) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzeg.zzU(i4) ? zzeg.zzo(i4, i3) : -1;
    }

    public final String toString() {
        int i2 = this.zzb;
        int i3 = this.zzc;
        return a.t(a.C("AudioFormat[sampleRate=", i2, ", channelCount=", i3, ", encoding="), this.zzd, "]");
    }
}
