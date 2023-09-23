package f.e.a.l.s.e;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import f.e.a.l.q.r;
import f.e.a.l.q.v;
import java.util.Objects;

/* compiled from: DrawableResource.java */
/* loaded from: classes.dex */
public abstract class c<T extends Drawable> implements v<T>, r {

    /* renamed from: f  reason: collision with root package name */
    public final T f3490f;

    public c(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f3490f = t;
    }

    @Override // f.e.a.l.q.v
    public Object get() {
        Drawable.ConstantState constantState = this.f3490f.getConstantState();
        if (constantState == null) {
            return this.f3490f;
        }
        return constantState.newDrawable();
    }

    @Override // f.e.a.l.q.r
    public void initialize() {
        T t = this.f3490f;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof f.e.a.l.s.g.c) {
            ((f.e.a.l.s.g.c) t).b().prepareToDraw();
        }
    }
}
