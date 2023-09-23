package f.n.a.o;

import com.video_converter.video_compressor.model.AudioFile;
import f.h.f.j;
import f.h.f.n;
import f.h.f.o;
import f.h.f.p;
import f.h.f.r;
import f.h.f.t;
import f.h.f.u;
import f.h.f.z.z.m;
import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: MediaFileInterfaceAdapter.java */
/* loaded from: classes2.dex */
public class b implements o, u {
    @Override // f.h.f.o
    public Object a(p pVar, Type type, n nVar) {
        r a = pVar.a();
        j jVar = m.this.c;
        Objects.requireNonNull(jVar);
        return jVar.b(new f.h.f.z.z.e(a), AudioFile.class);
    }

    @Override // f.h.f.u
    public p b(Object obj, Type type, t tVar) {
        j jVar = m.this.c;
        Objects.requireNonNull(jVar);
        Class<?> cls = obj.getClass();
        f.h.f.z.z.f fVar = new f.h.f.z.z.f();
        jVar.j(obj, cls, fVar);
        return fVar.q0();
    }
}
