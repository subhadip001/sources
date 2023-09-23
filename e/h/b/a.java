package e.h.b;

import e.f.h;
import e.i.i.c;
import e.i.i.d;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: DirectedAcyclicGraph.java */
/* loaded from: classes.dex */
public final class a<T> {
    public final c<ArrayList<T>> a = new d(10);
    public final h<T, ArrayList<T>> b = new h<>();
    public final ArrayList<T> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet<T> f2420d = new HashSet<>();

    public void a(T t) {
        if (this.b.e(t) >= 0) {
            return;
        }
        this.b.put(t, null);
    }

    public final void b(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> orDefault = this.b.getOrDefault(t, null);
            if (orDefault != null) {
                int size = orDefault.size();
                for (int i2 = 0; i2 < size; i2++) {
                    b(orDefault.get(i2), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
