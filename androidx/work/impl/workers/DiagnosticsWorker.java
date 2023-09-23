package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.arthenica.ffmpegkit.Chapter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.logging.type.LogSeverity;
import e.g0.c;
import e.g0.e;
import e.g0.k;
import e.g0.t.s.g;
import e.g0.t.s.h;
import e.g0.t.s.i;
import e.g0.t.s.l;
import e.g0.t.s.p;
import e.g0.t.s.q;
import e.g0.t.s.r;
import e.g0.t.s.t;
import e.g0.t.s.u;
import e.p.a;
import e.v.n.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String a = k.e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(e.g0.t.s.k kVar, t tVar, h hVar, List<p> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (p pVar : list) {
            g a2 = ((i) hVar).a(pVar.a);
            Integer valueOf = a2 != null ? Integer.valueOf(a2.b) : null;
            String str = pVar.a;
            l lVar = (l) kVar;
            Objects.requireNonNull(lVar);
            e.v.h g2 = e.v.h.g("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                g2.p(1);
            } else {
                g2.q(1, str);
            }
            lVar.a.b();
            Cursor b = b.b(lVar.a, g2, false, null);
            try {
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    arrayList.add(b.getString(0));
                }
                b.close();
                g2.release();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.a, pVar.c, valueOf, pVar.b.name(), TextUtils.join(",", arrayList), TextUtils.join(",", ((u) tVar).a(pVar.a))));
            } catch (Throwable th) {
                b.close();
                g2.release();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        e.v.h hVar;
        h hVar2;
        e.g0.t.s.k kVar;
        t tVar;
        int i2;
        WorkDatabase workDatabase = e.g0.t.l.b(getApplicationContext()).c;
        q r = workDatabase.r();
        e.g0.t.s.k p = workDatabase.p();
        t s = workDatabase.s();
        h o = workDatabase.o();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        r rVar = (r) r;
        Objects.requireNonNull(rVar);
        e.v.h g2 = e.v.h.g("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        g2.l(1, currentTimeMillis);
        rVar.a.b();
        Cursor b = b.b(rVar.a, g2, false, null);
        try {
            int g3 = a.g(b, "required_network_type");
            int g4 = a.g(b, "requires_charging");
            int g5 = a.g(b, "requires_device_idle");
            int g6 = a.g(b, "requires_battery_not_low");
            int g7 = a.g(b, "requires_storage_not_low");
            int g8 = a.g(b, "trigger_content_update_delay");
            int g9 = a.g(b, "trigger_max_content_delay");
            int g10 = a.g(b, "content_uri_triggers");
            int g11 = a.g(b, Chapter.KEY_ID);
            int g12 = a.g(b, RemoteConfigConstants.ResponseFieldKey.STATE);
            int g13 = a.g(b, "worker_class_name");
            int g14 = a.g(b, "input_merger_class_name");
            int g15 = a.g(b, "input");
            int g16 = a.g(b, "output");
            hVar = g2;
            try {
                int g17 = a.g(b, "initial_delay");
                int g18 = a.g(b, "interval_duration");
                int g19 = a.g(b, "flex_duration");
                int g20 = a.g(b, "run_attempt_count");
                int g21 = a.g(b, "backoff_policy");
                int g22 = a.g(b, "backoff_delay_duration");
                int g23 = a.g(b, "period_start_time");
                int g24 = a.g(b, "minimum_retention_duration");
                int g25 = a.g(b, "schedule_requested_at");
                int g26 = a.g(b, "run_in_foreground");
                int g27 = a.g(b, "out_of_quota_policy");
                int i3 = g16;
                ArrayList arrayList = new ArrayList(b.getCount());
                while (b.moveToNext()) {
                    String string = b.getString(g11);
                    int i4 = g11;
                    String string2 = b.getString(g13);
                    int i5 = g13;
                    c cVar = new c();
                    int i6 = g3;
                    cVar.a = a.j(b.getInt(g3));
                    cVar.b = b.getInt(g4) != 0;
                    cVar.c = b.getInt(g5) != 0;
                    cVar.f2196d = b.getInt(g6) != 0;
                    cVar.f2197e = b.getInt(g7) != 0;
                    int i7 = g4;
                    int i8 = g5;
                    cVar.f2198f = b.getLong(g8);
                    cVar.f2199g = b.getLong(g9);
                    cVar.f2200h = a.a(b.getBlob(g10));
                    p pVar = new p(string, string2);
                    pVar.b = a.l(b.getInt(g12));
                    pVar.f2336d = b.getString(g14);
                    pVar.f2337e = e.a(b.getBlob(g15));
                    int i9 = i3;
                    pVar.f2338f = e.a(b.getBlob(i9));
                    i3 = i9;
                    int i10 = g14;
                    int i11 = g17;
                    pVar.f2339g = b.getLong(i11);
                    int i12 = g15;
                    int i13 = g18;
                    pVar.f2340h = b.getLong(i13);
                    int i14 = g12;
                    int i15 = g19;
                    pVar.f2341i = b.getLong(i15);
                    int i16 = g20;
                    pVar.f2343k = b.getInt(i16);
                    int i17 = g21;
                    pVar.f2344l = a.i(b.getInt(i17));
                    g19 = i15;
                    int i18 = g22;
                    pVar.f2345m = b.getLong(i18);
                    int i19 = g23;
                    pVar.n = b.getLong(i19);
                    g23 = i19;
                    int i20 = g24;
                    pVar.o = b.getLong(i20);
                    int i21 = g25;
                    pVar.p = b.getLong(i21);
                    int i22 = g26;
                    pVar.q = b.getInt(i22) != 0;
                    int i23 = g27;
                    pVar.r = a.k(b.getInt(i23));
                    pVar.f2342j = cVar;
                    arrayList.add(pVar);
                    g27 = i23;
                    g15 = i12;
                    g4 = i7;
                    g18 = i13;
                    g20 = i16;
                    g25 = i21;
                    g13 = i5;
                    g26 = i22;
                    g24 = i20;
                    g17 = i11;
                    g14 = i10;
                    g11 = i4;
                    g5 = i8;
                    g3 = i6;
                    g22 = i18;
                    g12 = i14;
                    g21 = i17;
                }
                b.close();
                hVar.release();
                r rVar2 = (r) r;
                List<p> d2 = rVar2.d();
                List<p> b2 = rVar2.b(LogSeverity.INFO_VALUE);
                if (arrayList.isEmpty()) {
                    hVar2 = o;
                    kVar = p;
                    tVar = s;
                    i2 = 0;
                } else {
                    k c = k.c();
                    String str = a;
                    i2 = 0;
                    c.d(str, "Recently completed work:\n\n", new Throwable[0]);
                    hVar2 = o;
                    kVar = p;
                    tVar = s;
                    k.c().d(str, a(kVar, tVar, hVar2, arrayList), new Throwable[0]);
                }
                if (!((ArrayList) d2).isEmpty()) {
                    k c2 = k.c();
                    String str2 = a;
                    c2.d(str2, "Running work:\n\n", new Throwable[i2]);
                    k.c().d(str2, a(kVar, tVar, hVar2, d2), new Throwable[i2]);
                }
                if (!((ArrayList) b2).isEmpty()) {
                    k c3 = k.c();
                    String str3 = a;
                    c3.d(str3, "Enqueued work:\n\n", new Throwable[i2]);
                    k.c().d(str3, a(kVar, tVar, hVar2, b2), new Throwable[i2]);
                }
                return new ListenableWorker.a.c();
            } catch (Throwable th) {
                th = th;
                b.close();
                hVar.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = g2;
        }
    }
}
