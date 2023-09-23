package k.c0.e;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import k.c0.j.a;
import l.o;
import l.p;
import l.r;
import l.t;
import l.x;
import l.y;

/* compiled from: DiskLruCache.java */
/* loaded from: classes2.dex */
public final class e implements Closeable, Flushable {
    public static final Pattern z = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: f  reason: collision with root package name */
    public final k.c0.j.a f8889f;

    /* renamed from: g  reason: collision with root package name */
    public final File f8890g;

    /* renamed from: h  reason: collision with root package name */
    public final File f8891h;

    /* renamed from: i  reason: collision with root package name */
    public final File f8892i;

    /* renamed from: j  reason: collision with root package name */
    public final File f8893j;

    /* renamed from: k  reason: collision with root package name */
    public final int f8894k;

    /* renamed from: l  reason: collision with root package name */
    public long f8895l;

    /* renamed from: m  reason: collision with root package name */
    public final int f8896m;
    public l.g o;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public final Executor x;
    public long n = 0;
    public final LinkedHashMap<String, d> p = new LinkedHashMap<>(0, 0.75f, true);
    public long w = 0;
    public final Runnable y = new a();

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (e.this) {
                e eVar = e.this;
                if ((!eVar.s) || eVar.t) {
                    return;
                }
                try {
                    eVar.T();
                } catch (IOException unused) {
                    e.this.u = true;
                }
                try {
                    if (e.this.q()) {
                        e.this.N();
                        e.this.q = 0;
                    }
                } catch (IOException unused2) {
                    e eVar2 = e.this;
                    eVar2.v = true;
                    Logger logger = o.a;
                    eVar2.o = new r(new p());
                }
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes2.dex */
    public class b extends f {
        public b(x xVar) {
            super(xVar);
        }

        @Override // k.c0.e.f
        public void a(IOException iOException) {
            e.this.r = true;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes2.dex */
    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        /* compiled from: DiskLruCache.java */
        /* loaded from: classes2.dex */
        public class a extends f {
            public a(x xVar) {
                super(xVar);
            }

            @Override // k.c0.e.f
            public void a(IOException iOException) {
                synchronized (e.this) {
                    c.this.c();
                }
            }
        }

        public c(d dVar) {
            this.a = dVar;
            this.b = dVar.f8902e ? null : new boolean[e.this.f8896m];
        }

        public void a() {
            synchronized (e.this) {
                if (!this.c) {
                    if (this.a.f8903f == this) {
                        e.this.f(this, false);
                    }
                    this.c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void b() {
            synchronized (e.this) {
                if (!this.c) {
                    if (this.a.f8903f == this) {
                        e.this.f(this, true);
                    }
                    this.c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void c() {
            if (this.a.f8903f != this) {
                return;
            }
            int i2 = 0;
            while (true) {
                e eVar = e.this;
                if (i2 < eVar.f8896m) {
                    try {
                        ((a.C0234a) eVar.f8889f).a(this.a.f8901d[i2]);
                    } catch (IOException unused) {
                    }
                    i2++;
                } else {
                    this.a.f8903f = null;
                    return;
                }
            }
        }

        public x d(int i2) {
            File file;
            x c;
            synchronized (e.this) {
                if (!this.c) {
                    d dVar = this.a;
                    if (dVar.f8903f != this) {
                        Logger logger = o.a;
                        return new p();
                    }
                    if (!dVar.f8902e) {
                        this.b[i2] = true;
                    }
                    File file2 = dVar.f8901d[i2];
                    try {
                        Objects.requireNonNull((a.C0234a) e.this.f8889f);
                        try {
                            c = o.c(file2);
                        } catch (FileNotFoundException unused) {
                            file.getParentFile().mkdirs();
                            c = o.c(file);
                        }
                        return new a(c);
                    } catch (FileNotFoundException unused2) {
                        Logger logger2 = o.a;
                        return new p();
                    }
                }
                throw new IllegalStateException();
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes2.dex */
    public final class d {
        public final String a;
        public final long[] b;
        public final File[] c;

        /* renamed from: d  reason: collision with root package name */
        public final File[] f8901d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f8902e;

        /* renamed from: f  reason: collision with root package name */
        public c f8903f;

        /* renamed from: g  reason: collision with root package name */
        public long f8904g;

        public d(String str) {
            this.a = str;
            int i2 = e.this.f8896m;
            this.b = new long[i2];
            this.c = new File[i2];
            this.f8901d = new File[i2];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i3 = 0; i3 < e.this.f8896m; i3++) {
                sb.append(i3);
                this.c[i3] = new File(e.this.f8890g, sb.toString());
                sb.append(".tmp");
                this.f8901d[i3] = new File(e.this.f8890g, sb.toString());
                sb.setLength(length);
            }
        }

        public final IOException a(String[] strArr) {
            StringBuilder A = f.a.b.a.a.A("unexpected journal line: ");
            A.append(Arrays.toString(strArr));
            throw new IOException(A.toString());
        }

        public C0230e b() {
            if (Thread.holdsLock(e.this)) {
                y[] yVarArr = new y[e.this.f8896m];
                long[] jArr = (long[]) this.b.clone();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    try {
                        e eVar = e.this;
                        if (i3 < eVar.f8896m) {
                            yVarArr[i3] = ((a.C0234a) eVar.f8889f).d(this.c[i3]);
                            i3++;
                        } else {
                            return new C0230e(this.a, this.f8904g, yVarArr, jArr);
                        }
                    } catch (FileNotFoundException unused) {
                        while (true) {
                            e eVar2 = e.this;
                            if (i2 < eVar2.f8896m && yVarArr[i2] != null) {
                                k.c0.c.d(yVarArr[i2]);
                                i2++;
                            } else {
                                try {
                                    eVar2.O(this);
                                    return null;
                                } catch (IOException unused2) {
                                    return null;
                                }
                            }
                        }
                    }
                }
            } else {
                throw new AssertionError();
            }
        }

        public void c(l.g gVar) {
            for (long j2 : this.b) {
                gVar.t(32).k0(j2);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: k.c0.e.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0230e implements Closeable {

        /* renamed from: f  reason: collision with root package name */
        public final String f8906f;

        /* renamed from: g  reason: collision with root package name */
        public final long f8907g;

        /* renamed from: h  reason: collision with root package name */
        public final y[] f8908h;

        public C0230e(String str, long j2, y[] yVarArr, long[] jArr) {
            this.f8906f = str;
            this.f8907g = j2;
            this.f8908h = yVarArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (y yVar : this.f8908h) {
                k.c0.c.d(yVar);
            }
        }
    }

    public e(k.c0.j.a aVar, File file, int i2, int i3, long j2, Executor executor) {
        this.f8889f = aVar;
        this.f8890g = file;
        this.f8894k = i2;
        this.f8891h = new File(file, "journal");
        this.f8892i = new File(file, "journal.tmp");
        this.f8893j = new File(file, "journal.bkp");
        this.f8896m = i3;
        this.f8895l = j2;
        this.x = executor;
    }

    public final void C() {
        ((a.C0234a) this.f8889f).a(this.f8892i);
        Iterator<d> it = this.p.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i2 = 0;
            if (next.f8903f == null) {
                while (i2 < this.f8896m) {
                    this.n += next.b[i2];
                    i2++;
                }
            } else {
                next.f8903f = null;
                while (i2 < this.f8896m) {
                    ((a.C0234a) this.f8889f).a(next.c[i2]);
                    ((a.C0234a) this.f8889f).a(next.f8901d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void F() {
        t tVar = new t(((a.C0234a) this.f8889f).d(this.f8891h));
        try {
            String Q = tVar.Q();
            String Q2 = tVar.Q();
            String Q3 = tVar.Q();
            String Q4 = tVar.Q();
            String Q5 = tVar.Q();
            if (!"libcore.io.DiskLruCache".equals(Q) || !"1".equals(Q2) || !Integer.toString(this.f8894k).equals(Q3) || !Integer.toString(this.f8896m).equals(Q4) || !"".equals(Q5)) {
                throw new IOException("unexpected journal header: [" + Q + ", " + Q2 + ", " + Q4 + ", " + Q5 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    M(tVar.Q());
                    i2++;
                } catch (EOFException unused) {
                    this.q = i2 - this.p.size();
                    if (!tVar.s()) {
                        N();
                    } else {
                        this.o = v();
                    }
                    k.c0.c.d(tVar);
                    return;
                }
            }
        } catch (Throwable th) {
            k.c0.c.d(tVar);
            throw th;
        }
    }

    public final void M(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                substring = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.p.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i2, indexOf2);
            }
            d dVar = this.p.get(substring);
            if (dVar == null) {
                dVar = new d(substring);
                this.p.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f8902e = true;
                dVar.f8903f = null;
                if (split.length == e.this.f8896m) {
                    for (int i3 = 0; i3 < split.length; i3++) {
                        try {
                            dVar.b[i3] = Long.parseLong(split[i3]);
                        } catch (NumberFormatException unused) {
                            dVar.a(split);
                            throw null;
                        }
                    }
                    return;
                }
                dVar.a(split);
                throw null;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f8903f = new c(dVar);
                return;
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(f.a.b.a.a.p("unexpected journal line: ", str));
            } else {
                return;
            }
        }
        throw new IOException(f.a.b.a.a.p("unexpected journal line: ", str));
    }

    public synchronized void N() {
        x c2;
        l.g gVar = this.o;
        if (gVar != null) {
            gVar.close();
        }
        k.c0.j.a aVar = this.f8889f;
        File file = this.f8892i;
        Objects.requireNonNull((a.C0234a) aVar);
        try {
            c2 = o.c(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            c2 = o.c(file);
        }
        Logger logger = o.a;
        r rVar = new r(c2);
        rVar.D("libcore.io.DiskLruCache");
        rVar.t(10);
        rVar.D("1");
        rVar.t(10);
        rVar.k0(this.f8894k);
        rVar.t(10);
        rVar.k0(this.f8896m);
        rVar.t(10);
        rVar.t(10);
        for (d dVar : this.p.values()) {
            if (dVar.f8903f != null) {
                rVar.D("DIRTY");
                rVar.t(32);
                rVar.D(dVar.a);
                rVar.t(10);
            } else {
                rVar.D("CLEAN");
                rVar.t(32);
                rVar.D(dVar.a);
                dVar.c(rVar);
                rVar.t(10);
            }
        }
        rVar.close();
        k.c0.j.a aVar2 = this.f8889f;
        File file2 = this.f8891h;
        Objects.requireNonNull((a.C0234a) aVar2);
        if (file2.exists()) {
            ((a.C0234a) this.f8889f).c(this.f8891h, this.f8893j);
        }
        ((a.C0234a) this.f8889f).c(this.f8892i, this.f8891h);
        ((a.C0234a) this.f8889f).a(this.f8893j);
        this.o = v();
        this.r = false;
        this.v = false;
    }

    public boolean O(d dVar) {
        c cVar = dVar.f8903f;
        if (cVar != null) {
            cVar.c();
        }
        for (int i2 = 0; i2 < this.f8896m; i2++) {
            ((a.C0234a) this.f8889f).a(dVar.c[i2]);
            long j2 = this.n;
            long[] jArr = dVar.b;
            this.n = j2 - jArr[i2];
            jArr[i2] = 0;
        }
        this.q++;
        this.o.D("REMOVE").t(32).D(dVar.a).t(10);
        this.p.remove(dVar.a);
        if (q()) {
            this.x.execute(this.y);
        }
        return true;
    }

    public void T() {
        while (this.n > this.f8895l) {
            O(this.p.values().iterator().next());
        }
        this.u = false;
    }

    public final void W(String str) {
        if (!z.matcher(str).matches()) {
            throw new IllegalArgumentException(f.a.b.a.a.q("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final synchronized void a() {
        try {
            synchronized (this) {
            }
        } catch (Throwable th) {
            throw th;
        }
        if (this.t) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.s && !this.t) {
            for (d dVar : (d[]) this.p.values().toArray(new d[this.p.size()])) {
                c cVar = dVar.f8903f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            T();
            this.o.close();
            this.o = null;
            this.t = true;
            return;
        }
        this.t = true;
    }

    public synchronized void f(c cVar, boolean z2) {
        d dVar = cVar.a;
        if (dVar.f8903f == cVar) {
            if (z2 && !dVar.f8902e) {
                for (int i2 = 0; i2 < this.f8896m; i2++) {
                    if (cVar.b[i2]) {
                        k.c0.j.a aVar = this.f8889f;
                        File file = dVar.f8901d[i2];
                        Objects.requireNonNull((a.C0234a) aVar);
                        if (!file.exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                }
            }
            for (int i3 = 0; i3 < this.f8896m; i3++) {
                File file2 = dVar.f8901d[i3];
                if (z2) {
                    Objects.requireNonNull((a.C0234a) this.f8889f);
                    if (file2.exists()) {
                        File file3 = dVar.c[i3];
                        ((a.C0234a) this.f8889f).c(file2, file3);
                        long j2 = dVar.b[i3];
                        Objects.requireNonNull((a.C0234a) this.f8889f);
                        long length = file3.length();
                        dVar.b[i3] = length;
                        this.n = (this.n - j2) + length;
                    }
                } else {
                    ((a.C0234a) this.f8889f).a(file2);
                }
            }
            this.q++;
            dVar.f8903f = null;
            if (dVar.f8902e | z2) {
                dVar.f8902e = true;
                this.o.D("CLEAN").t(32);
                this.o.D(dVar.a);
                dVar.c(this.o);
                this.o.t(10);
                if (z2) {
                    long j3 = this.w;
                    this.w = 1 + j3;
                    dVar.f8904g = j3;
                }
            } else {
                this.p.remove(dVar.a);
                this.o.D("REMOVE").t(32);
                this.o.D(dVar.a);
                this.o.t(10);
            }
            this.o.flush();
            if (this.n > this.f8895l || q()) {
                this.x.execute(this.y);
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.s) {
            a();
            T();
            this.o.flush();
        }
    }

    public synchronized c g(String str, long j2) {
        p();
        a();
        W(str);
        d dVar = this.p.get(str);
        if (j2 == -1 || (dVar != null && dVar.f8904g == j2)) {
            if (dVar == null || dVar.f8903f == null) {
                if (!this.u && !this.v) {
                    this.o.D("DIRTY").t(32).D(str).t(10);
                    this.o.flush();
                    if (this.r) {
                        return null;
                    }
                    if (dVar == null) {
                        dVar = new d(str);
                        this.p.put(str, dVar);
                    }
                    c cVar = new c(dVar);
                    dVar.f8903f = cVar;
                    return cVar;
                }
                this.x.execute(this.y);
                return null;
            }
            return null;
        }
        return null;
    }

    public synchronized C0230e l(String str) {
        p();
        a();
        W(str);
        d dVar = this.p.get(str);
        if (dVar != null && dVar.f8902e) {
            C0230e b2 = dVar.b();
            if (b2 == null) {
                return null;
            }
            this.q++;
            this.o.D("READ").t(32).D(str).t(10);
            if (q()) {
                this.x.execute(this.y);
            }
            return b2;
        }
        return null;
    }

    public synchronized void p() {
        if (this.s) {
            return;
        }
        k.c0.j.a aVar = this.f8889f;
        File file = this.f8893j;
        Objects.requireNonNull((a.C0234a) aVar);
        if (file.exists()) {
            k.c0.j.a aVar2 = this.f8889f;
            File file2 = this.f8891h;
            Objects.requireNonNull((a.C0234a) aVar2);
            if (file2.exists()) {
                ((a.C0234a) this.f8889f).a(this.f8893j);
            } else {
                ((a.C0234a) this.f8889f).c(this.f8893j, this.f8891h);
            }
        }
        k.c0.j.a aVar3 = this.f8889f;
        File file3 = this.f8891h;
        Objects.requireNonNull((a.C0234a) aVar3);
        if (file3.exists()) {
            try {
                F();
                C();
                this.s = true;
                return;
            } catch (IOException e2) {
                k.c0.k.f fVar = k.c0.k.f.a;
                fVar.k(5, "DiskLruCache " + this.f8890g + " is corrupt: " + e2.getMessage() + ", removing", e2);
                close();
                ((a.C0234a) this.f8889f).b(this.f8890g);
                this.t = false;
            }
        }
        N();
        this.s = true;
    }

    public boolean q() {
        int i2 = this.q;
        return i2 >= 2000 && i2 >= this.p.size();
    }

    public final l.g v() {
        x a2;
        k.c0.j.a aVar = this.f8889f;
        File file = this.f8891h;
        Objects.requireNonNull((a.C0234a) aVar);
        try {
            a2 = o.a(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            a2 = o.a(file);
        }
        b bVar = new b(a2);
        Logger logger = o.a;
        return new r(bVar);
    }
}
