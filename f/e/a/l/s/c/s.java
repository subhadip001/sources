package f.e.a.l.s.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.Objects;

/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: classes.dex */
public final class s implements f.e.a.l.q.v<BitmapDrawable>, f.e.a.l.q.r {

    /* renamed from: f  reason: collision with root package name */
    public final Resources f3474f;

    /* renamed from: g  reason: collision with root package name */
    public final f.e.a.l.q.v<Bitmap> f3475g;

    public s(Resources resources, f.e.a.l.q.v<Bitmap> vVar) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f3474f = resources;
        this.f3475g = vVar;
    }

    public static f.e.a.l.q.v<BitmapDrawable> d(Resources resources, f.e.a.l.q.v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new s(resources, vVar);
    }

    @Override // f.e.a.l.q.v
    public void a() {
        this.f3475g.a();
    }

    @Override // f.e.a.l.q.v
    public int b() {
        return this.f3475g.b();
    }

    @Override // f.e.a.l.q.v
    public Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // f.e.a.l.q.v
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f3474f, this.f3475g.get());
    }

    @Override // f.e.a.l.q.r
    public void initialize() {
        f.e.a.l.q.v<Bitmap> vVar = this.f3475g;
        if (vVar instanceof f.e.a.l.q.r) {
            ((f.e.a.l.q.r) vVar).initialize();
        }
    }
}
