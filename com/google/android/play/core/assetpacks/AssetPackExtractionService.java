package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import f.h.b.c.a;
import f.h.b.d.a.b.l3;
import f.h.b.d.a.b.m1;
import f.h.b.d.a.b.r0;
import f.h.b.d.a.b.v;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public class AssetPackExtractionService extends Service {

    /* renamed from: f  reason: collision with root package name */
    public v f1264f;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1264f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        r0 r0Var;
        super.onCreate();
        Context applicationContext = getApplicationContext();
        synchronized (m1.class) {
            if (m1.a == null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 != null) {
                    applicationContext = applicationContext2;
                }
                l3 l3Var = new l3(applicationContext);
                a.n1(l3Var, l3.class);
                m1.a = new r0(l3Var);
            }
            r0Var = m1.a;
        }
        this.f1264f = (v) r0Var.B.zza();
    }
}
