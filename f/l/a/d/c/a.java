package f.l.a.d.c;

import i.l.b.e;
import i.l.b.i;

/* compiled from: Result.kt */
/* loaded from: classes2.dex */
public abstract class a<T> {

    /* compiled from: Result.kt */
    /* renamed from: f.l.a.d.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0157a extends a {
        public final Throwable a;
        public final String b;

        public C0157a() {
            this(null, null, 3);
        }

        public C0157a(Throwable th, String str) {
            super(null);
            this.a = th;
            this.b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0157a) {
                C0157a c0157a = (C0157a) obj;
                return i.a(this.a, c0157a.a) && i.a(this.b, c0157a.b);
            }
            return false;
        }

        public int hashCode() {
            Throwable th = this.a;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("Error(throwable=");
            A.append(this.a);
            A.append(", message=");
            A.append((Object) this.b);
            A.append(')');
            return A.toString();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0157a(Throwable th, String str, int i2) {
            this((i2 & 1) != 0 ? null : th, null);
            int i3 = i2 & 2;
        }
    }

    /* compiled from: Result.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> extends a<T> {
        public final T a;

        public b(T t) {
            super(null);
            this.a = t;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && i.a(this.a, ((b) obj).a);
        }

        public int hashCode() {
            T t = this.a;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("Success(data=");
            A.append(this.a);
            A.append(')');
            return A.toString();
        }
    }

    public a(e eVar) {
    }
}
