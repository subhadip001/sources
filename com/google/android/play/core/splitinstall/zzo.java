package com.google.android.play.core.splitinstall;

import f.h.b.d.a.h.a;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class zzo {
    public static final zzo zza;
    private static final AtomicReference zzb;
    private static final /* synthetic */ zzo[] zzc;

    static {
        zzo zzoVar = new zzo();
        zza = zzoVar;
        zzc = new zzo[]{zzoVar};
        zzb = new AtomicReference(null);
    }

    public static zzo[] values() {
        return (zzo[]) zzc.clone();
    }

    public final a zza() {
        return (a) zzb.get();
    }

    public final void zzb(a aVar) {
        zzb.set(aVar);
    }
}
