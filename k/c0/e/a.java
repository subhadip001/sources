package k.c0.e;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import k.c;
import l.h;
import l.y;
import l.z;

/* compiled from: CacheInterceptor.java */
/* loaded from: classes2.dex */
public class a implements y {

    /* renamed from: f  reason: collision with root package name */
    public boolean f8885f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h f8886g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ c f8887h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ l.g f8888i;

    public a(b bVar, h hVar, c cVar, l.g gVar) {
        this.f8886g = hVar;
        this.f8887h = cVar;
        this.f8888i = gVar;
    }

    @Override // l.y
    public long a0(l.f fVar, long j2) {
        try {
            long a0 = this.f8886g.a0(fVar, j2);
            if (a0 == -1) {
                if (!this.f8885f) {
                    this.f8885f = true;
                    this.f8888i.close();
                }
                return -1L;
            }
            fVar.g(this.f8888i.b(), fVar.f9230g - a0, a0);
            this.f8888i.y();
            return a0;
        } catch (IOException e2) {
            if (!this.f8885f) {
                this.f8885f = true;
                ((c.b) this.f8887h).a();
            }
            throw e2;
        }
    }

    @Override // l.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f8885f && !k.c0.c.j(this, 100, TimeUnit.MILLISECONDS)) {
            this.f8885f = true;
            ((c.b) this.f8887h).a();
        }
        this.f8886g.close();
    }

    @Override // l.y
    public z d() {
        return this.f8886g.d();
    }
}
