package f.j.b.a;

import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import f.a.a.a.a;
import j.a.l0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;

/* compiled from: lambda */
/* loaded from: classes2.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ d a;

    public /* synthetic */ b(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(f.a.a.a.j jVar, List list) {
        boolean z;
        String str;
        d dVar = this.a;
        i.l.b.i.e(dVar, "this$0");
        i.l.b.i.e(jVar, "result");
        if (jVar.a != 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        i.j.d dVar2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                i.l.b.i.d(purchase, "it");
                String str2 = purchase.a;
                i.l.b.i.d(str2, "purchase.originalJson");
                String str3 = purchase.b;
                i.l.b.i.d(str3, "purchase.signature");
                try {
                    Objects.requireNonNull(dVar.b);
                    z = f.j.a.e.g("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvgRz4S58nLax5los3Hs4r5OxhHHxFqoxOCmS6CFU3yescTiDmrQ4i67TOHmQbdGam+Fmfb9vwtmpAgBDhMBzjEhx3TbJ6AR/82j9CZeBuIHWoDKwugHfM23r0wYeEzO4p8yxSnzteRksI2O9DNc8239SdlpaFMiL0tnvTqL1P67AwAeNzaxe6o8MOBNsOuKU6j5Wba515cqf/YA1iYJ462NfS2LdVwRwHvNdFpqZJSkY1enBmH4rGsmUpB7XM8HfE0z4/5Bnzq1pU8/havXYVGc7OErDMTVGWxi57krmVhF/ulRiRCME0iMNuLpRaHjm01gqiFf/HXqvOsyu1mAHCwIDAQAB", str2, str3);
                    if (!z) {
                        try {
                            new Bundle();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                } catch (IOException e3) {
                    Log.e("BillingManager", i.l.b.i.g("Got an exception trying to validate a purchase: ", e3));
                    z = false;
                }
                if (!z) {
                    Log.i("BillingManager", "Got a purchase: " + purchase + "; but signature is bad. Skipping...");
                } else if ((purchase.c.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2) == 1 && !purchase.c.optBoolean("acknowledged", true)) {
                    a.C0064a c0064a = new a.C0064a();
                    c0064a.a = purchase.a();
                    i.l.b.i.d(c0064a, "newBuilder()\n                    .setPurchaseToken(purchase.purchaseToken)");
                    f.n.a.n.i.D(f.n.a.n.i.a(l0.b), null, null, new e(dVar, c0064a, dVar2), 3, null);
                }
                try {
                    str = new f.h.f.j().h(purchase);
                } catch (Exception unused) {
                    str = dVar2;
                }
                String optString = purchase.c.optString("orderId");
                i.l.b.i.d(optString, "it.orderId");
                String optString2 = purchase.c.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
                i.l.b.i.d(optString2, "it.packageName");
                ArrayList arrayList2 = new ArrayList();
                if (purchase.c.has("productIds")) {
                    JSONArray optJSONArray = purchase.c.optJSONArray("productIds");
                    if (optJSONArray != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            arrayList2.add(optJSONArray.optString(i2));
                        }
                    }
                } else if (purchase.c.has("productId")) {
                    arrayList2.add(purchase.c.optString("productId"));
                }
                Object obj = arrayList2.get(0);
                i.l.b.i.d(obj, "it.skus[0]");
                String str4 = (String) obj;
                long optLong = purchase.c.optLong("purchaseTime");
                int i3 = purchase.c.optInt("purchaseState", 1) != 4 ? 1 : 2;
                String a = purchase.a();
                i.l.b.i.d(a, "it.purchaseToken");
                arrayList.add(new f.j.b.c.b(optString, optString2, str4, optLong, i3, a, purchase.c.optBoolean("autoRenewing"), purchase.c.optBoolean("acknowledged", true), str));
                dVar2 = null;
            }
        }
        f.n.a.n.i.D(f.n.a.n.i.a(l0.b), null, null, new f(dVar, arrayList, null), 3, null);
    }
}
