package e.g0.t.p.b;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e.g0.k;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommandHandler.java */
/* loaded from: classes.dex */
public class b implements e.g0.t.b {

    /* renamed from: i  reason: collision with root package name */
    public static final String f2264i = k.e("CommandHandler");

    /* renamed from: f  reason: collision with root package name */
    public final Context f2265f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, e.g0.t.b> f2266g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Object f2267h = new Object();

    public b(Context context) {
        this.f2265f = context;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // e.g0.t.b
    public void d(String str, boolean z) {
        synchronized (this.f2267h) {
            e.g0.t.b remove = this.f2266g.remove(str);
            if (remove != null) {
                remove.d(str, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.content.Intent r11, int r12, e.g0.t.p.b.e r13) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g0.t.p.b.b.e(android.content.Intent, int, e.g0.t.p.b.e):void");
    }
}
