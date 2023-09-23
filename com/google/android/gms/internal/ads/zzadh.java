package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import com.google.firebase.FirebaseError;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonConstants;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzadh implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzadd
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzadh.zza;
            return new zzys[]{new zzadh(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = zzeg.zzZ("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] zzd = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] zze = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID zzf = new UUID(72057594037932032L, -9223371306706625679L);
    private static final Map zzg;
    private long zzA;
    private zzadg zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzdo zzJ;
    private zzdo zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzyv zzai;
    private final zzadc zzh;
    private final zzadj zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzdy zzl;
    private final zzdy zzm;
    private final zzdy zzn;
    private final zzdy zzo;
    private final zzdy zzp;
    private final zzdy zzq;
    private final zzdy zzr;
    private final zzdy zzs;
    private final zzdy zzt;
    private final zzdy zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(hashMap);
    }

    public zzadh() {
        this(0);
    }

    public static final int zzn(int i2) {
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
            case 238:
            case 241:
            case 251:
            case 16871:
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
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
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
            case 165:
            case 16877:
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
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public static final boolean zzo(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    private final int zzp(zzyt zzytVar, zzadg zzadgVar, int i2, boolean z) {
        int i3;
        if ("S_TEXT/UTF8".equals(zzadgVar.zzb)) {
            zzx(zzytVar, zzb, i2);
            int i4 = this.zzaa;
            zzw();
            return i4;
        } else if ("S_TEXT/ASS".equals(zzadgVar.zzb)) {
            zzx(zzytVar, zzd, i2);
            int i5 = this.zzaa;
            zzw();
            return i5;
        } else if ("S_TEXT/WEBVTT".equals(zzadgVar.zzb)) {
            zzx(zzytVar, zze, i2);
            int i6 = this.zzaa;
            zzw();
            return i6;
        } else {
            zzzz zzzzVar = zzadgVar.zzV;
            if (!this.zzac) {
                if (zzadgVar.zzg) {
                    this.zzV &= -1073741825;
                    if (!this.zzad) {
                        ((zzym) zzytVar).zzn(this.zzn.zzH(), 0, 1, false);
                        this.zzZ++;
                        if ((this.zzn.zzH()[0] & 128) != 128) {
                            this.zzag = this.zzn.zzH()[0];
                            this.zzad = true;
                        } else {
                            throw zzbp.zza("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b = this.zzag;
                    if ((b & 1) == 1) {
                        int i7 = b & 2;
                        this.zzV |= CommonUtils.BYTES_IN_A_GIGABYTE;
                        if (!this.zzah) {
                            ((zzym) zzytVar).zzn(this.zzs.zzH(), 0, 8, false);
                            this.zzZ += 8;
                            this.zzah = true;
                            this.zzn.zzH()[0] = (byte) ((i7 != 2 ? 0 : 128) | 8);
                            this.zzn.zzF(0);
                            zzzzVar.zzr(this.zzn, 1, 1);
                            this.zzaa++;
                            this.zzs.zzF(0);
                            zzzzVar.zzr(this.zzs, 8, 1);
                            this.zzaa += 8;
                        }
                        if (i7 == 2) {
                            if (!this.zzae) {
                                ((zzym) zzytVar).zzn(this.zzn.zzH(), 0, 1, false);
                                this.zzZ++;
                                this.zzn.zzF(0);
                                this.zzaf = this.zzn.zzk();
                                this.zzae = true;
                            }
                            int i8 = this.zzaf * 4;
                            this.zzn.zzC(i8);
                            ((zzym) zzytVar).zzn(this.zzn.zzH(), 0, i8, false);
                            this.zzZ += i8;
                            int i9 = (this.zzaf >> 1) + 1;
                            int i10 = (i9 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzv;
                            if (byteBuffer == null || byteBuffer.capacity() < i10) {
                                this.zzv = ByteBuffer.allocate(i10);
                            }
                            this.zzv.position(0);
                            this.zzv.putShort((short) i9);
                            int i11 = 0;
                            int i12 = 0;
                            while (true) {
                                i3 = this.zzaf;
                                if (i11 >= i3) {
                                    break;
                                }
                                int zzn = this.zzn.zzn();
                                if (i11 % 2 == 0) {
                                    this.zzv.putShort((short) (zzn - i12));
                                } else {
                                    this.zzv.putInt(zzn - i12);
                                }
                                i11++;
                                i12 = zzn;
                            }
                            int i13 = (i2 - this.zzZ) - i12;
                            if ((i3 & 1) == 1) {
                                this.zzv.putInt(i13);
                            } else {
                                this.zzv.putShort((short) i13);
                                this.zzv.putInt(0);
                            }
                            this.zzt.zzD(this.zzv.array(), i10);
                            zzzzVar.zzr(this.zzt, i10, 1);
                            this.zzaa += i10;
                        }
                    }
                } else {
                    byte[] bArr = zzadgVar.zzh;
                    if (bArr != null) {
                        this.zzq.zzD(bArr, bArr.length);
                    }
                }
                if (!"A_OPUS".equals(zzadgVar.zzb) ? zzadgVar.zzf > 0 : z) {
                    this.zzV |= 268435456;
                    this.zzu.zzC(0);
                    int zzd2 = (this.zzq.zzd() + i2) - this.zzZ;
                    this.zzn.zzC(4);
                    this.zzn.zzH()[0] = (byte) ((zzd2 >> 24) & 255);
                    this.zzn.zzH()[1] = (byte) ((zzd2 >> 16) & 255);
                    this.zzn.zzH()[2] = (byte) ((zzd2 >> 8) & 255);
                    this.zzn.zzH()[3] = (byte) (zzd2 & 255);
                    zzzzVar.zzr(this.zzn, 4, 2);
                    this.zzaa += 4;
                }
                this.zzac = true;
            }
            int zzd3 = this.zzq.zzd() + i2;
            if (!"V_MPEG4/ISO/AVC".equals(zzadgVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzadgVar.zzb)) {
                if (zzadgVar.zzS != null) {
                    zzcw.zzf(this.zzq.zzd() == 0);
                    zzadgVar.zzS.zzd(zzytVar);
                }
                while (true) {
                    int i14 = this.zzZ;
                    if (i14 >= zzd3) {
                        break;
                    }
                    int zzq = zzq(zzytVar, zzzzVar, zzd3 - i14);
                    this.zzZ += zzq;
                    this.zzaa += zzq;
                }
            } else {
                byte[] zzH = this.zzm.zzH();
                zzH[0] = 0;
                zzH[1] = 0;
                zzH[2] = 0;
                int i15 = zzadgVar.zzW;
                int i16 = 4 - i15;
                while (this.zzZ < zzd3) {
                    int i17 = this.zzab;
                    if (i17 == 0) {
                        int min = Math.min(i15, this.zzq.zza());
                        ((zzym) zzytVar).zzn(zzH, i16 + min, i15 - min, false);
                        if (min > 0) {
                            this.zzq.zzB(zzH, i16, min);
                        }
                        this.zzZ += i15;
                        this.zzm.zzF(0);
                        this.zzab = this.zzm.zzn();
                        this.zzl.zzF(0);
                        zzzx.zzb(zzzzVar, this.zzl, 4);
                        this.zzaa += 4;
                    } else {
                        int zzq2 = zzq(zzytVar, zzzzVar, i17);
                        this.zzZ += zzq2;
                        this.zzaa += zzq2;
                        this.zzab -= zzq2;
                    }
                }
            }
            if ("A_VORBIS".equals(zzadgVar.zzb)) {
                this.zzo.zzF(0);
                zzzx.zzb(zzzzVar, this.zzo, 4);
                this.zzaa += 4;
            }
            int i18 = this.zzaa;
            zzw();
            return i18;
        }
    }

    private final int zzq(zzyt zzytVar, zzzz zzzzVar, int i2) {
        int zza2 = this.zzq.zza();
        if (zza2 > 0) {
            int min = Math.min(i2, zza2);
            zzzx.zzb(zzzzVar, this.zzq, min);
            return min;
        }
        return zzzx.zza(zzzzVar, zzytVar, i2, false);
    }

    private final long zzr(long j2) {
        long j3 = this.zzy;
        if (j3 != -9223372036854775807L) {
            return zzeg.zzw(j2, j3, 1000L);
        }
        throw zzbp.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void zzs(int i2) {
        if (this.zzJ == null || this.zzK == null) {
            throw zzbp.zza("Element " + i2 + " must be in a Cues", null);
        }
    }

    private final void zzt(int i2) {
        if (this.zzB != null) {
            return;
        }
        throw zzbp.zza("Element " + i2 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0 A[EDGE_INSN: B:62:0x00e0->B:51:0x00e0 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzu(com.google.android.gms.internal.ads.zzadg r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadh.zzu(com.google.android.gms.internal.ads.zzadg, long, int, int, int):void");
    }

    private final void zzv(zzyt zzytVar, int i2) {
        if (this.zzn.zzd() >= i2) {
            return;
        }
        if (this.zzn.zzb() < i2) {
            zzdy zzdyVar = this.zzn;
            int zzb2 = zzdyVar.zzb();
            zzdyVar.zzz(Math.max(zzb2 + zzb2, i2));
        }
        ((zzym) zzytVar).zzn(this.zzn.zzH(), this.zzn.zzd(), i2 - this.zzn.zzd(), false);
        this.zzn.zzE(i2);
    }

    private final void zzw() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzC(0);
    }

    private final void zzx(zzyt zzytVar, byte[] bArr, int i2) {
        int length = bArr.length;
        int i3 = length + i2;
        if (this.zzr.zzb() < i3) {
            zzdy zzdyVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i3 + i2);
            zzdyVar.zzD(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzH(), 0, length);
        }
        ((zzym) zzytVar).zzn(this.zzr.zzH(), length, i2, false);
        this.zzr.zzF(0);
        this.zzr.zzE(i3);
    }

    private static byte[] zzy(long j2, String str, long j3) {
        zzcw.zzd(j2 != -9223372036854775807L);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - ((i2 * SettingsJsonConstants.SETTINGS_CACHE_DURATION_DEFAULT) * 1000000);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - ((i3 * 60) * 1000000);
        int i4 = (int) (j5 / 1000000);
        return zzeg.zzZ(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (i4 * 1000000)) / j3))));
    }

    private static int[] zzz(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        int length = iArr.length;
        return length >= i2 ? iArr : new int[Math.max(length + length, i2)];
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zza(zzyt zzytVar, zzzs zzzsVar) {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzh.zzc(zzytVar)) {
                for (int i2 = 0; i2 < this.zzj.size(); i2++) {
                    zzadg zzadgVar = (zzadg) this.zzj.valueAt(i2);
                    zzadg.zzd(zzadgVar);
                    zzaaa zzaaaVar = zzadgVar.zzS;
                    if (zzaaaVar != null) {
                        zzaaaVar.zza(zzadgVar.zzV, zzadgVar.zzi);
                    }
                }
                return -1;
            }
            long zzf2 = zzytVar.zzf();
            if (this.zzF) {
                this.zzH = zzf2;
                zzzsVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            } else if (this.zzC) {
                long j2 = this.zzH;
                if (j2 != -1) {
                    zzzsVar.zza = j2;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzai = zzyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j2, long j3) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzw();
        for (int i2 = 0; i2 < this.zzj.size(); i2++) {
            zzaaa zzaaaVar = ((zzadg) this.zzj.valueAt(i2)).zzS;
            if (zzaaaVar != null) {
                zzaaaVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) {
        return new zzadi().zza(zzytVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x027f, code lost:
        throw com.google.android.gms.internal.ads.zzbp.zza("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(int r19, int r20, com.google.android.gms.internal.ads.zzyt r21) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadh.zzg(int, int, com.google.android.gms.internal.ads.zzyt):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e8, code lost:
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(int r22) {
        /*
            Method dump skipped, instructions count: 1150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadh.zzh(int):void");
    }

    public final void zzi(int i2, double d2) {
        if (i2 == 181) {
            zzt(i2);
            this.zzB.zzP = (int) d2;
        } else if (i2 != 17545) {
            switch (i2) {
                case 21969:
                    zzt(i2);
                    this.zzB.zzC = (float) d2;
                    return;
                case 21970:
                    zzt(i2);
                    this.zzB.zzD = (float) d2;
                    return;
                case 21971:
                    zzt(i2);
                    this.zzB.zzE = (float) d2;
                    return;
                case 21972:
                    zzt(i2);
                    this.zzB.zzF = (float) d2;
                    return;
                case 21973:
                    zzt(i2);
                    this.zzB.zzG = (float) d2;
                    return;
                case 21974:
                    zzt(i2);
                    this.zzB.zzH = (float) d2;
                    return;
                case 21975:
                    zzt(i2);
                    this.zzB.zzI = (float) d2;
                    return;
                case 21976:
                    zzt(i2);
                    this.zzB.zzJ = (float) d2;
                    return;
                case 21977:
                    zzt(i2);
                    this.zzB.zzK = (float) d2;
                    return;
                case 21978:
                    zzt(i2);
                    this.zzB.zzL = (float) d2;
                    return;
                default:
                    switch (i2) {
                        case 30323:
                            zzt(i2);
                            this.zzB.zzr = (float) d2;
                            return;
                        case 30324:
                            zzt(i2);
                            this.zzB.zzs = (float) d2;
                            return;
                        case 30325:
                            zzt(i2);
                            this.zzB.zzt = (float) d2;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.zzz = (long) d2;
        }
    }

    public final void zzj(int i2, long j2) {
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            throw zzbp.zza("ContentEncodingOrder " + j2 + " not supported", null);
        } else if (i2 == 20530) {
            if (j2 == 1) {
                return;
            }
            throw zzbp.zza("ContentEncodingScope " + j2 + " not supported", null);
        } else {
            switch (i2) {
                case 131:
                    zzt(i2);
                    this.zzB.zzd = (int) j2;
                    return;
                case 136:
                    zzt(i2);
                    this.zzB.zzU = j2 == 1;
                    return;
                case 155:
                    this.zzP = zzr(j2);
                    return;
                case 159:
                    zzt(i2);
                    this.zzB.zzN = (int) j2;
                    return;
                case 176:
                    zzt(i2);
                    this.zzB.zzl = (int) j2;
                    return;
                case 179:
                    zzs(i2);
                    this.zzJ.zzc(zzr(j2));
                    return;
                case 186:
                    zzt(i2);
                    this.zzB.zzm = (int) j2;
                    return;
                case 215:
                    zzt(i2);
                    this.zzB.zzc = (int) j2;
                    return;
                case 231:
                    this.zzI = zzr(j2);
                    return;
                case 238:
                    this.zzW = (int) j2;
                    return;
                case 241:
                    if (this.zzL) {
                        return;
                    }
                    zzs(i2);
                    this.zzK.zzc(j2);
                    this.zzL = true;
                    return;
                case 251:
                    this.zzX = true;
                    return;
                case 16871:
                    zzt(i2);
                    zzadg.zzb(this.zzB, (int) j2);
                    return;
                case 16980:
                    if (j2 == 3) {
                        return;
                    }
                    throw zzbp.zza("ContentCompAlgo " + j2 + " not supported", null);
                case 17029:
                    if (j2 < 1 || j2 > 2) {
                        throw zzbp.zza("DocTypeReadVersion " + j2 + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j2 == 1) {
                        return;
                    }
                    throw zzbp.zza("EBMLReadVersion " + j2 + " not supported", null);
                case 18401:
                    if (j2 == 5) {
                        return;
                    }
                    throw zzbp.zza("ContentEncAlgo " + j2 + " not supported", null);
                case 18408:
                    if (j2 == 1) {
                        return;
                    }
                    throw zzbp.zza("AESSettingsCipherMode " + j2 + " not supported", null);
                case 21420:
                    this.zzE = j2 + this.zzx;
                    return;
                case 21432:
                    zzt(i2);
                    int i3 = (int) j2;
                    if (i3 == 0) {
                        this.zzB.zzv = 0;
                        return;
                    } else if (i3 == 1) {
                        this.zzB.zzv = 2;
                        return;
                    } else if (i3 == 3) {
                        this.zzB.zzv = 1;
                        return;
                    } else if (i3 != 15) {
                        return;
                    } else {
                        this.zzB.zzv = 3;
                        return;
                    }
                case 21680:
                    zzt(i2);
                    this.zzB.zzn = (int) j2;
                    return;
                case 21682:
                    zzt(i2);
                    this.zzB.zzp = (int) j2;
                    return;
                case 21690:
                    zzt(i2);
                    this.zzB.zzo = (int) j2;
                    return;
                case 21930:
                    zzt(i2);
                    this.zzB.zzT = j2 == 1;
                    return;
                case 21998:
                    zzt(i2);
                    this.zzB.zzf = (int) j2;
                    return;
                case 22186:
                    zzt(i2);
                    this.zzB.zzQ = j2;
                    return;
                case 22203:
                    zzt(i2);
                    this.zzB.zzR = j2;
                    return;
                case 25188:
                    zzt(i2);
                    this.zzB.zzO = (int) j2;
                    return;
                case 30114:
                    this.zzY = j2;
                    return;
                case 30321:
                    zzt(i2);
                    int i4 = (int) j2;
                    if (i4 == 0) {
                        this.zzB.zzq = 0;
                        return;
                    } else if (i4 == 1) {
                        this.zzB.zzq = 1;
                        return;
                    } else if (i4 == 2) {
                        this.zzB.zzq = 2;
                        return;
                    } else if (i4 != 3) {
                        return;
                    } else {
                        this.zzB.zzq = 3;
                        return;
                    }
                case 2352003:
                    zzt(i2);
                    this.zzB.zze = (int) j2;
                    return;
                case 2807729:
                    this.zzy = j2;
                    return;
                default:
                    switch (i2) {
                        case 21945:
                            zzt(i2);
                            int i5 = (int) j2;
                            if (i5 == 1) {
                                this.zzB.zzz = 2;
                                return;
                            } else if (i5 != 2) {
                                return;
                            } else {
                                this.zzB.zzz = 1;
                                return;
                            }
                        case 21946:
                            zzt(i2);
                            int zzb2 = zzo.zzb((int) j2);
                            if (zzb2 != -1) {
                                this.zzB.zzy = zzb2;
                                return;
                            }
                            return;
                        case 21947:
                            zzt(i2);
                            zzadg zzadgVar = this.zzB;
                            zzadgVar.zzw = true;
                            int zza2 = zzo.zza((int) j2);
                            if (zza2 != -1) {
                                zzadgVar.zzx = zza2;
                                return;
                            }
                            return;
                        case 21948:
                            zzt(i2);
                            this.zzB.zzA = (int) j2;
                            return;
                        case 21949:
                            zzt(i2);
                            this.zzB.zzB = (int) j2;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public final void zzk(int i2, long j2, long j3) {
        zzcw.zzb(this.zzai);
        if (i2 == 160) {
            this.zzX = false;
            this.zzY = 0L;
        } else if (i2 == 174) {
            this.zzB = new zzadg();
        } else if (i2 == 187) {
            this.zzL = false;
        } else if (i2 == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
        } else if (i2 == 20533) {
            zzt(i2);
            this.zzB.zzg = true;
        } else if (i2 == 21968) {
            zzt(i2);
            this.zzB.zzw = true;
        } else if (i2 == 408125543) {
            long j4 = this.zzx;
            if (j4 != -1 && j4 != j2) {
                throw zzbp.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j2;
            this.zzw = j3;
        } else if (i2 == 475249515) {
            this.zzJ = new zzdo(32);
            this.zzK = new zzdo(32);
        } else if (i2 == 524531317 && !this.zzC) {
            if (this.zzk && this.zzG != -1) {
                this.zzF = true;
                return;
            }
            this.zzai.zzL(new zzzu(this.zzA, 0L));
            this.zzC = true;
        }
    }

    public final void zzl(int i2, String str) {
        if (i2 == 134) {
            zzt(i2);
            this.zzB.zzb = str;
        } else if (i2 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzbp.zza("DocType " + str + " not supported", null);
        } else if (i2 == 21358) {
            zzt(i2);
            this.zzB.zza = str;
        } else if (i2 != 2274716) {
        } else {
            zzt(i2);
            zzadg.zzc(this.zzB, str);
        }
    }

    public zzadh(int i2) {
        zzada zzadaVar = new zzada();
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzh = zzadaVar;
        zzadaVar.zza(new zzadf(this, null));
        this.zzk = true;
        this.zzi = new zzadj();
        this.zzj = new SparseArray();
        this.zzn = new zzdy(4);
        this.zzo = new zzdy(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzdy(4);
        this.zzl = new zzdy(zzzp.zza);
        this.zzm = new zzdy(4);
        this.zzq = new zzdy();
        this.zzr = new zzdy();
        this.zzs = new zzdy(8);
        this.zzt = new zzdy();
        this.zzu = new zzdy();
        this.zzS = new int[1];
    }
}
