package e.v;

import androidx.room.RoomDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement.java */
/* loaded from: classes.dex */
public abstract class k {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final RoomDatabase b;
    public volatile e.x.a.f.f c;

    public k(RoomDatabase roomDatabase) {
        this.b = roomDatabase;
    }

    public e.x.a.f.f a() {
        this.b.a();
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                this.c = this.b.d(b());
            }
            return this.c;
        }
        return this.b.d(b());
    }

    public abstract String b();

    public void c(e.x.a.f.f fVar) {
        if (fVar == this.c) {
            this.a.set(false);
        }
    }
}
