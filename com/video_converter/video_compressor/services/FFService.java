package com.video_converter.video_compressor.services;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.arthenica.ffmpegkit.Chapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.constants.CompressionProfile;
import com.video_converter.video_compressor.constants.TwoPass;
import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.processorFactory.ProcessStatus;
import com.video_converter.video_compressor.services.FFService;
import f.n.a.n.g;
import f.n.a.o.a;
import f.n.a.s.a;
import f.n.a.v.a.h;
import f.n.a.v.a.j;
import f.n.a.w.i;
import f.n.a.w.l;
import f.n.a.w.m;
import f.n.a.x.d;
import f.n.a.y.e;
import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/* loaded from: classes2.dex */
public class FFService extends Service implements a.InterfaceC0181a, d.b {
    public static int z = 30000;

    /* renamed from: f  reason: collision with root package name */
    public f.n.a.g.a f1401f;

    /* renamed from: i  reason: collision with root package name */
    public Handler f1404i;

    /* renamed from: k  reason: collision with root package name */
    public g f1406k;

    /* renamed from: m  reason: collision with root package name */
    public b f1408m;
    public f.n.a.s.a n;
    public d o;
    public ProcessingInfo p;
    public f.n.a.d.a q;
    public boolean r;
    public Random s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public e x;

    /* renamed from: g  reason: collision with root package name */
    public double f1402g = 1.0d;

    /* renamed from: h  reason: collision with root package name */
    public int f1403h = 0;

    /* renamed from: j  reason: collision with root package name */
    public Handler f1405j = new Handler(Looper.getMainLooper());

    /* renamed from: l  reason: collision with root package name */
    public c f1407l = new c();
    public int y = 0;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ProcessingInfo f1409f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ String[] f1410g;

