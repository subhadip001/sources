package f.n.a.v.u;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.video_converter.video_compressor.players.VideoPlayer;
import e.p.c.n;
import f.n.a.v.u.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: VideoTrimFragment.java */
/* loaded from: classes2.dex */
public class e extends f.n.a.v.c.e.b {

    /* renamed from: h  reason: collision with root package name */
    public f f7490h;

    /* renamed from: i  reason: collision with root package name */
    public i f7491i;

    /* renamed from: j  reason: collision with root package name */
    public f.d f7492j;

    @Override // f.n.a.v.c.e.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f.n.a.z.d.a(getActivity(), "VideoTrimFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f7490h = new f(i().b);
        i iVar = new i(i().h().a, viewGroup);
        this.f7491i = iVar;
        return iVar.f7131f;
    }

    @Override // f.n.a.v.c.e.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        f fVar = this.f7490h;
        fVar.c.t.i();
        fVar.o();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        VideoPlayer videoPlayer = this.f7490h.a;
        if (videoPlayer != null) {
            videoPlayer.f1386h.r(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        f.n.a.z.d.a(getActivity(), "VideoTrimFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        f fVar = this.f7490h;
        fVar.f7502m.j(fVar);
        fVar.c.f7130g.add(fVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        f fVar = this.f7490h;
        fVar.c.f7130g.remove(fVar);
        fVar.f7502m.l(fVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        f fVar = this.f7490h;
        fVar.c = this.f7491i;
        Bundle arguments = getArguments();
        Objects.requireNonNull(fVar);
        ArrayList<f.n.a.m.c.a> arrayList = (ArrayList) arguments.getSerializable("SELECTED_FILE");
        fVar.f7494e = arrayList;
        c cVar = fVar.c.f7505i;
        cVar.a = arrayList;
        cVar.notifyDataSetChanged();
        fVar.p();
        int i2 = arguments.getInt("selected_index", 0);
        ArrayList<f.n.a.m.c.a> arrayList2 = fVar.f7494e;
        if (arrayList2 != null && arrayList2.size() >= i2) {
            fVar.l(fVar.f7494e.get(i2), i2);
        }
        fVar.c.f7504h.q0(i2);
        Iterator<f.n.a.m.c.a> it = fVar.f7494e.iterator();
        while (it.hasNext()) {
            f.n.a.m.c.a next = it.next();
            ArrayList<Float> arrayList3 = new ArrayList<>();
            ArrayList<String> arrayList4 = new ArrayList<>();
            float f2 = next.f7018f;
            float f3 = next.f7019g;
            String str = next.f7020h;
            String str2 = next.f7021i;
            arrayList3.add(Float.valueOf(next.x));
            arrayList3.add(Float.valueOf(f2));
            arrayList3.add(Float.valueOf(f3));
            arrayList4.add(str);
            arrayList4.add(str2);
            fVar.f7495f.add(arrayList3);
            fVar.f7496g.add(arrayList4);
        }
        n nVar = fVar.f7493d;
        fVar.f7500k = new f.n.a.k.a(nVar);
        fVar.f7501l = new f.n.a.k.b(nVar.H());
        fVar.f7502m = m.a.a.c.b();
        this.f7490h.f7497h = this.f7492j;
    }
}
