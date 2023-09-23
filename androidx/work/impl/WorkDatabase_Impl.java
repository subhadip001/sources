package androidx.work.impl;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.room.RoomDatabase;
import com.arthenica.ffmpegkit.Chapter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e.g0.t.s.b;
import e.g0.t.s.e;
import e.g0.t.s.h;
import e.g0.t.s.i;
import e.g0.t.s.k;
import e.g0.t.s.l;
import e.g0.t.s.n;
import e.g0.t.s.o;
import e.g0.t.s.q;
import e.g0.t.s.r;
import e.g0.t.s.t;
import e.g0.t.s.u;
import e.v.f;
import e.v.g;
import e.v.n.c;
import e.x.a.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public static final /* synthetic */ int t = 0;

    /* renamed from: m  reason: collision with root package name */
    public volatile q f641m;
    public volatile b n;
    public volatile t o;
    public volatile h p;
    public volatile k q;
    public volatile n r;
    public volatile e s;

    /* loaded from: classes.dex */
    public class a extends g.a {
        public a(int i2) {
            super(i2);
        }

        @Override // e.v.g.a
        public void a(e.x.a.b bVar) {
            ((e.x.a.f.a) bVar).f2999f.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            e.x.a.f.a aVar = (e.x.a.f.a) bVar;
            aVar.f2999f.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar.f2999f.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar.f2999f.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar.f2999f.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar.f2999f.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            aVar.f2999f.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f2999f.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar.f2999f.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f2999f.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f2999f.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar.f2999f.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.f2999f.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            aVar.f2999f.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.f2999f.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // e.v.g.a
        public void b(e.x.a.b bVar) {
            e.x.a.f.a aVar = (e.x.a.f.a) bVar;
            aVar.f2999f.execSQL("DROP TABLE IF EXISTS `Dependency`");
            aVar.f2999f.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            aVar.f2999f.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            aVar.f2999f.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            aVar.f2999f.execSQL("DROP TABLE IF EXISTS `WorkName`");
            aVar.f2999f.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            aVar.f2999f.execSQL("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i2 = WorkDatabase_Impl.t;
            List<RoomDatabase.b> list = workDatabase_Impl.f561h;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Objects.requireNonNull(WorkDatabase_Impl.this.f561h.get(i3));
                }
            }
        }

        @Override // e.v.g.a
        public void c(e.x.a.b bVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i2 = WorkDatabase_Impl.t;
            List<RoomDatabase.b> list = workDatabase_Impl.f561h;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Objects.requireNonNull(WorkDatabase_Impl.this.f561h.get(i3));
                }
            }
        }

        @Override // e.v.g.a
        public void d(e.x.a.b bVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i2 = WorkDatabase_Impl.t;
            workDatabase_Impl.a = bVar;
            ((e.x.a.f.a) bVar).f2999f.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.i(bVar);
            List<RoomDatabase.b> list = WorkDatabase_Impl.this.f561h;
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    WorkDatabase_Impl.this.f561h.get(i3).a(bVar);
                }
            }
        }

        @Override // e.v.g.a
        public void e(e.x.a.b bVar) {
        }

        @Override // e.v.g.a
        public void f(e.x.a.b bVar) {
            e.v.n.b.a(bVar);
        }

        @Override // e.v.g.a
        public g.b g(e.x.a.b bVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new c.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Chapter.KEY_ID)));
            hashSet.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(Chapter.KEY_ID)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new c.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new c.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            c cVar = new c("Dependency", hashMap, hashSet, hashSet2);
            c a = c.a(bVar, "Dependency");
            if (!cVar.equals(a)) {
                return new g.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + cVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put(Chapter.KEY_ID, new c.a(Chapter.KEY_ID, "TEXT", true, 1, null, 1));
            hashMap2.put(RemoteConfigConstants.ResponseFieldKey.STATE, new c.a(RemoteConfigConstants.ResponseFieldKey.STATE, "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new c.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new c.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new c.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new c.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new c.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new c.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new c.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new c.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new c.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new c.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new c.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new c.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new c.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new c.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new c.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new c.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new c.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new c.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new c.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new c.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new c.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new c.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new c.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new c.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new c.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            c cVar2 = new c("WorkSpec", hashMap2, hashSet3, hashSet4);
            c a2 = c.a(bVar, "WorkSpec");
            if (!cVar2.equals(a2)) {
                return new g.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + cVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new c.a("tag", "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Chapter.KEY_ID)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new c.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            c cVar3 = new c("WorkTag", hashMap3, hashSet5, hashSet6);
            c a3 = c.a(bVar, "WorkTag");
            if (!cVar3.equals(a3)) {
                return new g.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + cVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new c.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Chapter.KEY_ID)));
            c cVar4 = new c("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            c a4 = c.a(bVar, "SystemIdInfo");
            if (!cVar4.equals(a4)) {
                return new g.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + cVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new c.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Chapter.KEY_ID)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new c.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            c cVar5 = new c("WorkName", hashMap5, hashSet8, hashSet9);
            c a5 = c.a(bVar, "WorkName");
            if (!cVar5.equals(a5)) {
                return new g.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + cVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put(NotificationCompat.CATEGORY_PROGRESS, new c.a(NotificationCompat.CATEGORY_PROGRESS, "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Chapter.KEY_ID)));
            c cVar6 = new c("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            c a6 = c.a(bVar, "WorkProgress");
            if (!cVar6.equals(a6)) {
                return new g.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + cVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new c.a("key", "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new c.a("long_value", "INTEGER", false, 0, null, 1));
            c cVar7 = new c("Preference", hashMap7, new HashSet(0), new HashSet(0));
            c a7 = c.a(bVar, "Preference");
            if (!cVar7.equals(a7)) {
                return new g.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + cVar7 + "\n Found:\n" + a7);
            }
            return new g.b(true, null);
        }
    }

    @Override // androidx.room.RoomDatabase
    public f e() {
        return new f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    public e.x.a.c f(e.v.a aVar) {
        g gVar = new g(aVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = aVar.b;
        String str = aVar.c;
        if (context != null) {
            return aVar.a.a(new c.b(context, str, gVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    @Override // androidx.work.impl.WorkDatabase
    public b m() {
        b bVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new e.g0.t.s.c(this);
            }
            bVar = this.n;
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public e n() {
        e eVar;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            if (this.s == null) {
                this.s = new e.g0.t.s.f(this);
            }
            eVar = this.s;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public h o() {
        h hVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new i(this);
            }
            hVar = this.p;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k p() {
        k kVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q == null) {
                this.q = new l(this);
            }
            kVar = this.q;
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public n q() {
        n nVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new o(this);
            }
            nVar = this.r;
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q r() {
        q qVar;
        if (this.f641m != null) {
            return this.f641m;
        }
        synchronized (this) {
            if (this.f641m == null) {
                this.f641m = new r(this);
            }
            qVar = this.f641m;
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public t s() {
        t tVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new u(this);
            }
            tVar = this.o;
        }
        return tVar;
    }
}
