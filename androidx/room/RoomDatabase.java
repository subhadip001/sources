package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import e.v.f;
import e.v.j;
import e.v.l;
import e.x.a.c;
import e.x.a.e;
import e.x.a.f.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class RoomDatabase {
    @Deprecated
    public volatile e.x.a.b a;
    public Executor b;
    public Executor c;

    /* renamed from: d  reason: collision with root package name */
    public e.x.a.c f557d;

    /* renamed from: e  reason: collision with root package name */
    public final f f558e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f559f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f560g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public List<b> f561h;

    /* renamed from: i  reason: collision with root package name */
    public final ReentrantReadWriteLock f562i = new ReentrantReadWriteLock();

    /* renamed from: j  reason: collision with root package name */
    public final ThreadLocal<Integer> f563j = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    /* loaded from: classes.dex */
    public static class a<T extends RoomDatabase> {
        public final Class<T> a;
        public final String b;
        public final Context c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<b> f564d;

        /* renamed from: e  reason: collision with root package name */
        public Executor f565e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f566f;

        /* renamed from: g  reason: collision with root package name */
        public c.InterfaceC0061c f567g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f568h;

        /* renamed from: k  reason: collision with root package name */
        public boolean f571k;

        /* renamed from: m  reason: collision with root package name */
        public Set<Integer> f573m;

        /* renamed from: i  reason: collision with root package name */
        public JournalMode f569i = JournalMode.AUTOMATIC;

        /* renamed from: j  reason: collision with root package name */
        public boolean f570j = true;

        /* renamed from: l  reason: collision with root package name */
        public final c f572l = new c();

        public a(Context context, Class<T> cls, String str) {
            this.c = context;
            this.a = cls;
            this.b = str;
        }

        public a<T> a(e.v.m.a... aVarArr) {
            if (this.f573m == null) {
                this.f573m = new HashSet();
            }
            for (e.v.m.a aVar : aVarArr) {
                this.f573m.add(Integer.valueOf(aVar.a));
                this.f573m.add(Integer.valueOf(aVar.b));
            }
            c cVar = this.f572l;
            Objects.requireNonNull(cVar);
            for (e.v.m.a aVar2 : aVarArr) {
                int i2 = aVar2.a;
                int i3 = aVar2.b;
                TreeMap<Integer, e.v.m.a> treeMap = cVar.a.get(Integer.valueOf(i2));
                if (treeMap == null) {
                    treeMap = new TreeMap<>();
                    cVar.a.put(Integer.valueOf(i2), treeMap);
                }
                e.v.m.a aVar3 = treeMap.get(Integer.valueOf(i3));
                if (aVar3 != null) {
                    Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
                }
                treeMap.put(Integer.valueOf(i3), aVar2);
            }
            return this;
        }

        public T b() {
            Executor executor;
            String str;
            Context context = this.c;
            if (context != null) {
                if (this.a != null) {
                    Executor executor2 = this.f565e;
                    if (executor2 == null && this.f566f == null) {
                        Executor executor3 = e.c.a.a.a.f1934d;
                        this.f566f = executor3;
                        this.f565e = executor3;
                    } else if (executor2 != null && this.f566f == null) {
                        this.f566f = executor2;
                    } else if (executor2 == null && (executor = this.f566f) != null) {
                        this.f565e = executor;
                    }
                    if (this.f567g == null) {
                        this.f567g = new d();
                    }
                    String str2 = this.b;
                    c.InterfaceC0061c interfaceC0061c = this.f567g;
                    c cVar = this.f572l;
                    ArrayList<b> arrayList = this.f564d;
                    boolean z = this.f568h;
                    JournalMode journalMode = this.f569i;
                    Objects.requireNonNull(journalMode);
                    if (journalMode == JournalMode.AUTOMATIC) {
                        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                        if (activityManager != null && !activityManager.isLowRamDevice()) {
                            journalMode = JournalMode.WRITE_AHEAD_LOGGING;
                        } else {
                            journalMode = JournalMode.TRUNCATE;
                        }
                    }
                    e.v.a aVar = new e.v.a(context, str2, interfaceC0061c, cVar, arrayList, z, journalMode, this.f565e, this.f566f, false, this.f570j, this.f571k, null, null, null);
                    Class<T> cls = this.a;
                    String name = cls.getPackage().getName();
                    String canonicalName = cls.getCanonicalName();
                    if (!name.isEmpty()) {
                        canonicalName = canonicalName.substring(name.length() + 1);
                    }
                    String str3 = canonicalName.replace('.', '_') + "_Impl";
                    try {
                        if (name.isEmpty()) {
                            str = str3;
                        } else {
                            str = name + "." + str3;
                        }
                        T t = (T) Class.forName(str).newInstance();
                        e.x.a.c f2 = t.f(aVar);
                        t.f557d = f2;
                        if (f2 instanceof j) {
                            ((j) f2).f2974k = aVar;
                        }
                        boolean z2 = aVar.f2936g == JournalMode.WRITE_AHEAD_LOGGING;
                        f2.setWriteAheadLoggingEnabled(z2);
                        t.f561h = aVar.f2934e;
                        t.b = aVar.f2937h;
                        t.c = new l(aVar.f2938i);
                        t.f559f = aVar.f2935f;
                        t.f560g = z2;
                        return t;
                    } catch (ClassNotFoundException unused) {
                        StringBuilder A = f.a.b.a.a.A("cannot find implementation for ");
                        A.append(cls.getCanonicalName());
                        A.append(". ");
                        A.append(str3);
                        A.append(" does not exist");
                        throw new RuntimeException(A.toString());
                    } catch (IllegalAccessException unused2) {
                        StringBuilder A2 = f.a.b.a.a.A("Cannot access the constructor");
                        A2.append(cls.getCanonicalName());
                        throw new RuntimeException(A2.toString());
                    } catch (InstantiationException unused3) {
                        StringBuilder A3 = f.a.b.a.a.A("Failed to create an instance of ");
                        A3.append(cls.getCanonicalName());
                        throw new RuntimeException(A3.toString());
                    }
                }
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(e.x.a.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public HashMap<Integer, TreeMap<Integer, e.v.m.a>> a = new HashMap<>();
    }

    public RoomDatabase() {
        new ConcurrentHashMap();
        this.f558e = e();
    }

    public void a() {
        if (this.f559f) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!h() && this.f563j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        e.x.a.b E = this.f557d.E();
        this.f558e.i(E);
        ((e.x.a.f.a) E).f2999f.beginTransaction();
    }

    public e.x.a.f.f d(String str) {
        a();
        b();
        return new e.x.a.f.f(((e.x.a.f.a) this.f557d.E()).f2999f.compileStatement(str));
    }

    public abstract f e();

    public abstract e.x.a.c f(e.v.a aVar);

    @Deprecated
    public void g() {
        ((e.x.a.f.a) this.f557d.E()).f2999f.endTransaction();
        if (h()) {
            return;
        }
        f fVar = this.f558e;
        if (fVar.f2944e.compareAndSet(false, true)) {
            fVar.f2943d.b.execute(fVar.f2950k);
        }
    }

    public boolean h() {
        return ((e.x.a.f.a) this.f557d.E()).f2999f.inTransaction();
    }

    public void i(e.x.a.b bVar) {
        f fVar = this.f558e;
        synchronized (fVar) {
            if (fVar.f2945f) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            ((e.x.a.f.a) bVar).f2999f.execSQL("PRAGMA temp_store = MEMORY;");
            ((e.x.a.f.a) bVar).f2999f.execSQL("PRAGMA recursive_triggers='ON';");
            ((e.x.a.f.a) bVar).f2999f.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            fVar.i(bVar);
            fVar.f2946g = new e.x.a.f.f(((e.x.a.f.a) bVar).f2999f.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
            fVar.f2945f = true;
        }
    }

    public boolean j() {
        e.x.a.b bVar = this.a;
        return bVar != null && ((e.x.a.f.a) bVar).f2999f.isOpen();
    }

    public Cursor k(e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal != null) {
            e.x.a.f.a aVar = (e.x.a.f.a) this.f557d.E();
            return aVar.f2999f.rawQueryWithFactory(new e.x.a.f.b(aVar, eVar), eVar.a(), e.x.a.f.a.f2998g, null, cancellationSignal);
        }
        return ((e.x.a.f.a) this.f557d.E()).f(eVar);
    }

    @Deprecated
    public void l() {
        ((e.x.a.f.a) this.f557d.E()).f2999f.setTransactionSuccessful();
    }
}
