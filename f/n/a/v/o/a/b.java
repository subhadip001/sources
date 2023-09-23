package f.n.a.v.o.a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;
import f.n.a.v.o.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ListItemRecyclerAdapter.java */
/* loaded from: classes2.dex */
public class b extends RecyclerView.e<a> implements f.n.a.v.o.a.a {
    public f.n.a.v.c.c a;
    public InterfaceC0191b b;
    public List<Item> c = new ArrayList();

    /* compiled from: ListItemRecyclerAdapter.java */
    /* loaded from: classes2.dex */
    public static class a extends RecyclerView.a0 {
        public final c a;

        public a(c cVar) {
            super(cVar.f7131f);
            this.a = cVar;
        }
    }

    /* compiled from: ListItemRecyclerAdapter.java */
    /* renamed from: f.n.a.v.o.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0191b {
    }

    public b(InterfaceC0191b interfaceC0191b, f.n.a.v.c.c cVar) {
        this.a = cVar;
        this.b = interfaceC0191b;
    }

    @Override // f.n.a.v.o.a.a
    public void a(Item item) {
        for (f.n.a.v.o.c cVar : ((f) this.b).c()) {
            cVar.a(item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        List<Item> list = this.c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(a aVar, int i2) {
        c cVar = aVar.a;
        Item item = this.c.get(i2);
        cVar.f7362l = item;
        cVar.f7358h.setText(item.f1395f);
        cVar.f7360j.setText(item.f1397h);
        if (item.f1396g == null) {
            cVar.f7359i.setVisibility(4);
        } else {
            cVar.f7359i.setVisibility(0);
            cVar.f7359i.setText(item.f1396g);
        }
        if (item.f1399j) {
            cVar.f7361k.setVisibility(0);
        } else {
            cVar.f7361k.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        c cVar = new c(this.a.a, viewGroup);
        cVar.f7130g.add(this);
        return new a(cVar);
    }
}
