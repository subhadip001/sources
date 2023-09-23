package f.n.a.v.q;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.constants.CompressionProfile;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: SimpleOptionsScreenFragment.java */
/* loaded from: classes2.dex */
public class e extends f.n.a.v.c.e.b implements f.n.a.v.c.a {

    /* renamed from: h  reason: collision with root package name */
    public o f7394h;

    /* renamed from: i  reason: collision with root package name */
    public d f7395i;

    /* renamed from: j  reason: collision with root package name */
    public a f7396j;

    /* compiled from: SimpleOptionsScreenFragment.java */
    /* loaded from: classes2.dex */
    public interface a {
        void v(CompressionProfile compressionProfile);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f7396j = (a) context;
        } catch (Exception unused) {
            StringBuilder A = f.a.b.a.a.A("you mast implement simpleoptionLIstener in ");
            A.append(requireActivity().getClass().getSimpleName());
            throw new IllegalStateException(A.toString());
        }
    }

    @Override // f.n.a.v.c.e.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f.n.a.h.d.c i2 = i();
        e.p.c.n nVar = i2.b;
        f.n.a.v.c.b g2 = i2.g();
        f.n.a.h.b e2 = i2.e();
        e.p.c.n nVar2 = i2.b;
        f.n.a.h.b e3 = i2.e();
        f.n.a.k.a b = i2.b();
        if (i2.f6952h == null) {
            i2.f6952h = new f.n.a.h.d.a(i2.b);
        }
        d dVar = new d(nVar, g2, e2, new f.n.a.v.d.c(nVar2, e3, b, i2.f6952h));
        this.f7395i = dVar;
        dVar.o.t = this.f7133g;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        f.n.a.v.c.c h2 = i().h();
        o oVar = new o(h2.a, viewGroup, h2);
        this.f7394h = oVar;
        d dVar = this.f7395i;
        dVar.f7384d = oVar;
        dVar.f7385e.b = oVar;
        f.n.a.v.d.c cVar = dVar.o;
        cVar.f7137f = oVar.E;
        Objects.requireNonNull(cVar.f7141j);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Item("H264", true));
        arrayList.add(new Item("LIBX264", false));
        cVar.f7143l = arrayList;
        f.n.a.n.b bVar = cVar.f7141j;
        Objects.requireNonNull(bVar);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Item(bVar.a.getString(R.string.low), false));
        arrayList2.add(new Item(bVar.a.getString(R.string.medium), true));
        arrayList2.add(new Item(bVar.a.getString(R.string.high), false));
        cVar.f7144m = arrayList2;
        cVar.o = cVar.f7141j.b();
        dVar.o.s = dVar;
        o oVar2 = dVar.f7385e.b;
        oVar2.B.addView(oVar2.E.f7131f);
        if (!((Boolean) f.l.b.c.b(dVar.c.getApplicationContext(), Boolean.class, "is_first_time_user")).booleanValue()) {
            dVar.p.sendEmptyMessageDelayed(0, 1000L);
            f.l.b.c.j(dVar.c.getApplicationContext(), Boolean.class, "is_first_time_user", Boolean.TRUE);
        }
        return this.f7394h.f7131f;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Objects.requireNonNull(this.f7395i.o);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Log.d("Ariful", "onSaveInstanceState: ");
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        d dVar = this.f7395i;
        dVar.f7384d.f7130g.add(dVar);
        f.n.a.v.d.c cVar = dVar.o;
        Objects.requireNonNull(cVar);
        try {
            m.a.a.c.b().j(cVar);
        } catch (Exception unused) {
        }
        cVar.f7137f.f7130g.add(cVar);
        this.f7395i.b = this.f7396j;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        d dVar = this.f7395i;
        dVar.f7384d.f7130g.remove(dVar);
        f.n.a.v.d.c cVar = dVar.o;
        cVar.f7137f.f7130g.remove(cVar);
        try {
            m.a.a.c.b().l(cVar);
        } catch (Exception unused) {
        }
    }
}
