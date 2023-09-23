package f.n.a.v.u;

import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.dialogs.promptdialog.PromptDialogDismissedEvent;
import com.video_converter.video_compressor.players.VideoPlayer;
import e.p.c.n;
import f.n.a.k.i.b;
import f.n.a.v.s.j;
import java.util.ArrayList;
import java.util.List;
import m.a.a.l;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: VideoTrimFragmentController.java */
/* loaded from: classes2.dex */
public class f implements f.n.a.v.u.d, f.n.a.q.a {
    public VideoPlayer a;
    public f.n.a.m.c.a b;
    public i c;

    /* renamed from: d  reason: collision with root package name */
    public final n f7493d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<f.n.a.m.c.a> f7494e;

    /* renamed from: h  reason: collision with root package name */
    public d f7497h;

    /* renamed from: k  reason: collision with root package name */
    public f.n.a.k.a f7500k;

    /* renamed from: l  reason: collision with root package name */
    public f.n.a.k.b f7501l;

    /* renamed from: m  reason: collision with root package name */
    public m.a.a.c f7502m;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<ArrayList<Float>> f7495f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<ArrayList<String>> f7496g = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public int f7498i = 1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7499j = false;
    public long n = -1;
    public final Handler o = new a(Looper.getMainLooper());

    /* compiled from: VideoTrimFragmentController.java */
    /* loaded from: classes2.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            f fVar;
            VideoPlayer videoPlayer;
            float f2;
            super.handleMessage(message);
            StringBuilder A = f.a.b.a.a.A("handleMessage: ");
            A.append(f.this.n);
            Log.d("arifulTestDebug", A.toString());
            try {
                fVar = f.this;
            } catch (Exception unused) {
                return;
            }
            if (fVar.c == null || fVar.n <= -1) {
                return;
            }
            float c = ((float) fVar.a.c()) / ((float) f.this.n);
            Log.d("TESTPRO", "handleMessage: " + c + " " + f.this.b.f7018f + " " + f.this.b.f7019g);
            f fVar2 = f.this;
            f.n.a.m.c.a aVar = fVar2.b;
            if (aVar != null && (videoPlayer = fVar2.a) != null) {
                int i2 = fVar2.f7498i;
                if (i2 == 1) {
                    float f3 = c * 100.0f;
                    if (aVar.f7019g < f3 || aVar.f7018f > f3) {
                        videoPlayer.k((aVar.f7018f / 100.0f) * ((float) fVar2.n));
                        f2 = f.this.b.f7018f;
                        c = f2 / 100.0f;
                    }
                } else if (i2 == 2) {
                    float f4 = c * 100.0f;
                    if (f4 >= aVar.f7018f) {
                        float f5 = aVar.f7019g;
                        if (f4 <= f5) {
                            videoPlayer.k((f5 / 100.0f) * ((float) fVar2.n));
                            f2 = f.this.b.f7019g;
                            c = f2 / 100.0f;
                        }
                    }
                }
                return;
            }
            f fVar3 = f.this;
            fVar3.c.o.setText(i.d(f.l.b.c.a(fVar3.a.c())));
            fVar3.c.t.setCurrentProgress(c);
            f.this.o.sendEmptyMessageDelayed(0, 16L);
        }
    }

    /* compiled from: VideoTrimFragmentController.java */
    /* loaded from: classes2.dex */
    public class b implements b.c {
        public b() {
        }

        @Override // f.n.a.k.i.b.c
        public void a(long j2) {
            f fVar = f.this;
            f.n.a.m.c.a aVar = fVar.b;
            aVar.f7018f = ((float) ((j2 * 1.0d) / (aVar.t * 1.0d))) * 100.0f;
            fVar.c.g(f.l.b.c.a(j2));
            f.this.b.f7020h = f.l.b.c.a(j2);
            f fVar2 = f.this;
            i iVar = fVar2.c;
            f.n.a.m.c.a aVar2 = fVar2.b;
            iVar.f(aVar2.f7018f, aVar2.f7019g);
            f.this.q();
        }
    }

    /* compiled from: VideoTrimFragmentController.java */
    /* loaded from: classes2.dex */
    public class c implements b.c {
        public c() {
        }

        @Override // f.n.a.k.i.b.c
        public void a(long j2) {
            f fVar = f.this;
            f.n.a.m.c.a aVar = fVar.b;
            aVar.f7019g = ((float) ((j2 * 1.0d) / (aVar.t * 1.0d))) * 100.0f;
            fVar.c.e(f.l.b.c.a(j2));
            f.this.b.f7021i = f.l.b.c.a(j2);
            f fVar2 = f.this;
            i iVar = fVar2.c;
            f.n.a.m.c.a aVar2 = fVar2.b;
            iVar.f(aVar2.f7018f, aVar2.f7019g);
            f.this.q();
        }
    }

    /* compiled from: VideoTrimFragmentController.java */
    /* loaded from: classes2.dex */
    public interface d {
    }

    public f(n nVar) {
        this.f7493d = nVar;
    }

