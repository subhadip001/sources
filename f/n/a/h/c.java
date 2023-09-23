package f.n.a.h;

import f.n.a.x.d;
import f.n.a.x.e;

/* compiled from: TaskFactory.java */
/* loaded from: classes2.dex */
public class c {
    public f.n.a.x.b a;
    public f.n.a.x.c b;
    public d c;

    /* renamed from: d  reason: collision with root package name */
    public e f6942d;

    /* renamed from: e  reason: collision with root package name */
    public f.n.a.x.a f6943e;

    public f.n.a.x.a a() {
        if (this.f6943e == null) {
            this.f6943e = new f.n.a.x.a(b(), c());
        }
        return this.f6943e;
    }

    public f.n.a.x.b b() {
        if (this.a == null) {
            this.a = new f.n.a.x.b();
        }
        return this.a;
    }

    public f.n.a.x.c c() {
        if (this.b == null) {
            this.b = new f.n.a.x.c();
        }
        return this.b;
    }

    public d d() {
        if (this.c == null) {
            this.c = new d(b(), c());
        }
        return this.c;
    }

    public e e() {
        if (this.f6942d == null) {
            this.f6942d = new e(b(), c());
        }
        return this.f6942d;
    }
}
