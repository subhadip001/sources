package e.f0.c;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes.dex */
public final class f extends RecyclerView.r {
    public ViewPager2.e a;
    public final ViewPager2 b;
    public final RecyclerView c;

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayoutManager f2010d;

    /* renamed from: e  reason: collision with root package name */
    public int f2011e;

    /* renamed from: f  reason: collision with root package name */
    public int f2012f;

    /* renamed from: g  reason: collision with root package name */
    public a f2013g;

    /* renamed from: h  reason: collision with root package name */
    public int f2014h;

    /* renamed from: i  reason: collision with root package name */
    public int f2015i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2016j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2017k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2018l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2019m;

    /* compiled from: ScrollEventAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public float b;
        public int c;

        public void a() {
            this.a = -1;
            this.b = 0.0f;
            this.c = 0;
        }
    }

    public f(ViewPager2 viewPager2) {
        this.b = viewPager2;
        RecyclerView recyclerView = viewPager2.o;
        this.c = recyclerView;
        this.f2010d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f2013g = new a();
        e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void a(RecyclerView recyclerView, int i2) {
        ViewPager2.e eVar;
        int i3 = this.f2011e;
        boolean z = true;
        if (!(i3 == 1 && this.f2012f == 1) && i2 == 1) {
            this.f2019m = false;
            this.f2011e = 1;
            int i4 = this.f2015i;
            if (i4 != -1) {
                this.f2014h = i4;
                this.f2015i = -1;
            } else if (this.f2014h == -1) {
                this.f2014h = this.f2010d.m1();
            }
            d(1);
            return;
        }
        if ((i3 == 1 || i3 == 4) && i2 == 2) {
            if (this.f2017k) {
                d(2);
                this.f2016j = true;
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 4) && i2 == 0) {
            f();
            if (!this.f2017k) {
                int i5 = this.f2013g.a;
                if (i5 != -1 && (eVar = this.a) != null) {
                    eVar.b(i5, 0.0f, 0);
                }
            } else {
                a aVar = this.f2013g;
                if (aVar.c == 0) {
                    int i6 = this.f2014h;
                    int i7 = aVar.a;
                    if (i6 != i7) {
                        c(i7);
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                d(0);
                e();
            }
        }
        if (this.f2011e == 2 && i2 == 0 && this.f2018l) {
            f();
            a aVar2 = this.f2013g;
            if (aVar2.c == 0) {
                int i8 = this.f2015i;
                int i9 = aVar2.a;
                if (i8 != i9) {
                    if (i9 == -1) {
                        i9 = 0;
                    }
                    c(i9);
                }
                d(0);
                e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if ((r6 < 0) == r4.b.a()) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r4.f2017k = r5
            r4.f()
            boolean r0 = r4.f2016j
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L3d
            r4.f2016j = r1
            if (r7 > 0) goto L22
            if (r7 != 0) goto L20
            if (r6 >= 0) goto L16
            r6 = 1
            goto L17
        L16:
            r6 = 0
        L17:
            androidx.viewpager2.widget.ViewPager2 r7 = r4.b
            boolean r7 = r7.a()
            if (r6 != r7) goto L20
            goto L22
        L20:
            r6 = 0
            goto L23
        L22:
            r6 = 1
        L23:
            if (r6 == 0) goto L2f
            e.f0.c.f$a r6 = r4.f2013g
            int r7 = r6.c
            if (r7 == 0) goto L2f
            int r6 = r6.a
            int r6 = r6 + r5
            goto L33
        L2f:
            e.f0.c.f$a r6 = r4.f2013g
            int r6 = r6.a
        L33:
            r4.f2015i = r6
            int r7 = r4.f2014h
            if (r7 == r6) goto L4b
            r4.c(r6)
            goto L4b
        L3d:
            int r6 = r4.f2011e
            if (r6 != 0) goto L4b
            e.f0.c.f$a r6 = r4.f2013g
            int r6 = r6.a
            if (r6 != r2) goto L48
            r6 = 0
        L48:
            r4.c(r6)
        L4b:
            e.f0.c.f$a r6 = r4.f2013g
            int r7 = r6.a
            if (r7 != r2) goto L52
            r7 = 0
        L52:
            float r0 = r6.b
            int r6 = r6.c
            androidx.viewpager2.widget.ViewPager2$e r3 = r4.a
            if (r3 == 0) goto L5d
            r3.b(r7, r0, r6)
        L5d:
            e.f0.c.f$a r6 = r4.f2013g
            int r7 = r6.a
            int r0 = r4.f2015i
            if (r7 == r0) goto L67
            if (r0 != r2) goto L75
        L67:
            int r6 = r6.c
            if (r6 != 0) goto L75
            int r6 = r4.f2012f
            if (r6 == r5) goto L75
            r4.d(r1)
            r4.e()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f0.c.f.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public final void c(int i2) {
        ViewPager2.e eVar = this.a;
        if (eVar != null) {
            eVar.c(i2);
        }
    }

    public final void d(int i2) {
        if ((this.f2011e == 3 && this.f2012f == 0) || this.f2012f == i2) {
            return;
        }
        this.f2012f = i2;
        ViewPager2.e eVar = this.a;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public final void e() {
        this.f2011e = 0;
        this.f2012f = 0;
        this.f2013g.a();
        this.f2014h = -1;
        this.f2015i = -1;
        this.f2016j = false;
        this.f2017k = false;
        this.f2019m = false;
        this.f2018l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0151, code lost:
        if (r4[r2 - 1][1] >= r3) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0156, code lost:
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f0.c.f.f():void");
    }
}