    @Override // f.n.a.v.u.d
    public void a() {
        if (this.f7499j) {
            f.n.a.k.b bVar = this.f7501l;
            f.n.a.k.a aVar = this.f7500k;
            bVar.b(f.n.a.k.g.a.m(aVar.a.getString(R.string.warning), aVar.a.getString(R.string.trim_warning_msg), aVar.a.getString(R.string.ok), aVar.a.getString(R.string.cancel)), "CLOSE_TRIM_SCREEN");
            return;
        }
        n();
    }

    @Override // f.n.a.q.a
    public void b() {
        this.c.f7508l.setVisibility(8);
    }

    @Override // f.n.a.v.u.d
    public void c(float f2) {
        long j2 = this.n;
        if (j2 > 0) {
            try {
                this.a.k((int) ((f2 / 100.0f) * ((float) j2)));
            } catch (Exception unused) {
            }
        }
    }

    @Override // f.n.a.v.u.d
    public void d() {
        Log.d("TAG", "onDoneBtnClicked: ");
        d dVar = this.f7497h;
        if (dVar != null) {
            j jVar = (j) dVar;
            jVar.B = this.f7494e;
            f.n.a.z.d.a(jVar.o, "VidCompInputScreenActivity");
        } else {
            FirebaseCrashlytics.getInstance().log("Video trim fragment controller listener null in onDoneButtonClicked");
        }
        if (this.f7493d.H().J() > 0) {
            this.f7493d.H().Y();
        }
    }

    @Override // f.n.a.v.u.d
    public void e(float f2, float f3, boolean z) {
        try {
            if (this.f7498i == 1) {
                this.a.k(f.l.b.c.e(this.b.t, z ? f2 : f3));
            } else if (z) {
                this.a.k(0L);
            } else {
                this.a.k(f.l.b.c.e(this.b.t, f3));
            }
        } catch (Exception unused) {
        }
        this.c.g(f.l.b.c.g(this.b.t, f2));
        this.c.e(f.l.b.c.g(this.b.t, f3));
        if (this.f7498i == 1) {
            this.c.h(f.l.b.c.c(this.b.t, f2, f3));
        } else {
            this.c.h(f.l.b.c.a(f.l.b.c.d(this.b.t, f2, f3)));
        }
    }

    @Override // f.n.a.v.u.d
    public void f(int i2, boolean z) {
        this.f7498i = i2;
        if (i2 == 1) {
            this.c.p.getBackground().setColorFilter(this.f7493d.getResources().getColor(R.color.color_blue), PorterDuff.Mode.SRC_IN);
            this.c.q.getBackground().setColorFilter(this.f7493d.getResources().getColor(R.color.colorLightGrey), PorterDuff.Mode.SRC_IN);
            this.c.p.setSelected(true);
            this.c.q.setSelected(false);
            if (z) {
                g(0.0f, 100.0f);
            }
        } else {
            this.c.p.getBackground().setColorFilter(this.f7493d.getResources().getColor(R.color.colorLightGrey), PorterDuff.Mode.SRC_IN);
            this.c.q.getBackground().setColorFilter(this.f7493d.getResources().getColor(R.color.color_blue), PorterDuff.Mode.SRC_IN);
            this.c.p.setSelected(false);
            this.c.q.setSelected(true);
            if (z) {
                g(30.0f, 70.0f);
            }
        }
        this.b.x = i2;
        this.c.t.setCurrentMode(i2);
    }

    @Override // f.n.a.v.u.d
    public void g(float f2, float f3) {
        int indexOf;
        int indexOf2 = this.f7494e.indexOf(this.b);
        if (indexOf2 == -1) {
            return;
        }
        this.f7499j = true;
        f.n.a.m.c.a aVar = this.b;
        aVar.f7018f = f2;
        aVar.f7019g = f3;
        aVar.x = this.f7498i;
        aVar.f7020h = f.l.b.c.g(aVar.t, f2);
        f.n.a.m.c.a aVar2 = this.b;
        aVar2.f7021i = f.l.b.c.g(aVar2.t, f3);
        i iVar = this.c;
        f.n.a.m.c.a aVar3 = this.b;
        iVar.g(f.l.b.c.a(f.l.b.c.e(aVar3.t, aVar3.f7018f)));
        i iVar2 = this.c;
        f.n.a.m.c.a aVar4 = this.b;
        iVar2.e(f.l.b.c.a(f.l.b.c.e(aVar4.t, aVar4.f7019g)));
        i iVar3 = this.c;
        f.n.a.m.c.a aVar5 = this.b;
        iVar3.f(aVar5.f7018f, aVar5.f7019g);
        this.f7494e.set(indexOf2, this.b);
        i iVar4 = this.c;
        f.n.a.m.c.a aVar6 = this.b;
        f.n.a.v.u.c cVar = iVar4.f7505i;
        if (cVar != null && (indexOf = cVar.a.indexOf(aVar6)) != -1) {
            cVar.a.set(indexOf, aVar6);
            cVar.notifyItemChanged(indexOf);
        }
        q();
    }

