package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaxj implements zzaue {
    private zzaxh zze;
    private zzaxh zzf;
    private zzars zzg;
    private zzars zzh;
    private long zzi;
    private zzaxi zzk;
    private final zzayl zzl;
    private final zzaxg zza = new zzaxg();
    private final zzaxf zzb = new zzaxf();
    private final zzazg zzc = new zzazg(32);
    private final AtomicInteger zzd = new AtomicInteger();
    private int zzj = LogFileManager.MAX_LOG_SIZE;

    public zzaxj(zzayl zzaylVar, byte[] bArr) {
        this.zzl = zzaylVar;
        zzaxh zzaxhVar = new zzaxh(0L, LogFileManager.MAX_LOG_SIZE);
        this.zze = zzaxhVar;
        this.zzf = zzaxhVar;
    }

    private final int zzo(int i2) {
        if (this.zzj == 65536) {
            this.zzj = 0;
            zzaxh zzaxhVar = this.zzf;
            if (zzaxhVar.zzc) {
                this.zzf = zzaxhVar.zze;
            }
            zzaxh zzaxhVar2 = this.zzf;
            zzayf zzb = this.zzl.zzb();
            zzaxh zzaxhVar3 = new zzaxh(this.zzf.zzb, LogFileManager.MAX_LOG_SIZE);
            zzaxhVar2.zzd = zzb;
            zzaxhVar2.zze = zzaxhVar3;
            zzaxhVar2.zzc = true;
        }
        return Math.min(i2, LogFileManager.MAX_LOG_SIZE - this.zzj);
    }

    private final void zzp() {
        this.zza.zzg();
        zzaxh zzaxhVar = this.zze;
        if (zzaxhVar.zzc) {
            zzaxh zzaxhVar2 = this.zzf;
            int i2 = (((int) (zzaxhVar2.zza - zzaxhVar.zza)) / LogFileManager.MAX_LOG_SIZE) + (zzaxhVar2.zzc ? 1 : 0);
            zzayf[] zzayfVarArr = new zzayf[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                zzayfVarArr[i3] = zzaxhVar.zzd;
                zzaxhVar.zzd = null;
                zzaxhVar = zzaxhVar.zze;
            }
            this.zzl.zzd(zzayfVarArr);
        }
        zzaxh zzaxhVar3 = new zzaxh(0L, LogFileManager.MAX_LOG_SIZE);
        this.zze = zzaxhVar3;
        this.zzf = zzaxhVar3;
        this.zzi = 0L;
        this.zzj = LogFileManager.MAX_LOG_SIZE;
        this.zzl.zzg();
    }

    private final void zzq(long j2) {
        while (true) {
            zzaxh zzaxhVar = this.zze;
            if (j2 < zzaxhVar.zzb) {
                return;
            }
            this.zzl.zzc(zzaxhVar.zzd);
            zzaxh zzaxhVar2 = this.zze;
            zzaxhVar2.zzd = null;
            this.zze = zzaxhVar2.zze;
        }
    }

    private final void zzr() {
        if (this.zzd.compareAndSet(1, 0)) {
            return;
        }
        zzp();
    }

    private final void zzs(long j2, byte[] bArr, int i2) {
        zzq(j2);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (int) (j2 - this.zze.zza);
            int min = Math.min(i2 - i3, LogFileManager.MAX_LOG_SIZE - i4);
            zzayf zzayfVar = this.zze.zzd;
            System.arraycopy(zzayfVar.zza, i4, bArr, i3, min);
            j2 += min;
            i3 += min;
            if (j2 == this.zze.zzb) {
                this.zzl.zzc(zzayfVar);
                zzaxh zzaxhVar = this.zze;
                zzaxhVar.zzd = null;
                this.zze = zzaxhVar.zze;
            }
        }
    }

    private final boolean zzt() {
        return this.zzd.compareAndSet(0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final void zza(zzars zzarsVar) {
        zzars zzarsVar2 = zzarsVar == null ? null : zzarsVar;
        boolean zzk = this.zza.zzk(zzarsVar2);
        this.zzh = zzarsVar;
        zzaxi zzaxiVar = this.zzk;
        if (zzaxiVar == null || !zzk) {
            return;
        }
        zzaxiVar.zzv(zzarsVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final void zzb(zzazg zzazgVar, int i2) {
        if (zzt()) {
            while (i2 > 0) {
                int zzo = zzo(i2);
                zzazgVar.zzq(this.zzf.zzd.zza, this.zzj, zzo);
                this.zzj += zzo;
                this.zzi += zzo;
                i2 -= zzo;
            }
            zzr();
            return;
        }
        zzazgVar.zzw(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final void zzc(long j2, int i2, int i3, int i4, zzaud zzaudVar) {
        if (zzt()) {
            try {
                this.zza.zzh(j2, i2, this.zzi - i3, i3, zzaudVar);
                return;
            } finally {
                zzr();
            }
        }
        this.zza.zzi(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaue
    public final int zzd(zzatu zzatuVar, int i2, boolean z) {
        if (!zzt()) {
            int zzb = zzatuVar.zzb(i2);
            if (zzb != -1) {
                return zzb;
            }
            throw new EOFException();
        }
        try {
            int zza = zzatuVar.zza(this.zzf.zzd.zza, this.zzj, zzo(i2));
            if (zza != -1) {
                this.zzj += zza;
                this.zzi += zza;
                return zza;
            }
            throw new EOFException();
        } finally {
            zzr();
        }
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final int zzf(zzart zzartVar, zzatn zzatnVar, boolean z, boolean z2, long j2) {
        int i2;
        int zzb = this.zza.zzb(zzartVar, zzatnVar, z, z2, this.zzg, this.zzb);
        if (zzb == -5) {
            this.zzg = zzartVar.zza;
            return -5;
        } else if (zzb != -4) {
            return -3;
        } else {
            if (!zzatnVar.zzf()) {
                if (zzatnVar.zzc < j2) {
                    zzatnVar.zza(Integer.MIN_VALUE);
                }
                if (zzatnVar.zzi()) {
                    zzaxf zzaxfVar = this.zzb;
                    long j3 = zzaxfVar.zzb;
                    this.zzc.zzs(1);
                    zzs(j3, this.zzc.zza, 1);
                    long j4 = j3 + 1;
                    byte b = this.zzc.zza[0];
                    int i3 = b & 128;
                    int i4 = b & Byte.MAX_VALUE;
                    zzatl zzatlVar = zzatnVar.zza;
                    if (zzatlVar.zza == null) {
                        zzatlVar.zza = new byte[16];
                    }
                    zzs(j4, zzatlVar.zza, i4);
                    long j5 = j4 + i4;
                    if (i3 != 0) {
                        this.zzc.zzs(2);
                        zzs(j5, this.zzc.zza, 2);
                        j5 += 2;
                        i2 = this.zzc.zzj();
                    } else {
                        i2 = 1;
                    }
                    zzatl zzatlVar2 = zzatnVar.zza;
                    int[] iArr = zzatlVar2.zzd;
                    if (iArr == null || iArr.length < i2) {
                        iArr = new int[i2];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzatlVar2.zze;
                    if (iArr3 == null || iArr3.length < i2) {
                        iArr3 = new int[i2];
                    }
                    int[] iArr4 = iArr3;
                    if (i3 != 0) {
                        int i5 = i2 * 6;
                        this.zzc.zzs(i5);
                        zzs(j5, this.zzc.zza, i5);
                        j5 += i5;
                        this.zzc.zzv(0);
                        for (int i6 = 0; i6 < i2; i6++) {
                            iArr2[i6] = this.zzc.zzj();
                            iArr4[i6] = this.zzc.zzi();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzaxfVar.zza - ((int) (j5 - zzaxfVar.zzb));
                    }
                    zzaud zzaudVar = zzaxfVar.zzd;
                    zzatl zzatlVar3 = zzatnVar.zza;
                    zzatlVar3.zzb(i2, iArr2, iArr4, zzaudVar.zzb, zzatlVar3.zza, 1);
                    long j6 = zzaxfVar.zzb;
                    int i7 = (int) (j5 - j6);
                    zzaxfVar.zzb = j6 + i7;
                    zzaxfVar.zza -= i7;
                }
                zzatnVar.zzh(this.zzb.zza);
                zzaxf zzaxfVar2 = this.zzb;
                long j7 = zzaxfVar2.zzb;
                ByteBuffer byteBuffer = zzatnVar.zzb;
                int i8 = zzaxfVar2.zza;
                zzq(j7);
                while (i8 > 0) {
                    int i9 = (int) (j7 - this.zze.zza);
                    int min = Math.min(i8, LogFileManager.MAX_LOG_SIZE - i9);
                    zzayf zzayfVar = this.zze.zzd;
                    byteBuffer.put(zzayfVar.zza, i9, min);
                    j7 += min;
                    i8 -= min;
                    if (j7 == this.zze.zzb) {
                        this.zzl.zzc(zzayfVar);
                        zzaxh zzaxhVar = this.zze;
                        zzaxhVar.zzd = null;
                        this.zze = zzaxhVar.zze;
                    }
                }
                zzq(this.zzb.zzc);
            }
            return -4;
        }
    }

    public final long zzg() {
        return this.zza.zzc();
    }

    public final zzars zzh() {
        return this.zza.zzf();
    }

    public final void zzi() {
        if (this.zzd.getAndSet(2) == 0) {
            zzp();
        }
    }

    public final void zzj(boolean z) {
        int andSet = this.zzd.getAndSet(true != z ? 2 : 0);
        zzp();
        this.zza.zzj();
        if (andSet == 2) {
            this.zzg = null;
        }
    }

    public final void zzk(zzaxi zzaxiVar) {
        this.zzk = zzaxiVar;
    }

    public final void zzl() {
        long zzd = this.zza.zzd();
        if (zzd != -1) {
            zzq(zzd);
        }
    }

    public final boolean zzm() {
        return this.zza.zzl();
    }

    public final boolean zzn(long j2, boolean z) {
        long zze = this.zza.zze(j2, z);
        if (zze == -1) {
            return false;
        }
        zzq(zze);
        return true;
    }
}
