package f.h.b.a.i.w.i;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.firebase.inappmessaging.internal.AnalyticsConstants;
import f.h.b.a.i.c;
import f.h.b.a.i.d;
import f.h.b.a.i.h;
import f.h.b.a.i.l;
import f.h.b.a.i.u.a.a;
import f.h.b.a.i.w.i.h0;
import f.h.b.a.i.x.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: SQLiteEventStore.java */
/* loaded from: classes.dex */
public class h0 implements a0, f.h.b.a.i.x.a, z {

    /* renamed from: k  reason: collision with root package name */
    public static final f.h.b.a.b f3753k = new f.h.b.a.b("proto");

    /* renamed from: f  reason: collision with root package name */
    public final j0 f3754f;

    /* renamed from: g  reason: collision with root package name */
    public final f.h.b.a.i.y.a f3755g;

    /* renamed from: h  reason: collision with root package name */
    public final f.h.b.a.i.y.a f3756h;

    /* renamed from: i  reason: collision with root package name */
    public final b0 f3757i;

    /* renamed from: j  reason: collision with root package name */
    public final h.a.a<String> f3758j;

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes.dex */
    public interface b<T, U> {
        U apply(T t);
    }

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes.dex */
    public static class c {
        public final String a;
        public final String b;

        public c(String str, String str2, a aVar) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: SQLiteEventStore.java */
    /* loaded from: classes.dex */
    public interface d<T> {
        T a();
    }

    public h0(f.h.b.a.i.y.a aVar, f.h.b.a.i.y.a aVar2, b0 b0Var, j0 j0Var, h.a.a<String> aVar3) {
        this.f3754f = j0Var;
        this.f3755g = aVar;
        this.f3756h = aVar2;
        this.f3757i = b0Var;
        this.f3758j = aVar3;
    }

    public static String M(Iterable<g0> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<g0> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static <T> T N(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final List<g0> C(SQLiteDatabase sQLiteDatabase, final f.h.b.a.i.l lVar, int i2) {
        final ArrayList arrayList = new ArrayList();
        Long q = q(sQLiteDatabase, lVar);
        if (q == null) {
            return arrayList;
        }
        N(sQLiteDatabase.query(AnalyticsConstants.BUNDLE_EVENT_NAME_KEY, new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{q.toString()}, null, null, null, String.valueOf(i2)), new b() { // from class: f.h.b.a.i.w.i.l
            @Override // f.h.b.a.i.w.i.h0.b
            public final Object apply(Object obj) {
                f.h.b.a.b bVar;
                f.h.b.a.b bVar2;
                h0 h0Var = h0.this;
                List list = arrayList;
                f.h.b.a.i.l lVar2 = lVar;
                Cursor cursor = (Cursor) obj;
                Objects.requireNonNull(h0Var);
                while (cursor.moveToNext()) {
                    long j2 = cursor.getLong(0);
                    boolean z = cursor.getInt(7) != 0;
                    h.a a2 = f.h.b.a.i.h.a();
                    a2.f(cursor.getString(1));
                    a2.e(cursor.getLong(2));
                    a2.g(cursor.getLong(3));
                    if (z) {
                        String string = cursor.getString(4);
                        if (string == null) {
                            bVar2 = h0.f3753k;
                        } else {
                            bVar2 = new f.h.b.a.b(string);
                        }
                        a2.d(new f.h.b.a.i.g(bVar2, cursor.getBlob(5)));
                    } else {
                        String string2 = cursor.getString(4);
                        if (string2 == null) {
                            bVar = h0.f3753k;
                        } else {
                            bVar = new f.h.b.a.b(string2);
                        }
                        a2.d(new f.h.b.a.i.g(bVar, (byte[]) h0.N(h0Var.p().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num"), new h0.b() { // from class: f.h.b.a.i.w.i.g
                            @Override // f.h.b.a.i.w.i.h0.b
                            public final Object apply(Object obj2) {
                                Cursor cursor2 = (Cursor) obj2;
                                f.h.b.a.b bVar3 = h0.f3753k;
                                ArrayList arrayList2 = new ArrayList();
                                int i3 = 0;
                                while (cursor2.moveToNext()) {
                                    byte[] blob = cursor2.getBlob(0);
                                    arrayList2.add(blob);
                                    i3 += blob.length;
                                }
                                byte[] bArr = new byte[i3];
                                int i4 = 0;
                                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                    byte[] bArr2 = (byte[]) arrayList2.get(i5);
                                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                                    i4 += bArr2.length;
                                }
                                return bArr;
                            }
                        })));
                    }
                    if (!cursor.isNull(6)) {
                        ((c.b) a2).b = Integer.valueOf(cursor.getInt(6));
                    }
                    list.add(new y(j2, lVar2, a2.b()));
                }
                return null;
            }
        });
        return arrayList;
    }

