package m.c;

/* compiled from: Subscriber.java */
/* loaded from: classes2.dex */
public interface b<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(c cVar);
}
