package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzajh {
    public final Object zza;
    public final zzaik zzb;
    public final zzajk zzc;
    public boolean zzd;

    private zzajh(zzajk zzajkVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzajkVar;
    }

    private zzajh(Object obj, zzaik zzaikVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaikVar;
        this.zzc = null;
    }

    public static zzajh zza(zzajk zzajkVar) {
        return new zzajh(zzajkVar);
    }

    public static zzajh zzb(Object obj, zzaik zzaikVar) {
        return new zzajh(obj, zzaikVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
