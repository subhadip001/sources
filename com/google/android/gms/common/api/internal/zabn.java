package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zabn implements Runnable {
    public final /* synthetic */ int zaa;
    public final /* synthetic */ zabq zab;

    public zabn(zabq zabqVar, int i2) {
        this.zab = zabqVar;
        this.zaa = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zaH(this.zaa);
    }
}
