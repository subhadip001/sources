package g.a;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: Codec.java */
/* loaded from: classes2.dex */
public interface i extends j, o {

    /* compiled from: Codec.java */
    /* loaded from: classes2.dex */
    public static final class a implements i {
        @Override // g.a.j, g.a.o
        public String a() {
            return "gzip";
        }

        @Override // g.a.o
        public InputStream b(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        @Override // g.a.j
        public OutputStream c(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }
    }

    /* compiled from: Codec.java */
    /* loaded from: classes2.dex */
    public static final class b implements i {
        public static final i a = new b();

        @Override // g.a.j, g.a.o
        public String a() {
            return "identity";
        }

        @Override // g.a.o
        public InputStream b(InputStream inputStream) {
            return inputStream;
        }

        @Override // g.a.j
        public OutputStream c(OutputStream outputStream) {
            return outputStream;
        }
    }
}
