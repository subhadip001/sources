package e.p.c;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import e.i.j.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes.dex */
public abstract class n0 {

    /* compiled from: FragmentTransitionImpl.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f2756f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2757g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2758h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2759i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2760j;

        public a(n0 n0Var, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2756f = i2;
            this.f2757g = arrayList;
            this.f2758h = arrayList2;
            this.f2759i = arrayList3;
            this.f2760j = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i2 = 0; i2 < this.f2756f; i2++) {
                AtomicInteger atomicInteger = e.i.j.z.a;
                z.i.v((View) this.f2757g.get(i2), (String) this.f2758h.get(i2));
                z.i.v((View) this.f2759i.get(i2), (String) this.f2760j.get(i2));
            }
        }
    }

    public static void d(List<View> list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        AtomicInteger atomicInteger = e.i.j.z.a;
        if (z.i.k(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (!h(list, childAt, size) && z.i.k(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean h(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.isTransitionGroup()) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    f(arrayList, viewGroup.getChildAt(i2));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    public abstract Object g(Object obj);

    public void i(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            AtomicInteger atomicInteger = e.i.j.z.a;
            String k2 = z.i.k(view);
            if (k2 != null) {
                map.put(k2, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    i(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    public void j(View view, Rect rect) {
        AtomicInteger atomicInteger = e.i.j.z.a;
        if (z.g.b(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object l(Object obj, Object obj2, Object obj3);

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public ArrayList<String> n(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            AtomicInteger atomicInteger = e.i.j.z.a;
            arrayList2.add(z.i.k(view));
            z.i.v(view, null);
        }
        return arrayList2;
    }

    public abstract void o(Object obj, View view);

    public abstract void p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void q(Object obj, View view, ArrayList<View> arrayList);

    public abstract void r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void s(Object obj, Rect rect);

    public abstract void t(Object obj, View view);

    public void u(Fragment fragment, Object obj, e.i.f.b bVar, Runnable runnable) {
        runnable.run();
    }

    public void v(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            AtomicInteger atomicInteger = e.i.j.z.a;
            String k2 = z.i.k(view2);
            arrayList4.add(k2);
            if (k2 != null) {
                z.i.v(view2, null);
                String str = (String) ((e.f.h) map).getOrDefault(k2, null);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i3))) {
                        z.i.v(arrayList2.get(i3), k2);
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        e.i.j.t.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void w(Object obj, View view, ArrayList<View> arrayList);

    public abstract void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object y(Object obj);
}
