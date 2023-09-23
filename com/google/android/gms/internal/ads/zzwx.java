package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzwx extends zzqj {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private float zzF;
    private zzcv zzG;
    private int zzH;
    private zzwy zzI;
    private final Context zze;
    private final zzxf zzf;
    private final zzxq zzg;
    private final boolean zzh;
    private zzww zzi;
    private boolean zzj;
    private boolean zzk;
    private Surface zzl;
    private zzws zzm;
    private boolean zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzwx(Context context, zzqd zzqdVar, zzql zzqlVar, long j2, boolean z, Handler handler, zzxr zzxrVar, int i2, float f2) {
        super(2, zzqdVar, zzqlVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzf = new zzxf(applicationContext);
        this.zzg = new zzxq(handler, zzxrVar);
        this.zzh = "NVIDIA".equals(zzeg.zzc);
        this.zzt = -9223372036854775807L;
        this.zzC = -1;
        this.zzD = -1;
        this.zzF = -1.0f;
        this.zzo = 1;
        this.zzH = 0;
        this.zzG = null;
    }

    public static int zzT(zzqg zzqgVar, zzad zzadVar) {
        if (zzadVar.zzn != -1) {
            int size = zzadVar.zzo.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) zzadVar.zzo.get(i3)).length;
            }
            return zzadVar.zzn + i2;
        }
        return zzaB(zzqgVar, zzadVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x05f6, code lost:
        if (r1.equals("A10-70F") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0758, code lost:
        if (r8 != 2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean zzaA(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 2794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwx.zzaA(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int zzaB(zzqg zzqgVar, zzad zzadVar) {
        char c;
        int i2;
        int intValue;
        int i3 = zzadVar.zzr;
        int i4 = zzadVar.zzs;
        if (i3 == -1 || i4 == -1) {
            return -1;
        }
        String str = zzadVar.zzm;
        int i5 = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair zzb2 = zzqy.zzb(zzadVar);
            str = (zzb2 == null || !((intValue = ((Integer) zzb2.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1) {
            if (c == 2) {
                String str2 = zzeg.zzd;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(zzeg.zzc) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && zzqgVar.zzf)))) {
                    return -1;
                }
                i2 = zzeg.zze(i4, 16) * zzeg.zze(i3, 16) * 256;
            } else if (c != 3) {
                if (c != 4 && c != 5) {
                    return -1;
                }
                i2 = i3 * i4;
                i5 = 4;
            }
            return (i2 * 3) / (i5 + i5);
        }
        i2 = i3 * i4;
        return (i2 * 3) / (i5 + i5);
    }

    private static List zzaC(zzql zzqlVar, zzad zzadVar, boolean z, boolean z2) {
        String str = zzadVar.zzm;
        if (str == null) {
            return zzfrh.zzo();
        }
        List zzf = zzqy.zzf(str, z, z2);
        String zze = zzqy.zze(zzadVar);
        if (zze == null) {
            return zzfrh.zzm(zzf);
        }
        List zzf2 = zzqy.zzf(zze, z, z2);
        zzfre zzi = zzfrh.zzi();
        zzi.zzf(zzf);
        zzi.zzf(zzf2);
        return zzi.zzg();
    }

    private final void zzaD() {
        int i2 = this.zzC;
        if (i2 == -1) {
            if (this.zzD == -1) {
                return;
            }
            i2 = -1;
        }
        zzcv zzcvVar = this.zzG;
        if (zzcvVar != null && zzcvVar.zzc == i2 && zzcvVar.zzd == this.zzD && zzcvVar.zze == this.zzE && zzcvVar.zzf == this.zzF) {
            return;
        }
        zzcv zzcvVar2 = new zzcv(i2, this.zzD, this.zzE, this.zzF);
        this.zzG = zzcvVar2;
        this.zzg.zzt(zzcvVar2);
    }

    private final void zzaE() {
        zzcv zzcvVar = this.zzG;
        if (zzcvVar != null) {
            this.zzg.zzt(zzcvVar);
        }
    }

    private final void zzaF() {
        Surface surface = this.zzl;
        zzws zzwsVar = this.zzm;
        if (surface == zzwsVar) {
            this.zzl = null;
        }
        zzwsVar.release();
        this.zzm = null;
    }

    private static boolean zzaG(long j2) {
        return j2 < -30000;
    }

    private final boolean zzaH(zzqg zzqgVar) {
        return zzeg.zza >= 23 && !zzaA(zzqgVar.zza) && (!zzqgVar.zzf || zzws.zzb(this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzgl, com.google.android.gms.internal.ads.zzju
    public final void zzD(float f2, float f3) {
        super.zzD(f2, f3);
        this.zzf.zze(f2);
    }

    @Override // com.google.android.gms.internal.ads.zzju, com.google.android.gms.internal.ads.zzjv
    public final String zzK() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzju
    public final boolean zzN() {
        zzws zzwsVar;
        if (super.zzN() && (this.zzp || (((zzwsVar = this.zzm) != null && this.zzl == zzwsVar) || zzaj() == null))) {
            this.zzt = -9223372036854775807L;
            return true;
        } else if (this.zzt == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzt) {
                return true;
            }
            this.zzt = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final float zzP(float f2, zzad zzadVar, zzad[] zzadVarArr) {
        float f3 = -1.0f;
        for (zzad zzadVar2 : zzadVarArr) {
            float f4 = zzadVar2.zzt;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            return -1.0f;
        }
        return f3 * f2;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final int zzQ(zzql zzqlVar, zzad zzadVar) {
        boolean z;
        if (zzbo.zzh(zzadVar.zzm)) {
            int i2 = 0;
            boolean z2 = zzadVar.zzp != null;
            List zzaC = zzaC(zzqlVar, zzadVar, z2, false);
            if (z2 && zzaC.isEmpty()) {
                zzaC = zzaC(zzqlVar, zzadVar, false, false);
            }
            if (zzaC.isEmpty()) {
                return 129;
            }
            if (zzqj.zzav(zzadVar)) {
                zzqg zzqgVar = (zzqg) zzaC.get(0);
                boolean zzd2 = zzqgVar.zzd(zzadVar);
                if (!zzd2) {
                    for (int i3 = 1; i3 < zzaC.size(); i3++) {
                        zzqg zzqgVar2 = (zzqg) zzaC.get(i3);
                        if (zzqgVar2.zzd(zzadVar)) {
                            zzqgVar = zzqgVar2;
                            z = false;
                            zzd2 = true;
                            break;
                        }
                    }
                }
                z = true;
                int i4 = true != zzd2 ? 3 : 4;
                int i5 = true != zzqgVar.zze(zzadVar) ? 8 : 16;
                int i6 = true != zzqgVar.zzg ? 0 : 64;
                int i7 = true != z ? 0 : 128;
                if (zzd2) {
                    List zzaC2 = zzaC(zzqlVar, zzadVar, z2, true);
                    if (!zzaC2.isEmpty()) {
                        zzqg zzqgVar3 = (zzqg) zzqy.zzg(zzaC2, zzadVar).get(0);
                        if (zzqgVar3.zzd(zzadVar) && zzqgVar3.zze(zzadVar)) {
                            i2 = 32;
                        }
                    }
                }
                return i4 | i5 | i2 | i6 | i7;
            }
            return 130;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final zzgn zzR(zzqg zzqgVar, zzad zzadVar, zzad zzadVar2) {
        int i2;
        int i3;
        zzgn zzb2 = zzqgVar.zzb(zzadVar, zzadVar2);
        int i4 = zzb2.zze;
        int i5 = zzadVar2.zzr;
        zzww zzwwVar = this.zzi;
        if (i5 > zzwwVar.zza || zzadVar2.zzs > zzwwVar.zzb) {
            i4 |= 256;
        }
        if (zzT(zzqgVar, zzadVar2) > this.zzi.zzc) {
            i4 |= 64;
        }
        String str = zzqgVar.zza;
        if (i4 != 0) {
            i3 = i4;
            i2 = 0;
        } else {
            i2 = zzb2.zzd;
            i3 = 0;
        }
        return new zzgn(str, zzadVar, zzadVar2, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final zzgn zzS(zzja zzjaVar) {
        zzgn zzS = super.zzS(zzjaVar);
        this.zzg.zzf(zzjaVar.zza, zzS);
        return zzS;
    }

    public final void zzU() {
        this.zzr = true;
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        this.zzg.zzq(this.zzl);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final zzqc zzV(zzqg zzqgVar, zzad zzadVar, MediaCrypto mediaCrypto, float f2) {
        String str;
        zzww zzwwVar;
        String str2;
        String str3;
        Point point;
        Pair zzb2;
        int zzaB;
        zzws zzwsVar = this.zzm;
        if (zzwsVar != null && zzwsVar.zza != zzqgVar.zzf) {
            zzaF();
        }
        String str4 = zzqgVar.zzc;
        zzad[] zzJ = zzJ();
        int i2 = zzadVar.zzr;
        int i3 = zzadVar.zzs;
        int zzT = zzT(zzqgVar, zzadVar);
        int length = zzJ.length;
        if (length == 1) {
            if (zzT != -1 && (zzaB = zzaB(zzqgVar, zzadVar)) != -1) {
                zzT = Math.min((int) (zzT * 1.5f), zzaB);
            }
            zzwwVar = new zzww(i2, i3, zzT);
            str = str4;
        } else {
            boolean z = false;
            for (int i4 = 0; i4 < length; i4++) {
                zzad zzadVar2 = zzJ[i4];
                if (zzadVar.zzy != null && zzadVar2.zzy == null) {
                    zzab zzb3 = zzadVar2.zzb();
                    zzb3.zzy(zzadVar.zzy);
                    zzadVar2 = zzb3.zzY();
                }
                if (zzqgVar.zzb(zzadVar, zzadVar2).zzd != 0) {
                    int i5 = zzadVar2.zzr;
                    z |= i5 == -1 || zzadVar2.zzs == -1;
                    i2 = Math.max(i2, i5);
                    i3 = Math.max(i3, zzadVar2.zzs);
                    zzT = Math.max(zzT, zzT(zzqgVar, zzadVar2));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i2);
                String str5 = "x";
                sb.append("x");
                sb.append(i3);
                String str6 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", sb.toString());
                int i6 = zzadVar.zzs;
                int i7 = zzadVar.zzr;
                int i8 = i6 > i7 ? i6 : i7;
                int i9 = i6 <= i7 ? i6 : i7;
                float f3 = i9 / i8;
                int[] iArr = zzb;
                str = str4;
                int i10 = 0;
                while (i10 < 9) {
                    int i11 = iArr[i10];
                    int[] iArr2 = iArr;
                    int i12 = (int) (i11 * f3);
                    if (i11 <= i8 || i12 <= i9) {
                        break;
                    }
                    int i13 = i8;
                    int i14 = i9;
                    if (zzeg.zza >= 21) {
                        int i15 = i6 <= i7 ? i11 : i12;
                        if (i6 <= i7) {
                            i11 = i12;
                        }
                        point = zzqgVar.zza(i15, i11);
                        str2 = str5;
                        str3 = str6;
                        if (zzqgVar.zzf(point.x, point.y, zzadVar.zzt)) {
                            break;
                        }
                        i10++;
                        iArr = iArr2;
                        i8 = i13;
                        i9 = i14;
                        str5 = str2;
                        str6 = str3;
                    } else {
                        str2 = str5;
                        str3 = str6;
                        try {
                            int zze = zzeg.zze(i11, 16) * 16;
                            int zze2 = zzeg.zze(i12, 16) * 16;
                            if (zze * zze2 <= zzqy.zza()) {
                                int i16 = i6 <= i7 ? zze : zze2;
                                if (i6 <= i7) {
                                    zze = zze2;
                                }
                                point = new Point(i16, zze);
                            } else {
                                i10++;
                                iArr = iArr2;
                                i8 = i13;
                                i9 = i14;
                                str5 = str2;
                                str6 = str3;
                            }
                        } catch (zzqs unused) {
                        }
                    }
                }
                str2 = str5;
                str3 = str6;
                point = null;
                if (point != null) {
                    i2 = Math.max(i2, point.x);
                    i3 = Math.max(i3, point.y);
                    zzab zzb4 = zzadVar.zzb();
                    zzb4.zzX(i2);
                    zzb4.zzF(i3);
                    zzT = Math.max(zzT, zzaB(zzqgVar, zzb4.zzY()));
                    Log.w(str3, "Codec max resolution adjusted to: " + i2 + str2 + i3);
                }
            } else {
                str = str4;
            }
            zzwwVar = new zzww(i2, i3, zzT);
        }
        this.zzi = zzwwVar;
        boolean z2 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(StreamInformation.KEY_WIDTH, zzadVar.zzr);
        mediaFormat.setInteger(StreamInformation.KEY_HEIGHT, zzadVar.zzs);
        zzdp.zzb(mediaFormat, zzadVar.zzo);
        float f4 = zzadVar.zzt;
        if (f4 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f4);
        }
        zzdp.zza(mediaFormat, "rotation-degrees", zzadVar.zzu);
        zzo zzoVar = zzadVar.zzy;
        if (zzoVar != null) {
            zzdp.zza(mediaFormat, "color-transfer", zzoVar.zzd);
            zzdp.zza(mediaFormat, "color-standard", zzoVar.zzb);
            zzdp.zza(mediaFormat, "color-range", zzoVar.zzc);
            byte[] bArr = zzoVar.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzadVar.zzm) && (zzb2 = zzqy.zzb(zzadVar)) != null) {
            zzdp.zza(mediaFormat, Scopes.PROFILE, ((Integer) zzb2.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzwwVar.zza);
        mediaFormat.setInteger("max-height", zzwwVar.zzb);
        zzdp.zza(mediaFormat, "max-input-size", zzwwVar.zzc);
        if (zzeg.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z2) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.zzl == null) {
            if (zzaH(zzqgVar)) {
                if (this.zzm == null) {
                    this.zzm = zzws.zza(this.zze, zzqgVar.zzf);
                }
                this.zzl = this.zzm;
            } else {
                throw new IllegalStateException();
            }
        }
        return zzqc.zzb(zzqgVar, mediaFormat, zzadVar, this.zzl, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final List zzW(zzql zzqlVar, zzad zzadVar, boolean z) {
        return zzqy.zzg(zzaC(zzqlVar, zzadVar, false, false), zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzX(Exception exc) {
        zzdn.zza("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzY(String str, zzqc zzqcVar, long j2, long j3) {
        this.zzg.zza(str, j2, j3);
        this.zzj = zzaA(str);
        zzqg zzal = zzal();
        Objects.requireNonNull(zzal);
        boolean z = false;
        if (zzeg.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzal.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzg = zzal.zzg();
            int length = zzg.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (zzg[i2].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.zzk = z;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzZ(String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzaa(zzad zzadVar, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        zzqe zzaj = zzaj();
        if (zzaj != null) {
            zzaj.zzq(this.zzo);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger(StreamInformation.KEY_WIDTH);
        }
        this.zzC = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger(StreamInformation.KEY_HEIGHT);
        }
        this.zzD = integer2;
        float f2 = zzadVar.zzv;
        this.zzF = f2;
        if (zzeg.zza >= 21) {
            int i2 = zzadVar.zzu;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.zzC;
                this.zzC = integer2;
                this.zzD = i3;
                this.zzF = 1.0f / f2;
            }
        } else {
            this.zzE = zzadVar.zzu;
        }
        this.zzf.zzc(zzadVar.zzt);
    }

    public final void zzab(zzqe zzqeVar, int i2, long j2) {
        zzaD();
        int i3 = zzeg.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqeVar.zzn(i2, true);
        Trace.endSection();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        ((zzqj) this).zza.zze++;
        this.zzw = 0;
        zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzac() {
        this.zzp = false;
        int i2 = zzeg.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzad(zzgc zzgcVar) {
        this.zzx++;
        int i2 = zzeg.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final boolean zzaf(long j2, long j3, zzqe zzqeVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, zzad zzadVar) {
        boolean z3;
        int zzd2;
        Objects.requireNonNull(zzqeVar);
        if (this.zzs == -9223372036854775807L) {
            this.zzs = j2;
        }
        if (j4 != this.zzy) {
            this.zzf.zzd(j4);
            this.zzy = j4;
        }
        long zzai = zzai();
        long j5 = j4 - zzai;
        if (z && !z2) {
            zzax(zzqeVar, i2, j5);
            return true;
        }
        float zzah = zzah();
        int zzbe = zzbe();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j6 = (long) ((j4 - j2) / zzah);
        if (zzbe == 2) {
            j6 -= elapsedRealtime - j3;
        }
        if (this.zzl == this.zzm) {
            if (zzaG(j6)) {
                zzax(zzqeVar, i2, j5);
                zzaz(j6);
                return true;
            }
            return false;
        }
        long j7 = elapsedRealtime - this.zzz;
        boolean z4 = this.zzr ? !this.zzp : zzbe == 2 || this.zzq;
        if (this.zzt == -9223372036854775807L && j2 >= zzai && (z4 || (zzbe == 2 && zzaG(j6) && j7 > 100000))) {
            long nanoTime = System.nanoTime();
            if (zzeg.zza >= 21) {
                zzaw(zzqeVar, i2, j5, nanoTime);
            } else {
                zzab(zzqeVar, i2, j5);
            }
            zzaz(j6);
            return true;
        } else if (zzbe != 2 || j2 == this.zzs) {
            return false;
        } else {
            long nanoTime2 = System.nanoTime();
            long zza = this.zzf.zza((j6 * 1000) + nanoTime2);
            long j8 = (zza - nanoTime2) / 1000;
            long j9 = this.zzt;
            if (j8 < -500000 && !z2 && (zzd2 = zzd(j2)) != 0) {
                if (j9 != -9223372036854775807L) {
                    zzgm zzgmVar = ((zzqj) this).zza;
                    zzgmVar.zzd += zzd2;
                    zzgmVar.zzf += this.zzx;
                } else {
                    ((zzqj) this).zza.zzj++;
                    zzay(zzd2, this.zzx);
                }
                zzas();
                return false;
            } else if (zzaG(j8) && !z2) {
                if (j9 != -9223372036854775807L) {
                    zzax(zzqeVar, i2, j5);
                    z3 = true;
                } else {
                    int i5 = zzeg.zza;
                    Trace.beginSection("dropVideoBuffer");
                    zzqeVar.zzn(i2, false);
                    Trace.endSection();
                    z3 = true;
                    zzay(0, 1);
                }
                zzaz(j8);
                return z3;
            } else if (zzeg.zza >= 21) {
                if (j8 < 50000) {
                    zzaw(zzqeVar, i2, j5, zza);
                    zzaz(j8);
                    return true;
                }
                return false;
            } else if (j8 < 30000) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep(((-10000) + j8) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                zzab(zzqeVar, i2, j5);
                zzaz(j8);
                return true;
            } else {
                return false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final zzqf zzak(Throwable th, zzqg zzqgVar) {
        return new zzwv(th, zzqgVar, this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzam(zzgc zzgcVar) {
        if (this.zzk) {
            ByteBuffer byteBuffer = zzgcVar.zze;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zzqe zzaj = zzaj();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzaj.zzp(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzao(long j2) {
        super.zzao(j2);
        this.zzx--;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzaq() {
        super.zzaq();
        this.zzx = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final boolean zzau(zzqg zzqgVar) {
        return this.zzl != null || zzaH(zzqgVar);
    }

    public final void zzaw(zzqe zzqeVar, int i2, long j2, long j3) {
        zzaD();
        int i3 = zzeg.zza;
        Trace.beginSection("releaseOutputBuffer");
        zzqeVar.zzm(i2, j3);
        Trace.endSection();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        ((zzqj) this).zza.zze++;
        this.zzw = 0;
        zzU();
    }

    public final void zzax(zzqe zzqeVar, int i2, long j2) {
        int i3 = zzeg.zza;
        Trace.beginSection("skipVideoBuffer");
        zzqeVar.zzn(i2, false);
        Trace.endSection();
        ((zzqj) this).zza.zzf++;
    }

    public final void zzay(int i2, int i3) {
        zzgm zzgmVar = ((zzqj) this).zza;
        zzgmVar.zzh += i2;
        int i4 = i2 + i3;
        zzgmVar.zzg += i4;
        this.zzv += i4;
        int i5 = this.zzw + i4;
        this.zzw = i5;
        zzgmVar.zzi = Math.max(i5, zzgmVar.zzi);
    }

    public final void zzaz(long j2) {
        zzgm zzgmVar = ((zzqj) this).zza;
        zzgmVar.zzk += j2;
        zzgmVar.zzl++;
        this.zzA += j2;
        this.zzB++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zzgl, com.google.android.gms.internal.ads.zzjq
    public final void zzp(int i2, Object obj) {
        if (i2 != 1) {
            if (i2 == 7) {
                this.zzI = (zzwy) obj;
                return;
            } else if (i2 == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.zzH != intValue) {
                    this.zzH = intValue;
                    return;
                }
                return;
            } else if (i2 != 4) {
                if (i2 != 5) {
                    return;
                }
                this.zzf.zzj(((Integer) obj).intValue());
                return;
            } else {
                int intValue2 = ((Integer) obj).intValue();
                this.zzo = intValue2;
                zzqe zzaj = zzaj();
                if (zzaj != null) {
                    zzaj.zzq(intValue2);
                    return;
                }
                return;
            }
        }
        zzws zzwsVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzwsVar == null) {
            zzws zzwsVar2 = this.zzm;
            if (zzwsVar2 != null) {
                zzwsVar = zzwsVar2;
            } else {
                zzqg zzal = zzal();
                if (zzal != null && zzaH(zzal)) {
                    zzwsVar = zzws.zza(this.zze, zzal.zzf);
                    this.zzm = zzwsVar;
                }
            }
        }
        if (this.zzl != zzwsVar) {
            this.zzl = zzwsVar;
            this.zzf.zzi(zzwsVar);
            this.zzn = false;
            int zzbe = zzbe();
            zzqe zzaj2 = zzaj();
            if (zzaj2 != null) {
                if (zzeg.zza >= 23 && zzwsVar != null && !this.zzj) {
                    zzaj2.zzo(zzwsVar);
                } else {
                    zzap();
                    zzan();
                }
            }
            if (zzwsVar != null && zzwsVar != this.zzm) {
                zzaE();
                this.zzp = false;
                int i3 = zzeg.zza;
                if (zzbe == 2) {
                    this.zzt = -9223372036854775807L;
                    return;
                }
                return;
            }
            this.zzG = null;
            this.zzp = false;
            int i4 = zzeg.zza;
        } else if (zzwsVar == null || zzwsVar == this.zzm) {
        } else {
            zzaE();
            if (this.zzn) {
                this.zzg.zzq(this.zzl);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzgl
    public final void zzs() {
        this.zzG = null;
        this.zzp = false;
        int i2 = zzeg.zza;
        this.zzn = false;
        try {
            super.zzs();
        } finally {
            this.zzg.zzc(((zzqj) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzgl
    public final void zzt(boolean z, boolean z2) {
        super.zzt(z, z2);
        zzk();
        this.zzg.zze(((zzqj) this).zza);
        this.zzq = z2;
        this.zzr = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzgl
    public final void zzu(long j2, boolean z) {
        super.zzu(j2, z);
        this.zzp = false;
        int i2 = zzeg.zza;
        this.zzf.zzf();
        this.zzy = -9223372036854775807L;
        this.zzs = -9223372036854775807L;
        this.zzw = 0;
        this.zzt = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzgl
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzm != null) {
                zzaF();
            }
        } catch (Throwable th) {
            if (this.zzm != null) {
                zzaF();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    public final void zzw() {
        this.zzv = 0;
        this.zzu = SystemClock.elapsedRealtime();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zzA = 0L;
        this.zzB = 0;
        this.zzf.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    public final void zzx() {
        this.zzt = -9223372036854775807L;
        if (this.zzv > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzv, elapsedRealtime - this.zzu);
            this.zzv = 0;
            this.zzu = elapsedRealtime;
        }
        int i2 = this.zzB;
        if (i2 != 0) {
            this.zzg.zzr(this.zzA, i2);
            this.zzA = 0L;
            this.zzB = 0;
        }
        this.zzf.zzh();
    }
}
