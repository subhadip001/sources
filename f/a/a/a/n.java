package f.a.a.a;

import androidx.annotation.RecentlyNonNull;
import com.android.billingclient.api.Purchase;
import java.util.List;

/* compiled from: com.android.billingclient:billing-ktx@@4.1.0 */
/* loaded from: classes.dex */
public final class n {
    public final j a;
    public final List b;

    public n(@RecentlyNonNull j jVar, @RecentlyNonNull List<? extends Purchase> list) {
        i.l.b.i.e(jVar, "billingResult");
        i.l.b.i.e(list, "purchasesList");
        this.a = jVar;
        this.b = list;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return i.l.b.i.a(this.a, nVar.a) && i.l.b.i.a(this.b, nVar.b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("PurchasesResult(billingResult=");
        A.append(this.a);
        A.append(", purchasesList=");
        A.append(this.b);
        A.append(')');
        return A.toString();
    }
}
