package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftr;
import f.a.b.a.a;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfvo extends zzftr.zzi implements Runnable {
    private final Runnable zza;

    public zzfvo(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zze(th);
            zzfpi.zzb(th);
            throw new RuntimeException(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    public final String zza() {
        String valueOf = String.valueOf(this.zza);
        return a.v(new StringBuilder(valueOf.length() + 7), "task=[", valueOf, "]");
    }
}
