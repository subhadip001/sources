package j.a.z1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: WorkQueue.kt */
/* loaded from: classes2.dex */
public final class m {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8844d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8845e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");
    public final AtomicReferenceArray<g> a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final g a(g gVar, boolean z) {
        if (z) {
            return b(gVar);
        }
        g gVar2 = (g) b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return b(gVar2);
    }

    public final g b(g gVar) {
        if (gVar.f8837g.b() == 1) {
            f8845e.incrementAndGet(this);
        }
        if (c() == 127) {
            return gVar;
        }
        int i2 = this.producerIndex & 127;
        while (this.a.get(i2) != null) {
            Thread.yield();
        }
        this.a.lazySet(i2, gVar);
        c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int d() {
        return this.lastScheduledTask != null ? c() + 1 : c();
    }

    public final g e() {
        g gVar = (g) b.getAndSet(this, null);
        return gVar == null ? f() : gVar;
    }

    public final g f() {
        g andSet;
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (f8844d.compareAndSet(this, i2, i2 + 1) && (andSet = this.a.getAndSet(i3, null)) != null) {
                if (andSet.f8837g.b() == 1) {
                    f8845e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long g(m mVar) {
        int i2 = mVar.consumerIndex;
        int i3 = mVar.producerIndex;
        AtomicReferenceArray<g> atomicReferenceArray = mVar.a;
        while (true) {
            if (i2 == i3) {
                break;
            }
            int i4 = i2 & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            g gVar = atomicReferenceArray.get(i4);
            if (gVar != null) {
                if ((gVar.f8837g.b() == 1) && atomicReferenceArray.compareAndSet(i4, gVar, null)) {
                    f8845e.decrementAndGet(mVar);
                    a(gVar, false);
                    return -1L;
                }
            }
            i2++;
        }
        return h(mVar, true);
    }

    public final long h(m mVar, boolean z) {
        g gVar;
        do {
            gVar = (g) mVar.lastScheduledTask;
            if (gVar == null) {
                return -2L;
            }
            if (z) {
                if (!(gVar.f8837g.b() == 1)) {
                    return -2L;
                }
            }
            long a = k.f8840e.a() - gVar.f8836f;
            long j2 = k.a;
            if (a < j2) {
                return j2 - a;
            }
        } while (!b.compareAndSet(mVar, gVar, null));
        a(gVar, false);
        return -1L;
    }
}
