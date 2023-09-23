package f.e.a.l.r;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import f.e.a.l.p.d;
import f.e.a.l.r.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteArrayLoader.java */
/* loaded from: classes.dex */
public class b<Data> implements n<byte[], Data> {
    public final InterfaceC0081b<Data> a;

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class a implements o<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: f.e.a.l.r.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0080a implements InterfaceC0081b<ByteBuffer> {
            public C0080a(a aVar) {
            }

            @Override // f.e.a.l.r.b.InterfaceC0081b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // f.e.a.l.r.b.InterfaceC0081b
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // f.e.a.l.r.o
        public n<byte[], ByteBuffer> b(r rVar) {
            return new b(new C0080a(this));
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: f.e.a.l.r.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0081b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class c<Data> implements f.e.a.l.p.d<Data> {

        /* renamed from: f  reason: collision with root package name */
        public final byte[] f3409f;

        /* renamed from: g  reason: collision with root package name */
        public final InterfaceC0081b<Data> f3410g;

        public c(byte[] bArr, InterfaceC0081b<Data> interfaceC0081b) {
            this.f3409f = bArr;
            this.f3410g = interfaceC0081b;
        }

        @Override // f.e.a.l.p.d
        public Class<Data> a() {
            return this.f3410g.a();
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
        public void e(Priority priority, d.a<? super Data> aVar) {
            aVar.f((Data) this.f3410g.b(this.f3409f));
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* loaded from: classes.dex */
    public static class d implements o<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        /* loaded from: classes.dex */
        public class a implements InterfaceC0081b<InputStream> {
            public a(d dVar) {
            }

            @Override // f.e.a.l.r.b.InterfaceC0081b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // f.e.a.l.r.b.InterfaceC0081b
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // f.e.a.l.r.o
        public n<byte[], InputStream> b(r rVar) {
            return new b(new a(this));
        }
    }

    public b(InterfaceC0081b<Data> interfaceC0081b) {
        this.a = interfaceC0081b;
    }

    @Override // f.e.a.l.r.n
    public /* bridge */ /* synthetic */ boolean a(byte[] bArr) {
        return true;
    }

    @Override // f.e.a.l.r.n
    public n.a b(byte[] bArr, int i2, int i3, f.e.a.l.l lVar) {
        byte[] bArr2 = bArr;
        return new n.a(new f.e.a.q.d(bArr2), new c(bArr2, this.a));
    }
}