        public a(ProcessingInfo processingInfo, String[] strArr) {
            this.f1409f = processingInfo;
            this.f1410g = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            ProcessingInfo processingInfo = this.f1409f;
            if (processingInfo.Y == ProcessingInfo.PROCESS_STATUS.FIRST_PROCESS && !processingInfo.l()) {
                FFService fFService = FFService.this;
                Bundle bundle = new Bundle();
                bundle.putString(Chapter.KEY_START, String.valueOf(265));
                Log.d("process_stats", "addStartCountToFireBase: ");
                FirebaseAnalytics.getInstance(fFService).logEvent("process_stats", bundle);
            }
            FFService fFService2 = FFService.this;
            int i2 = FFService.z;
            Objects.requireNonNull(fFService2);
            File file = new File(f.n.a.i.b.a);
            if (!file.exists()) {
                file.mkdirs();
            }
            FFService.this.p = this.f1409f;
            try {
                f.n.a.f.a c = f.n.a.f.a.c();
                FFService fFService3 = FFService.this;
                String[] strArr = this.f1410g;
                Objects.requireNonNull(fFService3);
                String str = "";
                for (int i3 = 0; i3 < strArr.length; i3++) {
                    str = str + strArr[i3] + " ";
                }
                c.b().setCommand(c.d(str));
            } catch (Exception unused) {
            }
            Handler handler = FFService.this.f1405j;
            final ProcessingInfo processingInfo2 = this.f1409f;
            handler.post(new Runnable() { // from class: f.n.a.w.b
                @Override // java.lang.Runnable
                public final void run() {
                    FFService.a aVar = FFService.a.this;
                    ProcessingInfo processingInfo3 = processingInfo2;
                    FFService fFService4 = FFService.this;
                    if (processingInfo3 != null && processingInfo3.H == CompressionProfile.FIXED_SIZE_COMPRESSION) {
                        if (processingInfo3.t == TwoPass.PASS_2) {
                            fFService4.f1402g = 0.7d;
                            fFService4.f1403h = 30;
                        } else {
                            fFService4.f1402g = 0.3d;
                            fFService4.f1403h = 0;
                        }
                    } else {
                        fFService4.f1402g = 1.0d;
                        fFService4.f1403h = 0;
                    }
                    FFService.b bVar = fFService4.f1408m;
                    if (bVar != null) {
                        bVar.j(fFService4.f1402g, fFService4.f1403h);
                    }
                    FFService fFService5 = FFService.this;
                    String d2 = processingInfo3.d();
                    f.n.a.n.g gVar = fFService5.f1406k;
                    if (gVar.f7039e) {
                        return;
                    }
                    gVar.b().notify(111, gVar.a(false, d2, null));
                }
            });
            FFService fFService4 = FFService.this;
            fFService4.n.a(this.f1410g, fFService4);
            FFService fFService5 = FFService.this;
            fFService5.r = true;
            if (true ^ fFService5.w) {
                fFService5.k(ProcessStatus.ON_PROGRESS, null);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b(long j2, long j3);

        void e(boolean z, String str);

        void j(double d2, int i2);

        void onFinish();
    }

    /* loaded from: classes2.dex */
    public class c extends Binder {
        public c() {
        }
    }

    @Override // f.n.a.s.a.InterfaceC0181a
    public void a() {
        this.y++;
        StringBuilder A = f.a.b.a.a.A("TESTCUTPROSSSS: onSuccess");
        A.append(this.y);
        Log.d("FFService", A.toString());
        new Thread(new f.n.a.v.a.g(this, this.p.a0, new h.b() { // from class: f.n.a.w.d
            @Override // f.n.a.v.a.h.b
            public final void a() {
                final FFService fFService = FFService.this;
                Objects.requireNonNull(fFService);
                Log.d("FFService", "TESTCUTPROSSSS: onSuccessBackgroundTaskComplete" + fFService.y);
                ProcessingInfo processingInfo = fFService.p;
                if (processingInfo != null && processingInfo.g() == ProcessingInfo.PROCESS_MODE.CUT) {
                    ProcessingInfo processingInfo2 = fFService.p;
                    ProcessingInfo.PROCESS_STATUS process_status = processingInfo2.Y;
                    if (process_status == ProcessingInfo.PROCESS_STATUS.FIRST_PROCESS) {
                        processingInfo2.Y = ProcessingInfo.PROCESS_STATUS.SECOND_PROCESS;
                        processingInfo2.Z = f.n.a.v.a.h.c;
                        String str = f.n.a.v.a.h.a;
                        StringBuilder A2 = f.a.b.a.a.A("file ");
                        A2.append(f.n.a.v.a.h.b);
                        A2.append("\n");
                        f.n.a.v.a.h.c(str, A2.toString(), true);
                    } else if (process_status == ProcessingInfo.PROCESS_STATUS.SECOND_PROCESS) {
                        String str2 = f.n.a.v.a.h.a;
                        StringBuilder A3 = f.a.b.a.a.A("file ");
                        A3.append(f.n.a.v.a.h.c);
                        A3.append("\n");
                        f.n.a.v.a.h.c(str2, A3.toString(), false);
                        ProcessingInfo processingInfo3 = fFService.p;
                        processingInfo3.Y = ProcessingInfo.PROCESS_STATUS.MERGE_PROCESS;
                        processingInfo3.b0 = f.n.a.v.a.h.a;
                    } else {
                        new Thread(new f.n.a.v.a.g(fFService, processingInfo2.a0, new f.n.a.v.a.m())).start();
                        fFService.p.Y = ProcessingInfo.PROCESS_STATUS.SUCCESS;
                    }
                }
                if ((fFService.p.g() != ProcessingInfo.PROCESS_MODE.CUT || fFService.p.Y == ProcessingInfo.PROCESS_STATUS.SUCCESS) && (fFService.w || !fFService.g())) {
                    if (fFService.f1408m != null) {
                        fFService.f1405j.post(new Runnable() { // from class: f.n.a.w.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                FFService.this.f1408m.a();
                            }
                        });
                        Bundle bundle = new Bundle();
                        bundle.putString(FirebaseAnalytics.Param.SUCCESS, String.valueOf(265));
                        Log.d("process_stats", "addSuccessCountToFireBase: ");
                        FirebaseAnalytics.getInstance(fFService).logEvent("process_stats", bundle);
                    }
                    if (!fFService.w && fFService.g()) {
                        ProcessingInfo processingInfo4 = fFService.p;
                        processingInfo4.t = TwoPass.PASS_2;
                        fFService.f1401f.a(processingInfo4).a(null, new k(fFService));
                    } else if (!fFService.w) {
                        fFService.k(ProcessStatus.SUCCESS, null);
                    }
                    if ((!fFService.w) && fFService.f1408m == null) {
                        fFService.f1406k.c(fFService.getString(R.string.compression_successful), fFService.p.d());
                    }
                }
                fFService.j();
            }
        })).start();
    }

    @Override // f.n.a.s.a.InterfaceC0181a
    public void b(long j2, long j3) {
        if (this.p.g() == ProcessingInfo.PROCESS_MODE.CUT) {
            ProcessingInfo.PROCESS_STATUS process_status = this.p.Y;
            if (process_status == ProcessingInfo.PROCESS_STATUS.FIRST_PROCESS) {
                f.l.b.c.k(this, "cut_first_processed_duration", (int) j2);
            } else if (process_status == ProcessingInfo.PROCESS_STATUS.SECOND_PROCESS) {
                j2 += ((Integer) f.l.b.c.b(this, Integer.class, "cut_first_processed_duration")).intValue();
            }
        }
        b bVar = this.f1408m;
        if (bVar != null) {
            double d2 = this.f1402g;
            bVar.b((int) (j2 * d2), (int) (j3 * d2));
        }
        int g2 = ((int) (((int) j.g(j2, this.p.i())) * 1.0d * this.f1402g)) + this.f1403h;
        g gVar = this.f1406k;
        gVar.c.setProgress(f.n.a.i.a.b, g2, false);
        gVar.b().notify(111, gVar.c.build());
    }

