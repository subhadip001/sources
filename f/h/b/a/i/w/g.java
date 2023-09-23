package f.h.b.a.i.w;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import f.h.b.a.i.w.h.r;
import f.h.b.a.i.w.h.w;
import f.h.b.a.i.w.i.a0;

/* compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* loaded from: classes.dex */
public final class g implements Object<w> {
    public final h.a.a<Context> a;
    public final h.a.a<a0> b;
    public final h.a.a<SchedulerConfig> c;

    /* renamed from: d  reason: collision with root package name */
    public final h.a.a<f.h.b.a.i.y.a> f3729d;

    public g(h.a.a<Context> aVar, h.a.a<a0> aVar2, h.a.a<SchedulerConfig> aVar3, h.a.a<f.h.b.a.i.y.a> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.f3729d = aVar4;
    }

    public Object get() {
        this.f3729d.get();
        return new r(this.a.get(), this.b.get(), this.c.get());
    }
}
