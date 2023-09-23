package i.j;

import i.j.f;
import i.l.a.p;
import i.l.b.i;
import i.l.b.j;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes2.dex */
public final class c implements f, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public final f f8618f;

    /* renamed from: g  reason: collision with root package name */
    public final f.a f8619g;

    /* compiled from: CoroutineContextImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends j implements p<String, f.a, String> {

        /* renamed from: g  reason: collision with root package name */
        public static final a f8620g = new a();

        public a() {
            super(2);
        }

        @Override // i.l.a.p
        public String k(String str, f.a aVar) {
            String str2 = str;
            f.a aVar2 = aVar;
            i.e(str2, "acc");
            i.e(aVar2, "element");
            if (str2.length() == 0) {
                return aVar2.toString();
            }
            return str2 + ", " + aVar2;
        }
    }

    public c(f fVar, f.a aVar) {
        i.e(fVar, "left");
        i.e(aVar, "element");
        this.f8618f = fVar;
        this.f8619g = aVar;
    }

    public final int b() {
        int i2 = 2;
        c cVar = this;
        while (true) {
            f fVar = cVar.f8618f;
            cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar == null) {
                return i2;
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.b() != b()) {
                return false;
            }
            Objects.requireNonNull(cVar);
            c cVar2 = this;
            while (true) {
                f.a aVar = cVar2.f8619g;
                if (!i.a(cVar.get(aVar.getKey()), aVar)) {
                    z = false;
                    break;
                }
                f fVar = cVar2.f8618f;
                if (fVar instanceof c) {
                    cVar2 = (c) fVar;
                } else {
                    i.c(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    f.a aVar2 = (f.a) fVar;
                    z = i.a(cVar.get(aVar2.getKey()), aVar2);
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // i.j.f
    public <R> R fold(R r, p<? super R, ? super f.a, ? extends R> pVar) {
        i.e(pVar, "operation");
        return pVar.k((Object) this.f8618f.fold(r, pVar), this.f8619g);
    }

    @Override // i.j.f
    public <E extends f.a> E get(f.b<E> bVar) {
        i.e(bVar, "key");
        c cVar = this;
        while (true) {
            E e2 = (E) cVar.f8619g.get(bVar);
            if (e2 != null) {
                return e2;
            }
            f fVar = cVar.f8618f;
            if (fVar instanceof c) {
                cVar = (c) fVar;
            } else {
                return (E) fVar.get(bVar);
            }
        }
    }

    public int hashCode() {
        return this.f8619g.hashCode() + this.f8618f.hashCode();
    }

    @Override // i.j.f
    public f minusKey(f.b<?> bVar) {
        i.e(bVar, "key");
        if (this.f8619g.get(bVar) != null) {
            return this.f8618f;
        }
        f minusKey = this.f8618f.minusKey(bVar);
        return minusKey == this.f8618f ? this : minusKey == h.f8623f ? this.f8619g : new c(minusKey, this.f8619g);
    }

    @Override // i.j.f
    public f plus(f fVar) {
        i.e(fVar, "context");
        return fVar == h.f8623f ? this : (f) fVar.fold(this, g.f8622g);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f8620g)) + ']';
    }
}
