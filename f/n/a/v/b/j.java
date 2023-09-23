package f.n.a.v.b;

import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.adControllers.AdLoader;
import com.video_converter.video_compressor.constants.User;
import com.video_converter.video_compressor.dialogs.promptdialog.PromptDialogDismissedEvent;
import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.processorFactory.ProcessStatus;
import com.video_converter.video_compressor.screens.homeScreen.HomeScreenActivity;
import com.video_converter.video_compressor.services.BatchProcessingService;
import com.video_converter.video_compressor.services.FFService;
import e.b.c.h;
import f.n.a.e.a;
import f.n.a.x.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: BatchScreenController.java */
/* loaded from: classes2.dex */
public class j implements g, BatchProcessingService.b, ServiceConnection, a.InterfaceC0192a {
    public AdLoader D;
    public AdLoader E;
    public f.n.a.n.c G;

    /* renamed from: f  reason: collision with root package name */
    public e.p.c.n f7101f;

    /* renamed from: g  reason: collision with root package name */
    public n f7102g;

    /* renamed from: h  reason: collision with root package name */
    public f.n.a.d.b f7103h;

    /* renamed from: i  reason: collision with root package name */
    public m f7104i;

    /* renamed from: j  reason: collision with root package name */
    public Handler f7105j;

    /* renamed from: k  reason: collision with root package name */
    public BatchProcessingService f7106k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7107l;
    public f.n.a.x.a n;
    public f.n.a.k.a o;
    public f.n.a.k.b p;
    public m.a.a.c q;
    public f.n.a.d.a r;
    public f.n.a.d.a u;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7108m = true;
    public double s = 1.0d;
    public int t = 0;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;
    public int A = 0;
    public Handler B = new Handler(Looper.getMainLooper());
    public boolean C = false;
    public boolean F = false;
    public boolean H = false;
    public boolean I = false;

    /* compiled from: BatchScreenController.java */
    /* loaded from: classes2.dex */
    public class a implements a.c {
        public a() {
        }

        @Override // f.n.a.e.a.c
        public void a(boolean z) {
            j.this.y = z;
        }

        @Override // f.n.a.e.a.c
        public void b() {
            j.this.x = false;
        }
    }

    /* compiled from: BatchScreenController.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7109f;

        public b(int i2) {
            this.f7109f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = j.this.f7104i;
            mVar.a.o.setProgress(this.f7109f);
        }
    }

    /* compiled from: BatchScreenController.java */
    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ LinearLayout f7111f;

