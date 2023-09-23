package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzesc implements zzeta {
    private final String zza;

    public zzesc(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        ((Bundle) obj).putString("rtb", this.zza);
    }
}
