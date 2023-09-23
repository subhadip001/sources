package g.c.y;

import g.c.o;
import g.c.w.g.i;
import g.c.w.g.j;
import java.util.concurrent.Callable;

/* compiled from: Schedulers.java */
/* loaded from: classes2.dex */
public final class a {
    public static final o a;
    public static final o b;

    /* compiled from: Schedulers.java */
    /* renamed from: g.c.y.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0220a {
        public static final o a = new g.c.w.g.a();
    }

    /* compiled from: Schedulers.java */
    /* loaded from: classes2.dex */
    public static final class b implements Callable<o> {
        @Override // java.util.concurrent.Callable
        public o call() {
            return C0220a.a;
        }
    }

    /* compiled from: Schedulers.java */
    /* loaded from: classes2.dex */
    public static final class c implements Callable<o> {
        @Override // java.util.concurrent.Callable
        public o call() {
            return d.a;
        }
    }

    /* compiled from: Schedulers.java */
    /* loaded from: classes2.dex */
    public static final class d {
        public static final o a = new g.c.w.g.b();
    }

    /* compiled from: Schedulers.java */
    /* loaded from: classes2.dex */
    public static final class e {
        public static final o a = new g.c.w.g.c();
    }

    /* compiled from: Schedulers.java */
    /* loaded from: classes2.dex */
    public static final class f implements Callable<o> {
        @Override // java.util.concurrent.Callable
        public o call() {
            return e.a;
        }
    }

    /* compiled from: Schedulers.java */
    /* loaded from: classes2.dex */
    public static final class g {
        public static final o a = new i();
    }

    /* compiled from: Schedulers.java */
    /* loaded from: classes2.dex */
    public static final class h implements Callable<o> {
        @Override // java.util.concurrent.Callable
        public o call() {
            return g.a;
        }
    }

    static {
        f.n.a.n.i.g(new h());
        a = f.n.a.n.i.g(new b());
        b = f.n.a.n.i.g(new c());
        j jVar = j.a;
        j jVar2 = j.a;
        f.n.a.n.i.g(new f());
    }
}
