package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzchi {
    @VisibleForTesting
    public static final AtomicInteger zza = new AtomicInteger(0);
    @VisibleForTesting
    public static final AtomicInteger zzb = new AtomicInteger(0);

    public static int zzs() {
        return zza.get();
    }

    public static int zzu() {
        return zzb.get();
    }

    public abstract long zzA();

    public abstract long zzB();

    public abstract void zzC(Uri[] uriArr, String str);

    public abstract void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z);

    public abstract void zzE();

    public abstract void zzF(long j2);

    public abstract void zzG(int i2);

    public abstract void zzH(int i2);

    public abstract void zzI(zzchh zzchhVar);

    public abstract void zzJ(int i2);

    public abstract void zzK(int i2);

    public abstract void zzL(boolean z);

    public abstract void zzM(boolean z);

    public abstract void zzN(int i2);

    public abstract void zzO(Surface surface, boolean z);

    public abstract void zzP(float f2, boolean z);

    public abstract void zzQ();

    public abstract boolean zzR();

    public abstract int zzr();

    public abstract int zzt();

    public abstract long zzv();

    public abstract long zzw();

    public abstract long zzx();

    public abstract long zzy();

    public abstract long zzz();
}
