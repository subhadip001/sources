package f.h.f;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Gson.java */
/* loaded from: classes2.dex */
public class h extends w<AtomicLong> {
    public final /* synthetic */ w a;

    public h(w wVar) {
        this.a = wVar;
    }

    @Override // f.h.f.w
    public AtomicLong a(f.h.f.b0.a aVar) {
        return new AtomicLong(((Number) this.a.a(aVar)).longValue());
    }

    @Override // f.h.f.w
    public void b(f.h.f.b0.b bVar, AtomicLong atomicLong) {
        this.a.b(bVar, Long.valueOf(atomicLong.get()));
    }
}
