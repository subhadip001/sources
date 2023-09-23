package f.n.a.m;

import android.app.AlertDialog;
import android.os.Handler;
import android.util.ArrayMap;
import android.util.Log;
import com.arthenica.ffmpegkit.usecase.FFmpegKitUseCase;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.model.MediaFile;
import f.n.a.m.c.c;
import f.n.a.v.s.j;
import f.n.a.v.s.m;
import f.n.a.v.s.n;
import f.n.a.v.s.o;
import f.n.a.v.s.p;
import f.n.a.v.s.q;
import f.n.a.v.s.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: MediaInfoExtractor.java */
/* loaded from: classes2.dex */
public class b implements c.a {
    public FFmpegKitUseCase a;
    public List<f.n.a.m.d.a> b;
    public List<f.n.a.m.c.a> c;

    /* renamed from: d  reason: collision with root package name */
    public List<f.n.a.m.d.a> f7011d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayMap<String, Boolean> f7012e;

    /* renamed from: f  reason: collision with root package name */
    public c f7013f;

    /* renamed from: g  reason: collision with root package name */
    public a f7014g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7015h = false;

    /* renamed from: i  reason: collision with root package name */
    public int f7016i = 0;

    /* renamed from: j  reason: collision with root package name */
    public Handler f7017j;

    /* compiled from: MediaInfoExtractor.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public b(FFmpegKitUseCase fFmpegKitUseCase) {
        this.a = fFmpegKitUseCase;
        if (this.f7013f == null) {
            this.f7013f = new c(fFmpegKitUseCase, this);
        }
        this.c = new ArrayList();
        this.b = new ArrayList();
        this.f7011d = new ArrayList();
        this.f7012e = new ArrayMap<>();
        this.f7017j = new Handler();
        if (fFmpegKitUseCase == null) {
            throw new IllegalArgumentException("Mobile ffmpeg supplied in constructor must not be null");
        }
    }

    public synchronized void a(f.n.a.m.c.a aVar) {
        String str = this.b.get(this.f7016i).a;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.f7012e.get(str))) {
            return;
        }
        this.f7012e.put(str, bool);
        if (aVar == null) {
            this.f7011d.add(this.b.get(this.f7016i));
        } else {
            c();
            aVar.f7022j = this.b.get(this.f7016i).a;
            this.c.add(aVar);
        }
        this.f7016i++;
        e();
    }

    public void b() {
        StringBuilder B = f.a.b.a.a.B("cancel: extraction finished ", 0, " total ");
        B.append(this.b.size());
        Log.d("MEDIAINFOEXTRACTION", B.toString());
        if (this.f7015h) {
            try {
                Objects.requireNonNull((j) this.f7014g);
                this.a.cancelTask();
                this.c.clear();
                this.b.clear();
                Objects.requireNonNull((j) this.f7014g);
                this.f7015h = false;
            } catch (Exception unused) {
                Objects.requireNonNull((j) this.f7014g);
            }
        }
    }

    public void c() {
        this.f7017j.removeCallbacksAndMessages(null);
    }

    public void d() {
        a aVar = this.f7014g;
        final j jVar = (j) aVar;
        jVar.B.addAll(this.c);
        if (jVar.B.size() == 0) {
            new AlertDialog.Builder(jVar.o).setTitle(R.string.no_files_to_compress).setMessage(R.string.no_files_to_compress_msg).setPositiveButton(R.string.dismiss, new o(jVar)).setIcon(17301543).show();
            return;
        }
        List<MediaFile> list = jVar.n;
        if (list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            for (MediaFile mediaFile : jVar.n) {
                boolean z = true;
                for (f.n.a.m.c.a aVar2 : jVar.B) {
                    if (mediaFile.f1372j.toString() == aVar2.f7022j) {
                        z = false;
                    }
                }
                if (z) {
                    arrayList.add(mediaFile);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jVar.n.remove((MediaFile) it.next());
            }
        }
        List<MediaFile> list2 = jVar.n;
        if (list2 != null && list2.size() == 1) {
            jVar.f7435i = false;
            jVar.c = jVar.n.get(0);
        }
        jVar.a.d(jVar.B);
        List<f.n.a.m.c.a> list3 = jVar.B;
        if (list3 != null && list3.size() == 1) {
            f.n.a.m.c.a aVar3 = jVar.B.get(0);
            Log.d("VidCompInputScreenL", "onMediaExtractionFinished: ");
            new Handler().postDelayed(new Runnable() { // from class: f.n.a.v.s.f
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.b.a();
                }
            }, 1000L);
            jVar.f7431e = aVar3;
            if (aVar3.r == null) {
                aVar3.r = new ArrayList<>();
            }
            if (aVar3.r.size() == 0) {
                f.n.a.k.b bVar = jVar.f7433g;
                f.n.a.k.a aVar4 = jVar.f7434h;
                bVar.b(f.n.a.k.e.a.m(aVar4.a.getString(R.string.no_video_stream_found), aVar4.a.getString(R.string.dismiss)), "video_not_found_dialog");
            } else {
                new Handler().postDelayed(new x(jVar), 1000L);
            }
        }
        new Handler().postDelayed(new m(jVar), 300L);
        new n(jVar).start();
    }

    public void e() {
        if (this.f7016i >= this.b.size()) {
            if (this.f7011d.size() != 0) {
                j jVar = (j) this.f7014g;
                if (jVar.o.isFinishing() || jVar.o.isDestroyed()) {
                    return;
                }
                new AlertDialog.Builder(jVar.o).setTitle(R.string.extraction_failed).setMessage(jVar.o.getResources().getString(R.string.failed_msg, Integer.valueOf(jVar.s.f7011d.size()))).setPositiveButton(R.string.retry, new q(jVar)).setNegativeButton(R.string.continue_string, new p(jVar)).setIcon(17301543).show();
                return;
            }
            d();
            return;
        }
        ((j) this.f7014g).b.d(this.f7016i, this.b.size());
        this.f7017j.postDelayed(new f.n.a.m.a(this), FirebaseInAppMessagingDisplay.IMPRESSION_THRESHOLD_MILLIS);
        this.f7015h = true;
        f.n.a.m.d.a aVar = this.b.get(this.f7016i);
        c cVar = this.f7013f;
        String str = aVar.a;
        String str2 = aVar.b;
        long j2 = aVar.c;
        cVar.c = str;
        cVar.f7027d = str2;
        cVar.f7028e = j2;
        Objects.requireNonNull(cVar);
        new Thread(new f.n.a.m.c.b(cVar)).start();
    }
}
