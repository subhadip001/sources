package e.g0.t.t;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public class c extends d {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e.g0.t.l f2356g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f2357h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f2358i;

    public c(e.g0.t.l lVar, String str, boolean z) {
        this.f2356g = lVar;
        this.f2357h = str;
        this.f2358i = z;
    }

    @Override // e.g0.t.t.d
    public void c() {
        WorkDatabase workDatabase = this.f2356g.c;
        workDatabase.c();
        try {
            Iterator it = ((ArrayList) ((e.g0.t.s.r) workDatabase.r()).g(this.f2357h)).iterator();
            while (it.hasNext()) {
                a(this.f2356g, (String) it.next());
            }
            workDatabase.l();
            workDatabase.g();
            if (this.f2358i) {
                b(this.f2356g);
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
