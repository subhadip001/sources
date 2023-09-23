package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import f.a.b.a.a;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgjg implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzgjg zzb = new zzgjc(zzgky.zzd);
    private static final zzgjf zzd;
    private int zzc = 0;

    static {
        int i2 = zzgir.zza;
        zzd = new zzgjf(null);
        zza = new zzgix();
    }

    public static void zzB(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(a.i("Index < 0: ", i2));
            }
            throw new ArrayIndexOutOfBoundsException(a.k("Index > length: ", i2, ", ", i3));
        }
    }

    private static zzgjg zzc(Iterator it, int i2) {
        if (i2 > 0) {
            if (i2 == 1) {
                return (zzgjg) it.next();
            }
            int i3 = i2 >>> 1;
            zzgjg zzc = zzc(it, i3);
            zzgjg zzc2 = zzc(it, i2 - i3);
            if (Api.BaseClientBuilder.API_PRIORITY_OTHER - zzc.zzd() >= zzc2.zzd()) {
                return zzgmq.zzG(zzc, zzc2);
            }
            throw new IllegalArgumentException(a.k("ByteString would be too long: ", zzc.zzd(), "+", zzc2.zzd()));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i2)));
    }

    public static int zzq(int i2, int i3, int i4) {
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

    public static zzgjd zzt() {
        return new zzgjd(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgjg zzu(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return zzb;
        }
        return zzc(iterable.iterator(), size);
    }

    public static zzgjg zzv(byte[] bArr) {
        return zzw(bArr, 0, bArr.length);
    }

    public static zzgjg zzw(byte[] bArr, int i2, int i3) {
        zzq(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzgjc(bArr2);
    }

    public static zzgjg zzx(String str) {
        return new zzgjc(str.getBytes(zzgky.zzb));
    }

    public static zzgjg zzy(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i2 = 256;
        while (true) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            zzgjg zzw = i3 == 0 ? null : zzw(bArr, 0, i3);
            if (zzw == null) {
                return zzu(arrayList);
            }
            arrayList.add(zzw);
            i2 = Math.min(i2 + i2, 8192);
        }
    }

    public static zzgjg zzz(byte[] bArr) {
        return new zzgjc(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.zzc;
        if (i2 == 0) {
            int zzd2 = zzd();
            i2 = zzi(zzd2, 0, zzd2);
            if (i2 == 0) {
                i2 = 1;
            }
            this.zzc = i2;
        }
        return i2;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgng.zza(this) : zzgng.zza(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String zzA(Charset charset) {
        return zzd() == 0 ? "" : zzm(charset);
    }

    @Deprecated
    public final void zzC(byte[] bArr, int i2, int i3, int i4) {
        zzq(0, i4, zzd());
        zzq(i3, i3 + i4, bArr.length);
        if (i4 > 0) {
            zze(bArr, 0, i3, i4);
        }
    }

    public final boolean zzD() {
        return zzd() == 0;
    }

    public final byte[] zzE() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzgky.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }

    public abstract byte zza(int i2);

    public abstract byte zzb(int i2);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i2, int i3, int i4);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i2, int i3, int i4);

    public abstract int zzj(int i2, int i3, int i4);

    public abstract zzgjg zzk(int i2, int i3);

    public abstract zzgjo zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgiv zzgivVar);

    public abstract boolean zzp();

    public final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs */
    public zzgja iterator() {
        return new zzgiw(this);
    }
}
