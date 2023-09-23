package com.google.android.gms.internal.ads;

import android.util.Log;
import com.arthenica.ffmpegkit.AbstractSession;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgq implements zzjb {
    private final zzvw zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private int zzg;
    private boolean zzh;

    public zzgq() {
        zzvw zzvwVar = new zzvw(true, LogFileManager.MAX_LOG_SIZE);
        zzj(2500, 0, "bufferForPlaybackMs", CrashlyticsReportDataCapture.SIGNAL_DEFAULT);
        zzj(AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT, 0, "bufferForPlaybackAfterRebufferMs", CrashlyticsReportDataCapture.SIGNAL_DEFAULT);
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", CrashlyticsReportDataCapture.SIGNAL_DEFAULT);
        this.zza = zzvwVar;
        this.zzb = zzeg.zzv(50000L);
        this.zzc = zzeg.zzv(50000L);
        this.zzd = zzeg.zzv(2500L);
        this.zze = zzeg.zzv(FirebaseInAppMessagingDisplay.IMPRESSION_THRESHOLD_MILLIS);
        this.zzg = 13107200;
        this.zzf = zzeg.zzv(0L);
    }

    private static void zzj(int i2, int i3, String str, String str2) {
        boolean z = i2 >= i3;
        zzcw.zze(z, str + " cannot be less than " + str2);
    }

    private final void zzk(boolean z) {
        this.zzg = 13107200;
        this.zzh = false;
        if (z) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzb() {
        zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzc() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzd() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zze(zzju[] zzjuVarArr, zztz zztzVar, zzvh[] zzvhVarArr) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int length = zzjuVarArr.length;
            if (i2 < 2) {
                if (zzvhVarArr[i2] != null) {
                    i3 += zzjuVarArr[i2].zzb() != 1 ? 131072000 : 13107200;
                }
                i2++;
            } else {
                int max = Math.max(13107200, i3);
                this.zzg = max;
                this.zza.zzf(max);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final boolean zzg(long j2, long j3, float f2) {
        int zza = this.zza.zza();
        int i2 = this.zzg;
        long j4 = this.zzb;
        if (f2 > 1.0f) {
            j4 = Math.min(zzeg.zzs(j4, f2), this.zzc);
        }
        if (j3 < Math.max(j4, 500000L)) {
            boolean z = zza < i2;
            this.zzh = z;
            if (!z && j3 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= this.zzc || zza >= i2) {
            this.zzh = false;
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final boolean zzh(long j2, float f2, boolean z, long j3) {
        long zzu = zzeg.zzu(j2, f2);
        long j4 = z ? this.zze : this.zzd;
        if (j3 != -9223372036854775807L) {
            j4 = Math.min(j3 / 2, j4);
        }
        return j4 <= 0 || zzu >= j4 || this.zza.zza() >= this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final zzvw zzi() {
        return this.zza;
    }
}
