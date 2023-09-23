package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.DataSource;
import f.e.a.l.j;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: k  reason: collision with root package name */
    public static final StackTraceElement[] f682k = new StackTraceElement[0];

    /* renamed from: f  reason: collision with root package name */
    public final List<Throwable> f683f;

    /* renamed from: g  reason: collision with root package name */
    public j f684g;

    /* renamed from: h  reason: collision with root package name */
    public DataSource f685h;

    /* renamed from: i  reason: collision with root package name */
    public Class<?> f686i;

    /* renamed from: j  reason: collision with root package name */
    public String f687j;

    public GlideException(String str) {
        List<Throwable> emptyList = Collections.emptyList();
        this.f687j = str;
        setStackTrace(f682k);
        this.f683f = emptyList;
    }

    public static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            appendable.append("Cause (").append(String.valueOf(i3)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i2);
            if (th instanceof GlideException) {
                ((GlideException) th).f(appendable);
            } else {
                d(th, appendable);
            }
            i2 = i3;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable th2 : ((GlideException) th).f683f) {
                a(th2, list);
            }
            return;
        }
        list.add(th);
    }

    public void e(String str) {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            StringBuilder A = f.a.b.a.a.A("Root cause (");
            int i3 = i2 + 1;
            A.append(i3);
            A.append(" of ");
            A.append(size);
            A.append(")");
            Log.i(str, A.toString(), (Throwable) arrayList.get(i2));
            i2 = i3;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f683f, new a(appendable));
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f687j);
        String str3 = "";
        if (this.f686i != null) {
            StringBuilder A = f.a.b.a.a.A(", ");
            A.append(this.f686i);
            str = A.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f685h != null) {
            StringBuilder A2 = f.a.b.a.a.A(", ");
            A2.append(this.f685h);
            str2 = A2.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.f684g != null) {
            StringBuilder A3 = f.a.b.a.a.A(", ");
            A3.append(this.f684g);
            str3 = A3.toString();
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        f(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }

    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: f  reason: collision with root package name */
        public final Appendable f688f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f689g = true;

        public a(Appendable appendable) {
            this.f688f = appendable;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) {
            if (this.f689g) {
                this.f689g = false;
                this.f688f.append("  ");
            }
            this.f689g = c == '\n';
            this.f688f.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i2, int i3) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.f689g) {
                this.f689g = false;
                this.f688f.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i3 - 1) == '\n') {
                z = true;
            }
            this.f689g = z;
            this.f688f.append(charSequence, i2, i3);
            return this;
        }
    }

    public GlideException(String str, Throwable th) {
        List<Throwable> singletonList = Collections.singletonList(th);
        this.f687j = str;
        setStackTrace(f682k);
        this.f683f = singletonList;
    }

    public GlideException(String str, List<Throwable> list) {
        this.f687j = str;
        setStackTrace(f682k);
        this.f683f = list;
    }
}
