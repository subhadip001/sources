package f.n.a.w;

import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.services.FFService;
import f.n.a.g.c;

/* compiled from: FFService.java */
/* loaded from: classes2.dex */
public class m implements c.a {
    public final /* synthetic */ ProcessingInfo a;
    public final /* synthetic */ FFService b;

    public m(FFService fFService, ProcessingInfo processingInfo) {
        this.b = fFService;
        this.a = processingInfo;
    }

    @Override // f.n.a.g.c.a
    public void a(String[] strArr) {
        this.b.f(strArr, this.a);
    }
}
