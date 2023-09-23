package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfjl implements zzfjj {
    private final zzfjj zza;

    public zzfjl(zzfjj zzfjjVar) {
        this.zza = zzfjjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final JSONObject zza(View view) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfjj
    public final void zzb(View view, JSONObject jSONObject, zzfji zzfjiVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        zzfja zza = zzfja.zza();
        if (zza != null) {
            Collection<zzfip> zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (zzfip zzfipVar : zzb) {
                View zzf = zzfipVar.zzf();
                if (zzf != null && zzf.isAttachedToWindow() && zzf.isShown()) {
                    View view2 = zzf;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() != 0.0f) {
                                ViewParent parent = view2.getParent();
                                view2 = parent instanceof View ? (View) parent : null;
                            }
                        } else {
                            View rootView = zzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float zza2 = zzfju.zza(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i2 = size2 - 1;
                                    if (zzfju.zza((View) arrayList.get(i2)) <= zza2) {
                                        break;
                                    }
                                    size2 = i2;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            zzfjiVar.zza((View) arrayList.get(i3), this.zza, jSONObject);
        }
    }
}
