package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zabc extends com.google.android.gms.internal.base.zaq {
    public final /* synthetic */ zabe zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(zabe zabeVar, Looper looper) {
        super(looper);
        this.zaa = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            zabe.zaj(this.zaa);
        } else if (i2 != 2) {
            a.G(31, "Unknown message id: ", i2, "GoogleApiClientImpl");
        } else {
            zabe.zai(this.zaa);
        }
    }
}
