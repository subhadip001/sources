package e.t.a;

import e.f.i;
import e.s.b0;
import e.s.e0;
import e.s.f0;
import e.s.h0;
import e.s.i0;
import e.s.m;
import e.s.s;
import e.s.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;

/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
public class b extends e.t.a.a {
    public final m a;
    public final C0055b b;

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class a<D> extends s<D> {
        @Override // androidx.lifecycle.LiveData
        public void g() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public void h() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void j(t<? super D> tVar) {
            super.j(tVar);
        }

        @Override // e.s.s, androidx.lifecycle.LiveData
        public void k(D d2) {
            super.k(d2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            e.i.a.c(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: e.t.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0055b extends b0 {

        /* renamed from: d  reason: collision with root package name */
        public static final e0 f2837d = new a();
        public i<a> c = new i<>();

        /* compiled from: LoaderManagerImpl.java */
        /* renamed from: e.t.a.b$b$a */
        /* loaded from: classes.dex */
        public static class a implements e0 {
            @Override // e.s.e0
            public <T extends b0> T a(Class<T> cls) {
                return new C0055b();
            }
        }

        @Override // e.s.b0
        public void b() {
            if (this.c.g() <= 0) {
                i<a> iVar = this.c;
                int i2 = iVar.f2005h;
                Object[] objArr = iVar.f2004g;
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = null;
                }
                iVar.f2005h = 0;
                return;
            }
            Objects.requireNonNull(this.c.h(0));
            throw null;
        }
    }

    public b(m mVar, i0 i0Var) {
        b0 a2;
        this.a = mVar;
        e0 e0Var = C0055b.f2837d;
        String canonicalName = C0055b.class.getCanonicalName();
        if (canonicalName != null) {
            String p = f.a.b.a.a.p("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            b0 b0Var = i0Var.a.get(p);
            if (C0055b.class.isInstance(b0Var)) {
                if (e0Var instanceof h0) {
                    ((h0) e0Var).b(b0Var);
                }
            } else {
                if (e0Var instanceof f0) {
                    a2 = ((f0) e0Var).c(p, C0055b.class);
                } else {
                    a2 = ((C0055b.a) e0Var).a(C0055b.class);
                }
                b0Var = a2;
                b0 put = i0Var.a.put(p, b0Var);
                if (put != null) {
                    put.b();
                }
            }
            this.b = (C0055b) b0Var;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // e.t.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0055b c0055b = this.b;
        if (c0055b.c.g() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (c0055b.c.g() <= 0) {
                return;
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c0055b.c.e(0));
            printWriter.print(": ");
            printWriter.println(c0055b.c.h(0).toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        e.i.a.c(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
