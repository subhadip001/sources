package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzetw implements zzetb {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzcei zzd;

    public zzetw(zzcei zzceiVar, Executor executor, String str, PackageInfo packageInfo, int i2, byte[] bArr) {
        this.zzd = zzceiVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return zzfva.zzg(zzfva.zzm(zzfva.zzi(this.zzb), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzetu
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                return new zzetx((String) obj);
            }
        }, this.zza), Throwable.class, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzetv
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                return zzetw.this.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    public final /* synthetic */ zzfvj zzc(Throwable th) {
        return zzfva.zzi(new zzetx(this.zzb));
    }
}
