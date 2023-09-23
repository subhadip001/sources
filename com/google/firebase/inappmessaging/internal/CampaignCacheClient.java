package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import com.google.firebase.inappmessaging.internal.CampaignCacheClient;
import com.google.firebase.inappmessaging.internal.injection.modules.ProtoStorageClientModule;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.CampaignCache;
import com.google.firebase.inappmessaging.internal.time.Clock;
import f.h.g.a.a.a.d.e;
import g.c.a;
import g.c.h;
import g.c.v.c;
import g.c.w.e.c.i;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class CampaignCacheClient {
    private final Application application;
    private e cachedResponse;
    private final Clock clock;
    private final ProtoStorageClient storageClient;

    public CampaignCacheClient(@CampaignCache ProtoStorageClient protoStorageClient, Application application, Clock clock) {
        this.storageClient = protoStorageClient;
        this.application = application;
        this.clock = clock;
    }

    public static /* synthetic */ boolean a(CampaignCacheClient campaignCacheClient, e eVar) {
        return campaignCacheClient.isResponseValid(eVar);
    }

    public boolean isResponseValid(e eVar) {
        long d2 = eVar.d();
        long now = this.clock.now();
        File file = new File(this.application.getApplicationContext().getFilesDir(), ProtoStorageClientModule.CAMPAIGN_CACHE_FILE);
        if (d2 != 0) {
            return now < d2;
        } else if (file.exists()) {
            return now < TimeUnit.DAYS.toMillis(1L) + file.lastModified();
        } else {
            return true;
        }
    }

    public /* synthetic */ e b() {
        return this.cachedResponse;
    }

    public /* synthetic */ void c(e eVar) {
        this.cachedResponse = eVar;
    }

    public /* synthetic */ void d(Throwable th) {
        this.cachedResponse = null;
    }

    public /* synthetic */ void e(e eVar) {
        this.cachedResponse = eVar;
    }

    public h<e> get() {
        return new i(new Callable() { // from class: f.h.e.n.e.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return CampaignCacheClient.this.b();
            }
        }).m(this.storageClient.read(e.parser()).e(new c() { // from class: f.h.e.n.e.e
            @Override // g.c.v.c
            public final void accept(Object obj) {
                CampaignCacheClient.this.c((f.h.g.a.a.a.d.e) obj);
            }
        })).f(new g.c.v.e() { // from class: f.h.e.n.e.f
            @Override // g.c.v.e
            public final boolean a(Object obj) {
                return CampaignCacheClient.a(CampaignCacheClient.this, (f.h.g.a.a.a.d.e) obj);
            }
        }).d(new c() { // from class: f.h.e.n.e.h
            @Override // g.c.v.c
            public final void accept(Object obj) {
                CampaignCacheClient.this.d((Throwable) obj);
            }
        });
    }

    public a put(final e eVar) {
        return this.storageClient.write(eVar).d(new g.c.v.a() { // from class: f.h.e.n.e.g
            @Override // g.c.v.a
            public final void run() {
                CampaignCacheClient.this.e(eVar);
            }
        });
    }
}
