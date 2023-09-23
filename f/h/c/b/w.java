package f.h.c.b;

import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Iterators.java */
/* loaded from: classes.dex */
public class w<T> extends u0<T> {

    /* renamed from: f  reason: collision with root package name */
    public boolean f6000f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f6001g;

    public w(Object obj) {
        this.f6001g = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return !this.f6000f;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.f6000f) {
            this.f6000f = true;
            return (T) this.f6001g;
        }
        throw new NoSuchElementException();
    }
}
