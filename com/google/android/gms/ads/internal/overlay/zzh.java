package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcli;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(zzcli zzcliVar) {
        this.zzb = zzcliVar.getLayoutParams();
        ViewParent parent = zzcliVar.getParent();
        this.zzd = zzcliVar.zzG();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.zzc = viewGroup;
            this.zza = viewGroup.indexOfChild(zzcliVar.zzH());
            viewGroup.removeView(zzcliVar.zzH());
            zzcliVar.zzap(true);
            return;
        }
        throw new zzf("Could not get the parent of the WebView for an overlay.");
    }
}
