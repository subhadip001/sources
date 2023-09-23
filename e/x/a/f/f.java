package e.x.a.f;

import android.database.sqlite.SQLiteStatement;

/* compiled from: FrameworkSQLiteStatement.java */
/* loaded from: classes.dex */
public class f extends e implements e.x.a.d {

    /* renamed from: g  reason: collision with root package name */
    public final SQLiteStatement f3011g;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3011g = sQLiteStatement;
    }

    public int a() {
        return this.f3011g.executeUpdateDelete();
    }
}
