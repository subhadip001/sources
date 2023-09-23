package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfnd implements Closeable {
    public static zzfnp zza() {
        return new zzfnp();
    }

    public static zzfnp zzb(final int i2, zzfno zzfnoVar) {
        return new zzfnp(new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnb
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzfnd.zzd(i2);
            }
        }, new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnc
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzfnd.zze();
            }
        }, zzfnoVar);
    }

    public static zzfnp zzc(zzfph<Integer> zzfphVar, zzfph<Integer> zzfphVar2, zzfno zzfnoVar) {
        return new zzfnp(zzfphVar, zzfphVar2, zzfnoVar);
    }

    public static /* synthetic */ Integer zzd(int i2) {
        return Integer.valueOf(i2);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}
