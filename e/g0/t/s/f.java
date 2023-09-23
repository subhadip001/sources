package e.g0.t.s;

import android.database.Cursor;
import androidx.room.RoomDatabase;

/* compiled from: PreferenceDao_Impl.java */
/* loaded from: classes.dex */
public final class f implements e {
    public final RoomDatabase a;
    public final e.v.b<d> b;

    /* compiled from: PreferenceDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends e.v.b<d> {
        public a(f fVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // e.v.b
        public void d(e.x.a.f.f fVar, d dVar) {
            d dVar2 = dVar;
            String str = dVar2.a;
            if (str == null) {
                fVar.f3010f.bindNull(1);
            } else {
                fVar.f3010f.bindString(1, str);
            }
            Long l2 = dVar2.b;
            if (l2 == null) {
                fVar.f3010f.bindNull(2);
                return;
            }
            fVar.f3010f.bindLong(2, l2.longValue());
        }
    }

    public f(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }

    public Long a(String str) {
        e.v.h g2 = e.v.h.g("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            g2.p(1);
        } else {
            g2.q(1, str);
        }
        this.a.b();
        Long l2 = null;
        Cursor b = e.v.n.b.b(this.a, g2, false, null);
        try {
            if (b.moveToFirst() && !b.isNull(0)) {
                l2 = Long.valueOf(b.getLong(0));
            }
            return l2;
        } finally {
            b.close();
            g2.release();
        }
    }

    public void b(d dVar) {
        this.a.b();
        this.a.c();
        try {
            this.b.f(dVar);
            this.a.l();
        } finally {
            this.a.g();
        }
    }
}
