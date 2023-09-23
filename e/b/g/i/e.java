package e.b.g.i;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.google.firebase.inappmessaging.display.internal.FiamWindowManager;
import com.video_converter.video_compressor.R;
import e.b.c.h;
import e.b.g.i.m;
import e.b.g.i.n;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public Context f1637f;

    /* renamed from: g  reason: collision with root package name */
    public LayoutInflater f1638g;

    /* renamed from: h  reason: collision with root package name */
    public g f1639h;

    /* renamed from: i  reason: collision with root package name */
    public ExpandedMenuView f1640i;

    /* renamed from: j  reason: collision with root package name */
    public m.a f1641j;

    /* renamed from: k  reason: collision with root package name */
    public a f1642k;

    /* compiled from: ListMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: f  reason: collision with root package name */
        public int f1643f = -1;

        public a() {
            a();
        }

        public void a() {
            g gVar = e.this.f1639h;
            i iVar = gVar.v;
            if (iVar != null) {
                gVar.i();
                ArrayList<i> arrayList = gVar.f1657j;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayList.get(i2) == iVar) {
                        this.f1643f = i2;
                        return;
                    }
                }
            }
            this.f1643f = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public i getItem(int i2) {
            g gVar = e.this.f1639h;
            gVar.i();
            ArrayList<i> arrayList = gVar.f1657j;
            Objects.requireNonNull(e.this);
            int i3 = i2 + 0;
            int i4 = this.f1643f;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayList.get(i3);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            g gVar = e.this.f1639h;
            gVar.i();
            int size = gVar.f1657j.size();
            Objects.requireNonNull(e.this);
            int i2 = size + 0;
            return this.f1643f < 0 ? i2 : i2 - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = e.this.f1638g.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((n.a) view).d(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i2) {
        this.f1637f = context;
        this.f1638g = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f1642k == null) {
            this.f1642k = new a();
        }
        return this.f1642k;
    }

    @Override // e.b.g.i.m
    public void b(g gVar, boolean z) {
        m.a aVar = this.f1641j;
        if (aVar != null) {
            aVar.b(gVar, z);
        }
    }

    @Override // e.b.g.i.m
    public void c(boolean z) {
        a aVar = this.f1642k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // e.b.g.i.m
    public boolean d() {
        return false;
    }

    @Override // e.b.g.i.m
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override // e.b.g.i.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // e.b.g.i.m
    public void g(m.a aVar) {
        this.f1641j = aVar;
    }

    @Override // e.b.g.i.m
    public int getId() {
        return 0;
    }

    @Override // e.b.g.i.m
    public void i(Context context, g gVar) {
        if (this.f1637f != null) {
            this.f1637f = context;
            if (this.f1638g == null) {
                this.f1638g = LayoutInflater.from(context);
            }
        }
        this.f1639h = gVar;
        a aVar = this.f1642k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // e.b.g.i.m
    public void j(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1640i.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // e.b.g.i.m
    public boolean l(r rVar) {
        if (rVar.hasVisibleItems()) {
            h hVar = new h(rVar);
            h.a aVar = new h.a(rVar.a);
            e eVar = new e(aVar.getContext(), R.layout.abc_list_menu_item_layout);
            hVar.f1663h = eVar;
            eVar.f1641j = hVar;
            g gVar = hVar.f1661f;
            gVar.b(eVar, gVar.a);
            ListAdapter a2 = hVar.f1663h.a();
            AlertController.b bVar = aVar.a;
            bVar.n = a2;
            bVar.o = hVar;
            View view = rVar.o;
            if (view != null) {
                bVar.f101f = view;
            } else {
                bVar.f99d = rVar.n;
                aVar.setTitle(rVar.f1660m);
            }
            aVar.a.f108m = hVar;
            e.b.c.h create = aVar.create();
            hVar.f1662g = create;
            create.setOnDismissListener(hVar);
            WindowManager.LayoutParams attributes = hVar.f1662g.getWindow().getAttributes();
            attributes.type = FiamWindowManager.DEFAULT_TYPE;
            attributes.flags |= 131072;
            hVar.f1662g.show();
            m.a aVar2 = this.f1641j;
            if (aVar2 != null) {
                aVar2.c(rVar);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // e.b.g.i.m
    public Parcelable m() {
        if (this.f1640i == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1640i;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f1639h.s(this.f1642k.getItem(i2), this, 0);
    }
}
