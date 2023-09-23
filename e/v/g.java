package e.v;

import e.x.a.c;

/* compiled from: RoomOpenHelper.java */
/* loaded from: classes.dex */
public class g extends c.a {
    public e.v.a b;
    public final a c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2955d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2956e;

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        public final int a;

        public a(int i2) {
            this.a = i2;
        }

        public abstract void a(e.x.a.b bVar);

        public abstract void b(e.x.a.b bVar);

        public abstract void c(e.x.a.b bVar);

        public abstract void d(e.x.a.b bVar);

        public abstract void e(e.x.a.b bVar);

        public abstract void f(e.x.a.b bVar);

        public abstract b g(e.x.a.b bVar);
    }

    /* compiled from: RoomOpenHelper.java */
    /* loaded from: classes.dex */
    public static class b {
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public g(e.v.a aVar, a aVar2, String str, String str2) {
        super(aVar2.a);
        this.b = aVar;
        this.c = aVar2;
        this.f2955d = str;
        this.f2956e = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
        r0 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0075 A[EDGE_INSN: B:62:0x0075->B:37:0x0075 ?: BREAK  , SYNTHETIC] */
    @Override // e.x.a.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(e.x.a.b r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.v.g.b(e.x.a.b, int, int):void");
    }

    public final void c(e.x.a.b bVar) {
        e.x.a.f.a aVar = (e.x.a.f.a) bVar;
        aVar.f2999f.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        aVar.f2999f.execSQL(f.a.b.a.a.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", this.f2955d, "')"));
    }
}
