package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzakm extends zzgpf implements Closeable {
    private static final zzgpm zza = zzgpm.zzb(zzakm.class);

    public zzakm(zzgpg zzgpgVar, zzakl zzaklVar) {
        zzf(zzgpgVar, zzgpgVar.zzc(), zzaklVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgpf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    public final String toString() {
        String obj = this.zzd.toString();
        return a.v(new StringBuilder(String.valueOf(obj).length() + 7), "model(", obj, ")");
    }
}
