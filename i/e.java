package i;

import i.l.b.i;
import java.io.Serializable;

/* compiled from: Result.kt */
/* loaded from: classes2.dex */
public final class e<T> implements Serializable {

    /* compiled from: Result.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        public final Throwable f8608f;

        public a(Throwable th) {
            i.e(th, "exception");
            this.f8608f = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && i.a(this.f8608f, ((a) obj).f8608f);
        }

        public int hashCode() {
            return this.f8608f.hashCode();
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("Failure(");
            A.append(this.f8608f);
            A.append(')');
            return A.toString();
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f8608f;
        }
        return null;
    }
}
