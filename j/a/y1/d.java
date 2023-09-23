package j.a.y1;

import j.a.c0;

/* compiled from: Scopes.kt */
/* loaded from: classes2.dex */
public final class d implements c0 {

    /* renamed from: f  reason: collision with root package name */
    public final i.j.f f8802f;

    public d(i.j.f fVar) {
        this.f8802f = fVar;
    }

    @Override // j.a.c0
    public i.j.f p() {
        return this.f8802f;
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("CoroutineScope(coroutineContext=");
        A.append(this.f8802f);
        A.append(')');
        return A.toString();
    }
}
