package f.e.a.l.q;

import com.bumptech.glide.load.engine.GlideException;
import f.e.a.l.q.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: LoadPath.java */
/* loaded from: classes.dex */
public class t<Data, ResourceType, Transcode> {
    public final e.i.i.c<List<Throwable>> a;
    public final List<? extends j<Data, ResourceType, Transcode>> b;
    public final String c;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<j<Data, ResourceType, Transcode>> list, e.i.i.c<List<Throwable>> cVar) {
        this.a = cVar;
        if (!list.isEmpty()) {
            this.b = list;
            StringBuilder A = f.a.b.a.a.A("Failed LoadPath{");
            A.append(cls.getSimpleName());
            A.append("->");
            A.append(cls2.getSimpleName());
            A.append("->");
            A.append(cls3.getSimpleName());
            A.append("}");
            this.c = A.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public v<Transcode> a(f.e.a.l.p.e<Data> eVar, f.e.a.l.l lVar, int i2, int i3, j.a<ResourceType> aVar) {
        List<Throwable> b = this.a.b();
        Objects.requireNonNull(b, "Argument must not be null");
        List<Throwable> list = b;
        try {
            int size = this.b.size();
            v<Transcode> vVar = null;
            for (int i4 = 0; i4 < size; i4++) {
                try {
                    vVar = this.b.get(i4).a(eVar, i2, i3, lVar, aVar);
                } catch (GlideException e2) {
                    list.add(e2);
                }
                if (vVar != null) {
                    break;
                }
            }
            if (vVar != null) {
                return vVar;
            }
            throw new GlideException(this.c, new ArrayList(list));
        } finally {
            this.a.a(list);
        }
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("LoadPath{decodePaths=");
        A.append(Arrays.toString(this.b.toArray()));
        A.append('}');
        return A.toString();
    }
}
