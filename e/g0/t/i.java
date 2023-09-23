package e.g0.t;

import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;

/* compiled from: WorkDatabase.java */
/* loaded from: classes.dex */
public class i extends RoomDatabase.b {
    @Override // androidx.room.RoomDatabase.b
    public void a(e.x.a.b bVar) {
        ((e.x.a.f.a) bVar).f2999f.beginTransaction();
        try {
            int i2 = WorkDatabase.f640l;
            ((e.x.a.f.a) bVar).f2999f.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f639k) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            ((e.x.a.f.a) bVar).f2999f.setTransactionSuccessful();
        } finally {
            ((e.x.a.f.a) bVar).f2999f.endTransaction();
        }
    }
}
