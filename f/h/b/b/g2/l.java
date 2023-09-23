package f.h.b.b.g2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import f.h.b.b.g2.l;
import f.h.b.b.g2.q;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ListenerSet.java */
/* loaded from: classes.dex */
public final class l<T, E extends q> {
    public final f a;
    public final y b;
    public final f.h.c.a.p<E> c;

    /* renamed from: d  reason: collision with root package name */
    public final b<T, E> f4283d;

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArraySet<c<T, E>> f4284e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<Runnable> f4285f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<Runnable> f4286g = new ArrayDeque<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f4287h;

    /* compiled from: ListenerSet.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        void b(T t);
    }

    /* compiled from: ListenerSet.java */
    /* loaded from: classes.dex */
    public interface b<T, E extends q> {
        void a(T t, E e2);
    }

    /* compiled from: ListenerSet.java */
    /* loaded from: classes.dex */
    public static final class c<T, E extends q> {
        public final T a;
        public E b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4288d;

        public c(T t, f.h.c.a.p<E> pVar) {
            this.a = t;
            this.b = pVar.get();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public l(CopyOnWriteArraySet<c<T, E>> copyOnWriteArraySet, Looper looper, f fVar, f.h.c.a.p<E> pVar, b<T, E> bVar) {
        this.a = fVar;
        this.f4284e = copyOnWriteArraySet;
        this.c = pVar;
        this.f4283d = bVar;
        this.b = fVar.b(looper, new Handler.Callback() { // from class: f.h.b.b.g2.b
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                l lVar = l.this;
                Objects.requireNonNull(lVar);
                int i2 = message.what;
                if (i2 == 0) {
                    Iterator it = lVar.f4284e.iterator();
                    while (it.hasNext()) {
                        l.c cVar = (l.c) it.next();
                        f.h.c.a.p<E> pVar2 = lVar.c;
                        l.b<T, E> bVar2 = lVar.f4283d;
                        if (!cVar.f4288d && cVar.c) {
                            E e2 = cVar.b;
                            cVar.b = (E) pVar2.get();
                            cVar.c = false;
                            bVar2.a(cVar.a, e2);
                        }
                        if (lVar.b.a.hasMessages(0)) {
                            break;
                        }
                    }
                } else if (i2 == 1) {
                    lVar.b(message.arg1, (l.a) message.obj);
                    lVar.a();
                    lVar.c();
                }
                return true;
            }
        });
    }

    public void a() {
        if (this.f4286g.isEmpty()) {
            return;
        }
        if (!this.b.a.hasMessages(0)) {
            this.b.a(0).sendToTarget();
        }
        boolean z = !this.f4285f.isEmpty();
        this.f4285f.addAll(this.f4286g);
        this.f4286g.clear();
        if (z) {
            return;
        }
        while (!this.f4285f.isEmpty()) {
            this.f4285f.peekFirst().run();
            this.f4285f.removeFirst();
        }
    }

    public void b(final int i2, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f4284e);
        this.f4286g.add(new Runnable() { // from class: f.h.b.b.g2.a
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i3 = i2;
                l.a aVar2 = aVar;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    l.c cVar = (l.c) it.next();
                    if (!cVar.f4288d) {
                        if (i3 != -1) {
                            cVar.b.a.append(i3, true);
                        }
                        cVar.c = true;
                        aVar2.b(cVar.a);
                    }
                }
            }
        });
    }

    public void c() {
        Iterator<c<T, E>> it = this.f4284e.iterator();
        while (it.hasNext()) {
            c<T, E> next = it.next();
            b<T, E> bVar = this.f4283d;
            next.f4288d = true;
            if (next.c) {
                bVar.a(next.a, next.b);
            }
        }
        this.f4284e.clear();
        this.f4287h = true;
    }
}
