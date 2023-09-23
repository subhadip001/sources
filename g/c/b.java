package g.c;

/* compiled from: CompletableObserver.java */
/* loaded from: classes2.dex */
public interface b {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(g.c.t.b bVar);
}
