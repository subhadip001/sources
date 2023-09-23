package f.e.a.l.r;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import f.e.a.l.p.d;
import f.e.a.l.r.n;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferFileLoader.java */
/* loaded from: classes.dex */
public class d implements n<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements f.e.a.l.p.d<ByteBuffer> {

        /* renamed from: f  reason: collision with root package name */
        public final File f3411f;

        public a(File file) {
            this.f3411f = file;
        }

        @Override // f.e.a.l.p.d
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // f.e.a.l.p.d
        public void b() {
        }

        @Override // f.e.a.l.p.d
        public void cancel() {
        }

        @Override // f.e.a.l.p.d
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // f.e.a.l.p.d
        public void e(Priority priority, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(f.e.a.r.a.a(this.f3411f));
            } catch (IOException e2) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                }
                aVar.c(e2);
            }
        }
    }

    /* compiled from: ByteBufferFileLoader.java */
    /* loaded from: classes.dex */
    public static class b implements o<File, ByteBuffer> {
        @Override // f.e.a.l.r.o
        public n<File, ByteBuffer> b(r rVar) {
            return new d();
        }
    }

    @Override // f.e.a.l.r.n
    public /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // f.e.a.l.r.n
    public n.a<ByteBuffer> b(File file, int i2, int i3, f.e.a.l.l lVar) {
        File file2 = file;
        return new n.a<>(new f.e.a.q.d(file2), new a(file2));
    }
}
