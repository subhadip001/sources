package f.e.a.l.q.b0;

import f.e.a.l.q.b0.l;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: BaseKeyPool.java */
/* loaded from: classes.dex */
public abstract class c<T extends l> {
    public final Queue<T> a;

    public c() {
        char[] cArr = f.e.a.r.l.a;
        this.a = new ArrayDeque(20);
    }

    public abstract T a();

    public T b() {
        T poll = this.a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
