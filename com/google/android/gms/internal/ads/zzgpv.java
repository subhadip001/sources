package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgpv implements zzgpu, zzgpo {
    private static final zzgpv zza = new zzgpv(null);
    private final Object zzb;

    private zzgpv(Object obj) {
        this.zzb = obj;
    }

    public static zzgpu zza(Object obj) {
        zzgqc.zza(obj, "instance cannot be null");
        return new zzgpv(obj);
    }

    public static zzgpu zzc(Object obj) {
        return obj == null ? zza : new zzgpv(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final Object zzb() {
        return this.zzb;
    }
}
