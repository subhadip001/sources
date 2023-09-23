package k.c0.f;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import k.b0;
import k.c0.f.e;
import k.h;
import k.m;
import k.n;
import k.r;
import k.t;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* compiled from: StreamAllocation.java */
/* loaded from: classes2.dex */
public final class f {
    public final k.a a;
    public e.a b;
    public b0 c;

    /* renamed from: d  reason: collision with root package name */
    public final h f8927d;

    /* renamed from: e  reason: collision with root package name */
    public final k.e f8928e;

    /* renamed from: f  reason: collision with root package name */
    public final n f8929f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f8930g;

    /* renamed from: h  reason: collision with root package name */
    public final e f8931h;

    /* renamed from: i  reason: collision with root package name */
    public int f8932i;

    /* renamed from: j  reason: collision with root package name */
    public c f8933j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8934k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8935l;

    /* renamed from: m  reason: collision with root package name */
    public k.c0.g.c f8936m;

    /* compiled from: StreamAllocation.java */
    /* loaded from: classes2.dex */
    public static final class a extends WeakReference<f> {
        public final Object a;

        public a(f fVar, Object obj) {
            super(fVar);
            this.a = obj;
        }
    }

    public f(h hVar, k.a aVar, k.e eVar, n nVar, Object obj) {
        this.f8927d = hVar;
        this.a = aVar;
        this.f8928e = eVar;
        this.f8929f = nVar;
        Objects.requireNonNull((t.a) k.c0.a.a);
        this.f8931h = new e(aVar, hVar.f9113e, eVar, nVar);
        this.f8930g = obj;
    }

