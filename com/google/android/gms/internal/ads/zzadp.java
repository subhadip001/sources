package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzadp implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzadn
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzadp.zza;
            return new zzys[]{new zzadp(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private static final zzabz zzb = new zzabz() { // from class: com.google.android.gms.internal.ads.zzado
    };
    private final zzdy zzc;
    private final zzzl zzd;
    private final zzzh zze;
    private final zzzj zzf;
    private final zzzz zzg;
    private zzyv zzh;
    private zzzz zzi;
    private zzzz zzj;
    private int zzk;
    private zzbl zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzadr zzq;
    private boolean zzr;

    public zzadp() {
        this(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzf(com.google.android.gms.internal.ads.zzyt r17) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadp.zzf(com.google.android.gms.internal.ads.zzyt):int");
    }

    private final long zzg(long j2) {
        return ((j2 * 1000000) / this.zzd.zzd) + this.zzm;
    }

    private final zzadr zzh(zzyt zzytVar, boolean z) {
        ((zzym) zzytVar).zzm(this.zzc.zzH(), 0, 4, false);
        this.zzc.zzF(0);
        this.zzd.zza(this.zzc.zze());
        return new zzadk(zzytVar.zzd(), zzytVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i2, long j2) {
        return ((long) (i2 & (-128000))) == (j2 & (-128000));
    }

    private final boolean zzj(zzyt zzytVar) {
        zzadr zzadrVar = this.zzq;
        if (zzadrVar != null) {
            long zzb2 = zzadrVar.zzb();
            if (zzb2 != -1 && zzytVar.zze() > zzb2 - 4) {
                return true;
            }
        }
        try {
            return !zzytVar.zzm(this.zzc.zzH(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzyt zzytVar, boolean z) {
        int i2;
        int i3;
        int zzb2;
        int i4 = true != z ? 131072 : 32768;
        zzytVar.zzj();
        if (zzytVar.zzf() == 0) {
            zzbl zza2 = this.zzf.zza(zzytVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i3 = (int) zzytVar.zze();
            if (!z) {
                ((zzym) zzytVar).zzo(i3, false);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (!zzj(zzytVar)) {
                this.zzc.zzF(0);
                int zze = this.zzc.zze();
                if ((i2 == 0 || zzi(zze, i2)) && (zzb2 = zzzm.zzb(zze)) != -1) {
                    i5++;
                    if (i5 != 1) {
                        if (i5 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zze);
                        i2 = zze;
                    }
                    ((zzym) zzytVar).zzl(zzb2 - 4, false);
                } else {
                    int i7 = i6 + 1;
                    if (i6 == i4) {
                        if (z) {
                            return false;
                        }
                        throw zzbp.zza("Searched too many bytes.", null);
                    }
                    if (z) {
                        zzytVar.zzj();
                        ((zzym) zzytVar).zzl(i3 + i7, false);
                    } else {
                        ((zzym) zzytVar).zzo(1, false);
                    }
                    i6 = i7;
                    i2 = 0;
                    i5 = 0;
                }
            } else if (i5 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzym) zzytVar).zzo(i3 + i6, false);
        } else {
            zzytVar.zzj();
        }
        this.zzk = i2;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final int zza(zzyt zzytVar, zzzs zzzsVar) {
        zzcw.zzb(this.zzi);
        int i2 = zzeg.zza;
        int zzf = zzf(zzytVar);
        if (zzf == -1 && (this.zzq instanceof zzadl)) {
            if (this.zzq.zze() != zzg(this.zzn)) {
                zzadl zzadlVar = (zzadl) this.zzq;
                throw null;
            }
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzh = zzyvVar;
        zzzz zzv = zzyvVar.zzv(0, 1);
        this.zzi = zzv;
        this.zzj = zzv;
        this.zzh.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j2, long j3) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzadr zzadrVar = this.zzq;
        if (zzadrVar instanceof zzadl) {
            zzadl zzadlVar = (zzadl) zzadrVar;
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) {
        return zzk(zzytVar, true);
    }

    public final void zze() {
        this.zzr = true;
    }

    public zzadp(int i2) {
        this.zzc = new zzdy(10);
        this.zzd = new zzzl();
        this.zze = new zzzh();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzzj();
        zzyr zzyrVar = new zzyr();
        this.zzg = zzyrVar;
        this.zzj = zzyrVar;
    }
}
