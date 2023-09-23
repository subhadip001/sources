package e.i.c.d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public final class j {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<b, SparseArray<a>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public final ColorStateList a;
        public final Configuration b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final Resources a;
        public final Resources.Theme b;

        public b(Resources resources, Resources.Theme theme) {
            this.a = resources;
            this.b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && Objects.equals(this.b, bVar.b);
        }

        public int hashCode() {
            return Objects.hash(this.a, this.b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* compiled from: ResourcesCompat.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Typeface f2438f;

            public a(Typeface typeface) {
                this.f2438f = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.e(this.f2438f);
            }
        }

        /* compiled from: ResourcesCompat.java */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ int f2440f;

            public b(int i2) {
                this.f2440f = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.d(this.f2440f);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i2, Handler handler) {
            c(handler).post(new b(i2));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new a(typeface));
        }

        public abstract void d(int i2);

        public abstract void e(Typeface typeface);
    }

    public static Typeface a(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i2, new TypedValue(), 0, null, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, e.i.c.d.j.c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.c.d.j.b(android.content.Context, int, android.util.TypedValue, int, e.i.c.d.j$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
