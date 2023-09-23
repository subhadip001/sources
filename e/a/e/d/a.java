package e.a.e.d;

import android.content.Context;
import android.content.Intent;

/* compiled from: ActivityResultContract.java */
/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* compiled from: ActivityResultContract.java */
    /* renamed from: e.a.e.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0018a<T> {
        public final T a;

        public C0018a(T t) {
            this.a = t;
        }
    }

    public abstract Intent a(Context context, I i2);

    public C0018a<O> b(Context context, I i2) {
        return null;
    }

    public abstract O c(int i2, Intent intent);
}
