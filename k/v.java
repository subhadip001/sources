package k;

import java.util.Objects;
import k.q;
import k.r;

/* compiled from: Request.java */
/* loaded from: classes2.dex */
public final class v {
    public final r a;
    public final String b;
    public final q c;

    /* renamed from: d  reason: collision with root package name */
    public final x f9175d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f9176e;

    /* renamed from: f  reason: collision with root package name */
    public volatile d f9177f;

    public v(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = new q(aVar.c);
        this.f9175d = aVar.f9178d;
        Object obj = aVar.f9179e;
        this.f9176e = obj == null ? this : obj;
    }

    public d a() {
        d dVar = this.f9177f;
        if (dVar != null) {
            return dVar;
        }
        d a2 = d.a(this.c);
        this.f9177f = a2;
        return a2;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Request{method=");
        A.append(this.b);
        A.append(", url=");
        A.append(this.a);
        A.append(", tag=");
        Object obj = this.f9176e;
        if (obj == this) {
            obj = null;
        }
        A.append(obj);
        A.append('}');
        return A.toString();
    }

    /* compiled from: Request.java */
    /* loaded from: classes2.dex */
    public static class a {
        public r a;
        public String b;
        public q.a c;

        /* renamed from: d  reason: collision with root package name */
        public x f9178d;

        /* renamed from: e  reason: collision with root package name */
        public Object f9179e;

        public a() {
            this.b = "GET";
            this.c = new q.a();
        }

        public v a() {
            if (this.a != null) {
                return new v(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b(String str, String str2) {
            q.a aVar = this.c;
            aVar.c(str, str2);
            aVar.e(str);
            aVar.a.add(str);
            aVar.a.add(str2.trim());
            return this;
        }

        public a c(String str, x xVar) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() != 0) {
                if (xVar != null && !f.n.a.n.i.M(str)) {
                    throw new IllegalArgumentException(f.a.b.a.a.q("method ", str, " must not have a request body."));
                }
                if (xVar == null) {
                    if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                        throw new IllegalArgumentException(f.a.b.a.a.q("method ", str, " must have a request body."));
                    }
                }
                this.b = str;
                this.f9178d = xVar;
                return this;
            }
            throw new IllegalArgumentException("method.length() == 0");
        }

        public a d(String str) {
            Objects.requireNonNull(str, "url == null");
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                StringBuilder A = f.a.b.a.a.A("http:");
                A.append(str.substring(3));
                str = A.toString();
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                StringBuilder A2 = f.a.b.a.a.A("https:");
                A2.append(str.substring(4));
                str = A2.toString();
            }
            r.a aVar = new r.a();
            r a = aVar.c(null, str) == r.a.EnumC0236a.SUCCESS ? aVar.a() : null;
            if (a != null) {
                e(a);
                return this;
            }
            throw new IllegalArgumentException(f.a.b.a.a.p("unexpected url: ", str));
        }

        public a e(r rVar) {
            Objects.requireNonNull(rVar, "url == null");
            this.a = rVar;
            return this;
        }

        public a(v vVar) {
            this.a = vVar.a;
            this.b = vVar.b;
            this.f9178d = vVar.f9175d;
            this.f9179e = vVar.f9176e;
            this.c = vVar.c.c();
        }
    }
}
