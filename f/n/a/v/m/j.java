package f.n.a.v.m;

import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.adControllers.AdLoader;
import com.video_converter.video_compressor.constants.User;
import com.video_converter.video_compressor.dialogs.promptdialog.PromptDialogDismissedEvent;
import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.processorFactory.ProcessStatus;
import com.video_converter.video_compressor.screens.homeScreen.HomeScreenActivity;
import com.video_converter.video_compressor.screens.splashScreen.SplashScreenActivity;
import com.video_converter.video_compressor.services.FFService;
import f.n.a.e.a;
import f.n.a.g.c;
import f.n.a.v.a.h;
import f.n.a.v.m.j;
import f.n.a.x.d;
import java.io.File;
import java.util.Locale;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: ProcessingScreenController.java */
/* loaded from: classes2.dex */
public class j implements g, FFService.b, ServiceConnection, d.a {
    public AdLoader F;
    public f.n.a.n.c G;

    /* renamed from: f  reason: collision with root package name */
    public e.p.c.n f7301f;

    /* renamed from: g  reason: collision with root package name */
    public f.n.a.v.c.b f7302g;

    /* renamed from: h  reason: collision with root package name */
    public ProcessingInfo f7303h;

    /* renamed from: i  reason: collision with root package name */
    public n f7304i;

    /* renamed from: j  reason: collision with root package name */
    public f.n.a.g.c f7305j;

    /* renamed from: k  reason: collision with root package name */
    public m f7306k;

    /* renamed from: l  reason: collision with root package name */
    public f.n.a.h.c f7307l;

    /* renamed from: m  reason: collision with root package name */
    public f.n.a.x.d f7308m;
    public f.n.a.g.a n;
    public FFService o;
    public boolean p;
    public boolean q;
    public boolean r;
    public Handler s;
    public f.n.a.n.e t;
    public f.n.a.k.a u;
    public f.n.a.k.b v;
    public boolean w;
    public double x = 1.0d;
    public int y = 0;
    public boolean z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public Handler D = new Handler(Looper.getMainLooper());
    public boolean E = false;
    public boolean H = false;

    /* compiled from: ProcessingScreenController.java */
    /* loaded from: classes2.dex */
    public class a implements a.c {
        public a() {
        }

        @Override // f.n.a.e.a.c
        public void a(boolean z) {
            j.this.C = false;
        }

        @Override // f.n.a.e.a.c
        public void b() {
        }
    }

    /* compiled from: ProcessingScreenController.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f7309f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f7310g;

        public b(long j2, long j3) {
            this.f7309f = j2;
            this.f7310g = j3;
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.B = true;
            m mVar = jVar.f7306k;
            long j2 = this.f7309f;
            long j3 = this.f7310g;
            long i2 = jVar.f7303h.i();
            j jVar2 = j.this;
            double d2 = jVar2.x;
            int i3 = jVar2.y;
            boolean z = (d2 == 1.0d && i3 == 0) || (d2 < 1.0d && i3 > 0);
            Objects.requireNonNull(mVar);
            int g2 = ((int) (((int) f.n.a.v.a.j.g(j2, i2)) * 1.0d * d2)) + i3;
            mVar.a.n.setIndeterminate(false);
            mVar.a.n.setProgress(g2);
            mVar.a.f7317j.setText(String.format(Locale.US, "%d%% %s", Integer.valueOf(g2), mVar.b.getString(R.string.compressed)));
            if (!z) {
                j2 = -1;
            }
            mVar.a.f7320m.setText(j2 >= 0 ? f.n.a.v.a.j.e(j2) : "");
            if (!z) {
                j3 = -1;
            }
            mVar.a.f7319l.setText(j3 >= 0 ? f.n.a.v.a.j.f(j3) : "");
        }
    }

    /* compiled from: ProcessingScreenController.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            n nVar = jVar.f7304i;
            e.p.c.n nVar2 = jVar.f7301f;
            if (nVar.L == null) {
                nVar.L = f.n.a.v.a.j.j(nVar2, null);
            }
            ProgressDialog progressDialog = nVar.L;
            if (progressDialog != null && progressDialog.isShowing() && !nVar2.isFinishing() && !nVar2.isDestroyed()) {
                if (nVar.L == null) {
                    nVar.L = f.n.a.v.a.j.j(nVar2, null);
                }
                nVar.L.dismiss();
            }
            if (j.this.E) {
                if (f.n.a.c.h.f6913h == null) {
                    f.n.a.c.h.f6913h = new f.n.a.c.h(null);
                }
                f.n.a.c.h hVar = f.n.a.c.h.f6913h;
                i.l.b.i.b(hVar);
                hVar.c(j.this.f7301f, null);
            }
        }
    }

    /* compiled from: ProcessingScreenController.java */
    /* loaded from: classes2.dex */
    public class d implements h.a {
        public d() {
        }

