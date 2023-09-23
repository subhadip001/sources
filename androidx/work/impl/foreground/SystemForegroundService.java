package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import e.g0.k;
import e.g0.t.l;
import e.g0.t.r.c;
import e.g0.t.t.t.b;
import e.s.p;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends p implements c.a {

    /* renamed from: k  reason: collision with root package name */
    public static final String f651k = k.e("SystemFgService");

    /* renamed from: g  reason: collision with root package name */
    public Handler f652g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f653h;

    /* renamed from: i  reason: collision with root package name */
    public c f654i;

    /* renamed from: j  reason: collision with root package name */
    public NotificationManager f655j;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f656f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Notification f657g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ int f658h;

        public a(int i2, Notification notification, int i3) {
            this.f656f = i2;
            this.f657g = notification;
            this.f658h = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f656f, this.f657g, this.f658h);
            } else {
                SystemForegroundService.this.startForeground(this.f656f, this.f657g);
            }
        }
    }

    public final void a() {
        this.f652g = new Handler(Looper.getMainLooper());
        this.f655j = (NotificationManager) getApplicationContext().getSystemService("notification");
        c cVar = new c(getApplicationContext());
        this.f654i = cVar;
        if (cVar.o != null) {
            k.c().b(c.p, "A callback already exists.", new Throwable[0]);
        } else {
            cVar.o = this;
        }
    }

    public void c(int i2, int i3, Notification notification) {
        this.f652g.post(new a(i2, notification, i3));
    }

    @Override // e.s.p, android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
    }

    @Override // e.s.p, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f654i.g();
    }

    @Override // e.s.p, android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f653h) {
            k.c().d(f651k, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f654i.g();
            a();
            this.f653h = false;
        }
        if (intent != null) {
            c cVar = this.f654i;
            Objects.requireNonNull(cVar);
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                k.c().d(c.p, String.format("Started foreground service %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                WorkDatabase workDatabase = cVar.f2323g.c;
                ((b) cVar.f2324h).a.execute(new e.g0.t.r.b(cVar, workDatabase, stringExtra));
                cVar.e(intent);
                return 3;
            } else if ("ACTION_NOTIFY".equals(action)) {
                cVar.e(intent);
                return 3;
            } else if ("ACTION_CANCEL_WORK".equals(action)) {
                k.c().d(c.p, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                    return 3;
                }
                l lVar = cVar.f2323g;
                UUID fromString = UUID.fromString(stringExtra2);
                Objects.requireNonNull(lVar);
                ((b) lVar.f2228d).a.execute(new e.g0.t.t.a(lVar, fromString));
                return 3;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                k.c().d(c.p, "Stopping foreground service", new Throwable[0]);
                c.a aVar = cVar.o;
                if (aVar != null) {
                    SystemForegroundService systemForegroundService = (SystemForegroundService) aVar;
                    systemForegroundService.f653h = true;
                    k.c().a(f651k, "All commands completed.", new Throwable[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            } else {
                return 3;
            }
        }
        return 3;
    }
}
