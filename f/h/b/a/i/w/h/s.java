package f.h.b.a.i.w.h;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import f.h.b.a.i.h;
import f.h.b.a.i.w.i.a0;
import f.h.b.a.i.w.i.g0;
import f.h.b.a.i.w.i.z;
import f.h.b.a.i.x.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: Uploader.java */
/* loaded from: classes.dex */
public class s {
    public final Context a;
    public final f.h.b.a.i.s.e b;
    public final a0 c;

    /* renamed from: d  reason: collision with root package name */
    public final w f3739d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f3740e;

    /* renamed from: f  reason: collision with root package name */
    public final f.h.b.a.i.x.a f3741f;

    /* renamed from: g  reason: collision with root package name */
    public final f.h.b.a.i.y.a f3742g;

    /* renamed from: h  reason: collision with root package name */
    public final f.h.b.a.i.y.a f3743h;

    /* renamed from: i  reason: collision with root package name */
    public final z f3744i;

    public s(Context context, f.h.b.a.i.s.e eVar, a0 a0Var, w wVar, Executor executor, f.h.b.a.i.x.a aVar, f.h.b.a.i.y.a aVar2, f.h.b.a.i.y.a aVar3, z zVar) {
        this.a = context;
        this.b = eVar;
        this.c = a0Var;
        this.f3739d = wVar;
        this.f3740e = executor;
        this.f3741f = aVar;
        this.f3742g = aVar2;
        this.f3743h = aVar3;
        this.f3744i = zVar;
    }

    public BackendResponse a(final f.h.b.a.i.l lVar, int i2) {
        BackendResponse a;
        f.h.b.a.i.s.l a2 = this.b.a(lVar.b());
        BackendResponse bVar = new f.h.b.a.i.s.b(BackendResponse.Status.OK, 0L);
        final long j2 = 0;
        while (((Boolean) this.f3741f.f(new a.InterfaceC0099a() { // from class: f.h.b.a.i.w.h.e
            @Override // f.h.b.a.i.x.a.InterfaceC0099a
            public final Object a() {
                s sVar = s.this;
                return Boolean.valueOf(sVar.c.c0(lVar));
            }
        })).booleanValue()) {
            final Iterable<g0> iterable = (Iterable) this.f3741f.f(new a.InterfaceC0099a() { // from class: f.h.b.a.i.w.h.g
                @Override // f.h.b.a.i.x.a.InterfaceC0099a
                public final Object a() {
                    s sVar = s.this;
                    return sVar.c.o(lVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return bVar;
            }
            if (a2 == null) {
                f.c.a.a.i.i("Uploader", "Unknown backend for %s, deleting event batch for it...", lVar);
                a = BackendResponse.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (g0 g0Var : iterable) {
                    arrayList.add(g0Var.a());
                }
                if (lVar.c() != null) {
                    f.h.b.a.i.x.a aVar = this.f3741f;
                    final z zVar = this.f3744i;
                    Objects.requireNonNull(zVar);
                    f.h.b.a.i.u.a.a aVar2 = (f.h.b.a.i.u.a.a) aVar.f(new a.InterfaceC0099a() { // from class: f.h.b.a.i.w.h.o
                        @Override // f.h.b.a.i.x.a.InterfaceC0099a
                        public final Object a() {
                            return z.this.g();
                        }
                    });
                    h.a a3 = f.h.b.a.i.h.a();
                    a3.e(this.f3742g.getTime());
                    a3.g(this.f3743h.getTime());
                    a3.f("GDT_CLIENT_METRICS");
                    f.h.b.a.b bVar2 = new f.h.b.a.b("proto");
                    Objects.requireNonNull(aVar2);
                    a3.d(new f.h.b.a.i.g(bVar2, f.h.b.a.i.j.a.encode(aVar2)));
                    arrayList.add(a2.b(a3.b()));
                }
                a = a2.a(new f.h.b.a.i.s.a(arrayList, lVar.c(), null));
            }
            BackendResponse backendResponse = a;
            if (backendResponse.c() == BackendResponse.Status.TRANSIENT_ERROR) {
                this.f3741f.f(new a.InterfaceC0099a() { // from class: f.h.b.a.i.w.h.h
                    @Override // f.h.b.a.i.x.a.InterfaceC0099a
                    public final Object a() {
                        s sVar = s.this;
                        Iterable<g0> iterable2 = iterable;
                        f.h.b.a.i.l lVar2 = lVar;
                        long j3 = j2;
                        sVar.c.e0(iterable2);
                        sVar.c.r(lVar2, sVar.f3742g.getTime() + j3);
                        return null;
                    }
                });
                this.f3739d.b(lVar, i2 + 1, true);
                return backendResponse;
            }
            this.f3741f.f(new a.InterfaceC0099a() { // from class: f.h.b.a.i.w.h.j
                @Override // f.h.b.a.i.x.a.InterfaceC0099a
                public final Object a() {
                    s sVar = s.this;
                    sVar.c.i(iterable);
                    return null;
                }
            });
            if (backendResponse.c() == BackendResponse.Status.OK) {
                long max = Math.max(j2, backendResponse.b());
                if (lVar.c() != null) {
                    this.f3741f.f(new a.InterfaceC0099a() { // from class: f.h.b.a.i.w.h.l
                        @Override // f.h.b.a.i.x.a.InterfaceC0099a
                        public final Object a() {
                            s.this.f3744i.a();
                            return null;
                        }
                    });
                }
                j2 = max;
            } else if (backendResponse.c() == BackendResponse.Status.INVALID_PAYLOAD) {
                final HashMap hashMap = new HashMap();
                for (g0 g0Var2 : iterable) {
                    String h2 = g0Var2.a().h();
                    if (!hashMap.containsKey(h2)) {
                        hashMap.put(h2, 1);
                    } else {
                        hashMap.put(h2, Integer.valueOf(((Integer) hashMap.get(h2)).intValue() + 1));
                    }
                }
                this.f3741f.f(new a.InterfaceC0099a() { // from class: f.h.b.a.i.w.h.f
                    @Override // f.h.b.a.i.x.a.InterfaceC0099a
                    public final Object a() {
                        s sVar = s.this;
                        Map map = hashMap;
                        Objects.requireNonNull(sVar);
                        for (Map.Entry entry : map.entrySet()) {
                            sVar.f3744i.l(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
                        }
                        return null;
                    }
                });
            }
            bVar = backendResponse;
        }
        this.f3741f.f(new a.InterfaceC0099a() { // from class: f.h.b.a.i.w.h.i
            @Override // f.h.b.a.i.x.a.InterfaceC0099a
            public final Object a() {
                s sVar = s.this;
                sVar.c.r(lVar, sVar.f3742g.getTime() + j2);
                return null;
            }
        });
        return bVar;
    }
}
