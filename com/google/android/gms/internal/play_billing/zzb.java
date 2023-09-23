package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import f.a.a.a.a;
import f.a.a.a.i;
import f.a.a.a.j;
import f.a.a.a.k;
import f.a.a.a.l;
import f.a.a.a.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class zzb {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent == null) {
            zzn("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        return zzp(intent.getExtras(), "ProxyBillingActivity");
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzm(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            String name = obj.getClass().getName();
            zzn(str, name.length() != 0 ? "Unexpected type for bundle response code: ".concat(name) : new String("Unexpected type for bundle response code: "));
            return 6;
        }
    }

    public static Bundle zzc(a aVar, String str) {
        return f.a.b.a.a.S("playBillingLibraryVersion", str);
    }

    public static Bundle zzd(k kVar, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    public static Bundle zze(int i2, boolean z, String str, String str2, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        if (i2 >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (i2 >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (i2 >= 14) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            boolean z2 = false;
            boolean z3 = false;
            for (int i3 = 0; i3 < size; i3++) {
                w wVar = (w) arrayList.get(i3);
                arrayList2.add(null);
                z2 |= !TextUtils.isEmpty(null);
                arrayList3.add(null);
                z3 |= !TextUtils.isEmpty(null);
                arrayList4.add(0);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
            if (z3) {
                bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
            }
        }
        return bundle;
    }

    public static Bundle zzf(i iVar, boolean z, boolean z2, boolean z3, String str) {
        Bundle S = f.a.b.a.a.S("playBillingLibraryVersion", str);
        int i2 = iVar.f3069e;
        if (i2 != 0) {
            S.putInt("prorationMode", i2);
        }
        if (!TextUtils.isEmpty(iVar.b)) {
            S.putString("accountId", iVar.b);
        }
        if (!TextUtils.isEmpty(iVar.f3068d)) {
            S.putString("obfuscatedProfileId", iVar.f3068d);
        }
        if (iVar.f3072h) {
            S.putBoolean("vr", true);
        }
        if (!TextUtils.isEmpty(null)) {
            S.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(iVar.c)) {
            S.putString("oldSkuPurchaseToken", iVar.c);
        }
        if (!TextUtils.isEmpty(null)) {
            S.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            S.putString("paymentsPurchaseParams", null);
        }
        if (z && z2) {
            S.putBoolean("enablePendingPurchases", true);
        }
        if (z3) {
            S.putBoolean("enableAlternativeBilling", true);
        }
        return S;
    }

    public static Bundle zzg(boolean z, boolean z2, String str) {
        Bundle S = f.a.b.a.a.S("playBillingLibraryVersion", str);
        if (z && z2) {
            S.putBoolean("enablePendingPurchases", true);
        }
        return S;
    }

    public static j zzh(Intent intent, String str) {
        if (intent == null) {
            zzn("BillingHelper", "Got null intent!");
            j jVar = new j();
            jVar.a = 6;
            jVar.b = "An internal error occurred.";
            return jVar;
        }
        int zzb = zzb(intent.getExtras(), str);
        String zzj = zzj(intent.getExtras(), str);
        j jVar2 = new j();
        jVar2.a = zzb;
        jVar2.b = zzj;
        return jVar2;
    }

    public static l zzi(Bundle bundle, String str) {
        if (bundle == null) {
            return new l(0, null);
        }
        return new l(zzp(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String zzj(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzm(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            String name = obj.getClass().getName();
            zzn(str, name.length() != 0 ? "Unexpected type for debug message: ".concat(name) : new String("Unexpected type for debug message: "));
            return "";
        }
    }

    public static String zzk(int i2) {
        return zza.zza(i2).toString();
    }

    public static List zzl(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList != null && stringArrayList2 != null) {
            int size = stringArrayList.size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Found purchase list of ");
            sb.append(size);
            sb.append(" items");
            zzm("BillingHelper", sb.toString());
            for (int i2 = 0; i2 < stringArrayList.size() && i2 < stringArrayList2.size(); i2++) {
                Purchase zzq = zzq(stringArrayList.get(i2), stringArrayList2.get(i2));
                if (zzq != null) {
                    arrayList.add(zzq);
                }
            }
        } else {
            Purchase zzq2 = zzq(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzq2 == null) {
                zzm("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzq2);
        }
        return arrayList;
    }

    public static void zzm(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void zzn(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzo(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    private static int zzp(Bundle bundle, String str) {
        if (bundle == null) {
            zzn(str, "Unexpected null bundle received!");
            return 0;
        }
        return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    private static Purchase zzq(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e2) {
                zzn("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e2.toString()));
                return null;
            }
        }
        zzm("BillingHelper", "Received a null purchase data.");
        return null;
    }
}
