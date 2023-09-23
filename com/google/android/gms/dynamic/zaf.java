package com.google.android.gms.dynamic;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaf implements zah {
    public final /* synthetic */ DeferredLifecycleHelper zaa;

    public zaf(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 4;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate) {
        LifecycleDelegate lifecycleDelegate2;
        lifecycleDelegate2 = this.zaa.zaa;
        lifecycleDelegate2.onStart();
    }
}
