package f.n.a.v.b;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import f.n.a.v.a.h;

/* compiled from: BatchScreenController.java */
/* loaded from: classes2.dex */
public class l implements h.a {
    public final /* synthetic */ j a;

    public l(j jVar) {
        this.a = jVar;
    }

    @Override // f.n.a.v.a.h.a
    public void a() {
        this.a.B.post(new Runnable() { // from class: f.n.a.v.b.a
            @Override // java.lang.Runnable
            public final void run() {
                l lVar = l.this;
                e.p.c.n nVar = lVar.a.f7101f;
                if (nVar == null || nVar.isDestroyed() || lVar.a.f7101f.isFinishing()) {
                    return;
                }
                j jVar = lVar.a;
                jVar.u.b.W = 1;
                jVar.t();
            }
        });
    }

    @Override // f.n.a.v.a.h.a
    public void b(final Throwable th) {
        this.a.B.post(new Runnable() { // from class: f.n.a.v.b.b
            @Override // java.lang.Runnable
            public final void run() {
                l lVar = l.this;
                Throwable th2 = th;
                e.p.c.n nVar = lVar.a.f7101f;
                if (nVar == null || nVar.isDestroyed() || lVar.a.f7101f.isFinishing()) {
                    return;
                }
                if (th2 != null) {
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    StringBuilder A = f.a.b.a.a.A("Original file uri -> ");
                    A.append(lVar.a.u.b.T);
                    firebaseCrashlytics.log(A.toString());
                    FirebaseCrashlytics.getInstance().recordException(th2);
                }
                f.a.b.a.a.M(FirebaseAnalytics.getInstance(lVar.a.f7101f), "Failed_to_delete_original_file");
                j jVar = lVar.a;
                jVar.A++;
                jVar.p.b(jVar.o.a(), "browse_file_delete_fail");
                j jVar2 = lVar.a;
                jVar2.u.b.W = 2;
                jVar2.t();
            }
        });
    }
}
