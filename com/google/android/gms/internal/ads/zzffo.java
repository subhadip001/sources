package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzffo {
    public static final zzffv zza(Callable callable, Object obj, zzffw zzffwVar) {
        zzfvk zzfvkVar;
        zzfvkVar = zzffwVar.zzb;
        return zzb(callable, zzfvkVar, obj, zzffwVar);
    }

    public static final zzffv zzb(Callable callable, zzfvk zzfvkVar, Object obj, zzffw zzffwVar) {
        zzfvj zzfvjVar;
        zzfvjVar = zzffw.zza;
        return new zzffv(zzffwVar, obj, zzfvjVar, Collections.emptyList(), zzfvkVar.zzb(callable));
    }

    public static final zzffv zzc(zzfvj zzfvjVar, Object obj, zzffw zzffwVar) {
        zzfvj zzfvjVar2;
        zzfvjVar2 = zzffw.zza;
        return new zzffv(zzffwVar, obj, zzfvjVar2, Collections.emptyList(), zzfvjVar);
    }

    public static final zzffv zzd(final zzffi zzffiVar, zzfvk zzfvkVar, Object obj, zzffw zzffwVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzffn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzffi.this.zza();
                return null;
            }
        }, zzfvkVar, obj, zzffwVar);
    }
}
