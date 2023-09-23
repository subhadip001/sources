package j.a;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class a1 extends d1 {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8731k = AtomicIntegerFieldUpdater.newUpdater(a1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: j  reason: collision with root package name */
    public final i.l.a.l<Throwable, i.h> f8732j;

    /* JADX WARN: Multi-variable type inference failed */
    public a1(i.l.a.l<? super Throwable, i.h> lVar) {
        this.f8732j = lVar;
    }

    @Override // i.l.a.l
    public /* bridge */ /* synthetic */ i.h b(Throwable th) {
        p(th);
        return i.h.a;
    }

    @Override // j.a.t
    public void p(Throwable th) {
        if (f8731k.compareAndSet(this, 0, 1)) {
            this.f8732j.b(th);
        }
    }
}
