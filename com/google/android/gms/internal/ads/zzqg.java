package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import f.a.b.a.a;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzqg {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    public zzqg(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = zzbo.zzh(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if ("Nexus 10".equals(r3) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzqg zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzqg r11 = new com.google.android.gms.internal.ads.zzqg
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3b
            int r3 = com.google.android.gms.internal.ads.zzeg.zza
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L3b
            r5 = 22
            if (r3 > r5) goto L39
            java.lang.String r3 = com.google.android.gms.internal.ads.zzeg.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L28
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L39
        L28:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L39
            goto L3b
        L39:
            r8 = 1
            goto L3c
        L3b:
            r8 = 0
        L3c:
            r3 = 21
            if (r4 == 0) goto L4e
            int r5 = com.google.android.gms.internal.ads.zzeg.zza
            if (r5 < r3) goto L4e
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L4e
            r9 = 1
            goto L4f
        L4e:
            r9 = 0
        L4f:
            if (r20 != 0) goto L62
            if (r4 == 0) goto L60
            int r5 = com.google.android.gms.internal.ads.zzeg.zza
            if (r5 < r3) goto L60
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L60
            goto L62
        L60:
            r10 = 0
            goto L63
        L62:
            r10 = 1
        L63:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqg.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzqg");
    }

    private static Point zzh(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzeg.zze(i2, widthAlignment) * widthAlignment, zzeg.zze(i3, heightAlignment) * heightAlignment);
    }

    private final void zzi(String str) {
        String str2 = this.zza;
        Log.d("MediaCodecInfo", a.w(a.F("NoSupport [", str, "] [", str2, ", "), this.zzb, "] [", zzeg.zze, "]"));
    }

    private static boolean zzj(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        Point zzh = zzh(videoCapabilities, i2, i3);
        int i4 = zzh.x;
        int i5 = zzh.y;
        if (d2 != -1.0d && d2 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d2));
        }
        return videoCapabilities.isSizeSupported(i4, i5);
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzh(videoCapabilities, i2, i3);
    }

    public final zzgn zzb(zzad zzadVar, zzad zzadVar2) {
        int i2 = true != zzeg.zzS(zzadVar.zzm, zzadVar2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzadVar.zzu != zzadVar2.zzu) {
                i2 |= 1024;
            }
            if (!this.zze && (zzadVar.zzr != zzadVar2.zzr || zzadVar.zzs != zzadVar2.zzs)) {
                i2 |= 512;
            }
            if (!zzeg.zzS(zzadVar.zzy, zzadVar2.zzy)) {
                i2 |= RecyclerView.a0.FLAG_MOVED;
            }
            String str = this.zza;
            if (zzeg.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzadVar.zzd(zzadVar2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzgn(this.zza, zzadVar, zzadVar2, true != zzadVar.zzd(zzadVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzadVar.zzz != zzadVar2.zzz) {
                i2 |= 4096;
            }
            if (zzadVar.zzA != zzadVar2.zzA) {
                i2 |= 8192;
            }
            if (zzadVar.zzB != zzadVar2.zzB) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zzb = zzqy.zzb(zzadVar);
                Pair zzb2 = zzqy.zzb(zzadVar2);
                if (zzb != null && zzb2 != null) {
                    int intValue = ((Integer) zzb.first).intValue();
                    int intValue2 = ((Integer) zzb2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzgn(this.zza, zzadVar, zzadVar2, 3, 0);
                    }
                }
            }
            if (!zzadVar.zzd(zzadVar2)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new zzgn(this.zza, zzadVar, zzadVar2, 1, 0);
            }
        }
        return new zzgn(this.zza, zzadVar, zzadVar2, 0, i2);
    }

    public final boolean zzd(zzad zzadVar) {
        int i2;
        Pair zzb;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (this.zzb.equals(zzadVar.zzm) || this.zzb.equals(zzqy.zze(zzadVar))) {
            int i3 = 16;
            if (zzadVar.zzj != null && (zzb = zzqy.zzb(zzadVar)) != null) {
                int intValue = ((Integer) zzb.first).intValue();
                int intValue2 = ((Integer) zzb.second).intValue();
                int i4 = 2;
                if ("video/dolby-vision".equals(zzadVar.zzm)) {
                    if ("video/avc".equals(this.zzb)) {
                        intValue2 = 0;
                        intValue = 8;
                    } else if ("video/hevc".equals(this.zzb)) {
                        intValue2 = 0;
                        intValue = 2;
                    }
                }
                if (!this.zzh) {
                    if (intValue == 42) {
                        intValue = 42;
                    }
                }
                MediaCodecInfo.CodecProfileLevel[] zzg = zzg();
                if (zzeg.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzg.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                    int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    if (intValue3 >= 180000000) {
                        i4 = 1024;
                    } else if (intValue3 >= 120000000) {
                        i4 = 512;
                    } else if (intValue3 >= 60000000) {
                        i4 = 256;
                    } else if (intValue3 >= 30000000) {
                        i4 = 128;
                    } else if (intValue3 >= 18000000) {
                        i4 = 64;
                    } else if (intValue3 >= 12000000) {
                        i4 = 32;
                    } else if (intValue3 >= 7200000) {
                        i4 = 16;
                    } else if (intValue3 >= 3600000) {
                        i4 = 8;
                    } else if (intValue3 >= 1800000) {
                        i4 = 4;
                    } else if (intValue3 < 800000) {
                        i4 = 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i4;
                    zzg = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzg) {
                    if (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2) {
                    }
                }
                zzi(a.r("codec.profileLevel, ", zzadVar.zzj, ", ", this.zzc));
                return false;
            }
            if (this.zzh) {
                int i5 = zzadVar.zzr;
                if (i5 <= 0 || (i2 = zzadVar.zzs) <= 0) {
                    return true;
                }
                if (zzeg.zza >= 21) {
                    return zzf(i5, i2, zzadVar.zzt);
                }
                boolean z = i5 * i2 <= zzqy.zza();
                if (!z) {
                    zzi(a.k("legacyFrameSize, ", zzadVar.zzr, "x", zzadVar.zzs));
                }
                return z;
            }
            int i6 = zzeg.zza;
            if (i6 >= 21) {
                int i7 = zzadVar.zzA;
                if (i7 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                    if (codecCapabilities2 == null) {
                        zzi("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        zzi("sampleRate.aCaps");
                        return false;
                    } else if (!audioCapabilities.isSampleRateSupported(i7)) {
                        zzi(a.i("sampleRate.support, ", i7));
                        return false;
                    }
                }
                int i8 = zzadVar.zzz;
                if (i8 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.zzd;
                    if (codecCapabilities3 == null) {
                        zzi("channelCount.caps");
                    } else {
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            zzi("channelCount.aCaps");
                        } else {
                            String str = this.zza;
                            String str2 = this.zzb;
                            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                            if (maxInputChannelCount <= 1 && ((i6 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                                if ("audio/ac3".equals(str2)) {
                                    i3 = 6;
                                } else if (!"audio/eac3".equals(str2)) {
                                    i3 = 30;
                                }
                                Log.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i3 + "]");
                                maxInputChannelCount = i3;
                            }
                            if (maxInputChannelCount < i8) {
                                zzi(a.i("channelCount.support, ", i8));
                            }
                        }
                    }
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean zze(zzad zzadVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb = zzqy.zzb(zzadVar);
        return zzb != null && ((Integer) zzb.first).intValue() == 42;
    }

    public final boolean zzf(int i2, int i3, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzi("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzi("sizeAndRate.vCaps");
            return false;
        } else if (zzj(videoCapabilities, i2, i3, d2)) {
            return true;
        } else {
            if (i2 < i3 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzeg.zzb)) && zzj(videoCapabilities, i3, i2, d2))) {
                StringBuilder C = a.C("sizeAndRate.rotated, ", i2, "x", i3, "x");
                C.append(d2);
                String str = this.zza;
                String str2 = this.zzb;
                String str3 = zzeg.zze;
                StringBuilder A = a.A("AssumedSupport [");
                A.append(C.toString());
                A.append("] [");
                A.append(str);
                A.append(", ");
                Log.d("MediaCodecInfo", a.w(A, str2, "] [", str3, "]"));
                return true;
            }
            StringBuilder C2 = a.C("sizeAndRate.support, ", i2, "x", i3, "x");
            C2.append(d2);
            zzi(C2.toString());
            return false;
        }
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzg() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
