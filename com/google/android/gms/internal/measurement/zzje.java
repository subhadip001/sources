package com.google.android.gms.internal.measurement;

import f.a.b.a.a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public abstract class zzje implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzje zzb = new zzjb(zzkn.zzd);
    private static final zzjd zzd;
    private int zzc = 0;

    static {
        int i2 = zziq.zza;
        zzd = new zzjd(null);
        zza = new zziw();
    }

    public static int zzj(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) < 0) {
            if (i2 >= 0) {
                if (i3 < i2) {
                    throw new IndexOutOfBoundsException(a.k("Beginning index larger than ending index: ", i2, ", ", i3));
                }
                throw new IndexOutOfBoundsException(a.k("End index: ", i3, " >= ", i4));
            }
            throw new IndexOutOfBoundsException(a.j("Beginning index: ", i2, " < 0"));
        }
        return i5;
    }

    public static zzje zzl(byte[] bArr, int i2, int i3) {
        zzj(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzjb(bArr2);
    }

    public static zzje zzm(String str) {
        return new zzjb(str.getBytes(zzkn.zzb));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.zzc;
        if (i2 == 0) {
            int zzd2 = zzd();
            i2 = zze(zzd2, 0, zzd2);
            if (i2 == 0) {
                i2 = 1;
            }
            this.zzc = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zziv(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzmm.zza(this) : zzmm.zza(zzf(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i2);

    public abstract byte zzb(int i2);

    public abstract int zzd();

    public abstract int zze(int i2, int i3, int i4);

    public abstract zzje zzf(int i2, int i3);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zziu zziuVar);

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
