package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import f.h.b.d.a.i.m;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class zzc extends ResultReceiver {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m f1269f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(Handler handler, m mVar) {
        super(handler);
        this.f1269f = mVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, Bundle bundle) {
        this.f1269f.b(null);
    }
}
