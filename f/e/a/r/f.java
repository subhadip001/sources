package f.e.a.r;

import java.util.Objects;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: GlideSuppliers.java */
/* loaded from: classes.dex */
public class f<T> implements g<T> {
    public volatile T a;
    public final /* synthetic */ g b;

    public f(g gVar) {
        this.b = gVar;
    }

    @Override // f.e.a.r.g
    public T get() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    T t = (T) this.b.get();
                    Objects.requireNonNull(t, "Argument must not be null");
                    this.a = t;
                }
            }
        }
        return this.a;
    }
}
