package f.e.a.j;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DiskLruCache.java */
/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    public final File f3188f;

    /* renamed from: g  reason: collision with root package name */
    public final File f3189g;

    /* renamed from: h  reason: collision with root package name */
    public final File f3190h;

    /* renamed from: i  reason: collision with root package name */
    public final File f3191i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3192j;

    /* renamed from: k  reason: collision with root package name */
    public long f3193k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3194l;
    public Writer n;
    public int p;

    /* renamed from: m  reason: collision with root package name */
    public long f3195m = 0;
    public final LinkedHashMap<String, d> o = new LinkedHashMap<>(0, 0.75f, true);
    public long q = 0;
    public final ThreadPoolExecutor r = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    public final Callable<Void> s = new CallableC0068a();

    /* compiled from: DiskLruCache.java */
    /* renamed from: f.e.a.j.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0068a implements Callable<Void> {
        public CallableC0068a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.n == null) {
                    return null;
                }
                aVar.X();
                if (a.this.C()) {
                    a.this.T();
                    a.this.p = 0;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {
        public b(CallableC0068a callableC0068a) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        public c(d dVar, CallableC0068a callableC0068a) {
            this.a = dVar;
            this.b = dVar.f3199e ? null : new boolean[a.this.f3194l];
        }

        public void a() {
            a.a(a.this, this, false);
        }

        public File b(int i2) {
            File file;
            synchronized (a.this) {
                d dVar = this.a;
                if (dVar.f3200f == this) {
                    if (!dVar.f3199e) {
                        this.b[i2] = true;
                    }
                    file = dVar.f3198d[i2];
                    a.this.f3188f.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class d {
        public final String a;
        public final long[] b;
        public File[] c;

        /* renamed from: d  reason: collision with root package name */
        public File[] f3198d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3199e;

        /* renamed from: f  reason: collision with root package name */
        public c f3200f;

        /* renamed from: g  reason: collision with root package name */
        public long f3201g;

        public d(String str, CallableC0068a callableC0068a) {
            this.a = str;
            int i2 = a.this.f3194l;
            this.b = new long[i2];
            this.c = new File[i2];
            this.f3198d = new File[i2];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i3 = 0; i3 < a.this.f3194l; i3++) {
                sb.append(i3);
                this.c[i3] = new File(a.this.f3188f, sb.toString());
                sb.append(".tmp");
                this.f3198d[i3] = new File(a.this.f3188f, sb.toString());
                sb.setLength(length);
            }
        }

        public String a() {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.b) {
                sb.append(' ');
                sb.append(j2);
            }
            return sb.toString();
        }

        public final IOException b(String[] strArr) {
            StringBuilder A = f.a.b.a.a.A("unexpected journal line: ");
            A.append(Arrays.toString(strArr));
            throw new IOException(A.toString());
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes.dex */
    public final class e {
        public final File[] a;

        public e(a aVar, String str, long j2, File[] fileArr, long[] jArr, CallableC0068a callableC0068a) {
            this.a = fileArr;
        }
    }

    public a(File file, int i2, int i3, long j2) {
        this.f3188f = file;
        this.f3192j = i2;
        this.f3189g = new File(file, "journal");
        this.f3190h = new File(file, "journal.tmp");
        this.f3191i = new File(file, "journal.bkp");
        this.f3194l = i3;
        this.f3193k = j2;
    }

    public static a F(File file, int i2, int i3, long j2) {
        if (j2 > 0) {
            if (i3 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        W(file2, file3, false);
                    }
                }
                a aVar = new a(file, i2, i3, j2);
                if (aVar.f3189g.exists()) {
                    try {
                        aVar.N();
                        aVar.M();
                        return aVar;
                    } catch (IOException e2) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                        aVar.close();
                        f.e.a.j.c.a(aVar.f3188f);
                    }
                }
                file.mkdirs();
                a aVar2 = new a(file, i2, i3, j2);
                aVar2.T();
                return aVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void W(File file, File file2, boolean z) {
        if (z) {
            l(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void a(a aVar, c cVar, boolean z) {
        synchronized (aVar) {
            d dVar = cVar.a;
            if (dVar.f3200f == cVar) {
                if (z && !dVar.f3199e) {
                    for (int i2 = 0; i2 < aVar.f3194l; i2++) {
                        if (cVar.b[i2]) {
                            if (!dVar.f3198d[i2].exists()) {
                                cVar.a();
                                return;
                            }
                        } else {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                        }
                    }
                }
                for (int i3 = 0; i3 < aVar.f3194l; i3++) {
                    File file = dVar.f3198d[i3];
                    if (z) {
                        if (file.exists()) {
                            File file2 = dVar.c[i3];
                            file.renameTo(file2);
                            long j2 = dVar.b[i3];
                            long length = file2.length();
                            dVar.b[i3] = length;
                            aVar.f3195m = (aVar.f3195m - j2) + length;
                        }
                    } else {
                        l(file);
                    }
                }
                aVar.p++;
                dVar.f3200f = null;
                if (dVar.f3199e | z) {
                    dVar.f3199e = true;
                    aVar.n.append((CharSequence) "CLEAN");
                    aVar.n.append(' ');
                    aVar.n.append((CharSequence) dVar.a);
                    aVar.n.append((CharSequence) dVar.a());
                    aVar.n.append('\n');
                    if (z) {
                        long j3 = aVar.q;
                        aVar.q = 1 + j3;
                        dVar.f3201g = j3;
                    }
                } else {
                    aVar.o.remove(dVar.a);
                    aVar.n.append((CharSequence) "REMOVE");
                    aVar.n.append(' ');
                    aVar.n.append((CharSequence) dVar.a);
                    aVar.n.append('\n');
                }
                q(aVar.n);
                if (aVar.f3195m > aVar.f3193k || aVar.C()) {
                    aVar.r.submit(aVar.s);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static void g(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void l(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void q(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final boolean C() {
        int i2 = this.p;
        return i2 >= 2000 && i2 >= this.o.size();
    }

    public final void M() {
        l(this.f3190h);
        Iterator<d> it = this.o.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i2 = 0;
            if (next.f3200f == null) {
                while (i2 < this.f3194l) {
                    this.f3195m += next.b[i2];
                    i2++;
                }
            } else {
                next.f3200f = null;
                while (i2 < this.f3194l) {
                    l(next.c[i2]);
                    l(next.f3198d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void N() {
        f.e.a.j.b bVar = new f.e.a.j.b(new FileInputStream(this.f3189g), f.e.a.j.c.a);
        try {
            String f2 = bVar.f();
            String f3 = bVar.f();
            String f4 = bVar.f();
            String f5 = bVar.f();
            String f6 = bVar.f();
            if (!"libcore.io.DiskLruCache".equals(f2) || !"1".equals(f3) || !Integer.toString(this.f3192j).equals(f4) || !Integer.toString(this.f3194l).equals(f5) || !"".equals(f6)) {
                throw new IOException("unexpected journal header: [" + f2 + ", " + f3 + ", " + f5 + ", " + f6 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    O(bVar.f());
                    i2++;
                } catch (EOFException unused) {
                    this.p = i2 - this.o.size();
                    if (bVar.f3207j == -1) {
                        T();
                    } else {
                        this.n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3189g, true), f.e.a.j.c.a));
                    }
                    try {
                        bVar.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void O(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                substring = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.o.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i2, indexOf2);
            }
            d dVar = this.o.get(substring);
            if (dVar == null) {
                dVar = new d(substring, null);
                this.o.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f3199e = true;
                dVar.f3200f = null;
                if (split.length == a.this.f3194l) {
                    for (int i3 = 0; i3 < split.length; i3++) {
                        try {
                            dVar.b[i3] = Long.parseLong(split[i3]);
                        } catch (NumberFormatException unused) {
                            dVar.b(split);
                            throw null;
                        }
                    }
                    return;
                }
                dVar.b(split);
                throw null;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f3200f = new c(dVar, null);
                return;
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(f.a.b.a.a.p("unexpected journal line: ", str));
            } else {
                return;
            }
        }
        throw new IOException(f.a.b.a.a.p("unexpected journal line: ", str));
    }

    public final synchronized void T() {
        Writer writer = this.n;
        if (writer != null) {
            g(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3190h), f.e.a.j.c.a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f3192j));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f3194l));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (d dVar : this.o.values()) {
            if (dVar.f3200f != null) {
                bufferedWriter.write("DIRTY " + dVar.a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + dVar.a + dVar.a() + '\n');
            }
        }
        g(bufferedWriter);
        if (this.f3189g.exists()) {
            W(this.f3189g, this.f3191i, true);
        }
        W(this.f3190h, this.f3189g, false);
        this.f3191i.delete();
        this.n = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3189g, true), f.e.a.j.c.a));
    }

    public final void X() {
        while (this.f3195m > this.f3193k) {
            String key = this.o.entrySet().iterator().next().getKey();
            synchronized (this) {
                f();
                d dVar = this.o.get(key);
                if (dVar != null && dVar.f3200f == null) {
                    for (int i2 = 0; i2 < this.f3194l; i2++) {
                        File file = dVar.c[i2];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j2 = this.f3195m;
                        long[] jArr = dVar.b;
                        this.f3195m = j2 - jArr[i2];
                        jArr[i2] = 0;
                    }
                    this.p++;
                    this.n.append((CharSequence) "REMOVE");
                    this.n.append(' ');
                    this.n.append((CharSequence) key);
                    this.n.append('\n');
                    this.o.remove(key);
                    if (C()) {
                        this.r.submit(this.s);
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.n == null) {
            return;
        }
        Iterator it = new ArrayList(this.o.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((d) it.next()).f3200f;
            if (cVar != null) {
                cVar.a();
            }
        }
        X();
        g(this.n);
        this.n = null;
    }

    public final void f() {
        if (this.n == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public c p(String str) {
        synchronized (this) {
            f();
            d dVar = this.o.get(str);
            if (dVar == null) {
                dVar = new d(str, null);
                this.o.put(str, dVar);
            } else if (dVar.f3200f != null) {
                return null;
            }
            c cVar = new c(dVar, null);
            dVar.f3200f = cVar;
            this.n.append((CharSequence) "DIRTY");
            this.n.append(' ');
            this.n.append((CharSequence) str);
            this.n.append('\n');
            q(this.n);
            return cVar;
        }
    }

    public synchronized e v(String str) {
        f();
        d dVar = this.o.get(str);
        if (dVar == null) {
            return null;
        }
        if (dVar.f3199e) {
            for (File file : dVar.c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.p++;
            this.n.append((CharSequence) "READ");
            this.n.append(' ');
            this.n.append((CharSequence) str);
            this.n.append('\n');
            if (C()) {
                this.r.submit(this.s);
            }
            return new e(this, str, dVar.f3201g, dVar.c, dVar.b, null);
        }
        return null;
    }
}
