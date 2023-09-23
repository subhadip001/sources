package io.reactivex.internal.util;

import g.c.n;
import java.io.Serializable;

/* loaded from: classes2.dex */
public enum NotificationLite {
    COMPLETE;

    /* loaded from: classes2.dex */
    public static final class a implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        public final g.c.t.b f8725f;

        public a(g.c.t.b bVar) {
            this.f8725f = bVar;
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("NotificationLite.Disposable[");
            A.append(this.f8725f);
            A.append("]");
            return A.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        public final Throwable f8726f;

        public b(Throwable th) {
            this.f8726f = th;
        }

        public boolean equals(Object obj) {
            Throwable th;
            Throwable th2;
            return (obj instanceof b) && ((th = this.f8726f) == (th2 = ((b) obj).f8726f) || (th != null && th.equals(th2)));
        }

        public int hashCode() {
            return this.f8726f.hashCode();
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("NotificationLite.Error[");
            A.append(this.f8726f);
            A.append("]");
            return A.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        public final m.c.c f8727f;

        public c(m.c.c cVar) {
            this.f8727f = cVar;
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("NotificationLite.Subscription[");
            A.append(this.f8727f);
            A.append("]");
            return A.toString();
        }
    }

    public static <T> boolean accept(Object obj, m.c.b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            bVar.onError(((b) obj).f8726f);
            return true;
        } else {
            bVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, m.c.b<? super T> bVar) {
        if (obj == COMPLETE) {
            bVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            bVar.onError(((b) obj).f8726f);
            return true;
        } else if (obj instanceof c) {
            bVar.onSubscribe(((c) obj).f8727f);
            return false;
        } else {
            bVar.onNext(obj);
            return false;
        }
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(g.c.t.b bVar) {
        return new a(bVar);
    }

    public static Object error(Throwable th) {
        return new b(th);
    }

    public static g.c.t.b getDisposable(Object obj) {
        return ((a) obj).f8725f;
    }

    public static Throwable getError(Object obj) {
        return ((b) obj).f8726f;
    }

    public static m.c.c getSubscription(Object obj) {
        return ((c) obj).f8727f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof c;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public static Object subscription(m.c.c cVar) {
        return new c(cVar);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, n<? super T> nVar) {
        if (obj == COMPLETE) {
            nVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            nVar.onError(((b) obj).f8726f);
            return true;
        } else {
            nVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, n<? super T> nVar) {
        if (obj == COMPLETE) {
            nVar.onComplete();
            return true;
        } else if (obj instanceof b) {
            nVar.onError(((b) obj).f8726f);
            return true;
        } else if (obj instanceof a) {
            nVar.onSubscribe(((a) obj).f8725f);
            return false;
        } else {
            nVar.onNext(obj);
            return false;
        }
    }
}
