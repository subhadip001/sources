package f.n.a.v.s;

import android.content.DialogInterface;
import java.util.List;

/* compiled from: VidCompInputScreenController.java */
/* loaded from: classes2.dex */
public class q implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f7454f;

    public q(j jVar) {
        this.f7454f = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        f.n.a.m.b bVar = this.f7454f.s;
        bVar.f7015h = false;
        bVar.f7016i = 0;
        List<f.n.a.m.d.a> list = bVar.f7011d;
        bVar.b.clear();
        bVar.b.addAll(list);
        bVar.f7012e.clear();
        bVar.f7011d.clear();
        bVar.e();
    }
}
