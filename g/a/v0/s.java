package g.a.v0;

import g.a.d;
import io.grpc.Status;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: ClientCallImpl.java */
/* loaded from: classes2.dex */
public class s implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f7901f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d.a f7902g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ q f7903h;

    public s(q qVar, long j2, d.a aVar) {
        this.f7903h = qVar;
        this.f7901f = j2;
        this.f7902g = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        q qVar = this.f7903h;
        long j2 = this.f7901f;
        Objects.requireNonNull(qVar);
        a1 a1Var = new a1();
        qVar.f7885i.l(a1Var);
        long abs = Math.abs(j2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long nanos = abs / timeUnit.toNanos(1L);
        long abs2 = Math.abs(j2) % timeUnit.toNanos(1L);
        StringBuilder A = f.a.b.a.a.A("deadline exceeded after ");
        if (j2 < 0) {
            A.append('-');
        }
        A.append(nanos);
        A.append(String.format(".%09d", Long.valueOf(abs2)));
        A.append("s. ");
        A.append(a1Var);
        q.f(this.f7903h, Status.f8688i.b(A.toString()), this.f7902g);
    }
}
