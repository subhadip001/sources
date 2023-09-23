package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class zzv extends zzx {
    private final Callable zze;

    public /* synthetic */ zzv(Callable callable, zzu zzuVar) {
        super();
        this.zze = callable;
    }

    @Override // com.google.android.gms.common.zzx
    public final String zza() {
        try {
            return (String) this.zze.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
