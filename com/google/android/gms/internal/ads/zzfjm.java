package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfjm implements zzfjj {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfjr.zza(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.zza);
        int[] iArr = this.zza;
        return zzfjr.zza(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final void zzb(View view, JSONObject jSONObject, zzfji zzfjiVar, boolean z) {
        int i2;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                HashMap hashMap = new HashMap();
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                }
                ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i4));
                    int size2 = arrayList3.size();
                    int i5 = 0;
                    while (true) {
                        i2 = i4 + 1;
                        if (i5 < size2) {
                            zzfjiVar.zza((View) arrayList3.get(i5), this, jSONObject);
                            i5++;
                        }
                    }
                    i4 = i2;
                }
                return;
            }
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                zzfjiVar.zza(viewGroup.getChildAt(i6), this, jSONObject);
            }
        }
    }
}
