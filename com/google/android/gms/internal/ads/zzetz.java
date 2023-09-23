package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzetz implements zzetb {
    private final Context zza;
    private final String zzb;
    private final zzfvk zzc;

    public zzetz(zzbzw zzbzwVar, Context context, String str, zzfvk zzfvkVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzfvkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzety
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeua(new JSONObject());
            }
        });
    }
}
