package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzatb implements zzash {
    private int zzb;
    private int zzc;
    private int[] zzd;
    private boolean zze;
    private int[] zzf;
    private ByteBuffer zzg;
    private ByteBuffer zzh;
    private boolean zzi;

    public zzatb() {
        ByteBuffer byteBuffer = zzash.zza;
        this.zzg = byteBuffer;
        this.zzh = byteBuffer;
        this.zzb = -1;
        this.zzc = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final int zza() {
        int[] iArr = this.zzf;
        return iArr == null ? this.zzb : iArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.zzh;
        this.zzh = zzash.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final void zzd() {
        this.zzh = zzash.zza;
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final void zze() {
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final void zzf(ByteBuffer byteBuffer) {
        int[] iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = this.zzb;
        int length = ((limit - position) / (i2 + i2)) * this.zzf.length;
        int i3 = length + length;
        if (this.zzg.capacity() < i3) {
            this.zzg = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        } else {
            this.zzg.clear();
        }
        while (position < limit) {
            for (int i4 : this.zzf) {
                this.zzg.putShort(byteBuffer.getShort(i4 + i4 + position));
            }
            int i5 = this.zzb;
            position += i5 + i5;
        }
        byteBuffer.position(limit);
        this.zzg.flip();
        this.zzh = this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final void zzg() {
        zzd();
        this.zzg = zzash.zza;
        this.zzb = -1;
        this.zzc = -1;
        this.zzf = null;
        this.zze = false;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final boolean zzh(int i2, int i3, int i4) {
        boolean z = !Arrays.equals(this.zzd, this.zzf);
        int[] iArr = this.zzd;
        this.zzf = iArr;
        if (iArr == null) {
            this.zze = false;
            return z;
        } else if (i4 == 2) {
            if (!z && this.zzc == i2 && this.zzb == i3) {
                return false;
            }
            this.zzc = i2;
            this.zzb = i3;
            this.zze = i3 != iArr.length;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.zzf;
                if (i5 >= iArr2.length) {
                    return true;
                }
                int i6 = iArr2[i5];
                if (i6 < i3) {
                    this.zze = (i6 != i5) | this.zze;
                    i5++;
                } else {
                    throw new zzasg(i2, i3, 2);
                }
            }
        } else {
            throw new zzasg(i2, i3, i4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final boolean zzi() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final boolean zzj() {
        return this.zzi && this.zzh == zzash.zza;
    }

    public final void zzk(int[] iArr) {
        this.zzd = iArr;
    }
}
