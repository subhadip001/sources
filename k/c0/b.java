package k.c0;

/* compiled from: NamedRunnable.java */
/* loaded from: classes2.dex */
public abstract class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final String f8878f;

    public b(String str, Object... objArr) {
        this.f8878f = c.l(str, objArr);
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f8878f);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
