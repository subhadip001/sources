package f.n.a.h.d;

import android.os.Handler;
import android.view.LayoutInflater;
import e.p.c.n;

/* compiled from: ControllerCompositionRoot.java */
/* loaded from: classes2.dex */
public class c {
    public final b a;
    public final n b;
    public f.n.a.v.c.b c;

    /* renamed from: d  reason: collision with root package name */
    public f.n.a.h.b f6948d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f6949e;

    /* renamed from: f  reason: collision with root package name */
    public f.n.a.k.a f6950f;

    /* renamed from: g  reason: collision with root package name */
    public d f6951g;

    /* renamed from: h  reason: collision with root package name */
    public a f6952h;

    /* renamed from: i  reason: collision with root package name */
    public f.n.a.n.d f6953i;

    public c(b bVar, n nVar) {
        this.a = bVar;
        this.b = nVar;
    }

    public f.n.a.d.b a() {
        b bVar = this.a;
        if (bVar.f6945d == null) {
            bVar.f6945d = new f.n.a.d.b();
        }
        return bVar.f6945d;
    }

    public f.n.a.k.a b() {
        if (this.f6950f == null) {
            this.f6950f = new f.n.a.k.a(this.b);
        }
        return this.f6950f;
    }

    public f.n.a.n.d c() {
        if (this.f6953i == null) {
            this.f6953i = new f.n.a.n.d(this.b);
        }
        return this.f6953i;
    }

    public Handler d() {
        if (this.f6949e == null) {
            this.f6949e = new Handler();
        }
        return this.f6949e;
    }

    public final f.n.a.h.b e() {
        if (this.f6948d == null) {
            this.f6948d = new f.n.a.h.b(this.b);
        }
        return this.f6948d;
    }

    public final f.n.a.h.c f() {
        return this.a.d();
    }

    public final f.n.a.v.c.b g() {
        if (this.c == null) {
            this.c = new f.n.a.v.c.b(this.b);
        }
        return this.c;
    }

    public f.n.a.v.c.c h() {
        return new f.n.a.v.c.c(LayoutInflater.from(this.b));
    }
}
