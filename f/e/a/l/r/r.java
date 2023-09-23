package f.e.a.l.r;

import com.bumptech.glide.Registry;
import f.e.a.l.r.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: MultiModelLoaderFactory.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: e  reason: collision with root package name */
    public static final c f3436e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final n<Object, Object> f3437f = new a();
    public final List<b<?, ?>> a;
    public final c b;
    public final Set<b<?, ?>> c;

    /* renamed from: d  reason: collision with root package name */
    public final e.i.i.c<List<Throwable>> f3438d;

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class a implements n<Object, Object> {
        @Override // f.e.a.l.r.n
        public boolean a(Object obj) {
            return false;
        }

        @Override // f.e.a.l.r.n
        public n.a<Object> b(Object obj, int i2, int i3, f.e.a.l.l lVar) {
            return null;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class b<Model, Data> {
        public final Class<Model> a;
        public final Class<Data> b;
        public final o<? extends Model, ? extends Data> c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.a = cls;
            this.b = cls2;
            this.c = oVar;
        }
    }

    /* compiled from: MultiModelLoaderFactory.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    public r(e.i.i.c<List<Throwable>> cVar) {
        c cVar2 = f3436e;
        this.a = new ArrayList();
        this.c = new HashSet();
        this.f3438d = cVar;
        this.b = cVar2;
    }

    public final <Model, Data> n<Model, Data> a(b<?, ?> bVar) {
        n<Model, Data> nVar = (n<Model, Data>) bVar.c.b(this);
        Objects.requireNonNull(nVar, "Argument must not be null");
        return nVar;
    }

    public synchronized <Model, Data> n<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.a) {
                if (this.c.contains(bVar)) {
                    z = true;
                } else if (bVar.a.isAssignableFrom(cls) && bVar.b.isAssignableFrom(cls2)) {
                    this.c.add(bVar);
                    arrayList.add(a(bVar));
                    this.c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.b;
                e.i.i.c<List<Throwable>> cVar2 = this.f3438d;
                Objects.requireNonNull(cVar);
                return new q(arrayList, cVar2);
            } else if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            } else if (z) {
                return (n<Model, Data>) f3437f;
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public synchronized <Model> List<n<Model, ?>> c(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.a) {
                if (!this.c.contains(bVar) && bVar.a.isAssignableFrom(cls)) {
                    this.c.add(bVar);
                    n<? extends Object, ? extends Object> b2 = bVar.c.b(this);
                    Objects.requireNonNull(b2, "Argument must not be null");
                    arrayList.add(b2);
                    this.c.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized List<Class<?>> d(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.a) {
            if (!arrayList.contains(bVar.b) && bVar.a.isAssignableFrom(cls)) {
                arrayList.add(bVar.b);
            }
        }
        return arrayList;
    }
}
