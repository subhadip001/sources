package f.h.b.d.a.b;

import android.os.Handler;
import android.os.Looper;
import f.h.b.d.a.h.b;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class h3 {

    /* renamed from: e  reason: collision with root package name */
    public static final f.h.b.d.a.e.f f5629e = new f.h.b.d.a.e.f("AssetPackManager");
    public final c0 a;
    public final f.h.b.d.a.e.u b;
    public final x c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.b.d.a.e.u f5630d;

    public h3(c0 c0Var, f.h.b.d.a.e.u uVar, x xVar, b bVar, r1 r1Var, c1 c1Var, n0 n0Var, f.h.b.d.a.e.u uVar2, f.h.b.d.a.c.b bVar2, l2 l2Var) {
        new Handler(Looper.getMainLooper());
        this.a = c0Var;
        this.b = uVar;
        this.c = xVar;
        this.f5630d = uVar2;
    }

    public final void a(boolean z) {
        boolean z2;
        x xVar = this.c;
        synchronized (xVar) {
            z2 = xVar.f5816e != null;
        }
        x xVar2 = this.c;
        synchronized (xVar2) {
            xVar2.f5817f = z;
            xVar2.b();
        }
        if (!z || z2) {
            return;
        }
        ((Executor) this.f5630d.zza()).execute(new Runnable() { // from class: f.h.b.d.a.b.g3
            @Override // java.lang.Runnable
            public final void run() {
                h3 h3Var = h3.this;
                u3 u3Var = (u3) h3Var.b.zza();
                c0 c0Var = h3Var.a;
                Objects.requireNonNull(c0Var);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                try {
                    Iterator it = ((ArrayList) c0Var.h()).iterator();
                    while (it.hasNext()) {
                        File file = (File) it.next();
                        String u = c0Var.u(file.getName());
                        g0 g0Var = null;
                        if (u != null) {
                            File file2 = new File(u, "assets");
                            if (!file2.isDirectory()) {
                                c0.c.b("Failed to find assets directory: %s", file2);
                            } else {
                                g0Var = new g0(0, u, file2.getCanonicalPath());
                            }
                        }
                        if (g0Var != null) {
                            hashMap2.put(file.getName(), g0Var);
                        }
                    }
                } catch (IOException e2) {
                    c0.c.b("Could not process directory while scanning installed packs: %s", e2);
                }
                for (String str : hashMap2.keySet()) {
                    hashMap.put(str, Long.valueOf(c0Var.l(str)));
                }
                f.h.b.d.a.i.p d2 = u3Var.d(hashMap);
                final c0 c0Var2 = h3Var.a;
                c0Var2.getClass();
                d2.b((Executor) h3Var.f5630d.zza(), new f.h.b.d.a.i.c() { // from class: f.h.b.d.a.b.f3
                    @Override // f.h.b.d.a.i.c
                    public final void onSuccess(Object obj) {
                        c0 c0Var3 = c0.this;
                        List list = (List) obj;
                        int a = c0Var3.b.a();
                        Iterator it2 = ((ArrayList) c0Var3.h()).iterator();
                        while (it2.hasNext()) {
                            File file3 = (File) it2.next();
                            if (!list.contains(file3.getName()) && c0.d(file3, true) != a) {
                                c0.j(file3);
                            }
                        }
                    }
                });
                d2.b.a(new f.h.b.d.a.i.h((Executor) h3Var.f5630d.zza(), new f.h.b.d.a.i.b() { // from class: f.h.b.d.a.b.e3
                    @Override // f.h.b.d.a.i.b
                    public final void onFailure(Exception exc) {
                        h3.f5629e.e(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
                    }
                }));
                d2.g();
            }
        });
    }
}
