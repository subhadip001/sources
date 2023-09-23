package f.h.b.c.s;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import f.h.b.c.s.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: CheckableGroup.java */
/* loaded from: classes.dex */
public class b<T extends i<T>> {
    public final Map<Integer, T> a = new HashMap();
    public final Set<Integer> b = new HashSet();
    public a c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5396d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5397e;

    /* compiled from: CheckableGroup.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public final boolean a(i<T> iVar) {
        int id = iVar.getId();
        if (this.b.contains(Integer.valueOf(id))) {
            return false;
        }
        T t = this.a.get(Integer.valueOf(c()));
        if (t != null) {
            e(t, false);
        }
        boolean add = this.b.add(Integer.valueOf(id));
        if (!iVar.isChecked()) {
            iVar.setChecked(true);
        }
        return add;
    }

    public List<Integer> b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.b);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof i) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int c() {
        if (!this.f5396d || this.b.isEmpty()) {
            return -1;
        }
        return this.b.iterator().next().intValue();
    }

    public final void d() {
        a aVar = this.c;
        if (aVar != null) {
            new HashSet(this.b);
            ChipGroup chipGroup = ((f.h.b.c.l.d) aVar).a;
            ChipGroup.d dVar = chipGroup.f1139l;
            if (dVar != null) {
                chipGroup.f1140m.b(chipGroup);
                ChipGroup.a aVar2 = (ChipGroup.a) dVar;
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f1140m.f5396d) {
                    aVar2.a.a(chipGroup, chipGroup2.getCheckedChipId());
                }
            }
        }
    }

    public final boolean e(i<T> iVar, boolean z) {
        int id = iVar.getId();
        if (this.b.contains(Integer.valueOf(id))) {
            if (z && this.b.size() == 1 && this.b.contains(Integer.valueOf(id))) {
                iVar.setChecked(true);
                return false;
            }
            boolean remove = this.b.remove(Integer.valueOf(id));
            if (iVar.isChecked()) {
                iVar.setChecked(false);
            }
            return remove;
        }
        return false;
    }
}
