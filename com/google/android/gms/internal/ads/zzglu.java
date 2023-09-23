package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzglu {
    private static final zzglt zza;
    private static final zzglt zzb;

    static {
        zzglt zzgltVar;
        try {
            zzgltVar = (zzglt) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgltVar = null;
        }
        zza = zzgltVar;
        zzb = new zzglt();
    }

    public static zzglt zza() {
        return zza;
    }

    public static zzglt zzb() {
        return zzb;
    }
}
