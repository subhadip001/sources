package f.n.a.v.s;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.video_converter.video_compressor.R;
import java.util.Objects;

/* compiled from: VidCompInputScreenController.java */
/* loaded from: classes2.dex */
public class l implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f7449f;

    public l(j jVar) {
        this.f7449f = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVar = this.f7449f;
        Bundle bundle = new Bundle();
        f.n.a.v.q.e eVar = new f.n.a.v.q.e();
        eVar.setArguments(bundle);
        Fragment fragment = (Fragment) jVar.a.e(jVar.o);
        FragmentManager H = jVar.o.H();
        if ((fragment == null || !"simpleOption".equals(fragment.getTag())) && !H.T()) {
            H.a0(null, -1, 1);
            e.p.c.a aVar = new e.p.c.a(H);
            aVar.c("simpleOption");
            Objects.requireNonNull(jVar.a);
            aVar.h(R.id.simpleOptionsContainer, eVar, "simpleOption");
            if (H.T()) {
                aVar.e();
            } else {
                aVar.d();
            }
        }
    }
}
