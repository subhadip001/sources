package f.h.b.c.m;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes.dex */
public interface c {

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes.dex */
    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();
        public final e a = new e(null);

        @Override // android.animation.TypeEvaluator
        public e evaluate(float f2, e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            e eVar5 = this.a;
            float F0 = f.h.b.c.a.F0(eVar3.a, eVar4.a, f2);
            float F02 = f.h.b.c.a.F0(eVar3.b, eVar4.b, f2);
            float F03 = f.h.b.c.a.F0(eVar3.c, eVar4.c, f2);
            eVar5.a = F0;
            eVar5.b = F02;
            eVar5.c = F03;
            return this.a;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: f.h.b.c.m.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0122c extends Property<c, e> {
        public static final Property<c, e> a = new C0122c("circularReveal");

        public C0122c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        public e get(c cVar) {
            return cVar.getRevealInfo();
        }

        @Override // android.util.Property
        public void set(c cVar, e eVar) {
            cVar.setRevealInfo(eVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes.dex */
    public static class d extends Property<c, Integer> {
        public static final Property<c, Integer> a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        public Integer get(c cVar) {
            return Integer.valueOf(cVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public void set(c cVar, Integer num) {
            cVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes.dex */
    public static class e {
        public float a;
        public float b;
        public float c;

        public e() {
        }

        public e(a aVar) {
        }

        public e(float f2, float f3, float f4) {
            this.a = f2;
            this.b = f3;
            this.c = f4;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(e eVar);
}
