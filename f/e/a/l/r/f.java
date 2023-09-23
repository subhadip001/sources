package f.e.a.l.r;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import f.e.a.l.p.d;
import f.e.a.l.r.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileLoader.java */
/* loaded from: classes.dex */
public class f<Data> implements n<File, Data> {
    public final d<Data> a;

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> implements o<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        @Override // f.e.a.l.r.o
        public final n<File, Data> b(r rVar) {
            return new f(this.a);
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        /* loaded from: classes.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // f.e.a.l.r.f.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // f.e.a.l.r.f.d
            public void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            @Override // f.e.a.l.r.f.d
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static final class c<Data> implements f.e.a.l.p.d<Data> {

        /* renamed from: f  reason: collision with root package name */
        public final File f3415f;

        /* renamed from: g  reason: collision with root package name */
        public final d<Data> f3416g;

        /* renamed from: h  reason: collision with root package name */
        public Data f3417h;

        public c(File file, d<Data> dVar) {
            this.f3415f = file;
            this.f3416g = dVar;
        }

        @Override // f.e.a.l.p.d
        public Class<Data> a() {
            return this.f3416g.a();
        }

        @Override // f.e.a.l.p.d
        public void b() {
            Data data = this.f3417h;
            if (data != null) {
                try {
                    this.f3416g.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // f.e.a.l.p.d
        public void cancel() {
        }

        @Override // f.e.a.l.p.d
        public DataSource d() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // f.e.a.l.p.d
        public void e(Priority priority, d.a<? super Data> aVar) {
            try {
                Data c = this.f3416g.c(this.f3415f);
                this.f3417h = c;
                aVar.f(c);
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e2);
                }
                aVar.c(e2);
            }
        }
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    /* compiled from: FileLoader.java */
    /* loaded from: classes.dex */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        /* loaded from: classes.dex */
        public class a implements d<InputStream> {
            @Override // f.e.a.l.r.f.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // f.e.a.l.r.f.d
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            @Override // f.e.a.l.r.f.d
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.a = dVar;
    }

    @Override // f.e.a.l.r.n
    public /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // f.e.a.l.r.n
    public n.a b(File file, int i2, int i3, f.e.a.l.l lVar) {
        File file2 = file;
        return new n.a(new f.e.a.q.d(file2), new c(file2, this.a));
    }
}
