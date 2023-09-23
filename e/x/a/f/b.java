package e.x.a.f;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* compiled from: FrameworkSQLiteDatabase.java */
/* loaded from: classes.dex */
public class b implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ e.x.a.e a;

    public b(a aVar, e.x.a.e eVar) {
        this.a = eVar;
    }

    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
    public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.a.f(new e(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
