package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzgc extends zzfw {
    public final zzfz zza = new zzfz();
    public ByteBuffer zzb;
    public boolean zzc;
    public long zzd;
    public ByteBuffer zze;
    private final int zzf;

    static {
        zzbc.zzb("media3.decoder");
    }

    public zzgc(int i2, int i3) {
        this.zzf = i2;
    }

    private final ByteBuffer zzl(int i2) {
        int i3 = this.zzf;
        if (i3 == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        ByteBuffer byteBuffer = this.zzb;
        throw new zzgb(byteBuffer == null ? 0 : byteBuffer.capacity(), i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfw
    public void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.zze;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.zzc = false;
    }

    public final void zzi(int i2) {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer == null) {
            this.zzb = zzl(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.zzb = byteBuffer;
            return;
        }
        ByteBuffer zzl = zzl(i3);
        zzl.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            zzl.put(byteBuffer);
        }
        this.zzb = zzl;
    }

    public final void zzj() {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.zze;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean zzk() {
        return zzd(CommonUtils.BYTES_IN_A_GIGABYTE);
    }
}
