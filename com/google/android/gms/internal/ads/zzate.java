package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzate extends zzavq implements zzazc {
    private final zzaso zzb;
    private final zzata zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private boolean zzh;

    public zzate(zzavs zzavsVar, zzats zzatsVar, boolean z, Handler handler, zzasp zzaspVar) {
        super(1, zzavsVar, null, true);
        this.zzc = new zzata(null, new zzash[0], new zzatd(this, null));
        this.zzb = new zzaso(handler, zzaspVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarx
    public final boolean zzE() {
        return super.zzE() && this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarx
    public final boolean zzF() {
        return this.zzc.zzn() || super.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final int zzH(zzavs zzavsVar, zzars zzarsVar) {
        int i2;
        int i3;
        String str = zzarsVar.zzf;
        if (zzazd.zza(str)) {
            int i4 = zzazn.zza;
            int i5 = i4 >= 21 ? 16 : 0;
            zzavo zzc = zzawa.zzc(str, false);
            if (zzc == null) {
                return 1;
            }
            int i6 = 2;
            if (i4 < 21 || (((i2 = zzarsVar.zzs) == -1 || zzc.zzd(i2)) && ((i3 = zzarsVar.zzr) == -1 || zzc.zzc(i3)))) {
                i6 = 3;
            }
            return i5 | 4 | i6;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final long zzI() {
        long zza = this.zzc.zza(zzE());
        if (zza != Long.MIN_VALUE) {
            if (!this.zzh) {
                zza = Math.max(this.zzg, zza);
            }
            this.zzg = zza;
            this.zzh = false;
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final zzarw zzJ() {
        return this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final zzarw zzK(zzarw zzarwVar) {
        return this.zzc.zzd(zzarwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final zzavo zzM(zzavs zzavsVar, zzars zzarsVar, boolean z) {
        return super.zzM(zzavsVar, zzarsVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r4.startsWith("heroqlte") == false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzavq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzO(com.google.android.gms.internal.ads.zzavo r4, android.media.MediaCodec r5, com.google.android.gms.internal.ads.zzars r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.zza
            int r7 = com.google.android.gms.internal.ads.zzazn.zza
            r0 = 1
            r1 = 0
            r2 = 24
            if (r7 >= r2) goto L37
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.zzazn.zzc
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.zzazn.zzb
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L38
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L38
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L37
            goto L38
        L37:
            r0 = 0
        L38:
            r3.zzd = r0
            android.media.MediaFormat r4 = r6.zzb()
            r6 = 0
            r5.configure(r4, r6, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzate.zzO(com.google.android.gms.internal.ads.zzavo, android.media.MediaCodec, com.google.android.gms.internal.ads.zzars, android.media.MediaCrypto):void");
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzP(String str, long j2, long j3) {
        this.zzb.zzd(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzQ(zzars zzarsVar) {
        super.zzQ(zzarsVar);
        this.zzb.zzg(zzarsVar);
        this.zze = "audio/raw".equals(zzarsVar.zzf) ? zzarsVar.zzt : 2;
        this.zzf = zzarsVar.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i2;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.zzd && integer == 6) {
            int i3 = this.zzf;
            if (i3 < 6) {
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < this.zzf; i4++) {
                    iArr2[i4] = i4;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i2 = 6;
        } else {
            i2 = integer;
            iArr = null;
        }
        try {
            this.zzc.zze("audio/raw", i2, integer2, this.zze, 0, iArr);
        } catch (zzasu e2) {
            throw zzare.zza(e2, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final void zzS() {
        try {
            this.zzc.zzi();
        } catch (zzasz e2) {
            throw zzare.zza(e2, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavq
    public final boolean zzT(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z) {
        if (z) {
            mediaCodec.releaseOutputBuffer(i2, false);
            ((zzavq) this).zza.zze++;
            this.zzc.zzf();
            return true;
        }
        try {
            if (this.zzc.zzm(byteBuffer, j4)) {
                mediaCodec.releaseOutputBuffer(i2, false);
                ((zzavq) this).zza.zzd++;
                return true;
            }
            return false;
        } catch (zzasv | zzasz e2) {
            throw zzare.zza(e2, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarc, com.google.android.gms.internal.ads.zzarx
    public final zzazc zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzarc, com.google.android.gms.internal.ads.zzarg
    public final void zzl(int i2, Object obj) {
        if (i2 != 2) {
            return;
        }
        this.zzc.zzl(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarc
    public final void zzn() {
        try {
            this.zzc.zzj();
            try {
                super.zzn();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzn();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarc
    public final void zzo(boolean z) {
        super.zzo(z);
        this.zzb.zzf(((zzavq) this).zza);
        int i2 = zzg().zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavq, com.google.android.gms.internal.ads.zzarc
    public final void zzp(long j2, boolean z) {
        super.zzp(j2, z);
        this.zzc.zzk();
        this.zzg = j2;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void zzq() {
        this.zzc.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void zzr() {
        this.zzc.zzg();
    }
}
