package l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* compiled from: Okio.java */
/* loaded from: classes2.dex */
public final class o {
    public static final Logger a = Logger.getLogger(o.class.getName());

    /* compiled from: Okio.java */
    /* loaded from: classes2.dex */
    public class a implements x {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ z f9248f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ OutputStream f9249g;

        public a(z zVar, OutputStream outputStream) {
            this.f9248f = zVar;
            this.f9249g = outputStream;
        }

        @Override // l.x
        public void J(f fVar, long j2) {
            a0.b(fVar.f9230g, 0L, j2);
            while (j2 > 0) {
                this.f9248f.f();
                u uVar = fVar.f9229f;
                int min = (int) Math.min(j2, uVar.c - uVar.b);
                this.f9249g.write(uVar.a, uVar.b, min);
                int i2 = uVar.b + min;
                uVar.b = i2;
                long j3 = min;
                j2 -= j3;
                fVar.f9230g -= j3;
                if (i2 == uVar.c) {
                    fVar.f9229f = uVar.a();
                    v.a(uVar);
                }
            }
        }

        @Override // l.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f9249g.close();
        }

        @Override // l.x
        public z d() {
            return this.f9248f;
        }

        @Override // l.x, java.io.Flushable
        public void flush() {
            this.f9249g.flush();
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("sink(");
            A.append(this.f9249g);
            A.append(")");
            return A.toString();
        }
    }

    /* compiled from: Okio.java */
    /* loaded from: classes2.dex */
    public class b implements y {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ z f9250f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ InputStream f9251g;

        public b(z zVar, InputStream inputStream) {
            this.f9250f = zVar;
            this.f9251g = inputStream;
        }

        @Override // l.y
        public long a0(f fVar, long j2) {
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i2 >= 0) {
                if (i2 == 0) {
                    return 0L;
                }
                try {
                    this.f9250f.f();
                    u W = fVar.W(1);
                    int read = this.f9251g.read(W.a, W.c, (int) Math.min(j2, 8192 - W.c));
                    if (read == -1) {
                        return -1L;
                    }
                    W.c += read;
                    long j3 = read;
                    fVar.f9230g += j3;
                    return j3;
                } catch (AssertionError e2) {
                    if (o.b(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }
            throw new IllegalArgumentException(f.a.b.a.a.l("byteCount < 0: ", j2));
        }

        @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f9251g.close();
        }

        @Override // l.y
        public z d() {
            return this.f9250f;
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("source(");
            A.append(this.f9251g);
            A.append(")");
            return A.toString();
        }
    }

    public static x a(File file) {
        if (file != null) {
            return d(new FileOutputStream(file, true), new z());
        }
        throw new IllegalArgumentException("file == null");
    }

    public static boolean b(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static x c(File file) {
        if (file != null) {
            return d(new FileOutputStream(file), new z());
        }
        throw new IllegalArgumentException("file == null");
    }

    public static x d(OutputStream outputStream, z zVar) {
        if (outputStream != null) {
            return new a(zVar, outputStream);
        }
        throw new IllegalArgumentException("out == null");
    }

    public static x e(Socket socket) {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                q qVar = new q(socket);
                return new l.a(qVar, d(socket.getOutputStream(), qVar));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static y f(InputStream inputStream) {
        return g(inputStream, new z());
    }

    public static y g(InputStream inputStream, z zVar) {
        if (inputStream != null) {
            return new b(zVar, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }

    public static y h(Socket socket) {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                q qVar = new q(socket);
                return new l.b(qVar, g(socket.getInputStream(), qVar));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }
}
