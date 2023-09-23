package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzpp implements zzqd {
    private final zzfph zzb;
    private final zzfph zzc;

    public zzpp(int i2, boolean z) {
        zzpn zzpnVar = new zzpn(i2);
        zzpo zzpoVar = new zzpo(i2);
        this.zzb = zzpnVar;
        this.zzc = zzpoVar;
    }

    public static /* synthetic */ HandlerThread zza(int i2) {
        String zzs;
        zzs = zzpr.zzs(i2, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzs);
    }

    public static /* synthetic */ HandlerThread zzb(int i2) {
        String zzs;
        zzs = zzpr.zzs(i2, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzs);
    }

    public final zzpr zzc(zzqc zzqcVar) {
        MediaCodec mediaCodec;
        String str = zzqcVar.zza.zza;
        zzpr zzprVar = null;
        try {
            int i2 = zzeg.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                zzpr zzprVar2 = new zzpr(mediaCodec, zza(((zzpn) this.zzb).zza), zzb(((zzpo) this.zzc).zza), false, null);
                try {
                    Trace.endSection();
                    zzpr.zzh(zzprVar2, zzqcVar.zzb, zzqcVar.zzd, null, 0);
                    return zzprVar2;
                } catch (Exception e2) {
                    e = e2;
                    zzprVar = zzprVar2;
                    if (zzprVar != null) {
                        zzprVar.zzl();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            mediaCodec = null;
        }
    }
}
