package e.g0.t.s;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.work.WorkInfo$State;
import com.arthenica.ffmpegkit.Chapter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e.g0.t.s.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class r implements q {
    public final RoomDatabase a;
    public final e.v.b<p> b;
    public final e.v.k c;

    /* renamed from: d  reason: collision with root package name */
    public final e.v.k f2346d;

    /* renamed from: e  reason: collision with root package name */
    public final e.v.k f2347e;

    /* renamed from: f  reason: collision with root package name */
    public final e.v.k f2348f;

    /* renamed from: g  reason: collision with root package name */
    public final e.v.k f2349g;

    /* renamed from: h  reason: collision with root package name */
    public final e.v.k f2350h;

    /* renamed from: i  reason: collision with root package name */
    public final e.v.k f2351i;

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class a extends e.v.b<p> {
        public a(r rVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0202  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x020a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01ef -> B:103:0x01f3). Please submit an issue!!! */
        @Override // e.v.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d(e.x.a.f.f r17, e.g0.t.s.p r18) {
            /*
                Method dump skipped, instructions count: 598
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: e.g0.t.s.r.a.d(e.x.a.f.f, java.lang.Object):void");
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class b extends e.v.k {
        public b(r rVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class c extends e.v.k {
        public c(r rVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class d extends e.v.k {
        public d(r rVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class e extends e.v.k {
        public e(r rVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class f extends e.v.k {
        public f(r rVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class g extends e.v.k {
        public g(r rVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    public class h extends e.v.k {
        public h(r rVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // e.v.k
        public String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public r(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        this.c = new b(this, roomDatabase);
        this.f2346d = new c(this, roomDatabase);
        this.f2347e = new d(this, roomDatabase);
        this.f2348f = new e(this, roomDatabase);
        this.f2349g = new f(this, roomDatabase);
        this.f2350h = new g(this, roomDatabase);
        this.f2351i = new h(this, roomDatabase);
        new AtomicBoolean(false);
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

    public List<p> b(int i2) {
        e.v.h hVar;
        int g2;
        int g3;
        int g4;
        int g5;
        int g6;
        int g7;
        int g8;
        int g9;
        int g10;
        int g11;
        int g12;
        int g13;
        int g14;
        int g15;
        e.v.h g16 = e.v.h.g("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        g16.l(1, i2);
        this.a.b();
        Cursor b2 = e.v.n.b.b(this.a, g16, false, null);
        try {
            g2 = e.p.a.g(b2, "required_network_type");
            g3 = e.p.a.g(b2, "requires_charging");
            g4 = e.p.a.g(b2, "requires_device_idle");
            g5 = e.p.a.g(b2, "requires_battery_not_low");
            g6 = e.p.a.g(b2, "requires_storage_not_low");
            g7 = e.p.a.g(b2, "trigger_content_update_delay");
            g8 = e.p.a.g(b2, "trigger_max_content_delay");
            g9 = e.p.a.g(b2, "content_uri_triggers");
            g10 = e.p.a.g(b2, Chapter.KEY_ID);
            g11 = e.p.a.g(b2, RemoteConfigConstants.ResponseFieldKey.STATE);
            g12 = e.p.a.g(b2, "worker_class_name");
            g13 = e.p.a.g(b2, "input_merger_class_name");
            g14 = e.p.a.g(b2, "input");
            g15 = e.p.a.g(b2, "output");
            hVar = g16;
        } catch (Throwable th) {
            th = th;
            hVar = g16;
        }
        try {
            int g17 = e.p.a.g(b2, "initial_delay");
            int g18 = e.p.a.g(b2, "interval_duration");
            int g19 = e.p.a.g(b2, "flex_duration");
            int g20 = e.p.a.g(b2, "run_attempt_count");
            int g21 = e.p.a.g(b2, "backoff_policy");
            int g22 = e.p.a.g(b2, "backoff_delay_duration");
            int g23 = e.p.a.g(b2, "period_start_time");
            int g24 = e.p.a.g(b2, "minimum_retention_duration");
            int g25 = e.p.a.g(b2, "schedule_requested_at");
            int g26 = e.p.a.g(b2, "run_in_foreground");
            int g27 = e.p.a.g(b2, "out_of_quota_policy");
            int i3 = g15;
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                String string = b2.getString(g10);
                int i4 = g10;
                String string2 = b2.getString(g12);
                int i5 = g12;
                e.g0.c cVar = new e.g0.c();
                int i6 = g2;
                cVar.a = e.p.a.j(b2.getInt(g2));
                cVar.b = b2.getInt(g3) != 0;
                cVar.c = b2.getInt(g4) != 0;
                cVar.f2196d = b2.getInt(g5) != 0;
                cVar.f2197e = b2.getInt(g6) != 0;
                int i7 = g3;
                int i8 = g4;
                cVar.f2198f = b2.getLong(g7);
                cVar.f2199g = b2.getLong(g8);
                cVar.f2200h = e.p.a.a(b2.getBlob(g9));
                p pVar = new p(string, string2);
                pVar.b = e.p.a.l(b2.getInt(g11));
                pVar.f2336d = b2.getString(g13);
                pVar.f2337e = e.g0.e.a(b2.getBlob(g14));
                int i9 = i3;
                pVar.f2338f = e.g0.e.a(b2.getBlob(i9));
                i3 = i9;
                int i10 = g17;
                pVar.f2339g = b2.getLong(i10);
                int i11 = g13;
                int i12 = g18;
                pVar.f2340h = b2.getLong(i12);
                int i13 = g5;
                int i14 = g19;
                pVar.f2341i = b2.getLong(i14);
                int i15 = g20;
                pVar.f2343k = b2.getInt(i15);
                int i16 = g21;
                pVar.f2344l = e.p.a.i(b2.getInt(i16));
                g19 = i14;
                int i17 = g22;
                pVar.f2345m = b2.getLong(i17);
                int i18 = g23;
                pVar.n = b2.getLong(i18);
                g23 = i18;
                int i19 = g24;
                pVar.o = b2.getLong(i19);
                int i20 = g25;
                pVar.p = b2.getLong(i20);
                int i21 = g26;
                pVar.q = b2.getInt(i21) != 0;
                int i22 = g27;
                pVar.r = e.p.a.k(b2.getInt(i22));
                pVar.f2342j = cVar;
                arrayList.add(pVar);
                g27 = i22;
                g3 = i7;
                g13 = i11;
                g17 = i10;
                g18 = i12;
                g20 = i15;
                g25 = i20;
                g10 = i4;
                g12 = i5;
                g2 = i6;
                g26 = i21;
                g24 = i19;
                g4 = i8;
                g22 = i17;
                g5 = i13;
                g21 = i16;
            }
            b2.close();
            hVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b2.close();
            hVar.release();
            throw th;
        }
    }

    public List<p> c(int i2) {
        e.v.h hVar;
        int g2;
        int g3;
        int g4;
        int g5;
        int g6;
        int g7;
        int g8;
        int g9;
        int g10;
        int g11;
        int g12;
        int g13;
        int g14;
        int g15;
        e.v.h g16 = e.v.h.g("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        g16.l(1, i2);
        this.a.b();
        Cursor b2 = e.v.n.b.b(this.a, g16, false, null);
        try {
            g2 = e.p.a.g(b2, "required_network_type");
            g3 = e.p.a.g(b2, "requires_charging");
            g4 = e.p.a.g(b2, "requires_device_idle");
            g5 = e.p.a.g(b2, "requires_battery_not_low");
            g6 = e.p.a.g(b2, "requires_storage_not_low");
            g7 = e.p.a.g(b2, "trigger_content_update_delay");
            g8 = e.p.a.g(b2, "trigger_max_content_delay");
            g9 = e.p.a.g(b2, "content_uri_triggers");
            g10 = e.p.a.g(b2, Chapter.KEY_ID);
            g11 = e.p.a.g(b2, RemoteConfigConstants.ResponseFieldKey.STATE);
            g12 = e.p.a.g(b2, "worker_class_name");
            g13 = e.p.a.g(b2, "input_merger_class_name");
            g14 = e.p.a.g(b2, "input");
            g15 = e.p.a.g(b2, "output");
            hVar = g16;
        } catch (Throwable th) {
            th = th;
            hVar = g16;
        }
        try {
            int g17 = e.p.a.g(b2, "initial_delay");
            int g18 = e.p.a.g(b2, "interval_duration");
            int g19 = e.p.a.g(b2, "flex_duration");
            int g20 = e.p.a.g(b2, "run_attempt_count");
            int g21 = e.p.a.g(b2, "backoff_policy");
            int g22 = e.p.a.g(b2, "backoff_delay_duration");
            int g23 = e.p.a.g(b2, "period_start_time");
            int g24 = e.p.a.g(b2, "minimum_retention_duration");
            int g25 = e.p.a.g(b2, "schedule_requested_at");
            int g26 = e.p.a.g(b2, "run_in_foreground");
            int g27 = e.p.a.g(b2, "out_of_quota_policy");
            int i3 = g15;
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                String string = b2.getString(g10);
                int i4 = g10;
                String string2 = b2.getString(g12);
                int i5 = g12;
                e.g0.c cVar = new e.g0.c();
                int i6 = g2;
                cVar.a = e.p.a.j(b2.getInt(g2));
                cVar.b = b2.getInt(g3) != 0;
                cVar.c = b2.getInt(g4) != 0;
                cVar.f2196d = b2.getInt(g5) != 0;
                cVar.f2197e = b2.getInt(g6) != 0;
                int i7 = g3;
                int i8 = g4;
                cVar.f2198f = b2.getLong(g7);
                cVar.f2199g = b2.getLong(g8);
                cVar.f2200h = e.p.a.a(b2.getBlob(g9));
                p pVar = new p(string, string2);
                pVar.b = e.p.a.l(b2.getInt(g11));
                pVar.f2336d = b2.getString(g13);
                pVar.f2337e = e.g0.e.a(b2.getBlob(g14));
                int i9 = i3;
                pVar.f2338f = e.g0.e.a(b2.getBlob(i9));
                i3 = i9;
                int i10 = g17;
                pVar.f2339g = b2.getLong(i10);
                int i11 = g13;
                int i12 = g18;
                pVar.f2340h = b2.getLong(i12);
                int i13 = g5;
                int i14 = g19;
                pVar.f2341i = b2.getLong(i14);
                int i15 = g20;
                pVar.f2343k = b2.getInt(i15);
                int i16 = g21;
                pVar.f2344l = e.p.a.i(b2.getInt(i16));
                g19 = i14;
                int i17 = g22;
                pVar.f2345m = b2.getLong(i17);
                int i18 = g23;
                pVar.n = b2.getLong(i18);
                g23 = i18;
                int i19 = g24;
                pVar.o = b2.getLong(i19);
                int i20 = g25;
                pVar.p = b2.getLong(i20);
                int i21 = g26;
                pVar.q = b2.getInt(i21) != 0;
                int i22 = g27;
                pVar.r = e.p.a.k(b2.getInt(i22));
                pVar.f2342j = cVar;
                arrayList.add(pVar);
                g27 = i22;
                g3 = i7;
                g13 = i11;
                g17 = i10;
                g18 = i12;
                g20 = i15;
                g25 = i20;
                g10 = i4;
                g12 = i5;
                g2 = i6;
                g26 = i21;
                g24 = i19;
                g4 = i8;
                g22 = i17;
                g5 = i13;
                g21 = i16;
            }
            b2.close();
            hVar.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            b2.close();
            hVar.release();
            throw th;
        }
    }

    public List<p> d() {
        e.v.h hVar;
        e.v.h g2 = e.v.h.g("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor b2 = e.v.n.b.b(this.a, g2, false, null);
        try {
            int g3 = e.p.a.g(b2, "required_network_type");
            int g4 = e.p.a.g(b2, "requires_charging");
            int g5 = e.p.a.g(b2, "requires_device_idle");
            int g6 = e.p.a.g(b2, "requires_battery_not_low");
            int g7 = e.p.a.g(b2, "requires_storage_not_low");
            int g8 = e.p.a.g(b2, "trigger_content_update_delay");
            int g9 = e.p.a.g(b2, "trigger_max_content_delay");
            int g10 = e.p.a.g(b2, "content_uri_triggers");
            int g11 = e.p.a.g(b2, Chapter.KEY_ID);
            int g12 = e.p.a.g(b2, RemoteConfigConstants.ResponseFieldKey.STATE);
            int g13 = e.p.a.g(b2, "worker_class_name");
            int g14 = e.p.a.g(b2, "input_merger_class_name");
            int g15 = e.p.a.g(b2, "input");
            int g16 = e.p.a.g(b2, "output");
            hVar = g2;
            try {
                int g17 = e.p.a.g(b2, "initial_delay");
                int g18 = e.p.a.g(b2, "interval_duration");
                int g19 = e.p.a.g(b2, "flex_duration");
                int g20 = e.p.a.g(b2, "run_attempt_count");
                int g21 = e.p.a.g(b2, "backoff_policy");
                int g22 = e.p.a.g(b2, "backoff_delay_duration");
                int g23 = e.p.a.g(b2, "period_start_time");
                int g24 = e.p.a.g(b2, "minimum_retention_duration");
                int g25 = e.p.a.g(b2, "schedule_requested_at");
                int g26 = e.p.a.g(b2, "run_in_foreground");
                int g27 = e.p.a.g(b2, "out_of_quota_policy");
                int i2 = g16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(g11);
                    int i3 = g11;
                    String string2 = b2.getString(g13);
                    int i4 = g13;
                    e.g0.c cVar = new e.g0.c();
                    int i5 = g3;
                    cVar.a = e.p.a.j(b2.getInt(g3));
                    cVar.b = b2.getInt(g4) != 0;
                    cVar.c = b2.getInt(g5) != 0;
                    cVar.f2196d = b2.getInt(g6) != 0;
                    cVar.f2197e = b2.getInt(g7) != 0;
                    int i6 = g4;
                    int i7 = g5;
                    cVar.f2198f = b2.getLong(g8);
                    cVar.f2199g = b2.getLong(g9);
                    cVar.f2200h = e.p.a.a(b2.getBlob(g10));
                    p pVar = new p(string, string2);
                    pVar.b = e.p.a.l(b2.getInt(g12));
                    pVar.f2336d = b2.getString(g14);
                    pVar.f2337e = e.g0.e.a(b2.getBlob(g15));
                    int i8 = i2;
                    pVar.f2338f = e.g0.e.a(b2.getBlob(i8));
                    i2 = i8;
                    int i9 = g17;
                    pVar.f2339g = b2.getLong(i9);
                    int i10 = g15;
                    int i11 = g18;
                    pVar.f2340h = b2.getLong(i11);
                    int i12 = g6;
                    int i13 = g19;
                    pVar.f2341i = b2.getLong(i13);
                    int i14 = g20;
                    pVar.f2343k = b2.getInt(i14);
                    int i15 = g21;
                    pVar.f2344l = e.p.a.i(b2.getInt(i15));
                    g19 = i13;
                    int i16 = g22;
                    pVar.f2345m = b2.getLong(i16);
                    int i17 = g23;
                    pVar.n = b2.getLong(i17);
                    g23 = i17;
                    int i18 = g24;
                    pVar.o = b2.getLong(i18);
                    int i19 = g25;
                    pVar.p = b2.getLong(i19);
                    int i20 = g26;
                    pVar.q = b2.getInt(i20) != 0;
                    int i21 = g27;
                    pVar.r = e.p.a.k(b2.getInt(i21));
                    pVar.f2342j = cVar;
                    arrayList.add(pVar);
                    g27 = i21;
                    g4 = i6;
                    g15 = i10;
                    g17 = i9;
                    g18 = i11;
                    g20 = i14;
                    g25 = i19;
                    g11 = i3;
                    g13 = i4;
                    g3 = i5;
                    g26 = i20;
                    g24 = i18;
                    g5 = i7;
                    g22 = i16;
                    g6 = i12;
                    g21 = i15;
                }
                b2.close();
                hVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                hVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = g2;
        }
    }

    public List<p> e() {
        e.v.h hVar;
        e.v.h g2 = e.v.h.g("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor b2 = e.v.n.b.b(this.a, g2, false, null);
        try {
            int g3 = e.p.a.g(b2, "required_network_type");
            int g4 = e.p.a.g(b2, "requires_charging");
            int g5 = e.p.a.g(b2, "requires_device_idle");
            int g6 = e.p.a.g(b2, "requires_battery_not_low");
            int g7 = e.p.a.g(b2, "requires_storage_not_low");
            int g8 = e.p.a.g(b2, "trigger_content_update_delay");
            int g9 = e.p.a.g(b2, "trigger_max_content_delay");
            int g10 = e.p.a.g(b2, "content_uri_triggers");
            int g11 = e.p.a.g(b2, Chapter.KEY_ID);
            int g12 = e.p.a.g(b2, RemoteConfigConstants.ResponseFieldKey.STATE);
            int g13 = e.p.a.g(b2, "worker_class_name");
            int g14 = e.p.a.g(b2, "input_merger_class_name");
            int g15 = e.p.a.g(b2, "input");
            int g16 = e.p.a.g(b2, "output");
            hVar = g2;
            try {
                int g17 = e.p.a.g(b2, "initial_delay");
                int g18 = e.p.a.g(b2, "interval_duration");
                int g19 = e.p.a.g(b2, "flex_duration");
                int g20 = e.p.a.g(b2, "run_attempt_count");
                int g21 = e.p.a.g(b2, "backoff_policy");
                int g22 = e.p.a.g(b2, "backoff_delay_duration");
                int g23 = e.p.a.g(b2, "period_start_time");
                int g24 = e.p.a.g(b2, "minimum_retention_duration");
                int g25 = e.p.a.g(b2, "schedule_requested_at");
                int g26 = e.p.a.g(b2, "run_in_foreground");
                int g27 = e.p.a.g(b2, "out_of_quota_policy");
                int i2 = g16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(g11);
                    int i3 = g11;
                    String string2 = b2.getString(g13);
                    int i4 = g13;
                    e.g0.c cVar = new e.g0.c();
                    int i5 = g3;
                    cVar.a = e.p.a.j(b2.getInt(g3));
                    cVar.b = b2.getInt(g4) != 0;
                    cVar.c = b2.getInt(g5) != 0;
                    cVar.f2196d = b2.getInt(g6) != 0;
                    cVar.f2197e = b2.getInt(g7) != 0;
                    int i6 = g4;
                    int i7 = g5;
                    cVar.f2198f = b2.getLong(g8);
                    cVar.f2199g = b2.getLong(g9);
                    cVar.f2200h = e.p.a.a(b2.getBlob(g10));
                    p pVar = new p(string, string2);
                    pVar.b = e.p.a.l(b2.getInt(g12));
                    pVar.f2336d = b2.getString(g14);
                    pVar.f2337e = e.g0.e.a(b2.getBlob(g15));
                    int i8 = i2;
                    pVar.f2338f = e.g0.e.a(b2.getBlob(i8));
                    i2 = i8;
                    int i9 = g17;
                    pVar.f2339g = b2.getLong(i9);
                    int i10 = g15;
                    int i11 = g18;
                    pVar.f2340h = b2.getLong(i11);
                    int i12 = g6;
                    int i13 = g19;
                    pVar.f2341i = b2.getLong(i13);
                    int i14 = g20;
                    pVar.f2343k = b2.getInt(i14);
                    int i15 = g21;
                    pVar.f2344l = e.p.a.i(b2.getInt(i15));
                    g19 = i13;
                    int i16 = g22;
                    pVar.f2345m = b2.getLong(i16);
                    int i17 = g23;
                    pVar.n = b2.getLong(i17);
                    g23 = i17;
                    int i18 = g24;
                    pVar.o = b2.getLong(i18);
                    int i19 = g25;
                    pVar.p = b2.getLong(i19);
                    int i20 = g26;
                    pVar.q = b2.getInt(i20) != 0;
                    int i21 = g27;
                    pVar.r = e.p.a.k(b2.getInt(i21));
                    pVar.f2342j = cVar;
                    arrayList.add(pVar);
                    g27 = i21;
                    g4 = i6;
                    g15 = i10;
                    g17 = i9;
                    g18 = i11;
                    g20 = i14;
                    g25 = i19;
                    g11 = i3;
                    g13 = i4;
                    g3 = i5;
                    g26 = i20;
                    g24 = i18;
                    g5 = i7;
                    g22 = i16;
                    g6 = i12;
                    g21 = i15;
                }
                b2.close();
                hVar.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                hVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = g2;
        }
    }

    public WorkInfo$State f(String str) {
        e.v.h g2 = e.v.h.g("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            g2.p(1);
        } else {
            g2.q(1, str);
        }
        this.a.b();
        Cursor b2 = e.v.n.b.b(this.a, g2, false, null);
        try {
            return b2.moveToFirst() ? e.p.a.l(b2.getInt(0)) : null;
        } finally {
            b2.close();
            g2.release();
        }
    }

    public List<String> g(String str) {
        e.v.h g2 = e.v.h.g("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            g2.p(1);
        } else {
            g2.q(1, str);
        }
        this.a.b();
        Cursor b2 = e.v.n.b.b(this.a, g2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            g2.release();
        }
    }

    public List<String> h(String str) {
        e.v.h g2 = e.v.h.g("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            g2.p(1);
        } else {
            g2.q(1, str);
        }
        this.a.b();
        Cursor b2 = e.v.n.b.b(this.a, g2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            g2.release();
        }
    }

    public p i(String str) {
        e.v.h hVar;
        int g2;
        int g3;
        int g4;
        int g5;
        int g6;
        int g7;
        int g8;
        int g9;
        int g10;
        int g11;
        int g12;
        int g13;
        int g14;
        int g15;
        p pVar;
        e.v.h g16 = e.v.h.g("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            g16.p(1);
        } else {
            g16.q(1, str);
        }
        this.a.b();
        Cursor b2 = e.v.n.b.b(this.a, g16, false, null);
        try {
            g2 = e.p.a.g(b2, "required_network_type");
            g3 = e.p.a.g(b2, "requires_charging");
            g4 = e.p.a.g(b2, "requires_device_idle");
            g5 = e.p.a.g(b2, "requires_battery_not_low");
            g6 = e.p.a.g(b2, "requires_storage_not_low");
            g7 = e.p.a.g(b2, "trigger_content_update_delay");
            g8 = e.p.a.g(b2, "trigger_max_content_delay");
            g9 = e.p.a.g(b2, "content_uri_triggers");
            g10 = e.p.a.g(b2, Chapter.KEY_ID);
            g11 = e.p.a.g(b2, RemoteConfigConstants.ResponseFieldKey.STATE);
            g12 = e.p.a.g(b2, "worker_class_name");
            g13 = e.p.a.g(b2, "input_merger_class_name");
            g14 = e.p.a.g(b2, "input");
            g15 = e.p.a.g(b2, "output");
            hVar = g16;
        } catch (Throwable th) {
            th = th;
            hVar = g16;
        }
        try {
            int g17 = e.p.a.g(b2, "initial_delay");
            int g18 = e.p.a.g(b2, "interval_duration");
            int g19 = e.p.a.g(b2, "flex_duration");
            int g20 = e.p.a.g(b2, "run_attempt_count");
            int g21 = e.p.a.g(b2, "backoff_policy");
            int g22 = e.p.a.g(b2, "backoff_delay_duration");
            int g23 = e.p.a.g(b2, "period_start_time");
            int g24 = e.p.a.g(b2, "minimum_retention_duration");
            int g25 = e.p.a.g(b2, "schedule_requested_at");
            int g26 = e.p.a.g(b2, "run_in_foreground");
            int g27 = e.p.a.g(b2, "out_of_quota_policy");
            if (b2.moveToFirst()) {
                String string = b2.getString(g10);
                String string2 = b2.getString(g12);
                e.g0.c cVar = new e.g0.c();
                cVar.a = e.p.a.j(b2.getInt(g2));
                cVar.b = b2.getInt(g3) != 0;
                cVar.c = b2.getInt(g4) != 0;
                cVar.f2196d = b2.getInt(g5) != 0;
                cVar.f2197e = b2.getInt(g6) != 0;
                cVar.f2198f = b2.getLong(g7);
                cVar.f2199g = b2.getLong(g8);
                cVar.f2200h = e.p.a.a(b2.getBlob(g9));
                p pVar2 = new p(string, string2);
                pVar2.b = e.p.a.l(b2.getInt(g11));
                pVar2.f2336d = b2.getString(g13);
                pVar2.f2337e = e.g0.e.a(b2.getBlob(g14));
                pVar2.f2338f = e.g0.e.a(b2.getBlob(g15));
                pVar2.f2339g = b2.getLong(g17);
                pVar2.f2340h = b2.getLong(g18);
                pVar2.f2341i = b2.getLong(g19);
                pVar2.f2343k = b2.getInt(g20);
                pVar2.f2344l = e.p.a.i(b2.getInt(g21));
                pVar2.f2345m = b2.getLong(g22);
                pVar2.n = b2.getLong(g23);
                pVar2.o = b2.getLong(g24);
                pVar2.p = b2.getLong(g25);
                pVar2.q = b2.getInt(g26) != 0;
                pVar2.r = e.p.a.k(b2.getInt(g27));
                pVar2.f2342j = cVar;
                pVar = pVar2;
            } else {
                pVar = null;
            }
            b2.close();
            hVar.release();
            return pVar;
        } catch (Throwable th2) {
            th = th2;
            b2.close();
            hVar.release();
            throw th;
        }
    }

    public List<p.a> j(String str) {
        e.v.h g2 = e.v.h.g("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            g2.p(1);
        } else {
            g2.q(1, str);
        }
        this.a.b();
        Cursor b2 = e.v.n.b.b(this.a, g2, false, null);
        try {
            int g3 = e.p.a.g(b2, Chapter.KEY_ID);
            int g4 = e.p.a.g(b2, RemoteConfigConstants.ResponseFieldKey.STATE);
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                p.a aVar = new p.a();
                aVar.a = b2.getString(g3);
                aVar.b = e.p.a.l(b2.getInt(g4));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            b2.close();
            g2.release();
        }
    }

    public int k(String str) {
        this.a.b();
        e.x.a.f.f a2 = this.f2348f.a();
        if (str == null) {
            a2.f3010f.bindNull(1);
        } else {
            a2.f3010f.bindString(1, str);
        }
        this.a.c();
        try {
            int a3 = a2.a();
            this.a.l();
            this.a.g();
            e.v.k kVar = this.f2348f;
            if (a2 == kVar.c) {
                kVar.a.set(false);
            }
            return a3;
        } catch (Throwable th) {
            this.a.g();
            this.f2348f.c(a2);
            throw th;
        }
    }

    public int l(String str, long j2) {
        this.a.b();
        e.x.a.f.f a2 = this.f2350h.a();
        a2.f3010f.bindLong(1, j2);
        if (str == null) {
            a2.f3010f.bindNull(2);
        } else {
            a2.f3010f.bindString(2, str);
        }
        this.a.c();
        try {
            int a3 = a2.a();
            this.a.l();
            return a3;
        } finally {
            this.a.g();
            e.v.k kVar = this.f2350h;
            if (a2 == kVar.c) {
                kVar.a.set(false);
            }
        }
    }

    public int m(String str) {
        this.a.b();
        e.x.a.f.f a2 = this.f2349g.a();
        if (str == null) {
            a2.f3010f.bindNull(1);
        } else {
            a2.f3010f.bindString(1, str);
        }
        this.a.c();
        try {
            int a3 = a2.a();
            this.a.l();
            this.a.g();
            e.v.k kVar = this.f2349g;
            if (a2 == kVar.c) {
                kVar.a.set(false);
            }
            return a3;
        } catch (Throwable th) {
            this.a.g();
            this.f2349g.c(a2);
            throw th;
        }
    }

    public void n(String str, e.g0.e eVar) {
        this.a.b();
        e.x.a.f.f a2 = this.f2346d.a();
        byte[] c2 = e.g0.e.c(eVar);
        if (c2 == null) {
            a2.f3010f.bindNull(1);
        } else {
            a2.f3010f.bindBlob(1, c2);
        }
        if (str == null) {
            a2.f3010f.bindNull(2);
        } else {
            a2.f3010f.bindString(2, str);
        }
        this.a.c();
        try {
            a2.a();
            this.a.l();
            this.a.g();
            e.v.k kVar = this.f2346d;
            if (a2 == kVar.c) {
                kVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.g();
            this.f2346d.c(a2);
            throw th;
        }
    }

    public void o(String str, long j2) {
        this.a.b();
        e.x.a.f.f a2 = this.f2347e.a();
        a2.f3010f.bindLong(1, j2);
        if (str == null) {
            a2.f3010f.bindNull(2);
        } else {
            a2.f3010f.bindString(2, str);
        }
        this.a.c();
        try {
            a2.a();
            this.a.l();
        } finally {
            this.a.g();
            e.v.k kVar = this.f2347e;
            if (a2 == kVar.c) {
                kVar.a.set(false);
            }
        }
    }

    public int p(WorkInfo$State workInfo$State, String... strArr) {
        this.a.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append("?");
            if (i2 < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        e.x.a.f.f d2 = this.a.d(sb.toString());
        d2.f3010f.bindLong(1, e.p.a.q(workInfo$State));
        int i3 = 2;
        for (String str : strArr) {
            if (str == null) {
                d2.f3010f.bindNull(i3);
            } else {
                d2.f3010f.bindString(i3, str);
            }
            i3++;
        }
        this.a.c();
        try {
            int a2 = d2.a();
            this.a.l();
            return a2;
        } finally {
            this.a.g();
        }
    }
}
