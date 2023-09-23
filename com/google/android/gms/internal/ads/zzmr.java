package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzmr implements zzkl, zzms {
    private final Context zza;
    private final zzmt zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzbr zzn;
    private zzmq zzo;
    private zzmq zzp;
    private zzmq zzq;
    private zzad zzr;
    private zzad zzs;
    private zzad zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzch zze = new zzch();
    private final zzcf zzf = new zzcf();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzmr(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzmp zzmpVar = new zzmp(zzmp.zza);
        this.zzb = zzmpVar;
        zzmpVar.zzg(this);
    }

    public static zzmr zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzmr(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzr(int i2) {
        switch (zzeg.zzl(i2)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l2 = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.zzj.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j2, zzad zzadVar, int i2) {
        if (zzeg.zzS(this.zzs, zzadVar)) {
            return;
        }
        int i3 = this.zzs == null ? 1 : 0;
        this.zzs = zzadVar;
        zzx(0, j2, zzadVar, i3);
    }

    private final void zzu(long j2, zzad zzadVar, int i2) {
        if (zzeg.zzS(this.zzt, zzadVar)) {
            return;
        }
        int i3 = this.zzt == null ? 1 : 0;
        this.zzt = zzadVar;
        zzx(2, j2, zzadVar, i3);
    }

    private final void zzv(zzci zzciVar, zzsb zzsbVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzsbVar == null || (zza = zzciVar.zza(zzsbVar.zza)) == -1) {
            return;
        }
        int i2 = 0;
        zzciVar.zzd(zza, this.zzf, false);
        zzciVar.zze(this.zzf.zzd, this.zze, 0L);
        zzaw zzawVar = this.zze.zzd.zzd;
        if (zzawVar != null) {
            int zzp = zzeg.zzp(zzawVar.zza);
            i2 = zzp != 0 ? zzp != 1 ? zzp != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i2);
        zzch zzchVar = this.zze;
        if (zzchVar.zzn != -9223372036854775807L && !zzchVar.zzl && !zzchVar.zzi && !zzchVar.zzb()) {
            builder.setMediaDurationMillis(zzeg.zzz(this.zze.zzn));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j2, zzad zzadVar, int i2) {
        if (zzeg.zzS(this.zzr, zzadVar)) {
            return;
        }
        int i3 = this.zzr == null ? 1 : 0;
        this.zzr = zzadVar;
        zzx(1, j2, zzadVar, i3);
    }

    private final void zzx(int i2, long j2, zzad zzadVar, int i3) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i2).setTimeSinceCreatedMillis(j2 - this.zzd);
        if (zzadVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i3 != 1 ? 1 : 2);
            String str = zzadVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzadVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzadVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = zzadVar.zzi;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = zzadVar.zzr;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = zzadVar.zzs;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = zzadVar.zzz;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = zzadVar.zzA;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = zzadVar.zzd;
            if (str4 != null) {
                String[] zzaf = zzeg.zzaf(str4, "-");
                Pair create = Pair.create(zzaf[0], zzaf.length >= 2 ? zzaf[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f2 = zzadVar.zzt;
            if (f2 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f2);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean zzy(zzmq zzmqVar) {
        return zzmqVar != null && zzmqVar.zzc.equals(this.zzb.zzd());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzc(zzkj zzkjVar, String str) {
        zzsb zzsbVar = zzkjVar.zzd;
        if (zzsbVar == null || !zzsbVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-alpha03");
            zzv(zzkjVar.zzb, zzkjVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzd(zzkj zzkjVar, String str, boolean z) {
        zzsb zzsbVar = zzkjVar.zzd;
        if ((zzsbVar == null || !zzsbVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zze(zzkj zzkjVar, zzad zzadVar, zzgn zzgnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzf(zzkj zzkjVar, int i2, long j2, long j3) {
        zzsb zzsbVar = zzkjVar.zzd;
        if (zzsbVar != null) {
            String zze = this.zzb.zze(zzkjVar.zzb, zzsbVar);
            Long l2 = (Long) this.zzh.get(zze);
            Long l3 = (Long) this.zzg.get(zze);
            this.zzh.put(zze, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j2));
            this.zzg.put(zze, Long.valueOf((l3 != null ? l3.longValue() : 0L) + i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzg(zzkj zzkjVar, zzrx zzrxVar) {
        zzsb zzsbVar = zzkjVar.zzd;
        if (zzsbVar == null) {
            return;
        }
        zzad zzadVar = zzrxVar.zzb;
        Objects.requireNonNull(zzadVar);
        zzmq zzmqVar = new zzmq(zzadVar, 0, this.zzb.zze(zzkjVar.zzb, zzsbVar));
        int i2 = zzrxVar.zza;
        if (i2 != 0) {
            if (i2 == 1) {
                this.zzp = zzmqVar;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.zzq = zzmqVar;
                return;
            }
        }
        this.zzo = zzmqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zzh(zzkj zzkjVar, int i2, long j2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzkl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.gms.internal.ads.zzcb r21, com.google.android.gms.internal.ads.zzkk r22) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmr.zzi(com.google.android.gms.internal.ads.zzcb, com.google.android.gms.internal.ads.zzkk):void");
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzj(zzkj zzkjVar, zzrs zzrsVar, zzrx zzrxVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zzk(zzkj zzkjVar, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzl(zzkj zzkjVar, zzbr zzbrVar) {
        this.zzn = zzbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzm(zzkj zzkjVar, zzca zzcaVar, zzca zzcaVar2, int i2) {
        if (i2 == 1) {
            this.zzu = true;
            i2 = 1;
        }
        this.zzk = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zzn(zzkj zzkjVar, Object obj, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzo(zzkj zzkjVar, zzgm zzgmVar) {
        this.zzw += zzgmVar.zzg;
        this.zzx += zzgmVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zzp(zzkj zzkjVar, zzad zzadVar, zzgn zzgnVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzq(zzkj zzkjVar, zzcv zzcvVar) {
        zzmq zzmqVar = this.zzo;
        if (zzmqVar != null) {
            zzad zzadVar = zzmqVar.zza;
            if (zzadVar.zzs == -1) {
                zzab zzb = zzadVar.zzb();
                zzb.zzX(zzcvVar.zzc);
                zzb.zzF(zzcvVar.zzd);
                this.zzo = new zzmq(zzb.zzY(), 0, zzmqVar.zzc);
            }
        }
    }
}
