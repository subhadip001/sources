package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzalv extends zzgko implements zzglz {
    private static final zzalv zzb;
    private int zze;
    private long zzu;
    private long zzv;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = 1000;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        zzalv zzalvVar = new zzalv();
        zzb = zzalvVar;
        zzgko.zzaN(zzalv.class, zzalvVar);
    }

    private zzalv() {
    }

    public static zzalu zza() {
        return (zzalu) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 1;
        zzalvVar.zzf = j2;
    }

    public static /* synthetic */ void zze(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 2;
        zzalvVar.zzg = j2;
    }

    public static /* synthetic */ void zzf(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 4;
        zzalvVar.zzh = j2;
    }

    public static /* synthetic */ void zzg(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 8;
        zzalvVar.zzi = j2;
    }

    public static /* synthetic */ void zzh(zzalv zzalvVar) {
        zzalvVar.zze &= -9;
        zzalvVar.zzi = -1L;
    }

    public static /* synthetic */ void zzi(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 16;
        zzalvVar.zzj = j2;
    }

    public static /* synthetic */ void zzj(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 32;
        zzalvVar.zzk = j2;
    }

    public static /* synthetic */ void zzk(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 128;
        zzalvVar.zzm = j2;
    }

    public static /* synthetic */ void zzl(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 256;
        zzalvVar.zzn = j2;
    }

    public static /* synthetic */ void zzm(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 512;
        zzalvVar.zzo = j2;
    }

    public static /* synthetic */ void zzn(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= RecyclerView.a0.FLAG_MOVED;
        zzalvVar.zzq = j2;
    }

    public static /* synthetic */ void zzo(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 4096;
        zzalvVar.zzr = j2;
    }

    public static /* synthetic */ void zzp(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 8192;
        zzalvVar.zzs = j2;
    }

    public static /* synthetic */ void zzq(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 16384;
        zzalvVar.zzt = j2;
    }

    public static /* synthetic */ void zzr(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 32768;
        zzalvVar.zzu = j2;
    }

    public static /* synthetic */ void zzs(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= LogFileManager.MAX_LOG_SIZE;
        zzalvVar.zzv = j2;
    }

    public static /* synthetic */ void zzt(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 131072;
        zzalvVar.zzw = j2;
    }

    public static /* synthetic */ void zzu(zzalv zzalvVar, long j2) {
        zzalvVar.zze |= 262144;
        zzalvVar.zzx = j2;
    }

    public static /* synthetic */ void zzv(zzalv zzalvVar, int i2) {
        zzalvVar.zzl = i2 - 1;
        zzalvVar.zze |= 64;
    }

    public static /* synthetic */ void zzw(zzalv zzalvVar, int i2) {
        zzalvVar.zzp = i2 - 1;
        zzalvVar.zze |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                zzgks zzgksVar = zzame.zza;
                return zzgko.zzaM(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgksVar, "zzm", "zzn", "zzo", "zzp", zzgksVar, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
            } else if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzalu(null);
            } else {
                return new zzalv();
            }
        }
        return (byte) 1;
    }
}
