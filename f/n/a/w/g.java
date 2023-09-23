package f.n.a.w;

import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.processorFactory.ProcessStatus;
import com.video_converter.video_compressor.services.BatchProcessingService;
import f.n.a.g.c;
import f.n.a.w.g;
import java.util.Locale;
import java.util.Set;

/* compiled from: BatchProcessingService.java */
/* loaded from: classes2.dex */
public class g implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f.n.a.g.c f7518f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h f7519g;

    /* compiled from: BatchProcessingService.java */
    /* loaded from: classes2.dex */
    public class a implements c.a {
        public a() {
        }

        @Override // f.n.a.g.c.a
        public void a(final String[] strArr) {
            final int indexOf = g.this.f7519g.b.q().b().indexOf(g.this.f7519g.b.q);
            if (indexOf == -1) {
                g.this.f7519g.b.p();
                return;
            }
            h hVar = g.this.f7519g;
            final f.n.a.d.a aVar = hVar.a;
            aVar.b.z = ProcessStatus.ON_PROGRESS;
            hVar.b.J.post(new Runnable() { // from class: f.n.a.w.a
                @Override // java.lang.Runnable
                public final void run() {
                    g.a aVar2 = g.a.this;
                    int i2 = indexOf;
                    String[] strArr2 = strArr;
                    f.n.a.d.a aVar3 = aVar;
                    Set<BatchProcessingService.b> set = g.this.f7519g.b.A;
                    if (set != null) {
                        for (BatchProcessingService.b bVar : set) {
                            bVar.p(i2);
                        }
                    }
                    BatchProcessingService batchProcessingService = g.this.f7519g.b;
                    batchProcessingService.D.c = true;
                    batchProcessingService.f(strArr2, aVar3.b);
                    BatchProcessingService batchProcessingService2 = g.this.f7519g.b;
                    f.n.a.n.g gVar = batchProcessingService2.f1406k;
                    boolean z = batchProcessingService2.w;
                    String format = String.format(Locale.US, "(%d/%d) %s", Integer.valueOf(batchProcessingService2.q().b + 1), Integer.valueOf(batchProcessingService2.q().c()), batchProcessingService2.q.b.d());
                    if (gVar.f7039e) {
                        return;
                    }
                    gVar.b().notify(111, gVar.a(z, format, null));
                }
            });
        }
    }

    public g(h hVar, f.n.a.g.c cVar) {
        this.f7519g = hVar;
        this.f7518f = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        h hVar = this.f7519g;
        ProcessingInfo processingInfo = hVar.a.b;
        processingInfo.Z = f.n.a.v.a.h.b(hVar.b, "temp_file_1", processingInfo.a0);
        this.f7518f.a(null, new a());
    }
}
