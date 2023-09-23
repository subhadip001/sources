package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzayv extends IOException {
    public zzayv(Throwable th) {
        super(a.r("Unexpected ", th.getClass().getSimpleName(), ": ", th.getMessage()), th);
    }
}
