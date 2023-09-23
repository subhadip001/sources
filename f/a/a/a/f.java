package f.a.a.a;

import com.android.billingclient.api.Purchase;
import java.util.List;

/* compiled from: com.android.billingclient:billing-ktx@@4.1.0 */
/* loaded from: classes.dex */
public final class f implements m {
    public final /* synthetic */ j.a.o<n> a;

    public f(j.a.o<n> oVar) {
        this.a = oVar;
    }

    public final void a(j jVar, List<Purchase> list) {
        i.l.b.i.d(jVar, "billingResult");
        i.l.b.i.d(list, "purchases");
        this.a.N(new n(jVar, list));
    }
}
