package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public interface zzqe {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    ByteBuffer zzf(int i2);

    ByteBuffer zzg(int i2);

    void zzi();

    void zzj(int i2, int i3, int i4, long j2, int i5);

    void zzk(int i2, int i3, zzfz zzfzVar, long j2, int i4);

    void zzl();

    void zzm(int i2, long j2);

    void zzn(int i2, boolean z);

    void zzo(Surface surface);

    void zzp(Bundle bundle);

    void zzq(int i2);

    boolean zzr();
}
