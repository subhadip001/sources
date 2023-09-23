package e.g0.t;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* compiled from: WorkDatabaseMigrations.java */
/* loaded from: classes.dex */
public class j {
    public static e.v.m.a a = new a(1, 2);
    public static e.v.m.a b = new b(3, 4);
    public static e.v.m.a c = new c(4, 5);

    /* renamed from: d  reason: collision with root package name */
    public static e.v.m.a f2221d = new d(6, 7);

    /* renamed from: e  reason: collision with root package name */
    public static e.v.m.a f2222e = new e(7, 8);

    /* renamed from: f  reason: collision with root package name */
    public static e.v.m.a f2223f = new f(8, 9);

    /* renamed from: g  reason: collision with root package name */
    public static e.v.m.a f2224g = new g(11, 12);

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class a extends e.v.m.a {
        public a(int i2, int i3) {
            super(i2, i3);
        }

        @Override // e.v.m.a
        public void a(e.x.a.b bVar) {
            ((e.x.a.f.a) bVar).f2999f.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            e.x.a.f.a aVar = (e.x.a.f.a) bVar;
            aVar.f2999f.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar.f2999f.execSQL("DROP TABLE IF EXISTS alarmInfo");
            aVar.f2999f.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class b extends e.v.m.a {
        public b(int i2, int i3) {
            super(i2, i3);
        }

        @Override // e.v.m.a
        public void a(e.x.a.b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                ((e.x.a.f.a) bVar).f2999f.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class c extends e.v.m.a {
        public c(int i2, int i3) {
            super(i2, i3);
        }

        @Override // e.v.m.a
        public void a(e.x.a.b bVar) {
            ((e.x.a.f.a) bVar).f2999f.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            ((e.x.a.f.a) bVar).f2999f.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class d extends e.v.m.a {
        public d(int i2, int i3) {
            super(i2, i3);
        }

        @Override // e.v.m.a
        public void a(e.x.a.b bVar) {
            ((e.x.a.f.a) bVar).f2999f.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class e extends e.v.m.a {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        @Override // e.v.m.a
        public void a(e.x.a.b bVar) {
            ((e.x.a.f.a) bVar).f2999f.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class f extends e.v.m.a {
        public f(int i2, int i3) {
            super(i2, i3);
        }

        @Override // e.v.m.a
        public void a(e.x.a.b bVar) {
            ((e.x.a.f.a) bVar).f2999f.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public class g extends e.v.m.a {
        public g(int i2, int i3) {
            super(i2, i3);
        }

        @Override // e.v.m.a
        public void a(e.x.a.b bVar) {
            ((e.x.a.f.a) bVar).f2999f.execSQL("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public static class h extends e.v.m.a {
        public final Context c;

        public h(Context context, int i2, int i3) {
            super(i2, i3);
            this.c = context;
        }

        @Override // e.v.m.a
        public void a(e.x.a.b bVar) {
            if (this.b >= 10) {
                ((e.x.a.f.a) bVar).f2999f.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public static class i extends e.v.m.a {
        public final Context c;

        public i(Context context) {
            super(9, 10);
            this.c = context;
        }

        @Override // e.v.m.a
        public void a(e.x.a.b bVar) {
            ((e.x.a.f.a) bVar).f2999f.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                long j3 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                ((e.x.a.f.a) bVar).f2999f.beginTransaction();
                try {
                    ((e.x.a.f.a) bVar).f2999f.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                    ((e.x.a.f.a) bVar).f2999f.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j3)});
                    sharedPreferences.edit().clear().apply();
                    ((e.x.a.f.a) bVar).f2999f.setTransactionSuccessful();
                } finally {
                }
            }
            SharedPreferences sharedPreferences2 = this.c.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                ((e.x.a.f.a) bVar).f2999f.beginTransaction();
                try {
                    ((e.x.a.f.a) bVar).f2999f.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                    ((e.x.a.f.a) bVar).f2999f.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                    sharedPreferences2.edit().clear().apply();
                    ((e.x.a.f.a) bVar).f2999f.setTransactionSuccessful();
                } finally {
                }
            }
        }
    }
}
