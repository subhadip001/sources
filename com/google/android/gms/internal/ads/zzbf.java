package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbf {
    private CharSequence zza;
    private CharSequence zzb;
    private CharSequence zzc;
    private CharSequence zzd;
    private CharSequence zze;
    private byte[] zzf;
    private Integer zzg;
    private Integer zzh;
    private Integer zzi;
    private Integer zzj;
    private Integer zzk;
    private Integer zzl;
    private Integer zzm;
    private Integer zzn;
    private Integer zzo;
    private CharSequence zzp;
    private CharSequence zzq;
    private CharSequence zzr;
    private CharSequence zzs;
    private CharSequence zzt;

    public zzbf() {
    }

    public /* synthetic */ zzbf(zzbh zzbhVar, zzbe zzbeVar) {
        this.zza = zzbhVar.zzc;
        this.zzb = zzbhVar.zzd;
        this.zzc = zzbhVar.zze;
        this.zzd = zzbhVar.zzf;
        this.zze = zzbhVar.zzg;
        this.zzf = zzbhVar.zzh;
        this.zzg = zzbhVar.zzi;
        this.zzh = zzbhVar.zzj;
        this.zzi = zzbhVar.zzk;
        this.zzj = zzbhVar.zzm;
        this.zzk = zzbhVar.zzn;
        this.zzl = zzbhVar.zzo;
        this.zzm = zzbhVar.zzp;
        this.zzn = zzbhVar.zzq;
        this.zzo = zzbhVar.zzr;
        this.zzp = zzbhVar.zzs;
        this.zzq = zzbhVar.zzt;
        this.zzr = zzbhVar.zzu;
        this.zzs = zzbhVar.zzv;
        this.zzt = zzbhVar.zzw;
    }

    public final zzbf zza(byte[] bArr, int i2) {
        if (this.zzf == null || zzeg.zzS(Integer.valueOf(i2), 3) || !zzeg.zzS(this.zzg, 3)) {
            this.zzf = (byte[]) bArr.clone();
            this.zzg = Integer.valueOf(i2);
        }
        return this;
    }

    public final zzbf zzb(zzbh zzbhVar) {
        CharSequence charSequence = zzbhVar.zzc;
        if (charSequence != null) {
            this.zza = charSequence;
        }
        CharSequence charSequence2 = zzbhVar.zzd;
        if (charSequence2 != null) {
            this.zzb = charSequence2;
        }
        CharSequence charSequence3 = zzbhVar.zze;
        if (charSequence3 != null) {
            this.zzc = charSequence3;
        }
        CharSequence charSequence4 = zzbhVar.zzf;
        if (charSequence4 != null) {
            this.zzd = charSequence4;
        }
        CharSequence charSequence5 = zzbhVar.zzg;
        if (charSequence5 != null) {
            this.zze = charSequence5;
        }
        byte[] bArr = zzbhVar.zzh;
        if (bArr != null) {
            zzf(bArr, zzbhVar.zzi);
        }
        Integer num = zzbhVar.zzj;
        if (num != null) {
            this.zzh = num;
        }
        Integer num2 = zzbhVar.zzk;
        if (num2 != null) {
            this.zzi = num2;
        }
        Integer num3 = zzbhVar.zzl;
        if (num3 != null) {
            this.zzj = num3;
        }
        Integer num4 = zzbhVar.zzm;
        if (num4 != null) {
            this.zzj = num4;
        }
        Integer num5 = zzbhVar.zzn;
        if (num5 != null) {
            this.zzk = num5;
        }
        Integer num6 = zzbhVar.zzo;
        if (num6 != null) {
            this.zzl = num6;
        }
        Integer num7 = zzbhVar.zzp;
        if (num7 != null) {
            this.zzm = num7;
        }
        Integer num8 = zzbhVar.zzq;
        if (num8 != null) {
            this.zzn = num8;
        }
        Integer num9 = zzbhVar.zzr;
        if (num9 != null) {
            this.zzo = num9;
        }
        CharSequence charSequence6 = zzbhVar.zzs;
        if (charSequence6 != null) {
            this.zzp = charSequence6;
        }
        CharSequence charSequence7 = zzbhVar.zzt;
        if (charSequence7 != null) {
            this.zzq = charSequence7;
        }
        CharSequence charSequence8 = zzbhVar.zzu;
        if (charSequence8 != null) {
            this.zzr = charSequence8;
        }
        CharSequence charSequence9 = zzbhVar.zzv;
        if (charSequence9 != null) {
            this.zzs = charSequence9;
        }
        CharSequence charSequence10 = zzbhVar.zzw;
        if (charSequence10 != null) {
            this.zzt = charSequence10;
        }
        return this;
    }

    public final zzbf zzc(CharSequence charSequence) {
        this.zzd = charSequence;
        return this;
    }

    public final zzbf zzd(CharSequence charSequence) {
        this.zzc = charSequence;
        return this;
    }

    public final zzbf zze(CharSequence charSequence) {
        this.zzb = charSequence;
        return this;
    }

    public final zzbf zzf(byte[] bArr, Integer num) {
        this.zzf = (byte[]) bArr.clone();
        this.zzg = num;
        return this;
    }

    public final zzbf zzg(CharSequence charSequence) {
        this.zzq = charSequence;
        return this;
    }

    public final zzbf zzh(CharSequence charSequence) {
        this.zzr = charSequence;
        return this;
    }

    public final zzbf zzi(CharSequence charSequence) {
        this.zze = charSequence;
        return this;
    }

    public final zzbf zzj(CharSequence charSequence) {
        this.zzs = charSequence;
        return this;
    }

    public final zzbf zzk(Integer num) {
        this.zzl = num;
        return this;
    }

    public final zzbf zzl(Integer num) {
        this.zzk = num;
        return this;
    }

    public final zzbf zzm(Integer num) {
        this.zzj = num;
        return this;
    }

    public final zzbf zzn(Integer num) {
        this.zzo = num;
        return this;
    }

    public final zzbf zzo(Integer num) {
        this.zzn = num;
        return this;
    }

    public final zzbf zzp(Integer num) {
        this.zzm = num;
        return this;
    }

    public final zzbf zzq(CharSequence charSequence) {
        this.zzt = charSequence;
        return this;
    }

    public final zzbf zzr(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzbf zzs(Integer num) {
        this.zzi = num;
        return this;
    }

    public final zzbf zzt(Integer num) {
        this.zzh = num;
        return this;
    }

    public final zzbf zzu(CharSequence charSequence) {
        this.zzp = charSequence;
        return this;
    }

    public final zzbh zzv() {
        return new zzbh(this);
    }
}
