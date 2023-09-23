package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcni {
    private final zzcfo zza;
    private final Context zzb;
    private final WeakReference zzc;

    public /* synthetic */ zzcni(zzcng zzcngVar, zzcnh zzcnhVar) {
        zzcfo zzcfoVar;
        Context context;
        WeakReference weakReference;
        zzcfoVar = zzcngVar.zza;
        this.zza = zzcfoVar;
        context = zzcngVar.zzb;
        this.zzb = context;
        weakReference = zzcngVar.zzc;
        this.zzc = weakReference;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final zzaoc zzb() {
        return new zzaoc(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }

    public final zzbkh zzc() {
        return new zzbkh(this.zzb);
    }

    public final zzcfo zzd() {
        return this.zza;
    }

    public final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    public final WeakReference zzf() {
        return this.zzc;
    }
}
