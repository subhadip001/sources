package f.n.a.v.q;

import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.constants.CompressionProfile;
import com.video_converter.video_compressor.model.MediaFile;
import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;
import f.n.a.v.d.c;
import f.n.a.v.q.e;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* compiled from: SimpleOptionsScreenController.java */
/* loaded from: classes2.dex */
public class d implements f.n.a.v.q.b, c.b {
    public String a;
    public e.a b;
    public e.p.c.n c;

    /* renamed from: d  reason: collision with root package name */
    public o f7384d;

    /* renamed from: e  reason: collision with root package name */
    public g f7385e;

    /* renamed from: f  reason: collision with root package name */
    public f.n.a.h.b f7386f;

    /* renamed from: g  reason: collision with root package name */
    public f.n.a.n.h f7387g;

    /* renamed from: h  reason: collision with root package name */
    public f.n.a.n.j f7388h;

    /* renamed from: j  reason: collision with root package name */
    public f.n.a.m.c.a f7390j;

    /* renamed from: k  reason: collision with root package name */
    public MediaFile f7391k;
    public b n;
    public f.n.a.v.d.c o;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7389i = false;

    /* renamed from: l  reason: collision with root package name */
    public CompressionProfile f7392l = CompressionProfile.MEDIUM_FILE;

    /* renamed from: m  reason: collision with root package name */
    public ProcessingInfo.b f7393m = new ProcessingInfo.b();
    public Handler p = new a();

