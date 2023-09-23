package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbh {
    public static final zzbh zza = new zzbh(new zzbf());
    public static final zzl zzb = new zzl() { // from class: com.google.android.gms.internal.ads.zzbd
    };
    public final CharSequence zzc;
    public final CharSequence zzd;
    public final CharSequence zze;
    public final CharSequence zzf;
    public final CharSequence zzg;
    public final byte[] zzh;
    public final Integer zzi;
    public final Integer zzj;
    public final Integer zzk;
    @Deprecated
    public final Integer zzl;
    public final Integer zzm;
    public final Integer zzn;
    public final Integer zzo;
    public final Integer zzp;
    public final Integer zzq;
    public final Integer zzr;
    public final CharSequence zzs;
    public final CharSequence zzt;
    public final CharSequence zzu;
    public final CharSequence zzv;
    public final CharSequence zzw;

    private zzbh(zzbf zzbfVar) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        byte[] bArr;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        CharSequence charSequence6;
        CharSequence charSequence7;
        CharSequence charSequence8;
        CharSequence charSequence9;
        CharSequence charSequence10;
        charSequence = zzbfVar.zza;
        this.zzc = charSequence;
        charSequence2 = zzbfVar.zzb;
        this.zzd = charSequence2;
        charSequence3 = zzbfVar.zzc;
        this.zze = charSequence3;
        charSequence4 = zzbfVar.zzd;
        this.zzf = charSequence4;
        charSequence5 = zzbfVar.zze;
        this.zzg = charSequence5;
        bArr = zzbfVar.zzf;
        this.zzh = bArr;
        num = zzbfVar.zzg;
        this.zzi = num;
        num2 = zzbfVar.zzh;
        this.zzj = num2;
        num3 = zzbfVar.zzi;
        this.zzk = num3;
        num4 = zzbfVar.zzj;
        this.zzl = num4;
        num5 = zzbfVar.zzj;
        this.zzm = num5;
        num6 = zzbfVar.zzk;
        this.zzn = num6;
        num7 = zzbfVar.zzl;
        this.zzo = num7;
        num8 = zzbfVar.zzm;
        this.zzp = num8;
        num9 = zzbfVar.zzn;
        this.zzq = num9;
        num10 = zzbfVar.zzo;
        this.zzr = num10;
        charSequence6 = zzbfVar.zzp;
        this.zzs = charSequence6;
        charSequence7 = zzbfVar.zzq;
        this.zzt = charSequence7;
        charSequence8 = zzbfVar.zzr;
        this.zzu = charSequence8;
        charSequence9 = zzbfVar.zzs;
        this.zzv = charSequence9;
        charSequence10 = zzbfVar.zzt;
        this.zzw = charSequence10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbh.class == obj.getClass()) {
            zzbh zzbhVar = (zzbh) obj;
            if (zzeg.zzS(this.zzc, zzbhVar.zzc) && zzeg.zzS(this.zzd, zzbhVar.zzd) && zzeg.zzS(this.zze, zzbhVar.zze) && zzeg.zzS(this.zzf, zzbhVar.zzf) && zzeg.zzS(null, null) && zzeg.zzS(null, null) && zzeg.zzS(this.zzg, zzbhVar.zzg) && zzeg.zzS(null, null) && zzeg.zzS(null, null) && zzeg.zzS(null, null) && Arrays.equals(this.zzh, zzbhVar.zzh) && zzeg.zzS(this.zzi, zzbhVar.zzi) && zzeg.zzS(null, null) && zzeg.zzS(this.zzj, zzbhVar.zzj) && zzeg.zzS(this.zzk, zzbhVar.zzk) && zzeg.zzS(null, null) && zzeg.zzS(null, null) && zzeg.zzS(this.zzm, zzbhVar.zzm) && zzeg.zzS(this.zzn, zzbhVar.zzn) && zzeg.zzS(this.zzo, zzbhVar.zzo) && zzeg.zzS(this.zzp, zzbhVar.zzp) && zzeg.zzS(this.zzq, zzbhVar.zzq) && zzeg.zzS(this.zzr, zzbhVar.zzr) && zzeg.zzS(this.zzs, zzbhVar.zzs) && zzeg.zzS(this.zzt, zzbhVar.zzt) && zzeg.zzS(this.zzu, zzbhVar.zzu) && zzeg.zzS(null, null) && zzeg.zzS(null, null) && zzeg.zzS(this.zzv, zzbhVar.zzv) && zzeg.zzS(null, null) && zzeg.zzS(this.zzw, zzbhVar.zzw)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzc, this.zzd, this.zze, this.zzf, null, null, this.zzg, null, null, null, Integer.valueOf(Arrays.hashCode(this.zzh)), this.zzi, null, this.zzj, this.zzk, null, null, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, null, null, this.zzv, null, this.zzw});
    }

    public final zzbf zza() {
        return new zzbf(this, null);
    }
}
