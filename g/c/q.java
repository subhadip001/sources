package g.c;

/* compiled from: SingleObserver.java */
/* loaded from: classes2.dex */
public interface q<T> {
    void onError(Throwable th);

    void onSubscribe(g.c.t.b bVar);

    void onSuccess(T t);
}
