package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeuo implements zzetb {
    public final zzfvk zza;
    public final Context zzb;
    public final zzbda zzc;

    public zzeuo(zzbda zzbdaVar, zzfvk zzfvkVar, Context context, byte[] bArr) {
        this.zzc = zzbdaVar;
        this.zza = zzfvkVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeun
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeup(new JSONObject());
            }
        });
    }
}
