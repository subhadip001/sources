package g.a.w0.p.i;

import com.google.android.gms.common.api.Api;
import g.a.i0;
import g.a.v0.w;
import g.a.v0.w0;
import g.a.v0.y0;
import g.a.w0.f;
import g.a.w0.g;
import g.a.w0.h;
import g.a.w0.p.i.a;
import g.a.w0.p.i.d;
import io.grpc.Status;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.GrpcUtil;
import io.grpc.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.i;
import l.y;
import l.z;

/* compiled from: Http2.java */
/* loaded from: classes2.dex */
public final class e implements h {
    public static final Logger a = Logger.getLogger(b.class.getName());
    public static final i b = i.j("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* compiled from: Http2.java */
    /* loaded from: classes2.dex */
    public static final class a implements y {

        /* renamed from: f  reason: collision with root package name */
        public final l.h f8094f;

        /* renamed from: g  reason: collision with root package name */
        public int f8095g;

        /* renamed from: h  reason: collision with root package name */
        public byte f8096h;

        /* renamed from: i  reason: collision with root package name */
        public int f8097i;

        /* renamed from: j  reason: collision with root package name */
        public int f8098j;

        /* renamed from: k  reason: collision with root package name */
        public short f8099k;

        public a(l.h hVar) {
            this.f8094f = hVar;
        }

        @Override // l.y
        public long a0(l.f fVar, long j2) {
            int i2;
            int readInt;
            do {
                int i3 = this.f8098j;
                if (i3 == 0) {
                    this.f8094f.e(this.f8099k);
                    this.f8099k = (short) 0;
                    if ((this.f8096h & 4) != 0) {
                        return -1L;
                    }
                    i2 = this.f8097i;
                    int b = e.b(this.f8094f);
                    this.f8098j = b;
                    this.f8095g = b;
                    byte readByte = (byte) (this.f8094f.readByte() & 255);
                    this.f8096h = (byte) (this.f8094f.readByte() & 255);
                    Logger logger = e.a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(b.a(true, this.f8097i, this.f8095g, readByte, this.f8096h));
                    }
                    readInt = this.f8094f.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    this.f8097i = readInt;
                    if (readByte != 9) {
                        e.a("%s != TYPE_CONTINUATION", new Object[]{Byte.valueOf(readByte)});
                        throw null;
                    }
                } else {
                    long a0 = this.f8094f.a0(fVar, Math.min(j2, i3));
                    if (a0 == -1) {
                        return -1L;
                    }
                    this.f8098j -= (int) a0;
                    return a0;
                }
            } while (readInt == i2);
            e.a("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // l.y
        public z d() {
            return this.f8094f.d();
        }
    }

    /* compiled from: Http2.java */
    /* loaded from: classes2.dex */
    public static final class b {
        public static final String[] a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        public static final String[] b = new String[64];
        public static final String[] c = new String[256];

        static {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr = c;
                if (i3 >= strArr.length) {
                    break;
                }
                strArr[i3] = String.format("%8s", Integer.toBinaryString(i3)).replace(' ', '0');
                i3++;
            }
            String[] strArr2 = b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i4 = 0; i4 < 1; i4++) {
                int i5 = iArr[i4];
                String[] strArr3 = b;
                strArr3[i5 | 8] = f.a.b.a.a.u(new StringBuilder(), strArr3[i5], "|PADDED");
            }
            String[] strArr4 = b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = iArr2[i6];
                for (int i8 = 0; i8 < 1; i8++) {
                    int i9 = iArr[i8];
                    String[] strArr5 = b;
                    int i10 = i9 | i7;
                    strArr5[i10] = strArr5[i9] + '|' + strArr5[i7];
                    StringBuilder sb = new StringBuilder();
                    sb.append(strArr5[i9]);
                    sb.append('|');
                    strArr5[i10 | 8] = f.a.b.a.a.u(sb, strArr5[i7], "|PADDED");
                }
            }
            while (true) {
                String[] strArr6 = b;
                if (i2 >= strArr6.length) {
                    return;
                }
                if (strArr6[i2] == null) {
                    strArr6[i2] = c[i2];
                }
                i2++;
            }
        }

