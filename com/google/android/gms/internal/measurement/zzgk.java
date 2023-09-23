package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class zzgk extends zzkf implements zzln {
    private static final zzgk zza;
    private int zzd;
    private int zze;
    private zzkl zzf = zzkf.zzbC();

    static {
        zzgk zzgkVar = new zzgk();
        zza = zzgkVar;
        zzkf.zzbL(zzgk.class, zzgkVar);
    }

    private zzgk() {
    }

    public static zzgj zzd() {
        return (zzgj) zza.zzbx();
    }

    public static /* synthetic */ void zzg(zzgk zzgkVar, int i2) {
        zzgkVar.zzd |= 1;
        zzgkVar.zze = i2;
    }

    public static /* synthetic */ void zzh(zzgk zzgkVar, Iterable iterable) {
        zzkl zzklVar = zzgkVar.zzf;
        if (!zzklVar.zzc()) {
            zzgkVar.zzf = zzkf.zzbD(zzklVar);
        }
        zzio.zzbt(iterable, zzgkVar.zzf);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc(int i2) {
        return this.zzf.zza(i2);
    }

    public final List zzf() {
        return this.zzf;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzkf
    public final Object zzl(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzgj(null);
                }
                return new zzgk();
            }
            return zzkf.zzbI(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
