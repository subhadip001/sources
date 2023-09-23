package e.v;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: InvalidationTracker.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: l  reason: collision with root package name */
    public static final String[] f2942l = {"UPDATE", "DELETE", "INSERT"};
    public final String[] b;
    public Map<String, Set<String>> c;

    /* renamed from: d  reason: collision with root package name */
    public final RoomDatabase f2943d;

    /* renamed from: g  reason: collision with root package name */
    public volatile e.x.a.f.f f2946g;

    /* renamed from: h  reason: collision with root package name */
    public b f2947h;

    /* renamed from: i  reason: collision with root package name */
    public final e.v.e f2948i;

    /* renamed from: e  reason: collision with root package name */
    public AtomicBoolean f2944e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f2945f = false;

    /* renamed from: j  reason: collision with root package name */
    public final e.c.a.b.b<c, d> f2949j = new e.c.a.b.b<>();

    /* renamed from: k  reason: collision with root package name */
    public Runnable f2950k = new a();
    public final HashMap<String, Integer> a = new HashMap<>();

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        public final Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor k2 = f.this.f2943d.k(new e.x.a.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
            while (k2.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(k2.getInt(0)));
                } catch (Throwable th) {
                    k2.close();
                    throw th;
                }
            }
            k2.close();
            if (!hashSet.isEmpty()) {
                f.this.f2946g.a();
            }
            return hashSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00ea A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v9 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 239
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e.v.f.a.run():void");
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class b {
        public final long[] a;
        public final boolean[] b;
        public final int[] c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2952d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2953e;

        public b(int i2) {
            long[] jArr = new long[i2];
            this.a = jArr;
            boolean[] zArr = new boolean[i2];
            this.b = zArr;
            this.c = new int[i2];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public int[] a() {
            synchronized (this) {
                if (this.f2952d && !this.f2953e) {
                    int length = this.a.length;
                    int i2 = 0;
                    while (true) {
                        int i3 = 1;
                        if (i2 < length) {
                            boolean z = this.a[i2] > 0;
                            boolean[] zArr = this.b;
                            if (z != zArr[i2]) {
                                int[] iArr = this.c;
                                if (!z) {
                                    i3 = 2;
                                }
                                iArr[i2] = i3;
                            } else {
                                this.c[i2] = 0;
                            }
                            zArr[i2] = z;
                            i2++;
                        } else {
                            this.f2953e = true;
                            this.f2952d = false;
                            return this.c;
                        }
                    }
                }
                return null;
            }
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public final String[] a;

        public c(String[] strArr) {
            this.a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public abstract void a(Set<String> set);
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class d {
        public final int[] a;
        public final String[] b;
        public final c c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f2954d;

        public d(c cVar, int[] iArr, String[] strArr) {
            this.c = cVar;
            this.a = iArr;
            this.b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.f2954d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f2954d = null;
        }
    }

    /* compiled from: InvalidationTracker.java */
    /* loaded from: classes.dex */
    public static class e extends c {
        public final f b;
        public final WeakReference<c> c;

        public e(f fVar, c cVar) {
            super(cVar.a);
            this.b = fVar;
            this.c = new WeakReference<>(cVar);
        }

        @Override // e.v.f.c
        public void a(Set<String> set) {
            c cVar = this.c.get();
            if (cVar == null) {
                this.b.d(this);
            } else {
                cVar.a(set);
            }
        }
    }

    public f(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f2943d = roomDatabase;
        this.f2947h = new b(strArr.length);
        this.c = map2;
        this.f2948i = new e.v.e(roomDatabase);
        int length = strArr.length;
        this.b = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr[i2];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.a.put(lowerCase, Integer.valueOf(i2));
            String str2 = map.get(strArr[i2]);
            if (str2 != null) {
                this.b[i2] = str2.toLowerCase(locale);
            } else {
                this.b[i2] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = entry.getValue().toLowerCase(locale2);
            if (this.a.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public void a(c cVar) {
        d d2;
        boolean z;
        String[] e2 = e(cVar.a);
        int length = e2.length;
        int[] iArr = new int[length];
        int length2 = e2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            Integer num = this.a.get(e2[i2].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i2] = num.intValue();
            } else {
                StringBuilder A = f.a.b.a.a.A("There is no table with name ");
                A.append(e2[i2]);
                throw new IllegalArgumentException(A.toString());
            }
        }
        d dVar = new d(cVar, iArr, e2);
        synchronized (this.f2949j) {
            d2 = this.f2949j.d(cVar, dVar);
        }
        if (d2 == null) {
            b bVar = this.f2947h;
            synchronized (bVar) {
                z = false;
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = iArr[i3];
                    long[] jArr = bVar.a;
                    long j2 = jArr[i4];
                    jArr[i4] = 1 + j2;
                    if (j2 == 0) {
                        bVar.f2952d = true;
                        z = true;
                    }
                }
            }
            if (z) {
                h();
            }
        }
    }

    public <T> LiveData<T> b(String[] strArr, boolean z, Callable<T> callable) {
        e.v.e eVar = this.f2948i;
        String[] e2 = e(strArr);
        for (String str : e2) {
            if (!this.a.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException(f.a.b.a.a.p("There is no table with name ", str));
            }
        }
        Objects.requireNonNull(eVar);
        return new i(eVar.b, eVar, z, callable, e2);
    }

    public boolean c() {
        if (this.f2943d.j()) {
            if (!this.f2945f) {
                this.f2943d.f557d.E();
            }
            if (this.f2945f) {
                return true;
            }
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return false;
    }

    public void d(c cVar) {
        d e2;
        boolean z;
        synchronized (this.f2949j) {
            e2 = this.f2949j.e(cVar);
        }
        if (e2 != null) {
            b bVar = this.f2947h;
            int[] iArr = e2.a;
            synchronized (bVar) {
                z = false;
                for (int i2 : iArr) {
                    long[] jArr = bVar.a;
                    long j2 = jArr[i2];
                    jArr[i2] = j2 - 1;
                    if (j2 == 1) {
                        bVar.f2952d = true;
                        z = true;
                    }
                }
            }
            if (z) {
                h();
            }
        }
    }

    public final String[] e(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.c.containsKey(lowerCase)) {
                hashSet.addAll(this.c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final void f(e.x.a.b bVar, int i2) {
        String[] strArr;
        e.x.a.f.a aVar = (e.x.a.f.a) bVar;
        aVar.f2999f.execSQL(f.a.b.a.a.j("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i2, ", 0)"));
        String str = this.b[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2942l) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            f.a.b.a.a.R(sb, str, "_", str2, "`");
            f.a.b.a.a.R(sb, " AFTER ", str2, " ON `", str);
            f.a.b.a.a.R(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            f.a.b.a.a.R(sb, " = 1", " WHERE ", "table_id", " = ");
            sb.append(i2);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            aVar.f2999f.execSQL(sb.toString());
        }
    }

    public final void g(e.x.a.b bVar, int i2) {
        String[] strArr;
        String str = this.b[i2];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f2942l) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            ((e.x.a.f.a) bVar).f2999f.execSQL(f.a.b.a.a.w(sb, str, "_", str2, "`"));
        }
    }

    public void h() {
        if (this.f2943d.j()) {
            i(this.f2943d.f557d.E());
        }
    }

    public void i(e.x.a.b bVar) {
        if (((e.x.a.f.a) bVar).f2999f.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.f2943d.f562i.readLock();
                readLock.lock();
                try {
                    int[] a2 = this.f2947h.a();
                    if (a2 == null) {
                        return;
                    }
                    int length = a2.length;
                    ((e.x.a.f.a) bVar).f2999f.beginTransaction();
                    for (int i2 = 0; i2 < length; i2++) {
                        int i3 = a2[i2];
                        if (i3 == 1) {
                            f(bVar, i2);
                        } else if (i3 == 2) {
                            g(bVar, i2);
                        }
                    }
                    ((e.x.a.f.a) bVar).f2999f.setTransactionSuccessful();
                    ((e.x.a.f.a) bVar).f2999f.endTransaction();
                    b bVar2 = this.f2947h;
                    synchronized (bVar2) {
                        bVar2.f2953e = false;
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e2) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
                return;
            }
        }
    }
}
