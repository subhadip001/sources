package g.c;

/* compiled from: MaybeObserver.java */
/* loaded from: classes2.dex */
public interface j<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(g.c.t.b bVar);

    void onSuccess(T t);
}
