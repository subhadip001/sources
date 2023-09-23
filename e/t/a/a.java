package e.t.a;

import e.s.j0;
import e.s.m;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager.java */
/* loaded from: classes.dex */
public abstract class a {
    public static <T extends m & j0> a b(T t) {
        return new b(t, t.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
