package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeqi implements zzeta {
    private final boolean zza;

    public zzeqi(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.zza);
    }
}