        @Override // f.n.a.v.a.h.a
        public void a() {
            j.this.D.post(new Runnable() { // from class: f.n.a.v.m.b
                @Override // java.lang.Runnable
                public final void run() {
                    j.d dVar = j.d.this;
                    e.p.c.n nVar = j.this.f7301f;
                    if (nVar == null || nVar.isDestroyed() || j.this.f7301f.isFinishing()) {
                        return;
                    }
                    f.e.a.b.e(j.this.f7304i.E).d(Integer.valueOf((int) R.drawable.ic_delete));
                    n nVar2 = j.this.f7304i;
                    nVar2.E.setEnabled(false);
                    nVar2.E.setText(nVar2.b().getResources().getString(R.string.original_deleted));
                    nVar2.E.setTextColor(-7829368);
                }
            });
        }

        @Override // f.n.a.v.a.h.a
        public void b(final Throwable th) {
            j.this.D.post(new Runnable() { // from class: f.n.a.v.m.c
                @Override // java.lang.Runnable
                public final void run() {
                    j.d dVar = j.d.this;
                    Throwable th2 = th;
                    e.p.c.n nVar = j.this.f7301f;
                    if (nVar == null || nVar.isDestroyed() || j.this.f7301f.isFinishing()) {
                        return;
                    }
                    f.e.a.b.e(j.this.f7304i.E).d(Integer.valueOf((int) R.drawable.ic_delete));
                    if (th2 != null) {
                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                        StringBuilder A = f.a.b.a.a.A("Original file uri -> ");
                        A.append(j.this.f7303h.T);
                        firebaseCrashlytics.log(A.toString());
                        FirebaseCrashlytics.getInstance().recordException(th2);
                    }
                    f.a.b.a.a.M(FirebaseAnalytics.getInstance(j.this.f7301f), "Failed_to_delete_original_file");
                    j jVar = j.this;
                    jVar.v.b(jVar.u.a(), "Browse_File_Delete_Fail");
                    n nVar2 = j.this.f7304i;
                    nVar2.E.setEnabled(false);
                    nVar2.E.setText(nVar2.b().getResources().getString(R.string.original_delete_failed));
                    nVar2.E.setTextColor(-7829368);
                }
            });
        }
    }

    public j(e.p.c.n nVar, f.n.a.v.c.b bVar, f.n.a.h.c cVar, f.n.a.g.a aVar, Handler handler, f.n.a.h.b bVar2, f.n.a.k.a aVar2) {
        this.f7301f = nVar;
        this.f7302g = bVar;
        m mVar = bVar.b;
        mVar = mVar == null ? new m(bVar.a) : mVar;
        bVar.b = mVar;
        this.f7306k = mVar;
        this.f7307l = cVar;
        this.n = aVar;
        this.s = handler;
        if (bVar2.b == null) {
            bVar2.b = new f.n.a.n.e();
        }
        this.t = bVar2.b;
        this.v = aVar2.d();
        this.u = aVar2;
        File file = new File(f.n.a.i.b.a);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0129, code lost:
        if (java.util.Arrays.asList(r7.t.a).contains(r0.p.getExtension()) != false) goto L15;
     */
    @Override // com.video_converter.video_compressor.services.FFService.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.n.a.v.m.j.a():void");
    }

    @Override // com.video_converter.video_compressor.services.FFService.b
    public void b(long j2, long j3) {
        if (!this.p && !this.A) {
            this.A = true;
            if (!User.a()) {
                this.f7301f.runOnUiThread(new k(this));
            }
        }
        this.s.post(new b(j2, j3));
    }

    @Override // f.n.a.v.m.g
    public void c() {
        try {
            f.n.a.f.a.c().e();
        } catch (Exception unused) {
        }
    }

