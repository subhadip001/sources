package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgmq extends zzgjg {
    public static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Api.BaseClientBuilder.API_PRIORITY_OTHER};
    private final int zzc;
    private final zzgjg zzd;
    private final zzgjg zze;
    private final int zzf;
    private final int zzg;

    private zzgmq(zzgjg zzgjgVar, zzgjg zzgjgVar2) {
        this.zzd = zzgjgVar;
        this.zze = zzgjgVar2;
        int zzd = zzgjgVar.zzd();
        this.zzf = zzd;
        this.zzc = zzgjgVar2.zzd() + zzd;
        this.zzg = Math.max(zzgjgVar.zzf(), zzgjgVar2.zzf()) + 1;
    }

    public static zzgjg zzG(zzgjg zzgjgVar, zzgjg zzgjgVar2) {
        if (zzgjgVar2.zzd() == 0) {
            return zzgjgVar;
        }
        if (zzgjgVar.zzd() == 0) {
            return zzgjgVar2;
        }
        int zzd = zzgjgVar2.zzd() + zzgjgVar.zzd();
        if (zzd < 128) {
            return zzH(zzgjgVar, zzgjgVar2);
        }
        if (zzgjgVar instanceof zzgmq) {
            zzgmq zzgmqVar = (zzgmq) zzgjgVar;
            if (zzgjgVar2.zzd() + zzgmqVar.zze.zzd() < 128) {
                return new zzgmq(zzgmqVar.zzd, zzH(zzgmqVar.zze, zzgjgVar2));
            } else if (zzgmqVar.zzd.zzf() > zzgmqVar.zze.zzf() && zzgmqVar.zzg > zzgjgVar2.zzf()) {
                return new zzgmq(zzgmqVar.zzd, new zzgmq(zzgmqVar.zze, zzgjgVar2));
            }
        }
        if (zzd >= zzc(Math.max(zzgjgVar.zzf(), zzgjgVar2.zzf()) + 1)) {
            return new zzgmq(zzgjgVar, zzgjgVar2);
        }
        return zzgmm.zza(new zzgmm(null), zzgjgVar, zzgjgVar2);
    }

    private static zzgjg zzH(zzgjg zzgjgVar, zzgjg zzgjgVar2) {
        int zzd = zzgjgVar.zzd();
        int zzd2 = zzgjgVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgjgVar.zzC(bArr, 0, 0, zzd);
        zzgjgVar2.zzC(bArr, 0, zzd, zzd2);
        return new zzgjc(bArr);
    }

    public static int zzc(int i2) {
        int[] iArr = zza;
        int length = iArr.length;
        return i2 >= 47 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : iArr[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final boolean equals(Object obj) {
        boolean zzg;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgjg)) {
            return false;
        }
        zzgjg zzgjgVar = (zzgjg) obj;
        if (this.zzc != zzgjgVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgjgVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgmo zzgmoVar = new zzgmo(this, null);
        zzgjb next = zzgmoVar.next();
        zzgmo zzgmoVar2 = new zzgmo(zzgjgVar, null);
        zzgjb next2 = zzgmoVar2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int zzd = next.zzd() - i2;
            int zzd2 = next2.zzd() - i3;
            int min = Math.min(zzd, zzd2);
            if (i2 == 0) {
                zzg = next.zzg(next2, i3, min);
            } else {
                zzg = next2.zzg(next, i2, min);
            }
            if (!zzg) {
                return false;
            }
            i4 += min;
            int i5 = this.zzc;
            if (i4 >= i5) {
                if (i4 == i5) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzgmoVar.next();
                i2 = 0;
            } else {
                i2 += min;
            }
            if (min == zzd2) {
                next2 = zzgmoVar2.next();
                i3 = 0;
            } else {
                i3 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjg, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgmk(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final byte zza(int i2) {
        zzgjg.zzB(i2, this.zzc);
        return zzb(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final byte zzb(int i2) {
        int i3 = this.zzf;
        return i2 < i3 ? this.zzd.zzb(i2) : this.zze.zzb(i2 - i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final void zze(byte[] bArr, int i2, int i3, int i4) {
        int i5 = this.zzf;
        if (i2 + i4 <= i5) {
            this.zzd.zze(bArr, i2, i3, i4);
        } else if (i2 >= i5) {
            this.zze.zze(bArr, i2 - i5, i3, i4);
        } else {
            int i6 = i5 - i2;
            this.zzd.zze(bArr, i2, i3, i6);
            this.zze.zze(bArr, 0, i3 + i6, i4 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final int zzi(int i2, int i3, int i4) {
        int i5 = this.zzf;
        if (i3 + i4 <= i5) {
            return this.zzd.zzi(i2, i3, i4);
        }
        if (i3 >= i5) {
            return this.zze.zzi(i2, i3 - i5, i4);
        }
        int i6 = i5 - i3;
        return this.zze.zzi(this.zzd.zzi(i2, i3, i6), 0, i4 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final int zzj(int i2, int i3, int i4) {
        int i5 = this.zzf;
        if (i3 + i4 <= i5) {
            return this.zzd.zzj(i2, i3, i4);
        }
        if (i3 >= i5) {
            return this.zze.zzj(i2, i3 - i5, i4);
        }
        int i6 = i5 - i3;
        return this.zze.zzj(this.zzd.zzj(i2, i3, i6), 0, i4 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final zzgjg zzk(int i2, int i3) {
        int zzq = zzgjg.zzq(i2, i3, this.zzc);
        if (zzq == 0) {
            return zzgjg.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i4 = this.zzf;
        if (i3 <= i4) {
            return this.zzd.zzk(i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzk(i2 - i4, i3 - i4);
        }
        zzgjg zzgjgVar = this.zzd;
        return new zzgmq(zzgjgVar.zzk(i2, zzgjgVar.zzd()), this.zze.zzk(0, i3 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final zzgjo zzl() {
        ArrayList arrayList = new ArrayList();
        zzgmo zzgmoVar = new zzgmo(this, null);
        while (zzgmoVar.hasNext()) {
            arrayList.add(zzgmoVar.next().zzn());
        }
        Iterator it = arrayList.iterator();
        boolean z = false;
        int i2 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new zzgjk(arrayList, i2, true, null);
        }
        return zzgjo.zzH(new zzglb(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final String zzm(Charset charset) {
        return new String(zzE(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final void zzo(zzgiv zzgivVar) {
        this.zzd.zzo(zzgivVar);
        this.zze.zzo(zzgivVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final boolean zzp() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzgjg zzgjgVar = this.zze;
        return zzgjgVar.zzj(zzj, 0, zzgjgVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgjg
    public final zzgja zzs() {
        return new zzgmk(this);
    }
}
