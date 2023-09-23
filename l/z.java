package l;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: Timeout.java */
/* loaded from: classes2.dex */
public class z {

    /* renamed from: d  reason: collision with root package name */
    public static final z f9266d = new a();
    public boolean a;
    public long b;
    public long c;

    /* compiled from: Timeout.java */
    /* loaded from: classes2.dex */
    public class a extends z {
        @Override // l.z
        public z d(long j2) {
            return this;
        }

        @Override // l.z
        public void f() {
        }

        @Override // l.z
        public z g(long j2, TimeUnit timeUnit) {
            return this;
        }
    }

    public z a() {
        this.a = false;
        return this;
    }

    public z b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public z d(long j2) {
        this.a = true;
        this.b = j2;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (!Thread.interrupted()) {
            if (this.a && this.b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("thread interrupted");
    }

    public z g(long j2, TimeUnit timeUnit) {
        if (j2 >= 0) {
            if (timeUnit != null) {
                this.c = timeUnit.toNanos(j2);
                return this;
            }
            throw new IllegalArgumentException("unit == null");
        }
        throw new IllegalArgumentException(f.a.b.a.a.l("timeout < 0: ", j2));
    }
}
