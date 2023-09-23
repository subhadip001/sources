package f.j.b.b;

import android.database.Cursor;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e.v.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: BillingDao_Impl.java */
/* loaded from: classes2.dex */
public class d implements Callable<List<f.j.b.c.b>> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f6579f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f6580g;

    public d(b bVar, h hVar) {
        this.f6580g = bVar;
        this.f6579f = hVar;
    }

    @Override // java.util.concurrent.Callable
    public List<f.j.b.c.b> call() {
        Cursor b = e.v.n.b.b(this.f6580g.a, this.f6579f, false, null);
        try {
            int g2 = e.p.a.g(b, "orderId");
            int g3 = e.p.a.g(b, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
            int g4 = e.p.a.g(b, "productId");
            int g5 = e.p.a.g(b, "purchaseTime");
            int g6 = e.p.a.g(b, "purchaseState");
            int g7 = e.p.a.g(b, "purchaseToken");
            int g8 = e.p.a.g(b, "autoRenewing");
            int g9 = e.p.a.g(b, "acknowledged");
            int g10 = e.p.a.g(b, "originalJson");
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(new f.j.b.c.b(b.getString(g2), b.getString(g3), b.getString(g4), b.getLong(g5), b.getInt(g6), b.getString(g7), b.getInt(g8) != 0, b.getInt(g9) != 0, b.getString(g10)));
            }
            return arrayList;
        } finally {
            b.close();
        }
    }

    public void finalize() {
        this.f6579f.release();
    }
}
