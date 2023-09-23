package f.h.b.a.i;

import f.h.b.a.i.h;
import java.util.Map;
import java.util.Objects;

/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes.dex */
public final class c extends h {
    public final String a;
    public final Integer b;
    public final g c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3694d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3695e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f3696f;

    /* compiled from: AutoValue_EventInternal.java */
    /* loaded from: classes.dex */
    public static final class b extends h.a {
        public String a;
        public Integer b;
        public g c;

        /* renamed from: d  reason: collision with root package name */
        public Long f3697d;

        /* renamed from: e  reason: collision with root package name */
        public Long f3698e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f3699f;

        @Override // f.h.b.a.i.h.a
        public h b() {
            String str = this.a == null ? " transportName" : "";
            if (this.c == null) {
                str = f.a.b.a.a.p(str, " encodedPayload");
            }
            if (this.f3697d == null) {
                str = f.a.b.a.a.p(str, " eventMillis");
            }
            if (this.f3698e == null) {
                str = f.a.b.a.a.p(str, " uptimeMillis");
            }
            if (this.f3699f == null) {
                str = f.a.b.a.a.p(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b, this.c, this.f3697d.longValue(), this.f3698e.longValue(), this.f3699f, null);
            }
            throw new IllegalStateException(f.a.b.a.a.p("Missing required properties:", str));
        }

        @Override // f.h.b.a.i.h.a
        public Map<String, String> c() {
            Map<String, String> map = this.f3699f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // f.h.b.a.i.h.a
        public h.a d(g gVar) {
            Objects.requireNonNull(gVar, "Null encodedPayload");
            this.c = gVar;
            return this;
        }

        @Override // f.h.b.a.i.h.a
        public h.a e(long j2) {
            this.f3697d = Long.valueOf(j2);
            return this;
        }

        @Override // f.h.b.a.i.h.a
        public h.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.a = str;
            return this;
        }

        @Override // f.h.b.a.i.h.a
        public h.a g(long j2) {
            this.f3698e = Long.valueOf(j2);
            return this;
        }
    }

    public c(String str, Integer num, g gVar, long j2, long j3, Map map, a aVar) {
        this.a = str;
        this.b = num;
        this.c = gVar;
        this.f3694d = j2;
        this.f3695e = j3;
        this.f3696f = map;
    }

    @Override // f.h.b.a.i.h
    public Map<String, String> c() {
        return this.f3696f;
    }

    @Override // f.h.b.a.i.h
    public Integer d() {
        return this.b;
    }

    @Override // f.h.b.a.i.h
    public g e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.a.equals(hVar.h()) && ((num = this.b) != null ? num.equals(hVar.d()) : hVar.d() == null) && this.c.equals(hVar.e()) && this.f3694d == hVar.f() && this.f3695e == hVar.i() && this.f3696f.equals(hVar.c());
        }
        return false;
    }

    @Override // f.h.b.a.i.h
    public long f() {
        return this.f3694d;
    }

    @Override // f.h.b.a.i.h
    public String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j2 = this.f3694d;
        long j3 = this.f3695e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.f3696f.hashCode();
    }

    @Override // f.h.b.a.i.h
    public long i() {
        return this.f3695e;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("EventInternal{transportName=");
        A.append(this.a);
        A.append(", code=");
        A.append(this.b);
        A.append(", encodedPayload=");
        A.append(this.c);
        A.append(", eventMillis=");
        A.append(this.f3694d);
        A.append(", uptimeMillis=");
        A.append(this.f3695e);
        A.append(", autoMetadata=");
        A.append(this.f3696f);
        A.append("}");
        return A.toString();
    }
}
