package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcng {
    private zzcfo zza;
    private Context zzb;
    private WeakReference zzc;

    public final zzcng zzc(Context context) {
        this.zzc = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcng zzd(zzcfo zzcfoVar) {
        this.zza = zzcfoVar;
        return this;
    }
}