    public void a(c cVar, boolean z) {
        if (this.f8933j == null) {
            this.f8933j = cVar;
            this.f8934k = z;
            cVar.n.add(new a(this, this.f8930g));
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized c b() {
        return this.f8933j;
    }

    public final Socket c(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f8936m = null;
        }
        boolean z4 = true;
        if (z2) {
            this.f8935l = true;
        }
        c cVar = this.f8933j;
        if (cVar != null) {
            if (z) {
                cVar.f8919k = true;
            }
            if (this.f8936m == null) {
                if (this.f8935l || cVar.f8919k) {
                    int size = cVar.n.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (cVar.n.get(i2).get() == this) {
                            cVar.n.remove(i2);
                            if (this.f8933j.n.isEmpty()) {
                                this.f8933j.o = System.nanoTime();
                                k.c0.a aVar = k.c0.a.a;
                                h hVar = this.f8927d;
                                c cVar2 = this.f8933j;
                                Objects.requireNonNull((t.a) aVar);
                                Objects.requireNonNull(hVar);
                                if (!cVar2.f8919k && hVar.a != 0) {
                                    hVar.notifyAll();
                                    z4 = false;
                                } else {
                                    hVar.f9112d.remove(cVar2);
                                }
                                if (z4) {
                                    socket = this.f8933j.f8913e;
                                    this.f8933j = null;
                                    return socket;
                                }
                            }
                            socket = null;
                            this.f8933j = null;
                            return socket;
                        }
                    }
                    throw new IllegalStateException();
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final c d(int i2, int i3, int i4, int i5, boolean z) {
        c cVar;
        b0 b0Var;
        Socket c;
        c cVar2;
        boolean z2;
        boolean z3;
        Socket socket;
        e.a aVar;
        String str;
        int i6;
        boolean contains;
        synchronized (this.f8927d) {
            if (!this.f8935l) {
                if (this.f8936m == null) {
                    cVar = this.f8933j;
                    b0Var = null;
                    c = (cVar == null || !cVar.f8919k) ? null : c(false, false, true);
                    c cVar3 = this.f8933j;
                    if (cVar3 != null) {
                        cVar = null;
                    } else {
                        cVar3 = null;
                    }
                    if (!this.f8934k) {
                        cVar = null;
                    }
                    if (cVar3 == null) {
                        k.c0.a.a.c(this.f8927d, this.a, this, null);
                        cVar2 = this.f8933j;
                        if (cVar2 != null) {
                            z2 = true;
                        } else {
                            b0Var = this.c;
                        }
                    }
                    cVar2 = cVar3;
                    z2 = false;
                } else {
                    throw new IllegalStateException("codec != null");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        k.c0.c.e(c);
        if (cVar != null) {
            Objects.requireNonNull(this.f8929f);
        }
        if (z2) {
            Objects.requireNonNull(this.f8929f);
        }
        if (cVar2 != null) {
            return cVar2;
        }
        if (b0Var != null || ((aVar = this.b) != null && aVar.a())) {
            z3 = false;
        } else {
            e eVar = this.f8931h;
            if (eVar.b()) {
                ArrayList arrayList = new ArrayList();
                while (eVar.c()) {
                    if (eVar.c()) {
                        List<Proxy> list = eVar.f8923e;
                        int i7 = eVar.f8924f;
                        eVar.f8924f = i7 + 1;
                        Proxy proxy = list.get(i7);
                        eVar.f8925g = new ArrayList();
                        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
                            SocketAddress address = proxy.address();
                            if (address instanceof InetSocketAddress) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                                InetAddress address2 = inetSocketAddress.getAddress();
                                if (address2 == null) {
                                    str = inetSocketAddress.getHostName();
                                } else {
                                    str = address2.getHostAddress();
                                }
                                i6 = inetSocketAddress.getPort();
                            } else {
                                StringBuilder A = f.a.b.a.a.A("Proxy.address() is not an InetSocketAddress: ");
                                A.append(address.getClass());
                                throw new IllegalArgumentException(A.toString());
                            }
                        } else {
                            r rVar = eVar.a.a;
                            str = rVar.f9134d;
                            i6 = rVar.f9135e;
                        }
                        if (i6 >= 1 && i6 <= 65535) {
                            if (proxy.type() == Proxy.Type.SOCKS) {
                                eVar.f8925g.add(InetSocketAddress.createUnresolved(str, i6));
                            } else {
                                Objects.requireNonNull(eVar.f8922d);
                                Objects.requireNonNull((m.a) eVar.a.b);
                                if (str != null) {
                                    try {
                                        List asList = Arrays.asList(InetAddress.getAllByName(str));
                                        if (!asList.isEmpty()) {
                                            Objects.requireNonNull(eVar.f8922d);
                                            int size = asList.size();
                                            for (int i8 = 0; i8 < size; i8++) {
                                                eVar.f8925g.add(new InetSocketAddress((InetAddress) asList.get(i8), i6));
                                            }
                                        } else {
                                            throw new UnknownHostException(eVar.a.b + " returned no addresses for " + str);
                                        }
                                    } catch (NullPointerException e2) {
                                        UnknownHostException unknownHostException = new UnknownHostException(f.a.b.a.a.p("Broken system behaviour for dns lookup of ", str));
                                        unknownHostException.initCause(e2);
                                        throw unknownHostException;
                                    }
                                } else {
                                    throw new UnknownHostException("hostname == null");
                                }
                            }
                            int size2 = eVar.f8925g.size();
                            for (int i9 = 0; i9 < size2; i9++) {
                                b0 b0Var2 = new b0(eVar.a, proxy, eVar.f8925g.get(i9));
                                d dVar = eVar.b;
                                synchronized (dVar) {
                                    contains = dVar.a.contains(b0Var2);
                                }
                                if (contains) {
                                    eVar.f8926h.add(b0Var2);
                                } else {
                                    arrayList.add(b0Var2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                break;
                            }
                        } else {
                            throw new SocketException("No route to " + str + ":" + i6 + "; port is out of range");
                        }
                    } else {
                        StringBuilder A2 = f.a.b.a.a.A("No route to ");
                        A2.append(eVar.a.a.f9134d);
                        A2.append("; exhausted proxy configurations: ");
                        A2.append(eVar.f8923e);
                        throw new SocketException(A2.toString());
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList.addAll(eVar.f8926h);
                    eVar.f8926h.clear();
                }
                this.b = new e.a(arrayList);
                z3 = true;
            } else {
                throw new NoSuchElementException();
            }
        }
        synchronized (this.f8927d) {
            if (z3) {
                try {
                    e.a aVar2 = this.b;
                    Objects.requireNonNull(aVar2);
                    ArrayList arrayList2 = new ArrayList(aVar2.a);
                    int size3 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size3) {
                            break;
                        }
                        b0 b0Var3 = (b0) arrayList2.get(i10);
                        k.c0.a.a.c(this.f8927d, this.a, this, b0Var3);
                        c cVar4 = this.f8933j;
                        if (cVar4 != null) {
                            this.c = b0Var3;
                            z2 = true;
                            cVar2 = cVar4;
                            break;
                        }
                        i10++;
                    }
                } finally {
                }
            }
            if (!z2) {
                if (b0Var == null) {
                    e.a aVar3 = this.b;
                    if (aVar3.a()) {
                        List<b0> list2 = aVar3.a;
                        int i11 = aVar3.b;
                        aVar3.b = i11 + 1;
                        b0Var = list2.get(i11);
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                this.c = b0Var;
                this.f8932i = 0;
                cVar2 = new c(this.f8927d, b0Var);
                a(cVar2, false);
            }
        }
        if (z2) {
            Objects.requireNonNull(this.f8929f);
            return cVar2;
        }
        cVar2.c(i2, i3, i4, i5, z, this.f8928e, this.f8929f);
        k.c0.a aVar4 = k.c0.a.a;
        h hVar = this.f8927d;
        Objects.requireNonNull((t.a) aVar4);
        hVar.f9113e.a(cVar2.c);
        synchronized (this.f8927d) {
            this.f8934k = true;
            k.c0.a aVar5 = k.c0.a.a;
            h hVar2 = this.f8927d;
            Objects.requireNonNull((t.a) aVar5);
            if (!hVar2.f9114f) {
                hVar2.f9114f = true;
                h.f9111g.execute(hVar2.c);
            }
            hVar2.f9112d.add(cVar2);
            if (cVar2.h()) {
                socket = k.c0.a.a.b(this.f8927d, this.a, this);
                cVar2 = this.f8933j;
            } else {
                socket = null;
            }
        }
        k.c0.c.e(socket);
        Objects.requireNonNull(this.f8929f);
        return cVar2;
    }

    public final c e(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        boolean z3;
        while (true) {
            c d2 = d(i2, i3, i4, i5, z);
            synchronized (this.f8927d) {
                if (d2.f8920l == 0) {
                    return d2;
                }
                boolean z4 = false;
                if (!d2.f8913e.isClosed() && !d2.f8913e.isInputShutdown() && !d2.f8913e.isOutputShutdown()) {
                    k.c0.i.e eVar = d2.f8916h;
                    if (eVar != null) {
                        synchronized (eVar) {
                            z3 = eVar.f9005l;
                        }
                        z4 = !z3;
                    } else {
                        if (z2) {
                            try {
                                int soTimeout = d2.f8913e.getSoTimeout();
                                d2.f8913e.setSoTimeout(1);
                                if (d2.f8917i.s()) {
                                    d2.f8913e.setSoTimeout(soTimeout);
                                } else {
                                    d2.f8913e.setSoTimeout(soTimeout);
                                }
                            } catch (SocketTimeoutException unused) {
                            } catch (IOException unused2) {
                            }
                        }
                        z4 = true;
                    }
                }
                if (z4) {
                    return d2;
                }
                f();
            }
        }
    }

    public void f() {
        c cVar;
        Socket c;
        synchronized (this.f8927d) {
            cVar = this.f8933j;
            c = c(true, false, false);
            if (this.f8933j != null) {
                cVar = null;
            }
        }
        k.c0.c.e(c);
        if (cVar != null) {
            Objects.requireNonNull(this.f8929f);
        }
    }

    public void g() {
        c cVar;
        Socket c;
        synchronized (this.f8927d) {
            cVar = this.f8933j;
            c = c(false, true, false);
            if (this.f8933j != null) {
                cVar = null;
            }
        }
        k.c0.c.e(c);
        if (cVar != null) {
            Objects.requireNonNull(this.f8929f);
        }
    }

    public void h(IOException iOException) {
        c cVar;
        boolean z;
        Socket c;
        synchronized (this.f8927d) {
            cVar = null;
            if (iOException instanceof StreamResetException) {
                ErrorCode errorCode = ((StreamResetException) iOException).f9333f;
                ErrorCode errorCode2 = ErrorCode.REFUSED_STREAM;
                if (errorCode == errorCode2) {
                    this.f8932i++;
                }
                if (errorCode != errorCode2 || this.f8932i > 1) {
                    this.c = null;
                    z = true;
                }
                z = false;
            } else {
                c cVar2 = this.f8933j;
                if (cVar2 != null && (!cVar2.h() || (iOException instanceof ConnectionShutdownException))) {
                    if (this.f8933j.f8920l == 0) {
                        b0 b0Var = this.c;
                        if (b0Var != null && iOException != null) {
                            this.f8931h.a(b0Var, iOException);
                        }
                        this.c = null;
                    }
                    z = true;
                }
                z = false;
            }
            c cVar3 = this.f8933j;
            c = c(z, false, true);
            if (this.f8933j == null && this.f8934k) {
                cVar = cVar3;
            }
        }
        k.c0.c.e(c);
        if (cVar != null) {
            Objects.requireNonNull(this.f8929f);
        }
    }

    public void i(boolean z, k.c0.g.c cVar, long j2, IOException iOException) {
        c cVar2;
        Socket c;
        boolean z2;
        Objects.requireNonNull(this.f8929f);
        synchronized (this.f8927d) {
            if (cVar != null) {
                if (cVar == this.f8936m) {
                    if (!z) {
                        this.f8933j.f8920l++;
                    }
                    cVar2 = this.f8933j;
                    c = c(z, false, true);
                    if (this.f8933j != null) {
                        cVar2 = null;
                    }
                    z2 = this.f8935l;
                }
            }
            throw new IllegalStateException("expected " + this.f8936m + " but was " + cVar);
        }
        k.c0.c.e(c);
        if (cVar2 != null) {
            Objects.requireNonNull(this.f8929f);
        }
        if (iOException != null) {
            Objects.requireNonNull(this.f8929f);
        } else if (z2) {
            Objects.requireNonNull(this.f8929f);
        }
    }

    public String toString() {
        c b = b();
        return b != null ? b.toString() : this.a.toString();
    }
}
