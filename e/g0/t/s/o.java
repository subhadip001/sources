package e.g0.t.s;

import androidx.room.RoomDatabase;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes.dex */
public final class o implements n {
    public final RoomDatabase a;
    public final e.v.b<m> b;
    public final e.v.k c;

    /* renamed from: d  reason: collision with root package name */
    public final e.v.k f2335d;

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends e.v.b<m> {
        public a(o oVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // e.v.b
        public void d(e.x.a.f.f fVar, m mVar) {
            m mVar2 = mVar;
            String str = mVar2.a;
            if (str == null) {
                fVar.f3010f.bindNull(1);
            } else {
                fVar.f3010f.bindString(1, str);
            }
            byte[] c = e.g0.e.c(mVar2.b);
            if (c == null) {
                fVar.f3010f.bindNull(2);
            } else {
                fVar.f3010f.bindBlob(2, c);
            }
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends e.v.k {
        public b(o oVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl.java */
    /* loaded from: classes.dex */
    public class c extends e.v.k {
        public c(o oVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        this.c = new b(this, roomDatabase);
        this.f2335d = new c(this, roomDatabase);
    }

    public void a(String str) {
        this.a.b();
        e.x.a.f.f a2 = this.c.a();
        if (str == null) {
            a2.f3010f.bindNull(1);
        } else {
            a2.f3010f.bindString(1, str);
        }
        this.a.c();
        try {
            a2.a();
            this.a.l();
            this.a.g();
            e.v.k kVar = this.c;
            if (a2 == kVar.c) {
                kVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.g();
            this.c.c(a2);
            throw th;
        }
    }

    public void b() {
        this.a.b();
        e.x.a.f.f a2 = this.f2335d.a();
        this.a.c();
        try {
            a2.a();
            this.a.l();
            this.a.g();
            e.v.k kVar = this.f2335d;
            if (a2 == kVar.c) {
                kVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.g();
            this.f2335d.c(a2);
            throw th;
        }
    }
}
