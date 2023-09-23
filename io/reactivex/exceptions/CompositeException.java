package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class CompositeException extends RuntimeException {

    /* renamed from: f  reason: collision with root package name */
    public final List<Throwable> f8722f;

    /* renamed from: g  reason: collision with root package name */
    public final String f8723g;

    /* renamed from: h  reason: collision with root package name */
    public Throwable f8724h;

    /* loaded from: classes2.dex */
    public static final class a extends RuntimeException {
        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b {
        public abstract void a(Object obj);
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {
        public final PrintStream a;

        public c(PrintStream printStream) {
            this.a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.b
        public void a(Object obj) {
            this.a.println(obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b {
        public final PrintWriter a;

        public d(PrintWriter printWriter) {
            this.a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.b
        public void a(Object obj) {
            this.a.println(obj);
        }
    }

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public final void a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            a(sb, th.getCause(), "");
        }
    }

    public final void b(b bVar) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i2 = 1;
        for (Throwable th : this.f8722f) {
            sb.append("  ComposedException ");
            sb.append(i2);
            sb.append(" :\n");
            a(sb, th, "\t");
            i2++;
        }
        bVar.a(sb.toString());
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.f8724h == null) {
            a aVar = new a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it = this.f8722f.iterator();
            a aVar2 = aVar;
            while (it.hasNext()) {
                Throwable next = it.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    ArrayList arrayList = new ArrayList();
                    Throwable cause = next.getCause();
                    if (cause != null && cause != next) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Throwable th = (Throwable) it2.next();
                        if (hashSet.contains(th)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th);
                        }
                    }
                    try {
                        aVar2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = aVar2.getCause();
                    if (cause3 != null && this.f8724h != cause3) {
                        while (true) {
                            Throwable cause4 = cause3.getCause();
                            if (cause4 == null || cause4 == cause3) {
                                break;
                            }
                            cause3 = cause4;
                        }
                        aVar2 = cause3;
                    }
                }
            }
            this.f8724h = aVar;
        }
        return this.f8724h;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f8723g;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        b(new c(printStream));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).f8722f);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
            this.f8722f = unmodifiableList;
            this.f8723g = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        b(new d(printWriter));
    }
}
