package f.h.b.b.c2.s;

import android.text.Layout;

/* compiled from: TtmlStyle.java */
/* loaded from: classes.dex */
public final class e {
    public String a;
    public int b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public int f4043d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4044e;

    /* renamed from: k  reason: collision with root package name */
    public float f4050k;

    /* renamed from: l  reason: collision with root package name */
    public String f4051l;
    public Layout.Alignment o;

    /* renamed from: f  reason: collision with root package name */
    public int f4045f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f4046g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f4047h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f4048i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f4049j = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f4052m = -1;
    public int n = -1;
    public int p = -1;

    public e a(e eVar) {
        int i2;
        Layout.Alignment alignment;
        String str;
        if (eVar != null) {
            if (!this.c && eVar.c) {
                this.b = eVar.b;
                this.c = true;
            }
            if (this.f4047h == -1) {
                this.f4047h = eVar.f4047h;
            }
            if (this.f4048i == -1) {
                this.f4048i = eVar.f4048i;
            }
            if (this.a == null && (str = eVar.a) != null) {
                this.a = str;
            }
            if (this.f4045f == -1) {
                this.f4045f = eVar.f4045f;
            }
            if (this.f4046g == -1) {
                this.f4046g = eVar.f4046g;
            }
            if (this.n == -1) {
                this.n = eVar.n;
            }
            if (this.o == null && (alignment = eVar.o) != null) {
                this.o = alignment;
            }
            if (this.p == -1) {
                this.p = eVar.p;
            }
            if (this.f4049j == -1) {
                this.f4049j = eVar.f4049j;
                this.f4050k = eVar.f4050k;
            }
            if (!this.f4044e && eVar.f4044e) {
                this.f4043d = eVar.f4043d;
                this.f4044e = true;
            }
            if (this.f4052m == -1 && (i2 = eVar.f4052m) != -1) {
                this.f4052m = i2;
            }
        }
        return this;
    }

    public int b() {
        int i2 = this.f4047h;
        if (i2 == -1 && this.f4048i == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.f4048i == 1 ? 2 : 0);
    }
}
