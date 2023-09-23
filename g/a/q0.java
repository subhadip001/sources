package g.a;

import java.util.Comparator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ServiceProviders.java */
/* loaded from: classes2.dex */
public class q0<T> implements Comparator<T> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ r0 f7558f;

    public q0(r0 r0Var) {
        this.f7558f = r0Var;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        int b = this.f7558f.b(t) - this.f7558f.b(t2);
        return b != 0 ? b : t.getClass().getName().compareTo(t2.getClass().getName());
    }
}
