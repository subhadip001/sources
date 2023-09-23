package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbag {
    private final Handler zza;
    private final zzbah zzb;

    public zzbag(Handler handler, zzbah zzbahVar) {
        Objects.requireNonNull(handler);
        this.zza = handler;
        this.zzb = zzbahVar;
    }

    public final void zzb(String str, long j2, long j3) {
        this.zza.post(new zzbaa(this, str, j2, j3));
    }

    public final void zzc(zzatm zzatmVar) {
        this.zza.post(new zzbaf(this, zzatmVar));
    }

    public final void zzd(int i2, long j2) {
        this.zza.post(new zzbac(this, i2, j2));
    }

    public final void zze(zzatm zzatmVar) {
        this.zza.post(new zzazz(this, zzatmVar));
    }

    public final void zzf(zzars zzarsVar) {
        this.zza.post(new zzbab(this, zzarsVar));
    }

    public final void zzg(Surface surface) {
        this.zza.post(new zzbae(this, surface));
    }

    public final void zzh(int i2, int i3, int i4, float f2) {
        this.zza.post(new zzbad(this, i2, i3, i4, f2));
    }
}
