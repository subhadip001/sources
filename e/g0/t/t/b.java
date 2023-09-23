package e.g0.t.t;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public class b extends d {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e.g0.t.l f2354g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f2355h;

    public b(e.g0.t.l lVar, String str) {
        this.f2354g = lVar;
        this.f2355h = str;
    }

    @Override // e.g0.t.t.d
    public void c() {
        WorkDatabase workDatabase = this.f2354g.c;
        workDatabase.c();
        try {
            Iterator it = ((ArrayList) ((e.g0.t.s.r) workDatabase.r()).h(this.f2355h)).iterator();
            while (it.hasNext()) {
                a(this.f2354g, (String) it.next());
            }
            workDatabase.l();
            workDatabase.g();
            b(this.f2354g);
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
