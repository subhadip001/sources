package g.a.v0;

import g.a.i;
import io.grpc.Status;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: MessageFramer.java */
/* loaded from: classes2.dex */
public class w1 implements r0 {
    public final d a;
    public y2 c;

    /* renamed from: g  reason: collision with root package name */
    public final z2 f7959g;

    /* renamed from: h  reason: collision with root package name */
    public final r2 f7960h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7961i;

    /* renamed from: j  reason: collision with root package name */
    public int f7962j;

    /* renamed from: l  reason: collision with root package name */
    public long f7964l;
    public int b = -1;

    /* renamed from: d  reason: collision with root package name */
    public g.a.j f7956d = i.b.a;

    /* renamed from: e  reason: collision with root package name */
    public final c f7957e = new c(null);

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f7958f = new byte[5];

    /* renamed from: k  reason: collision with root package name */
    public int f7963k = -1;

    /* compiled from: MessageFramer.java */
    /* loaded from: classes2.dex */
    public interface d {
        void d(y2 y2Var, boolean z, boolean z2, int i2);
    }

    public w1(d dVar, z2 z2Var, r2 r2Var) {
        f.h.b.c.a.x(dVar, "sink");
        this.a = dVar;
        f.h.b.c.a.x(z2Var, "bufferAllocator");
        this.f7959g = z2Var;
        f.h.b.c.a.x(r2Var, "statsTraceCtx");
        this.f7960h = r2Var;
    }

