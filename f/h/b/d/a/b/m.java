package f.h.b.d.a.b;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class m extends j {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ r f5661h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, f.h.b.d.a.i.m mVar) {
        super(rVar, mVar);
        this.f5661h = rVar;
    }

    @Override // f.h.b.d.a.b.j, f.h.b.d.a.e.k0
    public final void b(List list) {
        this.f5645g.f5688d.c(this.f5644f);
        r.f5686g.d("onGetSessionStates", new Object[0]);
        r rVar = this.f5661h;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bundle bundle = (Bundle) it.next();
            c1 c1Var = rVar.b;
            l2 l2Var = rVar.c;
            ArrayList arrayList2 = new ArrayList();
            b0 b0Var = new a0() { // from class: f.h.b.d.a.b.b0
                @Override // f.h.b.d.a.b.a0
                public final int zza(int i2, String str) {
                    return i2;
                }
            };
            ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
            HashMap hashMap = new HashMap();
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                hashMap.put(str, AssetPackState.i(bundle, str, c1Var, l2Var, b0Var));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                hashMap.put(str2, AssetPackState.h(str2, 4, 0, 0L, 0L, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1, "", ""));
            }
            bundle.getLong("total_bytes_to_download");
            AssetPackState assetPackState = (AssetPackState) hashMap.values().iterator().next();
            if (assetPackState == null) {
                r.f5686g.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            int d2 = assetPackState.d();
            boolean z = true;
            if (d2 != 1 && d2 != 7 && d2 != 2 && d2 != 3) {
                z = false;
            }
            if (z) {
                arrayList.add(assetPackState.c());
            }
        }
        this.f5644f.b(arrayList);
    }
}