    public final <T> T F(d<T> dVar, b<Throwable, T> bVar) {
        long time = this.f3756h.getTime();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f3756h.getTime() >= this.f3757i.a() + time) {
                    return bVar.apply(e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // f.h.b.a.i.w.i.a0
    public g0 U(final f.h.b.a.i.l lVar, final f.h.b.a.i.h hVar) {
        f.c.a.a.i.j("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", lVar.d(), hVar.h(), lVar.b());
        long longValue = ((Long) v(new b() { // from class: f.h.b.a.i.w.i.m
            @Override // f.h.b.a.i.w.i.h0.b
            public final Object apply(Object obj) {
                long insert;
                h0 h0Var = h0.this;
                f.h.b.a.i.h hVar2 = hVar;
                f.h.b.a.i.l lVar2 = lVar;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (h0Var.p().compileStatement("PRAGMA page_size").simpleQueryForLong() * h0Var.p().compileStatement("PRAGMA page_count").simpleQueryForLong() >= h0Var.f3757i.e()) {
                    h0Var.l(1L, LogEventDropped.Reason.CACHE_FULL, hVar2.h());
                    return -1L;
                }
                Long q = h0Var.q(sQLiteDatabase, lVar2);
                if (q != null) {
                    insert = q.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", lVar2.b());
                    contentValues.put("priority", Integer.valueOf(f.h.b.a.i.z.a.a(lVar2.d())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (lVar2.c() != null) {
                        contentValues.put(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE, Base64.encodeToString(lVar2.c(), 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int d2 = h0Var.f3757i.d();
                byte[] bArr = hVar2.e().b;
                boolean z = bArr.length <= d2;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", hVar2.h());
                contentValues2.put("timestamp_ms", Long.valueOf(hVar2.f()));
                contentValues2.put("uptime_ms", Long.valueOf(hVar2.i()));
                contentValues2.put("payload_encoding", hVar2.e().a.a);
                contentValues2.put("code", hVar2.d());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr : new byte[0]);
                long insert2 = sQLiteDatabase.insert(AnalyticsConstants.BUNDLE_EVENT_NAME_KEY, null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr.length / d2);
                    for (int i2 = 1; i2 <= ceil; i2++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, (i2 - 1) * d2, Math.min(i2 * d2, bArr.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i2));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar2.c()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return new y(longValue, lVar, hVar);
    }

    @Override // f.h.b.a.i.w.i.a0
    public long Z(f.h.b.a.i.l lVar) {
        Long l2;
        Cursor rawQuery = p().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{lVar.b(), String.valueOf(f.h.b.a.i.z.a.a(lVar.d()))});
        try {
            if (rawQuery.moveToNext()) {
                l2 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l2 = 0L;
            }
            rawQuery.close();
            return l2.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // f.h.b.a.i.w.i.z
    public void a() {
        SQLiteDatabase p = p();
        p.beginTransaction();
        try {
            Objects.requireNonNull(this);
            p.compileStatement("DELETE FROM log_event_dropped").execute();
            p.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f3755g.getTime()).execute();
            p.setTransactionSuccessful();
        } finally {
            p.endTransaction();
        }
    }

    @Override // f.h.b.a.i.w.i.a0
    public boolean c0(f.h.b.a.i.l lVar) {
        Boolean bool;
        SQLiteDatabase p = p();
        p.beginTransaction();
        try {
            Long q = q(p, lVar);
            if (q == null) {
                bool = Boolean.FALSE;
            } else {
                bool = (Boolean) N(p().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{q.toString()}), new b() { // from class: f.h.b.a.i.w.i.v
                    @Override // f.h.b.a.i.w.i.h0.b
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((Cursor) obj).moveToNext());
                    }
                });
            }
            p.setTransactionSuccessful();
            p.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th) {
            p.endTransaction();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3754f.close();
    }

    @Override // f.h.b.a.i.w.i.a0
    public void e0(Iterable<g0> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder A = f.a.b.a.a.A("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            A.append(M(iterable));
            String sb = A.toString();
            SQLiteDatabase p = p();
            p.beginTransaction();
            try {
                Objects.requireNonNull(this);
                p.compileStatement(sb).execute();
                N(p.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null), new b() { // from class: f.h.b.a.i.w.i.o
                    @Override // f.h.b.a.i.w.i.h0.b
                    public final Object apply(Object obj) {
                        h0 h0Var = h0.this;
                        Cursor cursor = (Cursor) obj;
                        Objects.requireNonNull(h0Var);
                        while (cursor.moveToNext()) {
                            int i2 = cursor.getInt(0);
                            h0Var.l(i2, LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
                        }
                        return null;
                    }
                });
                p.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                p.setTransactionSuccessful();
            } finally {
                p.endTransaction();
            }
        }
    }

    @Override // f.h.b.a.i.x.a
    public <T> T f(a.InterfaceC0099a<T> interfaceC0099a) {
        final SQLiteDatabase p = p();
        F(new d() { // from class: f.h.b.a.i.w.i.e
            @Override // f.h.b.a.i.w.i.h0.d
            public final Object a() {
                p.beginTransaction();
                return null;
            }
        }, new b() { // from class: f.h.b.a.i.w.i.b
            @Override // f.h.b.a.i.w.i.h0.b
            public final Object apply(Object obj) {
                f.h.b.a.b bVar = h0.f3753k;
                throw new SynchronizationException("Timed out while trying to acquire the lock.", (Throwable) obj);
            }
        });
        try {
            T a2 = interfaceC0099a.a();
            p.setTransactionSuccessful();
            return a2;
        } finally {
            p.endTransaction();
        }
    }

    @Override // f.h.b.a.i.w.i.z
    public f.h.b.a.i.u.a.a g() {
        int i2 = f.h.b.a.i.u.a.a.f3717e;
        final a.C0098a c0098a = new a.C0098a();
        final HashMap hashMap = new HashMap();
        SQLiteDatabase p = p();
        p.beginTransaction();
        try {
            Objects.requireNonNull(this);
            f.h.b.a.i.u.a.a aVar = (f.h.b.a.i.u.a.a) N(p.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new b() { // from class: f.h.b.a.i.w.i.n
                @Override // f.h.b.a.i.w.i.h0.b
                public final Object apply(Object obj) {
                    h0 h0Var = h0.this;
                    Map map = hashMap;
                    a.C0098a c0098a2 = c0098a;
                    Cursor cursor = (Cursor) obj;
                    Objects.requireNonNull(h0Var);
                    while (cursor.moveToNext()) {
                        String string = cursor.getString(0);
                        int i3 = cursor.getInt(1);
                        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
                        if (i3 != reason.getNumber()) {
                            LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                            if (i3 != reason2.getNumber()) {
                                reason2 = LogEventDropped.Reason.CACHE_FULL;
                                if (i3 != reason2.getNumber()) {
                                    reason2 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                                    if (i3 != reason2.getNumber()) {
                                        reason2 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                                        if (i3 != reason2.getNumber()) {
                                            reason2 = LogEventDropped.Reason.INVALID_PAYLOD;
                                            if (i3 != reason2.getNumber()) {
                                                reason2 = LogEventDropped.Reason.SERVER_ERROR;
                                                if (i3 != reason2.getNumber()) {
                                                    f.c.a.a.i.i("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i3));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            reason = reason2;
                        }
                        long j2 = cursor.getLong(2);
                        if (!map.containsKey(string)) {
                            map.put(string, new ArrayList());
                        }
                        int i4 = LogEventDropped.c;
                        ((List) map.get(string)).add(new LogEventDropped(j2, reason));
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        int i5 = f.h.b.a.i.u.a.c.c;
                        new ArrayList();
                        c0098a2.b.add(new f.h.b.a.i.u.a.c((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                    }
                    final long time = h0Var.f3755g.getTime();
                    c0098a2.a = (f.h.b.a.i.u.a.e) h0Var.v(new h0.b() { // from class: f.h.b.a.i.w.i.k
                        @Override // f.h.b.a.i.w.i.h0.b
                        public final Object apply(Object obj2) {
                            final long j3 = time;
                            return (f.h.b.a.i.u.a.e) h0.N(((SQLiteDatabase) obj2).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new h0.b() { // from class: f.h.b.a.i.w.i.c
                                @Override // f.h.b.a.i.w.i.h0.b
                                public final Object apply(Object obj3) {
                                    long j4 = j3;
                                    Cursor cursor2 = (Cursor) obj3;
                                    cursor2.moveToNext();
                                    long j5 = cursor2.getLong(0);
                                    int i6 = f.h.b.a.i.u.a.e.c;
                                    return new f.h.b.a.i.u.a.e(j5, j4);
                                }
                            });
                        }
                    });
                    int i6 = f.h.b.a.i.u.a.b.b;
                    int i7 = f.h.b.a.i.u.a.d.c;
                    c0098a2.c = new f.h.b.a.i.u.a.b(new f.h.b.a.i.u.a.d(h0Var.p().compileStatement("PRAGMA page_size").simpleQueryForLong() * h0Var.p().compileStatement("PRAGMA page_count").simpleQueryForLong(), b0.a.e()));
                    c0098a2.f3719d = h0Var.f3758j.get();
                    return new f.h.b.a.i.u.a.a(c0098a2.a, Collections.unmodifiableList(c0098a2.b), c0098a2.c, c0098a2.f3719d);
                }
            });
            p.setTransactionSuccessful();
            return aVar;
        } finally {
            p.endTransaction();
        }
    }

    @Override // f.h.b.a.i.w.i.a0
    public int h() {
        long time = this.f3755g.getTime() - this.f3757i.b();
        SQLiteDatabase p = p();
        p.beginTransaction();
        try {
            Objects.requireNonNull(this);
            String[] strArr = {String.valueOf(time)};
            N(p.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: f.h.b.a.i.w.i.j
                @Override // f.h.b.a.i.w.i.h0.b
                public final Object apply(Object obj) {
                    h0 h0Var = h0.this;
                    Cursor cursor = (Cursor) obj;
                    Objects.requireNonNull(h0Var);
                    while (cursor.moveToNext()) {
                        int i2 = cursor.getInt(0);
                        h0Var.l(i2, LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
                    }
                    return null;
                }
            });
            Integer valueOf = Integer.valueOf(p.delete(AnalyticsConstants.BUNDLE_EVENT_NAME_KEY, "timestamp_ms < ?", strArr));
            p.setTransactionSuccessful();
            p.endTransaction();
            return valueOf.intValue();
        } catch (Throwable th) {
            p.endTransaction();
            throw th;
        }
    }

    @Override // f.h.b.a.i.w.i.a0
    public void i(Iterable<g0> iterable) {
        if (iterable.iterator().hasNext()) {
            StringBuilder A = f.a.b.a.a.A("DELETE FROM events WHERE _id in ");
            A.append(M(iterable));
            p().compileStatement(A.toString()).execute();
        }
    }

    @Override // f.h.b.a.i.w.i.z
    public void l(final long j2, final LogEventDropped.Reason reason, final String str) {
        v(new b() { // from class: f.h.b.a.i.w.i.i
            @Override // f.h.b.a.i.w.i.h0.b
            public final Object apply(Object obj) {
                String str2 = str;
                LogEventDropped.Reason reason2 = reason;
                long j3 = j2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (!((Boolean) h0.N(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(reason2.getNumber())}), new h0.b() { // from class: f.h.b.a.i.w.i.p
                    @Override // f.h.b.a.i.w.i.h0.b
                    public final Object apply(Object obj2) {
                        f.h.b.a.b bVar = h0.f3753k;
                        return Boolean.valueOf(((Cursor) obj2).getCount() > 0);
                    }
                })).booleanValue()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(reason2.getNumber()));
                    contentValues.put("events_dropped_count", Long.valueOf(j3));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                } else {
                    sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j3 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(reason2.getNumber())});
                }
                return null;
            }
        });
    }

    @Override // f.h.b.a.i.w.i.a0
    public Iterable<g0> o(final f.h.b.a.i.l lVar) {
        return (Iterable) v(new b() { // from class: f.h.b.a.i.w.i.d
            @Override // f.h.b.a.i.w.i.h0.b
            public final Object apply(Object obj) {
                ArrayList arrayList;
                h0 h0Var = h0.this;
                f.h.b.a.i.l lVar2 = lVar;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                List<g0> C = h0Var.C(sQLiteDatabase, lVar2, h0Var.f3757i.c());
                Priority[] values = Priority.values();
                for (int i2 = 0; i2 < 3; i2++) {
                    Priority priority = values[i2];
                    if (priority != lVar2.d()) {
                        ArrayList arrayList2 = (ArrayList) C;
                        int c2 = h0Var.f3757i.c() - arrayList2.size();
                        if (c2 <= 0) {
                            break;
                        }
                        arrayList2.addAll(h0Var.C(sQLiteDatabase, lVar2.e(priority), c2));
                    }
                }
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                int i3 = 0;
                while (true) {
                    arrayList = (ArrayList) C;
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    sb.append(((g0) arrayList.get(i3)).b());
                    if (i3 < arrayList.size() - 1) {
                        sb.append(',');
                    }
                    i3++;
                }
                sb.append(')');
                Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
                while (query.moveToNext()) {
                    try {
                        long j2 = query.getLong(0);
                        Set set = (Set) hashMap.get(Long.valueOf(j2));
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(Long.valueOf(j2), set);
                        }
                        set.add(new h0.c(query.getString(1), query.getString(2), null));
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
                ListIterator listIterator = arrayList.listIterator();
                while (listIterator.hasNext()) {
                    g0 g0Var = (g0) listIterator.next();
                    if (hashMap.containsKey(Long.valueOf(g0Var.b()))) {
                        h.a j3 = g0Var.a().j();
                        for (h0.c cVar : (Set) hashMap.get(Long.valueOf(g0Var.b()))) {
                            j3.a(cVar.a, cVar.b);
                        }
                        listIterator.set(new y(g0Var.b(), g0Var.c(), j3.b()));
                    }
                }
                return C;
            }
        });
    }

    public SQLiteDatabase p() {
        final j0 j0Var = this.f3754f;
        Objects.requireNonNull(j0Var);
        return (SQLiteDatabase) F(new d() { // from class: f.h.b.a.i.w.i.w
            @Override // f.h.b.a.i.w.i.h0.d
            public final Object a() {
                return j0.this.getWritableDatabase();
            }
        }, new b() { // from class: f.h.b.a.i.w.i.a
            @Override // f.h.b.a.i.w.i.h0.b
            public final Object apply(Object obj) {
                f.h.b.a.b bVar = h0.f3753k;
                throw new SynchronizationException("Timed out while trying to open db.", (Throwable) obj);
            }
        });
    }

    public final Long q(SQLiteDatabase sQLiteDatabase, f.h.b.a.i.l lVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(lVar.b(), String.valueOf(f.h.b.a.i.z.a.a(lVar.d()))));
        if (lVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(lVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    @Override // f.h.b.a.i.w.i.a0
    public void r(final f.h.b.a.i.l lVar, final long j2) {
        v(new b() { // from class: f.h.b.a.i.w.i.f
            @Override // f.h.b.a.i.w.i.h0.b
            public final Object apply(Object obj) {
                long j3 = j2;
                f.h.b.a.i.l lVar2 = lVar;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j3));
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{lVar2.b(), String.valueOf(f.h.b.a.i.z.a.a(lVar2.d()))}) < 1) {
                    contentValues.put("backend_name", lVar2.b());
                    contentValues.put("priority", Integer.valueOf(f.h.b.a.i.z.a.a(lVar2.d())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    public <T> T v(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase p = p();
        p.beginTransaction();
        try {
            T apply = bVar.apply(p);
            p.setTransactionSuccessful();
            return apply;
        } finally {
            p.endTransaction();
        }
    }

    @Override // f.h.b.a.i.w.i.a0
    public Iterable<f.h.b.a.i.l> w() {
        SQLiteDatabase p = p();
        p.beginTransaction();
        try {
            List list = (List) N(p.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: f.h.b.a.i.w.i.h
                @Override // f.h.b.a.i.w.i.h0.b
                public final Object apply(Object obj) {
                    Cursor cursor = (Cursor) obj;
                    f.h.b.a.b bVar = h0.f3753k;
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        l.a a2 = f.h.b.a.i.l.a();
                        a2.b(cursor.getString(1));
                        a2.c(f.h.b.a.i.z.a.b(cursor.getInt(2)));
                        String string = cursor.getString(3);
                        d.b bVar2 = (d.b) a2;
                        bVar2.b = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(bVar2.a());
                    }
                    return arrayList;
                }
            });
            p.setTransactionSuccessful();
            return list;
        } finally {
            p.endTransaction();
        }
    }
}
