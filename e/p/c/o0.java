package e.p.c;

import android.view.View;
import e.i.j.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes.dex */
public class o0 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2761f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Map f2762g;

    public o0(n0 n0Var, ArrayList arrayList, Map map) {
        this.f2761f = arrayList;
        this.f2762g = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.f2761f.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f2761f.get(i2);
            AtomicInteger atomicInteger = e.i.j.z.a;
            String k2 = z.i.k(view);
            if (k2 != null) {
                Iterator it = this.f2762g.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (k2.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                z.i.v(view, str);
            }
        }
    }
}
