package e.x.a.f;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import e.v.g;
import e.x.a.c;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: FrameworkSQLiteOpenHelper.java */
/* loaded from: classes.dex */
public class c implements e.x.a.c {

    /* renamed from: f  reason: collision with root package name */
    public final Context f3000f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3001g;

    /* renamed from: h  reason: collision with root package name */
    public final c.a f3002h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3003i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f3004j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public a f3005k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3006l;

    /* compiled from: FrameworkSQLiteOpenHelper.java */
    /* loaded from: classes.dex */
    public static class a extends SQLiteOpenHelper {

        /* renamed from: f  reason: collision with root package name */
        public final e.x.a.f.a[] f3007f;

        /* renamed from: g  reason: collision with root package name */
        public final c.a f3008g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3009h;

        /* compiled from: FrameworkSQLiteOpenHelper.java */
        /* renamed from: e.x.a.f.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0063a implements DatabaseErrorHandler {
            public final /* synthetic */ c.a a;
            public final /* synthetic */ e.x.a.f.a[] b;

            public C0063a(c.a aVar, e.x.a.f.a[] aVarArr) {
                this.a = aVar;
                this.b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                c.a aVar = this.a;
                e.x.a.f.a f2 = a.f(this.b, sQLiteDatabase);
                Objects.requireNonNull(aVar);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + f2.a());
                if (!f2.f2999f.isOpen()) {
                    aVar.a(f2.a());
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = f2.f2999f.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            for (Pair<String, String> next : list) {
                                aVar.a((String) next.second);
                            }
                        } else {
                            aVar.a(f2.a());
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    f2.f2999f.close();
                } catch (IOException unused2) {
                }
            }
        }

        public a(Context context, String str, e.x.a.f.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.a, new C0063a(aVar, aVarArr));
            this.f3008g = aVar;
            this.f3007f = aVarArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000c, code lost:
            if ((r1.f2999f == r3) == false) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static e.x.a.f.a f(e.x.a.f.a[] r2, android.database.sqlite.SQLiteDatabase r3) {
            /*
                r0 = 0
                r1 = r2[r0]
                if (r1 == 0) goto Le
                android.database.sqlite.SQLiteDatabase r1 = r1.f2999f
                if (r1 != r3) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                if (r1 != 0) goto L15
            Le:
                e.x.a.f.a r1 = new e.x.a.f.a
                r1.<init>(r3)
                r2[r0] = r1
            L15:
                r2 = r2[r0]
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: e.x.a.f.c.a.f(e.x.a.f.a[], android.database.sqlite.SQLiteDatabase):e.x.a.f.a");
        }

        public e.x.a.f.a a(SQLiteDatabase sQLiteDatabase) {
            return f(this.f3007f, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f3007f[0] = null;
        }

        public synchronized e.x.a.b g() {
            this.f3009h = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (this.f3009h) {
                close();
                return g();
            }
            return a(writableDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            c.a aVar = this.f3008g;
            f(this.f3007f, sQLiteDatabase);
            Objects.requireNonNull((g) aVar);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            c.a aVar = this.f3008g;
            e.x.a.f.a f2 = f(this.f3007f, sQLiteDatabase);
            g gVar = (g) aVar;
            Objects.requireNonNull(gVar);
            Cursor f3 = f2.f(new e.x.a.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
            try {
                boolean z = false;
                if (f3.moveToFirst()) {
                    if (f3.getInt(0) == 0) {
                        z = true;
                    }
                }
                f3.close();
                gVar.c.a(f2);
                if (!z) {
                    g.b g2 = gVar.c.g(f2);
                    if (!g2.a) {
                        StringBuilder A = f.a.b.a.a.A("Pre-packaged database has an invalid schema: ");
                        A.append(g2.b);
                        throw new IllegalStateException(A.toString());
                    }
                }
                gVar.c(f2);
                gVar.c.c(f2);
            } catch (Throwable th) {
                f3.close();
                throw th;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f3009h = true;
            ((g) this.f3008g).b(f(this.f3007f, sQLiteDatabase), i2, i3);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onOpen(android.database.sqlite.SQLiteDatabase r6) {
            /*
                r5 = this;
                boolean r0 = r5.f3009h
                if (r0 != 0) goto L9e
                e.x.a.c$a r0 = r5.f3008g
                e.x.a.f.a[] r1 = r5.f3007f
                e.x.a.f.a r6 = f(r1, r6)
                e.v.g r0 = (e.v.g) r0
                java.util.Objects.requireNonNull(r0)
                e.x.a.a r1 = new e.x.a.a
                java.lang.String r2 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
                r1.<init>(r2)
                android.database.Cursor r1 = r6.f(r1)
                boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L99
                r3 = 0
                if (r2 == 0) goto L2b
                int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L99
                if (r2 == 0) goto L2b
                r2 = 1
                goto L2c
            L2b:
                r2 = 0
            L2c:
                r1.close()
                r1 = 0
                if (r2 == 0) goto L6a
                e.x.a.a r2 = new e.x.a.a
                java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
                r2.<init>(r4)
                android.database.Cursor r2 = r6.f(r2)
                boolean r4 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L65
                if (r4 == 0) goto L48
                java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L65
                goto L49
            L48:
                r3 = r1
            L49:
                r2.close()
                java.lang.String r2 = r0.f2955d
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L7c
                java.lang.String r2 = r0.f2956e
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L5d
                goto L7c
            L5d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number."
                r6.<init>(r0)
                throw r6
            L65:
                r6 = move-exception
                r2.close()
                throw r6
            L6a:
                e.v.g$a r2 = r0.c
                e.v.g$b r2 = r2.g(r6)
                boolean r3 = r2.a
                if (r3 == 0) goto L84
                e.v.g$a r2 = r0.c
                r2.e(r6)
                r0.c(r6)
            L7c:
                e.v.g$a r2 = r0.c
                r2.d(r6)
                r0.b = r1
                goto L9e
            L84:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Pre-packaged database has an invalid schema: "
                java.lang.StringBuilder r0 = f.a.b.a.a.A(r0)
                java.lang.String r1 = r2.b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L99:
                r6 = move-exception
                r1.close()
                throw r6
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.x.a.f.c.a.onOpen(android.database.sqlite.SQLiteDatabase):void");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f3009h = true;
            this.f3008g.b(f(this.f3007f, sQLiteDatabase), i2, i3);
        }
    }

    public c(Context context, String str, c.a aVar, boolean z) {
        this.f3000f = context;
        this.f3001g = str;
        this.f3002h = aVar;
        this.f3003i = z;
    }

    @Override // e.x.a.c
    public e.x.a.b E() {
        return a().g();
    }

    public final a a() {
        a aVar;
        synchronized (this.f3004j) {
            if (this.f3005k == null) {
                e.x.a.f.a[] aVarArr = new e.x.a.f.a[1];
                if (Build.VERSION.SDK_INT >= 23 && this.f3001g != null && this.f3003i) {
                    this.f3005k = new a(this.f3000f, new File(this.f3000f.getNoBackupFilesDir(), this.f3001g).getAbsolutePath(), aVarArr, this.f3002h);
                } else {
                    this.f3005k = new a(this.f3000f, this.f3001g, aVarArr, this.f3002h);
                }
                this.f3005k.setWriteAheadLoggingEnabled(this.f3006l);
            }
            aVar = this.f3005k;
        }
        return aVar;
    }

    @Override // e.x.a.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // e.x.a.c
    public String getDatabaseName() {
        return this.f3001g;
    }

    @Override // e.x.a.c
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f3004j) {
            a aVar = this.f3005k;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f3006l = z;
        }
    }
}
