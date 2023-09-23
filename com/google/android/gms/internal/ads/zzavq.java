package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.arthenica.ffmpegkit.StreamInformation;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzavq extends zzarc {
    private static final byte[] zzb = zzazn.zzp("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    public zzatm zza;
    private final zzavs zzc;
    private final zzatn zzd;
    private final zzatn zze;
    private final zzart zzf;
    private final List zzg;
    private final MediaCodec.BufferInfo zzh;
    private zzars zzi;
    private MediaCodec zzj;
    private zzavo zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private ByteBuffer[] zzu;
    private ByteBuffer[] zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    public zzavq(int i2, zzavs zzavsVar, zzats zzatsVar, boolean z) {
        super(i2);
        zzayy.zze(zzazn.zza >= 16);
        this.zzc = zzavsVar;
        this.zzd = new zzatn(0);
        this.zze = new zzatn(0);
        this.zzf = new zzart();
        this.zzg = new ArrayList();
        this.zzh = new MediaCodec.BufferInfo();
        this.zzB = 0;
        this.zzC = 0;
    }

    private final void zzI() {
        if (this.zzC == 2) {
            zzY();
            zzW();
            return;
        }
        this.zzG = true;
        zzS();
    }

    private final boolean zzJ() {
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec == null || this.zzC == 2 || this.zzF) {
            return false;
        }
        if (this.zzx < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.zzx = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            zzatn zzatnVar = this.zzd;
            zzatnVar.zzb = this.zzu[dequeueInputBuffer];
            zzatnVar.zzb();
        }
        if (this.zzC == 1) {
            if (!this.zzo) {
                this.zzE = true;
                this.zzj.queueInputBuffer(this.zzx, 0, 0, 0L, 4);
                this.zzx = -1;
            }
            this.zzC = 2;
            return false;
        } else if (this.zzs) {
            this.zzs = false;
            ByteBuffer byteBuffer = this.zzd.zzb;
            byte[] bArr = zzb;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.zzj;
            int i2 = this.zzx;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i2, 0, 38, 0L, 0);
            this.zzx = -1;
            this.zzD = true;
            return true;
        } else {
            if (this.zzB == 1) {
                for (int i3 = 0; i3 < this.zzi.zzh.size(); i3++) {
                    this.zzd.zzb.put((byte[]) this.zzi.zzh.get(i3));
                }
                this.zzB = 2;
            }
            int position = this.zzd.zzb.position();
            int zzd = zzd(this.zzf, this.zzd, false);
            if (zzd == -3) {
                return false;
            }
            if (zzd == -5) {
                if (this.zzB == 2) {
                    this.zzd.zzb();
                    this.zzB = 1;
                }
                zzQ(this.zzf.zza);
                return true;
            }
            zzatn zzatnVar2 = this.zzd;
            if (zzatnVar2.zzf()) {
                if (this.zzB == 2) {
                    zzatnVar2.zzb();
                    this.zzB = 1;
                }
                this.zzF = true;
                if (!this.zzD) {
                    zzI();
                    return false;
                }
                try {
                    if (!this.zzo) {
                        this.zzE = true;
                        this.zzj.queueInputBuffer(this.zzx, 0, 0, 0L, 4);
                        this.zzx = -1;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e2) {
                    throw zzare.zza(e2, zza());
                }
            } else if (this.zzH && !zzatnVar2.zzg()) {
                zzatnVar2.zzb();
                if (this.zzB == 2) {
                    this.zzB = 1;
                }
                return true;
            } else {
                this.zzH = false;
                boolean zzi = zzatnVar2.zzi();
                if (this.zzl && !zzi) {
                    ByteBuffer byteBuffer2 = zzatnVar2.zzb;
                    byte[] bArr2 = zzaze.zza;
                    int position2 = byteBuffer2.position();
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        int i6 = i4 + 1;
                        if (i6 < position2) {
                            int i7 = byteBuffer2.get(i4) & 255;
                            if (i5 == 3) {
                                if (i7 == 1) {
                                    if ((byteBuffer2.get(i6) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer2.duplicate();
                                        duplicate.position(i4 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer2.position(0);
                                        byteBuffer2.put(duplicate);
                                        break;
                                    }
                                    i7 = 1;
                                }
                            } else if (i7 == 0) {
                                i5++;
                            }
                            if (i7 != 0) {
                                i5 = 0;
                            }
                            i4 = i6;
                        } else {
                            byteBuffer2.clear();
                            break;
                        }
                    }
                    if (this.zzd.zzb.position() == 0) {
                        return true;
                    }
                    this.zzl = false;
                }
                try {
                    zzatn zzatnVar3 = this.zzd;
                    long j2 = zzatnVar3.zzc;
                    if (zzatnVar3.zze()) {
                        this.zzg.add(Long.valueOf(j2));
                    }
                    this.zzd.zzb.flip();
                    zzX(this.zzd);
                    if (zzi) {
                        MediaCodec.CryptoInfo zza = this.zzd.zza.zza();
                        if (position != 0) {
                            if (zza.numBytesOfClearData == null) {
                                zza.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = zza.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.zzj.queueSecureInputBuffer(this.zzx, 0, zza, j2, 0);
                    } else {
                        this.zzj.queueInputBuffer(this.zzx, 0, this.zzd.zzb.limit(), j2, 0);
                    }
                    this.zzx = -1;
                    this.zzD = true;
                    this.zzB = 0;
                    this.zza.zzc++;
                    return true;
                } catch (MediaCodec.CryptoException e3) {
                    throw zzare.zza(e3, zza());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzD(long j2, long j3) {
        boolean zzT;
        int dequeueOutputBuffer;
        boolean z;
        if (this.zzG) {
            zzS();
            return;
        }
        if (this.zzi == null) {
            this.zze.zzb();
            int zzd = zzd(this.zzf, this.zze, true);
            if (zzd != -5) {
                if (zzd == -4) {
                    zzayy.zze(this.zze.zzf());
                    this.zzF = true;
                    zzI();
                    return;
                }
                return;
            }
            zzQ(this.zzf.zza);
        }
        zzW();
        if (this.zzj != null) {
            zzazl.zza("drainAndFeed");
            while (true) {
                if (this.zzy < 0) {
                    if (this.zzq && this.zzE) {
                        try {
                            dequeueOutputBuffer = this.zzj.dequeueOutputBuffer(this.zzh, 0L);
                            this.zzy = dequeueOutputBuffer;
                        } catch (IllegalStateException unused) {
                            zzI();
                            if (this.zzG) {
                                zzY();
                            }
                        }
                    } else {
                        dequeueOutputBuffer = this.zzj.dequeueOutputBuffer(this.zzh, 0L);
                        this.zzy = dequeueOutputBuffer;
                    }
                    if (dequeueOutputBuffer >= 0) {
                        if (this.zzt) {
                            this.zzt = false;
                            this.zzj.releaseOutputBuffer(dequeueOutputBuffer, false);
                            this.zzy = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.zzh;
                            if ((bufferInfo.flags & 4) != 0) {
                                zzI();
                                this.zzy = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.zzv[this.zzy];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.zzh;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j4 = this.zzh.presentationTimeUs;
                            int size = this.zzg.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    z = false;
                                    break;
                                } else if (((Long) this.zzg.get(i2)).longValue() == j4) {
                                    this.zzg.remove(i2);
                                    z = true;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            this.zzz = z;
                        }
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.zzj.getOutputFormat();
                        if (this.zzn && outputFormat.getInteger(StreamInformation.KEY_WIDTH) == 32 && outputFormat.getInteger(StreamInformation.KEY_HEIGHT) == 32) {
                            this.zzt = true;
                        } else {
                            if (this.zzr) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            zzR(this.zzj, outputFormat);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.zzv = this.zzj.getOutputBuffers();
                    } else if (this.zzo && (this.zzF || this.zzC == 2)) {
                        zzI();
                    }
                }
                if (this.zzq && this.zzE) {
                    try {
                        MediaCodec mediaCodec = this.zzj;
                        ByteBuffer[] byteBufferArr = this.zzv;
                        int i3 = this.zzy;
                        ByteBuffer byteBuffer2 = byteBufferArr[i3];
                        MediaCodec.BufferInfo bufferInfo3 = this.zzh;
                        zzT = zzT(j2, j3, mediaCodec, byteBuffer2, i3, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.zzz);
                    } catch (IllegalStateException unused2) {
                        zzI();
                        if (this.zzG) {
                            zzY();
                        }
                    }
                } else {
                    MediaCodec mediaCodec2 = this.zzj;
                    ByteBuffer[] byteBufferArr2 = this.zzv;
                    int i4 = this.zzy;
                    ByteBuffer byteBuffer3 = byteBufferArr2[i4];
                    MediaCodec.BufferInfo bufferInfo4 = this.zzh;
                    zzT = zzT(j2, j3, mediaCodec2, byteBuffer3, i4, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.zzz);
                }
                if (!zzT) {
                    break;
                }
                long j5 = this.zzh.presentationTimeUs;
                this.zzy = -1;
            }
            do {
            } while (zzJ());
            zzazl.zzb();
        } else {
            zzx(j2);
            this.zze.zzb();
            int zzd2 = zzd(this.zzf, this.zze, false);
            if (zzd2 == -5) {
                zzQ(this.zzf.zza);
            } else if (zzd2 == -4) {
                zzayy.zze(this.zze.zzf());
                this.zzF = true;
                zzI();
            }
        }
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public boolean zzE() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public boolean zzF() {
        if (this.zzi != null) {
            if (zzC() || this.zzy >= 0) {
                return true;
            }
            if (this.zzw != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzw) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final int zzG(zzars zzarsVar) {
        try {
            return zzH(this.zzc, zzarsVar);
        } catch (zzavv e2) {
            throw zzare.zza(e2, zza());
        }
    }

    public abstract int zzH(zzavs zzavsVar, zzars zzarsVar);

    public zzavo zzM(zzavs zzavsVar, zzars zzarsVar, boolean z) {
        return zzawa.zzc(zzarsVar.zzf, false);
    }

    public abstract void zzO(zzavo zzavoVar, MediaCodec mediaCodec, zzars zzarsVar, MediaCrypto mediaCrypto);

    public void zzP(String str, long j2, long j3) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r6.zzk == r0.zzk) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzQ(com.google.android.gms.internal.ads.zzars r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzars r0 = r5.zzi
            r5.zzi = r6
            com.google.android.gms.internal.ads.zzatr r6 = r6.zzi
            if (r0 != 0) goto La
            r1 = 0
            goto Lc
        La:
            com.google.android.gms.internal.ads.zzatr r1 = r0.zzi
        Lc:
            boolean r6 = com.google.android.gms.internal.ads.zzazn.zzo(r6, r1)
            if (r6 != 0) goto L29
            com.google.android.gms.internal.ads.zzars r6 = r5.zzi
            com.google.android.gms.internal.ads.zzatr r6 = r6.zzi
            if (r6 != 0) goto L19
            goto L29
        L19:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.zza()
            com.google.android.gms.internal.ads.zzare r6 = com.google.android.gms.internal.ads.zzare.zza(r6, r0)
            throw r6
        L29:
            android.media.MediaCodec r6 = r5.zzj
            r1 = 1
            if (r6 == 0) goto L56
            com.google.android.gms.internal.ads.zzavo r2 = r5.zzk
            boolean r2 = r2.zzb
            com.google.android.gms.internal.ads.zzars r3 = r5.zzi
            boolean r6 = r5.zzZ(r6, r2, r0, r3)
            if (r6 == 0) goto L56
            r5.zzA = r1
            r5.zzB = r1
            boolean r6 = r5.zzn
            r2 = 0
            if (r6 == 0) goto L52
            com.google.android.gms.internal.ads.zzars r6 = r5.zzi
            int r3 = r6.zzj
            int r4 = r0.zzj
            if (r3 != r4) goto L52
            int r6 = r6.zzk
            int r0 = r0.zzk
            if (r6 != r0) goto L52
            goto L53
        L52:
            r1 = 0
        L53:
            r5.zzs = r1
            return
        L56:
            boolean r6 = r5.zzD
            if (r6 == 0) goto L5d
            r5.zzC = r1
            return
        L5d:
            r5.zzY()
            r5.zzW()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavq.zzQ(com.google.android.gms.internal.ads.zzars):void");
    }

    public void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        throw null;
    }

    public void zzS() {
    }

    public abstract boolean zzT(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z);

    public final MediaCodec zzU() {
        return this.zzj;
    }

    public final zzavo zzV() {
        return this.zzk;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzW() {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavq.zzW():void");
    }

    public void zzX(zzatn zzatnVar) {
    }

    public void zzY() {
        this.zzw = -9223372036854775807L;
        this.zzx = -1;
        this.zzy = -1;
        this.zzz = false;
        this.zzg.clear();
        this.zzu = null;
        this.zzv = null;
        this.zzk = null;
        this.zzA = false;
        this.zzD = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = false;
        this.zzp = false;
        this.zzr = false;
        this.zzs = false;
        this.zzt = false;
        this.zzE = false;
        this.zzB = 0;
        this.zzC = 0;
        this.zzd.zzb = null;
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec != null) {
            this.zza.zzb++;
            try {
                mediaCodec.stop();
                try {
                    this.zzj.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.zzj.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    public boolean zzZ(MediaCodec mediaCodec, boolean z, zzars zzarsVar, zzars zzarsVar2) {
        return false;
    }

    public boolean zzaa(zzavo zzavoVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzarc, com.google.android.gms.internal.ads.zzary
    public final int zze() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public void zzn() {
        this.zzi = null;
        zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public void zzo(boolean z) {
        this.zza = new zzatm();
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public void zzp(long j2, boolean z) {
        this.zzF = false;
        this.zzG = false;
        if (this.zzj != null) {
            this.zzw = -9223372036854775807L;
            this.zzx = -1;
            this.zzy = -1;
            this.zzH = true;
            this.zzz = false;
            this.zzg.clear();
            this.zzs = false;
            this.zzt = false;
            if (!this.zzm && (!this.zzp || !this.zzE)) {
                if (this.zzC != 0) {
                    zzY();
                    zzW();
                } else {
                    this.zzj.flush();
                    this.zzD = false;
                }
            } else {
                zzY();
                zzW();
            }
            if (!this.zzA || this.zzi == null) {
                return;
            }
            this.zzB = 1;
        }
    }
}
