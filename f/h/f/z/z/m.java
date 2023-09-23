package f.h.f.z.z;

import f.h.f.u;
import f.h.f.w;
import f.h.f.x;

/* compiled from: TreeTypeAdapter.java */
/* loaded from: classes2.dex */
public final class m<T> extends w<T> {
    public final u<T> a;
    public final f.h.f.o<T> b;
    public final f.h.f.j c;

    /* renamed from: d  reason: collision with root package name */
    public final f.h.f.a0.a<T> f6291d;

    /* renamed from: e  reason: collision with root package name */
    public final x f6292e;

    /* renamed from: f  reason: collision with root package name */
    public final m<T>.b f6293f = new b(null);

    /* renamed from: g  reason: collision with root package name */
    public w<T> f6294g;

    /* compiled from: TreeTypeAdapter.java */
    /* loaded from: classes2.dex */
    public final class b implements f.h.f.t, f.h.f.n {
        public b(a aVar) {
        }
    }

    /* compiled from: TreeTypeAdapter.java */
    /* loaded from: classes2.dex */
    public static final class c implements x {

        /* renamed from: f  reason: collision with root package name */
        public final f.h.f.a0.a<?> f6295f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f6296g;

        /* renamed from: h  reason: collision with root package name */
        public final Class<?> f6297h;

        /* renamed from: i  reason: collision with root package name */
        public final u<?> f6298i;

        /* renamed from: j  reason: collision with root package name */
        public final f.h.f.o<?> f6299j;

        public c(Object obj, f.h.f.a0.a<?> aVar, boolean z, Class<?> cls) {
            u<?> uVar = obj instanceof u ? (u) obj : null;
            this.f6298i = uVar;
            f.h.f.o<?> oVar = obj instanceof f.h.f.o ? (f.h.f.o) obj : null;
            this.f6299j = oVar;
            f.h.b.c.a.s((uVar == null && oVar == null) ? false : true);
            this.f6295f = aVar;
            this.f6296g = z;
            this.f6297h = null;
        }

        @Override // f.h.f.x
        public <T> w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
            boolean isAssignableFrom;
            f.h.f.a0.a<?> aVar2 = this.f6295f;
            if (aVar2 != null) {
                isAssignableFrom = aVar2.equals(aVar) || (this.f6296g && this.f6295f.b == aVar.a);
            } else {
                isAssignableFrom = this.f6297h.isAssignableFrom(aVar.a);
            }
            if (isAssignableFrom) {
                return new m(this.f6298i, this.f6299j, jVar, aVar, this);
            }
            return null;
        }
    }

    public m(u<T> uVar, f.h.f.o<T> oVar, f.h.f.j jVar, f.h.f.a0.a<T> aVar, x xVar) {
        this.a = uVar;
        this.b = oVar;
        this.c = jVar;
        this.f6291d = aVar;
        this.f6292e = xVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    @Override // f.h.f.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public T a(f.h.f.b0.a r4) {
        /*
            r3 = this;
            f.h.f.o<T> r0 = r3.b
            if (r0 != 0) goto L1a
            f.h.f.w<T> r0 = r3.f6294g
            if (r0 == 0) goto L9
            goto L15
        L9:
            f.h.f.j r0 = r3.c
            f.h.f.x r1 = r3.f6292e
            f.h.f.a0.a<T> r2 = r3.f6291d
            f.h.f.w r0 = r0.f(r1, r2)
            r3.f6294g = r0
        L15:
            java.lang.Object r4 = r0.a(r4)
            return r4
        L1a:
            r4.s0()     // Catch: java.lang.NumberFormatException -> L29 java.io.IOException -> L30 com.google.gson.stream.MalformedJsonException -> L37 java.io.EOFException -> L3e
            r0 = 0
            f.h.f.w<f.h.f.p> r1 = f.h.f.z.z.o.X     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 com.google.gson.stream.MalformedJsonException -> L37
            java.lang.Object r4 = r1.a(r4)     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 com.google.gson.stream.MalformedJsonException -> L37
            f.h.f.p r4 = (f.h.f.p) r4     // Catch: java.io.EOFException -> L27 java.lang.NumberFormatException -> L29 java.io.IOException -> L30 com.google.gson.stream.MalformedJsonException -> L37
            goto L44
        L27:
            r4 = move-exception
            goto L40
        L29:
            r4 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r4)
            throw r0
        L30:
            r4 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>(r4)
            throw r0
        L37:
            r4 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r4)
            throw r0
        L3e:
            r4 = move-exception
            r0 = 1
        L40:
            if (r0 == 0) goto L5a
            f.h.f.q r4 = f.h.f.q.a
        L44:
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r4 instanceof f.h.f.q
            if (r0 == 0) goto L4d
            r4 = 0
            return r4
        L4d:
            f.h.f.o<T> r0 = r3.b
            f.h.f.a0.a<T> r1 = r3.f6291d
            java.lang.reflect.Type r1 = r1.b
            f.h.f.z.z.m<T>$b r2 = r3.f6293f
            java.lang.Object r4 = r0.a(r4, r1, r2)
            return r4
        L5a:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.f.z.z.m.a(f.h.f.b0.a):java.lang.Object");
    }

    @Override // f.h.f.w
    public void b(f.h.f.b0.b bVar, T t) {
        u<T> uVar = this.a;
        if (uVar == null) {
            w<T> wVar = this.f6294g;
            if (wVar == null) {
                wVar = this.c.f(this.f6292e, this.f6291d);
                this.f6294g = wVar;
            }
            wVar.b(bVar, t);
        } else if (t == null) {
            bVar.F();
        } else {
            o.X.b(bVar, uVar.b(t, this.f6291d.b, this.f6293f));
        }
    }
}
