package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgkd {
    private static final zzgkb zza = new zzgkc();
    private static final zzgkb zzb;

    static {
        zzgkb zzgkbVar;
        try {
            zzgkbVar = (zzgkb) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgkbVar = null;
        }
        zzb = zzgkbVar;
    }

    public static zzgkb zza() {
        zzgkb zzgkbVar = zzb;
        if (zzgkbVar != null) {
            return zzgkbVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzgkb zzb() {
        return zza;
    }
}
