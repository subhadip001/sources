package g.c;

/* compiled from: Observer.java */
/* loaded from: classes2.dex */
public interface n<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(g.c.t.b bVar);
}
