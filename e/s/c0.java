package e.s;

import e.s.b0;

/* compiled from: ViewModelProvider.kt */
/* loaded from: classes.dex */
public final class c0<VM extends b0> implements i.c<VM> {

    /* renamed from: f  reason: collision with root package name */
    public VM f2810f;

    /* renamed from: g  reason: collision with root package name */
    public final i.o.b<VM> f2811g;

    /* renamed from: h  reason: collision with root package name */
    public final i.l.a.a<i0> f2812h;

    /* renamed from: i  reason: collision with root package name */
    public final i.l.a.a<e0> f2813i;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(i.o.b<VM> bVar, i.l.a.a<? extends i0> aVar, i.l.a.a<? extends e0> aVar2) {
        i.l.b.i.e(bVar, "viewModelClass");
        i.l.b.i.e(aVar, "storeProducer");
        i.l.b.i.e(aVar2, "factoryProducer");
        this.f2811g = bVar;
        this.f2812h = aVar;
        this.f2813i = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i.c
    public Object getValue() {
        VM vm = this.f2810f;
        if (vm == null) {
            e0 c = this.f2813i.c();
            i0 c2 = this.f2812h.c();
            i.o.b<VM> bVar = this.f2811g;
            i.l.b.i.e(bVar, "<this>");
            Class<?> a = ((i.l.b.b) bVar).a();
            i.l.b.i.c(a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            String canonicalName = a.getCanonicalName();
            if (canonicalName != null) {
                String p = f.a.b.a.a.p("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                b0 b0Var = c2.a.get(p);
                if (a.isInstance(b0Var)) {
                    if (c instanceof h0) {
                        ((h0) c).b(b0Var);
                    }
                    vm = (VM) b0Var;
                } else {
                    if (c instanceof f0) {
                        vm = (VM) ((f0) c).c(p, a);
                    } else {
                        vm = c.a(a);
                    }
                    b0 b0Var2 = (b0) c2.a.put(p, vm);
                    if (b0Var2 != null) {
                        b0Var2.b();
                    }
                }
                this.f2810f = (VM) vm;
                i.l.b.i.d(vm, "ViewModelProvider(store,…ed = it\n                }");
            } else {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
        }
        return vm;
    }
}
