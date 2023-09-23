package g.a.v0;

import g.a.v0.e;
import g.a.w0.f;
import java.util.Objects;

/* compiled from: AbstractStream.java */
/* loaded from: classes2.dex */
public class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f7623f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e.a f7624g;

    public d(e.a aVar, g.b.b bVar, int i2) {
        this.f7624g = aVar;
        this.f7623f = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        g.b.a aVar = g.b.c.a;
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(aVar);
        try {
            this.f7624g.a.f(this.f7623f);
        } catch (Throwable th) {
            try {
                ((f.b) this.f7624g).d(th);
                aVar = g.b.c.a;
            } catch (Throwable th2) {
                Objects.requireNonNull(g.b.c.a);
                throw th2;
            }
        }
        Objects.requireNonNull(aVar);
    }
}
