package e.p.c;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public class i0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f2721f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ n0 f2722g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ View f2723h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Fragment f2724i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2725j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2726k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2727l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Object f2728m;

    public i0(Object obj, n0 n0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f2721f = obj;
        this.f2722g = n0Var;
        this.f2723h = view;
        this.f2724i = fragment;
        this.f2725j = arrayList;
        this.f2726k = arrayList2;
        this.f2727l = arrayList3;
        this.f2728m = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f2721f;
        if (obj != null) {
            this.f2722g.o(obj, this.f2723h);
            this.f2726k.addAll(l0.h(this.f2722g, this.f2721f, this.f2724i, this.f2725j, this.f2723h));
        }
        if (this.f2727l != null) {
            if (this.f2728m != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f2723h);
                this.f2722g.p(this.f2728m, this.f2727l, arrayList);
            }
            this.f2727l.clear();
            this.f2727l.add(this.f2723h);
        }
    }
}
