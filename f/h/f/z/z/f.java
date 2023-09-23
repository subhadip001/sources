package f.h.f.z.z;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter.java */
/* loaded from: classes2.dex */
public final class f extends f.h.f.b0.b {
    public static final Writer t = new a();
    public static final f.h.f.s u = new f.h.f.s("closed");
    public final List<f.h.f.p> q;
    public String r;
    public f.h.f.p s;

    /* compiled from: JsonTreeWriter.java */
    /* loaded from: classes2.dex */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public f() {
        super(t);
        this.q = new ArrayList();
        this.s = f.h.f.q.a;
    }

    @Override // f.h.f.b0.b
    public f.h.f.b0.b F() {
        s0(f.h.f.q.a);
        return this;
    }

    @Override // f.h.f.b0.b
    public f.h.f.b0.b W(long j2) {
        s0(new f.h.f.s(Long.valueOf(j2)));
        return this;
    }

    @Override // f.h.f.b0.b
    public f.h.f.b0.b X(Boolean bool) {
        if (bool == null) {
            s0(f.h.f.q.a);
            return this;
        }
        s0(new f.h.f.s(bool));
        return this;
    }

    @Override // f.h.f.b0.b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.q.isEmpty()) {
            this.q.add(u);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // f.h.f.b0.b
    public f.h.f.b0.b d0(Number number) {
        if (number == null) {
            s0(f.h.f.q.a);
            return this;
        }
        if (!this.f6219k) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        s0(new f.h.f.s(number));
        return this;
    }

    @Override // f.h.f.b0.b
    public f.h.f.b0.b f() {
        f.h.f.m mVar = new f.h.f.m();
        s0(mVar);
        this.q.add(mVar);
        return this;
    }

    @Override // f.h.f.b0.b, java.io.Flushable
    public void flush() {
    }

    @Override // f.h.f.b0.b
    public f.h.f.b0.b g() {
        f.h.f.r rVar = new f.h.f.r();
        s0(rVar);
        this.q.add(rVar);
        return this;
    }

    @Override // f.h.f.b0.b
    public f.h.f.b0.b g0(String str) {
        if (str == null) {
            s0(f.h.f.q.a);
            return this;
        }
        s0(new f.h.f.s(str));
        return this;
    }

    @Override // f.h.f.b0.b
    public f.h.f.b0.b i0(boolean z) {
        s0(new f.h.f.s(Boolean.valueOf(z)));
        return this;
    }

    @Override // f.h.f.b0.b
    public f.h.f.b0.b p() {
        if (!this.q.isEmpty() && this.r == null) {
            if (r0() instanceof f.h.f.m) {
                List<f.h.f.p> list = this.q;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // f.h.f.b0.b
    public f.h.f.b0.b q() {
        if (!this.q.isEmpty() && this.r == null) {
            if (r0() instanceof f.h.f.r) {
                List<f.h.f.p> list = this.q;
                list.remove(list.size() - 1);
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public f.h.f.p q0() {
        if (this.q.isEmpty()) {
            return this.s;
        }
        StringBuilder A = f.a.b.a.a.A("Expected one JSON element but was ");
        A.append(this.q);
        throw new IllegalStateException(A.toString());
    }

    public final f.h.f.p r0() {
        List<f.h.f.p> list = this.q;
        return list.get(list.size() - 1);
    }

    public final void s0(f.h.f.p pVar) {
        if (this.r != null) {
            if (!(pVar instanceof f.h.f.q) || this.n) {
                ((f.h.f.r) r0()).a.put(this.r, pVar);
            }
            this.r = null;
        } else if (this.q.isEmpty()) {
            this.s = pVar;
        } else {
            f.h.f.p r0 = r0();
            if (r0 instanceof f.h.f.m) {
                ((f.h.f.m) r0).f6238f.add(pVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // f.h.f.b0.b
    public f.h.f.b0.b v(String str) {
        if (!this.q.isEmpty() && this.r == null) {
            if (r0() instanceof f.h.f.r) {
                this.r = str;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
