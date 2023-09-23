package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.internal.injection.scopes.FirebaseAppScope;
import f.h.c.g.a.a;
import f.h.g.a.a.a.d.d;
import f.h.g.a.a.a.d.e;
import f.h.g.a.a.a.d.g;
import f.h.h.q;
import g.a.b;
import g.a.c;
import g.a.n;
import g.a.x0.a.b;
import g.a.y0.c;
import io.grpc.MethodDescriptor;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@FirebaseAppScope
/* loaded from: classes2.dex */
public class GrpcClient {
    private final g.a stub;

    public GrpcClient(g.a aVar) {
        this.stub = aVar;
    }

    public e fetchEligibleCampaigns(d dVar) {
        g.a aVar = this.stub;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c cVar = aVar.a;
        b bVar = aVar.b;
        Objects.requireNonNull(bVar);
        n.b bVar2 = n.f7550i;
        Objects.requireNonNull(timeUnit, "units");
        long nanos = timeUnit.toNanos(30000L);
        boolean z = true;
        n nVar = new n(bVar2, nanos, true);
        b bVar3 = new b(bVar);
        bVar3.a = nVar;
        g.a aVar2 = (g.a) aVar.a(cVar, bVar3);
        c cVar2 = aVar2.a;
        MethodDescriptor<d, e> methodDescriptor = g.a;
        if (methodDescriptor == null) {
            synchronized (g.class) {
                methodDescriptor = g.a;
                if (methodDescriptor == null) {
                    MethodDescriptor.MethodType methodType = MethodDescriptor.MethodType.UNARY;
                    String a = MethodDescriptor.a("google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing", "FetchEligibleCampaigns");
                    d f2 = d.f();
                    q qVar = g.a.x0.a.b.a;
                    methodDescriptor = new MethodDescriptor<>(methodType, a, new b.a(f2), new b.a(e.c()), null, false, false, true, null);
                    g.a = methodDescriptor;
                }
            }
        }
        g.a.b bVar4 = aVar2.b;
        Logger logger = g.a.y0.c.a;
        c.e eVar = new c.e();
        g.a.b bVar5 = new g.a.b(bVar4.e(g.a.y0.c.c, c.d.BLOCKING));
        bVar5.b = eVar;
        g.a.d h2 = cVar2.h(methodDescriptor, bVar5);
        boolean z2 = false;
        try {
            try {
                f.h.c.g.a.c b = g.a.y0.c.b(h2, dVar);
                while (!((a) b).isDone()) {
                    try {
                        try {
                            eVar.a();
                        } catch (InterruptedException e2) {
                            try {
                                h2.a("Thread interrupted", e2);
                                z2 = true;
                            } catch (Error e3) {
                                e = e3;
                                g.a.y0.c.a(h2, e);
                                throw null;
                            } catch (RuntimeException e4) {
                                e = e4;
                                g.a.y0.c.a(h2, e);
                                throw null;
                            }
                        }
                    } catch (Error e5) {
                        e = e5;
                    } catch (RuntimeException e6) {
                        e = e6;
                    } catch (Throwable th) {
                        th = th;
                        z = z2;
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                eVar.shutdown();
                Object c = g.a.y0.c.c(b);
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                return (e) c;
            } catch (Error e7) {
                e = e7;
            } catch (RuntimeException e8) {
                e = e8;
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
