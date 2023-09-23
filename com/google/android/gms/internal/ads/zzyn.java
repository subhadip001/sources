package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzyn {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private Constructor zzb;

    public final zzys zza(int i2) {
        Constructor constructor;
        synchronized (this.zza) {
            if (this.zza.get()) {
                constructor = this.zzb;
            } else {
                try {
                    if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                        this.zzb = Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzys.class).getConstructor(Integer.TYPE);
                    }
                } catch (ClassNotFoundException unused) {
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating FLAC extension", e2);
                }
                this.zza.set(true);
                constructor = this.zzb;
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (zzys) constructor.newInstance(0);
        } catch (Exception e3) {
            throw new IllegalStateException("Unexpected error creating FLAC extractor", e3);
        }
    }
}
