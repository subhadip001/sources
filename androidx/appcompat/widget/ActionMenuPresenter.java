package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.video_converter.video_compressor.R;
import e.b.g.i.g;
import e.b.g.i.i;
import e.b.g.i.k;
import e.b.g.i.l;
import e.b.g.i.m;
import e.b.g.i.n;
import e.b.g.i.p;
import e.b.g.i.r;
import e.b.h.h0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ActionMenuPresenter extends e.b.g.i.b {
    public a A;
    public c B;
    public b C;
    public final f D;
    public int E;
    public d o;
    public Drawable p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public final SparseBooleanArray y;
    public e z;

    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public int f140f;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f140f);
        }

        public SavedState(Parcel parcel) {
            this.f140f = parcel.readInt();
        }
    }

    /* loaded from: classes.dex */
    public class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!rVar.A.g()) {
                View view2 = ActionMenuPresenter.this.o;
                this.f1681f = view2 == null ? (View) ActionMenuPresenter.this.f1622m : view2;
            }
            d(ActionMenuPresenter.this.D);
        }

        @Override // e.b.g.i.l
        public void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.A = null;
            actionMenuPresenter.E = 0;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public e f142f;

        public c(e eVar) {
            this.f142f = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.a aVar;
            g gVar = ActionMenuPresenter.this.f1617h;
            if (gVar != null && (aVar = gVar.f1652e) != null) {
                aVar.b(gVar);
            }
            View view = (View) ActionMenuPresenter.this.f1622m;
            if (view != null && view.getWindowToken() != null && this.f142f.f()) {
                ActionMenuPresenter.this.z = this.f142f;
            }
            ActionMenuPresenter.this.B = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* loaded from: classes.dex */
        public class a extends h0 {
            public a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
            }

            @Override // e.b.h.h0
            public p b() {
                e eVar = ActionMenuPresenter.this.z;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // e.b.h.h0
            public boolean c() {
                ActionMenuPresenter.this.p();
                return true;
            }

            @Override // e.b.h.h0
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.B != null) {
                    return false;
                }
                actionMenuPresenter.k();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            e.b.a.d(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.p();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends l {
        public e(Context context, g gVar, View view, boolean z) {
            super(context, gVar, view, z, R.attr.actionOverflowMenuStyle, 0);
            this.f1682g = 8388613;
            d(ActionMenuPresenter.this.D);
        }

        @Override // e.b.g.i.l
        public void c() {
            g gVar = ActionMenuPresenter.this.f1617h;
            if (gVar != null) {
                gVar.c(true);
            }
            ActionMenuPresenter.this.z = null;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class f implements m.a {
        public f() {
        }

        @Override // e.b.g.i.m.a
        public void b(g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.k().c(false);
            }
            m.a aVar = ActionMenuPresenter.this.f1619j;
            if (aVar != null) {
                aVar.b(gVar, z);
            }
        }

        @Override // e.b.g.i.m.a
        public boolean c(g gVar) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (gVar == actionMenuPresenter.f1617h) {
                return false;
            }
            actionMenuPresenter.E = ((r) gVar).A.a;
            m.a aVar = actionMenuPresenter.f1619j;
            if (aVar != null) {
                return aVar.c(gVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.y = new SparseBooleanArray();
        this.D = new f();
    }

    public boolean a() {
        return k() | n();
    }

    @Override // e.b.g.i.m
    public void b(g gVar, boolean z) {
        a();
        m.a aVar = this.f1619j;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // e.b.g.i.m
    public void c(boolean z) {
        int i2;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.f1622m;
        ArrayList<i> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            g gVar = this.f1617h;
            if (gVar != null) {
                gVar.i();
                ArrayList<i> l2 = this.f1617h.l();
                int size = l2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar = l2.get(i3);
                    if (iVar.g()) {
                        View childAt = viewGroup.getChildAt(i2);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View h2 = h(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            h2.setPressed(false);
                            h2.jumpDrawablesToCurrentState();
                        }
                        if (h2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) h2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(h2);
                            }
                            ((ViewGroup) this.f1622m).addView(h2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.o) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i2);
                    z2 = true;
                }
                if (!z2) {
                    i2++;
                }
            }
        }
        ((View) this.f1622m).requestLayout();
        g gVar2 = this.f1617h;
        if (gVar2 != null) {
            gVar2.i();
            ArrayList<i> arrayList2 = gVar2.f1656i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                e.i.j.d dVar = arrayList2.get(i4).A;
            }
        }
        g gVar3 = this.f1617h;
        if (gVar3 != null) {
            gVar3.i();
            arrayList = gVar3.f1657j;
        }
        if (this.r && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.o == null) {
                this.o = new d(this.f1615f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.o.getParent();
            if (viewGroup3 != this.f1622m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.o);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1622m;
                d dVar2 = this.o;
                ActionMenuView.c h3 = actionMenuView.h();
                h3.a = true;
                actionMenuView.addView(dVar2, h3);
            }
        } else {
            d dVar3 = this.o;
            if (dVar3 != null) {
                ViewParent parent = dVar3.getParent();
                n nVar = this.f1622m;
                if (parent == nVar) {
                    ((ViewGroup) nVar).removeView(this.o);
                }
            }
        }
        ((ActionMenuView) this.f1622m).setOverflowReserved(this.r);
    }

    @Override // e.b.g.i.m
    public boolean d() {
        ArrayList<i> arrayList;
        int i2;
        int i3;
        boolean z;
        g gVar = this.f1617h;
        if (gVar != null) {
            arrayList = gVar.l();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i4 = this.v;
        int i5 = this.u;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f1622m;
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z = true;
            if (i6 >= i2) {
                break;
            }
            i iVar = arrayList.get(i6);
            int i9 = iVar.y;
            if ((i9 & 2) == 2) {
                i8++;
            } else if ((i9 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (this.w && iVar.C) {
                i4 = 0;
            }
            i6++;
        }
        if (this.r && (z2 || i7 + i8 > i4)) {
            i4--;
        }
        int i10 = i4 - i8;
        SparseBooleanArray sparseBooleanArray = this.y;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            i iVar2 = arrayList.get(i11);
            int i13 = iVar2.y;
            if ((i13 & 2) == i3) {
                View h2 = h(iVar2, null, viewGroup);
                h2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = h2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int i14 = iVar2.b;
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z);
                }
                iVar2.l(z);
            } else if ((i13 & 1) == z) {
                int i15 = iVar2.b;
                boolean z3 = sparseBooleanArray.get(i15);
                boolean z4 = (i10 > 0 || z3) && i5 > 0;
                if (z4) {
                    View h3 = h(iVar2, null, viewGroup);
                    h3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = h3.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z4 &= i5 + i12 > 0;
                }
                if (z4 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z3) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i11; i16++) {
                        i iVar3 = arrayList.get(i16);
                        if (iVar3.b == i15) {
                            if (iVar3.g()) {
                                i10++;
                            }
                            iVar3.l(false);
                        }
                    }
                }
                if (z4) {
                    i10--;
                }
                iVar2.l(z4);
            } else {
                iVar2.l(false);
                i11++;
                i3 = 2;
                z = true;
            }
            i11++;
            i3 = 2;
            z = true;
        }
        return true;
    }

    public View h(i iVar, View view, ViewGroup viewGroup) {
        n.a aVar;
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.f()) {
            if (view instanceof n.a) {
                aVar = (n.a) view;
            } else {
                aVar = (n.a) this.f1618i.inflate(this.f1621l, viewGroup, false);
            }
            aVar.d(iVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f1622m);
            if (this.C == null) {
                this.C = new b();
            }
            actionMenuItemView.setPopupCallback(this.C);
            actionView = (View) aVar;
        }
        actionView.setVisibility(iVar.C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // e.b.g.i.m
    public void i(Context context, g gVar) {
        this.f1616g = context;
        LayoutInflater.from(context);
        this.f1617h = gVar;
        Resources resources = context.getResources();
        if (!this.s) {
            this.r = true;
        }
        int i2 = 2;
        this.t = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.v = i2;
        int i5 = this.t;
        if (this.r) {
            if (this.o == null) {
                d dVar = new d(this.f1615f);
                this.o = dVar;
                if (this.q) {
                    dVar.setImageDrawable(this.p);
                    this.p = null;
                    this.q = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.o.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.o.getMeasuredWidth();
        } else {
            this.o = null;
        }
        this.u = i5;
        this.x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // e.b.g.i.m
    public void j(Parcelable parcelable) {
        int i2;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i2 = ((SavedState) parcelable).f140f) > 0 && (findItem = this.f1617h.findItem(i2)) != null) {
            l((r) findItem.getSubMenu());
        }
    }

    public boolean k() {
        n nVar;
        c cVar = this.B;
        if (cVar != null && (nVar = this.f1622m) != null) {
            ((View) nVar).removeCallbacks(cVar);
            this.B = null;
            return true;
        }
        e eVar = this.z;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.f1685j.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // e.b.g.i.m
    public boolean l(r rVar) {
        boolean z = false;
        if (rVar.hasVisibleItems()) {
            r rVar2 = rVar;
            while (true) {
                g gVar = rVar2.z;
                if (gVar == this.f1617h) {
                    break;
                }
                rVar2 = (r) gVar;
            }
            i iVar = rVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.f1622m;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == iVar) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
            }
            if (view == null) {
                return false;
            }
            this.E = rVar.A.a;
            int size = rVar.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                MenuItem item = rVar.getItem(i3);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i3++;
            }
            a aVar = new a(this.f1616g, rVar, view);
            this.A = aVar;
            aVar.f1683h = z;
            k kVar = aVar.f1685j;
            if (kVar != null) {
                kVar.r(z);
            }
            if (this.A.f()) {
                m.a aVar2 = this.f1619j;
                if (aVar2 != null) {
                    aVar2.c(rVar);
                }
                return true;
            }
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        return false;
    }

    @Override // e.b.g.i.m
    public Parcelable m() {
        SavedState savedState = new SavedState();
        savedState.f140f = this.E;
        return savedState;
    }

    public boolean n() {
        a aVar = this.A;
        if (aVar != null) {
            if (aVar.b()) {
                aVar.f1685j.dismiss();
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean o() {
        e eVar = this.z;
        return eVar != null && eVar.b();
    }

    public boolean p() {
        g gVar;
        if (!this.r || o() || (gVar = this.f1617h) == null || this.f1622m == null || this.B != null) {
            return false;
        }
        gVar.i();
        if (gVar.f1657j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f1616g, this.f1617h, this.o, true));
        this.B = cVar;
        ((View) this.f1622m).post(cVar);
        return true;
    }
}
