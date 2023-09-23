package com.video_converter.video_compressor.services;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.constants.CompressionProfile;
import com.video_converter.video_compressor.constants.TwoPass;
import com.video_converter.video_compressor.model.MediaFile;
import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.processorFactory.ProcessStatus;
import com.video_converter.video_compressor.processorFactory.ProcessorType;
import com.video_converter.video_compressor.services.FFService;
import f.n.a.n.g;
import f.n.a.s.c;
import f.n.a.v.a.e;
import f.n.a.v.a.j;
import f.n.a.w.f;
import f.n.a.w.h;
import f.n.a.x.a;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class BatchProcessingService extends FFService implements a.InterfaceC0192a {
    public c B;
    public f.n.a.x.a C;
    public f.n.a.d.b D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public Handler J;
    public Set<b> A = new HashSet();
    public FFService.b K = new a();

    /* loaded from: classes2.dex */
    public class a implements FFService.b {
        public a() {
        }

        @Override // com.video_converter.video_compressor.services.FFService.b
        public void a() {
            if (BatchProcessingService.m(BatchProcessingService.this)) {
                return;
            }
            BatchProcessingService.this.q.b.d();
            ProcessingInfo processingInfo = BatchProcessingService.this.q.b;
            processingInfo.D = j.f(processingInfo.U);
            processingInfo.E = j.f(e.d(processingInfo.f1378i));
            String str = processingInfo.f1377h;
            processingInfo.F = 100 - ((int) ((e.d(processingInfo.f1378i) / e.d(str)) * 100.0d));
            if (BatchProcessingService.this.q.b.g() == ProcessingInfo.PROCESS_MODE.TRIM || (BatchProcessingService.this.q.b.g() == ProcessingInfo.PROCESS_MODE.CUT && BatchProcessingService.this.q.b.Y == ProcessingInfo.PROCESS_STATUS.SUCCESS)) {
                BatchProcessingService.this.q().f6926e++;
            }
            BatchProcessingService batchProcessingService = BatchProcessingService.this;
            ProcessingInfo processingInfo2 = batchProcessingService.q.b;
            processingInfo2.z = ProcessStatus.SUCCESS;
            j.a(batchProcessingService, processingInfo2.f1378i);
        }

        @Override // com.video_converter.video_compressor.services.FFService.b
        public void b(long j2, long j3) {
            int g2 = (int) j.g(j2, BatchProcessingService.this.q.b.i());
            Set<b> set = BatchProcessingService.this.A;
            if (set != null) {
                for (b bVar : set) {
                    bVar.m(g2);
                }
            }
        }

        @Override // com.video_converter.video_compressor.services.FFService.b
        public void e(boolean z, String str) {
            if (BatchProcessingService.m(BatchProcessingService.this)) {
                BatchProcessingService.this.q.b.t = TwoPass.PASS_2;
            }
            BatchProcessingService.this.q().f6927f++;
            BatchProcessingService batchProcessingService = BatchProcessingService.this;
            ProcessingInfo processingInfo = batchProcessingService.q.b;
            processingInfo.z = ProcessStatus.FAILED;
            processingInfo.A = str;
            if (batchProcessingService.F) {
                batchProcessingService.G = true;
                batchProcessingService.o();
            }
        }

        @Override // com.video_converter.video_compressor.services.FFService.b
        public void j(double d2, int i2) {
            Set<b> set = BatchProcessingService.this.A;
            if (set != null) {
                for (b bVar : set) {
                    bVar.a(d2, i2);
                }
            }
        }

        @Override // com.video_converter.video_compressor.services.FFService.b
        public void onFinish() {
            BatchProcessingService batchProcessingService = BatchProcessingService.this;
            if (batchProcessingService.F) {
                return;
            }
            if (BatchProcessingService.m(batchProcessingService)) {
                BatchProcessingService batchProcessingService2 = BatchProcessingService.this;
                Objects.requireNonNull(batchProcessingService2);
                Log.d("BatchProcessingService", "executePassTwo: ");
                batchProcessingService2.q.b.t = TwoPass.PASS_2;
                f.n.a.g.c a = f.n.a.h.d.b.c().a().a(batchProcessingService2.q.b);
                batchProcessingService2.f1408m = batchProcessingService2.K;
                a.a(null, new f(batchProcessingService2));
                return;
            }
            Objects.requireNonNull(BatchProcessingService.this);
            f.n.a.h.d.b.c().d().a().e(BatchProcessingService.this.q());
            BatchProcessingService.this.p();
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(double d2, int i2);

        void b();

        void m(int i2);

        void p(int i2);
    }

    public static int l(BatchProcessingService batchProcessingService, int i2, int i3) {
        Objects.requireNonNull(batchProcessingService);
        return ((int) ((i2 / 100.0d) * i3)) & (-2);
    }

    public static boolean m(BatchProcessingService batchProcessingService) {
        TwoPass twoPass;
        f.n.a.d.a aVar = batchProcessingService.q;
        if (aVar != null) {
            ProcessingInfo processingInfo = aVar.b;
            if (processingInfo.H == CompressionProfile.FIXED_SIZE_COMPRESSION && (twoPass = processingInfo.t) != null && twoPass == TwoPass.PASS_1) {
                return true;
            }
        }
        return false;
    }

    @Override // f.n.a.x.a.InterfaceC0192a
    public void c() {
        p();
    }

    @Override // com.video_converter.video_compressor.services.FFService
    public boolean h() {
        return this.E;
    }

    @Override // f.n.a.x.a.InterfaceC0192a
    public void i(f.n.a.d.b bVar) {
        this.D.d();
        this.D = bVar;
        p();
    }

    public void n() {
        f.n.a.d.a aVar = this.q;
        if (aVar != null && aVar.b.z == ProcessStatus.ON_PROGRESS) {
            d();
        }
    }

    public final void o() {
        if (this.A != null && this.G && this.H) {
            f.n.a.d.b q = q();
            q.f6925d = true;
            q.c = false;
            for (b bVar : this.A) {
                bVar.b();
            }
            r(false);
        }
    }

    @Override // com.video_converter.video_compressor.services.FFService, android.app.Service
    public void onCreate() {
        super.onCreate();
        f.n.a.h.d.b c = f.n.a.h.d.b.c();
        if (c.f6947f == null) {
            c.f6947f = new c(c.b());
        }
        this.B = c.f6947f;
        this.C = f.n.a.h.d.b.c().d().a();
        this.w = true;
        this.J = new Handler(Looper.getMainLooper());
    }

    @Override // com.video_converter.video_compressor.services.FFService, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        this.E = true;
        startForeground(111, this.f1406k.a(this.w, getString(R.string.batch_processing), getString(R.string.preparing_file)));
        this.x.a();
        p();
        return 1;
    }

    public final void p() {
        f.n.a.d.a aVar;
        Log.d("BatchProcessingService", "executeNextTask: ");
        f.n.a.d.b q = q();
        Objects.requireNonNull(q);
        StringBuilder A = f.a.b.a.a.A("getNextProcess: ");
        A.append(q.c());
        Log.d("BATCH_PROCESSING", A.toString());
        int i2 = 0;
        while (true) {
            if (i2 >= q.c()) {
                break;
            }
            aVar = i2 < q.c() ? q.b().get(i2) : null;
            StringBuilder A2 = f.a.b.a.a.A("getNextProcess: ");
            A2.append(aVar.b.z);
            Log.d("BATCH_PROCESSING", A2.toString());
            if (aVar.b.z == ProcessStatus.IN_QUEUE) {
                q.b = i2;
                break;
            }
            i2++;
        }
        if (!this.I && this.D.b().isEmpty()) {
            this.I = true;
            f.n.a.x.a aVar2 = this.C;
            aVar2.c = this;
            aVar2.a.f6940f.add(aVar2);
            aVar2.a.f(f.n.a.i.b.f6955e);
        } else if (aVar != null && aVar.f6924d == ProcessorType.VIDEO_COMPRESSOR) {
            this.q = aVar;
            MediaFile mediaFile = aVar.a;
            c cVar = this.B;
            cVar.f7078h = mediaFile;
            new Thread(new f.n.a.s.b(cVar, new h(this, aVar))).start();
        } else {
            f.n.a.d.b q2 = q();
            q2.f6925d = true;
            q2.c = false;
            this.C.e(q());
            Set<b> set = this.A;
            if (set != null) {
                for (b bVar : set) {
                    bVar.b();
                }
            }
            r(true);
        }
    }

    public f.n.a.d.b q() {
        if (this.D == null) {
            f.n.a.h.d.b c = f.n.a.h.d.b.c();
            if (c.f6945d == null) {
                c.f6945d = new f.n.a.d.b();
            }
            this.D = c.f6945d;
        }
        return this.D;
    }

    public final void r(boolean z) {
        this.E = false;
        if (z) {
            this.f1406k.c(getString(R.string.batch_processing_finished), String.format(Locale.US, "%s %d\n %s %d", getString(R.string.successful), Integer.valueOf(q().f6926e), getString(R.string.failed), Integer.valueOf(q().f6927f)));
        }
        try {
            String str = f.n.a.i.b.b + File.separator + "passlog.log";
            if (str != null) {
                new Thread(new f.n.a.v.a.f(str)).start();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        stopForeground(true);
        stopSelf();
        g gVar = this.f1406k;
        gVar.f7039e = true;
        gVar.b().cancel(111);
    }
}
