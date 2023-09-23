package com.google.firebase.inappmessaging.internal;

import com.google.android.gms.common.api.Api;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.internal.injection.qualifiers.ImpressionStore;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import f.h.g.a.a.a.d.a;
import f.h.g.a.a.a.d.b;
import f.h.g.a.a.a.d.e;
import g.c.c;
import g.c.h;
import g.c.k;
import g.c.p;
import g.c.w.b.a;
import g.c.w.e.c.d;
import g.c.w.e.c.m;
import g.c.w.e.c.v;
import g.c.w.e.d.f;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ImpressionStorageClient {
    private static final b EMPTY_IMPRESSIONS = b.d();
    private h<b> cachedImpressionsMaybe = d.f8342f;
    private final ProtoStorageClient storageClient;

    public ImpressionStorageClient(@ImpressionStore ProtoStorageClient protoStorageClient) {
        this.storageClient = protoStorageClient;
    }

    public static /* synthetic */ void a(ImpressionStorageClient impressionStorageClient, b bVar) {
        impressionStorageClient.e(bVar);
    }

    private static b appendImpression(b bVar, a aVar) {
        b.C0147b f2 = b.f(bVar);
        f2.copyOnWrite();
        b.b((b) f2.instance, aVar);
        return f2.build();
    }

    private void clearInMemCache() {
        this.cachedImpressionsMaybe = d.f8342f;
    }

    /* renamed from: initInMemCache */
    public void e(b bVar) {
        Objects.requireNonNull(bVar, "item is null");
        this.cachedImpressionsMaybe = new m(bVar);
    }

    public c c(HashSet hashSet, b bVar) {
        StringBuilder A = f.a.b.a.a.A("Existing impressions: ");
        A.append(bVar.toString());
        Logging.logd(A.toString());
        b.C0147b e2 = b.e();
        for (a aVar : bVar.c()) {
            if (!hashSet.contains(aVar.getCampaignId())) {
                e2.copyOnWrite();
                b.b((b) e2.instance, aVar);
            }
        }
        final b build = e2.build();
        StringBuilder A2 = f.a.b.a.a.A("New cleared impression list: ");
        A2.append(build.toString());
        Logging.logd(A2.toString());
        return this.storageClient.write(build).d(new g.c.v.a() { // from class: f.h.e.n.e.d0
            @Override // g.c.v.a
            public final void run() {
                ImpressionStorageClient.this.b(build);
            }
        });
    }

    public g.c.a clearImpressions(e eVar) {
        String campaignId;
        final HashSet hashSet = new HashSet();
        for (CampaignProto$ThickContent campaignProto$ThickContent : eVar.e()) {
            if (campaignProto$ThickContent.e().equals(CampaignProto$ThickContent.PayloadCase.VANILLA_PAYLOAD)) {
                campaignId = campaignProto$ThickContent.h().getCampaignId();
            } else {
                campaignId = campaignProto$ThickContent.c().getCampaignId();
            }
            hashSet.add(campaignId);
        }
        StringBuilder A = f.a.b.a.a.A("Potential impressions to clear: ");
        A.append(hashSet.toString());
        Logging.logd(A.toString());
        return getAllImpressions().c(EMPTY_IMPRESSIONS).h(new g.c.v.d() { // from class: f.h.e.n.e.e0
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return ImpressionStorageClient.this.c(hashSet, (f.h.g.a.a.a.d.b) obj);
            }
        });
    }

    public /* synthetic */ void d(Throwable th) {
        clearInMemCache();
    }

    public /* synthetic */ c f(a aVar, b bVar) {
        final b appendImpression = appendImpression(bVar, aVar);
        return this.storageClient.write(appendImpression).d(new g.c.v.a() { // from class: f.h.e.n.e.c0
            @Override // g.c.v.a
            public final void run() {
                ImpressionStorageClient.this.e(appendImpression);
            }
        });
    }

    public h<b> getAllImpressions() {
        return this.cachedImpressionsMaybe.m(this.storageClient.read(b.parser()).e(new g.c.v.c() { // from class: f.h.e.n.e.b0
            @Override // g.c.v.c
            public final void accept(Object obj) {
                ImpressionStorageClient.a(ImpressionStorageClient.this, (f.h.g.a.a.a.d.b) obj);
            }
        })).d(new g.c.v.c() { // from class: f.h.e.n.e.a0
            @Override // g.c.v.c
            public final void accept(Object obj) {
                ImpressionStorageClient.this.d((Throwable) obj);
            }
        });
    }

    public p<Boolean> isImpressed(CampaignProto$ThickContent campaignProto$ThickContent) {
        String campaignId;
        g.c.m vVar;
        g.c.m fVar;
        if (campaignProto$ThickContent.e().equals(CampaignProto$ThickContent.PayloadCase.VANILLA_PAYLOAD)) {
            campaignId = campaignProto$ThickContent.h().getCampaignId();
        } else {
            campaignId = campaignProto$ThickContent.c().getCampaignId();
        }
        k j2 = getAllImpressions().j(new g.c.v.d() { // from class: f.h.e.n.e.f2
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return ((f.h.g.a.a.a.d.b) obj).c();
            }
        });
        f.h.e.n.e.a aVar = new g.c.v.d() { // from class: f.h.e.n.e.a
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                List list = (List) obj;
                Objects.requireNonNull(list, "source is null");
                return new g.c.w.e.d.i(list);
            }
        };
        if (j2 instanceof g.c.w.c.d) {
            vVar = ((g.c.w.c.d) j2).a();
        } else {
            vVar = new v(j2);
        }
        Objects.requireNonNull(vVar);
        int i2 = g.c.d.f8128f;
        g.c.w.b.b.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, "maxConcurrency");
        g.c.w.b.b.a(i2, "bufferSize");
        if (vVar instanceof g.c.w.c.h) {
            Object call = ((g.c.w.c.h) vVar).call();
            if (call == null) {
                fVar = g.c.w.e.d.d.f8421f;
            } else {
                fVar = new g.c.w.e.d.m(call, aVar);
            }
        } else {
            fVar = new f(vVar, aVar, false, Api.BaseClientBuilder.API_PRIORITY_OTHER, i2);
        }
        g.c.w.e.d.k kVar = new g.c.w.e.d.k(fVar, new g.c.v.d() { // from class: f.h.e.n.e.e2
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return ((f.h.g.a.a.a.d.a) obj).getCampaignId();
            }
        });
        Objects.requireNonNull(campaignId, "element is null");
        return new g.c.w.e.d.c(kVar, new a.e(campaignId));
    }

    public g.c.a storeImpression(final f.h.g.a.a.a.d.a aVar) {
        return getAllImpressions().c(EMPTY_IMPRESSIONS).h(new g.c.v.d() { // from class: f.h.e.n.e.z
            @Override // g.c.v.d
            public final Object apply(Object obj) {
                return ImpressionStorageClient.this.f(aVar, (f.h.g.a.a.a.d.b) obj);
            }
        });
    }
}
