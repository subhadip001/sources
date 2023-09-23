package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgni {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i2, int i3);

    public abstract void zzi(Object obj, int i2, long j2);

    public abstract void zzj(Object obj, int i2, Object obj2);

    public abstract void zzk(Object obj, int i2, zzgjg zzgjgVar);

    public abstract void zzl(Object obj, int i2, long j2);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public final boolean zzp(Object obj, zzgmj zzgmjVar) {
        int zzd = zzgmjVar.zzd();
        int i2 = zzd >>> 3;
        int i3 = zzd & 7;
        if (i3 == 0) {
            zzl(obj, i2, zzgmjVar.zzl());
            return true;
        } else if (i3 == 1) {
            zzi(obj, i2, zzgmjVar.zzk());
            return true;
        } else if (i3 == 2) {
            zzk(obj, i2, zzgmjVar.zzp());
            return true;
        } else if (i3 != 3) {
            if (i3 != 4) {
                if (i3 == 5) {
                    zzh(obj, i2, zzgmjVar.zzf());
                    return true;
                }
                throw zzgla.zza();
            }
            return false;
        } else {
            Object zzf = zzf();
            int i4 = 4 | (i2 << 3);
            while (zzgmjVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzgmjVar)) {
            }
            if (i4 == zzgmjVar.zzd()) {
                zzg(zzf);
                zzj(obj, i2, zzf);
                return true;
            }
            throw zzgla.zzb();
        }
    }

    public abstract boolean zzq(zzgmj zzgmjVar);

    public abstract void zzr(Object obj, zzgjw zzgjwVar);
}
