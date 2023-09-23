package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import f.a.b.a.a;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zznv {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zznu zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zznt zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zznv(zznu zznuVar) {
        this.zza = zznuVar;
        int i2 = zzeg.zza;
        try {
            this.zzn = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
    }

    private final long zzm(long j2) {
        return (j2 * 1000000) / this.zzg;
    }

    private final long zzn() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        if (this.zzx != -9223372036854775807L) {
            return Math.min(this.zzA, ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * this.zzg) / 1000000) + this.zzz);
        }
        int playState = audioTrack.getPlayState();
        long j2 = 0;
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.zzh) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.zzu = this.zzs;
                }
                playState = 2;
            }
            playbackHeadPosition += this.zzu;
        }
        if (zzeg.zza <= 29) {
            if (playbackHeadPosition != 0) {
                j2 = playbackHeadPosition;
            } else if (this.zzs > 0 && playState == 3) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = SystemClock.elapsedRealtime();
                }
                return this.zzs;
            }
            this.zzy = -9223372036854775807L;
            playbackHeadPosition = j2;
        }
        if (this.zzs > playbackHeadPosition) {
            this.zzt++;
        }
        this.zzs = playbackHeadPosition;
        return playbackHeadPosition + (this.zzt << 32);
    }

    private final void zzo() {
        this.zzl = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzk = false;
    }

    public final int zza(long j2) {
        return this.zze - ((int) (j2 - (zzn() * this.zzd)));
    }

    public final long zzb(boolean z) {
        long j2;
        long j3;
        zzno zznoVar;
        zzno zznoVar2;
        zznk zznkVar;
        String str;
        long zzE;
        long zzF;
        long zzE2;
        long zzF2;
        Method method;
        zznv zznvVar = this;
        AudioTrack audioTrack = zznvVar.zzc;
        Objects.requireNonNull(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long zzm = zznvVar.zzm(zzn());
            if (zzm != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - zznvVar.zzm >= 30000) {
                    long[] jArr = zznvVar.zzb;
                    int i2 = zznvVar.zzv;
                    jArr[i2] = zzm - nanoTime;
                    zznvVar.zzv = (i2 + 1) % 10;
                    int i3 = zznvVar.zzw;
                    if (i3 < 10) {
                        zznvVar.zzw = i3 + 1;
                    }
                    zznvVar.zzm = nanoTime;
                    zznvVar.zzl = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = zznvVar.zzw;
                        if (i4 >= i5) {
                            break;
                        }
                        zznvVar.zzl = (zznvVar.zzb[i4] / i5) + zznvVar.zzl;
                        i4++;
                    }
                }
                if (!zznvVar.zzh) {
                    zznt zzntVar = zznvVar.zzf;
                    Objects.requireNonNull(zzntVar);
                    if (zzntVar.zzg(nanoTime)) {
                        long zzb = zzntVar.zzb();
                        long zza = zzntVar.zza();
                        if (Math.abs(zzb - nanoTime) > 5000000) {
                            zzoi zzoiVar = (zzoi) zznvVar.zza;
                            zzE2 = zzoiVar.zza.zzE();
                            zzF2 = zzoiVar.zza.zzF();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(zza);
                            sb.append(", ");
                            sb.append(zzb);
                            a.Q(sb, ", ", nanoTime, ", ");
                            sb.append(zzm);
                            a.Q(sb, ", ", zzE2, ", ");
                            sb.append(zzF2);
                            Log.w("DefaultAudioSink", sb.toString());
                            zzntVar.zzd();
                            str = "DefaultAudioSink";
                        } else if (Math.abs(zznvVar.zzm(zza) - zzm) > 5000000) {
                            zzoi zzoiVar2 = (zzoi) zznvVar.zza;
                            zzE = zzoiVar2.zza.zzE();
                            zzF = zzoiVar2.zza.zzF();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(zza);
                            sb2.append(", ");
                            sb2.append(zzb);
                            a.Q(sb2, ", ", nanoTime, ", ");
                            sb2.append(zzm);
                            a.Q(sb2, ", ", zzE, ", ");
                            sb2.append(zzF);
                            str = "DefaultAudioSink";
                            Log.w(str, sb2.toString());
                            zzntVar.zzd();
                        } else {
                            str = "DefaultAudioSink";
                            zzntVar.zzc();
                        }
                        zznvVar = this;
                    } else {
                        str = "DefaultAudioSink";
                    }
                    if (zznvVar.zzq && (method = zznvVar.zzn) != null && nanoTime - zznvVar.zzr >= 500000) {
                        try {
                            AudioTrack audioTrack2 = zznvVar.zzc;
                            Objects.requireNonNull(audioTrack2);
                            int i6 = zzeg.zza;
                            long intValue = (((Integer) method.invoke(audioTrack2, new Object[0])).intValue() * 1000) - zznvVar.zzi;
                            zznvVar.zzo = intValue;
                            long max = Math.max(intValue, 0L);
                            zznvVar.zzo = max;
                            if (max > 5000000) {
                                Log.w(str, "Ignoring impossibly large audio latency: " + max);
                                zznvVar.zzo = 0L;
                            }
                        } catch (Exception unused) {
                            zznvVar.zzn = null;
                        }
                        zznvVar.zzr = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zznt zzntVar2 = zznvVar.zzf;
        Objects.requireNonNull(zzntVar2);
        boolean zzf = zzntVar2.zzf();
        if (zzf) {
            j3 = zzeg.zzs(nanoTime2 - zzntVar2.zzb(), zznvVar.zzj) + zznvVar.zzm(zzntVar2.zza());
        } else {
            if (zznvVar.zzw == 0) {
                j2 = zznvVar.zzm(zzn());
            } else {
                j2 = zznvVar.zzl + nanoTime2;
            }
            j3 = j2;
            if (!z) {
                j3 = Math.max(0L, j3 - zznvVar.zzo);
            }
        }
        if (zznvVar.zzD != zzf) {
            zznvVar.zzF = zznvVar.zzC;
            zznvVar.zzE = zznvVar.zzB;
        }
        long j4 = nanoTime2 - zznvVar.zzF;
        if (j4 < 1000000) {
            long j5 = (j4 * 1000) / 1000000;
            j3 = (((zzeg.zzs(j4, zznvVar.zzj) + zznvVar.zzE) * (1000 - j5)) + (j3 * j5)) / 1000;
        }
        if (!zznvVar.zzk) {
            long j6 = zznvVar.zzB;
            if (j3 > j6) {
                zznvVar.zzk = true;
                long currentTimeMillis = System.currentTimeMillis() - zzeg.zzz(zzeg.zzu(zzeg.zzz(j3 - j6), zznvVar.zzj));
                zzon zzonVar = ((zzoi) zznvVar.zza).zza;
                zznoVar = zzonVar.zzn;
                if (zznoVar != null) {
                    zznoVar2 = zzonVar.zzn;
                    zznkVar = ((zzos) zznoVar2).zza.zzc;
                    zznkVar.zzr(currentTimeMillis);
                }
            }
        }
        zznvVar.zzC = nanoTime2;
        zznvVar.zzB = j3;
        zznvVar.zzD = zzf;
        return j3;
    }

    public final long zzc(long j2) {
        return zzeg.zzz(zzm(j2 - zzn()));
    }

    public final void zzd(long j2) {
        this.zzz = zzn();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j2;
    }

    public final void zze() {
        zzo();
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.zzc = r4
            r3.zzd = r7
            r3.zze = r8
            com.google.android.gms.internal.ads.zznt r0 = new com.google.android.gms.internal.ads.zznt
            r0.<init>(r4)
            r3.zzf = r0
            int r4 = r4.getSampleRate()
            r3.zzg = r4
            r4 = 6
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L25
            int r5 = com.google.android.gms.internal.ads.zzeg.zza
            r2 = 23
            if (r5 >= r2) goto L25
            r5 = 5
            if (r6 == r5) goto L26
            if (r6 != r4) goto L25
            r6 = 6
            goto L26
        L25:
            r0 = 0
        L26:
            r3.zzh = r0
            boolean r4 = com.google.android.gms.internal.ads.zzeg.zzU(r6)
            r3.zzq = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r8 = r8 / r7
            long r7 = (long) r8
            long r7 = r3.zzm(r7)
            goto L3d
        L3c:
            r7 = r5
        L3d:
            r3.zzi = r7
            r7 = 0
            r3.zzs = r7
            r3.zzt = r7
            r3.zzu = r7
            r3.zzp = r1
            r3.zzx = r5
            r3.zzy = r5
            r3.zzr = r7
            r3.zzo = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.zzj = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznv.zzf(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zzg() {
        zznt zzntVar = this.zzf;
        Objects.requireNonNull(zzntVar);
        zzntVar.zze();
    }

    public final boolean zzh(long j2) {
        if (j2 <= zzn()) {
            if (this.zzh) {
                AudioTrack audioTrack = this.zzc;
                Objects.requireNonNull(audioTrack);
                return audioTrack.getPlayState() == 2 && zzn() == 0;
            }
            return false;
        }
        return true;
    }

    public final boolean zzi() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzj(long j2) {
        return this.zzy != -9223372036854775807L && j2 > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzk(long j2) {
        zzno zznoVar;
        long j3;
        zzno zznoVar2;
        zznk zznkVar;
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            } else if (playState == 1) {
                if (zzn() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zzh = zzh(j2);
        this.zzp = zzh;
        if (z && !zzh && playState != 1) {
            zznu zznuVar = this.zza;
            int i2 = this.zze;
            long zzz = zzeg.zzz(this.zzi);
            zzoi zzoiVar = (zzoi) zznuVar;
            zznoVar = zzoiVar.zza.zzn;
            if (zznoVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzon zzonVar = zzoiVar.zza;
                j3 = zzonVar.zzS;
                zznoVar2 = zzonVar.zzn;
                zznkVar = ((zzos) zznoVar2).zza.zzc;
                zznkVar.zzt(i2, zzz, elapsedRealtime - j3);
            }
        }
        return true;
    }

    public final boolean zzl() {
        zzo();
        if (this.zzx == -9223372036854775807L) {
            zznt zzntVar = this.zzf;
            Objects.requireNonNull(zzntVar);
            zzntVar.zze();
            return true;
        }
        return false;
    }
}
