package f.h.f;

import com.google.gson.stream.JsonToken;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: TypeAdapter.java */
/* loaded from: classes2.dex */
public class v<T> extends w<T> {
    public final /* synthetic */ w a;

    public v(w wVar) {
        this.a = wVar;
    }

    @Override // f.h.f.w
    public T a(f.h.f.b0.a aVar) {
        if (aVar.s0() == JsonToken.NULL) {
            aVar.i0();
            return null;
        }
        return (T) this.a.a(aVar);
    }

    @Override // f.h.f.w
    public void b(f.h.f.b0.b bVar, T t) {
        if (t == null) {
            bVar.F();
        } else {
            this.a.b(bVar, t);
        }
    }
}
