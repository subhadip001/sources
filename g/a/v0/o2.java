package g.a.v0;

import g.a.v0.n2;

/* compiled from: SharedResourceHolder.java */
/* loaded from: classes2.dex */
public class o2 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n2.b f7872f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ n2.c f7873g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f7874h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ n2 f7875i;

    public o2(n2 n2Var, n2.b bVar, n2.c cVar, Object obj) {
        this.f7875i = n2Var;
        this.f7872f = bVar;
        this.f7873g = cVar;
        this.f7874h = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f7875i) {
            if (this.f7872f.b == 0) {
                this.f7873g.b(this.f7874h);
                this.f7875i.a.remove(this.f7873g);
                if (this.f7875i.a.isEmpty()) {
                    this.f7875i.c.shutdown();
                    this.f7875i.c = null;
                }
            }
        }
    }
}
