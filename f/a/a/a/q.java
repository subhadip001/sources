package f.a.a.a;

import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class q implements Callable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3073f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m f3074g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ d f3075h;

    public q(d dVar, String str, m mVar) {
        this.f3075h = dVar;
        this.f3073f = str;
        this.f3074g = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Purchase.a aVar;
        Bundle zzi;
        d dVar = this.f3075h;
        String str = this.f3073f;
        String valueOf = String.valueOf(str);
        zzb.zzm("BillingClient", valueOf.length() != 0 ? "Querying owned items, item type: ".concat(valueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle zzg = zzb.zzg(dVar.f3055k, dVar.q, dVar.b);
        String str2 = null;
        while (true) {
            try {
                if (dVar.f3055k) {
                    zzi = dVar.f3050f.zzj(9, dVar.f3049e.getPackageName(), str, str2, zzg);
                } else {
                    zzi = dVar.f3050f.zzi(3, dVar.f3049e.getPackageName(), str, str2);
                }
                j jVar = v.f3089j;
                if (zzi == null) {
                    zzb.zzn("BillingClient", String.format("%s got null owned items list", "getPurchase()"));
                } else {
                    int zzb = zzb.zzb(zzi, "BillingClient");
                    String zzj = zzb.zzj(zzi, "BillingClient");
                    j jVar2 = new j();
                    jVar2.a = zzb;
                    jVar2.b = zzj;
                    if (zzb != 0) {
                        zzb.zzn("BillingClient", String.format("%s failed. Response code: %s", "getPurchase()", Integer.valueOf(zzb)));
                        jVar = jVar2;
                    } else if (zzi.containsKey("INAPP_PURCHASE_ITEM_LIST") && zzi.containsKey("INAPP_PURCHASE_DATA_LIST") && zzi.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                        ArrayList<String> stringArrayList = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                        ArrayList<String> stringArrayList2 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList3 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        if (stringArrayList == null) {
                            zzb.zzn("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", "getPurchase()"));
                        } else if (stringArrayList2 == null) {
                            zzb.zzn("BillingClient", String.format("Bundle returned from %s contains null purchases list.", "getPurchase()"));
                        } else if (stringArrayList3 == null) {
                            zzb.zzn("BillingClient", String.format("Bundle returned from %s contains null signatures list.", "getPurchase()"));
                        } else {
                            jVar = v.f3090k;
                        }
                    } else {
                        zzb.zzn("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", "getPurchase()"));
                    }
                }
                if (jVar != v.f3090k) {
                    aVar = new Purchase.a(jVar, null);
                    break;
                }
                ArrayList<String> stringArrayList4 = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList5 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList6 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i2 = 0; i2 < stringArrayList5.size(); i2++) {
                    String str3 = stringArrayList5.get(i2);
                    String str4 = stringArrayList6.get(i2);
                    String valueOf2 = String.valueOf(stringArrayList4.get(i2));
                    zzb.zzm("BillingClient", valueOf2.length() != 0 ? "Sku is owned: ".concat(valueOf2) : new String("Sku is owned: "));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.a())) {
                            zzb.zzn("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e2) {
                        zzb.zzo("BillingClient", "Got an exception trying to decode the purchase!", e2);
                        aVar = new Purchase.a(v.f3089j, null);
                    }
                }
                str2 = zzi.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf3 = String.valueOf(str2);
                zzb.zzm("BillingClient", valueOf3.length() != 0 ? "Continuation token: ".concat(valueOf3) : new String("Continuation token: "));
                if (TextUtils.isEmpty(str2)) {
                    aVar = new Purchase.a(v.f3090k, arrayList);
                    break;
                }
            } catch (Exception e3) {
                zzb.zzo("BillingClient", "Got exception trying to get purchasesm try to reconnect", e3);
                aVar = new Purchase.a(v.f3091l, null);
            }
        }
        List<Purchase> list = aVar.a;
        if (list != null) {
            ((f) this.f3074g).a(aVar.b, list);
            return null;
        }
        ((f) this.f3074g).a(aVar.b, zzu.zzh());
        return null;
    }
}
