package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzqc {
    public final zzqg zza;
    public final MediaFormat zzb;
    public final zzad zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzqc(zzqg zzqgVar, MediaFormat mediaFormat, zzad zzadVar, Surface surface, MediaCrypto mediaCrypto, int i2) {
        this.zza = zzqgVar;
        this.zzb = mediaFormat;
        this.zzc = zzadVar;
        this.zzd = surface;
    }

    public static zzqc zza(zzqg zzqgVar, MediaFormat mediaFormat, zzad zzadVar, MediaCrypto mediaCrypto) {
        return new zzqc(zzqgVar, mediaFormat, zzadVar, null, null, 0);
    }

    public static zzqc zzb(zzqg zzqgVar, MediaFormat mediaFormat, zzad zzadVar, Surface surface, MediaCrypto mediaCrypto) {
        return new zzqc(zzqgVar, mediaFormat, zzadVar, surface, null, 0);
    }
}
