package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaei {
    public final zzzz zza;
    public zzaew zzd;
    public zzaee zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzaev zzb = new zzaev();
    public final zzdy zzc = new zzdy();
    private final zzdy zzj = new zzdy(1);
    private final zzdy zzk = new zzdy();

    public zzaei(zzzz zzzzVar, zzaew zzaewVar, zzaee zzaeeVar) {
        this.zza = zzzzVar;
        this.zzd = zzaewVar;
        this.zze = zzaeeVar;
        zzh(zzaewVar, zzaeeVar);
    }

    public final int zza() {
        int i2;
        if (this.zzl) {
            i2 = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i2 = this.zzd.zzg[this.zzf];
        }
        return zzf() != null ? i2 | CommonUtils.BYTES_IN_A_GIGABYTE : i2;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i2, int i3) {
        zzdy zzdyVar;
        zzaeu zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i4 = zzf.zzd;
        if (i4 != 0) {
            zzdyVar = this.zzb.zzn;
        } else {
            byte[] bArr = (byte[]) zzeg.zzG(zzf.zze);
            zzdy zzdyVar2 = this.zzk;
            int length = bArr.length;
            zzdyVar2.zzD(bArr, length);
            zzdyVar = this.zzk;
            i4 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        boolean z = zzb || i3 != 0;
        zzdy zzdyVar3 = this.zzj;
        zzdyVar3.zzH()[0] = (byte) ((true != z ? 0 : 128) | i4);
        zzdyVar3.zzF(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzdyVar, i4, 1);
        if (z) {
            if (!zzb) {
                this.zzc.zzC(8);
                zzdy zzdyVar4 = this.zzc;
                byte[] zzH = zzdyVar4.zzH();
                zzH[0] = 0;
                zzH[1] = 1;
                zzH[2] = 0;
                zzH[3] = (byte) i3;
                zzH[4] = (byte) ((i2 >> 24) & 255);
                zzH[5] = (byte) ((i2 >> 16) & 255);
                zzH[6] = (byte) ((i2 >> 8) & 255);
                zzH[7] = (byte) (i2 & 255);
                this.zza.zzr(zzdyVar4, 8, 1);
                return i4 + 9;
            }
            zzdy zzdyVar5 = this.zzb.zzn;
            int zzo = zzdyVar5.zzo();
            zzdyVar5.zzG(-2);
            int i5 = (zzo * 6) + 2;
            if (i3 != 0) {
                this.zzc.zzC(i5);
                byte[] zzH2 = this.zzc.zzH();
                zzdyVar5.zzB(zzH2, 0, i5);
                int i6 = (((zzH2[2] & 255) << 8) | (zzH2[3] & 255)) + i3;
                zzH2[2] = (byte) ((i6 >> 8) & 255);
                zzH2[3] = (byte) (i6 & 255);
                zzdyVar5 = this.zzc;
            }
            this.zza.zzr(zzdyVar5, i5, 1);
            return i4 + 1 + i5;
        }
        return i4 + 1;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (this.zzl) {
            zzaev zzaevVar = this.zzb;
            return zzaevVar.zzi[this.zzf];
        }
        return this.zzd.zzf[this.zzf];
    }

    public final zzaeu zzf() {
        if (this.zzl) {
            zzaev zzaevVar = this.zzb;
            zzaee zzaeeVar = zzaevVar.zza;
            int i2 = zzeg.zza;
            int i3 = zzaeeVar.zza;
            zzaeu zzaeuVar = zzaevVar.zzm;
            if (zzaeuVar == null) {
                zzaeuVar = this.zzd.zza.zza(i3);
            }
            if (zzaeuVar == null || !zzaeuVar.zza) {
                return null;
            }
            return zzaeuVar;
        }
        return null;
    }

    public final void zzh(zzaew zzaewVar, zzaee zzaeeVar) {
        this.zzd = zzaewVar;
        this.zze = zzaeeVar;
        this.zza.zzk(zzaewVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzaev zzaevVar = this.zzb;
        zzaevVar.zzd = 0;
        zzaevVar.zzp = 0L;
        zzaevVar.zzq = false;
        zzaevVar.zzk = false;
        zzaevVar.zzo = false;
        zzaevVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (this.zzl) {
            int i2 = this.zzg + 1;
            this.zzg = i2;
            int[] iArr = this.zzb.zzg;
            int i3 = this.zzh;
            if (i2 == iArr[i3]) {
                this.zzh = i3 + 1;
                this.zzg = 0;
                return false;
            }
            return true;
        }
        return false;
    }
}
