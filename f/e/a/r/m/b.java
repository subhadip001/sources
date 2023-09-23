package f.e.a.r.m;

import f.e.a.r.m.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: FactoryPools.java */
/* loaded from: classes.dex */
public class b<T> implements a.b<List<T>> {
    @Override // f.e.a.r.m.a.b
    public Object a() {
        return new ArrayList();
    }
}
