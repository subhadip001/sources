package f.e.a.l.s.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import f.e.a.r.a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: ImageReader.java */
/* loaded from: classes.dex */
public interface q {

    /* compiled from: ImageReader.java */
    /* loaded from: classes.dex */
    public static final class a implements q {
        public final ByteBuffer a;
        public final List<ImageHeaderParser> b;
        public final f.e.a.l.q.b0.b c;

        public a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, f.e.a.l.q.b0.b bVar) {
            this.a = byteBuffer;
            this.b = list;
            this.c = bVar;
        }

        @Override // f.e.a.l.s.c.q
        public int a() {
            List<ImageHeaderParser> list = this.b;
            ByteBuffer c = f.e.a.r.a.c(this.a);
            f.e.a.l.q.b0.b bVar = this.c;
            if (c == null) {
                return -1;
            }
            return f.c.a.a.i.m(list, new f.e.a.l.e(c, bVar));
        }

        @Override // f.e.a.l.s.c.q
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new a.C0092a(f.e.a.r.a.c(this.a)), null, options);
        }

        @Override // f.e.a.l.s.c.q
        public void c() {
        }

        @Override // f.e.a.l.s.c.q
        public ImageHeaderParser.ImageType d() {
            return f.c.a.a.i.p(this.b, f.e.a.r.a.c(this.a));
        }
    }

    /* compiled from: ImageReader.java */
    /* loaded from: classes.dex */
    public static final class b implements q {
        public final f.e.a.l.p.k a;
        public final f.e.a.l.q.b0.b b;
        public final List<ImageHeaderParser> c;

        public b(InputStream inputStream, List<ImageHeaderParser> list, f.e.a.l.q.b0.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.b = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.c = list;
            this.a = new f.e.a.l.p.k(inputStream, bVar);
        }

        @Override // f.e.a.l.s.c.q
        public int a() {
            return f.c.a.a.i.l(this.c, this.a.a(), this.b);
        }

        @Override // f.e.a.l.s.c.q
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.a.a(), null, options);
        }

        @Override // f.e.a.l.s.c.q
        public void c() {
            u uVar = this.a.a;
            synchronized (uVar) {
                uVar.f3478h = uVar.f3476f.length;
            }
        }

        @Override // f.e.a.l.s.c.q
        public ImageHeaderParser.ImageType d() {
            return f.c.a.a.i.o(this.c, this.a.a(), this.b);
        }
    }

    /* compiled from: ImageReader.java */
    /* loaded from: classes.dex */
    public static final class c implements q {
        public final f.e.a.l.q.b0.b a;
        public final List<ImageHeaderParser> b;
        public final ParcelFileDescriptorRewinder c;

        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, f.e.a.l.q.b0.b bVar) {
            Objects.requireNonNull(bVar, "Argument must not be null");
            this.a = bVar;
            Objects.requireNonNull(list, "Argument must not be null");
            this.b = list;
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // f.e.a.l.s.c.q
        public int a() {
            return f.c.a.a.i.m(this.b, new f.e.a.l.g(this.c, this.a));
        }

        @Override // f.e.a.l.s.c.q
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), null, options);
        }

        @Override // f.e.a.l.s.c.q
        public void c() {
        }

        @Override // f.e.a.l.s.c.q
        public ImageHeaderParser.ImageType d() {
            return f.c.a.a.i.q(this.b, new f.e.a.l.d(this.c, this.a));
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    void c();

    ImageHeaderParser.ImageType d();
}
