package g.a.v0;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: CompositeReadableBuffer.java */
/* loaded from: classes2.dex */
public class y extends g.a.v0.c {

    /* renamed from: f  reason: collision with root package name */
    public int f7977f;

    /* renamed from: g  reason: collision with root package name */
    public final Queue<d2> f7978g = new ArrayDeque();

    /* compiled from: CompositeReadableBuffer.java */
    /* loaded from: classes2.dex */
    public class a extends c {
        public a(y yVar) {
            super(null);
        }

        @Override // g.a.v0.y.c
        public int a(d2 d2Var, int i2) {
            return d2Var.readUnsignedByte();
        }
    }

    /* compiled from: CompositeReadableBuffer.java */
    /* loaded from: classes2.dex */
    public class b extends c {
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f7979d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ byte[] f7980e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y yVar, int i2, byte[] bArr) {
            super(null);
            this.f7979d = i2;
            this.f7980e = bArr;
            this.c = i2;
        }

        @Override // g.a.v0.y.c
        public int a(d2 d2Var, int i2) {
            d2Var.G(this.f7980e, this.c, i2);
            this.c += i2;
            return 0;
        }
    }

    /* compiled from: CompositeReadableBuffer.java */
    /* loaded from: classes2.dex */
    public static abstract class c {
        public int a;
        public IOException b;

        public c(a aVar) {
        }

        public abstract int a(d2 d2Var, int i2);
    }

    @Override // g.a.v0.d2
    public void G(byte[] bArr, int i2, int i3) {
        l(new b(this, i2, bArr), i3);
    }

    @Override // g.a.v0.d2
    public int c() {
        return this.f7977f;
    }

    @Override // g.a.v0.c, g.a.v0.d2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f7978g.isEmpty()) {
            this.f7978g.remove().close();
        }
    }

    public void f(d2 d2Var) {
        if (!(d2Var instanceof y)) {
            this.f7978g.add(d2Var);
            this.f7977f = d2Var.c() + this.f7977f;
            return;
        }
        y yVar = (y) d2Var;
        while (!yVar.f7978g.isEmpty()) {
            this.f7978g.add(yVar.f7978g.remove());
        }
        this.f7977f += yVar.f7977f;
        yVar.f7977f = 0;
        yVar.close();
    }

    public final void g() {
        if (this.f7978g.peek().c() == 0) {
            this.f7978g.remove().close();
        }
    }

    public final void l(c cVar, int i2) {
        if (this.f7977f >= i2) {
            if (!this.f7978g.isEmpty()) {
                g();
            }
            while (i2 > 0 && !this.f7978g.isEmpty()) {
                d2 peek = this.f7978g.peek();
                int min = Math.min(i2, peek.c());
                try {
                    cVar.a = cVar.a(peek, min);
                } catch (IOException e2) {
                    cVar.b = e2;
                }
                if (cVar.b != null) {
                    return;
                }
                i2 -= min;
                this.f7977f -= min;
                g();
            }
            if (i2 > 0) {
                throw new AssertionError("Failed executing read operation");
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // g.a.v0.d2
    /* renamed from: p */
    public y n(int i2) {
        if (c() >= i2) {
            this.f7977f -= i2;
            y yVar = new y();
            while (i2 > 0) {
                d2 peek = this.f7978g.peek();
                if (peek.c() > i2) {
                    yVar.f(peek.n(i2));
                    i2 = 0;
                } else {
                    yVar.f(this.f7978g.poll());
                    i2 -= peek.c();
                }
            }
            return yVar;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // g.a.v0.d2
    public int readUnsignedByte() {
        a aVar = new a(this);
        l(aVar, 1);
        return aVar.a;
    }
}
