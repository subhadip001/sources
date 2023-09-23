package f.h.b.b.b2;

import android.os.Handler;
import android.os.Looper;
import f.h.b.b.b2.a0;
import f.h.b.b.b2.z;
import f.h.b.b.q1;
import f.h.b.b.x1.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: BaseMediaSource.java */
/* loaded from: classes.dex */
public abstract class j implements z {
    public final ArrayList<z.b> a = new ArrayList<>(1);
    public final HashSet<z.b> b = new HashSet<>(1);
    public final a0.a c = new a0.a();

    /* renamed from: d  reason: collision with root package name */
    public final a.C0110a f3868d = new a.C0110a();

    /* renamed from: e  reason: collision with root package name */
    public Looper f3869e;

    /* renamed from: f  reason: collision with root package name */
    public q1 f3870f;

    @Override // f.h.b.b.b2.z
    public final void a(z.b bVar) {
        this.a.remove(bVar);
        if (this.a.isEmpty()) {
            this.f3869e = null;
            this.f3870f = null;
            this.b.clear();
            r();
            return;
        }
        d(bVar);
    }

    @Override // f.h.b.b.b2.z
    public final void b(Handler handler, a0 a0Var) {
        a0.a aVar = this.c;
        Objects.requireNonNull(aVar);
        aVar.c.add(new a0.a.C0101a(handler, a0Var));
    }

    @Override // f.h.b.b.b2.z
    public final void c(a0 a0Var) {
        a0.a aVar = this.c;
        Iterator<a0.a.C0101a> it = aVar.c.iterator();
        while (it.hasNext()) {
            a0.a.C0101a next = it.next();
            if (next.b == a0Var) {
                aVar.c.remove(next);
            }
        }
    }

    @Override // f.h.b.b.b2.z
    public final void d(z.b bVar) {
        boolean z = !this.b.isEmpty();
        this.b.remove(bVar);
        if (z && this.b.isEmpty()) {
            n();
        }
    }

    @Override // f.h.b.b.b2.z
    public final void f(Handler handler, f.h.b.b.x1.a aVar) {
        a.C0110a c0110a = this.f3868d;
        Objects.requireNonNull(c0110a);
        c0110a.c.add(new a.C0110a.C0111a(handler, aVar));
    }

    @Override // f.h.b.b.b2.z
    public /* synthetic */ boolean h() {
        return y.b(this);
    }

    @Override // f.h.b.b.b2.z
    public /* synthetic */ q1 j() {
        return y.a(this);
    }

    @Override // f.h.b.b.b2.z
    public final void k(z.b bVar, f.h.b.b.f2.t tVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f3869e;
        f.h.b.b.e2.j.c(looper == null || looper == myLooper);
        q1 q1Var = this.f3870f;
        this.a.add(bVar);
        if (this.f3869e == null) {
            this.f3869e = myLooper;
            this.b.add(bVar);
            p(tVar);
        } else if (q1Var != null) {
            l(bVar);
            bVar.a(this, q1Var);
        }
    }

    @Override // f.h.b.b.b2.z
    public final void l(z.b bVar) {
        Objects.requireNonNull(this.f3869e);
        boolean isEmpty = this.b.isEmpty();
        this.b.add(bVar);
        if (isEmpty) {
            o();
        }
    }

    public void n() {
    }

    public void o() {
    }

    public abstract void p(f.h.b.b.f2.t tVar);

    public final void q(q1 q1Var) {
        this.f3870f = q1Var;
        Iterator<z.b> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(this, q1Var);
        }
    }

    public abstract void r();
}
