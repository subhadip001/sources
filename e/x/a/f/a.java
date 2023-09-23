package e.x.a.f;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* compiled from: FrameworkSQLiteDatabase.java */
/* loaded from: classes.dex */
public class a implements e.x.a.b {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f2998g = new String[0];

    /* renamed from: f  reason: collision with root package name */
    public final SQLiteDatabase f2999f;

    /* compiled from: FrameworkSQLiteDatabase.java */
    /* renamed from: e.x.a.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0062a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ e.x.a.e a;

        public C0062a(a aVar, e.x.a.e eVar) {
            this.a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.f(new e(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f2999f = sQLiteDatabase;
    }

    public String a() {
        return this.f2999f.getPath();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2999f.close();
    }

    public Cursor f(e.x.a.e eVar) {
        return this.f2999f.rawQueryWithFactory(new C0062a(this, eVar), eVar.a(), f2998g, null);
    }

    public Cursor g(String str) {
        return f(new e.x.a.a(str));
    }
}
