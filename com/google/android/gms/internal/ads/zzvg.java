package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzvg {
    public final zzck zza;
    public final int[] zzb;

    public zzvg(zzck zzckVar, int[] iArr, int i2) {
        if (iArr.length == 0) {
            zzdn.zza("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzckVar;
        this.zzb = iArr;
    }
}
