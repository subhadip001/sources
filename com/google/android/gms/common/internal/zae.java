package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zae extends zag {
    public final /* synthetic */ Intent zaa;
    public final /* synthetic */ Fragment zab;
    public final /* synthetic */ int zac;

    public zae(Intent intent, Fragment fragment, int i2) {
        this.zaa = intent;
        this.zab = fragment;
        this.zac = i2;
    }

    @Override // com.google.android.gms.common.internal.zag
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            this.zab.startActivityForResult(intent, this.zac);
        }
    }
}
