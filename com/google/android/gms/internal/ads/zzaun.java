package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.firebase.FirebaseError;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import f.a.b.a.a;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaun implements zzatv {
    public static final zzatx zza = new zzaui();
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID zzd = new UUID(72057594037932032L, -9223371306706625679L);
    private boolean zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private zzazb zzE;
    private zzazb zzF;
    private boolean zzG;
    private int zzH;
    private long zzI;
    private long zzJ;
    private int zzK;
    private int zzL;
    private int[] zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private byte zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    private boolean zzaa;
    private zzatw zzab;
    private final zzauh zzac;
    private final zzaup zze;
    private final SparseArray zzf;
    private final boolean zzg;
    private final zzazg zzh;
    private final zzazg zzi;
    private final zzazg zzj;
    private final zzazg zzk;
    private final zzazg zzl;
    private final zzazg zzm;
    private final zzazg zzn;
    private final zzazg zzo;
    private final zzazg zzp;
    private ByteBuffer zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private zzaum zzw;
    private boolean zzx;
    private int zzy;
    private long zzz;

    public zzaun() {
        this(0);
    }

    public static final int zzl(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 2274716:
                return 3;
            case 160:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    public static final boolean zzm(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    private final long zzn(long j2) {
        long j3 = this.zzt;
        if (j3 != -9223372036854775807L) {
            return zzazn.zzj(j2, j3, 1000L);
        }
        throw new zzarv("Can't scale timecode prior to timecodeScale being set.");
    }

    private final void zzo(zzaum zzaumVar, long j2) {
        byte[] zzq;
        if ("S_TEXT/UTF8".equals(zzaumVar.zza)) {
            byte[] bArr = this.zzn.zza;
            long j3 = this.zzJ;
            if (j3 == -9223372036854775807L) {
                zzq = zzc;
            } else {
                int i2 = (int) (j3 / 3600000000L);
                long j4 = j3 - (i2 * 3600000000L);
                int i3 = (int) (j4 / 60000000);
                long j5 = j4 - (60000000 * i3);
                int i4 = (int) (j5 / 1000000);
                zzq = zzazn.zzq(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (i4 * 1000000)) / 1000))));
            }
            System.arraycopy(zzq, 0, bArr, 19, 12);
            zzaue zzaueVar = zzaumVar.zzN;
            zzazg zzazgVar = this.zzn;
            zzaueVar.zzb(zzazgVar, zzazgVar.zzd());
            this.zzY = this.zzn.zzd() + this.zzY;
        }
        zzaumVar.zzN.zzc(j2, this.zzP, this.zzY, 0, zzaumVar.zzg);
        this.zzZ = true;
        zzp();
    }

    private final void zzp() {
        this.zzQ = 0;
        this.zzY = 0;
        this.zzX = 0;
        this.zzR = false;
        this.zzS = false;
        this.zzU = false;
        this.zzW = 0;
        this.zzV = (byte) 0;
        this.zzT = false;
        this.zzm.zzr();
    }

    private static int[] zzq(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        int length = iArr.length;
        return length >= i2 ? iArr : new int[Math.max(length + length, i2)];
    }

    private final int zzr(zzatu zzatuVar, zzaue zzaueVar, int i2) {
        int zzd2;
        int zza2 = this.zzm.zza();
        if (zza2 > 0) {
            zzd2 = Math.min(i2, zza2);
            zzaueVar.zzb(this.zzm, zzd2);
        } else {
            zzd2 = zzaueVar.zzd(zzatuVar, i2, false);
        }
        this.zzQ += zzd2;
        this.zzY += zzd2;
        return zzd2;
    }

    private final void zzs(zzatu zzatuVar, int i2) {
        if (this.zzj.zzd() >= i2) {
            return;
        }
        if (this.zzj.zzb() < i2) {
            zzazg zzazgVar = this.zzj;
            byte[] bArr = zzazgVar.zza;
            int length = bArr.length;
            zzazgVar.zzt(Arrays.copyOf(bArr, Math.max(length + length, i2)), this.zzj.zzd());
        }
        zzazg zzazgVar2 = this.zzj;
        zzatuVar.zzh(zzazgVar2.zza, zzazgVar2.zzd(), i2 - this.zzj.zzd(), false);
        this.zzj.zzu(i2);
    }

    private final void zzt(zzatu zzatuVar, zzaum zzaumVar, int i2) {
        int i3;
        if ("S_TEXT/UTF8".equals(zzaumVar.zza)) {
            int i4 = i2 + 32;
            if (this.zzn.zzb() < i4) {
                this.zzn.zza = Arrays.copyOf(zzb, i4 + i2);
            }
            zzatuVar.zzh(this.zzn.zza, 32, i2, false);
            this.zzn.zzv(0);
            this.zzn.zzu(i4);
            return;
        }
        zzaue zzaueVar = zzaumVar.zzN;
        if (!this.zzR) {
            if (zzaumVar.zze) {
                this.zzP &= -1073741825;
                if (!this.zzS) {
                    zzatuVar.zzh(this.zzj.zza, 0, 1, false);
                    this.zzQ++;
                    byte b = this.zzj.zza[0];
                    if ((b & 128) != 128) {
                        this.zzV = b;
                        this.zzS = true;
                    } else {
                        throw new zzarv("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.zzV;
                if ((b2 & 1) == 1) {
                    int i5 = b2 & 2;
                    this.zzP |= CommonUtils.BYTES_IN_A_GIGABYTE;
                    if (!this.zzT) {
                        zzatuVar.zzh(this.zzo.zza, 0, 8, false);
                        this.zzQ += 8;
                        this.zzT = true;
                        zzazg zzazgVar = this.zzj;
                        zzazgVar.zza[0] = (byte) ((i5 != 2 ? 0 : 128) | 8);
                        zzazgVar.zzv(0);
                        zzaueVar.zzb(this.zzj, 1);
                        this.zzY++;
                        this.zzo.zzv(0);
                        zzaueVar.zzb(this.zzo, 8);
                        this.zzY += 8;
                    }
                    if (i5 == 2) {
                        if (!this.zzU) {
                            zzatuVar.zzh(this.zzj.zza, 0, 1, false);
                            this.zzQ++;
                            this.zzj.zzv(0);
                            this.zzW = this.zzj.zzg();
                            this.zzU = true;
                        }
                        int i6 = this.zzW * 4;
                        this.zzj.zzs(i6);
                        zzatuVar.zzh(this.zzj.zza, 0, i6, false);
                        this.zzQ += i6;
                        int i7 = (this.zzW >> 1) + 1;
                        int i8 = (i7 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzq;
                        if (byteBuffer == null || byteBuffer.capacity() < i8) {
                            this.zzq = ByteBuffer.allocate(i8);
                        }
                        this.zzq.position(0);
                        this.zzq.putShort((short) i7);
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            i3 = this.zzW;
                            if (i9 >= i3) {
                                break;
                            }
                            int zzi = this.zzj.zzi();
                            if (i9 % 2 == 0) {
                                this.zzq.putShort((short) (zzi - i10));
                            } else {
                                this.zzq.putInt(zzi - i10);
                            }
                            i9++;
                            i10 = zzi;
                        }
                        int i11 = (i2 - this.zzQ) - i10;
                        if ((i3 & 1) == 1) {
                            this.zzq.putInt(i11);
                        } else {
                            this.zzq.putShort((short) i11);
                            this.zzq.putInt(0);
                        }
                        this.zzp.zzt(this.zzq.array(), i8);
                        zzaueVar.zzb(this.zzp, i8);
                        this.zzY += i8;
                    }
                }
            } else {
                byte[] bArr = zzaumVar.zzf;
                if (bArr != null) {
                    this.zzm.zzt(bArr, bArr.length);
                }
            }
            this.zzR = true;
        }
        int zzd2 = this.zzm.zzd() + i2;
        if (!"V_MPEG4/ISO/AVC".equals(zzaumVar.zza) && !"V_MPEGH/ISO/HEVC".equals(zzaumVar.zza)) {
            while (true) {
                int i12 = this.zzQ;
                if (i12 >= zzd2) {
                    break;
                }
                zzr(zzatuVar, zzaueVar, zzd2 - i12);
            }
        } else {
            byte[] bArr2 = this.zzi.zza;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i13 = zzaumVar.zzO;
            int i14 = 4 - i13;
            while (this.zzQ < zzd2) {
                int i15 = this.zzX;
                if (i15 == 0) {
                    int min = Math.min(i13, this.zzm.zza());
                    zzatuVar.zzh(bArr2, i14 + min, i13 - min, false);
                    if (min > 0) {
                        this.zzm.zzq(bArr2, i14, min);
                    }
                    this.zzQ += i13;
                    this.zzi.zzv(0);
                    this.zzX = this.zzi.zzi();
                    this.zzh.zzv(0);
                    zzaueVar.zzb(this.zzh, 4);
                    this.zzY += 4;
                } else {
                    this.zzX = i15 - zzr(zzatuVar, zzaueVar, i15);
                }
            }
        }
        if ("A_VORBIS".equals(zzaumVar.zza)) {
            this.zzk.zzv(0);
            zzaueVar.zzb(this.zzk, 4);
            this.zzY += 4;
        }
    }

    public final void zzb(int i2) {
        zzauc zzaubVar;
        zzazb zzazbVar;
        zzazb zzazbVar2;
        int i3;
        int i4 = 0;
        if (i2 == 160) {
            if (this.zzH != 2) {
                return;
            }
            if (!this.zzaa) {
                this.zzP |= 1;
            }
            zzo((zzaum) this.zzf.get(this.zzN), this.zzI);
            this.zzH = 0;
        } else if (i2 == 174) {
            String str = this.zzw.zza;
            if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                zzaum zzaumVar = this.zzw;
                zzaumVar.zzb(this.zzab, zzaumVar.zzb);
                SparseArray sparseArray = this.zzf;
                zzaum zzaumVar2 = this.zzw;
                sparseArray.put(zzaumVar2.zzb, zzaumVar2);
            }
            this.zzw = null;
        } else if (i2 == 19899) {
            int i5 = this.zzy;
            if (i5 != -1) {
                long j2 = this.zzz;
                if (j2 != -1) {
                    if (i5 == 475249515) {
                        this.zzB = j2;
                        return;
                    }
                    return;
                }
            }
            throw new zzarv("Mandatory element SeekID or SeekPosition not found");
        } else if (i2 == 25152) {
            zzaum zzaumVar3 = this.zzw;
            if (zzaumVar3.zze) {
                if (zzaumVar3.zzg != null) {
                    zzaumVar3.zzi = new zzatr(new zzatq(zzard.zzb, "video/webm", this.zzw.zzg.zzb, false));
                    return;
                }
                throw new zzarv("Encrypted Track found but ContentEncKeyID was not found");
            }
        } else if (i2 == 28032) {
            zzaum zzaumVar4 = this.zzw;
            if (zzaumVar4.zze && zzaumVar4.zzf != null) {
                throw new zzarv("Combining encryption and compression is not supported");
            }
        } else if (i2 == 357149030) {
            if (this.zzt == -9223372036854775807L) {
                this.zzt = 1000000L;
            }
            long j3 = this.zzu;
            if (j3 != -9223372036854775807L) {
                this.zzv = zzn(j3);
            }
        } else if (i2 != 374648427) {
            if (i2 == 475249515 && !this.zzx) {
                zzatw zzatwVar = this.zzab;
                if (this.zzs != -1 && this.zzv != -9223372036854775807L && (zzazbVar = this.zzE) != null && zzazbVar.zza() != 0 && (zzazbVar2 = this.zzF) != null && zzazbVar2.zza() == zzazbVar.zza()) {
                    int zza2 = zzazbVar.zza();
                    int[] iArr = new int[zza2];
                    long[] jArr = new long[zza2];
                    long[] jArr2 = new long[zza2];
                    long[] jArr3 = new long[zza2];
                    for (int i6 = 0; i6 < zza2; i6++) {
                        jArr3[i6] = this.zzE.zzb(i6);
                        jArr[i6] = this.zzF.zzb(i6) + this.zzs;
                    }
                    while (true) {
                        i3 = zza2 - 1;
                        if (i4 >= i3) {
                            break;
                        }
                        int i7 = i4 + 1;
                        iArr[i4] = (int) (jArr[i7] - jArr[i4]);
                        jArr2[i4] = jArr3[i7] - jArr3[i4];
                        i4 = i7;
                    }
                    iArr[i3] = (int) ((this.zzs + this.zzr) - jArr[i3]);
                    jArr2[i3] = this.zzv - jArr3[i3];
                    this.zzE = null;
                    this.zzF = null;
                    zzaubVar = new zzatt(iArr, jArr, jArr2, jArr3);
                } else {
                    this.zzE = null;
                    this.zzF = null;
                    zzaubVar = new zzaub(this.zzv);
                }
                zzatwVar.zzc(zzaubVar);
                this.zzx = true;
            }
        } else if (this.zzf.size() != 0) {
            this.zzab.zzb();
        } else {
            throw new zzarv("No valid tracks were found");
        }
    }

    public final void zzc(int i2, double d2) {
        if (i2 == 181) {
            this.zzw.zzI = (int) d2;
        } else if (i2 == 17545) {
            this.zzu = (long) d2;
        } else {
            switch (i2) {
                case 21969:
                    this.zzw.zzw = (float) d2;
                    return;
                case 21970:
                    this.zzw.zzx = (float) d2;
                    return;
                case 21971:
                    this.zzw.zzy = (float) d2;
                    return;
                case 21972:
                    this.zzw.zzz = (float) d2;
                    return;
                case 21973:
                    this.zzw.zzA = (float) d2;
                    return;
                case 21974:
                    this.zzw.zzB = (float) d2;
                    return;
                case 21975:
                    this.zzw.zzC = (float) d2;
                    return;
                case 21976:
                    this.zzw.zzD = (float) d2;
                    return;
                case 21977:
                    this.zzw.zzE = (float) d2;
                    return;
                case 21978:
                    this.zzw.zzF = (float) d2;
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zzd(zzatw zzatwVar) {
        this.zzab = zzatwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final void zze(long j2, long j3) {
        this.zzD = -9223372036854775807L;
        this.zzH = 0;
        this.zzac.zza();
        this.zze.zzd();
        zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final int zzf(zzatu zzatuVar, zzaua zzauaVar) {
        this.zzZ = false;
        while (!this.zzZ) {
            if (!this.zzac.zzc(zzatuVar)) {
                return -1;
            }
            long zzd2 = zzatuVar.zzd();
            if (this.zzA) {
                this.zzC = zzd2;
                zzauaVar.zza = this.zzB;
                this.zzA = false;
                return 1;
            } else if (this.zzx) {
                long j2 = this.zzC;
                if (j2 != -1) {
                    zzauaVar.zza = j2;
                    this.zzC = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzatv
    public final boolean zzg(zzatu zzatuVar) {
        return new zzauo().zza(zzatuVar);
    }

    public final void zzh(int i2, long j2) {
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            throw new zzarv("ContentEncodingOrder " + j2 + " not supported");
        } else if (i2 == 20530) {
            if (j2 == 1) {
                return;
            }
            throw new zzarv("ContentEncodingScope " + j2 + " not supported");
        } else {
            switch (i2) {
                case 131:
                    this.zzw.zzc = (int) j2;
                    return;
                case 136:
                    this.zzw.zzL = j2 == 1;
                    return;
                case 155:
                    this.zzJ = zzn(j2);
                    return;
                case 159:
                    this.zzw.zzG = (int) j2;
                    return;
                case 176:
                    this.zzw.zzj = (int) j2;
                    return;
                case 179:
                    this.zzE.zzc(zzn(j2));
                    return;
                case 186:
                    this.zzw.zzk = (int) j2;
                    return;
                case 215:
                    this.zzw.zzb = (int) j2;
                    return;
                case 231:
                    this.zzD = zzn(j2);
                    return;
                case 241:
                    if (this.zzG) {
                        return;
                    }
                    this.zzF.zzc(j2);
                    this.zzG = true;
                    return;
                case 251:
                    this.zzaa = true;
                    return;
                case 16980:
                    if (j2 == 3) {
                        return;
                    }
                    throw new zzarv("ContentCompAlgo " + j2 + " not supported");
                case 17029:
                    if (j2 < 1 || j2 > 2) {
                        throw new zzarv("DocTypeReadVersion " + j2 + " not supported");
                    }
                    return;
                case 17143:
                    if (j2 == 1) {
                        return;
                    }
                    throw new zzarv("EBMLReadVersion " + j2 + " not supported");
                case 18401:
                    if (j2 == 5) {
                        return;
                    }
                    throw new zzarv("ContentEncAlgo " + j2 + " not supported");
                case 18408:
                    if (j2 == 1) {
                        return;
                    }
                    throw new zzarv("AESSettingsCipherMode " + j2 + " not supported");
                case 21420:
                    this.zzz = j2 + this.zzs;
                    return;
                case 21432:
                    int i3 = (int) j2;
                    if (i3 == 0) {
                        this.zzw.zzp = 0;
                        return;
                    } else if (i3 == 1) {
                        this.zzw.zzp = 2;
                        return;
                    } else if (i3 == 3) {
                        this.zzw.zzp = 1;
                        return;
                    } else if (i3 != 15) {
                        return;
                    } else {
                        this.zzw.zzp = 3;
                        return;
                    }
                case 21680:
                    this.zzw.zzl = (int) j2;
                    return;
                case 21682:
                    this.zzw.zzn = (int) j2;
                    return;
                case 21690:
                    this.zzw.zzm = (int) j2;
                    return;
                case 21930:
                    this.zzw.zzM = j2 == 1;
                    return;
                case 22186:
                    this.zzw.zzJ = j2;
                    return;
                case 22203:
                    this.zzw.zzK = j2;
                    return;
                case 25188:
                    this.zzw.zzH = (int) j2;
                    return;
                case 2352003:
                    this.zzw.zzd = (int) j2;
                    return;
                case 2807729:
                    this.zzt = j2;
                    return;
                default:
                    switch (i2) {
                        case 21945:
                            int i4 = (int) j2;
                            if (i4 == 1) {
                                this.zzw.zzt = 2;
                                return;
                            } else if (i4 != 2) {
                                return;
                            } else {
                                this.zzw.zzt = 1;
                                return;
                            }
                        case 21946:
                            int i5 = (int) j2;
                            if (i5 != 1) {
                                if (i5 == 16) {
                                    this.zzw.zzs = 6;
                                    return;
                                } else if (i5 == 18) {
                                    this.zzw.zzs = 7;
                                    return;
                                } else if (i5 != 6 && i5 != 7) {
                                    return;
                                }
                            }
                            this.zzw.zzs = 3;
                            return;
                        case 21947:
                            zzaum zzaumVar = this.zzw;
                            zzaumVar.zzq = true;
                            int i6 = (int) j2;
                            if (i6 == 1) {
                                zzaumVar.zzr = 1;
                                return;
                            } else if (i6 == 9) {
                                zzaumVar.zzr = 6;
                                return;
                            } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                zzaumVar.zzr = 2;
                                return;
                            } else {
                                return;
                            }
                        case 21948:
                            this.zzw.zzu = (int) j2;
                            return;
                        case 21949:
                            this.zzw.zzv = (int) j2;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public final void zzi(int i2, long j2, long j3) {
        if (i2 == 160) {
            this.zzaa = false;
        } else if (i2 == 174) {
            this.zzw = new zzaum(null);
        } else if (i2 == 187) {
            this.zzG = false;
        } else if (i2 == 19899) {
            this.zzy = -1;
            this.zzz = -1L;
        } else if (i2 == 20533) {
            this.zzw.zze = true;
        } else if (i2 == 21968) {
            this.zzw.zzq = true;
        } else if (i2 == 408125543) {
            long j4 = this.zzs;
            if (j4 != -1 && j4 != j2) {
                throw new zzarv("Multiple Segment elements not supported");
            }
            this.zzs = j2;
            this.zzr = j3;
        } else if (i2 == 475249515) {
            this.zzE = new zzazb(32);
            this.zzF = new zzazb(32);
        } else if (i2 == 524531317 && !this.zzx) {
            if (this.zzg && this.zzB != -1) {
                this.zzA = true;
                return;
            }
            this.zzab.zzc(new zzaub(this.zzv));
            this.zzx = true;
        }
    }

    public final void zzj(int i2, String str) {
        if (i2 == 134) {
            this.zzw.zza = str;
        } else if (i2 != 17026) {
            if (i2 != 2274716) {
                return;
            }
            zzaum.zza(this.zzw, str);
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new zzarv(a.q("DocType ", str, " not supported"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzk(int r18, int r19, com.google.android.gms.internal.ads.zzatu r20) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaun.zzk(int, int, com.google.android.gms.internal.ads.zzatu):void");
    }

    public zzaun(int i2) {
        zzauh zzauhVar = new zzauh();
        this.zzs = -1L;
        this.zzt = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzB = -1L;
        this.zzC = -1L;
        this.zzD = -9223372036854775807L;
        this.zzac = zzauhVar;
        zzauhVar.zzb(new zzauk(this, null));
        this.zzg = true;
        this.zze = new zzaup();
        this.zzf = new SparseArray();
        this.zzj = new zzazg(4);
        this.zzk = new zzazg(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzl = new zzazg(4);
        this.zzh = new zzazg(zzaze.zza);
        this.zzi = new zzazg(4);
        this.zzm = new zzazg();
        this.zzn = new zzazg();
        this.zzo = new zzazg(8);
        this.zzp = new zzazg();
    }
}
