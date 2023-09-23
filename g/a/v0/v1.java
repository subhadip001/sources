package g.a.v0;

import g.a.i;
import g.a.v0.e2;
import g.a.v0.t2;
import io.grpc.Status;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.DataFormatException;

/* compiled from: MessageDeframer.java */
/* loaded from: classes2.dex */
public class v1 implements Closeable, c0 {

    /* renamed from: f  reason: collision with root package name */
    public b f7937f;

    /* renamed from: g  reason: collision with root package name */
    public int f7938g;

    /* renamed from: h  reason: collision with root package name */
    public final r2 f7939h;

    /* renamed from: i  reason: collision with root package name */
    public final x2 f7940i;

    /* renamed from: j  reason: collision with root package name */
    public g.a.o f7941j;

    /* renamed from: k  reason: collision with root package name */
    public t0 f7942k;

    /* renamed from: l  reason: collision with root package name */
    public byte[] f7943l;

    /* renamed from: m  reason: collision with root package name */
    public int f7944m;
    public boolean p;
    public y q;
    public long s;
    public int v;
    public e n = e.HEADER;
    public int o = 5;
    public y r = new y();
    public boolean t = false;
    public int u = -1;
    public boolean w = false;
    public volatile boolean x = false;

    /* compiled from: MessageDeframer.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(t2.a aVar);

        void b(boolean z);

        void c(int i2);

        void d(Throwable th);
    }

    /* compiled from: MessageDeframer.java */
    /* loaded from: classes2.dex */
    public static class c implements t2.a {

        /* renamed from: f  reason: collision with root package name */
        public InputStream f7945f;

        public c(InputStream inputStream, a aVar) {
            this.f7945f = inputStream;
        }

        @Override // g.a.v0.t2.a
        public InputStream next() {
            InputStream inputStream = this.f7945f;
            this.f7945f = null;
            return inputStream;
        }
    }

    /* compiled from: MessageDeframer.java */
    /* loaded from: classes2.dex */
    public enum e {
        HEADER,
        BODY
    }

    public v1(b bVar, g.a.o oVar, int i2, r2 r2Var, x2 x2Var) {
        f.h.b.c.a.x(bVar, "sink");
        this.f7937f = bVar;
        f.h.b.c.a.x(oVar, "decompressor");
        this.f7941j = oVar;
        this.f7938g = i2;
        f.h.b.c.a.x(r2Var, "statsTraceCtx");
        this.f7939h = r2Var;
        f.h.b.c.a.x(x2Var, "transportTracer");
        this.f7940i = x2Var;
    }

