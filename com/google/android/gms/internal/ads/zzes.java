package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzes extends IOException {
    public final int zza;

    public zzes(int i2) {
        this.zza = i2;
    }

    public zzes(String str, int i2) {
        super(str);
        this.zza = i2;
    }

    public zzes(String str, Throwable th, int i2) {
        super(str, th);
        this.zza = i2;
    }

    public zzes(Throwable th, int i2) {
        super(th);
        this.zza = i2;
    }
}
