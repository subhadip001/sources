package j.a.z1;

import j.a.e0;

/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
public final class j extends g {

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f8838h;

    public j(Runnable runnable, long j2, h hVar) {
        super(j2, hVar);
        this.f8838h = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f8838h.run();
        } finally {
            this.f8837g.a();
        }
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Task[");
        A.append(e0.a(this.f8838h));
        A.append('@');
        A.append(e0.b(this.f8838h));
        A.append(", ");
        A.append(this.f8836f);
        A.append(", ");
        A.append(this.f8837g);
        A.append(']');
        return A.toString();
    }
}
