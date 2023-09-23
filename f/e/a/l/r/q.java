package f.e.a.l.r;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import f.e.a.l.p.d;
import f.e.a.l.r.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: MultiModelLoader.java */
/* loaded from: classes.dex */
public class q<Model, Data> implements n<Model, Data> {
    public final List<n<Model, Data>> a;
    public final e.i.i.c<List<Throwable>> b;

    /* compiled from: MultiModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> implements f.e.a.l.p.d<Data>, d.a<Data> {

        /* renamed from: f  reason: collision with root package name */
        public final List<f.e.a.l.p.d<Data>> f3429f;

        /* renamed from: g  reason: collision with root package name */
        public final e.i.i.c<List<Throwable>> f3430g;

        /* renamed from: h  reason: collision with root package name */
        public int f3431h;

        /* renamed from: i  reason: collision with root package name */
        public Priority f3432i;

        /* renamed from: j  reason: collision with root package name */
        public d.a<? super Data> f3433j;

        /* renamed from: k  reason: collision with root package name */
        public List<Throwable> f3434k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f3435l;

        public a(List<f.e.a.l.p.d<Data>> list, e.i.i.c<List<Throwable>> cVar) {
            this.f3430g = cVar;
            if (!list.isEmpty()) {
                this.f3429f = list;
                this.f3431h = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        @Override // f.e.a.l.p.d
        public Class<Data> a() {
            return this.f3429f.get(0).a();
        }

        @Override // f.e.a.l.p.d
        public void b() {
            List<Throwable> list = this.f3434k;
            if (list != null) {
                this.f3430g.a(list);
            }
            this.f3434k = null;
            for (f.e.a.l.p.d<Data> dVar : this.f3429f) {
                dVar.b();
            }
        }

        @Override // f.e.a.l.p.d.a
        public void c(Exception exc) {
            List<Throwable> list = this.f3434k;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        @Override // f.e.a.l.p.d
        public void cancel() {
            this.f3435l = true;
            for (f.e.a.l.p.d<Data> dVar : this.f3429f) {
                dVar.cancel();
            }
        }

        @Override // f.e.a.l.p.d
        public DataSource d() {
            return this.f3429f.get(0).d();
        }

        @Override // f.e.a.l.p.d
        public void e(Priority priority, d.a<? super Data> aVar) {
            this.f3432i = priority;
            this.f3433j = aVar;
            this.f3434k = this.f3430g.b();
            this.f3429f.get(this.f3431h).e(priority, this);
            if (this.f3435l) {
                cancel();
            }
        }

        @Override // f.e.a.l.p.d.a
        public void f(Data data) {
            if (data != null) {
                this.f3433j.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.f3435l) {
                return;
            }
            if (this.f3431h < this.f3429f.size() - 1) {
                this.f3431h++;
                e(this.f3432i, this.f3433j);
                return;
            }
            Objects.requireNonNull(this.f3434k, "Argument must not be null");
            this.f3433j.c(new GlideException("Fetch failed", new ArrayList(this.f3434k)));
        }
    }

    public q(List<n<Model, Data>> list, e.i.i.c<List<Throwable>> cVar) {
        this.a = list;
        this.b = cVar;
    }

    @Override // f.e.a.l.r.n
    public boolean a(Model model) {
        for (n<Model, Data> nVar : this.a) {
            if (nVar.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // f.e.a.l.r.n
    public n.a<Data> b(Model model, int i2, int i3, f.e.a.l.l lVar) {
        n.a<Data> b;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        f.e.a.l.j jVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            n<Model, Data> nVar = this.a.get(i4);
            if (nVar.a(model) && (b = nVar.b(model, i2, i3, lVar)) != null) {
                jVar = b.a;
                arrayList.add(b.c);
            }
        }
        if (arrayList.isEmpty() || jVar == null) {
            return null;
        }
        return new n.a<>(jVar, new a(arrayList, this.b));
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("MultiModelLoader{modelLoaders=");
        A.append(Arrays.toString(this.a.toArray()));
        A.append('}');
        return A.toString();
    }
}
