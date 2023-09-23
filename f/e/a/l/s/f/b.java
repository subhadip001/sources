package f.e.a.l.s.f;

import f.e.a.l.q.v;
import java.io.File;
import java.util.Objects;

/* JADX WARN: Incorrect class signature, class is equals to this class: Lf/e/a/l/s/f/b<Ljava/io/File;>; */
/* compiled from: FileResource.java */
/* loaded from: classes.dex */
public class b implements v {

    /* renamed from: f  reason: collision with root package name */
    public final T f3491f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(File file) {
        Objects.requireNonNull(file, "Argument must not be null");
        this.f3491f = file;
    }

    @Override // f.e.a.l.q.v
    public void a() {
    }

    @Override // f.e.a.l.q.v
    public final /* bridge */ /* synthetic */ int b() {
        return 1;
    }

    @Override // f.e.a.l.q.v
    public Class c() {
        return this.f3491f.getClass();
    }

    @Override // f.e.a.l.q.v
    public final Object get() {
        return this.f3491f;
    }
}
