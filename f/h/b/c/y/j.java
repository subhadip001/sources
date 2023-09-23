package f.h.b.c.y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import java.util.Objects;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: m  reason: collision with root package name */
    public static final c f5498m = new h(0.5f);
    public d a;
    public d b;
    public d c;

    /* renamed from: d  reason: collision with root package name */
    public d f5499d;

    /* renamed from: e  reason: collision with root package name */
    public c f5500e;

    /* renamed from: f  reason: collision with root package name */
    public c f5501f;

    /* renamed from: g  reason: collision with root package name */
    public c f5502g;

    /* renamed from: h  reason: collision with root package name */
    public c f5503h;

    /* renamed from: i  reason: collision with root package name */
    public f f5504i;

    /* renamed from: j  reason: collision with root package name */
    public f f5505j;

    /* renamed from: k  reason: collision with root package name */
    public f f5506k;

    /* renamed from: l  reason: collision with root package name */
    public f f5507l;

    public j(b bVar, a aVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.f5499d = bVar.f5508d;
        this.f5500e = bVar.f5509e;
        this.f5501f = bVar.f5510f;
        this.f5502g = bVar.f5511g;
        this.f5503h = bVar.f5512h;
        this.f5504i = bVar.f5513i;
        this.f5505j = bVar.f5514j;
        this.f5506k = bVar.f5515k;
        this.f5507l = bVar.f5516l;
    }

    public static b a(Context context, int i2, int i3, c cVar) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, f.h.b.c.b.E);
        try {
            int i4 = obtainStyledAttributes.getInt(0, 0);
            int i5 = obtainStyledAttributes.getInt(3, i4);
            int i6 = obtainStyledAttributes.getInt(4, i4);
            int i7 = obtainStyledAttributes.getInt(2, i4);
            int i8 = obtainStyledAttributes.getInt(1, i4);
            c c = c(obtainStyledAttributes, 5, cVar);
            c c2 = c(obtainStyledAttributes, 8, c);
            c c3 = c(obtainStyledAttributes, 9, c);
            c c4 = c(obtainStyledAttributes, 7, c);
            c c5 = c(obtainStyledAttributes, 6, c);
            b bVar = new b();
            d H = f.h.b.c.a.H(i5);
            bVar.a = H;
            b.b(H);
            bVar.f5509e = c2;
            d H2 = f.h.b.c.a.H(i6);
            bVar.b = H2;
            b.b(H2);
            bVar.f5510f = c3;
            d H3 = f.h.b.c.a.H(i7);
            bVar.c = H3;
            b.b(H3);
            bVar.f5511g = c4;
            d H4 = f.h.b.c.a.H(i8);
            bVar.f5508d = H4;
            b.b(H4);
            bVar.f5512h = c5;
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b b(Context context, AttributeSet attributeSet, int i2, int i3, c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.h.b.c.b.w, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, cVar);
    }

    public static c c(TypedArray typedArray, int i2, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cVar;
        }
        int i3 = peekValue.type;
        if (i3 == 5) {
            return new f.h.b.c.y.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i3 == 6 ? new h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public boolean d(RectF rectF) {
        boolean z = this.f5507l.getClass().equals(f.class) && this.f5505j.getClass().equals(f.class) && this.f5504i.getClass().equals(f.class) && this.f5506k.getClass().equals(f.class);
        float a2 = this.f5500e.a(rectF);
        return z && ((this.f5501f.a(rectF) > a2 ? 1 : (this.f5501f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f5503h.a(rectF) > a2 ? 1 : (this.f5503h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f5502g.a(rectF) > a2 ? 1 : (this.f5502g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.b instanceof i) && (this.a instanceof i) && (this.c instanceof i) && (this.f5499d instanceof i));
    }

    public j e(float f2) {
        b bVar = new b(this);
        bVar.c(f2);
        return bVar.a();
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: classes.dex */
    public static final class b {
        public d a;
        public d b;
        public d c;

        /* renamed from: d  reason: collision with root package name */
        public d f5508d;

        /* renamed from: e  reason: collision with root package name */
        public c f5509e;

        /* renamed from: f  reason: collision with root package name */
        public c f5510f;

        /* renamed from: g  reason: collision with root package name */
        public c f5511g;

        /* renamed from: h  reason: collision with root package name */
        public c f5512h;

        /* renamed from: i  reason: collision with root package name */
        public f f5513i;

        /* renamed from: j  reason: collision with root package name */
        public f f5514j;

        /* renamed from: k  reason: collision with root package name */
        public f f5515k;

        /* renamed from: l  reason: collision with root package name */
        public f f5516l;

        public b() {
            this.a = new i();
            this.b = new i();
            this.c = new i();
            this.f5508d = new i();
            this.f5509e = new f.h.b.c.y.a(0.0f);
            this.f5510f = new f.h.b.c.y.a(0.0f);
            this.f5511g = new f.h.b.c.y.a(0.0f);
            this.f5512h = new f.h.b.c.y.a(0.0f);
            this.f5513i = new f();
            this.f5514j = new f();
            this.f5515k = new f();
            this.f5516l = new f();
        }

        public static float b(d dVar) {
            if (dVar instanceof i) {
                Objects.requireNonNull((i) dVar);
                return -1.0f;
            }
            if (dVar instanceof e) {
                Objects.requireNonNull((e) dVar);
            }
            return -1.0f;
        }

        public j a() {
            return new j(this, null);
        }

        public b c(float f2) {
            this.f5509e = new f.h.b.c.y.a(f2);
            this.f5510f = new f.h.b.c.y.a(f2);
            this.f5511g = new f.h.b.c.y.a(f2);
            this.f5512h = new f.h.b.c.y.a(f2);
            return this;
        }

        public b d(float f2) {
            this.f5512h = new f.h.b.c.y.a(f2);
            return this;
        }

        public b e(float f2) {
            this.f5511g = new f.h.b.c.y.a(f2);
            return this;
        }

        public b f(float f2) {
            this.f5509e = new f.h.b.c.y.a(f2);
            return this;
        }

        public b g(float f2) {
            this.f5510f = new f.h.b.c.y.a(f2);
            return this;
        }

        public b(j jVar) {
            this.a = new i();
            this.b = new i();
            this.c = new i();
            this.f5508d = new i();
            this.f5509e = new f.h.b.c.y.a(0.0f);
            this.f5510f = new f.h.b.c.y.a(0.0f);
            this.f5511g = new f.h.b.c.y.a(0.0f);
            this.f5512h = new f.h.b.c.y.a(0.0f);
            this.f5513i = new f();
            this.f5514j = new f();
            this.f5515k = new f();
            this.f5516l = new f();
            this.a = jVar.a;
            this.b = jVar.b;
            this.c = jVar.c;
            this.f5508d = jVar.f5499d;
            this.f5509e = jVar.f5500e;
            this.f5510f = jVar.f5501f;
            this.f5511g = jVar.f5502g;
            this.f5512h = jVar.f5503h;
            this.f5513i = jVar.f5504i;
            this.f5514j = jVar.f5505j;
            this.f5515k = jVar.f5506k;
            this.f5516l = jVar.f5507l;
        }
    }

    public j() {
        this.a = new i();
        this.b = new i();
        this.c = new i();
        this.f5499d = new i();
        this.f5500e = new f.h.b.c.y.a(0.0f);
        this.f5501f = new f.h.b.c.y.a(0.0f);
        this.f5502g = new f.h.b.c.y.a(0.0f);
        this.f5503h = new f.h.b.c.y.a(0.0f);
        this.f5504i = new f();
        this.f5505j = new f();
        this.f5506k = new f();
        this.f5507l = new f();
    }
}
