package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zznx extends zznw {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i2 : iArr) {
                zzj.putShort(byteBuffer.getShort(i2 + i2 + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final zzmx zzi(zzmx zzmxVar) {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzmx.zza;
        }
        if (zzmxVar.zzd == 2) {
            boolean z = zzmxVar.zzc != iArr.length;
            int i2 = 0;
            while (true) {
                int length = iArr.length;
                if (i2 >= length) {
                    return z ? new zzmx(zzmxVar.zzb, length, 2) : zzmx.zza;
                }
                int i3 = iArr[i2];
                if (i3 >= zzmxVar.zzc) {
                    throw new zzmy(zzmxVar);
                }
                z |= i3 != i2;
                i2++;
            }
        } else {
            throw new zzmy(zzmxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
