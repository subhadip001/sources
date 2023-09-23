package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcjf {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzakr zzakrVar;
        zzakq zzakqVar;
        long j2 = this.zza;
        if (j2 > 0) {
            return j2;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzakm(new zzcje(duplicate), zzcjh.zzb).zze().iterator();
            while (true) {
                zzakrVar = null;
                if (!it.hasNext()) {
                    zzakqVar = null;
                    break;
                }
                zzako zzakoVar = (zzako) it.next();
                if (zzakoVar instanceof zzakq) {
                    zzakqVar = (zzakq) zzakoVar;
                    break;
                }
            }
            Iterator it2 = zzakqVar.zze().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzako zzakoVar2 = (zzako) it2.next();
                if (zzakoVar2 instanceof zzakr) {
                    zzakrVar = (zzakr) zzakoVar2;
                    break;
                }
            }
            long zzd = (zzakrVar.zzd() * 1000) / zzakrVar.zze();
            this.zza = zzd;
            return zzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