        public c(LinearLayout linearLayout) {
            this.f7111f = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdLoader adLoader = j.this.E;
            if (adLoader != null) {
                adLoader.i();
            }
            j jVar = j.this;
            e.p.c.n nVar = jVar.f7101f;
            jVar.E = new AdLoader(nVar, this.f7111f, nVar);
            j.this.E.f();
        }
    }

    public j(e.p.c.n nVar, f.n.a.d.b bVar, f.n.a.v.c.b bVar2, f.n.a.h.c cVar, f.n.a.k.a aVar, Handler handler) {
        this.f7101f = nVar;
        this.f7103h = bVar;
        m mVar = bVar2.c;
        mVar = mVar == null ? new m(bVar2.a) : mVar;
        bVar2.c = mVar;
        this.f7104i = mVar;
        this.n = cVar.a();
        this.o = aVar;
        this.p = aVar.d();
        this.f7105j = handler;
        this.q = m.a.a.c.b();
    }

    @Override // com.video_converter.video_compressor.services.BatchProcessingService.b
    public void a(double d2, int i2) {
        this.s = d2;
        this.t = i2;
    }

    @Override // com.video_converter.video_compressor.services.BatchProcessingService.b
    public void b() {
        this.f7104i.a.x.setVisibility(8);
        this.f7104i.a.f7115i.setVisibility(8);
        m mVar = this.f7104i;
        mVar.a.f7116j.setVisibility(0);
        ((Animatable) mVar.a.v.getDrawable()).start();
        this.f7104i.a.t.setText(String.valueOf(this.f7103h.f6926e));
        this.f7104i.a.u.setText(String.valueOf(this.f7103h.f6927f));
        t();
        f.l.b.c.j(this.f7101f, Boolean.class, "batch_active", Boolean.FALSE);
        try {
            new Thread(new f.n.a.v.a.d()).start();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f7108m = true;
        this.f7107l = false;
        f.n.a.v.a.j.u(this.f7101f);
        f.n.a.v.a.j.l(this.f7101f, false);
    }

    @Override // f.n.a.x.a.InterfaceC0192a
    public void c() {
        this.f7101f.finish();
    }

    @Override // f.n.a.v.b.g
    public void d(f.n.a.d.a aVar) {
        ProcessingInfo processingInfo = aVar.b;
        f.n.a.v.l.a aVar2 = new f.n.a.v.l.a();
        Bundle bundle = new Bundle();
        bundle.putSerializable("PROCESSING_INFO_KEY", processingInfo);
        bundle.putBoolean("view_only", true);
        aVar2.setArguments(bundle);
        e.p.c.a aVar3 = new e.p.c.a(this.f7101f.H());
        aVar3.h(R.id.fragment_container, aVar2, "PreviewFragment");
        aVar3.c(null);
        aVar3.d();
    }

    @Override // f.n.a.v.b.g
    public void e(LinearLayout linearLayout, int i2) {
        if (linearLayout == null) {
            Log.d("BatchScreenController", "showNativeAd: null");
            return;
        }
        try {
            this.f7104i.a.f7117k.q0(i2);
            new Handler(Looper.getMainLooper()).postDelayed(new c(linearLayout), 2000L);
        } catch (Exception e2) {
            Log.d("BatchScreenController", "showNativeAd: here " + e2);
        }
    }

    @Override // f.n.a.v.b.g
    public void f(f.n.a.d.a aVar) {
        this.u = aVar;
        this.A++;
        this.p.b(this.o.c(), "delete_original");
    }

    @Override // f.n.a.v.b.g
    public void g(f.n.a.d.a aVar) {
        f.n.a.k.g.a e2 = this.o.e(String.format("%s%s", f.n.a.i.b.a, aVar.b.e()));
        this.A++;
        this.p.b(e2, "file_location_info_dialog");
    }

    @Override // f.n.a.v.b.g
    public void h(f.n.a.d.a aVar) {
        if (aVar.b.z == ProcessStatus.ON_PROGRESS) {
            BatchProcessingService batchProcessingService = this.f7106k;
            if (batchProcessingService != null) {
                batchProcessingService.n();
            }
        } else {
            this.f7103h.b().remove(aVar);
        }
        t();
        this.f7104i.c(u());
    }

    @Override // f.n.a.x.a.InterfaceC0192a
    public void i(f.n.a.d.b bVar) {
        this.f7103h.d();
        this.f7103h = bVar;
        if (bVar.f6925d) {
            b();
            return;
        }
        this.f7106k.D = bVar;
        w();
        this.f7104i.a();
        this.f7104i.b();
    }

    @Override // f.n.a.v.b.g
    public void j(f.n.a.d.a aVar) {
        f.n.a.v.a.j.p(this.f7101f, aVar.b, false);
    }

    @Override // f.n.a.v.b.g
    public void k() {
        this.A++;
        f.n.a.k.b bVar = this.p;
        f.n.a.k.a aVar = this.o;
        bVar.b(f.n.a.k.g.a.m(aVar.a.getString(R.string.warning), aVar.a.getString(R.string.clear_all_warning_message), aVar.a.getString(R.string.yes), aVar.a.getString(R.string.no)), "CLEAR_ALL_PROMPT_DIALOG");
    }

    @Override // f.n.a.v.b.g
    public void l() {
        v();
    }

    @Override // com.video_converter.video_compressor.services.BatchProcessingService.b
    public void m(int i2) {
        if (!this.f7107l && !this.v && !this.w) {
            this.v = true;
            if (!User.a()) {
                this.f7101f.runOnUiThread(new k(this));
            }
        }
        this.f7105j.post(new b(((int) (i2 * this.s)) + this.t));
    }

    @Override // f.n.a.v.b.g
    public void n(f.n.a.d.a aVar) {
        f.n.a.v.a.j.m(this.f7101f, aVar.b.f1378i);
    }

    @Override // f.n.a.v.b.g
    public void o() {
        this.A++;
        this.z = true;
        f.n.a.k.b bVar = this.p;
        f.n.a.k.a aVar = this.o;
        bVar.b(f.n.a.k.g.a.m(aVar.a.getString(R.string.warning), aVar.a.getString(R.string.cancell_all_warning_dialog), aVar.a.getString(R.string.yes), aVar.a.getString(R.string.no)), "CANCEL_ALL_PROMPT_DIALOG");
    }

    @m.a.a.l(threadMode = ThreadMode.MAIN)
    public void onEvent(PromptDialogDismissedEvent promptDialogDismissedEvent) {
        f.n.a.d.a aVar;
        this.A--;
        String str = promptDialogDismissedEvent.a;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -410558956:
                if (str.equals("DELETE_FILE_PROMPT_DIALOG")) {
                    c2 = 1;
                    break;
                }
                break;
            case 127940612:
                if (str.equals("browse_file_delete_fail")) {
                    c2 = 5;
                    break;
                }
                break;
            case 247817701:
                if (str.equals("delete_original")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1157396659:
                if (str.equals("CLEAR_ALL_PROMPT_DIALOG")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1594513234:
                if (str.equals("file_location_info_dialog")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1701069760:
                if (str.equals("CANCEL_ALL_PROMPT_DIALOG")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            if (promptDialogDismissedEvent.b == PromptDialogDismissedEvent.ClickedButton.POSITIVE) {
                this.f7103h.d();
                t();
            }
        } else if (c2 == 1) {
            if (promptDialogDismissedEvent.b != PromptDialogDismissedEvent.ClickedButton.POSITIVE || (aVar = this.r) == null) {
                return;
            }
            this.f7103h.b().remove(aVar);
            t();
            this.f7104i.c(u());
            try {
                f.n.a.v.a.e.b(this.f7101f, this.r.b.f1378i);
                e.p.c.n nVar = this.f7101f;
                Toast.makeText(nVar, nVar.getResources().getString(R.string.deleted_successfull), 0).show();
            } catch (Exception unused) {
                Toast.makeText(this.f7101f, "Failed", 0).show();
            }
        } else if (c2 != 2) {
            if (c2 != 3) {
                return;
            }
            if (promptDialogDismissedEvent.b == PromptDialogDismissedEvent.ClickedButton.POSITIVE) {
                f.n.a.d.a aVar2 = this.u;
                if (aVar2 == null) {
                    return;
                }
                try {
                    aVar2.b.W = 3;
                    t();
                    f.n.a.v.a.h.a(Uri.parse(this.u.b.T), this.f7101f, new l(this));
                    return;
                } catch (Exception unused2) {
                    this.u.b.W = 2;
                    Toast.makeText(this.f7101f, "Failed", 0).show();
                    return;
                }
            }
            this.u = null;
        } else {
            if (promptDialogDismissedEvent.b == PromptDialogDismissedEvent.ClickedButton.POSITIVE) {
                m mVar = this.f7104i;
                mVar.a.y.setText(this.f7101f.getString(R.string.cancel_process_hint));
                mVar.a.x.setVisibility(0);
                BatchProcessingService batchProcessingService = this.f7106k;
                batchProcessingService.F = true;
                f.n.a.d.a aVar3 = batchProcessingService.q;
                if (aVar3 != null && aVar3.b.z == ProcessStatus.ON_PROGRESS) {
                    batchProcessingService.n();
                } else {
                    batchProcessingService.G = true;
                }
                for (f.n.a.d.a aVar4 : batchProcessingService.q().b()) {
                    ProcessingInfo processingInfo = aVar4.b;
                    if (processingInfo.z == ProcessStatus.IN_QUEUE) {
                        processingInfo.z = ProcessStatus.FAILED;
                        processingInfo.A = batchProcessingService.getString(R.string.compression_cancelled);
                        batchProcessingService.q().f6927f++;
                    }
                }
                batchProcessingService.H = true;
                batchProcessingService.o();
            }
            if (promptDialogDismissedEvent.b == PromptDialogDismissedEvent.ClickedButton.NEGATIVE) {
                this.z = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f.n.a.v.a.j.l(this.f7101f, true);
        BatchProcessingService batchProcessingService = (BatchProcessingService) FFService.this;
        this.f7106k = batchProcessingService;
        Objects.requireNonNull(batchProcessingService);
        batchProcessingService.A.add(this);
        BatchProcessingService batchProcessingService2 = this.f7106k;
        boolean z = batchProcessingService2.E;
        boolean z2 = this.f7107l;
        if (z) {
            f.n.a.d.b q = batchProcessingService2.q();
            this.f7103h = q;
            if (q.f6925d) {
                b();
                this.H = false;
            } else {
                this.H = true;
                this.f7104i.a();
                this.f7104i.b();
                y(this.f7103h.b);
            }
        } else if (z2 || !this.f7108m) {
            f.n.a.x.a aVar = this.n;
            aVar.c = this;
            aVar.a.f6940f.add(aVar);
            aVar.a.f(f.n.a.i.b.f6955e);
        }
        if (this.f7106k.E) {
            return;
        }
        f.n.a.v.a.j.l(this.f7101f, false);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.d("BatchScreenController", "onServiceDisconnected: ");
    }

    @Override // com.video_converter.video_compressor.services.BatchProcessingService.b
    public void p(int i2) {
        this.f7104i.a.o.setProgress(0);
        y(i2);
    }

    @Override // f.n.a.v.b.g
    public void q(f.n.a.d.a aVar) {
        this.r = aVar;
        this.A++;
        this.p.b(this.o.b(), "DELETE_FILE_PROMPT_DIALOG");
    }

    @Override // f.n.a.v.b.g
    public void r() {
        Log.d("BatchScreenController", "onStartBtnClicked: ");
        this.f7108m = false;
        this.H = true;
        w();
        f.l.b.c.j(this.f7101f, Boolean.class, "batch_active", Boolean.TRUE);
        this.n.e(this.f7103h);
        this.f7104i.a();
        this.f7104i.b();
        e.p.c.n nVar = this.f7101f;
        if (!(Build.VERSION.SDK_INT < 23 || !((PowerManager) nVar.getSystemService("power")).isIgnoringBatteryOptimizations(nVar.getPackageName())) ? false : nVar.getSharedPreferences("video_compressor_shared_pref", 0).getBoolean("bg_dialog_enable", true)) {
            this.w = true;
            this.x = true;
            e.p.c.n nVar2 = this.f7101f;
            f.n.a.e.a aVar = new f.n.a.e.a(nVar2);
            a aVar2 = new a();
            String string = nVar2.getResources().getString(R.string.doze_mode_msg1);
            h.a aVar3 = new h.a(aVar.a);
            View inflate = LayoutInflater.from(aVar.a).inflate(R.layout.enable_bg_processing, (ViewGroup) null, false);
            Button button = (Button) inflate.findViewById(R.id.enable_bg_processing);
            button.setSelected(true);
            CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkBox2);
            checkBox.setChecked(true);
            ((TextView) inflate.findViewById(R.id.textView61)).setText(string);
            ((Button) inflate.findViewById(R.id.pos_btn)).setOnClickListener(new f.n.a.e.b(aVar, aVar2, checkBox));
            checkBox.setOnClickListener(new f.n.a.e.c(aVar));
            button.setOnClickListener(new f.n.a.e.d(aVar, aVar2, checkBox));
            aVar3.setView(inflate);
            aVar3.a.f107l = false;
            aVar.b = aVar3.create();
            if (aVar.a.isFinishing()) {
                return;
            }
            aVar.b.show();
        }
    }

    @Override // f.n.a.v.b.g
    public void s() {
        if (!this.I && f.n.a.v.a.j.b(this.f7101f) && !f.n.a.u.a.e().c()) {
            this.I = true;
            f.n.a.v.a.j.q(this.f7101f);
            return;
        }
        this.f7103h.d();
        Intent intent = new Intent(this.f7101f, HomeScreenActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("show_full_ad", true ^ f.n.a.u.a.e().c());
        this.f7101f.startActivity(intent);
        this.f7101f.finish();
    }

    public void t() {
        if (this.f7103h.c() == 0) {
            this.f7104i.a.w.setVisibility(0);
            this.f7104i.a.f7117k.setVisibility(8);
            this.f7104i.a();
            return;
        }
        m mVar = this.f7104i;
        List<f.n.a.d.a> b2 = this.f7103h.b();
        f.n.a.v.b.p.a aVar = mVar.a.z;
        Objects.requireNonNull(aVar);
        aVar.c = new ArrayList(b2);
        aVar.notifyDataSetChanged();
    }

    public final String u() {
        return String.format(Locale.US, "%d/%d", Integer.valueOf(this.f7103h.b + 1), Integer.valueOf(this.f7103h.c()));
    }

    public void v() {
        if (this.f7101f.H().J() > 0) {
            FragmentManager H = this.f7101f.H();
            H.A(new FragmentManager.m(null, -1, 1), false);
        } else if (!this.H) {
            this.f7101f.finish();
        } else {
            f.n.a.d.b bVar = this.f7103h;
            if (!bVar.c && bVar.f6925d) {
                s();
            } else {
                Toast.makeText(this.f7101f, "Process Active", 0).show();
            }
        }
    }

    public final void w() {
        this.f7103h.c();
        try {
            Intent intent = new Intent(this.f7101f, BatchProcessingService.class);
            if (Build.VERSION.SDK_INT >= 26) {
                this.f7101f.startForegroundService(intent);
            } else {
                this.f7101f.startService(intent);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void x() {
        boolean z = false;
        if (!User.a() && !this.x && !this.y && !this.z && !this.F) {
            f.n.a.v.l.a aVar = (f.n.a.v.l.a) this.f7101f.H().I("PreviewFragment");
            if (!(aVar != null && aVar.isVisible())) {
                if (!(this.A > 0)) {
                    z = true;
                }
            }
        }
        if (z && this.C) {
            n nVar = this.f7102g;
            e.p.c.n nVar2 = this.f7101f;
            Objects.requireNonNull(nVar);
            if (!nVar2.isFinishing() && !nVar2.isDestroyed()) {
                if (nVar.B == null) {
                    nVar.B = f.n.a.v.a.j.j(nVar2, null);
                }
                nVar.B.show();
            }
            if (this.f7105j == null) {
                this.f7105j = new Handler(Looper.getMainLooper());
            }
            this.f7105j.post(new Runnable() { // from class: f.n.a.v.b.f
                @Override // java.lang.Runnable
                public final void run() {
                    j jVar = j.this;
                    Objects.requireNonNull(jVar);
                    if (f.n.a.c.h.f6913h == null) {
                        f.n.a.c.h.f6913h = new f.n.a.c.h(null);
                    }
                    f.n.a.c.h hVar = f.n.a.c.h.f6913h;
                    i.l.b.i.b(hVar);
                    hVar.b(jVar.f7101f.getApplicationContext());
                }
            });
            if (this.f7105j == null) {
                this.f7105j = new Handler(Looper.getMainLooper());
            }
            this.f7105j.postDelayed(new Runnable() { // from class: f.n.a.v.b.e
                @Override // java.lang.Runnable
                public final void run() {
                    j jVar = j.this;
                    if (jVar.C) {
                        if (f.n.a.c.h.f6913h == null) {
                            f.n.a.c.h.f6913h = new f.n.a.c.h(null);
                        }
                        f.n.a.c.h hVar = f.n.a.c.h.f6913h;
                        i.l.b.i.b(hVar);
                        hVar.c(jVar.f7101f, null);
                    }
                    n nVar3 = jVar.f7102g;
                    e.p.c.n nVar4 = jVar.f7101f;
                    if (nVar3.B == null) {
                        nVar3.B = f.n.a.v.a.j.j(nVar4, null);
                    }
                    ProgressDialog progressDialog = nVar3.B;
                    if (progressDialog == null || !progressDialog.isShowing() || nVar4.isFinishing() || nVar4.isDestroyed()) {
                        return;
                    }
                    if (nVar3.B == null) {
                        nVar3.B = f.n.a.v.a.j.j(nVar4, null);
                    }
                    nVar3.B.dismiss();
                }
            }, 1500L);
        }
    }

    public final void y(int i2) {
        if (this.f7103h.b().size() <= i2) {
            return;
        }
        this.f7104i.c(u());
        m mVar = this.f7104i;
        mVar.a.q.setText(this.f7103h.b().get(i2).a.b());
        this.f7104i.a.f7117k.q0(i2);
        t();
    }

    @m.a.a.l(threadMode = ThreadMode.MAIN)
    public void onEvent(f.n.a.o.g gVar) {
        if (this.f7108m) {
            return;
        }
        x();
    }
}
