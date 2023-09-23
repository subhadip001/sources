package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzatn extends zzati {
    public final zzatl zza = new zzatl();
    public ByteBuffer zzb;
    public long zzc;

    public zzatn(int i2) {
    }

    private final ByteBuffer zzj(int i2) {
        ByteBuffer byteBuffer = this.zzb;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i2 + ")");
    }

    @Override // com.google.android.gms.internal.ads.zzati
    public final void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void zzh(int i2) {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer == null) {
            this.zzb = zzj(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.zzb.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            return;
        }
        ByteBuffer zzj = zzj(i3);
        if (position > 0) {
            this.zzb.position(0);
            this.zzb.limit(position);
            zzj.put(this.zzb);
        }
        this.zzb = zzj;
    }

    public final boolean zzi() {
        return zzd(CommonUtils.BYTES_IN_A_GIGABYTE);
    }
}
