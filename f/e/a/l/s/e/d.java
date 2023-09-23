package f.e.a.l.s.e;

import android.graphics.drawable.Drawable;

/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: classes.dex */
public final class d extends c<Drawable> {
    public d(Drawable drawable) {
        super(drawable);
    }

    @Override // f.e.a.l.q.v
    public void a() {
    }

    @Override // f.e.a.l.q.v
    public int b() {
        return Math.max(1, this.f3490f.getIntrinsicHeight() * this.f3490f.getIntrinsicWidth() * 4);
    }

    @Override // f.e.a.l.q.v
    public Class<Drawable> c() {
        return this.f3490f.getClass();
    }
}
