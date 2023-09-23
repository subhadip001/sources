package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzarl implements zzari {
    private final zzarx[] zza;
    private final zzayd zzb;
    private final zzayb zzc;
    private final Handler zzd;
    private final zzarq zze;
    private final CopyOnWriteArraySet zzf;
    private final zzasc zzg;
    private final zzasb zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private zzasd zzo;
    private Object zzp;
    private zzaxp zzq;
    private zzayb zzr;
    private zzarw zzs;
    private zzarn zzt;
    private long zzu;

    public zzarl(zzarx[] zzarxVarArr, zzayd zzaydVar, zzcio zzcioVar, byte[] bArr) {
        String str = zzazn.zze;
        Log.i("ExoPlayerImpl", "Init ExoPlayerLib/2.4.2 [" + str + "]");
        this.zza = zzarxVarArr;
        Objects.requireNonNull(zzaydVar);
        this.zzb = zzaydVar;
        this.zzj = false;
        this.zzk = 1;
        this.zzf = new CopyOnWriteArraySet();
        zzayb zzaybVar = new zzayb(new zzaxt[2], null);
        this.zzc = zzaybVar;
        this.zzo = zzasd.zza;
        this.zzg = new zzasc();
        this.zzh = new zzasb();
        this.zzq = zzaxp.zza;
        this.zzr = zzaybVar;
        this.zzs = zzarw.zza;
        zzark zzarkVar = new zzark(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.zzd = zzarkVar;
        zzarn zzarnVar = new zzarn(0, 0L);
        this.zzt = zzarnVar;
        this.zze = new zzarq(zzarxVarArr, zzaydVar, zzcioVar, this.zzj, 0, zzarkVar, zzarnVar, this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final int zza() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final long zzb() {
        if (!this.zzo.zzh() && this.zzl <= 0) {
            this.zzo.zzd(this.zzt.zza, this.zzh, false);
            return zzard.zzb(this.zzt.zzd) + zzard.zzb(0L);
        }
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final long zzc() {
        if (!this.zzo.zzh() && this.zzl <= 0) {
            this.zzo.zzd(this.zzt.zza, this.zzh, false);
            return zzard.zzb(this.zzt.zzc) + zzard.zzb(0L);
        }
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final long zzd() {
        if (this.zzo.zzh()) {
            return -9223372036854775807L;
        }
        zzasd zzasdVar = this.zzo;
        zzs();
        return zzard.zzb(zzasdVar.zzg(0, this.zzg, false).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zze(zzarf zzarfVar) {
        this.zzf.add(zzarfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzf(zzarh... zzarhVarArr) {
        if (this.zze.zzr()) {
            if (this.zze.zzq(zzarhVarArr)) {
                return;
            }
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarf) it.next()).zzc(zzare.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 blockingSendMessages timeout"))));
            }
            return;
        }
        this.zze.zza(zzarhVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzg() {
        this.zze.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzh(int i2) {
        this.zze.zzc(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzi() {
        this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzj(zzaxa zzaxaVar) {
        if (!this.zzo.zzh() || this.zzp != null) {
            this.zzo = zzasd.zza;
            this.zzp = null;
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarf) it.next()).zzf(this.zzo, this.zzp);
            }
        }
        if (this.zzi) {
            this.zzi = false;
            this.zzq = zzaxp.zza;
            this.zzr = this.zzc;
            this.zzb.zzd(null);
            Iterator it2 = this.zzf.iterator();
            while (it2.hasNext()) {
                ((zzarf) it2.next()).zzg(this.zzq, this.zzr);
            }
        }
        this.zzm++;
        this.zze.zzi(zzaxaVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzk() {
        if (this.zze.zzr()) {
            if (!this.zze.zzs()) {
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzarf) it.next()).zzc(zzare.zzc(new RuntimeException(new TimeoutException("ExoPlayer3 release timeout"))));
                }
            }
            this.zzd.removeCallbacksAndMessages(null);
            return;
        }
        this.zze.zzj();
        this.zzd.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzl(zzarf zzarfVar) {
        this.zzf.remove(zzarfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzm(long j2) {
        zzs();
        if (!this.zzo.zzh() && this.zzo.zzc() <= 0) {
            throw new zzaru(this.zzo, 0, j2);
        }
        this.zzl++;
        if (!this.zzo.zzh()) {
            this.zzo.zzg(0, this.zzg, false);
            long zza = zzard.zza(j2);
            long j3 = this.zzo.zzd(0, this.zzh, false).zzc;
            if (j3 != -9223372036854775807L) {
                int i2 = (zza > j3 ? 1 : (zza == j3 ? 0 : -1));
            }
        }
        this.zzu = j2;
        this.zze.zzk(this.zzo, 0, zzard.zza(j2));
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            ((zzarf) it.next()).zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzn(zzarh... zzarhVarArr) {
        this.zze.zzl(zzarhVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzo(int i2) {
        this.zze.zzm(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzp(int i2) {
        this.zze.zzn(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzq(boolean z) {
        if (this.zzj != z) {
            this.zzj = z;
            this.zze.zzo(z);
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((zzarf) it.next()).zzd(z, this.zzk);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzr() {
        this.zze.zzp();
    }

    public final int zzs() {
        if (!this.zzo.zzh() && this.zzl <= 0) {
            this.zzo.zzd(this.zzt.zza, this.zzh, false);
        }
        return 0;
    }

    public final void zzt(Message message) {
        switch (message.what) {
            case 0:
                this.zzm--;
                return;
            case 1:
                this.zzk = message.arg1;
                Iterator it = this.zzf.iterator();
                while (it.hasNext()) {
                    ((zzarf) it.next()).zzd(this.zzj, this.zzk);
                }
                return;
            case 2:
                this.zzn = message.arg1 != 0;
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    ((zzarf) it2.next()).zza(this.zzn);
                }
                return;
            case 3:
                if (this.zzm == 0) {
                    zzaye zzayeVar = (zzaye) message.obj;
                    this.zzi = true;
                    this.zzq = zzayeVar.zza;
                    this.zzr = zzayeVar.zzb;
                    this.zzb.zzd(zzayeVar.zzc);
                    Iterator it3 = this.zzf.iterator();
                    while (it3.hasNext()) {
                        ((zzarf) it3.next()).zzg(this.zzq, this.zzr);
                    }
                    return;
                }
                return;
            case 4:
                int i2 = this.zzl - 1;
                this.zzl = i2;
                if (i2 == 0) {
                    this.zzt = (zzarn) message.obj;
                    if (message.arg1 != 0) {
                        Iterator it4 = this.zzf.iterator();
                        while (it4.hasNext()) {
                            ((zzarf) it4.next()).zze();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzl == 0) {
                    this.zzt = (zzarn) message.obj;
                    Iterator it5 = this.zzf.iterator();
                    while (it5.hasNext()) {
                        ((zzarf) it5.next()).zze();
                    }
                    return;
                }
                return;
            case 6:
                zzarp zzarpVar = (zzarp) message.obj;
                this.zzl -= zzarpVar.zzd;
                if (this.zzm == 0) {
                    this.zzo = zzarpVar.zza;
                    this.zzp = zzarpVar.zzb;
                    this.zzt = zzarpVar.zzc;
                    Iterator it6 = this.zzf.iterator();
                    while (it6.hasNext()) {
                        ((zzarf) it6.next()).zzf(this.zzo, this.zzp);
                    }
                    return;
                }
                return;
            case 7:
                zzarw zzarwVar = (zzarw) message.obj;
                if (this.zzs.equals(zzarwVar)) {
                    return;
                }
                this.zzs = zzarwVar;
                Iterator it7 = this.zzf.iterator();
                while (it7.hasNext()) {
                    ((zzarf) it7.next()).zzb(zzarwVar);
                }
                return;
            case 8:
                zzare zzareVar = (zzare) message.obj;
                Iterator it8 = this.zzf.iterator();
                while (it8.hasNext()) {
                    ((zzarf) it8.next()).zzc(zzareVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
