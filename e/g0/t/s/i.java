package e.g0.t.s;

import android.database.Cursor;
import androidx.room.RoomDatabase;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes.dex */
public final class i implements h {
    public final RoomDatabase a;
    public final e.v.b<g> b;
    public final e.v.k c;

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends e.v.b<g> {
        public a(i iVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // e.v.b
        public void d(e.x.a.f.f fVar, g gVar) {
            g gVar2 = gVar;
            String str = gVar2.a;
            if (str == null) {
                fVar.f3010f.bindNull(1);
            } else {
                fVar.f3010f.bindString(1, str);
            }
            fVar.f3010f.bindLong(2, gVar2.b);
        }
    }

    /* compiled from: SystemIdInfoDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends e.v.k {
        public b(i iVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        this.c = new b(this, roomDatabase);
    }

    public g a(String str) {
        e.v.h g2 = e.v.h.g("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            g2.p(1);
        } else {
            g2.q(1, str);
        }
        this.a.b();
        Cursor b2 = e.v.n.b.b(this.a, g2, false, null);
        try {
            return b2.moveToFirst() ? new g(b2.getString(e.p.a.g(b2, "work_spec_id")), b2.getInt(e.p.a.g(b2, "system_id"))) : null;
        } finally {
            b2.close();
            g2.release();
        }
    }

    public void b(g gVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.f(gVar);
            this.a.l();
        } finally {
            this.a.g();
        }
    }

    public void c(String str) {
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
}
