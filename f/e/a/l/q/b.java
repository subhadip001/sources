package f.e.a.l.q;

import f.e.a.l.q.a;
import java.util.Objects;

/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f3275f;

    public b(a aVar) {
        this.f3275f = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = this.f3275f;
        Objects.requireNonNull(aVar);
        while (true) {
            try {
                aVar.b((a.b) aVar.f3265d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
