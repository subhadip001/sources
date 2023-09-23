package f.e.a.l.r;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: ModelLoader.java */
/* loaded from: classes.dex */
public interface n<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* loaded from: classes.dex */
    public static class a<Data> {
        public final f.e.a.l.j a;
        public final List<f.e.a.l.j> b;
        public final f.e.a.l.p.d<Data> c;

        public a(f.e.a.l.j jVar, f.e.a.l.p.d<Data> dVar) {
            List<f.e.a.l.j> emptyList = Collections.emptyList();
            Objects.requireNonNull(jVar, "Argument must not be null");
            this.a = jVar;
            Objects.requireNonNull(emptyList, "Argument must not be null");
            this.b = emptyList;
            Objects.requireNonNull(dVar, "Argument must not be null");
            this.c = dVar;
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i2, int i3, f.e.a.l.l lVar);
}
