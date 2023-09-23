package k.c0.i;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.c0.i.b;
import k.c0.i.e;
import k.c0.i.n;
import l.y;
import l.z;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: Http2Reader.java */
/* loaded from: classes2.dex */
public final class m implements Closeable {

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f9042j = Logger.getLogger(c.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public final l.h f9043f;

    /* renamed from: g  reason: collision with root package name */
    public final a f9044g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9045h;

    /* renamed from: i  reason: collision with root package name */
    public final b.a f9046i;

    /* compiled from: Http2Reader.java */
    /* loaded from: classes2.dex */
    public static final class a implements y {

        /* renamed from: f  reason: collision with root package name */
        public final l.h f9047f;

        /* renamed from: g  reason: collision with root package name */
        public int f9048g;

        /* renamed from: h  reason: collision with root package name */
        public byte f9049h;

        /* renamed from: i  reason: collision with root package name */
        public int f9050i;

        /* renamed from: j  reason: collision with root package name */
        public int f9051j;

        /* renamed from: k  reason: collision with root package name */
        public short f9052k;

        public a(l.h hVar) {
            this.f9047f = hVar;
        }

        @Override // l.y
        public long a0(l.f fVar, long j2) {
            int i2;
            int readInt;
            do {
                int i3 = this.f9051j;
                if (i3 == 0) {
                    this.f9047f.e(this.f9052k);
                    this.f9052k = (short) 0;
                    if ((this.f9049h & 4) != 0) {
                        return -1L;
                    }
                    i2 = this.f9050i;
                    int q = m.q(this.f9047f);
                    this.f9051j = q;
                    this.f9048g = q;
                    byte readByte = (byte) (this.f9047f.readByte() & 255);
                    this.f9049h = (byte) (this.f9047f.readByte() & 255);
                    Logger logger = m.f9042j;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(c.a(true, this.f9050i, this.f9048g, readByte, this.f9049h));
                    }
                    readInt = this.f9047f.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    this.f9050i = readInt;
                    if (readByte != 9) {
                        c.c("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                        throw null;
                    }
                } else {
                    long a0 = this.f9047f.a0(fVar, Math.min(j2, i3));
                    if (a0 == -1) {
                        return -1L;
                    }
                    this.f9051j = (int) (this.f9051j - a0);
                    return a0;
                }
            } while (readInt == i2);
            c.c("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // l.y
        public z d() {
            return this.f9047f.d();
        }
    }

    /* compiled from: Http2Reader.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    public m(l.h hVar, boolean z) {
        this.f9043f = hVar;
        this.f9045h = z;
        a aVar = new a(hVar);
        this.f9044g = aVar;
        this.f9046i = new b.a(4096, aVar);
    }

    public static int a(int i2, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        c.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
        throw null;
    }

    public static int q(l.h hVar) {
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public final void C(b bVar, int i2, byte b2, int i3) {
        if (i3 != 0) {
            short readByte = (b2 & 8) != 0 ? (short) (this.f9043f.readByte() & 255) : (short) 0;
            int readInt = this.f9043f.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            List<k.c0.i.a> p = p(a(i2 - 4, b2, readByte), readByte, b2, i3);
            e eVar = e.this;
            synchronized (eVar) {
                if (eVar.y.contains(Integer.valueOf(readInt))) {
                    eVar.F(readInt, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                eVar.y.add(Integer.valueOf(readInt));
                try {
                    eVar.n.execute(new f(eVar, "OkHttp %s Push Request[%s]", new Object[]{eVar.f9002i, Integer.valueOf(readInt)}, readInt, p));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
        }
        c.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    public final void F(b bVar, int i2, int i3) {
        if (i2 != 4) {
            c.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i2));
            throw null;
        } else if (i3 != 0) {
            int readInt = this.f9043f.readInt();
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt);
            if (fromHttp2 == null) {
                c.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                throw null;
            }
            e.f fVar = (e.f) bVar;
            if (e.this.p(i3)) {
                e eVar = e.this;
                eVar.n.execute(new i(eVar, "OkHttp %s Push Reset[%s]", new Object[]{eVar.f9002i, Integer.valueOf(i3)}, i3, fromHttp2));
                return;
            }
            n q = e.this.q(i3);
            if (q != null) {
                synchronized (q) {
                    if (q.f9061l == null) {
                        q.f9061l = fromHttp2;
                        q.notifyAll();
                    }
                }
            }
        } else {
            c.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    public final void M(b bVar, int i2, byte b2, int i3) {
        long j2;
        int i4;
        n[] nVarArr = null;
        if (i3 != 0) {
            c.c("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((b2 & 1) != 0) {
            if (i2 == 0) {
                Objects.requireNonNull((e.f) bVar);
            } else {
                c.c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        } else if (i2 % 6 != 0) {
            c.c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i2));
            throw null;
        } else {
            r rVar = new r();
            for (int i5 = 0; i5 < i2; i5 += 6) {
                int readShort = this.f9043f.readShort() & 65535;
                int readInt = this.f9043f.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            c.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        c.c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        throw null;
                    }
                } else if (readInt != 0 && readInt != 1) {
                    c.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    throw null;
                }
                rVar.b(readShort, readInt);
            }
            e.f fVar = (e.f) bVar;
            synchronized (e.this) {
                int a2 = e.this.t.a();
                r rVar2 = e.this.t;
                Objects.requireNonNull(rVar2);
                for (int i6 = 0; i6 < 10; i6++) {
                    if (((1 << i6) & rVar.a) != 0) {
                        rVar2.b(i6, rVar.b[i6]);
                    }
                }
                try {
                    e eVar = e.this;
                    eVar.f9006m.execute(new l(fVar, "OkHttp %s ACK Settings", new Object[]{eVar.f9002i}, rVar));
                } catch (RejectedExecutionException unused) {
                }
                int a3 = e.this.t.a();
                if (a3 == -1 || a3 == a2) {
                    j2 = 0;
                } else {
                    j2 = a3 - a2;
                    e eVar2 = e.this;
                    if (!eVar2.u) {
                        eVar2.r += j2;
                        if (j2 > 0) {
                            eVar2.notifyAll();
                        }
                        e.this.u = true;
                    }
                    if (!e.this.f9001h.isEmpty()) {
                        nVarArr = (n[]) e.this.f9001h.values().toArray(new n[e.this.f9001h.size()]);
                    }
                }
                e.z.execute(new k(fVar, "OkHttp %s settings", e.this.f9002i));
            }
            if (nVarArr == null || j2 == 0) {
                return;
            }
            for (n nVar : nVarArr) {
                synchronized (nVar) {
                    nVar.b += j2;
                    if (i4 > 0) {
                        nVar.notifyAll();
                    }
                }
            }
        }
    }

    public final void N(b bVar, int i2, int i3) {
        if (i2 != 4) {
            c.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i2));
            throw null;
        }
        long readInt = this.f9043f.readInt() & 2147483647L;
        int i4 = (readInt > 0L ? 1 : (readInt == 0L ? 0 : -1));
        if (i4 == 0) {
            c.c("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        e.f fVar = (e.f) bVar;
        if (i3 == 0) {
            synchronized (e.this) {
                e eVar = e.this;
                eVar.r += readInt;
                eVar.notifyAll();
            }
            return;
        }
        n g2 = e.this.g(i3);
        if (g2 != null) {
            synchronized (g2) {
                g2.b += readInt;
                if (i4 > 0) {
                    g2.notifyAll();
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9043f.close();
    }

    public boolean f(boolean z, b bVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        try {
            this.f9043f.j0(9L);
            int q = q(this.f9043f);
            if (q < 0 || q > 16384) {
                c.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(q));
                throw null;
            }
            byte readByte = (byte) (this.f9043f.readByte() & 255);
            if (z && readByte != 4) {
                c.c("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
                throw null;
            }
            byte readByte2 = (byte) (this.f9043f.readByte() & 255);
            int readInt = this.f9043f.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            Logger logger = f9042j;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(c.a(true, readInt, q, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    if (readInt == 0) {
                        c.c("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                        throw null;
                    }
                    boolean z5 = (readByte2 & 1) != 0;
                    if (!((readByte2 & 32) != 0)) {
                        short readByte3 = (readByte2 & 8) != 0 ? (short) (this.f9043f.readByte() & 255) : (short) 0;
                        int a2 = a(q, readByte2, readByte3);
                        l.h hVar = this.f9043f;
                        e.f fVar = (e.f) bVar;
                        if (e.this.p(readInt)) {
                            e eVar = e.this;
                            Objects.requireNonNull(eVar);
                            l.f fVar2 = new l.f();
                            long j2 = a2;
                            hVar.j0(j2);
                            hVar.a0(fVar2, j2);
                            if (fVar2.f9230g == j2) {
                                eVar.n.execute(new h(eVar, "OkHttp %s Push Data[%s]", new Object[]{eVar.f9002i, Integer.valueOf(readInt)}, readInt, fVar2, a2, z5));
                            } else {
                                throw new IOException(fVar2.f9230g + " != " + a2);
                            }
                        } else {
                            n g2 = e.this.g(readInt);
                            if (g2 == null) {
                                e.this.F(readInt, ErrorCode.PROTOCOL_ERROR);
                                hVar.e(a2);
                            } else {
                                n.b bVar2 = g2.f9057h;
                                long j3 = a2;
                                Objects.requireNonNull(bVar2);
                                while (true) {
                                    if (j3 > 0) {
                                        synchronized (n.this) {
                                            z2 = bVar2.f9070j;
                                            z3 = bVar2.f9067g.f9230g + j3 > bVar2.f9068h;
                                        }
                                        if (z3) {
                                            hVar.e(j3);
                                            n nVar = n.this;
                                            ErrorCode errorCode = ErrorCode.FLOW_CONTROL_ERROR;
                                            if (nVar.d(errorCode)) {
                                                nVar.f9053d.F(nVar.c, errorCode);
                                            }
                                        } else if (z2) {
                                            hVar.e(j3);
                                        } else {
                                            long a0 = hVar.a0(bVar2.f9066f, j3);
                                            if (a0 != -1) {
                                                j3 -= a0;
                                                synchronized (n.this) {
                                                    l.f fVar3 = bVar2.f9067g;
                                                    boolean z6 = fVar3.f9230g == 0;
                                                    fVar3.i0(bVar2.f9066f);
                                                    if (z6) {
                                                        n.this.notifyAll();
                                                    }
                                                }
                                            } else {
                                                throw new EOFException();
                                            }
                                        }
                                    }
                                }
                                if (z5) {
                                    g2.h();
                                }
                            }
                        }
                        this.f9043f.e(readByte3);
                        break;
                    } else {
                        c.c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                case 1:
                    if (readInt != 0) {
                        boolean z7 = (readByte2 & 1) != 0;
                        short readByte4 = (readByte2 & 8) != 0 ? (short) (this.f9043f.readByte() & 255) : (short) 0;
                        if ((readByte2 & 32) != 0) {
                            this.f9043f.readInt();
                            this.f9043f.readByte();
                            Objects.requireNonNull((e.f) bVar);
                            q -= 5;
                        }
                        List<k.c0.i.a> p = p(a(q, readByte2, readByte4), readByte4, readByte2, readInt);
                        e.f fVar4 = (e.f) bVar;
                        if (e.this.p(readInt)) {
                            e eVar2 = e.this;
                            Objects.requireNonNull(eVar2);
                            try {
                                eVar2.n.execute(new g(eVar2, "OkHttp %s Push Headers[%s]", new Object[]{eVar2.f9002i, Integer.valueOf(readInt)}, readInt, p, z7));
                                break;
                            } catch (RejectedExecutionException unused) {
                                break;
                            }
                        } else {
                            synchronized (e.this) {
                                n g3 = e.this.g(readInt);
                                if (g3 == null) {
                                    e eVar3 = e.this;
                                    if (!eVar3.f9005l) {
                                        if (readInt > eVar3.f9003j) {
                                            if (readInt % 2 != eVar3.f9004k % 2) {
                                                n nVar2 = new n(readInt, eVar3, false, z7, p);
                                                e eVar4 = e.this;
                                                eVar4.f9003j = readInt;
                                                eVar4.f9001h.put(Integer.valueOf(readInt), nVar2);
                                                e.z.execute(new j(fVar4, "OkHttp %s stream %d", new Object[]{e.this.f9002i, Integer.valueOf(readInt)}, nVar2));
                                            }
                                        }
                                    }
                                } else {
                                    synchronized (g3) {
                                        g3.f9056g = true;
                                        if (g3.f9055f == null) {
                                            g3.f9055f = p;
                                            z4 = g3.g();
                                            g3.notifyAll();
                                        } else {
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.addAll(g3.f9055f);
                                            arrayList.add(null);
                                            arrayList.addAll(p);
                                            g3.f9055f = arrayList;
                                            z4 = true;
                                        }
                                    }
                                    if (!z4) {
                                        g3.f9053d.q(g3.c);
                                    }
                                    if (z7) {
                                        g3.h();
                                    }
                                }
                            }
                            break;
                        }
                    } else {
                        c.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        throw null;
                    }
                case 2:
                    if (q != 5) {
                        c.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(q));
                        throw null;
                    } else if (readInt != 0) {
                        this.f9043f.readInt();
                        this.f9043f.readByte();
                        Objects.requireNonNull((e.f) bVar);
                        break;
                    } else {
                        c.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                case 3:
                    F(bVar, q, readInt);
                    break;
                case 4:
                    M(bVar, q, readByte2, readInt);
                    break;
                case 5:
                    C(bVar, q, readByte2, readInt);
                    break;
                case 6:
                    v(bVar, q, readByte2, readInt);
                    break;
                case 7:
                    l(bVar, q, readInt);
                    break;
                case 8:
                    N(bVar, q, readInt);
                    break;
                default:
                    this.f9043f.e(q);
                    break;
            }
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public void g(b bVar) {
        if (this.f9045h) {
            if (f(true, bVar)) {
                return;
            }
            c.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        l.h hVar = this.f9043f;
        l.i iVar = c.a;
        l.i j2 = hVar.j(iVar.p());
        Logger logger = f9042j;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(k.c0.c.l("<< CONNECTION %s", j2.l()));
        }
        if (iVar.equals(j2)) {
            return;
        }
        c.c("Expected a connection header but was %s", j2.t());
        throw null;
    }

    public final void l(b bVar, int i2, int i3) {
        n[] nVarArr;
        if (i2 < 8) {
            c.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int readInt = this.f9043f.readInt();
            int readInt2 = this.f9043f.readInt();
            int i4 = i2 - 8;
            if (ErrorCode.fromHttp2(readInt2) == null) {
                c.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
                throw null;
            }
            l.i iVar = l.i.f9232j;
            if (i4 > 0) {
                iVar = this.f9043f.j(i4);
            }
            e.f fVar = (e.f) bVar;
            Objects.requireNonNull(fVar);
            iVar.p();
            synchronized (e.this) {
                nVarArr = (n[]) e.this.f9001h.values().toArray(new n[e.this.f9001h.size()]);
                e.this.f9005l = true;
            }
            for (n nVar : nVarArr) {
                if (nVar.c > readInt && nVar.f()) {
                    ErrorCode errorCode = ErrorCode.REFUSED_STREAM;
                    synchronized (nVar) {
                        if (nVar.f9061l == null) {
                            nVar.f9061l = errorCode;
                            nVar.notifyAll();
                        }
                    }
                    e.this.q(nVar.c);
                }
            }
        } else {
            c.c("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    public final List<k.c0.i.a> p(int i2, short s, byte b2, int i3) {
        a aVar = this.f9044g;
        aVar.f9051j = i2;
        aVar.f9048g = i2;
        aVar.f9052k = s;
        aVar.f9049h = b2;
        aVar.f9050i = i3;
        b.a aVar2 = this.f9046i;
        while (!aVar2.b.s()) {
            int readByte = aVar2.b.readByte() & 255;
            if (readByte == 128) {
                throw new IOException("index == 0");
            }
            if ((readByte & 128) == 128) {
                int g2 = aVar2.g(readByte, 127) - 1;
                if (g2 >= 0 && g2 <= k.c0.i.b.a.length + (-1)) {
                    aVar2.a.add(k.c0.i.b.a[g2]);
                } else {
                    int b3 = aVar2.b(g2 - k.c0.i.b.a.length);
                    if (b3 >= 0) {
                        k.c0.i.a[] aVarArr = aVar2.f8976e;
                        if (b3 < aVarArr.length) {
                            aVar2.a.add(aVarArr[b3]);
                        }
                    }
                    StringBuilder A = f.a.b.a.a.A("Header index too large ");
                    A.append(g2 + 1);
                    throw new IOException(A.toString());
                }
            } else if (readByte == 64) {
                l.i f2 = aVar2.f();
                k.c0.i.b.a(f2);
                aVar2.e(-1, new k.c0.i.a(f2, aVar2.f()));
            } else if ((readByte & 64) == 64) {
                aVar2.e(-1, new k.c0.i.a(aVar2.d(aVar2.g(readByte, 63) - 1), aVar2.f()));
            } else if ((readByte & 32) == 32) {
                int g3 = aVar2.g(readByte, 31);
                aVar2.f8975d = g3;
                if (g3 >= 0 && g3 <= aVar2.c) {
                    int i4 = aVar2.f8979h;
                    if (g3 < i4) {
                        if (g3 == 0) {
                            aVar2.a();
                        } else {
                            aVar2.c(i4 - g3);
                        }
                    }
                } else {
                    StringBuilder A2 = f.a.b.a.a.A("Invalid dynamic table size update ");
                    A2.append(aVar2.f8975d);
                    throw new IOException(A2.toString());
                }
            } else if (readByte != 16 && readByte != 0) {
                aVar2.a.add(new k.c0.i.a(aVar2.d(aVar2.g(readByte, 15) - 1), aVar2.f()));
            } else {
                l.i f3 = aVar2.f();
                k.c0.i.b.a(f3);
                aVar2.a.add(new k.c0.i.a(f3, aVar2.f()));
            }
        }
        b.a aVar3 = this.f9046i;
        Objects.requireNonNull(aVar3);
        ArrayList arrayList = new ArrayList(aVar3.a);
        aVar3.a.clear();
        return arrayList;
    }

    public final void v(b bVar, int i2, byte b2, int i3) {
        if (i2 != 8) {
            c.c("TYPE_PING length != 8: %s", Integer.valueOf(i2));
            throw null;
        } else if (i3 == 0) {
            int readInt = this.f9043f.readInt();
            int readInt2 = this.f9043f.readInt();
            boolean z = (b2 & 1) != 0;
            e.f fVar = (e.f) bVar;
            Objects.requireNonNull(fVar);
            if (z) {
                synchronized (e.this) {
                    e eVar = e.this;
                    eVar.p = false;
                    eVar.notifyAll();
                }
                return;
            }
            try {
                e eVar2 = e.this;
                eVar2.f9006m.execute(new e.C0233e(true, readInt, readInt2));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            c.c("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }
}
