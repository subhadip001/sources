package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import f.h.b.d.a.b.v0;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public class ExtractionForegroundService extends Service {

    /* renamed from: f  reason: collision with root package name */
    public final IBinder f1265f = new v0(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1265f;
    }
}