    public static int g(InputStream inputStream, OutputStream outputStream) {
        if (inputStream instanceof g.a.q) {
            return ((g.a.q) inputStream).a(outputStream);
        }
        int i2 = f.h.c.c.a.a;
        Objects.requireNonNull(inputStream);
        Objects.requireNonNull(outputStream);
        byte[] bArr = new byte[8192];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                break;
            }
            outputStream.write(bArr, 0, read);
            j2 += read;
        }
        f.h.b.c.a.p(j2 <= 2147483647L, "Message size overflow: %s", j2);
        return (int) j2;
    }

    @Override // g.a.v0.r0
    public r0 a(g.a.j jVar) {
        f.h.b.c.a.x(jVar, "Can't pass an empty compressor");
        this.f7956d = jVar;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[LOOP:1: B:28:0x0077->B:29:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b A[LOOP:2: B:31:0x0089->B:32:0x008b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[LOOP:3: B:34:0x0098->B:35:0x009a, LOOP_END] */
    @Override // g.a.v0.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.io.InputStream r8) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.v0.w1.b(java.io.InputStream):void");
    }

    public final void c(boolean z, boolean z2) {
        y2 y2Var = this.c;
        this.c = null;
        this.a.d(y2Var, z, z2, this.f7962j);
        this.f7962j = 0;
    }

    @Override // g.a.v0.r0
    public void close() {
        y2 y2Var;
        if (this.f7961i) {
            return;
        }
        this.f7961i = true;
        y2 y2Var2 = this.c;
        if (y2Var2 != null && y2Var2.c() == 0 && (y2Var = this.c) != null) {
            y2Var.release();
            this.c = null;
        }
        c(true, true);
    }

    public final void d(b bVar, boolean z) {
        ByteBuffer wrap = ByteBuffer.wrap(this.f7958f);
        wrap.put(z ? (byte) 1 : (byte) 0);
        int i2 = 0;
        for (y2 y2Var : bVar.f7965f) {
            i2 += y2Var.c();
        }
        wrap.putInt(i2);
        y2 a2 = this.f7959g.a(5);
        a2.a(this.f7958f, 0, wrap.position());
        if (i2 == 0) {
            this.c = a2;
            return;
        }
        this.a.d(a2, false, false, this.f7962j - 1);
        this.f7962j = 1;
        List<y2> list = bVar.f7965f;
        for (int i3 = 0; i3 < list.size() - 1; i3++) {
            this.a.d(list.get(i3), false, false, 0);
        }
        this.c = list.get(list.size() - 1);
        this.f7964l = i2;
    }

    public final int e(InputStream inputStream) {
        b bVar = new b(null);
        OutputStream c2 = this.f7956d.c(bVar);
        try {
            int g2 = g(inputStream, c2);
            c2.close();
            int i2 = this.b;
            if (i2 >= 0 && g2 > i2) {
                throw Status.f8691l.h(String.format("message too large %d > %d", Integer.valueOf(g2), Integer.valueOf(this.b))).a();
            }
            d(bVar, true);
            return g2;
        } catch (Throwable th) {
            c2.close();
            throw th;
        }
    }

    public final void f(byte[] bArr, int i2, int i3) {
        while (i3 > 0) {
            y2 y2Var = this.c;
            if (y2Var != null && y2Var.b() == 0) {
                c(false, false);
            }
            if (this.c == null) {
                this.c = this.f7959g.a(i3);
            }
            int min = Math.min(i3, this.c.b());
            this.c.a(bArr, i2, min);
            i2 += min;
            i3 -= min;
        }
    }

    @Override // g.a.v0.r0
    public void flush() {
        y2 y2Var = this.c;
        if (y2Var == null || y2Var.c() <= 0) {
            return;
        }
        c(false, true);
    }

    @Override // g.a.v0.r0
    public void h(int i2) {
        f.h.b.c.a.C(this.b == -1, "max size already set");
        this.b = i2;
    }

    public final int i(InputStream inputStream, int i2) {
        if (i2 != -1) {
            this.f7964l = i2;
            int i3 = this.b;
            if (i3 >= 0 && i2 > i3) {
                throw Status.f8691l.h(String.format("message too large %d > %d", Integer.valueOf(i2), Integer.valueOf(this.b))).a();
            }
            ByteBuffer wrap = ByteBuffer.wrap(this.f7958f);
            wrap.put((byte) 0);
            wrap.putInt(i2);
            if (this.c == null) {
                this.c = this.f7959g.a(wrap.position() + i2);
            }
            f(this.f7958f, 0, wrap.position());
            return g(inputStream, this.f7957e);
        }
        b bVar = new b(null);
        int g2 = g(inputStream, bVar);
        int i4 = this.b;
        if (i4 >= 0 && g2 > i4) {
            throw Status.f8691l.h(String.format("message too large %d > %d", Integer.valueOf(g2), Integer.valueOf(this.b))).a();
        }
        d(bVar, false);
        return g2;
    }

    @Override // g.a.v0.r0
    public boolean isClosed() {
        return this.f7961i;
    }

    /* compiled from: MessageFramer.java */
    /* loaded from: classes2.dex */
    public class c extends OutputStream {
        public c(a aVar) {
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
            w1.this.f(new byte[]{(byte) i2}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            w1.this.f(bArr, i2, i3);
        }
    }

    /* compiled from: MessageFramer.java */
    /* loaded from: classes2.dex */
    public final class b extends OutputStream {

        /* renamed from: f  reason: collision with root package name */
        public final List<y2> f7965f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        public y2 f7966g;

        public b(a aVar) {
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
            y2 y2Var = this.f7966g;
            if (y2Var != null && y2Var.b() > 0) {
                this.f7966g.d((byte) i2);
            } else {
                write(new byte[]{(byte) i2}, 0, 1);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            if (this.f7966g == null) {
                y2 a = w1.this.f7959g.a(i3);
                this.f7966g = a;
                this.f7965f.add(a);
            }
            while (i3 > 0) {
                int min = Math.min(i3, this.f7966g.b());
                if (min == 0) {
                    y2 a2 = w1.this.f7959g.a(Math.max(i3, this.f7966g.c() * 2));
                    this.f7966g = a2;
                    this.f7965f.add(a2);
                } else {
                    this.f7966g.a(bArr, i2, min);
                    i2 += min;
                    i3 -= min;
                }
            }
        }
    }
}
