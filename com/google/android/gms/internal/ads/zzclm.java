package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzclm implements View.OnAttachStateChangeListener {
    public final /* synthetic */ zzccj zza;
    public final /* synthetic */ zzclp zzb;

    public zzclm(zzclp zzclpVar, zzccj zzccjVar) {
        this.zzb = zzclpVar;
        this.zza = zzccjVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzQ(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
