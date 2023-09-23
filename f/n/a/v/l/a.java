package f.n.a.v.l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.video_converter.video_compressor.constants.FileFormat;
import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.players.VideoPlayer;
import e.p.c.n;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.l;
import f.h.b.b.o1;
import f.h.b.b.t1.w0;
import f.h.b.b.t1.x0;
import f.h.b.b.u1.p;
import java.io.File;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PreviewFragment.java */
/* loaded from: classes2.dex */
public class a extends f.n.a.v.c.e.b {

    /* renamed from: h  reason: collision with root package name */
    public e f7275h;

    @Override // f.n.a.v.c.e.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f.n.a.z.d.a(getActivity(), "PreviewFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g gVar = new g(i().h().a, viewGroup);
        f.n.a.h.d.c i2 = i();
        n nVar = i2.b;
        VideoPlayer videoPlayer = new VideoPlayer(nVar);
        VideoPlayer videoPlayer2 = new VideoPlayer(i2.b);
        f.n.a.r.b bVar = new f.n.a.r.b(i2.a.a().a(null), i2.a.b());
        e eVar = new e(nVar, videoPlayer, videoPlayer2, bVar);
        this.f7275h = eVar;
        eVar.f7279e = gVar;
        bVar.f7070j = eVar;
        b bVar2 = new b(eVar);
        eVar.f7281g = bVar2;
        eVar.f7282h = new c(eVar);
        videoPlayer.f6940f.add(bVar2);
        VideoPlayer videoPlayer3 = eVar.c;
        videoPlayer3.f6940f.add(eVar.f7282h);
        eVar.f7279e.f7289i.setPlayer(eVar.c.f1386h);
        eVar.f7279e.f7288h.setPlayer(eVar.b.f1386h);
        return gVar.f7131f;
    }

    @Override // f.n.a.v.c.e.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        e eVar = this.f7275h;
        f.n.a.r.b bVar = eVar.f7278d;
        if (bVar.f7071k) {
            bVar.c();
        }
        eVar.b.i();
        eVar.c.i();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Objects.requireNonNull(this.f7275h);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        e eVar = this.f7275h;
        if (eVar.o) {
            eVar.h();
        }
        f.n.a.z.d.a(getActivity(), "PreviewFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        e eVar = this.f7275h;
        eVar.f7279e.f7130g.add(eVar);
        VideoPlayer videoPlayer = eVar.b;
        videoPlayer.f6940f.add(eVar.f7281g);
        VideoPlayer videoPlayer2 = eVar.c;
        videoPlayer2.f6940f.add(eVar.f7282h);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        e eVar = this.f7275h;
        eVar.f7279e.f7130g.remove(eVar);
        VideoPlayer videoPlayer = eVar.b;
        videoPlayer.f6940f.remove(eVar.f7281g);
        VideoPlayer videoPlayer2 = eVar.c;
        videoPlayer2.f6940f.remove(eVar.f7282h);
        eVar.b.f();
        eVar.c.f();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        FileFormat b;
        super.onViewCreated(view, bundle);
        e eVar = this.f7275h;
        Bundle arguments = getArguments();
        Objects.requireNonNull(eVar);
        if (arguments != null && arguments.getSerializable("PROCESSING_INFO_KEY") != null) {
            eVar.f7286l = arguments;
            eVar.f7280f = (ProcessingInfo) arguments.getSerializable("PROCESSING_INFO_KEY");
            boolean z = arguments.getBoolean("view_only", false);
            eVar.n = z;
            if (z) {
                g gVar = eVar.f7279e;
                gVar.v.setVisibility(0);
                gVar.w.setVisibility(0);
                gVar.x.setVisibility(0);
                gVar.y.setVisibility(0);
                gVar.f7289i.setUseController(true);
                eVar.b.f1386h.r(true);
                eVar.c.f1386h.r(false);
                ProcessingInfo processingInfo = eVar.f7280f;
                eVar.g(processingInfo.T, processingInfo.f1378i, processingInfo.U);
                return;
            }
            g gVar2 = eVar.f7279e;
            gVar2.v.setVisibility(8);
            gVar2.w.setVisibility(8);
            gVar2.x.setVisibility(8);
            gVar2.y.setVisibility(8);
            gVar2.f7289i.setUseController(false);
            eVar.b.f1386h.r(true);
            eVar.c.f1386h.r(true);
            o1 o1Var = eVar.c.f1386h;
            o1Var.Z();
            final float g2 = b0.g(0.0f, 0.0f, 1.0f);
            if (o1Var.B != g2) {
                o1Var.B = g2;
                o1Var.Q(1, 2, Float.valueOf(o1Var.f4428m.f4106g * g2));
                w0 w0Var = o1Var.f4426k;
                final x0.a U = w0Var.U();
                l.a<x0> aVar = new l.a() { // from class: f.h.b.b.t1.l0
                    @Override // f.h.b.b.g2.l.a
                    public final void b(Object obj) {
                        ((x0) obj).d();
                    }
                };
                w0Var.f4493j.put(1019, U);
                l<x0, x0.b> lVar = w0Var.f4494k;
                lVar.b(1019, aVar);
                lVar.a();
                Iterator<p> it = o1Var.f4422g.iterator();
                while (it.hasNext()) {
                    it.next().d();
                }
            }
            String string = arguments.getString("selected_format", "mp4");
            eVar.f7283i = string;
            f.n.a.r.b bVar = eVar.f7278d;
            n nVar = eVar.a;
            ProcessingInfo processingInfo2 = eVar.f7280f;
            if (bVar.f7070j != null) {
                bVar.f7067g = nVar;
                try {
                    File file = new File(f.n.a.i.b.f6956f);
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    String str = f.n.a.i.b.f6956f + File.separator + "preview." + string;
                    processingInfo2.f1378i = str;
                    bVar.f7072l = processingInfo2.T;
                    bVar.f7073m = str;
                    if (string == null) {
                        b = FileFormat.MP4;
                    } else {
                        b = new f.n.a.n.e().b(string);
                    }
                    processingInfo2.q = b;
                    bVar.n = processingInfo2.U;
                    f.n.a.g.c cVar = bVar.f7068h;
                    cVar.a.a = processingInfo2;
                    cVar.a("-ss 0 -t 10", new f.n.a.r.a(bVar, nVar));
                    return;
                } catch (Exception unused) {
                    f.a.b.a.a.M(FirebaseAnalytics.getInstance(nVar), "CE_preview_exception");
                    return;
                }
            }
            throw new IllegalStateException("Please register a listener before call this method");
        }
        throw new IllegalStateException("Processing info must not be null");
    }
}
