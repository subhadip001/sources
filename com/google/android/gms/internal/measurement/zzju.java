package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzju {
    private static final zzjs zza = new zzjt();
    private static final zzjs zzb;

    static {
        zzjs zzjsVar;
        try {
            zzjsVar = (zzjs) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzjsVar = null;
        }
        zzb = zzjsVar;
    }

    public static zzjs zza() {
        zzjs zzjsVar = zzb;
        if (zzjsVar != null) {
            return zzjsVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzjs zzb() {
        return zza;
    }
}
