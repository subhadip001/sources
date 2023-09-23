package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzast extends zzass {
    private final AudioTimestamp zzb;
    private long zzc;
    private long zzd;
    private long zze;

    public zzast() {
        super(null);
        this.zzb = new AudioTimestamp();
    }

    @Override // com.google.android.gms.internal.ads.zzass
    public final long zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzass
    public final long zzd() {
        return this.zzb.nanoTime;
    }

    @Override // com.google.android.gms.internal.ads.zzass
    public final void zzg(AudioTrack audioTrack, boolean z) {
        super.zzg(audioTrack, z);
        this.zzc = 0L;
        this.zzd = 0L;
        this.zze = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzass
    public final boolean zzh() {
        boolean timestamp = this.zza.getTimestamp(this.zzb);
        if (timestamp) {
            long j2 = this.zzb.framePosition;
            if (this.zzd > j2) {
                this.zzc++;
            }
            this.zzd = j2;
            this.zze = j2 + (this.zzc << 32);
        }
        return timestamp;
    }
}
