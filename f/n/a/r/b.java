package f.n.a.r;

import android.content.Context;
import android.util.Log;
import com.arthenica.ffmpegkit.usecase.FFmpegKitUseCase;
import com.video_converter.video_compressor.R;
import f.n.a.g.c;
import f.n.a.s.a;
import f.n.a.v.l.d;
import f.n.a.v.l.e;
import f.n.a.v.l.g;

/* compiled from: PreviewGeneratingTask.java */
/* loaded from: classes2.dex */
public class b implements a.InterfaceC0181a {

    /* renamed from: f  reason: collision with root package name */
    public String f7066f;

    /* renamed from: g  reason: collision with root package name */
    public Context f7067g;

    /* renamed from: h  reason: collision with root package name */
    public c f7068h;

    /* renamed from: i  reason: collision with root package name */
    public f.n.a.s.a f7069i;

    /* renamed from: j  reason: collision with root package name */
    public a f7070j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7071k = false;

    /* renamed from: l  reason: collision with root package name */
    public String f7072l;

    /* renamed from: m  reason: collision with root package name */
    public String f7073m;
    public long n;

    /* compiled from: PreviewGeneratingTask.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public b(c cVar, f.n.a.s.a aVar) {
        this.f7068h = cVar;
        this.f7069i = aVar;
    }

    @Override // f.n.a.s.a.InterfaceC0181a
    public void a() {
        f.l.b.c.j(this.f7067g, String.class, "rret_sfrdf", this.f7066f);
        ((e) this.f7070j).g(this.f7072l, this.f7073m, this.n);
    }

    @Override // f.n.a.s.a.InterfaceC0181a
    public void b(long j2, long j3) {
        e eVar = (e) this.f7070j;
        eVar.a.runOnUiThread(new d(eVar, r2));
    }

    public void c() {
        try {
            f.n.a.s.a aVar = this.f7069i;
            if (aVar != null) {
                FFmpegKitUseCase fFmpegKitUseCase = aVar.a;
                if (fFmpegKitUseCase != null ? fFmpegKitUseCase.isFFmpegRunning() : false) {
                    a aVar2 = this.f7070j;
                    if (aVar2 != null) {
                        e eVar = (e) aVar2;
                        eVar.f7287m = true;
                        g gVar = eVar.f7279e;
                        gVar.r.setVisibility(0);
                        gVar.s.setVisibility(8);
                    }
                    f.n.a.s.a aVar3 = this.f7069i;
                    aVar3.c = true;
                    aVar3.a.cancelTask();
                    f.l.b.c.j(this.f7067g, String.class, "rret_sfrdf", null);
                }
            }
            a aVar4 = this.f7070j;
            if (aVar4 != null) {
                ((e) aVar4).f();
            }
            f.l.b.c.j(this.f7067g, String.class, "rret_sfrdf", null);
        } catch (Exception unused) {
        }
    }

    @Override // f.n.a.s.a.InterfaceC0181a
    public void e(boolean z, String str) {
        a aVar;
        Log.d("previewTask", "onFailure: ");
        if (z && (aVar = this.f7070j) != null) {
            ((e) aVar).f();
            return;
        }
        e eVar = (e) this.f7070j;
        g gVar = eVar.f7279e;
        String string = eVar.a.getResources().getString(R.string.preview_generate_failed);
        gVar.f7290j.setVisibility(8);
        gVar.q.setText(string);
        gVar.f7293m.setText(gVar.b().getResources().getString(R.string.failed));
        gVar.f7291k.setVisibility(8);
        gVar.f7292l.setText(gVar.b().getResources().getString(R.string.close));
    }

    @Override // f.n.a.s.a.InterfaceC0181a
    public void onFinish() {
        this.f7071k = false;
    }
}