    public final void C() {
        InputStream aVar;
        for (g.a.s0 s0Var : this.f7939h.a) {
            Objects.requireNonNull(s0Var);
        }
        this.v = 0;
        if (this.p) {
            g.a.o oVar = this.f7941j;
            if (oVar != i.b.a) {
                try {
                    y yVar = this.q;
                    int i2 = e2.a;
                    aVar = new d(oVar.b(new e2.a(yVar)), this.f7938g, this.f7939h);
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } else {
                throw Status.f8692m.h("Can't decode compressed gRPC message as compression not configured").a();
            }
        } else {
            r2 r2Var = this.f7939h;
            int i3 = this.q.f7977f;
            for (g.a.s0 s0Var2 : r2Var.a) {
                Objects.requireNonNull(s0Var2);
            }
            y yVar2 = this.q;
            int i4 = e2.a;
            aVar = new e2.a(yVar2);
        }
        this.q = null;
        this.f7937f.a(new c(aVar, null));
        this.n = e.HEADER;
        this.o = 5;
    }

    public final void F() {
        int readUnsignedByte = this.q.readUnsignedByte();
        if ((readUnsignedByte & 254) == 0) {
            this.p = (readUnsignedByte & 1) != 0;
            y yVar = this.q;
            yVar.a(4);
            int readUnsignedByte2 = yVar.readUnsignedByte() | (yVar.readUnsignedByte() << 24) | (yVar.readUnsignedByte() << 16) | (yVar.readUnsignedByte() << 8);
            this.o = readUnsignedByte2;
            if (readUnsignedByte2 >= 0 && readUnsignedByte2 <= this.f7938g) {
                this.u++;
                for (g.a.s0 s0Var : this.f7939h.a) {
                    Objects.requireNonNull(s0Var);
                }
                x2 x2Var = this.f7940i;
                x2Var.f7976g.add(1L);
                x2Var.a.a();
                this.n = e.BODY;
                return;
            }
            throw Status.f8691l.h(String.format("gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f7938g), Integer.valueOf(this.o))).a();
        }
        throw Status.f8692m.h("gRPC frame header malformed: reserved bits not zero").a();
    }

    public final boolean M() {
        int i2;
        e eVar = e.BODY;
        int i3 = 0;
        try {
            if (this.q == null) {
                this.q = new y();
            }
            int i4 = 0;
            i2 = 0;
            while (true) {
                try {
                    int i5 = this.o - this.q.f7977f;
                    if (i5 <= 0) {
                        if (i4 > 0) {
                            this.f7937f.c(i4);
                            if (this.n == eVar) {
                                if (this.f7942k != null) {
                                    this.f7939h.a(i2);
                                    this.v += i2;
                                } else {
                                    this.f7939h.a(i4);
                                    this.v += i4;
                                }
                            }
                        }
                        return true;
                    } else if (this.f7942k != null) {
                        try {
                            byte[] bArr = this.f7943l;
                            if (bArr == null || this.f7944m == bArr.length) {
                                this.f7943l = new byte[Math.min(i5, 2097152)];
                                this.f7944m = 0;
                            }
                            int a2 = this.f7942k.a(this.f7943l, this.f7944m, Math.min(i5, this.f7943l.length - this.f7944m));
                            t0 t0Var = this.f7942k;
                            int i6 = t0Var.r;
                            t0Var.r = 0;
                            i4 += i6;
                            int i7 = t0Var.s;
                            t0Var.s = 0;
                            i2 += i7;
                            if (a2 == 0) {
                                if (i4 > 0) {
                                    this.f7937f.c(i4);
                                    if (this.n == eVar) {
                                        if (this.f7942k != null) {
                                            this.f7939h.a(i2);
                                            this.v += i2;
                                        } else {
                                            this.f7939h.a(i4);
                                            this.v += i4;
                                        }
                                    }
                                }
                                return false;
                            }
                            y yVar = this.q;
                            byte[] bArr2 = this.f7943l;
                            int i8 = this.f7944m;
                            int i9 = e2.a;
                            yVar.f(new e2.b(bArr2, i8, a2));
                            this.f7944m += a2;
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        } catch (DataFormatException e3) {
                            throw new RuntimeException(e3);
                        }
                    } else {
                        int i10 = this.r.f7977f;
                        if (i10 == 0) {
                            if (i4 > 0) {
                                this.f7937f.c(i4);
                                if (this.n == eVar) {
                                    if (this.f7942k != null) {
                                        this.f7939h.a(i2);
                                        this.v += i2;
                                    } else {
                                        this.f7939h.a(i4);
                                        this.v += i4;
                                    }
                                }
                            }
                            return false;
                        }
                        int min = Math.min(i5, i10);
                        i4 += min;
                        this.q.f(this.r.n(min));
                    }
                } catch (Throwable th) {
                    int i11 = i4;
                    th = th;
                    i3 = i11;
                    if (i3 > 0) {
                        this.f7937f.c(i3);
                        if (this.n == eVar) {
                            if (this.f7942k != null) {
                                this.f7939h.a(i2);
                                this.v += i2;
                            } else {
                                this.f7939h.a(i3);
                                this.v += i3;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            i2 = 0;
        }
    }

    public final void a() {
        if (this.t) {
            return;
        }
        this.t = true;
        while (true) {
            try {
                if (this.x || this.s <= 0 || !M()) {
                    break;
                }
                int ordinal = this.n.ordinal();
                if (ordinal == 0) {
                    F();
                } else if (ordinal == 1) {
                    C();
                    this.s--;
                } else {
                    throw new AssertionError("Invalid state: " + this.n);
                }
            } finally {
                this.t = false;
            }
        }
        if (this.x) {
            close();
            return;
        }
        if (this.w && v()) {
            close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    @Override // java.io.Closeable, java.lang.AutoCloseable, g.a.v0.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() {
        /*
            r6 = this;
            boolean r0 = r6.isClosed()
            if (r0 == 0) goto L7
            return
        L7:
            g.a.v0.y r0 = r6.q
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            int r0 = r0.f7977f
            if (r0 <= 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            r3 = 0
            g.a.v0.t0 r4 = r6.f7942k     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L3f
            if (r0 != 0) goto L39
            boolean r0 = r4.n     // Catch: java.lang.Throwable -> L59
            r0 = r0 ^ r1
            java.lang.String r5 = "GzipInflatingBuffer is closed"
            f.h.b.c.a.C(r0, r5)     // Catch: java.lang.Throwable -> L59
            g.a.v0.t0$b r0 = r4.f7913h     // Catch: java.lang.Throwable -> L59
            int r0 = g.a.v0.t0.b.c(r0)     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L34
            g.a.v0.t0$c r0 = r4.f7918m     // Catch: java.lang.Throwable -> L59
            g.a.v0.t0$c r4 = g.a.v0.t0.c.HEADER     // Catch: java.lang.Throwable -> L59
            if (r0 == r4) goto L32
            goto L34
        L32:
            r0 = 0
            goto L35
        L34:
            r0 = 1
        L35:
            if (r0 == 0) goto L38
            goto L39
        L38:
            r1 = 0
        L39:
            g.a.v0.t0 r0 = r6.f7942k     // Catch: java.lang.Throwable -> L59
            r0.close()     // Catch: java.lang.Throwable -> L59
            r0 = r1
        L3f:
            g.a.v0.y r1 = r6.r     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L46
            r1.close()     // Catch: java.lang.Throwable -> L59
        L46:
            g.a.v0.y r1 = r6.q     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.lang.Throwable -> L59
        L4d:
            r6.f7942k = r3
            r6.r = r3
            r6.q = r3
            g.a.v0.v1$b r1 = r6.f7937f
            r1.b(r0)
            return
        L59:
            r0 = move-exception
            r6.f7942k = r3
            r6.r = r3
            r6.q = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.v0.v1.close():void");
    }

    @Override // g.a.v0.c0
    public void f(int i2) {
        f.h.b.c.a.m(i2 > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.s += i2;
        a();
    }

    @Override // g.a.v0.c0
    public void g(int i2) {
        this.f7938g = i2;
    }

    public boolean isClosed() {
        return this.r == null && this.f7942k == null;
    }

    @Override // g.a.v0.c0
    public void l() {
        if (isClosed()) {
            return;
        }
        if (v()) {
            close();
        } else {
            this.w = true;
        }
    }

    @Override // g.a.v0.c0
    public void p(g.a.o oVar) {
        f.h.b.c.a.C(this.f7942k == null, "Already set full stream decompressor");
        f.h.b.c.a.x(oVar, "Can't pass an empty decompressor");
        this.f7941j = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:3:0x0007, B:5:0x000d, B:11:0x0017, B:13:0x001b, B:14:0x002b), top: B:30:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // g.a.v0.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(g.a.v0.d2 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "data"
            f.h.b.c.a.x(r6, r0)
            r0 = 0
            r1 = 1
            boolean r2 = r5.isClosed()     // Catch: java.lang.Throwable -> L38
            if (r2 != 0) goto L14
            boolean r2 = r5.w     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L12
            goto L14
        L12:
            r2 = 0
            goto L15
        L14:
            r2 = 1
        L15:
            if (r2 != 0) goto L3a
            g.a.v0.t0 r2 = r5.f7942k     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L2b
            boolean r3 = r2.n     // Catch: java.lang.Throwable -> L38
            r3 = r3 ^ r1
            java.lang.String r4 = "GzipInflatingBuffer is closed"
            f.h.b.c.a.C(r3, r4)     // Catch: java.lang.Throwable -> L38
            g.a.v0.y r3 = r2.f7911f     // Catch: java.lang.Throwable -> L38
            r3.f(r6)     // Catch: java.lang.Throwable -> L38
            r2.t = r0     // Catch: java.lang.Throwable -> L38
            goto L30
        L2b:
            g.a.v0.y r2 = r5.r     // Catch: java.lang.Throwable -> L38
            r2.f(r6)     // Catch: java.lang.Throwable -> L38
        L30:
            r5.a()     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r1 = move-exception
            r0 = r1
            r1 = 0
            goto L41
        L38:
            r0 = move-exception
            goto L41
        L3a:
            r0 = 1
        L3b:
            if (r0 == 0) goto L40
            r6.close()
        L40:
            return
        L41:
            if (r1 == 0) goto L46
            r6.close()
        L46:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.v0.v1.q(g.a.v0.d2):void");
    }

    public final boolean v() {
        t0 t0Var = this.f7942k;
        if (t0Var == null) {
            return this.r.f7977f == 0;
        }
        f.h.b.c.a.C(true ^ t0Var.n, "GzipInflatingBuffer is closed");
        return t0Var.t;
    }

    /* compiled from: MessageDeframer.java */
    /* loaded from: classes2.dex */
    public static final class d extends FilterInputStream {

        /* renamed from: f  reason: collision with root package name */
        public final int f7946f;

        /* renamed from: g  reason: collision with root package name */
        public final r2 f7947g;

        /* renamed from: h  reason: collision with root package name */
        public long f7948h;

        /* renamed from: i  reason: collision with root package name */
        public long f7949i;

        /* renamed from: j  reason: collision with root package name */
        public long f7950j;

        public d(InputStream inputStream, int i2, r2 r2Var) {
            super(inputStream);
            this.f7950j = -1L;
            this.f7946f = i2;
            this.f7947g = r2Var;
        }

        public final void a() {
            if (this.f7949i > this.f7948h) {
                for (g.a.s0 s0Var : this.f7947g.a) {
                    Objects.requireNonNull(s0Var);
                }
                this.f7948h = this.f7949i;
            }
        }

        public final void f() {
            long j2 = this.f7949i;
            int i2 = this.f7946f;
            if (j2 > i2) {
                throw Status.f8691l.h(String.format("Compressed gRPC message exceeds maximum size %d: %d bytes read", Integer.valueOf(i2), Long.valueOf(this.f7949i))).a();
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i2) {
            ((FilterInputStream) this).in.mark(i2);
            this.f7950j = this.f7949i;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f7949i++;
            }
            f();
            a();
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f7950j != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f7949i = this.f7950j;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j2) {
            long skip = ((FilterInputStream) this).in.skip(j2);
            this.f7949i += skip;
            f();
            a();
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            int read = ((FilterInputStream) this).in.read(bArr, i2, i3);
            if (read != -1) {
                this.f7949i += read;
            }
            f();
            a();
            return read;
        }
    }
}
