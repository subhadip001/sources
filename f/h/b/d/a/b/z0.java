package f.h.b.d.a.b;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: k  reason: collision with root package name */
    public static final f.h.b.d.a.e.f f5775k = new f.h.b.d.a.e.f("ExtractorLooper");
    public final r1 a;
    public final t0 b;
    public final b3 c;

    /* renamed from: d  reason: collision with root package name */
    public final e2 f5776d;

    /* renamed from: e  reason: collision with root package name */
    public final j2 f5777e;

    /* renamed from: f  reason: collision with root package name */
    public final q2 f5778f;

    /* renamed from: g  reason: collision with root package name */
    public final u2 f5779g;

    /* renamed from: h  reason: collision with root package name */
    public final f.h.b.d.a.e.u f5780h;

    /* renamed from: i  reason: collision with root package name */
    public final u1 f5781i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicBoolean f5782j = new AtomicBoolean(false);

    public z0(r1 r1Var, f.h.b.d.a.e.u uVar, t0 t0Var, b3 b3Var, e2 e2Var, j2 j2Var, q2 q2Var, u2 u2Var, u1 u1Var) {
        this.a = r1Var;
        this.f5780h = uVar;
        this.b = t0Var;
        this.c = b3Var;
        this.f5776d = e2Var;
        this.f5777e = j2Var;
        this.f5778f = q2Var;
        this.f5779g = u2Var;
        this.f5781i = u1Var;
    }

    public final void a(final int i2, Exception exc) {
        try {
            final r1 r1Var = this.a;
            r1Var.b(new q1() { // from class: f.h.b.d.a.b.g1
                @Override // f.h.b.d.a.b.q1
                public final Object zza() {
                    r1.this.a(i2).c.f5668d = 5;
                    return null;
                }
            });
            r1 r1Var2 = this.a;
            r1Var2.b(new f1(r1Var2, i2));
        } catch (y0 unused) {
            f5775k.b("Error during error handling: %s", exc.getMessage());
        }
    }
}
