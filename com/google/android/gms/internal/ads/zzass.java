package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzass {
    public AudioTrack zza;
    private boolean zzb;
    private int zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    private zzass() {
    }

    public /* synthetic */ zzass(zzasr zzasrVar) {
    }

    public final long zza() {
        if (this.zzg != -9223372036854775807L) {
            return Math.min(this.zzi, ((((SystemClock.elapsedRealtime() * 1000) - this.zzg) * this.zzc) / 1000000) + this.zzh);
        }
        int playState = this.zza.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.zza.getPlaybackHeadPosition() & 4294967295L;
        if (this.zzb) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.zzf = this.zzd;
            }
            playbackHeadPosition += this.zzf;
        }
        if (this.zzd > playbackHeadPosition) {
            this.zze++;
        }
        this.zzd = playbackHeadPosition;
        return playbackHeadPosition + (this.zze << 32);
    }

    public final long zzb() {
        return (zza() * 1000000) / this.zzc;
    }

    public long zzc() {
        throw new UnsupportedOperationException();
    }

    public long zzd() {
        throw new UnsupportedOperationException();
    }

    public final void zze(long j2) {
        this.zzh = zza();
        this.zzg = SystemClock.elapsedRealtime() * 1000;
        this.zzi = j2;
        this.zza.stop();
    }

    public final void zzf() {
        if (this.zzg != -9223372036854775807L) {
            return;
        }
        this.zza.pause();
    }

    public void zzg(AudioTrack audioTrack, boolean z) {
        this.zza = audioTrack;
        this.zzb = z;
        this.zzg = -9223372036854775807L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        if (audioTrack != null) {
            this.zzc = audioTrack.getSampleRate();
        }
    }

    public boolean zzh() {
        return false;
    }
}
