package f.h.b.a.i.s;

import android.content.Context;
import java.util.Objects;

/* compiled from: AutoValue_CreationContext.java */
/* loaded from: classes.dex */
public final class c extends g {
    public final Context a;
    public final f.h.b.a.i.y.a b;
    public final f.h.b.a.i.y.a c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3716d;

    public c(Context context, f.h.b.a.i.y.a aVar, f.h.b.a.i.y.a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f3716d = str;
    }

    @Override // f.h.b.a.i.s.g
    public Context a() {
        return this.a;
    }

    @Override // f.h.b.a.i.s.g
    public String b() {
        return this.f3716d;
    }

    @Override // f.h.b.a.i.s.g
    public f.h.b.a.i.y.a c() {
        return this.c;
    }

    @Override // f.h.b.a.i.s.g
    public f.h.b.a.i.y.a d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.a.equals(gVar.a()) && this.b.equals(gVar.d()) && this.c.equals(gVar.c()) && this.f3716d.equals(gVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f3716d.hashCode();
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("CreationContext{applicationContext=");
        A.append(this.a);
        A.append(", wallClock=");
        A.append(this.b);
        A.append(", monotonicClock=");
        A.append(this.c);
        A.append(", backendName=");
        return f.a.b.a.a.u(A, this.f3716d, "}");
    }
}
