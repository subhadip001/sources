package f.e.a.l.r;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import f.e.a.l.p.d;
import f.e.a.l.r.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: DataUrlLoader.java */
/* loaded from: classes.dex */
public final class e<Model, Data> implements n<Model, Data> {
    public final a<Data> a;

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public interface a<Data> {
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public static final class b<Data> implements f.e.a.l.p.d<Data> {

        /* renamed from: f  reason: collision with root package name */
        public final String f3412f;

        /* renamed from: g  reason: collision with root package name */
        public final a<Data> f3413g;

        /* renamed from: h  reason: collision with root package name */
        public Data f3414h;

        public b(String str, a<Data> aVar) {
            this.f3412f = str;
            this.f3413g = aVar;
        }

        @Override // f.e.a.l.p.d
        public Class<Data> a() {
            Objects.requireNonNull((c.a) this.f3413g);
            return InputStream.class;
        }

        @Override // f.e.a.l.p.d
        public void b() {
            try {
                a<Data> aVar = this.f3413g;
                Data data = this.f3414h;
                Objects.requireNonNull((c.a) aVar);
                ((InputStream) data).close();
            } catch (IOException unused) {
            }
        }

        @Override // f.e.a.l.p.d
        public void cancel() {
        }

        @Override // f.e.a.l.p.d
        public DataSource d() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, Data] */
        @Override // f.e.a.l.p.d
        public void e(Priority priority, d.a<? super Data> aVar) {
            try {
                ?? r2 = (Data) ((c.a) this.f3413g).a(this.f3412f);
                this.f3414h = r2;
                aVar.f(r2);
            } catch (IllegalArgumentException e2) {
                aVar.c(e2);
            }
        }
    }

    /* compiled from: DataUrlLoader.java */
    /* loaded from: classes.dex */
    public static final class c<Model> implements o<Model, InputStream> {
        public final a<InputStream> a = new a(this);

        /* compiled from: DataUrlLoader.java */
        /* loaded from: classes.dex */
        public class a implements a<InputStream> {
            public a(c cVar) {
            }

            public Object a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // f.e.a.l.r.o
        public n<Model, InputStream> b(r rVar) {
            return new e(this.a);
        }
    }

    public e(a<Data> aVar) {
        this.a = aVar;
    }

    @Override // f.e.a.l.r.n
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // f.e.a.l.r.n
    public n.a<Data> b(Model model, int i2, int i3, f.e.a.l.l lVar) {
        return new n.a<>(new f.e.a.q.d(model), new b(model.toString(), this.a));
    }
}
