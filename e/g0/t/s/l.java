package e.g0.t.s;

import androidx.room.RoomDatabase;

/* compiled from: WorkNameDao_Impl.java */
/* loaded from: classes.dex */
public final class l implements k {
    public final RoomDatabase a;
    public final e.v.b<j> b;

    /* compiled from: WorkNameDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends e.v.b<j> {
        public a(l lVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // e.v.b
        public void d(e.x.a.f.f fVar, j jVar) {
            j jVar2 = jVar;
            String str = jVar2.a;
            if (str == null) {
                fVar.f3010f.bindNull(1);
            } else {
                fVar.f3010f.bindString(1, str);
            }
            String str2 = jVar2.b;
            if (str2 == null) {
                fVar.f3010f.bindNull(2);
            } else {
                fVar.f3010f.bindString(2, str2);
            }
        }
    }

    public l(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
    }
}
