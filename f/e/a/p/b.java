package f.e.a.p;

import com.bumptech.glide.request.RequestCoordinator;

/* compiled from: ErrorRequestCoordinator.java */
/* loaded from: classes.dex */
public final class b implements RequestCoordinator, d {
    public final Object a;
    public final RequestCoordinator b;
    public volatile d c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f3568d;

    /* renamed from: e  reason: collision with root package name */
    public RequestCoordinator.RequestState f3569e;

    /* renamed from: f  reason: collision with root package name */
    public RequestCoordinator.RequestState f3570f;

    public b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f3569e = requestState;
        this.f3570f = requestState;
        this.a = obj;
        this.b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, f.e.a.p.d
    public boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.c.a() || this.f3568d.a();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator b() {
        RequestCoordinator b;
        synchronized (this.a) {
            RequestCoordinator requestCoordinator = this.b;
            b = requestCoordinator != null ? requestCoordinator.b() : this;
        }
        return b;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void c(d dVar) {
        synchronized (this.a) {
            if (!dVar.equals(this.f3568d)) {
                this.f3569e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f3570f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f3570f = requestState2;
                    this.f3568d.i();
                }
                return;
            }
            this.f3570f = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.b;
            if (requestCoordinator != null) {
                requestCoordinator.c(this);
            }
        }
    }

    @Override // f.e.a.p.d
    public void clear() {
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f3569e = requestState;
            this.c.clear();
            if (this.f3570f != requestState) {
                this.f3570f = requestState;
                this.f3568d.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[Catch: all -> 0x003b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:12:0x0015, B:14:0x001b, B:25:0x0039, B:15:0x0022, B:17:0x002a), top: B:30:0x0003 }] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(f.e.a.p.d r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator r1 = r5.b     // Catch: java.lang.Throwable -> L3b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            boolean r1 = r1.d(r5)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            if (r1 == 0) goto L38
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r5.f3569e     // Catch: java.lang.Throwable -> L3b
            com.bumptech.glide.request.RequestCoordinator$RequestState r4 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L3b
            if (r1 == r4) goto L22
            f.e.a.p.d r1 = r5.c     // Catch: java.lang.Throwable -> L3b
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L3b
            goto L35
        L22:
            f.e.a.p.d r1 = r5.f3568d     // Catch: java.lang.Throwable -> L3b
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L34
            com.bumptech.glide.request.RequestCoordinator$RequestState r6 = r5.f3570f     // Catch: java.lang.Throwable -> L3b
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L3b
            if (r6 == r1) goto L32
            if (r6 != r4) goto L34
        L32:
            r6 = 1
            goto L35
        L34:
            r6 = 0
        L35:
            if (r6 == 0) goto L38
            goto L39
        L38:
            r2 = 0
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return r2
        L3b:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.p.b.d(f.e.a.p.d):boolean");
    }

    @Override // f.e.a.p.d
    public void e() {
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f3569e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.f3569e = RequestCoordinator.RequestState.PAUSED;
                this.c.e();
            }
            if (this.f3570f == requestState2) {
                this.f3570f = RequestCoordinator.RequestState.PAUSED;
                this.f3568d.e();
            }
        }
    }

    @Override // f.e.a.p.d
    public boolean f(d dVar) {
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            return this.c.f(bVar.c) && this.f3568d.f(bVar.f3568d);
        }
        return false;
    }

    @Override // f.e.a.p.d
    public boolean g() {
        boolean z;
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f3569e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            z = requestState == requestState2 && this.f3570f == requestState2;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean h(d dVar) {
        boolean z;
        synchronized (this.a) {
            RequestCoordinator requestCoordinator = this.b;
            z = requestCoordinator == null || requestCoordinator.h(this);
        }
        return z;
    }

    @Override // f.e.a.p.d
    public void i() {
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f3569e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f3569e = requestState2;
                this.c.i();
            }
        }
    }

    @Override // f.e.a.p.d
    public boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f3569e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            z = requestState == requestState2 || this.f3570f == requestState2;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void j(d dVar) {
        synchronized (this.a) {
            if (dVar.equals(this.c)) {
                this.f3569e = RequestCoordinator.RequestState.SUCCESS;
            } else if (dVar.equals(this.f3568d)) {
                this.f3570f = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.b;
            if (requestCoordinator != null) {
                requestCoordinator.j(this);
            }
        }
    }

    @Override // f.e.a.p.d
    public boolean k() {
        boolean z;
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f3569e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            z = requestState == requestState2 || this.f3570f == requestState2;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean l(d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            RequestCoordinator requestCoordinator = this.b;
            z = true;
            if (requestCoordinator != null && !requestCoordinator.l(this)) {
                z2 = false;
                if (z2 || !dVar.equals(this.c)) {
                    z = false;
                }
            }
            z2 = true;
            if (z2) {
            }
            z = false;
        }
        return z;
    }
}