    @Override // f.n.a.v.m.g
    public void d() {
        try {
            boolean z = true;
            if (!this.H && f.n.a.v.a.j.b(this.f7301f) && !f.n.a.u.a.e().c()) {
                this.H = true;
                f.n.a.v.a.j.q(this.f7301f);
                return;
            }
            e.p.c.n nVar = this.f7301f;
            Intent intent = new Intent(this.f7301f, HomeScreenActivity.class);
            if (f.n.a.u.a.e().c()) {
                z = false;
            }
            nVar.startActivity(intent.putExtra("show_full_ad", z));
            this.f7301f.setResult(0);
            this.f7301f.finishAffinity();
        } catch (Exception unused) {
            e.p.c.n nVar2 = this.f7301f;
            Toast.makeText(nVar2, nVar2.getResources().getString(R.string.something_went_wrong), 0).show();
        }
    }

    @Override // com.video_converter.video_compressor.services.FFService.b
    public void e(boolean z, String str) {
        Log.d("ProcessingScreen", "onFailure: " + str);
        this.f7306k.a.f7315h.setVisibility(8);
        m mVar = this.f7306k;
        mVar.a.F.setVisibility(0);
        ((Animatable) mVar.a.G.getDrawable()).start();
        this.f7306k.a.H.setText(str);
        if (str != null && !str.equalsIgnoreCase(this.f7301f.getResources().getString(R.string.compression_cancelled))) {
            this.f7304i.J.setVisibility(0);
        } else {
            this.f7304i.J.setVisibility(8);
        }
        u(false);
        try {
            new Thread(new f.n.a.v.a.c()).start();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f7301f.stopService(new Intent(this.f7301f, FFService.class));
    }

    @Override // f.n.a.v.m.g
    public void f() {
        this.C = true;
        e.p.c.n nVar = this.f7301f;
        new f.n.a.e.a(nVar).b(nVar, null, new a());
    }

    @Override // f.n.a.v.m.g
    public void g() {
        f.n.a.v.l.a aVar = new f.n.a.v.l.a();
        Bundle bundle = new Bundle();
        bundle.putSerializable("PROCESSING_INFO_KEY", this.f7303h);
        bundle.putBoolean("view_only", true);
        aVar.setArguments(bundle);
        e.p.c.a aVar2 = new e.p.c.a(this.f7301f.H());
        aVar2.h(R.id.fragment_container, aVar, null);
        aVar2.c(null);
        aVar2.d();
    }

    @Override // f.n.a.v.m.g
    public void h() {
        if (this.f7301f.isTaskRoot()) {
            this.f7301f.startActivity(new Intent(this.f7301f, HomeScreenActivity.class));
        }
        this.f7301f.finish();
    }

    @Override // f.n.a.v.m.g
    public void i() {
        this.v.b(this.u.b(), "DELETE_FILE");
    }

    @Override // com.video_converter.video_compressor.services.FFService.b
    public void j(double d2, int i2) {
        this.x = d2;
        this.y = i2;
    }

    @Override // f.n.a.v.m.g
    public void k() {
        this.v.b(this.u.c(), "DELETE_ORIGINAL");
    }

    @Override // f.n.a.v.m.g
    public void l() {
        Log.d("ProcessingScreen", "onShareBtnClicked: ");
        f.n.a.v.a.j.p(this.f7301f, this.f7303h, false);
    }

    @Override // f.n.a.v.m.g
    public void m() {
        f.n.a.v.a.j.m(this.f7301f, this.f7303h.f1378i);
    }

    @Override // f.n.a.v.m.g
    public void n() {
        try {
            m mVar = this.f7306k;
            mVar.a.f7317j.setText(mVar.b.getString(R.string.cancelling));
            mVar.a.n.setIndeterminate(true);
            Button button = mVar.a.f7316i;
            button.getBackground().setColorFilter(-7829368, PorterDuff.Mode.MULTIPLY);
            button.setClickable(false);
            this.o.d();
        } catch (NullPointerException unused) {
            f.l.b.c.j(this.f7301f, Boolean.class, "process_active", Boolean.FALSE);
            this.f7301f.finishAffinity();
            this.f7301f.startActivity(new Intent(this.f7301f, SplashScreenActivity.class));
        }
    }

    @Override // f.n.a.v.m.g
    public void o() {
        f.n.a.k.g.a e2 = this.u.e(String.format("%s%s", f.n.a.i.b.a, this.f7303h.e()));
        StringBuilder A = f.a.b.a.a.A("outputLocationClicked: ");
        A.append(this.f7303h.e());
        Log.d("ProcessingScreen", A.toString());
        this.v.b(e2, "FILE_LOCATION_INFO_DIALOG");
    }

    @m.a.a.l(threadMode = ThreadMode.MAIN)
    public void onEvent(PromptDialogDismissedEvent promptDialogDismissedEvent) {
        PromptDialogDismissedEvent.ClickedButton clickedButton = promptDialogDismissedEvent.b;
        PromptDialogDismissedEvent.ClickedButton clickedButton2 = PromptDialogDismissedEvent.ClickedButton.POSITIVE;
        if (clickedButton == clickedButton2 && promptDialogDismissedEvent.a.equals("DELETE_ORIGINAL")) {
            if (this.f7303h != null) {
                f.e.a.b.e(this.f7304i.E).a().z("file:///android_asset/loading_gif.gif");
                f.n.a.v.a.h.a(Uri.parse(this.f7303h.T), this.f7301f, new d());
            }
        } else if (promptDialogDismissedEvent.b == clickedButton2 && promptDialogDismissedEvent.a.equals("DELETE_FILE")) {
            try {
                f.n.a.v.a.e.b(this.f7301f, this.f7303h.f1378i);
                e.p.c.n nVar = this.f7301f;
                Toast.makeText(nVar, nVar.getResources().getString(R.string.deleted_successfull), 0).show();
            } catch (Exception unused) {
                Toast.makeText(this.f7301f, "Failed", 0).show();
            }
            n nVar2 = this.f7304i;
            nVar2.x.setEnabled(false);
            nVar2.x.setColorFilter(-7829368, PorterDuff.Mode.SRC_IN);
            nVar2.y.setEnabled(false);
            nVar2.y.setColorFilter(-7829368, PorterDuff.Mode.SRC_IN);
            nVar2.B.setEnabled(false);
            nVar2.B.setColorFilter(-7829368, PorterDuff.Mode.SRC_IN);
            nVar2.A.setEnabled(false);
            nVar2.A.setColorFilter(-7829368, PorterDuff.Mode.SRC_IN);
            nVar2.C.setEnabled(false);
            nVar2.C.setColorFilter(-7829368, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.video_converter.video_compressor.services.FFService.b
    public void onFinish() {
        f.n.a.v.a.j.l(this.f7301f, false);
        this.r = true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.d("ProcessingScreen", "onServiceConnected: ");
        f.n.a.v.a.j.l(this.f7301f, true);
        FFService fFService = FFService.this;
        this.o = fFService;
        if (fFService.h()) {
            this.f7303h = this.o.p;
        }
        FFService fFService2 = this.o;
        fFService2.f1408m = this;
        if (!fFService2.h() && !this.p && !this.q) {
            s();
        } else if (this.o.h()) {
        } else {
            f.n.a.v.a.j.l(this.f7301f, false);
            Log.d("ProcessingScreen", "trackProcessStatus: invoked");
            f.n.a.x.d d2 = this.f7307l.d();
            this.f7308m = d2;
            d2.f7520d = this;
            d2.a.f6940f.add(d2);
            d2.a.f(f.n.a.i.b.c);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void p(ProcessingInfo processingInfo) {
        this.f7303h = processingInfo;
        if (processingInfo == null) {
            q();
            return;
        }
        Log.d("TESTFAIL", "infoRetrieved: ");
        Log.d("ProcessingScreen", "infoRetrieved: " + new f.h.f.j().h(processingInfo));
        ProcessStatus processStatus = processingInfo.z;
        if (processStatus == ProcessStatus.SUCCESS) {
            a();
        } else if (processStatus == ProcessStatus.FAILED) {
            e(false, processingInfo.A);
        } else if (processStatus == ProcessStatus.ON_PROGRESS) {
            Log.d("TESTFAIL", "handleOnProgressStatus: ");
            FFService fFService = this.o;
            if (fFService != null && !fFService.h()) {
                ProcessingInfo processingInfo2 = this.f7303h;
                if (processingInfo2.G < 3) {
                    this.f7305j = this.n.a(processingInfo2);
                    s();
                }
            }
            e(false, this.f7301f.getString(R.string.compression_fail_msg));
        } else if (processStatus == ProcessStatus.CANCELLED) {
            Log.d("TESTFAIL", "handleOnCancelStatus: ");
            e(true, this.f7301f.getString(R.string.compression_cancelled));
        }
        StringBuilder A = f.a.b.a.a.A("infoRetrieved: ");
        A.append(processingInfo.z);
        Log.d("ProcessingScreen", A.toString());
    }

    public void q() {
        Log.d("TESTFAIL", "infoRetrievingFailed: ");
        e(false, this.f7301f.getString(R.string.compression_fail_msg));
        Log.d("ProcessingScreen", "infoRetrievingFailed: ");
    }

    public void r(Bundle bundle) {
        this.r = bundle.getBoolean("res_shown", this.r);
        this.q = bundle.getBoolean("compress_ongoing", this.q);
        this.A = bundle.getBoolean("full_screen_ad_shown", this.A);
        this.z = bundle.getBoolean("delete_original_file", this.z);
        this.G.c = Boolean.valueOf(bundle.getBoolean("deep_link_handled"));
        StringBuilder A = f.a.b.a.a.A("onRestoreInstanceState ");
        A.append(this.r);
        A.append(" ");
        A.append(this.q);
        A.append(" ");
        A.append(this.A);
        Log.d("TESTCRASH", A.toString());
    }

    public final void s() {
        Log.d("TESTFAIL", "startCompressionService: ");
        ProcessingInfo processingInfo = this.f7303h;
        ProcessStatus processStatus = processingInfo.z;
        if (processStatus == ProcessStatus.SUCCESS) {
            a();
        } else if (processStatus == ProcessStatus.FAILED) {
            e(false, processingInfo.A);
        } else {
            processingInfo.G++;
            this.q = true;
            try {
                Intent intent = new Intent(this.f7301f, FFService.class);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f7301f.startForegroundService(intent);
                } else {
                    this.f7301f.startService(intent);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            new Thread(new Runnable() { // from class: f.n.a.v.m.e
                @Override // java.lang.Runnable
                public final void run() {
                    final j jVar = j.this;
                    ProcessingInfo processingInfo2 = jVar.f7303h;
                    processingInfo2.Z = f.n.a.v.a.h.b(jVar.f7301f, "temp_file_1", processingInfo2.a0);
                    jVar.f7305j.a(null, new c.a() { // from class: f.n.a.v.m.d
                        @Override // f.n.a.g.c.a
                        public final void a(String[] strArr) {
                            j jVar2 = j.this;
                            jVar2.o.f(strArr, jVar2.f7303h);
                            jVar2.u(true);
                        }
                    });
                }
            }).start();
        }
    }

    public final void t() {
        if (User.a() || this.C) {
            return;
        }
        n nVar = this.f7304i;
        e.p.c.n nVar2 = this.f7301f;
        Objects.requireNonNull(nVar);
        if (!nVar2.isFinishing() && !nVar2.isDestroyed()) {
            if (nVar.L == null) {
                nVar.L = f.n.a.v.a.j.j(nVar2, null);
            }
            nVar.L.show();
        }
        if (this.s == null) {
            this.s = new Handler(Looper.getMainLooper());
        }
        this.s.post(new Runnable() { // from class: f.n.a.v.m.f
            @Override // java.lang.Runnable
            public final void run() {
                j jVar = j.this;
                Objects.requireNonNull(jVar);
                if (f.n.a.c.h.f6913h == null) {
                    f.n.a.c.h.f6913h = new f.n.a.c.h(null);
                }
                f.n.a.c.h hVar = f.n.a.c.h.f6913h;
                i.l.b.i.b(hVar);
                hVar.b(jVar.f7301f.getApplicationContext());
            }
        });
        if (this.s == null) {
            this.s = new Handler(Looper.getMainLooper());
        }
        this.s.postDelayed(new c(), 1500L);
    }

    public final void u(boolean z) {
        f.l.b.c.j(this.f7301f, Boolean.class, "process_active", Boolean.valueOf(z));
    }

    @m.a.a.l(threadMode = ThreadMode.MAIN)
    public void onEvent(f.n.a.o.g gVar) {
        if (this.r || !this.B) {
            return;
        }
        t();
    }
}
