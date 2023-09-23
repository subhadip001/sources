package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.logging.type.LogSeverity;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaum {
    public boolean zzL;
    public zzaue zzN;
    public int zzO;
    public String zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public boolean zze;
    public byte[] zzf;
    public zzaud zzg;
    public byte[] zzh;
    public zzatr zzi;
    public int zzj = -1;
    public int zzk = -1;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = 0;
    public byte[] zzo = null;
    public int zzp = -1;
    public boolean zzq = false;
    public int zzr = -1;
    public int zzs = -1;
    public int zzt = -1;
    public int zzu = 1000;
    public int zzv = LogSeverity.INFO_VALUE;
    public float zzw = -1.0f;
    public float zzx = -1.0f;
    public float zzy = -1.0f;
    public float zzz = -1.0f;
    public float zzA = -1.0f;
    public float zzB = -1.0f;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public int zzG = 1;
    public int zzH = -1;
    public int zzI = 8000;
    public long zzJ = 0;
    public long zzK = 0;
    public boolean zzM = true;
    private String zzP = "eng";

    private zzaum() {
    }

    public /* synthetic */ zzaum(zzaul zzaulVar) {
    }

    private static List zzc(zzazg zzazgVar) {
        try {
            zzazgVar.zzw(16);
            if (zzazgVar.zzk() != 826496599) {
                return null;
            }
            int zzc = zzazgVar.zzc() + 20;
            byte[] bArr = zzazgVar.zza;
            while (true) {
                int length = bArr.length;
                if (zzc < length - 4) {
                    if (bArr[zzc] == 0 && bArr[zzc + 1] == 0 && bArr[zzc + 2] == 1 && bArr[zzc + 3] == 15) {
                        return Collections.singletonList(Arrays.copyOfRange(bArr, zzc, length));
                    }
                    zzc++;
                } else {
                    throw new zzarv("Failed to find FourCC VC1 initialization data");
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarv("Error parsing FourCC VC1 codec private");
        }
    }

    private static List zzd(byte[] bArr) {
        int i2;
        int i3;
        try {
            if (bArr[0] == 2) {
                int i4 = 1;
                int i5 = 0;
                while (true) {
                    i2 = bArr[i4];
                    if (i2 != -1) {
                        break;
                    }
                    i5 += 255;
                    i4++;
                }
                int i6 = i4 + 1;
                int i7 = i5 + i2;
                int i8 = 0;
                while (true) {
                    i3 = bArr[i6];
                    if (i3 != -1) {
                        break;
                    }
                    i8 += 255;
                    i6++;
                }
                int i9 = i6 + 1;
                int i10 = i8 + i3;
                if (bArr[i9] == 1) {
                    byte[] bArr2 = new byte[i7];
                    System.arraycopy(bArr, i9, bArr2, 0, i7);
                    int i11 = i9 + i7;
                    if (bArr[i11] == 3) {
                        int i12 = i11 + i10;
                        if (bArr[i12] == 5) {
                            int length = bArr.length - i12;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i12, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new zzarv("Error parsing vorbis codec private");
                    }
                    throw new zzarv("Error parsing vorbis codec private");
                }
                throw new zzarv("Error parsing vorbis codec private");
            }
            throw new zzarv("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarv("Error parsing vorbis codec private");
        }
    }

    private static boolean zze(zzazg zzazgVar) {
        UUID uuid;
        UUID uuid2;
        try {
            int zzf = zzazgVar.zzf();
            if (zzf == 1) {
                return true;
            }
            if (zzf == 65534) {
                zzazgVar.zzv(24);
                long zzl = zzazgVar.zzl();
                uuid = zzaun.zzd;
                if (zzl == uuid.getMostSignificantBits()) {
                    long zzl2 = zzazgVar.zzl();
                    uuid2 = zzaun.zzd;
                    if (zzl2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzarv("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void zzb(zzatw zzatwVar, int i2) {
        char c;
        List list;
        List list2;
        int i3;
        int i4;
        ArrayList arrayList;
        int zzh;
        List list3;
        zzars zzi;
        int i5;
        int i6;
        zzazq zzazqVar;
        byte[] bArr;
        int i7;
        String str = this.zza;
        int i8 = 2;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str2 = "audio/raw";
        switch (c) {
            case 0:
                str2 = "video/x-vnd.on2.vp8";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 1:
                str2 = "video/x-vnd.on2.vp9";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 2:
                str2 = "video/mpeg2";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 3:
            case 4:
            case 5:
                byte[] bArr2 = this.zzh;
                str2 = "video/mp4v-es";
                list2 = bArr2 == null ? null : Collections.singletonList(bArr2);
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 6:
                zzazo zza = zzazo.zza(new zzazg(this.zzh));
                list = zza.zza;
                this.zzO = zza.zzb;
                str2 = "video/avc";
                list2 = list;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 7:
                zzazu zza2 = zzazu.zza(new zzazg(this.zzh));
                list = zza2.zza;
                this.zzO = zza2.zzb;
                str2 = "video/hevc";
                list2 = list;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case '\b':
                List zzc = zzc(new zzazg(this.zzh));
                if (zzc != null) {
                    str2 = "video/wvc1";
                    list2 = zzc;
                } else {
                    Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                    str2 = "video/x-unknown";
                    list2 = zzc;
                }
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case '\t':
                str2 = "video/x-unknown";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case '\n':
                str2 = "audio/vorbis";
                i3 = -1;
                i4 = 8192;
                arrayList = zzd(this.zzh);
                break;
            case 11:
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(this.zzh);
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzJ).array());
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzK).array());
                str2 = "audio/opus";
                i3 = -1;
                i4 = 5760;
                arrayList = arrayList2;
                break;
            case '\f':
                str2 = "audio/mp4a-latm";
                list2 = Collections.singletonList(this.zzh);
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case '\r':
                str2 = "audio/mpeg-L2";
                arrayList = null;
                i3 = -1;
                i4 = 4096;
                break;
            case 14:
                str2 = "audio/mpeg";
                arrayList = null;
                i3 = -1;
                i4 = 4096;
                break;
            case 15:
                str2 = "audio/ac3";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 16:
                str2 = "audio/eac3";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 17:
                str2 = "audio/true-hd";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 18:
            case 19:
                str2 = "audio/vnd.dts";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 20:
                str2 = "audio/vnd.dts.hd";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 21:
                str2 = "audio/x-flac";
                list2 = Collections.singletonList(this.zzh);
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 22:
                if (zze(new zzazg(this.zzh))) {
                    zzh = zzazn.zzh(this.zzH);
                    if (zzh == 0) {
                        Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzH + ". Setting mimeType to audio/x-unknown");
                    }
                    i3 = zzh;
                    list3 = null;
                    i4 = -1;
                    arrayList = list3;
                    break;
                } else {
                    Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                }
                str2 = "audio/x-unknown";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
            case 23:
                zzh = zzazn.zzh(this.zzH);
                if (zzh == 0) {
                    Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzH + ". Setting mimeType to audio/x-unknown");
                    str2 = "audio/x-unknown";
                    list2 = null;
                    i3 = -1;
                    list3 = list2;
                    i4 = -1;
                    arrayList = list3;
                    break;
                }
                i3 = zzh;
                list3 = null;
                i4 = -1;
                arrayList = list3;
            case 24:
                str2 = "application/x-subrip";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 25:
                str2 = "application/vobsub";
                list2 = Collections.singletonList(this.zzh);
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 26:
                str2 = "application/pgs";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 27:
                byte[] bArr3 = this.zzh;
                str2 = "application/dvbsubs";
                list2 = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            default:
                throw new zzarv("Unrecognized codec identifier.");
        }
        int i9 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
        if (zzazd.zza(str2)) {
            zzi = zzars.zzh(Integer.toString(i2), str2, null, -1, i4, this.zzG, this.zzI, i3, -1, -1, arrayList, this.zzi, i9, this.zzP, null);
            i8 = 1;
        } else if (zzazd.zzb(str2)) {
            if (this.zzn == 0) {
                int i10 = this.zzl;
                i5 = -1;
                if (i10 == -1) {
                    i10 = this.zzj;
                }
                this.zzl = i10;
                int i11 = this.zzm;
                if (i11 == -1) {
                    i11 = this.zzk;
                }
                this.zzm = i11;
            } else {
                i5 = -1;
            }
            float f2 = (this.zzl == i5 || (i7 = this.zzm) == i5) ? -1.0f : (this.zzk * i6) / (this.zzj * i7);
            if (this.zzq) {
                if (this.zzw == -1.0f || this.zzx == -1.0f || this.zzy == -1.0f || this.zzz == -1.0f || this.zzA == -1.0f || this.zzB == -1.0f || this.zzC == -1.0f || this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f) {
                    bArr = null;
                } else {
                    bArr = new byte[25];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.put((byte) 0);
                    wrap.putShort((short) ((this.zzw * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzx * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzy * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzz * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzA * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzB * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                    wrap.putShort((short) (this.zzE + 0.5f));
                    wrap.putShort((short) (this.zzF + 0.5f));
                    wrap.putShort((short) this.zzu);
                    wrap.putShort((short) this.zzv);
                }
                zzazqVar = new zzazq(this.zzr, this.zzt, this.zzs, bArr);
            } else {
                zzazqVar = null;
            }
            zzi = zzars.zzl(Integer.toString(i2), str2, null, -1, i4, this.zzj, this.zzk, -1.0f, arrayList, -1, f2, this.zzo, this.zzp, zzazqVar, this.zzi);
        } else {
            if ("application/x-subrip".equals(str2)) {
                zzi = zzars.zzk(Integer.toString(i2), str2, null, -1, i9, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
            } else if (!"application/vobsub".equals(str2) && !"application/pgs".equals(str2) && !"application/dvbsubs".equals(str2)) {
                throw new zzarv("Unexpected MIME type.");
            } else {
                zzi = zzars.zzi(Integer.toString(i2), str2, null, -1, arrayList, this.zzP, this.zzi);
            }
            i8 = 3;
        }
        zzaue zzbi = zzatwVar.zzbi(this.zzb, i8);
        this.zzN = zzbi;
        zzbi.zza(zzi);
    }
}
