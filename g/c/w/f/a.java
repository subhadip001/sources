package g.c.w.f;

import g.c.w.c.i;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscArrayQueue.java */
/* loaded from: classes2.dex */
public final class a<E> extends AtomicReferenceArray<E> implements i<E> {

    /* renamed from: k  reason: collision with root package name */
    public static final Integer f8484k = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: f  reason: collision with root package name */
    public final int f8485f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicLong f8486g;

    /* renamed from: h  reason: collision with root package name */
    public long f8487h;

    /* renamed from: i  reason: collision with root package name */
    public final AtomicLong f8488i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8489j;

    public a(int i2) {
        super(f.n.a.n.i.T(i2));
        this.f8485f = length() - 1;
        this.f8486g = new AtomicLong();
        this.f8488i = new AtomicLong();
        this.f8489j = Math.min(i2 / 4, f8484k.intValue());
    }

    @Override // g.c.w.c.j
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // g.c.w.c.j
    public boolean isEmpty() {
        return this.f8486g.get() == this.f8488i.get();
    }

    @Override // g.c.w.c.j
    public boolean offer(E e2) {
        Objects.requireNonNull(e2, "Null is not a valid element");
        int i2 = this.f8485f;
        long j2 = this.f8486g.get();
        int i3 = ((int) j2) & i2;
        if (j2 >= this.f8487h) {
            long j3 = this.f8489j + j2;
            if (get(i2 & ((int) j3)) == null) {
                this.f8487h = j3;
            } else if (get(i3) != null) {
                return false;
            }
        }
        lazySet(i3, e2);
        this.f8486g.lazySet(j2 + 1);
        return true;
    }

    @Override // g.c.w.c.i, g.c.w.c.j
    public E poll() {
        long j2 = this.f8488i.get();
        int i2 = ((int) j2) & this.f8485f;
        E e2 = get(i2);
        if (e2 == null) {
            return null;
        }
        this.f8488i.lazySet(j2 + 1);
        lazySet(i2, null);
        return e2;
    }
}
