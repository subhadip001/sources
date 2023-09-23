package e.p.c;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.SharedElementCallback;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.f.g;
import e.i.j.z;
import e.p.c.s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public class b extends s0 {

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ List f2678f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ s0.d f2679g;

        public a(List list, s0.d dVar) {
            this.f2678f = list;
            this.f2679g = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2678f.contains(this.f2679g)) {
                this.f2678f.remove(this.f2679g);
                b bVar = b.this;
                s0.d dVar = this.f2679g;
                Objects.requireNonNull(bVar);
                dVar.a.a(dVar.c.mView);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: e.p.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0053b extends c {
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2681d;

        /* renamed from: e  reason: collision with root package name */
        public r f2682e;

        public C0053b(s0.d dVar, e.i.f.b bVar, boolean z) {
            super(dVar, bVar);
            this.f2681d = false;
            this.c = z;
        }

        public r c(Context context) {
            if (this.f2681d) {
                return this.f2682e;
            }
            s0.d dVar = this.a;
            r n = e.p.a.n(context, dVar.c, dVar.a == s0.d.c.VISIBLE, this.c);
            this.f2682e = n;
            this.f2681d = true;
            return n;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class c {
        public final s0.d a;
        public final e.i.f.b b;

        public c(s0.d dVar, e.i.f.b bVar) {
            this.a = dVar;
            this.b = bVar;
        }

        public void a() {
            s0.d dVar = this.a;
            if (dVar.f2787e.remove(this.b) && dVar.f2787e.isEmpty()) {
                dVar.b();
            }
        }

        public boolean b() {
            s0.d.c cVar;
            s0.d.c f2 = s0.d.c.f(this.a.c.mView);
            s0.d.c cVar2 = this.a.a;
            return f2 == cVar2 || !(f2 == (cVar = s0.d.c.VISIBLE) || cVar2 == cVar);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        public final Object c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2683d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f2684e;

        public d(s0.d dVar, e.i.f.b bVar, boolean z, boolean z2) {
            super(dVar, bVar);
            Object exitTransition;
            Object enterTransition;
            boolean allowEnterTransitionOverlap;
            if (dVar.a == s0.d.c.VISIBLE) {
                if (z) {
                    enterTransition = dVar.c.getReenterTransition();
                } else {
                    enterTransition = dVar.c.getEnterTransition();
                }
                this.c = enterTransition;
                if (z) {
                    allowEnterTransitionOverlap = dVar.c.getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = dVar.c.getAllowEnterTransitionOverlap();
                }
                this.f2683d = allowEnterTransitionOverlap;
            } else {
                if (z) {
                    exitTransition = dVar.c.getReturnTransition();
                } else {
                    exitTransition = dVar.c.getExitTransition();
                }
                this.c = exitTransition;
                this.f2683d = true;
            }
            if (!z2) {
                this.f2684e = null;
            } else if (z) {
                this.f2684e = dVar.c.getSharedElementReturnTransition();
            } else {
                this.f2684e = dVar.c.getSharedElementEnterTransition();
            }
        }

        public final n0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            n0 n0Var = l0.b;
            if (obj instanceof Transition) {
                return n0Var;
            }
            n0 n0Var2 = l0.c;
            if (n0Var2 == null || !n0Var2.e(obj)) {
                throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.a.c + " is not a valid framework Transition or AndroidX Transition");
            }
            return n0Var2;
        }
    }

    public b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // e.p.c.s0
    public void b(List<s0.d> list, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap hashMap;
        s0.d.c cVar;
        String str;
        String str2;
        Iterator it;
        s0.d dVar;
        Object obj;
        Object obj2;
        s0.d.c cVar2;
        View view;
        s0.d.c cVar3;
        View view2;
        s0.d dVar2;
        ArrayList<View> arrayList3;
        s0.d.c cVar4;
        s0.d dVar3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        HashMap hashMap2;
        View view3;
        String str3;
        ArrayList<View> arrayList6;
        Rect rect;
        e.f.a aVar;
        n0 n0Var;
        s0.d dVar4;
        SharedElementCallback enterTransitionCallback;
        SharedElementCallback exitTransitionCallback;
        ArrayList<String> arrayList7;
        int i2;
        View view4;
        String i3;
        ArrayList<String> arrayList8;
        boolean z2 = z;
        s0.d.c cVar5 = s0.d.c.GONE;
        s0.d.c cVar6 = s0.d.c.VISIBLE;
        s0.d dVar5 = null;
        s0.d dVar6 = null;
        for (s0.d dVar7 : list) {
            s0.d.c f2 = s0.d.c.f(dVar7.c.mView);
            int ordinal = dVar7.a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                    }
                } else if (f2 != cVar6) {
                    dVar6 = dVar7;
                }
            }
            if (f2 == cVar6 && dVar5 == null) {
                dVar5 = dVar7;
            }
        }
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList(list);
        Iterator<s0.d> it2 = list.iterator();
        while (it2.hasNext()) {
            s0.d next = it2.next();
            e.i.f.b bVar = new e.i.f.b();
            next.d();
            next.f2787e.add(bVar);
            arrayList9.add(new C0053b(next, bVar, z2));
            e.i.f.b bVar2 = new e.i.f.b();
            next.d();
            next.f2787e.add(bVar2);
            arrayList10.add(new d(next, bVar2, z2, !z2 ? next != dVar6 : next != dVar5));
            next.f2786d.add(new a(arrayList11, next));
        }
        HashMap hashMap3 = new HashMap();
        Iterator it3 = arrayList10.iterator();
        n0 n0Var2 = null;
        while (it3.hasNext()) {
            d dVar8 = (d) it3.next();
            if (!dVar8.b()) {
                n0 c2 = dVar8.c(dVar8.c);
                n0 c3 = dVar8.c(dVar8.f2684e);
                if (c2 != null && c3 != null && c2 != c3) {
                    StringBuilder A = f.a.b.a.a.A("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    A.append(dVar8.a.c);
                    A.append(" returned Transition ");
                    A.append(dVar8.c);
                    A.append(" which uses a different Transition  type than its shared element transition ");
                    A.append(dVar8.f2684e);
                    throw new IllegalArgumentException(A.toString());
                }
                if (c2 == null) {
                    c2 = c3;
                }
                if (n0Var2 == null) {
                    n0Var2 = c2;
                } else if (c2 != null && n0Var2 != c2) {
                    StringBuilder A2 = f.a.b.a.a.A("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    A2.append(dVar8.a.c);
                    A2.append(" returned Transition ");
                    A2.append(dVar8.c);
                    A2.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(A2.toString());
                }
            }
        }
        if (n0Var2 == null) {
            Iterator it4 = arrayList10.iterator();
            while (it4.hasNext()) {
                d dVar9 = (d) it4.next();
                hashMap3.put(dVar9.a, Boolean.FALSE);
                dVar9.a();
            }
            cVar = cVar5;
            arrayList = arrayList9;
            arrayList2 = arrayList11;
            hashMap = hashMap3;
            str = "FragmentManager";
        } else {
            View view5 = new View(this.a.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList12 = new ArrayList<>();
            ArrayList<View> arrayList13 = new ArrayList<>();
            arrayList = arrayList9;
            e.f.a aVar2 = new e.f.a();
            Iterator it5 = arrayList10.iterator();
            Rect rect3 = rect2;
            Object obj3 = null;
            View view6 = null;
            boolean z3 = false;
            View view7 = view5;
            String str4 = "FragmentManager";
            s0.d dVar10 = dVar5;
            s0.d dVar11 = dVar6;
            while (it5.hasNext()) {
                s0.d.c cVar7 = cVar6;
                Object obj4 = ((d) it5.next()).f2684e;
                if (!(obj4 != null) || dVar10 == null || dVar11 == null) {
                    arrayList3 = arrayList13;
                    cVar4 = cVar5;
                    dVar3 = dVar6;
                    arrayList4 = arrayList10;
                    arrayList5 = arrayList11;
                    hashMap2 = hashMap3;
                    view3 = view7;
                    str3 = str4;
                    arrayList6 = arrayList12;
                    e.f.a aVar3 = aVar2;
                    rect = rect3;
                    aVar = aVar3;
                    s0.d dVar12 = dVar5;
                    n0Var = n0Var2;
                    dVar4 = dVar12;
                } else {
                    Object y = n0Var2.y(n0Var2.g(obj4));
                    ArrayList<String> sharedElementSourceNames = dVar11.c.getSharedElementSourceNames();
                    n0 n0Var3 = n0Var2;
                    ArrayList<String> sharedElementSourceNames2 = dVar10.c.getSharedElementSourceNames();
                    arrayList5 = arrayList11;
                    ArrayList<String> sharedElementTargetNames = dVar10.c.getSharedElementTargetNames();
                    cVar4 = cVar5;
                    arrayList4 = arrayList10;
                    int i4 = 0;
                    while (i4 < sharedElementTargetNames.size()) {
                        int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i4));
                        ArrayList<String> arrayList14 = sharedElementTargetNames;
                        if (indexOf != -1) {
                            sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i4));
                        }
                        i4++;
                        sharedElementTargetNames = arrayList14;
                    }
                    ArrayList<String> sharedElementTargetNames2 = dVar11.c.getSharedElementTargetNames();
                    if (!z2) {
                        enterTransitionCallback = dVar10.c.getExitTransitionCallback();
                        exitTransitionCallback = dVar11.c.getEnterTransitionCallback();
                    } else {
                        enterTransitionCallback = dVar10.c.getEnterTransitionCallback();
                        exitTransitionCallback = dVar11.c.getExitTransitionCallback();
                    }
                    int size = sharedElementSourceNames.size();
                    HashMap hashMap4 = hashMap3;
                    int i5 = 0;
                    while (i5 < size) {
                        aVar2.put(sharedElementSourceNames.get(i5), sharedElementTargetNames2.get(i5));
                        i5++;
                        size = size;
                        y = y;
                    }
                    Object obj5 = y;
                    e.f.a<String, View> aVar4 = new e.f.a<>();
                    k(aVar4, dVar10.c.mView);
                    e.f.g.k(aVar4, sharedElementSourceNames);
                    if (enterTransitionCallback != null) {
                        enterTransitionCallback.onMapSharedElements(sharedElementSourceNames, aVar4);
                        int size2 = sharedElementSourceNames.size() - 1;
                        while (size2 >= 0) {
                            String str5 = sharedElementSourceNames.get(size2);
                            View view8 = aVar4.get(str5);
                            if (view8 == null) {
                                aVar2.remove(str5);
                                arrayList8 = sharedElementSourceNames;
                            } else {
                                AtomicInteger atomicInteger = e.i.j.z.a;
                                arrayList8 = sharedElementSourceNames;
                                if (!str5.equals(z.i.k(view8))) {
                                    aVar2.put(z.i.k(view8), (String) aVar2.remove(str5));
                                }
                            }
                            size2--;
                            sharedElementSourceNames = arrayList8;
                        }
                        arrayList7 = sharedElementSourceNames;
                    } else {
                        arrayList7 = sharedElementSourceNames;
                        e.f.g.k(aVar2, aVar4.keySet());
                    }
                    e.f.a<String, View> aVar5 = new e.f.a<>();
                    k(aVar5, dVar11.c.mView);
                    e.f.g.k(aVar5, sharedElementTargetNames2);
                    e.f.g.k(aVar5, aVar2.values());
                    if (exitTransitionCallback != null) {
                        exitTransitionCallback.onMapSharedElements(sharedElementTargetNames2, aVar5);
                        for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                            String str6 = sharedElementTargetNames2.get(size3);
                            View view9 = aVar5.get(str6);
                            if (view9 == null) {
                                String i6 = l0.i(aVar2, str6);
                                if (i6 != null) {
                                    aVar2.remove(i6);
                                }
                            } else {
                                AtomicInteger atomicInteger2 = e.i.j.z.a;
                                if (!str6.equals(z.i.k(view9)) && (i3 = l0.i(aVar2, str6)) != null) {
                                    aVar2.put(i3, z.i.k(view9));
                                }
                            }
                        }
                    } else {
                        l0.o(aVar2, aVar5);
                    }
                    l(aVar4, aVar2.keySet());
                    l(aVar5, aVar2.values());
                    if (aVar2.isEmpty()) {
                        arrayList12.clear();
                        arrayList13.clear();
                        obj3 = null;
                        arrayList3 = arrayList13;
                        dVar4 = dVar5;
                        dVar3 = dVar6;
                        view3 = view7;
                        str3 = str4;
                        n0Var = n0Var3;
                        hashMap2 = hashMap4;
                        arrayList6 = arrayList12;
                        e.f.a aVar6 = aVar2;
                        rect = rect3;
                        aVar = aVar6;
                    } else {
                        l0.c(dVar11.c, dVar10.c, z2, aVar4, true);
                        Rect rect4 = rect3;
                        s0.d dVar13 = dVar6;
                        aVar = aVar2;
                        View view10 = view7;
                        rect = rect4;
                        s0.d dVar14 = dVar5;
                        s0.d dVar15 = dVar6;
                        str3 = str4;
                        arrayList6 = arrayList12;
                        s0.d dVar16 = dVar5;
                        n0Var = n0Var3;
                        arrayList3 = arrayList13;
                        e.i.j.t.a(this.a, new g(this, dVar13, dVar14, z, aVar5));
                        arrayList6.addAll(aVar4.values());
                        if (arrayList7.isEmpty()) {
                            obj3 = obj5;
                            i2 = 0;
                        } else {
                            i2 = 0;
                            View view11 = aVar4.get(arrayList7.get(0));
                            obj3 = obj5;
                            n0Var.t(obj3, view11);
                            view6 = view11;
                        }
                        arrayList3.addAll(aVar5.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view4 = aVar5.get(sharedElementTargetNames2.get(i2))) != null) {
                            e.i.j.t.a(this.a, new h(this, n0Var, view4, rect));
                            z3 = true;
                        }
                        view3 = view10;
                        n0Var.w(obj3, view3, arrayList6);
                        n0Var.r(obj3, null, null, null, null, obj3, arrayList3);
                        Boolean bool = Boolean.TRUE;
                        hashMap2 = hashMap4;
                        dVar4 = dVar16;
                        hashMap2.put(dVar4, bool);
                        dVar3 = dVar15;
                        hashMap2.put(dVar3, bool);
                        dVar10 = dVar4;
                        dVar11 = dVar3;
                    }
                }
                view7 = view3;
                arrayList13 = arrayList3;
                hashMap3 = hashMap2;
                arrayList12 = arrayList6;
                arrayList11 = arrayList5;
                cVar5 = cVar4;
                arrayList10 = arrayList4;
                str4 = str3;
                z2 = z;
                dVar6 = dVar3;
                cVar6 = cVar7;
                Rect rect5 = rect;
                aVar2 = aVar;
                rect3 = rect5;
                n0 n0Var4 = n0Var;
                dVar5 = dVar4;
                n0Var2 = n0Var4;
            }
            ArrayList<View> arrayList15 = arrayList13;
            n0 n0Var5 = n0Var2;
            s0.d.c cVar8 = cVar5;
            s0.d.c cVar9 = cVar6;
            s0.d dVar17 = dVar6;
            ArrayList arrayList16 = arrayList10;
            arrayList2 = arrayList11;
            hashMap = hashMap3;
            View view12 = view7;
            String str7 = str4;
            ArrayList<View> arrayList17 = arrayList12;
            e.f.a aVar7 = aVar2;
            Rect rect6 = rect3;
            ArrayList arrayList18 = new ArrayList();
            Iterator it6 = arrayList16.iterator();
            Object obj6 = null;
            Object obj7 = null;
            while (it6.hasNext()) {
                d dVar18 = (d) it6.next();
                if (dVar18.b()) {
                    it = it6;
                    dVar = dVar17;
                    hashMap.put(dVar18.a, Boolean.FALSE);
                    dVar18.a();
                    view = view12;
                    obj = obj3;
                    dVar2 = dVar11;
                    obj2 = obj6;
                    view2 = view6;
                    cVar3 = cVar9;
                    cVar2 = cVar8;
                } else {
                    it = it6;
                    dVar = dVar17;
                    Object g2 = n0Var5.g(dVar18.c);
                    s0.d dVar19 = dVar18.a;
                    boolean z4 = obj3 != null && (dVar19 == dVar10 || dVar19 == dVar11);
                    if (g2 == null) {
                        if (!z4) {
                            hashMap.put(dVar19, Boolean.FALSE);
                            dVar18.a();
                        }
                        view = view12;
                        obj = obj3;
                        obj2 = obj6;
                        view2 = view6;
                        cVar3 = cVar9;
                        cVar2 = cVar8;
                    } else {
                        obj = obj3;
                        ArrayList<View> arrayList19 = new ArrayList<>();
                        obj2 = obj6;
                        j(arrayList19, dVar19.c.mView);
                        if (z4) {
                            if (dVar19 == dVar10) {
                                arrayList19.removeAll(arrayList17);
                            } else {
                                arrayList19.removeAll(arrayList15);
                            }
                        }
                        if (arrayList19.isEmpty()) {
                            n0Var5.a(g2, view12);
                            view = view12;
                            cVar2 = cVar8;
                        } else {
                            n0Var5.b(g2, arrayList19);
                            n0Var5.r(g2, g2, arrayList19, null, null, null, null);
                            cVar2 = cVar8;
                            if (dVar19.a == cVar2) {
                                arrayList2.remove(dVar19);
                                view = view12;
                                ArrayList arrayList20 = new ArrayList(arrayList19);
                                arrayList20.remove(dVar19.c.mView);
                                n0Var5.q(g2, dVar19.c.mView, arrayList20);
                                e.i.j.t.a(this.a, new i(this, arrayList19));
                            } else {
                                view = view12;
                            }
                        }
                        cVar3 = cVar9;
                        if (dVar19.a == cVar3) {
                            arrayList18.addAll(arrayList19);
                            if (z3) {
                                n0Var5.s(g2, rect6);
                            }
                            view2 = view6;
                        } else {
                            view2 = view6;
                            n0Var5.t(g2, view2);
                        }
                        hashMap.put(dVar19, Boolean.TRUE);
                        if (dVar18.f2683d) {
                            obj7 = n0Var5.m(obj7, g2, null);
                        } else {
                            obj2 = n0Var5.m(obj2, g2, null);
                        }
                    }
                    dVar2 = dVar;
                }
                it6 = it;
                view6 = view2;
                cVar9 = cVar3;
                cVar8 = cVar2;
                view12 = view;
                obj6 = obj2;
                dVar17 = dVar;
                dVar11 = dVar2;
                obj3 = obj;
            }
            s0.d dVar20 = dVar17;
            Object obj8 = obj6;
            cVar = cVar8;
            Object l2 = n0Var5.l(obj7, obj8, obj3);
            Iterator it7 = arrayList16.iterator();
            while (it7.hasNext()) {
                d dVar21 = (d) it7.next();
                if (!dVar21.b()) {
                    Object obj9 = dVar21.c;
                    s0.d dVar22 = dVar21.a;
                    s0.d dVar23 = dVar20;
                    boolean z5 = obj3 != null && (dVar22 == dVar10 || dVar22 == dVar23);
                    if (obj9 != null || z5) {
                        ViewGroup viewGroup = this.a;
                        AtomicInteger atomicInteger3 = e.i.j.z.a;
                        if (!z.g.c(viewGroup)) {
                            if (FragmentManager.P(2)) {
                                StringBuilder A3 = f.a.b.a.a.A("SpecialEffectsController: Container ");
                                A3.append(this.a);
                                A3.append(" has not been laid out. Completing operation ");
                                A3.append(dVar22);
                                str2 = str7;
                                Log.v(str2, A3.toString());
                            } else {
                                str2 = str7;
                            }
                            dVar21.a();
                        } else {
                            n0Var5.u(dVar21.a.c, l2, dVar21.b, new j(this, dVar21));
                            dVar20 = dVar23;
                            dVar10 = dVar10;
                        }
                    } else {
                        str2 = str7;
                    }
                    str7 = str2;
                    dVar20 = dVar23;
                }
            }
            str = str7;
            ViewGroup viewGroup2 = this.a;
            AtomicInteger atomicInteger4 = e.i.j.z.a;
            if (z.g.c(viewGroup2)) {
                l0.q(arrayList18, 4);
                ArrayList<String> n = n0Var5.n(arrayList15);
                n0Var5.c(this.a, l2);
                n0Var5.v(this.a, arrayList17, arrayList15, n, aVar7);
                l0.q(arrayList18, 0);
                n0Var5.x(obj3, arrayList17, arrayList15);
            }
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup3 = this.a;
        Context context = viewGroup3.getContext();
        ArrayList arrayList21 = new ArrayList();
        Iterator it8 = arrayList.iterator();
        boolean z6 = false;
        while (it8.hasNext()) {
            C0053b c0053b = (C0053b) it8.next();
            if (c0053b.b()) {
                c0053b.a();
            } else {
                r c4 = c0053b.c(context);
                if (c4 == null) {
                    c0053b.a();
                } else {
                    Animator animator = c4.b;
                    if (animator == null) {
                        arrayList21.add(c0053b);
                    } else {
                        s0.d dVar24 = c0053b.a;
                        Fragment fragment = dVar24.c;
                        if (Boolean.TRUE.equals(hashMap.get(dVar24))) {
                            if (FragmentManager.P(2)) {
                                Log.v(str, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                            }
                            c0053b.a();
                        } else {
                            boolean z7 = dVar24.a == cVar;
                            ArrayList arrayList22 = arrayList2;
                            if (z7) {
                                arrayList22.remove(dVar24);
                            }
                            View view13 = fragment.mView;
                            viewGroup3.startViewTransition(view13);
                            animator.addListener(new e.p.c.c(this, viewGroup3, view13, z7, dVar24, c0053b));
                            animator.setTarget(view13);
                            animator.start();
                            c0053b.b.b(new e.p.c.d(this, animator));
                            z6 = true;
                            arrayList2 = arrayList22;
                            cVar = cVar;
                            hashMap = hashMap;
                        }
                    }
                }
            }
        }
        ArrayList arrayList23 = arrayList2;
        Iterator it9 = arrayList21.iterator();
        while (it9.hasNext()) {
            C0053b c0053b2 = (C0053b) it9.next();
            s0.d dVar25 = c0053b2.a;
            Fragment fragment2 = dVar25.c;
            if (containsValue) {
                if (FragmentManager.P(2)) {
                    Log.v(str, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                c0053b2.a();
            } else if (z6) {
                if (FragmentManager.P(2)) {
                    Log.v(str, "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                c0053b2.a();
            } else {
                View view14 = fragment2.mView;
                r c5 = c0053b2.c(context);
                Objects.requireNonNull(c5);
                Animation animation = c5.a;
                Objects.requireNonNull(animation);
                if (dVar25.a != s0.d.c.REMOVED) {
                    view14.startAnimation(animation);
                    c0053b2.a();
                } else {
                    viewGroup3.startViewTransition(view14);
                    s sVar = new s(animation, viewGroup3, view14);
                    sVar.setAnimationListener(new e(this, viewGroup3, view14, c0053b2));
                    view14.startAnimation(sVar);
                }
                c0053b2.b.b(new f(this, view14, viewGroup3, c0053b2));
            }
        }
        Iterator it10 = arrayList23.iterator();
        while (it10.hasNext()) {
            s0.d dVar26 = (s0.d) it10.next();
            dVar26.a.a(dVar26.c.mView);
        }
        arrayList23.clear();
    }

    public void j(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    j(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void k(Map<String, View> map, View view) {
        AtomicInteger atomicInteger = e.i.j.z.a;
        String k2 = z.i.k(view);
        if (k2 != null) {
            map.put(k2, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    public void l(e.f.a<String, View> aVar, Collection<String> collection) {
        Iterator it = ((g.b) aVar.entrySet()).iterator();
        while (true) {
            g.d dVar = (g.d) it;
            if (!dVar.hasNext()) {
                return;
            }
            dVar.next();
            AtomicInteger atomicInteger = e.i.j.z.a;
            if (!collection.contains(z.i.k((View) dVar.getValue()))) {
                dVar.remove();
            }
        }
    }
}
