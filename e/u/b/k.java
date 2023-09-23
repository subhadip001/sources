package e.u.b;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: classes.dex */
public class k extends b0 {
    public static TimeInterpolator s;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f2863h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<RecyclerView.a0> f2864i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<b> f2865j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<a> f2866k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.a0>> f2867l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ArrayList<b>> f2868m = new ArrayList<>();
    public ArrayList<ArrayList<a>> n = new ArrayList<>();
    public ArrayList<RecyclerView.a0> o = new ArrayList<>();
    public ArrayList<RecyclerView.a0> p = new ArrayList<>();
    public ArrayList<RecyclerView.a0> q = new ArrayList<>();
    public ArrayList<RecyclerView.a0> r = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class a {
        public RecyclerView.a0 a;
        public RecyclerView.a0 b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f2869d;

        /* renamed from: e  reason: collision with root package name */
        public int f2870e;

        /* renamed from: f  reason: collision with root package name */
        public int f2871f;

        public a(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, int i2, int i3, int i4, int i5) {
            this.a = a0Var;
            this.b = a0Var2;
            this.c = i2;
            this.f2869d = i3;
            this.f2870e = i4;
            this.f2871f = i5;
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("ChangeInfo{oldHolder=");
            A.append(this.a);
            A.append(", newHolder=");
            A.append(this.b);
            A.append(", fromX=");
            A.append(this.c);
            A.append(", fromY=");
            A.append(this.f2869d);
            A.append(", toX=");
            A.append(this.f2870e);
            A.append(", toY=");
            A.append(this.f2871f);
            A.append('}');
            return A.toString();
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* loaded from: classes.dex */
    public static class b {
        public RecyclerView.a0 a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f2872d;

        /* renamed from: e  reason: collision with root package name */
        public int f2873e;

        public b(RecyclerView.a0 a0Var, int i2, int i3, int i4, int i5) {
            this.a = a0Var;
            this.b = i2;
            this.c = i3;
            this.f2872d = i4;
            this.f2873e = i5;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void e(RecyclerView.a0 a0Var) {
        View view = a0Var.itemView;
        view.animate().cancel();
        int size = this.f2865j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2865j.get(size).a == a0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(a0Var);
                this.f2865j.remove(size);
            }
        }
        l(this.f2866k, a0Var);
        if (this.f2863h.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        if (this.f2864i.remove(a0Var)) {
            view.setAlpha(1.0f);
            c(a0Var);
        }
        int size2 = this.n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<a> arrayList = this.n.get(size2);
            l(arrayList, a0Var);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        int size3 = this.f2868m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<b> arrayList2 = this.f2868m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).a == a0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(a0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2868m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f2867l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.a0> arrayList3 = this.f2867l.get(size5);
                if (arrayList3.remove(a0Var)) {
                    view.setAlpha(1.0f);
                    c(a0Var);
                    if (arrayList3.isEmpty()) {
                        this.f2867l.remove(size5);
                    }
                }
            } else {
                this.q.remove(a0Var);
                this.o.remove(a0Var);
                this.r.remove(a0Var);
                this.p.remove(a0Var);
                k();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void f() {
        int size = this.f2865j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.f2865j.get(size);
            View view = bVar.a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.a);
            this.f2865j.remove(size);
        }
        int size2 = this.f2863h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(this.f2863h.get(size2));
            this.f2863h.remove(size2);
        }
        int size3 = this.f2864i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.a0 a0Var = this.f2864i.get(size3);
            a0Var.itemView.setAlpha(1.0f);
            c(a0Var);
            this.f2864i.remove(size3);
        }
        int size4 = this.f2866k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.f2866k.get(size4);
            RecyclerView.a0 a0Var2 = aVar.a;
            if (a0Var2 != null) {
                m(aVar, a0Var2);
            }
            RecyclerView.a0 a0Var3 = aVar.b;
            if (a0Var3 != null) {
                m(aVar, a0Var3);
            }
        }
        this.f2866k.clear();
        if (!g()) {
            return;
        }
        int size5 = this.f2868m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<b> arrayList = this.f2868m.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(bVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2868m.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f2867l.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.a0> arrayList2 = this.f2867l.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.a0 a0Var4 = arrayList2.get(size8);
                    a0Var4.itemView.setAlpha(1.0f);
                    c(a0Var4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2867l.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.n.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList<a> arrayList3 = this.n.get(size9);
                int size10 = arrayList3.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        a aVar2 = arrayList3.get(size10);
                        RecyclerView.a0 a0Var5 = aVar2.a;
                        if (a0Var5 != null) {
                            m(aVar2, a0Var5);
                        }
                        RecyclerView.a0 a0Var6 = aVar2.b;
                        if (a0Var6 != null) {
                            m(aVar2, a0Var6);
                        }
                        if (arrayList3.isEmpty()) {
                            this.n.remove(arrayList3);
                        }
                    }
                }
            } else {
                j(this.q);
                j(this.p);
                j(this.o);
                j(this.r);
                d();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean g() {
        return (this.f2864i.isEmpty() && this.f2866k.isEmpty() && this.f2865j.isEmpty() && this.f2863h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.f2868m.isEmpty() && this.f2867l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // e.u.b.b0
    public boolean i(RecyclerView.a0 a0Var, int i2, int i3, int i4, int i5) {
        View view = a0Var.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) a0Var.itemView.getTranslationY());
        n(a0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            c(a0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.f2865j.add(new b(a0Var, translationX, translationY, i4, i5));
        return true;
    }

    public void j(List<RecyclerView.a0> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            list.get(size).itemView.animate().cancel();
        }
    }

    public void k() {
        if (g()) {
            return;
        }
        d();
    }

    public final void l(List<a> list, RecyclerView.a0 a0Var) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            a aVar = list.get(size);
            if (m(aVar, a0Var) && aVar.a == null && aVar.b == null) {
                list.remove(aVar);
            }
        }
    }

    public final boolean m(a aVar, RecyclerView.a0 a0Var) {
        if (aVar.b == a0Var) {
            aVar.b = null;
        } else if (aVar.a != a0Var) {
            return false;
        } else {
            aVar.a = null;
        }
        a0Var.itemView.setAlpha(1.0f);
        a0Var.itemView.setTranslationX(0.0f);
        a0Var.itemView.setTranslationY(0.0f);
        c(a0Var);
        return true;
    }

    public final void n(RecyclerView.a0 a0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        a0Var.itemView.animate().setInterpolator(s);
        e(a0Var);
    }
}
