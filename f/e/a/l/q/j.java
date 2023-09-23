package f.e.a.l.q;

import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.GlideException;
import f.e.a.l.q.i;
import f.e.a.l.r.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: DecodePath.java */
/* loaded from: classes.dex */
public class j<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;
    public final List<? extends f.e.a.l.m<DataType, ResourceType>> b;
    public final f.e.a.l.s.h.e<ResourceType, Transcode> c;

    /* renamed from: d  reason: collision with root package name */
    public final e.i.i.c<List<Throwable>> f3347d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3348e;

    /* compiled from: DecodePath.java */
    /* loaded from: classes.dex */
    public interface a<ResourceType> {
    }

    public j(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends f.e.a.l.m<DataType, ResourceType>> list, f.e.a.l.s.h.e<ResourceType, Transcode> eVar, e.i.i.c<List<Throwable>> cVar) {
        this.a = cls;
        this.b = list;
        this.c = eVar;
        this.f3347d = cVar;
        StringBuilder A = f.a.b.a.a.A("Failed DecodePath{");
        A.append(cls.getSimpleName());
        A.append("->");
        A.append(cls2.getSimpleName());
        A.append("->");
        A.append(cls3.getSimpleName());
        A.append("}");
        this.f3348e = A.toString();
    }

    public v<Transcode> a(f.e.a.l.p.e<DataType> eVar, int i2, int i3, f.e.a.l.l lVar, a<ResourceType> aVar) {
        v<ResourceType> vVar;
        f.e.a.l.o oVar;
        EncodeStrategy encodeStrategy;
        f.e.a.l.j eVar2;
        List<Throwable> b = this.f3347d.b();
        Objects.requireNonNull(b, "Argument must not be null");
        List<Throwable> list = b;
        try {
            v<ResourceType> b2 = b(eVar, i2, i3, lVar, list);
            this.f3347d.a(list);
            i.b bVar = (i.b) aVar;
            i iVar = i.this;
            DataSource dataSource = bVar.a;
            Objects.requireNonNull(iVar);
            Class<?> cls = b2.get().getClass();
            f.e.a.l.n nVar = null;
            if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
                f.e.a.l.o g2 = iVar.f3328f.g(cls);
                oVar = g2;
                vVar = g2.b(iVar.f3335m, b2, iVar.q, iVar.r);
            } else {
                vVar = b2;
                oVar = null;
            }
            if (!b2.equals(vVar)) {
                b2.a();
            }
            boolean z = false;
            if (iVar.f3328f.c.a().f675d.a(vVar.c()) != null) {
                nVar = iVar.f3328f.c.a().f675d.a(vVar.c());
                if (nVar != null) {
                    encodeStrategy = nVar.b(iVar.t);
                } else {
                    throw new Registry.NoResultEncoderAvailableException(vVar.c());
                }
            } else {
                encodeStrategy = EncodeStrategy.NONE;
            }
            f.e.a.l.n nVar2 = nVar;
            h<R> hVar = iVar.f3328f;
            f.e.a.l.j jVar = iVar.C;
            List<n.a<?>> c = hVar.c();
            int size = c.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                } else if (c.get(i4).a.equals(jVar)) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            v<ResourceType> vVar2 = vVar;
            if (iVar.s.d(!z, dataSource, encodeStrategy)) {
                if (nVar2 != null) {
                    int ordinal = encodeStrategy.ordinal();
                    if (ordinal == 0) {
                        eVar2 = new e(iVar.C, iVar.n);
                    } else if (ordinal == 1) {
                        eVar2 = new x(iVar.f3328f.c.a, iVar.C, iVar.n, iVar.q, iVar.r, oVar, cls, iVar.t);
                    } else {
                        throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
                    }
                    u<Z> d2 = u.d(vVar);
                    i.c<?> cVar = iVar.f3333k;
                    cVar.a = eVar2;
                    cVar.b = nVar2;
                    cVar.c = d2;
                    vVar2 = d2;
                } else {
                    throw new Registry.NoResultEncoderAvailableException(vVar.get().getClass());
                }
            }
            return this.c.a(vVar2, lVar);
        } catch (Throwable th) {
            this.f3347d.a(list);
            throw th;
        }
    }

    public final v<ResourceType> b(f.e.a.l.p.e<DataType> eVar, int i2, int i3, f.e.a.l.l lVar, List<Throwable> list) {
        int size = this.b.size();
        v<ResourceType> vVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            f.e.a.l.m<DataType, ResourceType> mVar = this.b.get(i4);
            try {
                if (mVar.a(eVar.a(), lVar)) {
                    vVar = mVar.b(eVar.a(), i2, i3, lVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + mVar, e2);
                }
                list.add(e2);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new GlideException(this.f3348e, new ArrayList(list));
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("DecodePath{ dataClass=");
        A.append(this.a);
        A.append(", decoders=");
        A.append(this.b);
        A.append(", transcoder=");
        A.append(this.c);
        A.append('}');
        return A.toString();
    }
}
