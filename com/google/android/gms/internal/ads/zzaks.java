package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaks extends zzgpb {
    public ByteBuffer zza;

    public zzaks(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgpb
    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
