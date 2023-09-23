package f.n.a.m.c;

import com.arthenica.ffmpegkit.usecase.FFmpegKitUseCase;
import f.n.a.n.i;

/* compiled from: MediaInformationExtractor.java */
/* loaded from: classes2.dex */
public class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f7026f;

    public b(c cVar) {
        this.f7026f = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c cVar = this.f7026f;
        if (cVar.f7029f) {
            return;
        }
        cVar.f7029f = true;
        FFmpegKitUseCase fFmpegKitUseCase = cVar.b;
        String w = i.w(cVar.c);
        cVar.c = w;
        fFmpegKitUseCase.execute(new String[]{"-hide_banner", "-i", w}, this.f7026f);
    }
}
