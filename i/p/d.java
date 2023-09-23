package i.p;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Iterables.kt */
/* loaded from: classes2.dex */
public final class d<T> implements Iterable<T> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f8664f;

    public d(b bVar) {
        this.f8664f = bVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f8664f.iterator();
    }
}
