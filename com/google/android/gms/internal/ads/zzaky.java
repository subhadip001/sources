package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaky extends zzgko implements zzglz {
    private static final zzaky zzb;
    private int zze;
    private long zzg;
    private long zzk;
    private long zzl;
    private long zzn;
    private int zzr;
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzm = "";
    private String zzo = "";
    private String zzp = "";
    private zzgkx zzq = zzgko.zzaH();

    static {
        zzaky zzakyVar = new zzaky();
        zzb = zzakyVar;
        zzgko.zzaN(zzaky.class, zzakyVar);
    }

    private zzaky() {
    }

    public static zzaku zza() {
        return (zzaku) zzb.zzaw();
    }

    public static /* synthetic */ void zzd(zzaky zzakyVar, long j2) {
        zzakyVar.zze |= 2;
        zzakyVar.zzg = j2;
    }

    public static /* synthetic */ void zze(zzaky zzakyVar, String str) {
        str.getClass();
        zzakyVar.zze |= 4;
        zzakyVar.zzh = str;
    }

    public static /* synthetic */ void zzf(zzaky zzakyVar, String str) {
        str.getClass();
        zzakyVar.zze |= 8;
        zzakyVar.zzi = str;
    }

    public static /* synthetic */ void zzg(zzaky zzakyVar, String str) {
        zzakyVar.zze |= 16;
        zzakyVar.zzj = str;
    }

    public static /* synthetic */ void zzh(zzaky zzakyVar, String str) {
        zzakyVar.zze |= 1024;
        zzakyVar.zzp = str;
    }

    public static /* synthetic */ void zzi(zzaky zzakyVar, String str) {
        str.getClass();
        zzakyVar.zze |= 1;
        zzakyVar.zzf = str;
    }

    public static /* synthetic */ void zzj(zzaky zzakyVar, int i2) {
        zzakyVar.zzr = i2 - 1;
        zzakyVar.zze |= RecyclerView.a0.FLAG_MOVED;
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaku(null);
                }
                return new zzaky();
            }
            return zzgko.zzaM(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", zzakw.class, "zzr", zzakx.zza});
        }
        return (byte) 1;
    }
}
