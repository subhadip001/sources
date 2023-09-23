package f.m.b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: Action.java */
/* loaded from: classes2.dex */
public abstract class a<T> {
    public final Picasso a;
    public final v b;
    public final WeakReference<T> c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6810d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6811e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6812f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6813g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f6814h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6815i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f6816j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6817k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6818l;

    /* compiled from: Action.java */
    /* renamed from: f.m.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0166a<M> extends WeakReference<M> {
        public final a a;

        public C0166a(a aVar, M m2, ReferenceQueue<? super M> referenceQueue) {
            super(m2, referenceQueue);
            this.a = aVar;
        }
    }

    public a(Picasso picasso, T t, v vVar, int i2, int i3, int i4, Drawable drawable, String str, Object obj, boolean z) {
        this.a = picasso;
        this.b = vVar;
        this.c = t == null ? null : new C0166a(this, t, picasso.f1336k);
        this.f6811e = i2;
        this.f6812f = i3;
        this.f6810d = z;
        this.f6813g = i4;
        this.f6814h = drawable;
        this.f6815i = str;
        this.f6816j = obj == null ? this : obj;
    }

    public void a() {
        this.f6818l = true;
    }

    public abstract void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public abstract void c(Exception exc);

    public T d() {
        WeakReference<T> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
