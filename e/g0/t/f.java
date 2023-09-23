package e.g0.t;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.google.logging.type.LogSeverity;
import e.g0.t.s.p;
import e.g0.t.s.q;
import e.g0.t.s.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Schedulers.java */
/* loaded from: classes.dex */
public class f {
    public static final String a = e.g0.k.e("Schedulers");

    public static void a(e.g0.b bVar, WorkDatabase workDatabase, List<e> list) {
        int i2;
        if (list == null || list.size() == 0) {
            return;
        }
        q r = workDatabase.r();
        workDatabase.c();
        try {
            if (Build.VERSION.SDK_INT == 23) {
                i2 = bVar.f2194h / 2;
            } else {
                i2 = bVar.f2194h;
            }
            r rVar = (r) r;
            List<p> c = rVar.c(i2);
            List<p> b = rVar.b(LogSeverity.INFO_VALUE);
            if (((ArrayList) c).size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) c).iterator();
                while (it.hasNext()) {
                    rVar.l(((p) it.next()).a, currentTimeMillis);
                }
            }
            workDatabase.l();
            workDatabase.g();
            ArrayList arrayList = (ArrayList) c;
            if (arrayList.size() > 0) {
                p[] pVarArr = (p[]) arrayList.toArray(new p[arrayList.size()]);
                for (e eVar : list) {
                    if (eVar.c()) {
                        eVar.a(pVarArr);
                    }
                }
            }
            ArrayList arrayList2 = (ArrayList) b;
            if (arrayList2.size() > 0) {
                p[] pVarArr2 = (p[]) arrayList2.toArray(new p[arrayList2.size()]);
                for (e eVar2 : list) {
                    if (!eVar2.c()) {
                        eVar2.a(pVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
