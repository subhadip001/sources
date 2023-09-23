package f.n.a.v.l;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.players.VideoPlayer;
import e.p.c.n;
import f.n.a.r.b;
import f.n.a.v.a.j;

/* compiled from: PreviewFragmentController.java */
/* loaded from: classes2.dex */
public class e implements f, b.a {
    public n a;
    public final VideoPlayer b;
    public final VideoPlayer c;

    /* renamed from: d  reason: collision with root package name */
    public f.n.a.r.b f7278d;

    /* renamed from: e  reason: collision with root package name */
    public g f7279e;

    /* renamed from: f  reason: collision with root package name */
    public ProcessingInfo f7280f;

    /* renamed from: g  reason: collision with root package name */
    public f.n.a.q.a f7281g;

    /* renamed from: h  reason: collision with root package name */
    public f.n.a.q.a f7282h;

    /* renamed from: i  reason: collision with root package name */
    public String f7283i;

    /* renamed from: j  reason: collision with root package name */
    public String f7284j;

    /* renamed from: k  reason: collision with root package name */
    public String f7285k;

    /* renamed from: l  reason: collision with root package name */
    public Bundle f7286l;
    public boolean n;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7287m = false;
    public boolean o = false;
    public long p = 0;

    public e(n nVar, VideoPlayer videoPlayer, VideoPlayer videoPlayer2, f.n.a.r.b bVar) {
        this.a = nVar;
        this.b = videoPlayer;
        this.c = videoPlayer2;
        this.f7278d = bVar;
    }

    @Override // f.n.a.v.l.f
    public void a() {
        this.f7278d.c();
        f.n.a.z.d.a(this.a, "VidCompInputScreenActivity");
    }

    @Override // f.n.a.v.l.f
    public void b() {
        j.m(this.a, this.f7284j);
    }

    @Override // f.n.a.v.l.f
    public void c() {
        j.m(this.a, this.f7285k);
    }

    @Override // f.n.a.v.l.f
    public void d() {
        StringBuilder A = f.a.b.a.a.A("oncancelBtnClicked: ");
        A.append(System.currentTimeMillis());
        Log.d("PreviewFragmentC", A.toString());
        this.f7278d.c();
        f.n.a.z.d.a(this.a, "VidCompInputScreenActivity");
    }

    public final boolean e(String str) {
        return str != null && str.toLowerCase().endsWith("mts");
    }

    public void f() {
        this.f7287m = false;
        g gVar = this.f7279e;
        gVar.s.setVisibility(0);
        gVar.r.setVisibility(8);
        try {
            this.a.H().Z();
        } catch (Exception unused) {
        }
    }

    public void g(String str, String str2, long j2) {
        this.o = true;
        Log.d("PreviewFragmentC", "onPreviewReady: ");
        this.f7284j = str;
        this.f7285k = str2;
        g gVar = this.f7279e;
        gVar.t.animate().alpha(0.4f).setDuration(500L).setListener(new h(gVar)).start();
        h();
        this.f7279e.z.setText(String.format(this.a.getResources().getString(R.string.original_size_hint), j.f(j2)));
        long d2 = f.n.a.v.a.e.d(str2);
        Bundle bundle = this.f7286l;
        if (bundle != null && bundle.getBoolean("view_only")) {
            TextView textView = this.f7279e.B;
            String string = this.a.getResources().getString(R.string.compressedPercent);
            textView.setText(String.format(string, (100 - ((int) ((((float) d2) * 100.0f) / ((float) j2)))) + "%"));
            if (j2 > d2) {
                this.f7279e.C.setText(String.format(this.a.getResources().getString(R.string.saved_mb), j.f(j2 - d2)));
            }
            this.f7279e.A.setText(String.format(this.a.getResources().getString(R.string.original_size_hint), j.f(d2)));
        } else {
            this.f7279e.A.setText(this.a.getResources().getString(R.string.duration_10s));
        }
        if (e(str)) {
            this.f7279e.p.setVisibility(0);
        }
        if (e(str2)) {
            this.f7279e.o.setVisibility(0);
        }
    }

    public final void h() {
        try {
            if (this.f7280f != null) {
                try {
                    this.c.g(Uri.parse(this.f7284j));
                    this.p = f.l.b.c.e(this.f7280f.j(), this.f7280f.L);
                } catch (Exception unused) {
                }
            }
            Log.d("TestPrevPath", "prepareAndPlay: " + this.f7285k);
            this.b.g(Uri.parse(this.f7285k));
        } catch (Exception e2) {
            StringBuilder A = f.a.b.a.a.A("prepareAndPlay: error ");
            A.append(e2.getMessage());
            Log.d("PreviewFragmentC", A.toString());
        }
    }
}
