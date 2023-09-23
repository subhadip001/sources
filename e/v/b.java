package e.v;

import androidx.room.RoomDatabase;

/* compiled from: EntityInsertionAdapter.java */
/* loaded from: classes.dex */
public abstract class b<T> extends k {
    public b(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public abstract void d(e.x.a.f.f fVar, T t);

    public final void e(Iterable<? extends T> iterable) {
        e.x.a.f.f a = a();
        try {
            for (T t : iterable) {
                d(a, t);
                a.f3011g.executeInsert();
            }
        } finally {
            c(a);
        }
    }

    public final void f(T t) {
        e.x.a.f.f a = a();
        try {
            d(a, t);
            a.f3011g.executeInsert();
            if (a == this.c) {
                this.a.set(false);
            }
        } catch (Throwable th) {
            c(a);
            throw th;
        }
    }
}
