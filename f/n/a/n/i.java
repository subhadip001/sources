package f.n.a.n;

import android.app.Application;
import android.net.Uri;
import android.util.Log;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import com.google.android.gms.common.api.Api;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.messaging.FirebaseMessaging;
import g.a.q0;
import g.a.r0;
import g.a.v0.f2;
import g.a.v0.l1;
import g.c.o;
import i.e;
import i.j.e;
import i.j.f;
import i.l.a.l;
import i.l.a.p;
import i.l.b.n;
import i.l.b.q;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.internal.subscriptions.EmptySubscription;
import j.a.a0;
import j.a.b0;
import j.a.c0;
import j.a.c1;
import j.a.e1;
import j.a.g0;
import j.a.h0;
import j.a.h1;
import j.a.i1;
import j.a.j0;
import j.a.l0;
import j.a.m0;
import j.a.p0;
import j.a.p1;
import j.a.r;
import j.a.s;
import j.a.s1;
import j.a.u1;
import j.a.v;
import j.a.v0;
import j.a.v1;
import j.a.w;
import j.a.x;
import j.a.x0;
import j.a.y1.t;
import j.a.y1.u;
import j.a.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: UriToSafConverter.java */
/* loaded from: classes2.dex */
public class i {
    public static Application a;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r2 == null) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [i.j.d<T>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> i.j.d<T> A(i.j.d<? super T> r2) {
        /*
            java.lang.String r0 = "<this>"
            i.l.b.i.e(r2, r0)
            boolean r0 = r2 instanceof i.j.j.a.c
            if (r0 == 0) goto Ld
            r0 = r2
            i.j.j.a.c r0 = (i.j.j.a.c) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L2e
            i.j.d<java.lang.Object> r2 = r0.f8637h
            if (r2 != 0) goto L2e
            i.j.f r2 = r0.f8636g
            i.l.b.i.b(r2)
            int r1 = i.j.e.c
            i.j.e$a r1 = i.j.e.a.f8621f
            i.j.f$a r2 = r2.get(r1)
            i.j.e r2 = (i.j.e) r2
            if (r2 == 0) goto L2b
            i.j.d r2 = r2.g(r0)
            if (r2 != 0) goto L2c
        L2b:
            r2 = r0
        L2c:
            r0.f8637h = r2
        L2e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.n.a.n.i.A(i.j.d):i.j.d");
    }

    public static boolean B(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static /* synthetic */ m0 C(c1 c1Var, boolean z, boolean z2, l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return c1Var.q(z, z2, lVar);
    }

    public static c1 D(c0 c0Var, i.j.f fVar, CoroutineStart coroutineStart, p pVar, int i2, Object obj) {
        c1 p1Var;
        if ((i2 & 1) != 0) {
            fVar = i.j.h.f8623f;
        }
        CoroutineStart coroutineStart2 = (i2 & 2) != 0 ? CoroutineStart.DEFAULT : null;
        i.j.f J = J(c0Var, fVar);
        if (coroutineStart2.isLazy()) {
            p1Var = new i1(J, pVar);
        } else {
            p1Var = new p1(J, true);
        }
        coroutineStart2.invoke(pVar, p1Var, p1Var);
        return p1Var;
    }

    public static final <T> i.c<T> E(i.l.a.a<? extends T> aVar) {
        i.l.b.i.e(aVar, "initializer");
        return new i.f(aVar, null, 2);
    }

    public static final <T> List<T> F(T t) {
        List<T> singletonList = Collections.singletonList(t);
        i.l.b.i.d(singletonList, "singletonList(element)");
        return singletonList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ServiceLoader] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [g.a.r0<T>, g.a.r0] */
    public static <T> List<T> G(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, r0<T> r0Var) {
        boolean z;
        ?? load;
        T t;
        try {
            Class.forName("android.app.Application", false, classLoader);
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            load = new ArrayList();
            for (Class<?> cls2 : iterable) {
                try {
                    t = cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (ClassCastException unused2) {
                    t = null;
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (t != null) {
                    load.add(t);
                }
            }
        } else {
            load = ServiceLoader.load(cls, classLoader);
            if (!load.iterator().hasNext()) {
                load = ServiceLoader.load(cls);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : load) {
            if (r0Var.a(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new q0(r0Var)));
        return Collections.unmodifiableList(arrayList);
    }

    public static final int H(int i2) {
        return i2 < 0 ? i2 : i2 < 3 ? i2 + 1 : i2 < 1073741824 ? (int) ((i2 / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static final int I(int i2, int i3) {
        int i4 = i2 % i3;
        return i4 >= 0 ? i4 : i4 + i3;
    }

    public static final i.j.f J(c0 c0Var, i.j.f fVar) {
        i.j.f u = u(c0Var.p(), fVar, true);
        z zVar = l0.a;
        if (u != zVar) {
            int i2 = i.j.e.c;
            return u.get(e.a.f8621f) == null ? u.plus(zVar) : u;
        }
        return u;
    }

    public static <T> g.c.l<T> K(g.c.l<T> lVar) {
        return lVar;
    }

    public static void L(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            boolean z = true;
            if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
                z = false;
            }
            if (!z) {
                th = new UndeliverableException(th);
            }
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static boolean M(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static i.j.f N(i.j.f fVar, i.j.f fVar2) {
        i.l.b.i.e(fVar2, "context");
        return fVar2 == i.j.h.f8623f ? fVar : (i.j.f) fVar2.fold(fVar, i.j.g.f8622g);
    }

    public static long O(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j4 = j3 - j2;
            if (j4 < 0) {
                L(new IllegalStateException(f.a.b.a.a.l("More produced than requested: ", j4)));
                j4 = 0;
            }
        } while (!atomicLong.compareAndSet(j3, j4));
        return j4;
    }

    public static final <T> Object P(Object obj, i.j.d<? super T> dVar) {
        return obj instanceof r ? p(((r) obj).a) : obj;
    }

    public static final boolean Q(String str, int i2, String str2, int i3, int i4, boolean z) {
        i.l.b.i.e(str, "<this>");
        i.l.b.i.e(str2, "other");
        if (!z) {
            return str.regionMatches(i2, str2, i3, i4);
        }
        return str.regionMatches(z, i2, str2, i3, i4);
    }

    public static String R(String str, String str2, String str3, boolean z, int i2) {
        int i3 = 0;
        if ((i2 & 4) != 0) {
            z = false;
        }
        i.l.b.i.e(str, "<this>");
        i.l.b.i.e(str2, "oldValue");
        i.l.b.i.e(str3, "newValue");
        int c = i.q.e.c(str, str2, 0, z);
        if (c < 0) {
            return str;
        }
        int length = str2.length();
        int i4 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i3, c);
                sb.append(str3);
                i3 = c + length;
                if (c >= str.length()) {
                    break;
                }
                c = i.q.e.c(str, str2, c + i4, z);
            } while (c > 0);
            sb.append((CharSequence) str, i3, str.length());
            String sb2 = sb.toString();
            i.l.b.i.d(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static String S(k.r rVar) {
        String e2 = rVar.e();
        String g2 = rVar.g();
        if (g2 != null) {
            return e2 + '?' + g2;
        }
        return e2;
    }

    public static int T(int i2) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i2 - 1));
    }

    public static void U(p pVar, Object obj, i.j.d dVar, l lVar, int i2) {
        int i3 = i2 & 4;
        try {
            j.a.y1.f.a(A(o(pVar, obj, dVar)), i.h.a, null);
        } catch (Throwable th) {
            r(dVar, th);
            throw null;
        }
    }

    public static final <T, R> Object V(j.a.y1.r<? super T> rVar, R r, p<? super R, ? super i.j.d<? super T>, ? extends Object> pVar) {
        Object rVar2;
        Object G;
        try {
            q.a(pVar, 2);
            rVar2 = pVar.k(r, rVar);
        } catch (Throwable th) {
            rVar2 = new r(th, false, 2);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (rVar2 == coroutineSingletons || (G = rVar.G(rVar2)) == h1.b) {
            return coroutineSingletons;
        }
        if (!(G instanceof r)) {
            return h1.a(G);
        }
        throw ((r) G).a;
    }

    public static boolean W(String str, String str2, boolean z, int i2) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        i.l.b.i.e(str, "<this>");
        i.l.b.i.e(str2, "prefix");
        if (!z2) {
            return str.startsWith(str2);
        }
        return Q(str, 0, str2, 0, str2.length(), z2);
    }

    public static void X(String str) {
        String str2 = x() + "-" + str;
        i.l.b.i.e(str2, "topic");
        f.i.a.c cVar = new f.i.a.c(str2, null);
        Thread currentThread = Thread.currentThread();
        s1 s1Var = s1.a;
        p0 a2 = s1.a();
        v0 v0Var = v0.f8786f;
        i.l.b.i.e(a2, "context");
        j.a.c cVar2 = new j.a.c(J(v0Var, a2), currentThread, a2);
        CoroutineStart.DEFAULT.invoke(cVar, cVar2, cVar2);
        p0 p0Var = cVar2.f8736i;
        if (p0Var != null) {
            int i2 = p0.f8770j;
            p0Var.r0(false);
        }
        while (!Thread.interrupted()) {
            p0 p0Var2 = cVar2.f8736i;
            long t0 = p0Var2 != null ? p0Var2.t0() : Long.MAX_VALUE;
            if (!(!(cVar2.z() instanceof x0))) {
                LockSupport.parkNanos(cVar2, t0);
            } else {
                p0 p0Var3 = cVar2.f8736i;
                if (p0Var3 != null) {
                    int i3 = p0.f8770j;
                    p0Var3.i0(false);
                }
                Object a3 = h1.a(cVar2.z());
                r rVar = a3 instanceof r ? (r) a3 : null;
                if (rVar != null) {
                    throw rVar.a;
                }
                return;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        cVar2.d(interruptedException);
        throw interruptedException;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long Y(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.n.a.n.i.Y(java.lang.String, long, long, long):long");
    }

    public static final String Z(String str) {
        int i2 = t.a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final c0 a(i.j.f fVar) {
        int i2 = c1.f8737e;
        if (fVar.get(c1.a.f8738f) == null) {
            fVar = fVar.plus(new e1(null));
        }
        return new j.a.y1.d(fVar);
    }

    public static final boolean a0(String str, boolean z) {
        String Z = Z(str);
        return Z != null ? Boolean.parseBoolean(Z) : z;
    }

    public static long b(AtomicLong atomicLong, long j2) {
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j3, c(j3, j2)));
        return j3;
    }

    public static int b0(String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return (int) Y(str, i2, i3, i4);
    }

    public static long c(long j2, long j3) {
        long j4 = j2 + j3;
        if (j4 < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static /* synthetic */ long c0(String str, long j2, long j3, long j4, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j3 = 1;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            j4 = Long.MAX_VALUE;
        }
        return Y(str, j2, j5, j4);
    }

    public static final void d(Throwable th, Throwable th2) {
        i.l.b.i.e(th, "<this>");
        i.l.b.i.e(th2, "exception");
        if (th != th2) {
            i.k.b.a.a(th, th2);
        }
    }

    public static void d0(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (th instanceof LinkageError) {
                    throw ((LinkageError) th);
                }
                return;
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }

    public static final <T> List<T> e(T[] tArr) {
        i.l.b.i.e(tArr, "<this>");
        List<T> asList = Arrays.asList(tArr);
        i.l.b.i.d(asList, "asList(this)");
        return asList;
    }

    public static final void e0(Object obj) {
        if (obj instanceof e.a) {
            throw ((e.a) obj).f8608f;
        }
    }

    public static final <T> i.p.b<T> f(Iterator<? extends T> it) {
        i.l.b.i.e(it, "<this>");
        i.p.c cVar = new i.p.c(it);
        i.l.b.i.e(cVar, "<this>");
        return cVar instanceof i.p.a ? cVar : new i.p.a(cVar);
    }

    public static final <T> List<T> f0(i.p.b<? extends T> bVar) {
        i.l.b.i.e(bVar, "<this>");
        i.l.b.i.e(bVar, "<this>");
        ArrayList arrayList = new ArrayList();
        i.l.b.i.e(bVar, "<this>");
        i.l.b.i.e(arrayList, FirebaseAnalytics.Param.DESTINATION);
        for (T t : bVar) {
            arrayList.add(t);
        }
        return i.i.b.d(arrayList);
    }

    public static o g(Callable<o> callable) {
        try {
            o call = callable.call();
            Objects.requireNonNull(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th) {
            throw g.c.w.j.d.d(th);
        }
    }

    public static final <T> Object g0(Object obj, l<? super Throwable, i.h> lVar) {
        Throwable a2 = i.e.a(obj);
        if (a2 == null) {
            return lVar != null ? new s(obj, lVar) : obj;
        }
        return new r(a2, false, 2);
    }

    public static void h(i.j.f fVar, CancellationException cancellationException, int i2, Object obj) {
        int i3 = i2 & 1;
        int i4 = c1.f8737e;
        c1 c1Var = (c1) fVar.get(c1.a.f8738f);
        if (c1Var != null) {
            c1Var.T(null);
        }
    }

    public static <T, R> boolean h0(m.c.a<T> aVar, m.c.b<? super R> bVar, g.c.v.d<? super T, ? extends m.c.a<? extends R>> dVar) {
        if (aVar instanceof Callable) {
            try {
                Object obj = (Object) ((Callable) aVar).call();
                if (obj == 0) {
                    EmptySubscription.complete(bVar);
                    return true;
                }
                try {
                    m.c.a<? extends R> apply = dVar.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                    m.c.a<? extends R> aVar2 = apply;
                    if (aVar2 instanceof Callable) {
                        try {
                            Object call = ((Callable) aVar2).call();
                            if (call == null) {
                                EmptySubscription.complete(bVar);
                                return true;
                            }
                            bVar.onSubscribe(new g.c.w.i.d(bVar, call));
                        } catch (Throwable th) {
                            d0(th);
                            EmptySubscription.error(th, bVar);
                            return true;
                        }
                    } else {
                        aVar2.a(bVar);
                    }
                    return true;
                } catch (Throwable th2) {
                    d0(th2);
                    EmptySubscription.error(th2, bVar);
                    return true;
                }
            } catch (Throwable th3) {
                d0(th3);
                EmptySubscription.error(th3, bVar);
                return true;
            }
        }
        return false;
    }

    public static void i(c0 c0Var, CancellationException cancellationException, int i2) {
        int i3 = i2 & 1;
        i.j.f p = c0Var.p();
        int i4 = c1.f8737e;
        c1 c1Var = (c1) p.get(c1.a.f8738f);
        if (c1Var != null) {
            c1Var.T(null);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + c0Var).toString());
    }

    public static void i0(String str) {
        String str2 = x() + "-" + str;
        i.l.b.i.e(str2, "topic");
        try {
            FirebaseMessaging.getInstance().unsubscribeFromTopic(str2);
        } catch (Exception e2) {
            Log.e("InverseFCM", "unsubscribeFromTopic: ", e2);
        }
    }

    public static /* synthetic */ void j(c1 c1Var, CancellationException cancellationException, int i2, Object obj) {
        int i3 = i2 & 1;
        c1Var.T(null);
    }

    public static final u1<?> j0(i.j.d<?> dVar, i.j.f fVar, Object obj) {
        u1<?> u1Var = null;
        if (dVar instanceof i.j.j.a.d) {
            if (fVar.get(v1.f8787f) != null) {
                i.j.j.a.d dVar2 = (i.j.j.a.d) dVar;
                while (true) {
                    if (!(dVar2 instanceof j0) && (dVar2 = dVar2.e()) != null) {
                        if (dVar2 instanceof u1) {
                            u1Var = (u1) dVar2;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (u1Var != null) {
                    u1Var.f8784i.set(new i.d<>(fVar, obj));
                }
                return u1Var;
            }
            return null;
        }
        return null;
    }

    public static final <T> int k(Iterable<? extends T> iterable, int i2) {
        i.l.b.i.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    public static final <T> Object k0(i.j.f fVar, p<? super c0, ? super i.j.d<? super T>, ? extends Object> pVar, i.j.d<? super T> dVar) {
        Object c0;
        i.j.f context = dVar.getContext();
        i.j.f plus = !z(fVar) ? context.plus(fVar) : u(context, fVar, false);
        int i2 = c1.f8737e;
        c1 c1Var = (c1) plus.get(c1.a.f8738f);
        if (c1Var == null || c1Var.a()) {
            if (plus == context) {
                j.a.y1.r rVar = new j.a.y1.r(plus, dVar);
                c0 = V(rVar, rVar, pVar);
            } else {
                int i3 = i.j.e.c;
                e.a aVar = e.a.f8621f;
                if (i.l.b.i.a(plus.get(aVar), context.get(aVar))) {
                    u1 u1Var = new u1(plus, dVar);
                    Object b = u.b(plus, null);
                    try {
                        Object V = V(u1Var, u1Var, pVar);
                        u.a(plus, b);
                        c0 = V;
                    } catch (Throwable th) {
                        u.a(plus, b);
                        throw th;
                    }
                } else {
                    j0 j0Var = new j0(plus, dVar);
                    U(pVar, j0Var, j0Var, null, 4);
                    c0 = j0Var.c0();
                }
            }
            if (c0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                i.l.b.i.e(dVar, "frame");
            }
            return c0;
        }
        throw c1Var.v();
    }

    public static Object[] l(Object[] objArr, Object[] objArr2, int i2, int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = objArr.length;
        }
        i.l.b.i.e(objArr, "<this>");
        i.l.b.i.e(objArr2, FirebaseAnalytics.Param.DESTINATION);
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
        return objArr2;
    }

    public static l1 m() {
        if (f2.f7682e == null) {
            return new f2();
        }
        return new g.a.v0.j();
    }

    public static final <T> i.j.d<i.h> n(l<? super i.j.d<? super T>, ? extends Object> lVar, i.j.d<? super T> dVar) {
        i.l.b.i.e(lVar, "<this>");
        i.l.b.i.e(dVar, "completion");
        i.l.b.i.e(dVar, "completion");
        if (!(lVar instanceof i.j.j.a.a)) {
            i.j.f context = dVar.getContext();
            if (context == i.j.h.f8623f) {
                return new i.j.i.a(dVar, lVar);
            }
            return new i.j.i.b(dVar, context, lVar);
        }
        i.j.j.a.a aVar = (i.j.j.a.a) lVar;
        i.l.b.i.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public static final <R, T> i.j.d<i.h> o(p<? super R, ? super i.j.d<? super T>, ? extends Object> pVar, R r, i.j.d<? super T> dVar) {
        i.l.b.i.e(pVar, "<this>");
        i.l.b.i.e(dVar, "completion");
        i.l.b.i.e(dVar, "completion");
        if (pVar instanceof i.j.j.a.a) {
            return ((i.j.j.a.a) pVar).a(r, dVar);
        }
        i.j.f context = dVar.getContext();
        if (context == i.j.h.f8623f) {
            return new i.j.i.c(dVar, pVar, r);
        }
        return new i.j.i.d(dVar, context, pVar, r);
    }

    public static final Object p(Throwable th) {
        i.l.b.i.e(th, "exception");
        return new e.a(th);
    }

    public static final Object q(long j2, i.j.d<? super i.h> dVar) {
        if (j2 <= 0) {
            return i.h.a;
        }
        j.a.i iVar = new j.a.i(A(dVar), 1);
        iVar.t();
        if (j2 < Long.MAX_VALUE) {
            i.j.f fVar = iVar.f8758j;
            int i2 = i.j.e.c;
            f.a aVar = fVar.get(e.a.f8621f);
            h0 h0Var = aVar instanceof h0 ? (h0) aVar : null;
            if (h0Var == null) {
                h0Var = g0.b;
            }
            h0Var.p(j2, iVar);
        }
        Object s = iVar.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (s == coroutineSingletons) {
            i.l.b.i.e(dVar, "frame");
        }
        return s == coroutineSingletons ? s : i.h.a;
    }

    public static final void r(i.j.d<?> dVar, Throwable th) {
        dVar.h(p(th));
        throw th;
    }

    public static g.c.t.b s() {
        return new g.c.t.c(g.c.w.b.a.b);
    }

    public static final boolean t(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (z) {
            char upperCase = Character.toUpperCase(c);
            char upperCase2 = Character.toUpperCase(c2);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    public static final i.j.f u(i.j.f fVar, i.j.f fVar2, boolean z) {
        boolean z2 = z(fVar);
        boolean z3 = z(fVar2);
        if (!z2 && !z3) {
            return fVar.plus(fVar2);
        }
        n nVar = new n();
        nVar.f8651f = fVar2;
        i.j.h hVar = i.j.h.f8623f;
        i.j.f fVar3 = (i.j.f) fVar.fold(hVar, new w(nVar, z));
        if (z3) {
            nVar.f8651f = ((i.j.f) nVar.f8651f).fold(hVar, v.f8785g);
        }
        return fVar3.plus((i.j.f) nVar.f8651f);
    }

    public static final <T> Class<T> v(i.o.b<T> bVar) {
        i.l.b.i.e(bVar, "<this>");
        Class<T> cls = (Class<T>) ((i.l.b.b) bVar).a();
        if (!cls.isPrimitive()) {
            i.l.b.i.c(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    cls = (Class<T>) Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    cls = (Class<T>) Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                    break;
                }
                break;
        }
        i.l.b.i.c(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    public static String w(String str) {
        if (str == null) {
            return "uri_is_null";
        }
        try {
            return FFmpegKitConfig.getSafParameterForRead(a, Uri.parse(str));
        } catch (Exception e2) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics.log("getSafPathForRead crash: " + str);
            FirebaseCrashlytics.getInstance().recordException(e2);
            return "uri_is_null";
        }
    }

    public static String x() {
        StringBuilder A = f.a.b.a.a.A("prod-");
        A.append("video_compressor".toLowerCase(Locale.US));
        return A.toString();
    }

    public static final void y(i.j.f fVar, Throwable th) {
        try {
            int i2 = a0.f8729d;
            a0 a0Var = (a0) fVar.get(a0.a.f8730f);
            if (a0Var != null) {
                a0Var.handleException(fVar, th);
            } else {
                b0.a(fVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                d(runtimeException, th);
                th = runtimeException;
            }
            b0.a(fVar, th);
        }
    }

    public static final boolean z(i.j.f fVar) {
        return ((Boolean) fVar.fold(Boolean.FALSE, x.f8792g)).booleanValue();
    }
}