    public void d() {
        if (g()) {
            this.p.t = TwoPass.PASS_2;
        }
        f.n.a.s.a aVar = this.n;
        aVar.c = true;
        aVar.a.cancelTask();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
        if (r2.contains("av_interleaved_write_frame()") != false) goto L6;
     */
    @Override // f.n.a.s.a.InterfaceC0181a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(boolean r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.video_converter.video_compressor.services.FFService.e(boolean, java.lang.String):void");
    }

    public void f(String[] strArr, ProcessingInfo processingInfo) {
        new Thread(new a(processingInfo, strArr)).start();
    }

    public final boolean g() {
        TwoPass twoPass;
        ProcessingInfo processingInfo = this.p;
        return processingInfo != null && processingInfo.H == CompressionProfile.FIXED_SIZE_COMPRESSION && (twoPass = processingInfo.t) != null && twoPass == TwoPass.PASS_1;
    }

    public boolean h() {
        return this.r;
    }

    public void j() {
        int i2;
        ProcessingInfo processingInfo;
        ProcessingInfo.PROCESS_STATUS process_status;
        ProcessStatus processStatus;
        if (this.p.g() == ProcessingInfo.PROCESS_MODE.CUT && (process_status = (processingInfo = this.p).Y) != ProcessingInfo.PROCESS_STATUS.SUCCESS && (processStatus = processingInfo.z) != ProcessStatus.CANCELLED && processStatus != ProcessStatus.FAILED) {
            if (process_status == ProcessingInfo.PROCESS_STATUS.SECOND_PROCESS) {
                this.f1401f.a(processingInfo).a(null, new f.n.a.w.j(this));
                return;
            } else if (process_status == ProcessingInfo.PROCESS_STATUS.MERGE_PROCESS) {
                f.n.a.g.c a2 = this.f1401f.a(processingInfo);
                a.b bVar = new a.b();
                bVar.a.addAll(Arrays.asList(f.a.b.a.a.q("-hide_banner -f concat -safe 0 -i ", a2.a.a.b0, " -c copy ").split(" ")));
                if (bVar.b == null) {
                    bVar.b = a2.b(a2.a.a.f1378i);
                }
                f(bVar.c().a(), this.p);
                return;
            } else {
                return;
            }
        }
        ProcessingInfo processingInfo2 = this.p;
        if (processingInfo2.h0 && (i2 = processingInfo2.G) < 3) {
            processingInfo2.h0 = false;
            processingInfo2.G = i2 + 1;
            f.n.a.g.c a3 = f.n.a.h.d.b.c().a().a(processingInfo2);
            Log.d("FFService", "exeCuteCurrentProcess: retrying process ");
            a3.a(null, new m(this, processingInfo2));
            return;
        }
        this.r = false;
        if (!this.w && g()) {
            ProcessingInfo processingInfo3 = this.p;
            processingInfo3.t = TwoPass.PASS_2;
            this.f1401f.a(processingInfo3).a(null, new l(this));
        }
        this.f1405j.post(new Runnable() { // from class: f.n.a.w.e
            @Override // java.lang.Runnable
            public final void run() {
                FFService fFService = FFService.this;
                FFService.b bVar2 = fFService.f1408m;
                if (bVar2 != null) {
                    bVar2.onFinish();
                }
                if (!fFService.w) {
                    fFService.stopForeground(false);
                    f.n.a.n.g gVar = fFService.f1406k;
                    gVar.f7039e = true;
                    gVar.b().cancel(111);
                }
            }
        });
    }

    public void k(ProcessStatus processStatus, String str) {
        ProcessingInfo processingInfo = this.p;
        processingInfo.z = processStatus;
        processingInfo.A = str;
        d dVar = this.o;
        dVar.c = this;
        dVar.a.f6940f.add(dVar);
        dVar.a.g(dVar.b.a.a().h(processingInfo), f.n.a.i.b.c);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f1407l;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f1404i = new i(this);
        this.f1406k = new g(this);
        f.n.a.h.d.b c2 = f.n.a.h.d.b.c();
        this.n = c2.b();
        this.o = c2.d().d();
        this.x = new e(this);
        this.f1401f = c2.a();
        this.f1404i.sendEmptyMessageDelayed(0, 0L);
        FirebaseRemoteConfig firebaseRemoteConfig = f.n.a.u.a.e().a;
        int i2 = firebaseRemoteConfig == null ? 180000 : (int) firebaseRemoteConfig.getLong("batch_ad_interval_frequency");
        z = i2;
        this.v = i2;
        StringBuilder A = f.a.b.a.a.A("onCreate: ");
        A.append(z);
        Log.d("FFService", A.toString());
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Objects.requireNonNull(this.n);
        e eVar = this.x;
        Objects.requireNonNull(eVar);
        try {
            if (eVar.b().isHeld()) {
                eVar.b().release();
            }
        } catch (Exception unused) {
        }
        this.f1404i.removeCallbacksAndMessages(null);
    }

    @Override // f.n.a.s.a.InterfaceC0181a
    public void onFinish() {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        startForeground(111, this.f1406k.a(false, getString(R.string.app_name), getString(R.string.preparing_file)));
        this.x.a();
        return 1;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return true;
    }
}
