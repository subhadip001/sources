package e.g0.t.s;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyDao_Impl.java */
/* loaded from: classes.dex */
public final class c implements b {
    public final RoomDatabase a;
    public final e.v.b<e.g0.t.s.a> b;

    /* compiled from: DependencyDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends e.v.b<e.g0.t.s.a> {
        public a(c cVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // e.v.b
        public void d(e.x.a.f.f fVar, e.g0.t.s.a aVar) {
            e.g0.t.s.a aVar2 = aVar;
            String str = aVar2.a;
            if (str == null) {
                fVar.f3010f.bindNull(1);
            } else {
                fVar.f3010f.bindString(1, str);
            }
            String str2 = aVar2.b;
            if (str2 == null) {
                fVar.f3010f.bindNull(2);
            } else {
                fVar.f3010f.bindString(2, str2);
            }
        }
    }

    public c(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }

    public List<String> a(String str) {
        e.v.h g2 = e.v.h.g("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            g2.p(1);
        } else {
            g2.q(1, str);
        }
        this.a.b();
        Cursor b = e.v.n.b.b(this.a, g2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                arrayList.add(b.getString(0));
            }
            return arrayList;
        } finally {
            b.close();
            g2.release();
        }
    }

    public boolean b(String str) {
        e.v.h g2 = e.v.h.g("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            g2.p(1);
        } else {
            g2.q(1, str);
        }
        this.a.b();
        boolean z = false;
        Cursor b = e.v.n.b.b(this.a, g2, false, null);
        try {
            if (b.moveToFirst()) {
                z = b.getInt(0) != 0;
            }
            return z;
        } finally {
            b.close();
            g2.release();
        }
    }
}
