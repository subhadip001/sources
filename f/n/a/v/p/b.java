package f.n.a.v.p;

import android.widget.LinearLayout;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.adControllers.AdLoader;
import e.p.c.n;
import java.util.Objects;
import java.util.Random;

/* compiled from: SettingController.java */
/* loaded from: classes2.dex */
public class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f7373f;

    public b(c cVar) {
        this.f7373f = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        c cVar = this.f7373f;
        n nVar = cVar.b;
        d dVar = cVar.a;
        Objects.requireNonNull(dVar);
        cVar.c = new AdLoader(nVar, (LinearLayout) dVar.a(new Random().nextInt(10) < 5 ? R.id.ad_holder : R.id.ad_holder_top), this.f7373f.b);
        c cVar2 = this.f7373f;
        Objects.requireNonNull(cVar2);
        try {
            cVar2.c.c();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
