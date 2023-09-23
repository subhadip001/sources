package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zztg implements zzsn {
    private final zzeq zzc;
    private int zzd;
    private final zztf zze;
    private final zzwa zzf;
    private final zzpa zzg;

    public zztg(zzeq zzeqVar, zztf zztfVar, byte[] bArr) {
        zzpa zzpaVar = new zzpa();
        zzwa zzwaVar = new zzwa(-1);
        this.zzc = zzeqVar;
        this.zze = zztfVar;
        this.zzg = zzpaVar;
        this.zzf = zzwaVar;
        this.zzd = CommonUtils.BYTES_IN_A_MEGABYTE;
    }

    public final zztg zza(int i2) {
        this.zzd = i2;
        return this;
    }

    public final zzti zzb(zzbb zzbbVar) {
        Objects.requireNonNull(zzbbVar.zzd);
        return new zzti(zzbbVar, this.zzc, this.zze, zzpj.zza, this.zzf, this.zzd, null, null);
    }
}
