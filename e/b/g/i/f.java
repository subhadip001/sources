package e.b.g.i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import e.b.g.i.n;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    public g f1645f;

    /* renamed from: g  reason: collision with root package name */
    public int f1646g = -1;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1647h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1648i;

    /* renamed from: j  reason: collision with root package name */
    public final LayoutInflater f1649j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1650k;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i2) {
        this.f1648i = z;
        this.f1649j = layoutInflater;
        this.f1645f = gVar;
        this.f1650k = i2;
        a();
    }

    public void a() {
        g gVar = this.f1645f;
        i iVar = gVar.v;
        if (iVar != null) {
            gVar.i();
            ArrayList<i> arrayList = gVar.f1657j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayList.get(i2) == iVar) {
                    this.f1646g = i2;
                    return;
                }
            }
        }
        this.f1646g = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public i getItem(int i2) {
        ArrayList<i> l2;
        if (this.f1648i) {
            g gVar = this.f1645f;
            gVar.i();
            l2 = gVar.f1657j;
        } else {
            l2 = this.f1645f.l();
        }
        int i3 = this.f1646g;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return l2.get(i2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> l2;
        if (this.f1648i) {
            g gVar = this.f1645f;
            gVar.i();
            l2 = gVar.f1657j;
        } else {
            l2 = this.f1645f.l();
        }
        if (this.f1646g < 0) {
            return l2.size();
        }
        return l2.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1649j.inflate(this.f1650k, viewGroup, false);
        }
        int i3 = getItem(i2).b;
        int i4 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1645f.m() && i3 != (i4 >= 0 ? getItem(i4).b : i3));
        n.a aVar = (n.a) view;
        if (this.f1647h) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
