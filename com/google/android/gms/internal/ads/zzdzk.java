package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzdzk extends Exception {
    private final int zza;

    public zzdzk(int i2) {
        this.zza = i2;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdzk(int i2, String str) {
        super(str);
        this.zza = i2;
    }

    public zzdzk(int i2, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
