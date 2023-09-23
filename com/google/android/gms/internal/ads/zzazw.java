package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.arthenica.ffmpegkit.StreamInformation;
import f.a.b.a.a;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzazw extends zzavq {
    private int zzA;
    private final Context zzb;
    private final zzazy zzc;
    private final zzbag zzd;
    private final boolean zze;
    private final long[] zzf;
    private zzars[] zzg;
    private zzazv zzh;
    private Surface zzi;
    private Surface zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private float zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private float zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private float zzy;
    private long zzz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzazw(Context context, zzavs zzavsVar, long j2, Handler handler, zzbah zzbahVar, int i2) {
        super(2, zzavsVar, null, false);
        boolean z = false;
        this.zzb = context.getApplicationContext();
        this.zzc = new zzazy(context);
        this.zzd = new zzbag(handler, zzbahVar);
        if (zzazn.zza <= 22 && "foster".equals(zzazn.zzb) && "NVIDIA".equals(zzazn.zzc)) {
            z = true;
        }
        this.zze = z;
        this.zzf = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        zzab();
    }

    private static int zzN(zzars zzarsVar) {
        int i2 = zzarsVar.zzm;
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    private final void zzab() {
        this.zzv = -1;
        this.zzw = -1;
        this.zzy = -1.0f;
        this.zzx = -1;
    }

    private final void zzac() {
        if (this.zzn > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzd.zzd(this.zzn, elapsedRealtime - this.zzm);
            this.zzn = 0;
            this.zzm = elapsedRealtime;
        }
    }

    private final void zzad() {
        int i2 = this.zzv;
        int i3 = this.zzr;
        if (i2 == i3 && this.zzw == this.zzs && this.zzx == this.zzt && this.zzy == this.zzu) {
            return;
        }
        this.zzd.zzh(i3, this.zzs, this.zzt, this.zzu);
        this.zzv = this.zzr;
        this.zzw = this.zzs;
        this.zzx = this.zzt;
        this.zzy = this.zzu;
    }

    private final void zzae() {
        if (this.zzv == -1 && this.zzw == -1) {
            return;
        }
        this.zzd.zzh(this.zzr, this.zzs, this.zzt, this.zzu);
    }

    private static boolean zzaf(long j2) {
        return j2 < -30000;
    }

    private final boolean zzag(boolean z) {
        return zzazn.zza >= 23 && (!z || zzazt.zzb(this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarx
    public final boolean zzF() {
        Surface surface;
        if (super.zzF() && (this.zzk || (((surface = this.zzj) != null && this.zzi == surface) || zzU() == null))) {
            this.zzl = -9223372036854775807L;
            return true;
        } else if (this.zzl == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzl) {
                return true;
            }
            this.zzl = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final int zzH(zzavs zzavsVar, zzars zzarsVar) {
        boolean z;
        int i2;
        int i3;
        String str = zzarsVar.zzf;
        if (zzazd.zzb(str)) {
            zzatr zzatrVar = zzarsVar.zzi;
            if (zzatrVar != null) {
                z = false;
                for (int i4 = 0; i4 < zzatrVar.zza; i4++) {
                    z |= zzatrVar.zza(i4).zzc;
                }
            } else {
                z = false;
            }
            zzavo zzc = zzawa.zzc(str, z);
            if (zzc == null) {
                return 1;
            }
            boolean zze = zzc.zze(zzarsVar.zzc);
            if (zze && (i2 = zzarsVar.zzj) > 0 && (i3 = zzarsVar.zzk) > 0) {
                if (zzazn.zza >= 21) {
                    zze = zzc.zzf(i2, i3, zzarsVar.zzl);
                } else {
                    zze = i2 * i3 <= zzawa.zza();
                    if (!zze) {
                        int i5 = zzarsVar.zzj;
                        int i6 = zzarsVar.zzk;
                        String str2 = zzazn.zze;
                        StringBuilder C = a.C("FalseCheck [legacyFrameSize, ", i5, "x", i6, "] [");
                        C.append(str2);
                        C.append("]");
                        Log.d("MediaCodecVideoRenderer", C.toString());
                    }
                }
            }
            return (true != zze ? 2 : 3) | (true != zzc.zzb ? 4 : 8) | (true == zzc.zzc ? 16 : 0);
        }
        return 0;
    }

    public final void zzI() {
        if (this.zzk) {
            return;
        }
        this.zzk = true;
        this.zzd.zzg(this.zzi);
    }

    public final void zzJ(MediaCodec mediaCodec, int i2, long j2) {
        zzad();
        zzazl.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i2, true);
        zzazl.zzb();
        ((zzavq) this).zza.zzd++;
        this.zzo = 0;
        zzI();
    }

    public final void zzK(MediaCodec mediaCodec, int i2, long j2, long j3) {
        zzad();
        zzazl.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i2, j3);
        zzazl.zzb();
        ((zzavq) this).zza.zzd++;
        this.zzo = 0;
        zzI();
    }

    public final void zzL(MediaCodec mediaCodec, int i2, long j2) {
        zzazl.zza("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i2, false);
        zzazl.zzb();
        ((zzavq) this).zza.zze++;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzO(zzavo zzavoVar, MediaCodec mediaCodec, zzars zzarsVar, MediaCrypto mediaCrypto) {
        char c;
        int i2;
        zzars[] zzarsVarArr = this.zzg;
        int i3 = zzarsVar.zzj;
        int i4 = zzarsVar.zzk;
        int i5 = zzarsVar.zzg;
        if (i5 == -1) {
            String str = zzarsVar.zzf;
            if (i3 != -1 && i4 != -1) {
                int i6 = 4;
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
                    if (c != 2) {
                        if (c != 3) {
                            if (c == 4 || c == 5) {
                                i2 = i3 * i4;
                                i5 = (i2 * 3) / (i6 + i6);
                            }
                        }
                    } else if (!"BRAVIA 4K 2015".equals(zzazn.zzd)) {
                        i2 = zzazn.zzd(i4, 16) * zzazn.zzd(i3, 16) * 256;
                        i6 = 2;
                        i5 = (i2 * 3) / (i6 + i6);
                    }
                }
                i2 = i3 * i4;
                i6 = 2;
                i5 = (i2 * 3) / (i6 + i6);
            }
            i5 = -1;
        }
        int length = zzarsVarArr.length;
        zzazv zzazvVar = new zzazv(i3, i4, i5);
        this.zzh = zzazvVar;
        boolean z = this.zze;
        MediaFormat zzb = zzarsVar.zzb();
        zzb.setInteger("max-width", zzazvVar.zza);
        zzb.setInteger("max-height", zzazvVar.zzb);
        int i7 = zzazvVar.zzc;
        if (i7 != -1) {
            zzb.setInteger("max-input-size", i7);
        }
        if (z) {
            zzb.setInteger("auto-frc", 0);
        }
        if (this.zzi == null) {
            zzayy.zze(zzag(zzavoVar.zzd));
            if (this.zzj == null) {
                this.zzj = zzazt.zza(this.zzb, zzavoVar.zzd);
            }
            this.zzi = this.zzj;
        }
        mediaCodec.configure(zzb, this.zzi, (MediaCrypto) null, 0);
        int i8 = zzazn.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzP(String str, long j2, long j3) {
        this.zzd.zzb(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzQ(zzars zzarsVar) {
        super.zzQ(zzarsVar);
        this.zzd.zzf(zzarsVar);
        float f2 = zzarsVar.zzn;
        if (f2 == -1.0f) {
            f2 = 1.0f;
        }
        this.zzq = f2;
        this.zzp = zzN(zzarsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger(StreamInformation.KEY_WIDTH);
        }
        this.zzr = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger(StreamInformation.KEY_HEIGHT);
        }
        this.zzs = integer2;
        float f2 = this.zzq;
        this.zzu = f2;
        if (zzazn.zza >= 21) {
            int i2 = this.zzp;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.zzr;
                this.zzr = integer2;
                this.zzs = i3;
                this.zzu = 1.0f / f2;
            }
        } else {
            this.zzt = this.zzp;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final boolean zzT(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z) {
        while (true) {
            int i4 = this.zzA;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.zzf;
            long j5 = jArr[0];
            if (j4 < j5) {
                break;
            }
            this.zzz = j5;
            int i5 = i4 - 1;
            this.zzA = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j6 = j4 - this.zzz;
        if (z) {
            zzL(mediaCodec, i2, j6);
            return true;
        }
        long j7 = j4 - j2;
        if (this.zzi == this.zzj) {
            if (zzaf(j7)) {
                zzL(mediaCodec, i2, j6);
                return true;
            }
            return false;
        } else if (!this.zzk) {
            if (zzazn.zza >= 21) {
                zzK(mediaCodec, i2, j6, System.nanoTime());
            } else {
                zzJ(mediaCodec, i2, j6);
            }
            return true;
        } else if (zzb() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long zza = this.zzc.zza(j4, ((j7 - ((elapsedRealtime * 1000) - j3)) * 1000) + nanoTime);
            long j8 = (zza - nanoTime) / 1000;
            if (zzaf(j8)) {
                zzazl.zza("dropVideoBuffer");
                mediaCodec.releaseOutputBuffer(i2, false);
                zzazl.zzb();
                zzatm zzatmVar = ((zzavq) this).zza;
                zzatmVar.zzf++;
                this.zzn++;
                int i6 = this.zzo + 1;
                this.zzo = i6;
                zzatmVar.zzg = Math.max(i6, zzatmVar.zzg);
                if (this.zzn == -1) {
                    zzac();
                }
                return true;
            }
            if (zzazn.zza >= 21) {
                if (j8 < 50000) {
                    zzK(mediaCodec, i2, j6, zza);
                    return true;
                }
            } else if (j8 < 30000) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep((j8 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                zzJ(mediaCodec, i2, j6);
                return true;
            }
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzX(zzatn zzatnVar) {
        int i2 = zzazn.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzY() {
        try {
            super.zzY();
        } finally {
            Surface surface = this.zzj;
            if (surface != null) {
                if (this.zzi == surface) {
                    this.zzi = null;
                }
                surface.release();
                this.zzj = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final boolean zzZ(MediaCodec mediaCodec, boolean z, zzars zzarsVar, zzars zzarsVar2) {
        if (zzarsVar.zzf.equals(zzarsVar2.zzf) && zzN(zzarsVar) == zzN(zzarsVar2)) {
            if (z || (zzarsVar.zzj == zzarsVar2.zzj && zzarsVar.zzk == zzarsVar2.zzk)) {
                int i2 = zzarsVar2.zzj;
                zzazv zzazvVar = this.zzh;
                return i2 <= zzazvVar.zza && zzarsVar2.zzk <= zzazvVar.zzb && zzarsVar2.zzg <= zzazvVar.zzc;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final boolean zzaa(zzavo zzavoVar) {
        return this.zzi != null || zzag(zzavoVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzarc, com.google.android.gms.internal.ads.zzarg
    public final void zzl(int i2, Object obj) {
        if (i2 == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.zzj;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    zzavo zzV = zzV();
                    if (zzV != null && zzag(zzV.zzd)) {
                        surface = zzazt.zza(this.zzb, zzV.zzd);
                        this.zzj = surface;
                    }
                }
            }
            if (this.zzi != surface) {
                this.zzi = surface;
                int zzb = zzb();
                if (zzb == 1 || zzb == 2) {
                    MediaCodec zzU = zzU();
                    if (zzazn.zza >= 23 && zzU != null && surface != null) {
                        zzU.setOutputSurface(surface);
                    } else {
                        zzY();
                        zzW();
                    }
                }
                if (surface != null && surface != this.zzj) {
                    zzae();
                    this.zzk = false;
                    int i3 = zzazn.zza;
                    if (zzb == 2) {
                        this.zzl = -9223372036854775807L;
                        return;
                    }
                    return;
                }
                zzab();
                this.zzk = false;
                int i4 = zzazn.zza;
            } else if (surface == null || surface == this.zzj) {
            } else {
                zzae();
                if (this.zzk) {
                    this.zzd.zzg(this.zzi);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarc
    public final void zzn() {
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        this.zzz = -9223372036854775807L;
        this.zzA = 0;
        zzab();
        this.zzk = false;
        int i2 = zzazn.zza;
        this.zzc.zzb();
        try {
            super.zzn();
        } finally {
            ((zzavq) this).zza.zza();
            this.zzd.zzc(((zzavq) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarc
    public final void zzo(boolean z) {
        super.zzo(z);
        int i2 = zzg().zzb;
        this.zzd.zze(((zzavq) this).zza);
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarc
    public final void zzp(long j2, boolean z) {
        super.zzp(j2, z);
        this.zzk = false;
        int i2 = zzazn.zza;
        this.zzo = 0;
        int i3 = this.zzA;
        if (i3 != 0) {
            this.zzz = this.zzf[i3 - 1];
            this.zzA = 0;
        }
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void zzq() {
        this.zzn = 0;
        this.zzm = SystemClock.elapsedRealtime();
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void zzr() {
        zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void zzs(zzars[] zzarsVarArr, long j2) {
        this.zzg = zzarsVarArr;
        if (this.zzz == -9223372036854775807L) {
            this.zzz = j2;
            return;
        }
        int i2 = this.zzA;
        if (i2 == 10) {
            long j3 = this.zzf[9];
            Log.w("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + j3);
        } else {
            this.zzA = i2 + 1;
        }
        this.zzf[this.zzA - 1] = j2;
    }
}
