package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbkm extends zzbkz {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;

    public zzbkm(Drawable drawable, Uri uri, double d2, int i2, int i3) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d2;
        this.zzd = i2;
        this.zze = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzbla
    public final double zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbla
    public final int zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbla
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbla
    public final Uri zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbla
    public final IObjectWrapper zzf() {
        return ObjectWrapper.wrap(this.zza);
    }
}
