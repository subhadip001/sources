package f.h.f.z.z;

import f.h.f.w;
import f.h.f.x;

/* compiled from: TypeAdapters.java */
/* loaded from: classes2.dex */
public class p implements x {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f.h.f.a0.a f6310f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ w f6311g;

    public p(f.h.f.a0.a aVar, w wVar) {
        this.f6310f = aVar;
        this.f6311g = wVar;
    }

    @Override // f.h.f.x
    public <T> w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
        if (aVar.equals(this.f6310f)) {
            return this.f6311g;
        }
        return null;
    }
}
