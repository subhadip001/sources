package f.n.a.v.h;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.Map;

/* compiled from: HomeScreenController.java */
/* loaded from: classes2.dex */
public class f implements OnInitializationCompleteListener {
    public final /* synthetic */ e a;

    public f(e eVar) {
        this.a = eVar;
    }

    @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
    public void onInitializationComplete(InitializationStatus initializationStatus) {
        f.n.a.c.e.a = true;
        for (Map.Entry<String, AdapterStatus> entry : initializationStatus.getAdapterStatusMap().entrySet()) {
            f.n.a.c.e.a = f.n.a.c.e.a && "READY".equals(entry.getValue().getInitializationState().name());
        }
        if (f.n.a.c.e.a) {
            if (f.n.a.c.h.f6913h == null) {
                f.n.a.c.h.f6913h = new f.n.a.c.h(null);
            }
            f.n.a.c.h hVar = f.n.a.c.h.f6913h;
            i.l.b.i.b(hVar);
            hVar.b(this.a.b.getApplicationContext());
            if (f.n.a.c.i.f6918k == null) {
                f.n.a.c.i.f6918k = new f.n.a.c.i(null);
            }
            f.n.a.c.i iVar = f.n.a.c.i.f6918k;
            i.l.b.i.b(iVar);
            iVar.b(this.a.b.getApplicationContext());
        }
    }
}
