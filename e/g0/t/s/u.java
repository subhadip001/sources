package e.g0.t.s;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes.dex */
public final class u implements t {
    public final RoomDatabase a;
    public final e.v.b<s> b;

    /* compiled from: WorkTagDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends e.v.b<s> {
        public a(u uVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // e.v.b
        public void d(e.x.a.f.f fVar, s sVar) {
            s sVar2 = sVar;
            String str = sVar2.a;
            if (str == null) {
                fVar.f3010f.bindNull(1);
            } else {
                fVar.f3010f.bindString(1, str);
            }
            String str2 = sVar2.b;
            if (str2 == null) {
                fVar.f3010f.bindNull(2);
            } else {
                fVar.f3010f.bindString(2, str2);
            }
        }
    }

    public u(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }

    public List<String> a(String str) {
        e.v.h g2 = e.v.h.g("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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
}
