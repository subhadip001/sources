package f.e.a.l.r;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import f.e.a.l.p.d;
import f.e.a.l.r.n;

/* compiled from: UnitModelLoader.java */
/* loaded from: classes.dex */
public class v<Model> implements n<Model, Model> {
    public static final v<?> a = new v<>();

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Model> implements o<Model, Model> {
        public static final a<?> a = new a<>();

        @Override // f.e.a.l.r.o
        public n<Model, Model> b(r rVar) {
            return v.a;
        }
    }

    /* compiled from: UnitModelLoader.java */
    /* loaded from: classes.dex */
    public static class b<Model> implements f.e.a.l.p.d<Model> {

        /* renamed from: f  reason: collision with root package name */
        public final Model f3439f;

        public b(Model model) {
            this.f3439f = model;
        }

        @Override // f.e.a.l.p.d
        public Class<Model> a() {
            return (Class<Model>) this.f3439f.getClass();
        }

        @Override // f.e.a.l.p.d
        public void b() {
        }

        @Override // f.e.a.l.p.d
        public void cancel() {
        }

        @Override // f.e.a.l.p.d
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // f.e.a.l.p.d
        public void e(Priority priority, d.a<? super Model> aVar) {
            aVar.f((Model) this.f3439f);
        }
    }

    @Override // f.e.a.l.r.n
    public boolean a(Model model) {
        return true;
    }

    @Override // f.e.a.l.r.n
    public n.a<Model> b(Model model, int i2, int i3, f.e.a.l.l lVar) {
        return new n.a<>(new f.e.a.q.d(model), new b(model));
    }
}
