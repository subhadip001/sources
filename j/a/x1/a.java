package j.a.x1;

import android.os.Handler;
import android.os.Looper;
import i.j.f;
import i.l.a.l;
import i.l.b.i;
import i.l.b.j;
import j.a.c1;
import j.a.h;
import j.a.h0;
import j.a.j1;
import j.a.l0;
import java.util.concurrent.CancellationException;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes2.dex */
public final class a extends j.a.x1.b implements h0 {
    private volatile a _immediate;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f8793g;

    /* renamed from: h  reason: collision with root package name */
    public final String f8794h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8795i;

    /* renamed from: j  reason: collision with root package name */
    public final a f8796j;

    /* compiled from: Runnable.kt */
    /* renamed from: j.a.x1.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class RunnableC0228a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h f8797f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ a f8798g;

        public RunnableC0228a(h hVar, a aVar) {
            this.f8797f = hVar;
            this.f8798g = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f8797f.j(this.f8798g, i.h.a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    /* loaded from: classes2.dex */
    public static final class b extends j implements l<Throwable, i.h> {

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Runnable f8800h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable) {
            super(1);
            this.f8800h = runnable;
        }

        @Override // i.l.a.l
        public i.h b(Throwable th) {
            a.this.f8793g.removeCallbacks(this.f8800h);
            return i.h.a;
        }
    }

    public a(Handler handler, String str, boolean z) {
        super(null);
        this.f8793g = handler;
        this.f8794h = str;
        this.f8795i = z;
        this._immediate = z ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
        }
        this.f8796j = aVar;
    }

    @Override // j.a.z
    public void d0(f fVar, Runnable runnable) {
        if (this.f8793g.post(runnable)) {
            return;
        }
        q0(fVar, runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f8793g == this.f8793g;
    }

    @Override // j.a.z
    public boolean g0(f fVar) {
        return (this.f8795i && i.a(Looper.myLooper(), this.f8793g.getLooper())) ? false : true;
    }

    public int hashCode() {
        return System.identityHashCode(this.f8793g);
    }

    @Override // j.a.j1
    public j1 i0() {
        return this.f8796j;
    }

    @Override // j.a.h0
    public void p(long j2, h<? super i.h> hVar) {
        RunnableC0228a runnableC0228a = new RunnableC0228a(hVar, this);
        Handler handler = this.f8793g;
        if (j2 > 4611686018427387903L) {
            j2 = 4611686018427387903L;
        }
        if (handler.postDelayed(runnableC0228a, j2)) {
            hVar.i(new b(runnableC0228a));
        } else {
            q0(hVar.getContext(), runnableC0228a);
        }
    }

    public final void q0(f fVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        int i2 = c1.f8737e;
        c1 c1Var = (c1) fVar.get(c1.a.f8738f);
        if (c1Var != null) {
            c1Var.T(cancellationException);
        }
        l0.b.d0(fVar, runnable);
    }

    @Override // j.a.j1, j.a.z
    public String toString() {
        String m0 = m0();
        if (m0 == null) {
            String str = this.f8794h;
            if (str == null) {
                str = this.f8793g.toString();
            }
            return this.f8795i ? f.a.b.a.a.p(str, ".immediate") : str;
        }
        return m0;
    }
}
