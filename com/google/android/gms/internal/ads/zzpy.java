package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzpy extends zzgc {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzpy() {
        super(2, 0);
        this.zzh = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzgc, com.google.android.gms.internal.ads.zzfw
    public final void zzb() {
        super.zzb();
        this.zzg = 0;
    }

    public final int zzl() {
        return this.zzg;
    }

    public final long zzm() {
        return this.zzf;
    }

    public final void zzn(int i2) {
        this.zzh = i2;
    }

    public final boolean zzo(zzgc zzgcVar) {
        ByteBuffer byteBuffer;
        zzcw.zzd(!zzgcVar.zzd(CommonUtils.BYTES_IN_A_GIGABYTE));
        zzcw.zzd(!zzgcVar.zzd(268435456));
        zzcw.zzd(!zzgcVar.zzd(4));
        if (zzp()) {
            if (this.zzg >= this.zzh || zzgcVar.zzd(Integer.MIN_VALUE) != zzd(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzgcVar.zzb;
            if (byteBuffer2 != null && (byteBuffer = this.zzb) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i2 = this.zzg;
        this.zzg = i2 + 1;
        if (i2 == 0) {
            this.zzd = zzgcVar.zzd;
            if (zzgcVar.zzd(1)) {
                zzc(1);
            }
        }
        if (zzgcVar.zzd(Integer.MIN_VALUE)) {
            zzc(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = zzgcVar.zzb;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzb.put(byteBuffer3);
        }
        this.zzf = zzgcVar.zzd;
        return true;
    }

    public final boolean zzp() {
        return this.zzg > 0;
    }
}
