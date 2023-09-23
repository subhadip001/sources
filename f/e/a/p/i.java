package f.e.a.p;

import com.bumptech.glide.request.RequestCoordinator;

/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: classes.dex */
public class i implements RequestCoordinator, d {
    public final RequestCoordinator a;
    public final Object b;
    public volatile d c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f3588d;

    /* renamed from: e  reason: collision with root package name */
    public RequestCoordinator.RequestState f3589e;

    /* renamed from: f  reason: collision with root package name */
    public RequestCoordinator.RequestState f3590f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3591g;

    public i(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f3589e = requestState;
        this.f3590f = requestState;
        this.b = obj;
        this.a = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, f.e.a.p.d
    public boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.f3588d.a() || this.c.a();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator b() {
        RequestCoordinator b;
        synchronized (this.b) {
            RequestCoordinator requestCoordinator = this.a;
            b = requestCoordinator != null ? requestCoordinator.b() : this;
        }
        return b;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void c(d dVar) {
        synchronized (this.b) {
            if (!dVar.equals(this.c)) {
                this.f3590f = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.f3589e = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.a;
            if (requestCoordinator != null) {
                requestCoordinator.c(this);
            }
        }
    }

    @Override // f.e.a.p.d
    public void clear() {
        synchronized (this.b) {
            this.f3591g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f3589e = requestState;
            this.f3590f = requestState;
            this.f3588d.clear();
            this.c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean d(d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            RequestCoordinator requestCoordinator = this.a;
            z = true;
            if (requestCoordinator != null && !requestCoordinator.d(this)) {
                z2 = false;
                if (z2 || !dVar.equals(this.c) || a()) {
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

    @Override // f.e.a.p.d
    public void e() {
        synchronized (this.b) {
            if (!this.f3590f.a()) {
                this.f3590f = RequestCoordinator.RequestState.PAUSED;
                this.f3588d.e();
            }
            if (!this.f3589e.a()) {
                this.f3589e = RequestCoordinator.RequestState.PAUSED;
                this.c.e();
            }
        }
    }

    @Override // f.e.a.p.d
    public boolean f(d dVar) {
        if (dVar instanceof i) {
            i iVar = (i) dVar;
            if (this.c == null) {
                if (iVar.c != null) {
                    return false;
                }
            } else if (!this.c.f(iVar.c)) {
                return false;
            }
            if (this.f3588d == null) {
                if (iVar.f3588d != null) {
                    return false;
                }
            } else if (!this.f3588d.f(iVar.f3588d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // f.e.a.p.d
    public boolean g() {
        boolean z;
        synchronized (this.b) {
            z = this.f3589e == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean h(d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            RequestCoordinator requestCoordinator = this.a;
            z = true;
            if (requestCoordinator != null && !requestCoordinator.h(this)) {
                z2 = false;
                if (z2 || (!dVar.equals(this.c) && this.f3589e == RequestCoordinator.RequestState.SUCCESS)) {
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

    @Override // f.e.a.p.d
    public void i() {
        synchronized (this.b) {
            this.f3591g = true;
            if (this.f3589e != RequestCoordinator.RequestState.SUCCESS) {
                RequestCoordinator.RequestState requestState = this.f3590f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f3590f = requestState2;
                    this.f3588d.i();
                }
            }
            if (this.f3591g) {
                RequestCoordinator.RequestState requestState3 = this.f3589e;
                RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                if (requestState3 != requestState4) {
                    this.f3589e = requestState4;
                    this.c.i();
                }
            }
            this.f3591g = false;
        }
    }

    @Override // f.e.a.p.d
    public boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = this.f3589e == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void j(d dVar) {
        synchronized (this.b) {
            if (dVar.equals(this.f3588d)) {
                this.f3590f = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.f3589e = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.a;
            if (requestCoordinator != null) {
                requestCoordinator.j(this);
            }
            if (!this.f3590f.a()) {
                this.f3588d.clear();
            }
        }
    }

    @Override // f.e.a.p.d
    public boolean k() {
        boolean z;
        synchronized (this.b) {
            z = this.f3589e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean l(d dVar) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            RequestCoordinator requestCoordinator = this.a;
            z = true;
            if (requestCoordinator != null && !requestCoordinator.l(this)) {
                z2 = false;
                if (z2 || !dVar.equals(this.c) || this.f3589e == RequestCoordinator.RequestState.PAUSED) {
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