    @Override // f.n.a.q.a
    public void h(ExoPlaybackException exoPlaybackException) {
        o();
        Log.d("TAG", "onPlayError: " + exoPlaybackException);
        this.c.f7508l.setVisibility(0);
    }

    @Override // f.n.a.v.u.d
    public void i() {
        f.n.a.k.i.b bVar = new f.n.a.k.i.b(new c());
        f.n.a.m.c.a aVar = this.b;
        long e2 = f.l.b.c.e(aVar.t, aVar.f7018f);
        f.n.a.m.c.a aVar2 = this.b;
        bVar.c(this.f7493d, e2, f.l.b.c.e(aVar2.t, aVar2.f7019g), this.b.t, false);
    }

    @Override // f.n.a.v.u.d
    public void j() {
        f.n.a.k.i.b bVar = new f.n.a.k.i.b(new b());
        f.n.a.m.c.a aVar = this.b;
        long e2 = f.l.b.c.e(aVar.t, aVar.f7018f);
        f.n.a.m.c.a aVar2 = this.b;
        bVar.c(this.f7493d, e2, f.l.b.c.e(aVar2.t, aVar2.f7019g), this.b.t, true);
    }

    @Override // f.n.a.q.a
    public void k(boolean z) {
    }

    @Override // f.n.a.v.u.d
    public void l(f.n.a.m.c.a aVar, int i2) {
        List<f.n.a.m.c.a> list;
        VideoPlayer videoPlayer = this.a;
        if (videoPlayer != null) {
            videoPlayer.f();
            this.a.i();
        }
        p();
        Uri parse = Uri.parse(aVar.f7022j);
        VideoPlayer videoPlayer2 = this.a;
        if (videoPlayer2 != null) {
            videoPlayer2.g(parse);
            this.a.f1386h.r(true);
            this.c.t.setVideoPath(parse);
        }
        this.b = aVar;
        f.n.a.v.u.c cVar = this.c.f7505i;
        if (cVar != null && (list = cVar.a) != null) {
            int i3 = 0;
            for (f.n.a.m.c.a aVar2 : list) {
                aVar2.v = i3 == i2;
                i3++;
            }
            cVar.notifyDataSetChanged();
        }
        this.c.f(aVar.f7018f, aVar.f7019g);
        f(this.b.x, false);
        String str = this.b.f7020h;
        if (str == null) {
            str = f.l.b.c.g(aVar.t, aVar.f7018f);
        }
        String str2 = this.b.f7021i;
        if (str2 == null) {
            str2 = f.l.b.c.g(aVar.t, aVar.f7019g);
        }
        this.c.g(str);
        this.c.e(str2);
        q();
    }

    @Override // f.n.a.q.a
    public void m() {
    }

    public final void n() {
        if (this.f7493d.H().J() > 0) {
            int size = this.f7494e.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f7494e.get(i2).x = (int) (this.f7495f.get(i2).get(0).floatValue() * 1.0f);
                this.f7494e.get(i2).f7018f = this.f7495f.get(i2).get(1).floatValue();
                this.f7494e.get(i2).f7019g = this.f7495f.get(i2).get(2).floatValue();
                this.f7494e.get(i2).f7020h = this.f7496g.get(i2).get(0);
                this.f7494e.get(i2).f7021i = this.f7496g.get(i2).get(0);
            }
            this.f7493d.H().Y();
        }
    }

    public void o() {
        try {
            VideoPlayer videoPlayer = this.a;
            if (videoPlayer != null) {
                if (videoPlayer.f1386h.w()) {
                    videoPlayer.f1386h.X(false);
                }
                this.a.i();
            }
        } catch (Exception unused) {
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(PromptDialogDismissedEvent promptDialogDismissedEvent) {
        Log.d("TAG", "CLOSE_TRIM_SCREEN: ");
        String str = promptDialogDismissedEvent.a;
        str.hashCode();
        if (str.equals("CLOSE_TRIM_SCREEN") && promptDialogDismissedEvent.b == PromptDialogDismissedEvent.ClickedButton.POSITIVE) {
            n();
        }
    }

    public final void p() {
        VideoPlayer videoPlayer = new VideoPlayer(this.f7493d);
        this.a = videoPlayer;
        videoPlayer.f6940f.add(this);
        this.c.s.setPlayer(this.a.f1386h);
        this.c.s.getPlayer().m(new g(this));
    }

    public final void q() {
        if (this.f7498i == 1) {
            i iVar = this.c;
            f.n.a.m.c.a aVar = this.b;
            iVar.h(f.l.b.c.c(aVar.t, aVar.f7018f, aVar.f7019g));
            return;
        }
        i iVar2 = this.c;
        f.n.a.m.c.a aVar2 = this.b;
        iVar2.h(f.l.b.c.a(f.l.b.c.d(aVar2.t, aVar2.f7018f, aVar2.f7019g)));
    }
}
