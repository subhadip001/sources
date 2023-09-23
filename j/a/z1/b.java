package j.a.z1;

/* compiled from: Dispatcher.kt */
/* loaded from: classes2.dex */
public final class b extends e {

    /* renamed from: l  reason: collision with root package name */
    public static final b f8830l = new b();

    public b() {
        super(k.b, k.c, k.f8839d, "DefaultDispatcher");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // j.a.z
    public String toString() {
        return "Dispatchers.Default";
    }
}
