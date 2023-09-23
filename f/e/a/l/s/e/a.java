package f.e.a.l.s.e;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser;
import f.c.a.a.i;
import f.e.a.l.m;
import f.e.a.l.q.v;
import f.e.a.r.l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: AnimatedWebpDecoder.java */
/* loaded from: classes.dex */
public final class a {
    public final List<ImageHeaderParser> a;
    public final f.e.a.l.q.b0.b b;

    /* compiled from: AnimatedWebpDecoder.java */
    /* renamed from: f.e.a.l.s.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0087a implements v<Drawable> {

        /* renamed from: f  reason: collision with root package name */
        public final AnimatedImageDrawable f3489f;

        public C0087a(AnimatedImageDrawable animatedImageDrawable) {
            this.f3489f = animatedImageDrawable;
        }

        @Override // f.e.a.l.q.v
        public void a() {
            this.f3489f.stop();
            this.f3489f.clearAnimationCallbacks();
        }

        @Override // f.e.a.l.q.v
        public int b() {
            return l.d(Bitmap.Config.ARGB_8888) * this.f3489f.getIntrinsicHeight() * this.f3489f.getIntrinsicWidth() * 2;
        }

        @Override // f.e.a.l.q.v
        public Class<Drawable> c() {
            return Drawable.class;
        }

        @Override // f.e.a.l.q.v
        public Drawable get() {
            return this.f3489f;
        }
    }

    /* compiled from: AnimatedWebpDecoder.java */
    /* loaded from: classes.dex */
    public static final class b implements m<ByteBuffer, Drawable> {
        public final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // f.e.a.l.m
        public boolean a(ByteBuffer byteBuffer, f.e.a.l.l lVar) {
            return i.p(this.a.a, byteBuffer) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
        }

        @Override // f.e.a.l.m
        public v<Drawable> b(ByteBuffer byteBuffer, int i2, int i3, f.e.a.l.l lVar) {
            return this.a.a(ImageDecoder.createSource(byteBuffer), i2, i3, lVar);
        }
    }

    /* compiled from: AnimatedWebpDecoder.java */
    /* loaded from: classes.dex */
    public static final class c implements m<InputStream, Drawable> {
        public final a a;

        public c(a aVar) {
            this.a = aVar;
        }

        @Override // f.e.a.l.m
        public boolean a(InputStream inputStream, f.e.a.l.l lVar) {
            a aVar = this.a;
            return i.o(aVar.a, inputStream, aVar.b) == ImageHeaderParser.ImageType.ANIMATED_WEBP;
        }

        @Override // f.e.a.l.m
        public v<Drawable> b(InputStream inputStream, int i2, int i3, f.e.a.l.l lVar) {
            return this.a.a(ImageDecoder.createSource(f.e.a.r.a.b(inputStream)), i2, i3, lVar);
        }
    }

    public a(List<ImageHeaderParser> list, f.e.a.l.q.b0.b bVar) {
        this.a = list;
        this.b = bVar;
    }

    public v<Drawable> a(ImageDecoder.Source source, int i2, int i3, f.e.a.l.l lVar) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new f.e.a.l.s.a(i2, i3, lVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new C0087a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + decodeDrawable);
    }
}
