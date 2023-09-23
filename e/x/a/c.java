package e.x.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* compiled from: SupportSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public interface c extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        public final void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e2) {
                Log.w("SupportSQLite", "delete failed: ", e2);
            }
        }

        public abstract void b(e.x.a.b bVar, int i2, int i3);
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2997d;

        public b(Context context, String str, a aVar, boolean z) {
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.f2997d = z;
        }
    }

    /* compiled from: SupportSQLiteOpenHelper.java */
    /* renamed from: e.x.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0061c {
        c a(b bVar);
    }

    e.x.a.b E();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
