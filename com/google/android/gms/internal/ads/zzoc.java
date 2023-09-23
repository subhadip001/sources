package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzoc {
    public final zzad zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzmz[] zzi;

    public zzoc(zzad zzadVar, int i2, int i3, int i4, int i5, int i6, int i7, int i8, zzmz[] zzmzVarArr) {
        this.zza = zzadVar;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = i6;
        this.zzg = i7;
        this.zzh = i8;
        this.zzi = zzmzVarArr;
    }

    public final long zza(long j2) {
        return (j2 * 1000000) / this.zze;
    }

    public final AudioTrack zzb(boolean z, zzi zziVar, int i2) {
        AudioTrack audioTrack;
        AudioFormat build;
        AudioFormat build2;
        try {
            int i3 = zzeg.zza;
            if (i3 >= 29) {
                build2 = new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build();
                audioTrack = new AudioTrack.Builder().setAudioAttributes(zziVar.zza()).setAudioFormat(build2).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i2).setOffloadedPlayback(this.zzc == 1).build();
            } else if (i3 >= 21) {
                AudioAttributes zza = zziVar.zza();
                build = new AudioFormat.Builder().setSampleRate(this.zze).setChannelMask(this.zzf).setEncoding(this.zzg).build();
                audioTrack = new AudioTrack(zza, build, this.zzh, 1, i2);
            } else {
                int i4 = zziVar.zzc;
                if (i2 == 0) {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1, i2);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zznn(state, this.zze, this.zzf, this.zzh, this.zza, zzc(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            throw new zznn(0, this.zze, this.zzf, this.zzh, this.zza, zzc(), e2);
        }
    }

    public final boolean zzc() {
        return this.zzc == 1;
    }
}
