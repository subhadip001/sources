package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzoq extends zznw {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzo(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == zzd) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zze(ByteBuffer byteBuffer) {
        ByteBuffer zzj;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.zzb.zzd;
        if (i3 == 536870912) {
            zzj = zzj((i2 / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), zzj);
                position += 3;
            }
        } else if (i3 == 805306368) {
            zzj = zzj(i2);
            while (position < limit) {
                zzo((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), zzj);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final zzmx zzi(zzmx zzmxVar) {
        int i2 = zzmxVar.zzd;
        if (zzeg.zzT(i2)) {
            return i2 != 4 ? new zzmx(zzmxVar.zzb, zzmxVar.zzc, 4) : zzmx.zza;
        }
        throw new zzmy(zzmxVar);
    }
}
