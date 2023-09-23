package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import f.a.a.a.j;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public class Purchase {
    public final String a;
    public final String b;
    public final JSONObject c;

    /* compiled from: com.android.billingclient:billing@@4.1.0 */
    /* loaded from: classes.dex */
    public static class a {
        public final List a;
        public final j b;

        public a(j jVar, List<Purchase> list) {
            this.a = list;
            this.b = jVar;
        }
    }

    public Purchase(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
    }

    public String a() {
        JSONObject jSONObject = this.c;
        return jSONObject.optString(FirebaseMessagingService.EXTRA_TOKEN, jSONObject.optString("purchaseToken"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Purchase) {
            Purchase purchase = (Purchase) obj;
            return TextUtils.equals(this.a, purchase.a) && TextUtils.equals(this.b, purchase.b);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? "Purchase. Json: ".concat(valueOf) : new String("Purchase. Json: ");
    }
}
