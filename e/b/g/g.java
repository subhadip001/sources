package e.b.g;

import android.view.View;
import android.view.animation.Interpolator;
import e.i.j.b0;
import e.i.j.c0;
import e.i.j.d0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes.dex */
public class g {
    public Interpolator c;

    /* renamed from: d  reason: collision with root package name */
    public c0 f1601d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1602e;
    public long b = -1;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f1603f = new a();
    public final ArrayList<b0> a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* loaded from: classes.dex */
    public class a extends d0 {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        @Override // e.i.j.c0
        public void b(View view) {
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == g.this.a.size()) {
                c0 c0Var = g.this.f1601d;
                if (c0Var != null) {
                    c0Var.b(null);
                }
                this.b = 0;
                this.a = false;
                g.this.f1602e = false;
            }
        }

        @Override // e.i.j.d0, e.i.j.c0
        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            c0 c0Var = g.this.f1601d;
            if (c0Var != null) {
                c0Var.c(null);
            }
        }
    }

    public void a() {
        if (this.f1602e) {
            Iterator<b0> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f1602e = false;
        }
    }

    public void b() {
        View view;
        if (this.f1602e) {
            return;
        }
        Iterator<b0> it = this.a.iterator();
        while (it.hasNext()) {
            b0 next = it.next();
            long j2 = this.b;
            if (j2 >= 0) {
                next.c(j2);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = next.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f1601d != null) {
                next.d(this.f1603f);
            }
            View view2 = next.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f1602e = true;
    }
}
