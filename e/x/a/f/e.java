package e.x.a.f;

import android.database.sqlite.SQLiteProgram;

/* compiled from: FrameworkSQLiteProgram.java */
/* loaded from: classes.dex */
public class e implements e.x.a.d {

    /* renamed from: f  reason: collision with root package name */
    public final SQLiteProgram f3010f;

    public e(SQLiteProgram sQLiteProgram) {
        this.f3010f = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3010f.close();
    }
}
