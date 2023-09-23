package f.h.f.z;

import java.util.Collections;
import java.util.List;

/* compiled from: Excluder.java */
/* loaded from: classes2.dex */
public final class o implements f.h.f.x, Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public static final o f6246h = new o();

    /* renamed from: f  reason: collision with root package name */
    public List<f.h.f.b> f6247f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public List<f.h.f.b> f6248g = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Excluder.java */
    /* loaded from: classes2.dex */
    public class a<T> extends f.h.f.w<T> {
        public f.h.f.w<T> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ f.h.f.j f6249d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f.h.f.a0.a f6250e;

        public a(boolean z, boolean z2, f.h.f.j jVar, f.h.f.a0.a aVar) {
            this.b = z;
            this.c = z2;
            this.f6249d = jVar;
            this.f6250e = aVar;
        }

        @Override // f.h.f.w
        public T a(f.h.f.b0.a aVar) {
            if (this.b) {
                aVar.x0();
                return null;
            }
            f.h.f.w<T> wVar = this.a;
            if (wVar == null) {
                wVar = this.f6249d.f(o.this, this.f6250e);
                this.a = wVar;
            }
            return wVar.a(aVar);
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, T t) {
            if (this.c) {
                bVar.F();
                return;
            }
            f.h.f.w<T> wVar = this.a;
            if (wVar == null) {
                wVar = this.f6249d.f(o.this, this.f6250e);
                this.a = wVar;
            }
            wVar.b(bVar, t);
        }
    }

    @Override // f.h.f.x
    public <T> f.h.f.w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
        Class<? super T> cls = aVar.a;
        boolean c = c(cls);
        boolean z = c || b(cls, true);
        boolean z2 = c || b(cls, false);
        if (z || z2) {
            return new a(z2, z, jVar, aVar);
        }
        return null;
    }

    public final boolean b(Class<?> cls, boolean z) {
        for (f.h.f.b bVar : z ? this.f6247f : this.f6248g) {
            if (bVar.b(cls)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public Object clone() {
        try {
            return (o) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