    /* compiled from: SimpleOptionsScreenController.java */
    /* loaded from: classes2.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                if (message.what == 0) {
                    d.this.f7384d.A.fullScroll(130);
                    d.this.p.sendEmptyMessageDelayed(1, 1000L);
                } else {
                    ObjectAnimator.ofInt(d.this.f7384d.A, "scrollY", 0).setDuration(1500L).start();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: SimpleOptionsScreenController.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    public d(e.p.c.n nVar, f.n.a.v.c.b bVar, f.n.a.h.b bVar2, f.n.a.v.d.c cVar) {
        this.c = nVar;
        this.f7385e = new g(bVar.a);
        this.f7386f = bVar2;
        this.f7387g = bVar2.a();
        this.o = cVar;
    }

    @Override // f.n.a.v.q.b
    public void a() {
        d();
        this.f7392l = CompressionProfile.MEDIUM_FILE;
        q();
    }

    @Override // f.n.a.v.q.b
    public void b() {
        d();
        this.f7392l = CompressionProfile.SMALL_HIGH_QUALITY_FILE;
        q();
    }

    @Override // f.n.a.v.q.b
    public void c() {
        d();
        this.f7392l = CompressionProfile.MEDIUM_HIGH_QUALITY_FILE;
        q();
    }

    public final void d() {
        b bVar;
        if (!this.f7389i && (bVar = this.n) != null) {
            ((f.n.a.v.s.j) bVar).O(false);
        }
        this.f7385e.b.f7407l.setVisibility(8);
    }

    @Override // f.n.a.v.q.b
    public void e() {
        b bVar;
        if (!this.f7389i && (bVar = this.n) != null) {
            ((f.n.a.v.s.j) bVar).O(false);
        }
        g gVar = this.f7385e;
        gVar.b.f7407l.setVisibility(0);
        gVar.b.q.post(new f(gVar));
        this.f7392l = CompressionProfile.CUSTOM_RESOLUTION;
        q();
    }

    @Override // f.n.a.v.q.b
    public void f() {
        d();
        this.f7392l = CompressionProfile.HIGH_QUALITY_FILE;
        q();
    }

    @Override // f.n.a.v.q.b
    public void g(int i2, boolean z) {
        f.n.a.n.j jVar;
        f.n.a.m.c.a aVar;
        double d2;
        int i3 = i2 + 5;
        this.f7385e.c(i3);
        if (z) {
            this.f7385e.b.D.setChecked(true);
        }
        if (this.f7389i || (jVar = this.f7388h) == null) {
            return;
        }
        jVar.c = i3;
        jVar.f7041e = jVar.a.f7025m;
        jVar.f7044h = 1.0d;
        double min = Math.min(1.0d, jVar.f7040d / aVar.n);
        jVar.f7044h = min;
        int ceil = (int) ((jVar.c / 100.0d) * Math.ceil(jVar.f7041e * min));
        jVar.f7041e = ceil;
        jVar.f7042f = (jVar.f7043g / 60000.0d) * ceil * 0.0075d;
        g gVar = this.f7385e;
        int i4 = this.f7388h.f7041e;
        TextView textView = gVar.b.f7404i;
        Locale locale = Locale.US;
        textView.setText(String.format(locale, "%dkbps", Integer.valueOf(i4)));
        b bVar = this.n;
        if (bVar != null) {
            double d3 = this.f7388h.f7042f;
            f.n.a.v.s.j jVar2 = (f.n.a.v.s.j) bVar;
            if (d3 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                f.n.a.v.s.h hVar = jVar2.b;
                hVar.b.f7419i.setVisibility(0);
                hVar.b.f7419i.setText(hVar.a.getString(R.string.not_applicable));
                jVar2.b.b.f7420j.setVisibility(8);
                return;
            }
            f.n.a.v.s.h hVar2 = jVar2.b;
            hVar2.b.f7419i.setVisibility(0);
            hVar2.b.f7419i.setText(String.format(locale, "%.2f MB", Double.valueOf(d3)));
            MediaFile A = jVar2.A();
            Objects.requireNonNull(A);
            try {
                long parseLong = Long.parseLong(A.f1369g);
                DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
                decimalFormatSymbols.setDecimalSeparator('.');
                d2 = Double.valueOf(new DecimalFormat("#.##", decimalFormatSymbols).format(parseLong / 1048576.0d)).doubleValue();
            } catch (Exception unused) {
                d2 = -1.0d;
            }
            if (d2 == -1.0d) {
                jVar2.b.b.f7420j.setVisibility(8);
                return;
            }
            f.n.a.v.s.h hVar3 = jVar2.b;
            hVar3.b.f7420j.setVisibility(0);
            hVar3.b.f7420j.setTypeface(Typeface.DEFAULT);
            hVar3.b.f7420j.setText(String.format(Locale.US, "(%d%% %s)", Integer.valueOf(100 - ((int) ((d3 / d2) * 100.0d))), hVar3.a.getString(R.string.compression)));
        }
    }

    @Override // f.n.a.v.q.b
    public void h() {
        b bVar;
        this.f7385e.b.f7407l.setVisibility(8);
        g gVar = this.f7385e;
        gVar.b.q.post(new f(gVar));
        this.f7392l = CompressionProfile.LOSSY_COMPRESSION;
        k(this.f7384d.f7408m.getProgress(), true);
        s(60);
        if (!this.f7389i && (bVar = this.n) != null) {
            ((f.n.a.v.s.j) bVar).O(true);
        }
        q();
    }

    @Override // f.n.a.v.q.b
    public void i() {
        d();
        this.f7392l = CompressionProfile.LARGE_FILE;
        q();
    }

    @Override // f.n.a.v.q.b
    public void j() {
        d();
        this.f7392l = CompressionProfile.SMALL_FILE;
        q();
    }

    @Override // f.n.a.v.q.b
    public void k(int i2, boolean z) {
        TextView textView = this.f7385e.b.f7405j;
        textView.setText(i2 + "%");
        if (z) {
            this.f7385e.b.D.setChecked(true);
        }
        if (!this.f7389i && z) {
            v(true, i2);
        }
    }

    @Override // f.n.a.v.q.b
    public void l(Item item) {
        if (this.f7389i) {
            if (item.f1395f.equalsIgnoreCase("Original")) {
                return;
            }
            this.f7393m.n = this.f7387g.c(item.f1395f);
            return;
        }
        int c = this.f7387g.c(item.f1395f);
        this.f7393m.n = c;
        f.n.a.n.j jVar = this.f7388h;
        jVar.f7040d = c;
        jVar.b = (int) ((c / jVar.a.n) * 100.0f);
    }

    @Override // f.n.a.v.q.b
    public void m() {
        this.p.removeCallbacksAndMessages(null);
    }

    @Override // f.n.a.v.q.b
    public void n() {
        d();
        this.f7392l = CompressionProfile.CUSTOM;
        q();
    }

    @Override // f.n.a.v.q.b
    public void o() {
        f.n.a.v.f.b bVar = new f.n.a.v.f.b();
        Bundle bundle = new Bundle();
        bundle.putBoolean("check_original", false);
        bVar.setArguments(bundle);
        bVar.s = new c(this);
        bVar.show(this.c.H(), "");
    }

    @Override // f.n.a.v.q.b
    public void p() {
        this.f7392l = CompressionProfile.FIXED_SIZE_COMPRESSION;
        q();
    }

    public final void q() {
        e.a aVar = this.b;
        if (aVar != null) {
            aVar.v(this.f7392l);
        }
    }

    public final void r() {
        if (this.f7389i) {
            this.f7385e.b("33%", "50%", "100%", true);
        } else {
            this.f7385e.b(this.f7387g.b(CompressionProfile.SMALL_FILE, this.f7390j), this.f7387g.b(CompressionProfile.MEDIUM_FILE, this.f7390j), this.f7387g.b(CompressionProfile.LARGE_FILE, this.f7390j), true);
        }
    }

    public final void s(int i2) {
        this.f7385e.b.n.setProgress(i2);
        this.f7385e.c(i2 + 5);
    }

    public void t(ArrayList<MediaFile> arrayList) {
        this.f7389i = true;
        this.f7385e.b.f7404i.setVisibility(8);
        this.f7385e.b.f7403h.setVisibility(8);
        r();
        s(60);
        f.n.a.v.d.c cVar = this.o;
        cVar.r = true;
        cVar.f7142k = cVar.f7139h.a().a(-1, true);
        cVar.n = cVar.f7141j.a(-1.0d, true);
        cVar.r();
    }

    public void u(MediaFile mediaFile, f.n.a.m.c.a aVar) {
        this.f7389i = false;
        this.f7390j = aVar;
        this.f7391k = mediaFile;
        if (aVar.f7025m == 0) {
            g gVar = this.f7385e;
            gVar.b.n.setEnabled(false);
            gVar.b.n.setProgressTintList(ColorStateList.valueOf(-7829368));
            gVar.b.f7406k.setTextColor(-7829368);
            gVar.b.f7404i.setTextColor(-7829368);
        }
        f.n.a.h.b bVar = this.f7386f;
        f.n.a.m.c.a aVar2 = this.f7390j;
        long j2 = this.f7391k.f1374l;
        Objects.requireNonNull(bVar);
        this.f7388h = new f.n.a.n.j(aVar2, j2);
        r();
        v(true, 100);
        s(60);
        f.n.a.v.d.c cVar = this.o;
        cVar.r = false;
        cVar.q = aVar;
        cVar.f7142k = cVar.f7139h.a().a(Math.min(aVar.n, aVar.o), false);
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        try {
            d2 = Double.parseDouble(aVar.s);
        } catch (Exception unused) {
        }
        cVar.n = cVar.f7141j.a(d2, false);
        cVar.r();
    }

    public final void v(boolean z, int i2) {
        if (z) {
            f.n.a.n.j jVar = this.f7388h;
            if (jVar == null) {
                return;
            }
            jVar.b = i2;
            jVar.f7040d = jVar.a();
            g gVar = this.f7385e;
            f.n.a.n.j jVar2 = this.f7388h;
            gVar.d(((int) ((jVar2.b / 100.0d) * jVar2.a.o)) & (-2), jVar2.a());
        } else {
            this.f7385e.b.f7408m.setProgress(i2);
            this.f7385e.d(this.f7388h.b(), this.f7388h.f7040d);
        }
        this.f7385e.b.n.setProgress(95);
        g(90, false);
    }
}
