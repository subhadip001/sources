package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzjr {
    public static final zzjr zza = new zzjr(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzjr zzd;
    private final Map zze;

    public zzjr() {
        this.zze = new HashMap();
    }

    public static zzjr zza() {
        zzjr zzjrVar = zzd;
        if (zzjrVar != null) {
            return zzjrVar;
        }
        synchronized (zzjr.class) {
            zzjr zzjrVar2 = zzd;
            if (zzjrVar2 != null) {
                return zzjrVar2;
            }
            zzjr zzb2 = zzjz.zzb(zzjr.class);
            zzd = zzb2;
            return zzb2;
        }
    }

    public final zzkd zzb(zzlm zzlmVar, int i2) {
        return (zzkd) this.zze.get(new zzjq(zzlmVar, i2));
    }

    public zzjr(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
