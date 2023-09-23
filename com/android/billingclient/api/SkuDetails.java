package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONObject;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public class SkuDetails {
    public final String a;
    public final JSONObject b;

    public SkuDetails(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        if (!TextUtils.isEmpty(jSONObject.optString("productId"))) {
            if (TextUtils.isEmpty(jSONObject.optString(NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE))) {
                throw new IllegalArgumentException("SkuType cannot be empty.");
            }
            return;
        }
        throw new IllegalArgumentException("SKU cannot be empty.");
    }

    public String a() {
        if (this.b.has("original_price")) {
            return this.b.optString("original_price");
        }
        return c();
    }

    public long b() {
        if (this.b.has("original_price_micros")) {
            return this.b.optLong("original_price_micros");
        }
        return this.b.optLong("price_amount_micros");
    }

    public String c() {
        return this.b.optString(FirebaseAnalytics.Param.PRICE);
    }

    public String d() {
        return this.b.optString("productId");
    }

    public String e() {
        return this.b.optString(NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.a, ((SkuDetails) obj).a);
        }
        return false;
    }

    public final String f() {
        return this.b.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? "SkuDetails: ".concat(valueOf) : new String("SkuDetails: ");
    }
}
