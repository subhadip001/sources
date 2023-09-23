package f.h.b.c.s;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import com.video_converter.video_compressor.R;
import e.i.j.h0.d;
import e.i.j.z;
import e.u.b.a0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: NavigationMenuPresenter.java */
/* loaded from: classes.dex */
public class k implements e.b.g.i.m {
    public int B;
    public int C;
    public int D;

    /* renamed from: f  reason: collision with root package name */
    public NavigationMenuView f5413f;

    /* renamed from: g  reason: collision with root package name */
    public LinearLayout f5414g;

    /* renamed from: h  reason: collision with root package name */
    public e.b.g.i.g f5415h;

    /* renamed from: i  reason: collision with root package name */
    public int f5416i;

    /* renamed from: j  reason: collision with root package name */
    public c f5417j;

    /* renamed from: k  reason: collision with root package name */
    public LayoutInflater f5418k;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f5420m;
    public ColorStateList o;
    public ColorStateList p;
    public Drawable q;
    public RippleDrawable r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    /* renamed from: l  reason: collision with root package name */
    public int f5419l = 0;
    public int n = 0;
    public boolean A = true;
    public int E = -1;
    public final View.OnClickListener F = new a();

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            k.this.h(true);
            e.b.g.i.i itemData = ((NavigationMenuItemView) view).getItemData();
            k kVar = k.this;
            boolean s = kVar.f5415h.s(itemData, kVar, 0);
            if (itemData != null && itemData.isCheckable() && s) {
                k.this.f5417j.o(itemData);
            } else {
                z = false;
            }
            k.this.h(false);
            if (z) {
                k.this.c(false);
            }
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public class c extends RecyclerView.e<l> {
        public final ArrayList<e> a = new ArrayList<>();
        public e.b.g.i.i b;
        public boolean c;

        public c() {
            n();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public int getItemCount() {
            return this.a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public long getItemId(int i2) {
            return i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public int getItemViewType(int i2) {
            e eVar = this.a.get(i2);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        public final void n() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.a.clear();
            this.a.add(new d());
            int i2 = -1;
            int size = k.this.f5415h.l().size();
            boolean z = false;
            int i3 = 0;
            boolean z2 = false;
            int i4 = 0;
            while (i3 < size) {
                e.b.g.i.i iVar = k.this.f5415h.l().get(i3);
                if (iVar.isChecked()) {
                    o(iVar);
                }
                if (iVar.isCheckable()) {
                    iVar.k(z);
                }
                if (iVar.hasSubMenu()) {
                    e.b.g.i.r rVar = iVar.o;
                    if (rVar.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.a.add(new f(k.this.D, z ? 1 : 0));
                        }
                        this.a.add(new g(iVar));
                        int size2 = rVar.size();
                        int i5 = 0;
                        boolean z3 = false;
                        while (i5 < size2) {
                            e.b.g.i.i iVar2 = (e.b.g.i.i) rVar.getItem(i5);
                            if (iVar2.isVisible()) {
                                if (!z3 && iVar2.getIcon() != null) {
                                    z3 = true;
                                }
                                if (iVar2.isCheckable()) {
                                    iVar2.k(z);
                                }
                                if (iVar.isChecked()) {
                                    o(iVar);
                                }
                                this.a.add(new g(iVar2));
                            }
                            i5++;
                            z = false;
                        }
                        if (z3) {
                            int size3 = this.a.size();
                            for (int size4 = this.a.size(); size4 < size3; size4++) {
                                ((g) this.a.get(size4)).b = true;
                            }
                        }
                    }
                } else {
                    int i6 = iVar.b;
                    if (i6 != i2) {
                        i4 = this.a.size();
                        z2 = iVar.getIcon() != null;
                        if (i3 != 0) {
                            i4++;
                            ArrayList<e> arrayList = this.a;
                            int i7 = k.this.D;
                            arrayList.add(new f(i7, i7));
                        }
                    } else if (!z2 && iVar.getIcon() != null) {
                        int size5 = this.a.size();
                        for (int i8 = i4; i8 < size5; i8++) {
                            ((g) this.a.get(i8)).b = true;
                        }
                        z2 = true;
                    }
                    g gVar = new g(iVar);
                    gVar.b = z2;
                    this.a.add(gVar);
                    i2 = i6;
                }
                i3++;
                z = false;
            }
            this.c = false;
        }

        public void o(e.b.g.i.i iVar) {
            if (this.b == iVar || !iVar.isCheckable()) {
                return;
            }
            e.b.g.i.i iVar2 = this.b;
            if (iVar2 != null) {
                iVar2.setChecked(false);
            }
            this.b = iVar;
            iVar.setChecked(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public void onBindViewHolder(l lVar, int i2) {
            l lVar2 = lVar;
            int itemViewType = getItemViewType(i2);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    f fVar = (f) this.a.get(i2);
                    View view = lVar2.itemView;
                    k kVar = k.this;
                    view.setPadding(kVar.w, fVar.a, kVar.x, fVar.b);
                    return;
                }
                TextView textView = (TextView) lVar2.itemView;
                textView.setText(((g) this.a.get(i2)).a.f1665e);
                int i3 = k.this.f5419l;
                if (i3 != 0) {
                    e.i.a.b0(textView, i3);
                }
                int i4 = k.this.y;
                int paddingTop = textView.getPaddingTop();
                Objects.requireNonNull(k.this);
                textView.setPadding(i4, paddingTop, 0, textView.getPaddingBottom());
                ColorStateList colorStateList = k.this.f5420m;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                    return;
                }
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar2.itemView;
            navigationMenuItemView.setIconTintList(k.this.p);
            int i5 = k.this.n;
            if (i5 != 0) {
                navigationMenuItemView.setTextAppearance(i5);
            }
            ColorStateList colorStateList2 = k.this.o;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = k.this.q;
            Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
            AtomicInteger atomicInteger = z.a;
            z.d.q(navigationMenuItemView, newDrawable);
            RippleDrawable rippleDrawable = k.this.r;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.a.get(i2);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.b);
            k kVar2 = k.this;
            int i6 = kVar2.s;
            int i7 = kVar2.t;
            navigationMenuItemView.setPadding(i6, i7, i6, i7);
            navigationMenuItemView.setIconPadding(k.this.u);
            k kVar3 = k.this;
            if (kVar3.z) {
                navigationMenuItemView.setIconSize(kVar3.v);
            }
            navigationMenuItemView.setMaxLines(k.this.B);
            navigationMenuItemView.d(gVar.a, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public l onCreateViewHolder(ViewGroup viewGroup, int i2) {
            l iVar;
            if (i2 == 0) {
                k kVar = k.this;
                iVar = new i(kVar.f5418k, viewGroup, kVar.F);
            } else if (i2 == 1) {
                iVar = new C0126k(k.this.f5418k, viewGroup);
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return null;
                }
                return new b(k.this.f5414g);
            } else {
                iVar = new j(k.this.f5418k, viewGroup);
            }
            return iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public void onViewRecycled(l lVar) {
            l lVar2 = lVar;
            if (lVar2 instanceof i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar2.itemView;
                FrameLayout frameLayout = navigationMenuItemView.E;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.D.setCompoundDrawables(null, null, null, null);
            }
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static class d implements e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public interface e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static class f implements e {
        public final int a;
        public final int b;

        public f(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static class g implements e {
        public final e.b.g.i.i a;
        public boolean b;

        public g(e.b.g.i.i iVar) {
            this.a = iVar;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public class h extends a0 {
        public h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // e.u.b.a0, e.i.j.c
        public void d(View view, e.i.j.h0.d dVar) {
            super.d(view, dVar);
            c cVar = k.this.f5417j;
            int i2 = k.this.f5414g.getChildCount() == 0 ? 0 : 1;
            for (int i3 = 0; i3 < k.this.f5417j.getItemCount(); i3++) {
                if (k.this.f5417j.getItemViewType(i3) == 0) {
                    i2++;
                }
            }
            dVar.m(new d.b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, 0, false)));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: f.h.b.c.s.k$k  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0126k extends l {
        public C0126k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes.dex */
    public static abstract class l extends RecyclerView.a0 {
        public l(View view) {
            super(view);
        }
    }

    public void a(int i2) {
        this.u = i2;
        c(false);
    }

    @Override // e.b.g.i.m
    public void b(e.b.g.i.g gVar, boolean z) {
    }

    @Override // e.b.g.i.m
    public void c(boolean z) {
        c cVar = this.f5417j;
        if (cVar != null) {
            cVar.n();
            cVar.notifyDataSetChanged();
        }
    }

    @Override // e.b.g.i.m
    public boolean d() {
        return false;
    }

    @Override // e.b.g.i.m
    public boolean e(e.b.g.i.g gVar, e.b.g.i.i iVar) {
        return false;
    }

    @Override // e.b.g.i.m
    public boolean f(e.b.g.i.g gVar, e.b.g.i.i iVar) {
        return false;
    }

    @Override // e.b.g.i.m
    public int getId() {
        return this.f5416i;
    }

    public void h(boolean z) {
        c cVar = this.f5417j;
        if (cVar != null) {
            cVar.c = z;
        }
    }

    @Override // e.b.g.i.m
    public void i(Context context, e.b.g.i.g gVar) {
        this.f5418k = LayoutInflater.from(context);
        this.f5415h = gVar;
        this.D = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // e.b.g.i.m
    public void j(Parcelable parcelable) {
        e.b.g.i.i iVar;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        e.b.g.i.i iVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f5413f.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                c cVar = this.f5417j;
                Objects.requireNonNull(cVar);
                int i2 = bundle2.getInt("android:menu:checked", 0);
                if (i2 != 0) {
                    cVar.c = true;
                    int size = cVar.a.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        e eVar = cVar.a.get(i3);
                        if ((eVar instanceof g) && (iVar2 = ((g) eVar).a) != null && iVar2.a == i2) {
                            cVar.o(iVar2);
                            break;
                        }
                        i3++;
                    }
                    cVar.c = false;
                    cVar.n();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = cVar.a.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        e eVar2 = cVar.a.get(i4);
                        if ((eVar2 instanceof g) && (iVar = ((g) eVar2).a) != null && (actionView = iVar.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(iVar.a)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f5414g.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void k() {
        int i2 = (this.f5414g.getChildCount() == 0 && this.A) ? this.C : 0;
        NavigationMenuView navigationMenuView = this.f5413f;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // e.b.g.i.m
    public boolean l(e.b.g.i.r rVar) {
        return false;
    }

    @Override // e.b.g.i.m
    public Parcelable m() {
        Bundle bundle = new Bundle();
        if (this.f5413f != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f5413f.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.f5417j;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
            Bundle bundle2 = new Bundle();
            e.b.g.i.i iVar = cVar.b;
            if (iVar != null) {
                bundle2.putInt("android:menu:checked", iVar.a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = cVar.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = cVar.a.get(i2);
                if (eVar instanceof g) {
                    e.b.g.i.i iVar2 = ((g) eVar).a;
                    View actionView = iVar2 != null ? iVar2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(iVar2.a, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f5414g != null) {
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>();
            this.f5414g.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }
}
