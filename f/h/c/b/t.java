package f.h.c.b;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: ImmutableMultimap.java */
/* loaded from: classes.dex */
public class t<V> extends u0<V> {

    /* renamed from: f  reason: collision with root package name */
    public Iterator<? extends o<V>> f5992f;

    /* renamed from: g  reason: collision with root package name */
    public Iterator<V> f5993g = x.f6002j;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ u f5994h;

    public t(u uVar) {
        this.f5994h = uVar;
        this.f5992f = uVar.f5996i.values().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5993g.hasNext() || this.f5992f.hasNext();
    }

    @Override // java.util.Iterator
    public V next() {
        if (!this.f5993g.hasNext()) {
            this.f5993g = this.f5992f.next().iterator();
        }
        return this.f5993g.next();
    }
}