        public static String a(boolean z, int i2, int i3, byte b2, byte b3) {
            String str;
            String[] strArr = a;
            String format = b2 < strArr.length ? strArr[b2] : String.format("0x%02x", Byte.valueOf(b2));
            if (b3 == 0) {
                str = "";
            } else {
                if (b2 != 2 && b2 != 3) {
                    if (b2 == 4 || b2 == 6) {
                        str = b3 == 1 ? "ACK" : c[b3];
                    } else if (b2 != 7 && b2 != 8) {
                        String[] strArr2 = b;
                        String str2 = b3 < strArr2.length ? strArr2[b3] : c[b3];
                        if (b2 == 5 && (b3 & 4) != 0) {
                            str = str2.replace("HEADERS", "PUSH_PROMISE");
                        } else {
                            str = (b2 != 0 || (b3 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                        }
                    }
                }
                str = c[b3];
            }
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i2);
            objArr[2] = Integer.valueOf(i3);
            objArr[3] = format;
            objArr[4] = str;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* compiled from: Http2.java */
    /* loaded from: classes2.dex */
    public static final class c implements g.a.w0.p.i.a {

        /* renamed from: f  reason: collision with root package name */
        public final l.h f8100f;

        /* renamed from: g  reason: collision with root package name */
        public final a f8101g;

        /* renamed from: h  reason: collision with root package name */
        public final d.a f8102h;

        public c(l.h hVar, int i2, boolean z) {
            this.f8100f = hVar;
            a aVar = new a(hVar);
            this.f8101g = aVar;
            this.f8102h = new d.a(i2, aVar);
        }

        public boolean a(a.InterfaceC0201a interfaceC0201a) {
            g.a.w0.g gVar;
            h.a aVar = h.a.INBOUND;
            boolean z = false;
            try {
                this.f8100f.j0(9L);
                int b = e.b(this.f8100f);
                Status status = null;
                if (b < 0 || b > 16384) {
                    e.a("FRAME_SIZE_ERROR: %s", new Object[]{Integer.valueOf(b)});
                    throw null;
                }
                byte readByte = (byte) (this.f8100f.readByte() & 255);
                byte readByte2 = (byte) (this.f8100f.readByte() & 255);
                int readInt = this.f8100f.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                Logger logger = e.a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(b.a(true, readInt, b, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        boolean z2 = (readByte2 & 1) != 0;
                        if (!((readByte2 & 32) != 0)) {
                            short readByte3 = (readByte2 & 8) != 0 ? (short) (this.f8100f.readByte() & 255) : (short) 0;
                            int c = e.c(b, readByte2, readByte3);
                            l.h hVar = this.f8100f;
                            g.e eVar = (g.e) interfaceC0201a;
                            eVar.f8042f.b(aVar, readInt, hVar.b(), c, z2);
                            g.a.w0.f p = g.a.w0.g.this.p(readInt);
                            if (p == null) {
                                if (g.a.w0.g.this.q(readInt)) {
                                    synchronized (g.a.w0.g.this.f8032j) {
                                        g.a.w0.g.this.f8030h.p0(readInt, ErrorCode.INVALID_STREAM);
                                    }
                                    hVar.e(c);
                                } else {
                                    g.a.w0.g.i(g.a.w0.g.this, ErrorCode.PROTOCOL_ERROR, "Received data for unknown stream: " + readInt);
                                    this.f8100f.e(readByte3);
                                    break;
                                }
                            } else {
                                long j2 = c;
                                hVar.j0(j2);
                                l.f fVar = new l.f();
                                fVar.J(hVar.b(), j2);
                                g.b.d dVar = p.f8025m.K;
                                Objects.requireNonNull(g.b.c.a);
                                synchronized (g.a.w0.g.this.f8032j) {
                                    p.f8025m.o(fVar, z2);
                                }
                            }
                            g.a.w0.g gVar2 = g.a.w0.g.this;
                            int i2 = gVar2.q + c;
                            gVar2.q = i2;
                            if (i2 >= gVar2.f8028f * 0.5f) {
                                synchronized (gVar2.f8032j) {
                                    g.a.w0.g.this.f8030h.B(0, gVar.q);
                                }
                                g.a.w0.g.this.q = 0;
                            }
                            this.f8100f.e(readByte3);
                        } else {
                            e.a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                            throw null;
                        }
                    case 1:
                        if (readInt != 0) {
                            boolean z3 = (readByte2 & 1) != 0;
                            short readByte4 = (readByte2 & 8) != 0 ? (short) (this.f8100f.readByte() & 255) : (short) 0;
                            if ((readByte2 & 32) != 0) {
                                this.f8100f.readInt();
                                this.f8100f.readByte();
                                g.e eVar2 = (g.e) interfaceC0201a;
                                b -= 5;
                            }
                            List<g.a.w0.p.i.c> f2 = f(e.c(b, readByte2, readByte4), readByte4, readByte2, readInt);
                            g.e eVar3 = (g.e) interfaceC0201a;
                            g.a.w0.h hVar2 = eVar3.f8042f;
                            if (hVar2.a()) {
                                hVar2.a.log(hVar2.b, aVar + " HEADERS: streamId=" + readInt + " headers=" + f2 + " endStream=" + z3);
                            }
                            if (g.a.w0.g.this.L != Integer.MAX_VALUE) {
                                long j3 = 0;
                                int i3 = 0;
                                while (true) {
                                    ArrayList arrayList = (ArrayList) f2;
                                    if (i3 < arrayList.size()) {
                                        g.a.w0.p.i.c cVar = (g.a.w0.p.i.c) arrayList.get(i3);
                                        j3 += cVar.b.p() + cVar.a.p() + 32;
                                        i3++;
                                    } else {
                                        int min = (int) Math.min(j3, 2147483647L);
                                        int i4 = g.a.w0.g.this.L;
                                        if (min > i4) {
                                            Status status2 = Status.f8691l;
                                            Object[] objArr = new Object[3];
                                            objArr[0] = z3 ? "trailer" : "header";
                                            objArr[1] = Integer.valueOf(i4);
                                            objArr[2] = Integer.valueOf(min);
                                            status = status2.h(String.format("Response %s metadata larger than %d: %d", objArr));
                                        }
                                    }
                                }
                            }
                            synchronized (g.a.w0.g.this.f8032j) {
                                g.a.w0.f fVar2 = g.a.w0.g.this.f8035m.get(Integer.valueOf(readInt));
                                if (fVar2 == null) {
                                    if (g.a.w0.g.this.q(readInt)) {
                                        g.a.w0.g.this.f8030h.p0(readInt, ErrorCode.INVALID_STREAM);
                                    } else {
                                        z = true;
                                    }
                                } else if (status == null) {
                                    g.b.d dVar2 = fVar2.f8025m.K;
                                    Objects.requireNonNull(g.b.c.a);
                                    fVar2.f8025m.p(f2, z3);
                                } else {
                                    if (!z3) {
                                        g.a.w0.g.this.f8030h.p0(readInt, ErrorCode.CANCEL);
                                    }
                                    f.b bVar = fVar2.f8025m;
                                    i0 i0Var = new i0();
                                    Objects.requireNonNull(bVar);
                                    bVar.i(status, ClientStreamListener.RpcProgress.PROCESSED, false, i0Var);
                                }
                            }
                            if (z) {
                                g.a.w0.g.i(g.a.w0.g.this, ErrorCode.PROTOCOL_ERROR, "Received header for unknown stream: " + readInt);
                                break;
                            }
                        } else {
                            e.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                            throw null;
                        }
                        break;
                    case 2:
                        if (b != 5) {
                            e.a("TYPE_PRIORITY length: %d != 5", new Object[]{Integer.valueOf(b)});
                            throw null;
                        } else if (readInt != 0) {
                            this.f8100f.readInt();
                            this.f8100f.readByte();
                            g.e eVar4 = (g.e) interfaceC0201a;
                            break;
                        } else {
                            e.a("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                    case 3:
                        p(interfaceC0201a, b, readInt);
                        break;
                    case 4:
                        q(interfaceC0201a, b, readByte2, readInt);
                        break;
                    case 5:
                        l(interfaceC0201a, b, readByte2, readInt);
                        break;
                    case 6:
                        g(interfaceC0201a, b, readByte2, readInt);
                        break;
                    case 7:
                        if (b < 8) {
                            e.a("TYPE_GOAWAY length < 8: %s", new Object[]{Integer.valueOf(b)});
                            throw null;
                        } else if (readInt == 0) {
                            int readInt2 = this.f8100f.readInt();
                            int readInt3 = this.f8100f.readInt();
                            int i5 = b - 8;
                            ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt3);
                            if (fromHttp2 == null) {
                                e.a("TYPE_GOAWAY unexpected error code: %d", new Object[]{Integer.valueOf(readInt3)});
                                throw null;
                            }
                            i iVar = i.f9232j;
                            if (i5 > 0) {
                                iVar = this.f8100f.j(i5);
                            }
                            g.e eVar5 = (g.e) interfaceC0201a;
                            eVar5.f8042f.c(aVar, readInt2, fromHttp2, iVar);
                            if (fromHttp2 == ErrorCode.ENHANCE_YOUR_CALM) {
                                String t = iVar.t();
                                g.a.w0.g.R.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", eVar5, t));
                                if ("too_many_pings".equals(t)) {
                                    g.a.w0.g.this.K.run();
                                }
                            }
                            Status b2 = GrpcUtil.Http2Error.statusForCode(fromHttp2.httpCode).b("Received Goaway");
                            if (iVar.p() > 0) {
                                b2 = b2.b(iVar.t());
                            }
                            g.a.w0.g gVar3 = g.a.w0.g.this;
                            Map<ErrorCode, Status> map = g.a.w0.g.Q;
                            gVar3.v(readInt2, null, b2);
                            break;
                        } else {
                            e.a("TYPE_GOAWAY streamId != 0", new Object[0]);
                            throw null;
                        }
                    case 8:
                        v(interfaceC0201a, b, readInt);
                        break;
                    default:
                        this.f8100f.e(b);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f8100f.close();
        }

        public final List<g.a.w0.p.i.c> f(int i2, short s, byte b, int i3) {
            a aVar = this.f8101g;
            aVar.f8098j = i2;
            aVar.f8095g = i2;
            aVar.f8099k = s;
            aVar.f8096h = b;
            aVar.f8097i = i3;
            d.a aVar2 = this.f8102h;
            while (!aVar2.b.s()) {
                int readByte = aVar2.b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    int g2 = aVar2.g(readByte, 127) - 1;
                    if (g2 >= 0 && g2 <= g.a.w0.p.i.d.b.length + (-1)) {
                        aVar2.a.add(g.a.w0.p.i.d.b[g2]);
                    } else {
                        int b2 = aVar2.b(g2 - g.a.w0.p.i.d.b.length);
                        if (b2 >= 0) {
                            g.a.w0.p.i.c[] cVarArr = aVar2.f8087e;
                            if (b2 <= cVarArr.length - 1) {
                                aVar2.a.add(cVarArr[b2]);
                            }
                        }
                        StringBuilder A = f.a.b.a.a.A("Header index too large ");
                        A.append(g2 + 1);
                        throw new IOException(A.toString());
                    }
                } else if (readByte == 64) {
                    i f2 = aVar2.f();
                    g.a.w0.p.i.d.a(f2);
                    aVar2.e(-1, new g.a.w0.p.i.c(f2, aVar2.f()));
                } else if ((readByte & 64) == 64) {
                    aVar2.e(-1, new g.a.w0.p.i.c(aVar2.d(aVar2.g(readByte, 63) - 1), aVar2.f()));
                } else if ((readByte & 32) == 32) {
                    int g3 = aVar2.g(readByte, 31);
                    aVar2.f8086d = g3;
                    if (g3 >= 0 && g3 <= aVar2.c) {
                        int i4 = aVar2.f8090h;
                        if (g3 < i4) {
                            if (g3 == 0) {
                                aVar2.a();
                            } else {
                                aVar2.c(i4 - g3);
                            }
                        }
                    } else {
                        StringBuilder A2 = f.a.b.a.a.A("Invalid dynamic table size update ");
                        A2.append(aVar2.f8086d);
                        throw new IOException(A2.toString());
                    }
                } else if (readByte != 16 && readByte != 0) {
                    aVar2.a.add(new g.a.w0.p.i.c(aVar2.d(aVar2.g(readByte, 15) - 1), aVar2.f()));
                } else {
                    i f3 = aVar2.f();
                    g.a.w0.p.i.d.a(f3);
                    aVar2.a.add(new g.a.w0.p.i.c(f3, aVar2.f()));
                }
            }
            d.a aVar3 = this.f8102h;
            Objects.requireNonNull(aVar3);
            ArrayList arrayList = new ArrayList(aVar3.a);
            aVar3.a.clear();
            return arrayList;
        }

        public final void g(a.InterfaceC0201a interfaceC0201a, int i2, byte b, int i3) {
            y0 y0Var;
            if (i2 != 8) {
                e.a("TYPE_PING length != 8: %s", new Object[]{Integer.valueOf(i2)});
                throw null;
            } else if (i3 == 0) {
                int readInt = this.f8100f.readInt();
                int readInt2 = this.f8100f.readInt();
                boolean z = (b & 1) != 0;
                g.e eVar = (g.e) interfaceC0201a;
                long j2 = (readInt << 32) | (readInt2 & 4294967295L);
                eVar.f8042f.d(h.a.INBOUND, j2);
                if (!z) {
                    synchronized (g.a.w0.g.this.f8032j) {
                        g.a.w0.g.this.f8030h.P(true, readInt, readInt2);
                    }
                    return;
                }
                synchronized (g.a.w0.g.this.f8032j) {
                    g.a.w0.g gVar = g.a.w0.g.this;
                    y0Var = gVar.v;
                    if (y0Var != null) {
                        long j3 = y0Var.a;
                        if (j3 == j2) {
                            gVar.v = null;
                        } else {
                            g.a.w0.g.R.log(Level.WARNING, String.format("Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(j3), Long.valueOf(j2)));
                        }
                    } else {
                        g.a.w0.g.R.warning("Received unexpected ping ack. No ping outstanding");
                    }
                    y0Var = null;
                }
                if (y0Var != null) {
                    synchronized (y0Var) {
                        if (!y0Var.f7982d) {
                            y0Var.f7982d = true;
                            long a = y0Var.b.a(TimeUnit.NANOSECONDS);
                            y0Var.f7984f = a;
                            Map<w.a, Executor> map = y0Var.c;
                            y0Var.c = null;
                            for (Map.Entry<w.a, Executor> entry : map.entrySet()) {
                                y0.a(entry.getValue(), new w0(entry.getKey(), a));
                            }
                        }
                    }
                }
            } else {
                e.a("TYPE_PING streamId != 0", new Object[0]);
                throw null;
            }
        }

        public final void l(a.InterfaceC0201a interfaceC0201a, int i2, byte b, int i3) {
            if (i3 != 0) {
                short readByte = (b & 8) != 0 ? (short) (this.f8100f.readByte() & 255) : (short) 0;
                int readInt = this.f8100f.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                List<g.a.w0.p.i.c> f2 = f(e.c(i2 - 4, b, readByte), readByte, b, i3);
                g.e eVar = (g.e) interfaceC0201a;
                g.a.w0.h hVar = eVar.f8042f;
                h.a aVar = h.a.INBOUND;
                if (hVar.a()) {
                    Logger logger = hVar.a;
                    Level level = hVar.b;
                    logger.log(level, aVar + " PUSH_PROMISE: streamId=" + i3 + " promisedStreamId=" + readInt + " headers=" + f2);
                }
                synchronized (g.a.w0.g.this.f8032j) {
                    g.a.w0.g.this.f8030h.p0(i3, ErrorCode.PROTOCOL_ERROR);
                }
                return;
            }
            e.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }

        public final void p(a.InterfaceC0201a interfaceC0201a, int i2, int i3) {
            if (i2 != 4) {
                e.a("TYPE_RST_STREAM length: %d != 4", new Object[]{Integer.valueOf(i2)});
                throw null;
            } else if (i3 != 0) {
                int readInt = this.f8100f.readInt();
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt);
                if (fromHttp2 == null) {
                    e.a("TYPE_RST_STREAM unexpected error code: %d", new Object[]{Integer.valueOf(readInt)});
                    throw null;
                }
                g.e eVar = (g.e) interfaceC0201a;
                eVar.f8042f.e(h.a.INBOUND, i3, fromHttp2);
                Status b = g.a.w0.g.z(fromHttp2).b("Rst Stream");
                Status.Code code = b.a;
                boolean z = code == Status.Code.CANCELLED || code == Status.Code.DEADLINE_EXCEEDED;
                synchronized (g.a.w0.g.this.f8032j) {
                    g.a.w0.f fVar = g.a.w0.g.this.f8035m.get(Integer.valueOf(i3));
                    if (fVar != null) {
                        g.b.d dVar = fVar.f8025m.K;
                        Objects.requireNonNull(g.b.c.a);
                        g.a.w0.g.this.k(i3, b, fromHttp2 == ErrorCode.REFUSED_STREAM ? ClientStreamListener.RpcProgress.REFUSED : ClientStreamListener.RpcProgress.PROCESSED, z, null, null);
                    }
                }
            } else {
                e.a("TYPE_RST_STREAM streamId == 0", new Object[0]);
                throw null;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
            g.a.w0.p.i.e.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new java.lang.Object[]{java.lang.Integer.valueOf(r6)});
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void q(g.a.w0.p.i.a.InterfaceC0201a r8, int r9, byte r10, int r11) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.w0.p.i.e.c.q(g.a.w0.p.i.a$a, int, byte, int):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void v(g.a.w0.p.i.a.InterfaceC0201a r8, int r9, int r10) {
            /*
                r7 = this;
                r0 = 1
                r1 = 0
                r2 = 0
                r3 = 4
                if (r9 != r3) goto L9c
                l.h r9 = r7.f8100f
                int r9 = r9.readInt()
                long r3 = (long) r9
                r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
                long r3 = r3 & r5
                r5 = 0
                int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r9 == 0) goto L94
                g.a.w0.g$e r8 = (g.a.w0.g.e) r8
                g.a.w0.h r5 = r8.f8042f
                g.a.w0.h$a r6 = g.a.w0.h.a.INBOUND
                r5.g(r6, r10, r3)
                if (r9 != 0) goto L41
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r10 != 0) goto L2e
                g.a.w0.g r8 = g.a.w0.g.this
                io.grpc.okhttp.internal.framed.ErrorCode r10 = io.grpc.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR
                g.a.w0.g.i(r8, r10, r9)
                goto L90
            L2e:
                g.a.w0.g r0 = g.a.w0.g.this
                io.grpc.Status r8 = io.grpc.Status.f8692m
                io.grpc.Status r2 = r8.h(r9)
                io.grpc.internal.ClientStreamListener$RpcProgress r3 = io.grpc.internal.ClientStreamListener.RpcProgress.PROCESSED
                r4 = 0
                io.grpc.okhttp.internal.framed.ErrorCode r5 = io.grpc.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR
                r6 = 0
                r1 = r10
                r0.k(r1, r2, r3, r4, r5, r6)
                goto L90
            L41:
                g.a.w0.g r9 = g.a.w0.g.this
                java.lang.Object r9 = r9.f8032j
                monitor-enter(r9)
                if (r10 != 0) goto L52
                g.a.w0.g r8 = g.a.w0.g.this     // Catch: java.lang.Throwable -> L91
                g.a.w0.n r8 = r8.f8031i     // Catch: java.lang.Throwable -> L91
                int r10 = (int) r3     // Catch: java.lang.Throwable -> L91
                r8.e(r1, r10)     // Catch: java.lang.Throwable -> L91
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L91
                goto L90
            L52:
                g.a.w0.g r1 = g.a.w0.g.this     // Catch: java.lang.Throwable -> L91
                java.util.Map<java.lang.Integer, g.a.w0.f> r1 = r1.f8035m     // Catch: java.lang.Throwable -> L91
                java.lang.Integer r5 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L91
                java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L91
                g.a.w0.f r1 = (g.a.w0.f) r1     // Catch: java.lang.Throwable -> L91
                if (r1 == 0) goto L6b
                g.a.w0.g r0 = g.a.w0.g.this     // Catch: java.lang.Throwable -> L91
                g.a.w0.n r0 = r0.f8031i     // Catch: java.lang.Throwable -> L91
                int r4 = (int) r3     // Catch: java.lang.Throwable -> L91
                r0.e(r1, r4)     // Catch: java.lang.Throwable -> L91
                goto L74
            L6b:
                g.a.w0.g r1 = g.a.w0.g.this     // Catch: java.lang.Throwable -> L91
                boolean r1 = r1.q(r10)     // Catch: java.lang.Throwable -> L91
                if (r1 != 0) goto L74
                goto L75
            L74:
                r0 = 0
            L75:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L91
                if (r0 == 0) goto L90
                g.a.w0.g r8 = g.a.w0.g.this
                io.grpc.okhttp.internal.framed.ErrorCode r9 = io.grpc.okhttp.internal.framed.ErrorCode.PROTOCOL_ERROR
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Received window_update for unknown stream: "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                g.a.w0.g.i(r8, r9, r10)
            L90:
                return
            L91:
                r8 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L91
                throw r8
            L94:
                java.lang.String r8 = "windowSizeIncrement was 0"
                java.lang.Object[] r9 = new java.lang.Object[r2]
                g.a.w0.p.i.e.a(r8, r9)
                throw r1
            L9c:
                java.lang.String r8 = "TYPE_WINDOW_UPDATE length !=4: %s"
                java.lang.Object[] r10 = new java.lang.Object[r0]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10[r2] = r9
                g.a.w0.p.i.e.a(r8, r10)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g.a.w0.p.i.e.c.v(g.a.w0.p.i.a$a, int, int):void");
        }
    }

    /* compiled from: Http2.java */
    /* loaded from: classes2.dex */
    public static final class d implements g.a.w0.p.i.b {

        /* renamed from: f  reason: collision with root package name */
        public final l.g f8103f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f8104g;

        /* renamed from: h  reason: collision with root package name */
        public final l.f f8105h;

        /* renamed from: i  reason: collision with root package name */
        public final d.b f8106i;

        /* renamed from: j  reason: collision with root package name */
        public int f8107j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f8108k;

        public d(l.g gVar, boolean z) {
            this.f8103f = gVar;
            this.f8104g = z;
            l.f fVar = new l.f();
            this.f8105h = fVar;
            this.f8106i = new d.b(fVar);
            this.f8107j = 16384;
        }

        @Override // g.a.w0.p.i.b
        public synchronized void B(int i2, long j2) {
            if (this.f8108k) {
                throw new IOException("closed");
            }
            if (j2 != 0 && j2 <= 2147483647L) {
                a(i2, 4, (byte) 8, (byte) 0);
                this.f8103f.m((int) j2);
                this.f8103f.flush();
            } else {
                e.d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j2)});
                throw null;
            }
        }

        @Override // g.a.w0.p.i.b
        public synchronized void H(g gVar) {
            if (!this.f8108k) {
                int i2 = this.f8107j;
                if ((gVar.a & 32) != 0) {
                    i2 = gVar.f8110d[5];
                }
                this.f8107j = i2;
                a(0, 0, (byte) 4, (byte) 1);
                this.f8103f.flush();
            } else {
                throw new IOException("closed");
            }
        }

        @Override // g.a.w0.p.i.b
        public synchronized void L(g gVar) {
            if (!this.f8108k) {
                int i2 = 0;
                a(0, Integer.bitCount(gVar.a) * 6, (byte) 4, (byte) 0);
                while (i2 < 10) {
                    if (gVar.a(i2)) {
                        this.f8103f.k(i2 == 4 ? 3 : i2 == 7 ? 4 : i2);
                        this.f8103f.m(gVar.f8110d[i2]);
                    }
                    i2++;
                }
                this.f8103f.flush();
            } else {
                throw new IOException("closed");
            }
        }

        @Override // g.a.w0.p.i.b
        public synchronized void P(boolean z, int i2, int i3) {
            if (!this.f8108k) {
                a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
                this.f8103f.m(i2);
                this.f8103f.m(i3);
                this.f8103f.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public void a(int i2, int i3, byte b, byte b2) {
            Logger logger = e.a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(b.a(false, i2, i3, b, b2));
            }
            int i4 = this.f8107j;
            if (i3 > i4) {
                e.d("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i4), Integer.valueOf(i3)});
                throw null;
            } else if ((Integer.MIN_VALUE & i2) != 0) {
                e.d("reserved bit set: %s", new Object[]{Integer.valueOf(i2)});
                throw null;
            } else {
                l.g gVar = this.f8103f;
                gVar.t((i3 >>> 16) & 255);
                gVar.t((i3 >>> 8) & 255);
                gVar.t(i3 & 255);
                this.f8103f.t(b & 255);
                this.f8103f.t(b2 & 255);
                this.f8103f.m(i2 & Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f8108k = true;
            this.f8103f.close();
        }

        public void f(boolean z, int i2, List<g.a.w0.p.i.c> list) {
            int i3;
            int i4;
            if (!this.f8108k) {
                d.b bVar = this.f8106i;
                Objects.requireNonNull(bVar);
                int size = list.size();
                int i5 = 0;
                while (true) {
                    int i6 = 1;
                    if (i5 >= size) {
                        break;
                    }
                    g.a.w0.p.i.c cVar = list.get(i5);
                    i r = cVar.a.r();
                    i iVar = cVar.b;
                    Integer num = g.a.w0.p.i.d.c.get(r);
                    if (num != null) {
                        i3 = num.intValue() + 1;
                        if (i3 >= 2 && i3 <= 7) {
                            g.a.w0.p.i.c[] cVarArr = g.a.w0.p.i.d.b;
                            if (cVarArr[i3 - 1].b.equals(iVar)) {
                                i4 = i3;
                            } else if (cVarArr[i3].b.equals(iVar)) {
                                i4 = i3;
                                i3++;
                            }
                        }
                        i4 = i3;
                        i3 = -1;
                    } else {
                        i3 = -1;
                        i4 = -1;
                    }
                    if (i3 == -1) {
                        int i7 = bVar.f8092e;
                        while (true) {
                            i7 += i6;
                            g.a.w0.p.i.c[] cVarArr2 = bVar.c;
                            if (i7 >= cVarArr2.length) {
                                break;
                            }
                            if (cVarArr2[i7].a.equals(r)) {
                                if (bVar.c[i7].b.equals(iVar)) {
                                    i3 = g.a.w0.p.i.d.b.length + (i7 - bVar.f8092e);
                                    break;
                                } else if (i4 == -1) {
                                    i4 = (i7 - bVar.f8092e) + g.a.w0.p.i.d.b.length;
                                }
                            }
                            i6 = 1;
                        }
                    }
                    if (i3 != -1) {
                        bVar.c(i3, 127, 128);
                    } else if (i4 == -1) {
                        bVar.a.m0(64);
                        bVar.b(r);
                        bVar.b(iVar);
                        bVar.a(cVar);
                    } else {
                        i iVar2 = g.a.w0.p.i.d.a;
                        Objects.requireNonNull(r);
                        if (r.n(0, iVar2, 0, iVar2.p()) && !g.a.w0.p.i.c.f8085h.equals(r)) {
                            bVar.c(i4, 15, 0);
                            bVar.b(iVar);
                        } else {
                            bVar.c(i4, 63, 64);
                            bVar.b(iVar);
                            bVar.a(cVar);
                        }
                    }
                    i5++;
                }
                long j2 = this.f8105h.f9230g;
                int min = (int) Math.min(this.f8107j, j2);
                long j3 = min;
                int i8 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                byte b = i8 == 0 ? (byte) 4 : (byte) 0;
                if (z) {
                    b = (byte) (b | 1);
                }
                a(i2, min, (byte) 1, b);
                this.f8103f.J(this.f8105h, j3);
                if (i8 > 0) {
                    long j4 = j2 - j3;
                    while (j4 > 0) {
                        int min2 = (int) Math.min(this.f8107j, j4);
                        long j5 = min2;
                        j4 -= j5;
                        a(i2, min2, (byte) 9, j4 == 0 ? (byte) 4 : (byte) 0);
                        this.f8103f.J(this.f8105h, j5);
                    }
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        @Override // g.a.w0.p.i.b
        public int f0() {
            return this.f8107j;
        }

        @Override // g.a.w0.p.i.b
        public synchronized void flush() {
            if (!this.f8108k) {
                this.f8103f.flush();
            } else {
                throw new IOException("closed");
            }
        }

        @Override // g.a.w0.p.i.b
        public synchronized void h0(boolean z, boolean z2, int i2, int i3, List<g.a.w0.p.i.c> list) {
            try {
                if (!z2) {
                    if (!this.f8108k) {
                        f(z, i2, list);
                    } else {
                        throw new IOException("closed");
                    }
                } else {
                    throw new UnsupportedOperationException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // g.a.w0.p.i.b
        public synchronized void o0(int i2, ErrorCode errorCode, byte[] bArr) {
            if (!this.f8108k) {
                if (errorCode.httpCode != -1) {
                    a(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f8103f.m(i2);
                    this.f8103f.m(errorCode.httpCode);
                    if (bArr.length > 0) {
                        this.f8103f.V(bArr);
                    }
                    this.f8103f.flush();
                } else {
                    e.d("errorCode.httpCode == -1", new Object[0]);
                    throw null;
                }
            } else {
                throw new IOException("closed");
            }
        }

        @Override // g.a.w0.p.i.b
        public synchronized void p0(int i2, ErrorCode errorCode) {
            if (!this.f8108k) {
                if (errorCode.httpCode != -1) {
                    a(i2, 4, (byte) 3, (byte) 0);
                    this.f8103f.m(errorCode.httpCode);
                    this.f8103f.flush();
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw new IOException("closed");
            }
        }

        @Override // g.a.w0.p.i.b
        public synchronized void u() {
            if (!this.f8108k) {
                if (this.f8104g) {
                    Logger logger = e.a;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(String.format(">> CONNECTION %s", e.b.l()));
                    }
                    this.f8103f.V(e.b.s());
                    this.f8103f.flush();
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        @Override // g.a.w0.p.i.b
        public synchronized void x(boolean z, int i2, l.f fVar, int i3) {
            if (!this.f8108k) {
                a(i2, i3, (byte) 0, z ? (byte) 1 : (byte) 0);
                if (i3 > 0) {
                    this.f8103f.J(fVar, i3);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public static IOException a(String str, Object[] objArr) {
        throw new IOException(String.format(str, objArr));
    }

    public static int b(l.h hVar) {
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static int c(int i2, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        throw new IOException(String.format("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2)));
    }

    public static IllegalArgumentException d(String str, Object[] objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public g.a.w0.p.i.a e(l.h hVar, boolean z) {
        return new c(hVar, 4096, z);
    }
}
