package e.g0.t.r;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import e.g0.f;
import e.g0.k;
import e.g0.t.l;
import e.g0.t.s.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public class c implements e.g0.t.q.c, e.g0.t.b {
    public static final String p = k.e("SystemFgDispatcher");

    /* renamed from: f  reason: collision with root package name */
    public Context f2322f;

    /* renamed from: g  reason: collision with root package name */
    public l f2323g;

    /* renamed from: h  reason: collision with root package name */
    public final e.g0.t.t.t.a f2324h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f2325i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public String f2326j;

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, f> f2327k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, p> f2328l;

    /* renamed from: m  reason: collision with root package name */
    public final Set<p> f2329m;
    public final e.g0.t.q.d n;
    public a o;

    /* compiled from: SystemForegroundDispatcher.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public c(Context context) {
        this.f2322f = context;
        l b = l.b(this.f2322f);
        this.f2323g = b;
        e.g0.t.t.t.a aVar = b.f2228d;
        this.f2324h = aVar;
        this.f2326j = null;
        this.f2327k = new LinkedHashMap();
        this.f2329m = new HashSet();
        this.f2328l = new HashMap();
        this.n = new e.g0.t.q.d(this.f2322f, aVar, this);
        this.f2323g.f2230f.a(this);
    }

    public static Intent a(Context context, String str, f fVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", fVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", fVar.b);
        intent.putExtra("KEY_NOTIFICATION", fVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, f fVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", fVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", fVar.b);
        intent.putExtra("KEY_NOTIFICATION", fVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // e.g0.t.q.c
    public void b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            k.c().a(p, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            l lVar = this.f2323g;
            ((e.g0.t.t.t.b) lVar.f2228d).a.execute(new e.g0.t.t.l(lVar, str, true));
        }
    }

    @Override // e.g0.t.b
    public void d(String str, boolean z) {
        Map.Entry<String, f> entry;
        synchronized (this.f2325i) {
            p remove = this.f2328l.remove(str);
            if (remove != null ? this.f2329m.remove(remove) : false) {
                this.n.b(this.f2329m);
            }
        }
        f remove2 = this.f2327k.remove(str);
        if (str.equals(this.f2326j) && this.f2327k.size() > 0) {
            Iterator<Map.Entry<String, f>> it = this.f2327k.entrySet().iterator();
            Map.Entry<String, f> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f2326j = entry.getKey();
            if (this.o != null) {
                f value = entry.getValue();
                ((SystemForegroundService) this.o).c(value.a, value.b, value.c);
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.o;
                systemForegroundService.f652g.post(new e(systemForegroundService, value.a));
            }
        }
        a aVar = this.o;
        if (remove2 == null || aVar == null) {
            return;
        }
        k.c().a(p, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.a), str, Integer.valueOf(remove2.b)), new Throwable[0]);
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) aVar;
        systemForegroundService2.f652g.post(new e(systemForegroundService2, remove2.a));
    }

    public final void e(Intent intent) {
        int i2 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        k.c().a(p, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.o == null) {
            return;
        }
        this.f2327k.put(stringExtra, new f(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f2326j)) {
            this.f2326j = stringExtra;
            ((SystemForegroundService) this.o).c(intExtra, intExtra2, notification);
            return;
        }
        SystemForegroundService systemForegroundService = (SystemForegroundService) this.o;
        systemForegroundService.f652g.post(new d(systemForegroundService, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry<String, f> entry : this.f2327k.entrySet()) {
            i2 |= entry.getValue().b;
        }
        f fVar = this.f2327k.get(this.f2326j);
        if (fVar != null) {
            ((SystemForegroundService) this.o).c(fVar.a, i2, fVar.c);
        }
    }

    @Override // e.g0.t.q.c
    public void f(List<String> list) {
    }

    public void g() {
        this.o = null;
        synchronized (this.f2325i) {
            this.n.c();
        }
        this.f2323g.f2230f.e(this);
    }
}
