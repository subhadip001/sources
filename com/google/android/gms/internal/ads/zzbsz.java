package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbsz {
    @VisibleForTesting
    public static final com.google.android.gms.ads.internal.util.zzbb zza = new zzbsx();
    @VisibleForTesting
    public static final com.google.android.gms.ads.internal.util.zzbb zzb = new zzbsy();
    private final zzbsl zzc;

    public zzbsz(Context context, zzcfo zzcfoVar, String str, zzfhs zzfhsVar) {
        this.zzc = new zzbsl(context, zzcfoVar, str, zza, zzb, zzfhsVar);
    }

    public final zzbsp zza(String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        return new zzbtd(this.zzc, str, zzbssVar, zzbsrVar);
    }

    public final zzbti zzb() {
        return new zzbti(this.zzc);
    }
}
