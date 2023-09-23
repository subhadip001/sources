package e.k.a;

import android.graphics.Rect;
import e.k.a.a;
import java.util.Comparator;

/* compiled from: FocusStrategy.java */
/* loaded from: classes.dex */
public class d<T> implements Comparator<T> {

    /* renamed from: f  reason: collision with root package name */
    public final Rect f2594f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final Rect f2595g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2596h;

    /* renamed from: i  reason: collision with root package name */
    public final b<T> f2597i;

    public d(boolean z, b<T> bVar) {
        this.f2596h = z;
        this.f2597i = bVar;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        Rect rect = this.f2594f;
        Rect rect2 = this.f2595g;
        ((a.C0048a) this.f2597i).a(t, rect);
        ((a.C0048a) this.f2597i).a(t2, rect2);
        int i2 = rect.top;
        int i3 = rect2.top;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = rect.left;
        int i5 = rect2.left;
        if (i4 < i5) {
            return this.f2596h ? 1 : -1;
        } else if (i4 > i5) {
            return this.f2596h ? -1 : 1;
        } else {
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.right;
            int i9 = rect2.right;
            if (i8 < i9) {
                return this.f2596h ? 1 : -1;
            } else if (i8 > i9) {
                return this.f2596h ? -1 : 1;
            } else {
                return 0;
            }
        }
    }
}
