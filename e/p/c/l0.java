package e.p.c;

import android.view.View;
import androidx.core.app.SharedElementCallback;
import androidx.fragment.app.Fragment;
import e.i.j.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public class l0 {
    public static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final n0 b = new m0();
    public static final n0 c;

    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public static class b {
        public Fragment a;
        public boolean b;
        public e.p.c.a c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f2748d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2749e;

        /* renamed from: f  reason: collision with root package name */
        public e.p.c.a f2750f;
    }

    static {
        n0 n0Var;
        try {
            n0Var = (n0) Class.forName("e.a0.d").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            n0Var = null;
        }
        c = n0Var;
    }

    public static void a(ArrayList<View> arrayList, e.f.a<String, View> aVar, Collection<String> collection) {
        for (int i2 = aVar.f2001h - 1; i2 >= 0; i2--) {
            View l2 = aVar.l(i2);
            AtomicInteger atomicInteger = e.i.j.z.a;
            if (collection.contains(z.i.k(l2))) {
                arrayList.add(l2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
        if (r0.mAdded != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0076, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0087, code lost:
        if (r0.mHidden == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0089, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e5 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(e.p.c.a r8, e.p.c.e0.a r9, android.util.SparseArray<e.p.c.l0.b> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.p.c.l0.b(e.p.c.a, e.p.c.e0$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(Fragment fragment, Fragment fragment2, boolean z, e.f.a<String, View> aVar, boolean z2) {
        SharedElementCallback enterTransitionCallback;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i2 = aVar == null ? 0 : aVar.f2001h;
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList2.add(aVar.h(i3));
                arrayList.add(aVar.l(i3));
            }
            if (z2) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    public static boolean d(n0 n0Var, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!n0Var.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static e.f.a<String, View> e(n0 n0Var, e.f.a<String, String> aVar, Object obj, b bVar) {
        SharedElementCallback enterTransitionCallback;
        ArrayList<String> arrayList;
        String i2;
        Fragment fragment = bVar.a;
        View view = fragment.getView();
        if (!aVar.isEmpty() && obj != null && view != null) {
            e.f.a<String, View> aVar2 = new e.f.a<>();
            n0Var.i(aVar2, view);
            e.p.c.a aVar3 = bVar.c;
            if (bVar.b) {
                enterTransitionCallback = fragment.getExitTransitionCallback();
                arrayList = aVar3.n;
            } else {
                enterTransitionCallback = fragment.getEnterTransitionCallback();
                arrayList = aVar3.o;
            }
            if (arrayList != null) {
                e.f.g.k(aVar2, arrayList);
                e.f.g.k(aVar2, aVar.values());
            }
            if (enterTransitionCallback != null) {
                enterTransitionCallback.onMapSharedElements(arrayList, aVar2);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    String str = arrayList.get(size);
                    View view2 = aVar2.get(str);
                    if (view2 == null) {
                        String i3 = i(aVar, str);
                        if (i3 != null) {
                            aVar.remove(i3);
                        }
                    } else {
                        AtomicInteger atomicInteger = e.i.j.z.a;
                        if (!str.equals(z.i.k(view2)) && (i2 = i(aVar, str)) != null) {
                            aVar.put(i2, z.i.k(view2));
                        }
                    }
                }
            } else {
                o(aVar, aVar2);
            }
            return aVar2;
        }
        aVar.clear();
        return null;
    }

    public static e.f.a<String, View> f(n0 n0Var, e.f.a<String, String> aVar, Object obj, b bVar) {
        SharedElementCallback exitTransitionCallback;
        ArrayList<String> arrayList;
        if (!aVar.isEmpty() && obj != null) {
            Fragment fragment = bVar.f2748d;
            e.f.a<String, View> aVar2 = new e.f.a<>();
            n0Var.i(aVar2, fragment.requireView());
            e.p.c.a aVar3 = bVar.f2750f;
            if (bVar.f2749e) {
                exitTransitionCallback = fragment.getEnterTransitionCallback();
                arrayList = aVar3.o;
            } else {
                exitTransitionCallback = fragment.getExitTransitionCallback();
                arrayList = aVar3.n;
            }
            if (arrayList != null) {
                e.f.g.k(aVar2, arrayList);
            }
            if (exitTransitionCallback != null) {
                exitTransitionCallback.onMapSharedElements(arrayList, aVar2);
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    String str = arrayList.get(size);
                    View view = aVar2.get(str);
                    if (view == null) {
                        aVar.remove(str);
                    } else {
                        AtomicInteger atomicInteger = e.i.j.z.a;
                        if (!str.equals(z.i.k(view))) {
                            aVar.put(z.i.k(view), aVar.remove(str));
                        }
                    }
                }
            } else {
                e.f.g.k(aVar, aVar2.keySet());
            }
            return aVar2;
        }
        aVar.clear();
        return null;
    }

    public static n0 g(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        n0 n0Var = b;
        if (d(n0Var, arrayList)) {
            return n0Var;
        }
        n0 n0Var2 = c;
        if (n0Var2 == null || !d(n0Var2, arrayList)) {
            throw new IllegalArgumentException("Invalid Transition types");
        }
        return n0Var2;
    }

    public static ArrayList<View> h(n0 n0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View view2 = fragment.getView();
            if (view2 != null) {
                n0Var.f(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            n0Var.b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    public static String i(e.f.a<String, String> aVar, String str) {
        int i2 = aVar.f2001h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (str.equals(aVar.l(i3))) {
                return aVar.h(i3);
            }
        }
        return null;
    }

    public static Object j(n0 n0Var, Fragment fragment, boolean z) {
        Object enterTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            enterTransition = fragment.getReenterTransition();
        } else {
            enterTransition = fragment.getEnterTransition();
        }
        return n0Var.g(enterTransition);
    }

    public static Object k(n0 n0Var, Fragment fragment, boolean z) {
        Object exitTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            exitTransition = fragment.getReturnTransition();
        } else {
            exitTransition = fragment.getExitTransition();
        }
        return n0Var.g(exitTransition);
    }

    public static View l(e.f.a<String, View> aVar, b bVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        e.p.c.a aVar2 = bVar.c;
        if (obj == null || aVar == null || (arrayList = aVar2.n) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar2.n.get(0);
        } else {
            str = aVar2.o.get(0);
        }
        return aVar.get(str);
    }

    public static Object m(n0 n0Var, Fragment fragment, Fragment fragment2, boolean z) {
        Object sharedElementEnterTransition;
        if (z) {
            sharedElementEnterTransition = fragment2.getSharedElementReturnTransition();
        } else {
            sharedElementEnterTransition = fragment.getSharedElementEnterTransition();
        }
        return n0Var.y(n0Var.g(sharedElementEnterTransition));
    }

    public static Object n(n0 n0Var, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else if (z) {
            z2 = fragment.getAllowReturnTransitionOverlap();
        } else {
            z2 = fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return n0Var.m(obj2, obj, obj3);
        }
        return n0Var.l(obj2, obj, obj3);
    }

    public static void o(e.f.a<String, String> aVar, e.f.a<String, View> aVar2) {
        int i2 = aVar.f2001h;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            if (!aVar2.containsKey(aVar.l(i2))) {
                aVar.j(i2);
            }
        }
    }

    public static void p(n0 n0Var, Object obj, Object obj2, e.f.a<String, View> aVar, boolean z, e.p.c.a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z) {
            str = aVar2.o.get(0);
        } else {
            str = aVar2.n.get(0);
        }
        View view = aVar.get(str);
        n0Var.t(obj, view);
        if (obj2 != null) {
            n0Var.t(obj2, view);
        }
    }

    public static void q(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0428 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void r(android.content.Context r39, e.p.c.t r40, java.util.ArrayList<e.p.c.a> r41, java.util.ArrayList<java.lang.Boolean> r42, int r43, int r44, boolean r45, e.p.c.l0.a r46) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.p.c.l0.r(android.content.Context, e.p.c.t, java.util.ArrayList, java.util.ArrayList, int, int, boolean, e.p.c.l0$a):void");
    }
}
