package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaly extends zzgko implements zzglz {
    private static final zzaly zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzG;
    private long zzH;
    private long zzI;
    private long zzK;
    private zzama zzN;
    private zzalt zzaD;
    private long zzaJ;
    private long zzaK;
    private boolean zzaN;
    private long zzaP;
    private zzamh zzaQ;
    private long zzaR;
    private zzalv zzaf;
    private zzalx zzah;
    private int zzas;
    private int zzat;
    private int zzau;
    private zzamj zzav;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzh = "";
    private String zzi = "";
    private String zzt = "";
    private String zzD = "";
    private String zzE = "D";
    private String zzF = "";
    private String zzJ = "";
    private long zzL = -1;
    private long zzM = -1;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private String zzU = "D";
    private String zzV = "D";
    private long zzW = -1;
    private int zzX = 1000;
    private int zzY = 1000;
    private long zzZ = -1;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private int zzae = 1000;
    private zzgkx zzag = zzgko.zzaH();
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private String zzaq = "D";
    private long zzar = -1;
    private long zzaw = -1;
    private int zzax = 1000;
    private int zzay = 1000;
    private String zzaz = "D";
    private zzgkx zzaA = zzgko.zzaH();
    private int zzaB = 1000;
    private zzgkx zzaC = zzgko.zzaH();
    private String zzaE = "";
    private long zzaF = -1;
    private long zzaG = -1;
    private long zzaH = -1;
    private long zzaI = -1;
    private String zzaL = "";
    private int zzaM = 2;
    private String zzaO = "";
    private String zzaS = "";

    static {
        zzaly zzalyVar = new zzaly();
        zzb = zzalyVar;
        zzgko.zzaN(zzaly.class, zzalyVar);
    }

    private zzaly() {
    }

    public static /* synthetic */ void zzA(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= 134217728;
        zzalyVar.zzI = j2;
    }

    public static /* synthetic */ void zzB(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zze |= 268435456;
        zzalyVar.zzJ = str;
    }

    public static /* synthetic */ void zzC(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= 536870912;
        zzalyVar.zzK = j2;
    }

    public static /* synthetic */ void zzD(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= CommonUtils.BYTES_IN_A_GIGABYTE;
        zzalyVar.zzL = j2;
    }

    public static /* synthetic */ void zzE(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= Integer.MIN_VALUE;
        zzalyVar.zzM = j2;
    }

    public static /* synthetic */ void zzF(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 2;
        zzalyVar.zzO = j2;
    }

    public static /* synthetic */ void zzG(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 4;
        zzalyVar.zzP = j2;
    }

    public static /* synthetic */ void zzH(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 8;
        zzalyVar.zzQ = j2;
    }

    public static /* synthetic */ void zzI(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 16;
        zzalyVar.zzR = j2;
    }

    public static /* synthetic */ void zzJ(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 32;
        zzalyVar.zzS = j2;
    }

    public static /* synthetic */ void zzK(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 64;
        zzalyVar.zzT = j2;
    }

    public static /* synthetic */ void zzL(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zzf |= 128;
        zzalyVar.zzU = str;
    }

    public static /* synthetic */ void zzM(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zzf |= 256;
        zzalyVar.zzV = str;
    }

    public static /* synthetic */ void zzN(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 4096;
        zzalyVar.zzZ = j2;
    }

    public static /* synthetic */ void zzO(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 8192;
        zzalyVar.zzaa = j2;
    }

    public static /* synthetic */ void zzP(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 16384;
        zzalyVar.zzab = j2;
    }

    public static /* synthetic */ void zzQ(zzaly zzalyVar, zzalv zzalvVar) {
        zzalvVar.getClass();
        zzalyVar.zzaf = zzalvVar;
        zzalyVar.zzf |= 262144;
    }

    public static /* synthetic */ void zzR(zzaly zzalyVar, zzalv zzalvVar) {
        zzalvVar.getClass();
        zzgkx zzgkxVar = zzalyVar.zzag;
        if (!zzgkxVar.zzc()) {
            zzalyVar.zzag = zzgko.zzaI(zzgkxVar);
        }
        zzalyVar.zzag.add(zzalvVar);
    }

    public static /* synthetic */ void zzT(zzaly zzalyVar, zzalx zzalxVar) {
        zzalxVar.getClass();
        zzalyVar.zzah = zzalxVar;
        zzalyVar.zzf |= 524288;
    }

    public static /* synthetic */ void zzU(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 2097152;
        zzalyVar.zzaj = j2;
    }

    public static /* synthetic */ void zzV(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 4194304;
        zzalyVar.zzak = j2;
    }

    public static /* synthetic */ void zzW(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 8388608;
        zzalyVar.zzal = j2;
    }

    public static /* synthetic */ void zzX(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 67108864;
        zzalyVar.zzao = j2;
    }

    public static /* synthetic */ void zzY(zzaly zzalyVar, long j2) {
        zzalyVar.zzf |= 134217728;
        zzalyVar.zzap = j2;
    }

    public static /* synthetic */ void zzZ(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zzf |= 268435456;
        zzalyVar.zzaq = str;
    }

    public static zzali zza() {
        return (zzali) zzb.zzaw();
    }

    public static /* synthetic */ void zzaa(zzaly zzalyVar, long j2) {
        zzalyVar.zzg |= 512;
        zzalyVar.zzaF = j2;
    }

    public static /* synthetic */ void zzab(zzaly zzalyVar, long j2) {
        zzalyVar.zzg |= 1024;
        zzalyVar.zzaG = j2;
    }

    public static /* synthetic */ void zzac(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zzg |= 32768;
        zzalyVar.zzaL = str;
    }

    public static /* synthetic */ void zzad(zzaly zzalyVar, boolean z) {
        zzalyVar.zzg |= 131072;
        zzalyVar.zzaN = z;
    }

    public static /* synthetic */ void zzae(zzaly zzalyVar, long j2) {
        zzalyVar.zzg |= 524288;
        zzalyVar.zzaP = j2;
    }

    public static /* synthetic */ void zzaj(zzaly zzalyVar, int i2) {
        zzalyVar.zzX = i2 - 1;
        zzalyVar.zzf |= 1024;
    }

    public static /* synthetic */ void zzak(zzaly zzalyVar, int i2) {
        zzalyVar.zzY = i2 - 1;
        zzalyVar.zzf |= RecyclerView.a0.FLAG_MOVED;
    }

    public static /* synthetic */ void zzal(zzaly zzalyVar, int i2) {
        zzalyVar.zzae = i2 - 1;
        zzalyVar.zzf |= 131072;
    }

    public static /* synthetic */ void zzam(zzaly zzalyVar, int i2) {
        zzalyVar.zzax = i2 - 1;
        zzalyVar.zzg |= 8;
    }

    public static /* synthetic */ void zzan(zzaly zzalyVar, int i2) {
        zzalyVar.zzay = i2 - 1;
        zzalyVar.zzg |= 16;
    }

    public static /* synthetic */ void zzao(zzaly zzalyVar, int i2) {
        zzalyVar.zzaM = 5;
        zzalyVar.zzg |= LogFileManager.MAX_LOG_SIZE;
    }

    public static zzaly zzd() {
        return zzb;
    }

    public static zzaly zze(byte[] bArr, zzgka zzgkaVar) {
        return (zzaly) zzgko.zzaD(zzb, bArr, zzgkaVar);
    }

    public static /* synthetic */ void zzi(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zze |= 1;
        zzalyVar.zzh = str;
    }

    public static /* synthetic */ void zzj(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zze |= 2;
        zzalyVar.zzi = str;
    }

    public static /* synthetic */ void zzk(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= 4;
        zzalyVar.zzj = j2;
    }

    public static /* synthetic */ void zzl(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= 16;
        zzalyVar.zzl = j2;
    }

    public static /* synthetic */ void zzm(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= 32;
        zzalyVar.zzm = j2;
    }

    public static /* synthetic */ void zzn(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= 1024;
        zzalyVar.zzr = j2;
    }

    public static /* synthetic */ void zzo(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= RecyclerView.a0.FLAG_MOVED;
        zzalyVar.zzs = j2;
    }

    public static /* synthetic */ void zzp(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= 8192;
        zzalyVar.zzu = j2;
    }

    public static /* synthetic */ void zzq(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= 16384;
        zzalyVar.zzv = j2;
    }

    public static /* synthetic */ void zzr(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= 32768;
        zzalyVar.zzw = j2;
    }

    public static /* synthetic */ void zzs(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= LogFileManager.MAX_LOG_SIZE;
        zzalyVar.zzx = j2;
    }

    public static /* synthetic */ void zzt(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= 524288;
        zzalyVar.zzA = j2;
    }

    public static /* synthetic */ void zzu(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= CommonUtils.BYTES_IN_A_MEGABYTE;
        zzalyVar.zzB = j2;
    }

    public static /* synthetic */ void zzv(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= 2097152;
        zzalyVar.zzC = j2;
    }

    public static /* synthetic */ void zzw(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zze |= 4194304;
        zzalyVar.zzD = str;
    }

    public static /* synthetic */ void zzx(zzaly zzalyVar, String str) {
        str.getClass();
        zzalyVar.zze |= 16777216;
        zzalyVar.zzF = str;
    }

    public static /* synthetic */ void zzy(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= 33554432;
        zzalyVar.zzG = j2;
    }

    public static /* synthetic */ void zzz(zzaly zzalyVar, long j2) {
        zzalyVar.zze |= 67108864;
        zzalyVar.zzH = j2;
    }

    public final boolean zzaf() {
        return this.zzaN;
    }

    public final boolean zzag() {
        return (this.zze & 4194304) != 0;
    }

    public final boolean zzah() {
        return (this.zzg & CommonUtils.BYTES_IN_A_MEGABYTE) != 0;
    }

    public final int zzai() {
        int zza = zzalo.zza(this.zzaM);
        if (zza == 0) {
            return 3;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                zzgks zzgksVar = zzame.zza;
                return zzgko.zzaM(zzb, "\u0001Z\u0000\u0003\u0001ĮZ\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂN\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈO\u0019ဂS\u001aဌP\u001bဈ\u0016\u001cဇQ\u001dဈ\u0018\u001eဈR\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMÉဉTĭဂUĮဈV", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzaK", "zzB", "zzC", "zzaL", "zzaP", "zzaM", zzaln.zza, "zzD", "zzaN", "zzF", "zzaO", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzag", zzalv.class, "zzS", "zzT", "zzU", "zzV", "zzX", zzgksVar, "zzY", zzgksVar, "zzaf", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", zzgksVar, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzao", "zzap", "zzar", "zzas", zzamd.zza, "zzat", zzamf.zza, "zzaq", "zzau", zzalj.zza, "zzav", "zzaw", "zzam", "zzan", "zzax", zzgksVar, "zzW", "zzE", "zzay", zzgksVar, "zzaz", "zzaA", zzalr.class, "zzaB", zzgksVar, "zzaC", zzall.class, "zzaD", "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaQ", "zzaR", "zzaS"});
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzali(null);
            } else {
                return new zzaly();
            }
        }
        return (byte) 1;
    }

    public final zzamh zzf() {
        zzamh zzamhVar = this.zzaQ;
        return zzamhVar == null ? zzamh.zzd() : zzamhVar;
    }

    public final String zzg() {
        return this.zzaL;
    }

    public final String zzh() {
        return this.zzD;
    }
}
