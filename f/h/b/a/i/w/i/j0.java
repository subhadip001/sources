package f.h.b.a.i.w.i;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* compiled from: SchemaManager.java */
/* loaded from: classes.dex */
public final class j0 extends SQLiteOpenHelper {

    /* renamed from: h  reason: collision with root package name */
    public static final String f3761h;

    /* renamed from: i  reason: collision with root package name */
    public static int f3762i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f3763j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f3764k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f3765l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f3766m;
    public static final a n;
    public static final List<a> o;

    /* renamed from: f  reason: collision with root package name */
    public final int f3767f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3768g;

    /* compiled from: SchemaManager.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        StringBuilder A = f.a.b.a.a.A("INSERT INTO global_log_event_state VALUES (");
        A.append(System.currentTimeMillis());
        A.append(")");
        f3761h = A.toString();
        f3762i = 5;
        t tVar = new a() { // from class: f.h.b.a.i.w.i.t
            @Override // f.h.b.a.i.w.i.j0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                String str = j0.f3761h;
                sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
            }
        };
        f3763j = tVar;
        q qVar = new a() { // from class: f.h.b.a.i.w.i.q
            @Override // f.h.b.a.i.w.i.j0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                String str = j0.f3761h;
                sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
            }
        };
        f3764k = qVar;
        r rVar = new a() { // from class: f.h.b.a.i.w.i.r
            @Override // f.h.b.a.i.w.i.j0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                String str = j0.f3761h;
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f3765l = rVar;
        s sVar = new a() { // from class: f.h.b.a.i.w.i.s
            @Override // f.h.b.a.i.w.i.j0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                String str = j0.f3761h;
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
            }
        };
        f3766m = sVar;
        u uVar = new a() { // from class: f.h.b.a.i.w.i.u
            @Override // f.h.b.a.i.w.i.j0.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                String str = j0.f3761h;
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                sQLiteDatabase.execSQL(j0.f3761h);
            }
        };
        n = uVar;
        o = Arrays.asList(tVar, qVar, rVar, sVar, uVar);
    }

    public j0(Context context, String str, int i2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i2);
        this.f3768g = false;
        this.f3767f = i2;
    }

    public final void a(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        List<a> list = o;
        if (i3 <= list.size()) {
            while (i2 < i3) {
                o.get(i2).a(sQLiteDatabase);
                i2++;
            }
            return;
        }
        StringBuilder C = f.a.b.a.a.C("Migration from ", i2, " to ", i3, " was requested, but cannot be performed. Only ");
        C.append(list.size());
        C.append(" migrations are provided");
        throw new IllegalArgumentException(C.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f3768g = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i2 = this.f3767f;
        if (!this.f3768g) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f3768g) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f3768g) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (!this.f3768g) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i2, i3);
    }
}
