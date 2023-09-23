package e.a.e.d;

import android.content.Context;
import android.content.Intent;
import e.a.e.d.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ActivityResultContracts.java */
/* loaded from: classes.dex */
public final class d extends a<String[], Map<String, Boolean>> {
    @Override // e.a.e.d.a
    public Intent a(Context context, String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // e.a.e.d.a
    public a.C0018a<Map<String, Boolean>> b(Context context, String[] strArr) {
        String[] strArr2 = strArr;
        if (strArr2 != null && strArr2.length != 0) {
            e.f.a aVar = new e.f.a();
            boolean z = true;
            for (String str : strArr2) {
                boolean z2 = e.i.c.a.checkSelfPermission(context, str) == 0;
                aVar.put(str, Boolean.valueOf(z2));
                if (!z2) {
                    z = false;
                }
            }
            if (z) {
                return new a.C0018a<>(aVar);
            }
            return null;
        }
        return new a.C0018a<>(Collections.emptyMap());
    }

    @Override // e.a.e.d.a
    public Map<String, Boolean> c(int i2, Intent intent) {
        if (i2 != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null && stringArrayExtra != null) {
            HashMap hashMap = new HashMap();
            int length = stringArrayExtra.length;
            for (int i3 = 0; i3 < length; i3++) {
                hashMap.put(stringArrayExtra[i3], Boolean.valueOf(intArrayExtra[i3] == 0));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
