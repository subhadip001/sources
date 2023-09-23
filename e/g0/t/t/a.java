package e.g0.t.t;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public class a extends d {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e.g0.t.l f2352g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ UUID f2353h;

    public a(e.g0.t.l lVar, UUID uuid) {
        this.f2352g = lVar;
        this.f2353h = uuid;
    }

    @Override // e.g0.t.t.d
    public void c() {
        WorkDatabase workDatabase = this.f2352g.c;
        workDatabase.c();
        try {
            a(this.f2352g, this.f2353h.toString());
            workDatabase.l();
            workDatabase.g();
            b(this.f2352g);
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
