package f.e.a.l.s.c;

import android.graphics.Bitmap;
import java.util.Objects;

/* compiled from: BitmapResource.java */
/* loaded from: classes.dex */
public class e implements f.e.a.l.q.v<Bitmap>, f.e.a.l.q.r {

    /* renamed from: f  reason: collision with root package name */
    public final Bitmap f3454f;

    /* renamed from: g  reason: collision with root package name */
    public final f.e.a.l.q.b0.d f3455g;

    public e(Bitmap bitmap, f.e.a.l.q.b0.d dVar) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.f3454f = bitmap;
        Objects.requireNonNull(dVar, "BitmapPool must not be null");
        this.f3455g = dVar;
    }

    public static e d(Bitmap bitmap, f.e.a.l.q.b0.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // f.e.a.l.q.v
    public void a() {
        this.f3455g.d(this.f3454f);
    }

    @Override // f.e.a.l.q.v
    public int b() {
        return f.e.a.r.l.c(this.f3454f);
    }

    @Override // f.e.a.l.q.v
    public Class<Bitmap> c() {
        return Bitmap.class;
    }

    @Override // f.e.a.l.q.v
    public Bitmap get() {
        return this.f3454f;
    }

    @Override // f.e.a.l.q.r
    public void initialize() {
        this.f3454f.prepareToDraw();
    }
}
