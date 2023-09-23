package e.s;

import java.io.Closeable;

/* compiled from: ViewModel.kt */
/* loaded from: classes.dex */
public final class c implements Closeable, j.a.c0 {

    /* renamed from: f  reason: collision with root package name */
    public final i.j.f f2809f;

    public c(i.j.f fVar) {
        i.l.b.i.e(fVar, "context");
        this.f2809f = fVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        f.n.a.n.i.h(this.f2809f, null, 1, null);
    }

    @Override // j.a.c0
    public i.j.f p() {
        return this.f2809f;
    }
}
