package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzpz {
    private long zza;
    private long zzb;
    private boolean zzc;

    private final long zzd(long j2) {
        return Math.max(0L, ((this.zzb - 529) * 1000000) / j2) + this.zza;
    }

    public final long zza(zzad zzadVar) {
        return zzd(zzadVar.zzA);
    }

    public final long zzb(zzad zzadVar, zzgc zzgcVar) {
        if (this.zzb == 0) {
            this.zza = zzgcVar.zzd;
        }
        if (this.zzc) {
            return zzgcVar.zzd;
        }
        ByteBuffer byteBuffer = zzgcVar.zzb;
        Objects.requireNonNull(byteBuffer);
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = (i2 << 8) | (byteBuffer.get(i3) & 255);
        }
        int zzc = zzzm.zzc(i2);
        if (zzc == -1) {
            this.zzc = true;
            this.zzb = 0L;
            this.zza = zzgcVar.zzd;
            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return zzgcVar.zzd;
        }
        long zzd = zzd(zzadVar.zzA);
        this.zzb += zzc;
        return zzd;
    }

    public final void zzc() {
        this.zza = 0L;
        this.zzb = 0L;
        this.zzc = false;
    }
}
