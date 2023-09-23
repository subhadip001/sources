package i.p;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Sequences.kt */
/* loaded from: classes2.dex */
public final class c<T> implements b<T> {
    public final /* synthetic */ Iterator a;

    public c(Iterator it) {
        this.a = it;
    }

    @Override // i.p.b
    public Iterator<T> iterator() {
        return this.a;
    }
}
