package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeb extends zzcx {
    private zzeb() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zze(zze zzeVar) {
        OnAdInspectorClosedListener onAdInspectorClosedListener;
        onAdInspectorClosedListener = zzee.zzf().zzg;
        if (onAdInspectorClosedListener != null) {
            onAdInspectorClosedListener.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
        }
    }

    public /* synthetic */ zzeb(zzea zzeaVar) {
    }
}
