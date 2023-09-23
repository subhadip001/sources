package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import f.a.b.a.a;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbb {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzbbq zze;
    private final zzbby zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzbbb(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = z;
        this.zze = new zzbbq(i5);
        this.zzf = new zzbby(i6, i7, i8);
    }

    private final void zzp(String str, boolean z, float f2, float f3, float f4, float f5) {
        if (str == null || str.length() < this.zzc) {
            return;
        }
        synchronized (this.zzg) {
            this.zzh.add(str);
            this.zzk += str.length();
            if (z) {
                this.zzi.add(str);
                this.zzj.add(new zzbbm(f2, f3, f4, f5, this.zzi.size() - 1));
            }
        }
    }

    private static final String zzq(ArrayList arrayList, int i2) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            sb.append((String) arrayList.get(i3));
            sb.append(' ');
            i3++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbbb) {
            if (obj == this) {
                return true;
            }
            String str = ((zzbbb) obj).zzo;
            return str != null && str.equals(this.zzo);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        int i2 = this.zzl;
        int i3 = this.zzn;
        int i4 = this.zzk;
        String zzq = zzq(this.zzh, 100);
        String zzq2 = zzq(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        StringBuilder C = a.C("ActivityContent fetchId: ", i2, " score:", i3, " total_length:");
        C.append(i4);
        C.append("\n text: ");
        C.append(zzq);
        C.append("\n viewableText");
        a.R(C, zzq2, "\n signture: ", str, "\n viewableSignture: ");
        return a.v(C, str2, "\n viewableSignatureForVertical: ", str3);
    }

    @VisibleForTesting
    public final int zza(int i2, int i3) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i3 * this.zzb) + (i2 * this.zza);
    }

    public final int zzb() {
        return this.zzn;
    }

    @VisibleForTesting
    public final int zzc() {
        return this.zzk;
    }

    public final String zzd() {
        return this.zzo;
    }

    public final String zze() {
        return this.zzp;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final void zzg() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzh() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzi() {
        synchronized (this.zzg) {
            this.zzn -= 100;
        }
    }

    public final void zzj(int i2) {
        this.zzl = i2;
    }

    public final void zzk(String str, boolean z, float f2, float f3, float f4, float f5) {
        zzp(str, z, f2, f3, f4, f5);
    }

    public final void zzl(String str, boolean z, float f2, float f3, float f4, float f5) {
        zzp(str, z, f2, f3, f4, f5);
        synchronized (this.zzg) {
            if (this.zzm < 0) {
                zzcfi.zze("ActivityContent: negative number of WebViews.");
            }
            zzm();
        }
    }

    public final void zzm() {
        synchronized (this.zzg) {
            int zza = zza(this.zzk, this.zzl);
            if (zza > this.zzn) {
                this.zzn = zza;
                if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                    this.zzo = this.zze.zza(this.zzh);
                    this.zzp = this.zze.zza(this.zzi);
                }
                if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN()) {
                    this.zzq = this.zzf.zza(this.zzi, this.zzj);
                }
            }
        }
    }

    public final void zzn() {
        synchronized (this.zzg) {
            int zza = zza(this.zzk, this.zzl);
            if (zza > this.zzn) {
                this.zzn = zza;
            }
        }
    }

    public final boolean zzo() {
        boolean z;
        synchronized (this.zzg) {
            z = this.zzm == 0;
        }
        return z;
    }
}
