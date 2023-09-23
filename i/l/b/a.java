package i.l.b;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: CallableReference.java */
/* loaded from: classes2.dex */
public abstract class a implements i.o.a, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public transient i.o.a f8639f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f8640g;

    /* renamed from: h  reason: collision with root package name */
    public final Class f8641h;

    /* renamed from: i  reason: collision with root package name */
    public final String f8642i;

    /* renamed from: j  reason: collision with root package name */
    public final String f8643j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f8644k;

    /* compiled from: CallableReference.java */
    /* renamed from: i.l.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0226a implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        public static final C0226a f8645f = new C0226a();
    }

    public a() {
        this.f8640g = C0226a.f8645f;
        this.f8641h = null;
        this.f8642i = null;
        this.f8643j = null;
        this.f8644k = false;
    }

    public i.o.a a() {
        i.o.a aVar = this.f8639f;
        if (aVar == null) {
            i.o.a e2 = e();
            this.f8639f = e2;
            return e2;
        }
        return aVar;
    }

    public abstract i.o.a e();

    public i.o.c g() {
        Class cls = this.f8641h;
        if (cls == null) {
            return null;
        }
        if (this.f8644k) {
            Objects.requireNonNull(o.a);
            return new k(cls, "");
        }
        return o.a(cls);
    }

    public a(Object obj, Class cls, String str, String str2, boolean z) {
        this.f8640g = obj;
        this.f8641h = cls;
        this.f8642i = str;
        this.f8643j = str2;
        this.f8644k = z;
    }
}
