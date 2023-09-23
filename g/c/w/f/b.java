package g.c.w.f;

import g.c.w.c.i;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: SpscLinkedArrayQueue.java */
/* loaded from: classes2.dex */
public final class b<T> implements i<T> {
    public static final int n = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object o = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final AtomicLong f8490f;

    /* renamed from: g  reason: collision with root package name */
    public int f8491g;

    /* renamed from: h  reason: collision with root package name */
    public long f8492h;

    /* renamed from: i  reason: collision with root package name */
    public final int f8493i;

    /* renamed from: j  reason: collision with root package name */
    public AtomicReferenceArray<Object> f8494j;

    /* renamed from: k  reason: collision with root package name */
    public final int f8495k;

    /* renamed from: l  reason: collision with root package name */
    public AtomicReferenceArray<Object> f8496l;

    /* renamed from: m  reason: collision with root package name */
    public final AtomicLong f8497m;

    public b(int i2) {
        AtomicLong atomicLong = new AtomicLong();
        this.f8490f = atomicLong;
        this.f8497m = new AtomicLong();
        int T = f.n.a.n.i.T(Math.max(8, i2));
        int i3 = T - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(T + 1);
        this.f8494j = atomicReferenceArray;
        this.f8493i = i3;
        this.f8491g = Math.min(T / 4, n);
        this.f8496l = atomicReferenceArray;
        this.f8495k = i3;
        this.f8492h = i3 - 1;
        atomicLong.lazySet(0L);
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
        return this.f8490f.get() == this.f8497m.get();
    }

    @Override // g.c.w.c.j
    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.f8494j;
        long j2 = this.f8490f.get();
        int i2 = this.f8493i;
        int i3 = ((int) j2) & i2;
        if (j2 < this.f8492h) {
            atomicReferenceArray.lazySet(i3, t);
            this.f8490f.lazySet(j2 + 1);
            return true;
        }
        long j3 = this.f8491g + j2;
        if (atomicReferenceArray.get(((int) j3) & i2) == null) {
            this.f8492h = j3 - 1;
            atomicReferenceArray.lazySet(i3, t);
            this.f8490f.lazySet(j2 + 1);
            return true;
        }
        long j4 = j2 + 1;
        if (atomicReferenceArray.get(((int) j4) & i2) == null) {
            atomicReferenceArray.lazySet(i3, t);
            this.f8490f.lazySet(j4);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f8494j = atomicReferenceArray2;
        this.f8492h = (i2 + j2) - 1;
        atomicReferenceArray2.lazySet(i3, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, o);
        this.f8490f.lazySet(j4);
        return true;
    }

    @Override // g.c.w.c.i, g.c.w.c.j
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f8496l;
        long j2 = this.f8497m.get();
        int i2 = this.f8495k;
        int i3 = ((int) j2) & i2;
        T t = (T) atomicReferenceArray.get(i3);
        boolean z = t == o;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i3, null);
            this.f8497m.lazySet(j2 + 1);
            return t;
        } else if (z) {
            int i4 = i2 + 1;
            AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i4);
            atomicReferenceArray.lazySet(i4, null);
            this.f8496l = atomicReferenceArray2;
            T t2 = (T) atomicReferenceArray2.get(i3);
            if (t2 != null) {
                atomicReferenceArray2.lazySet(i3, null);
                this.f8497m.lazySet(j2 + 1);
            }
            return t2;
        } else {
            return null;
        }
    }
}
